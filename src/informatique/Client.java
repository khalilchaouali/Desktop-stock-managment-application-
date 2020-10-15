/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatique;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author android
 */
@Entity
@Table(name = "client", catalog = "gestionstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")
    , @NamedQuery(name = "Client.findByNom", query = "SELECT c FROM Client c WHERE c.nom = :nom")
    , @NamedQuery(name = "Client.findByPrenom", query = "SELECT c FROM Client c WHERE c.prenom = :prenom")
    , @NamedQuery(name = "Client.findByAdresse", query = "SELECT c FROM Client c WHERE c.adresse = :adresse")
    , @NamedQuery(name = "Client.findByContact", query = "SELECT c FROM Client c WHERE c.contact = :contact")
    , @NamedQuery(name = "Client.findByMail", query = "SELECT c FROM Client c WHERE c.mail = :mail")
    , @NamedQuery(name = "Client.findByCodePostale", query = "SELECT c FROM Client c WHERE c.codePostale = :codePostale")
    , @NamedQuery(name = "Client.findByDate", query = "SELECT c FROM Client c WHERE c.date = :date")
    , @NamedQuery(name = "Client.findByCodeClient", query = "SELECT c FROM Client c WHERE c.codeClient = :codeClient")})
public class Client implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "contact")
    private int contact;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @Column(name = "code_postale")
    private int codePostale;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Id
    @Basic(optional = false)
    @Column(name = "code_client")
    private Integer codeClient;

    public Client() {
    }

    public Client(Integer codeClient) {
        this.codeClient = codeClient;
    }

    public Client(Integer codeClient, String nom, String prenom, String adresse, int contact, String mail, int codePostale, String date) {
        this.codeClient = codeClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.contact = contact;
        this.mail = mail;
        this.codePostale = codePostale;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        String oldPrenom = this.prenom;
        this.prenom = prenom;
        changeSupport.firePropertyChange("prenom", oldPrenom, prenom);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        int oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        String oldMail = this.mail;
        this.mail = mail;
        changeSupport.firePropertyChange("mail", oldMail, mail);
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        int oldCodePostale = this.codePostale;
        this.codePostale = codePostale;
        changeSupport.firePropertyChange("codePostale", oldCodePostale, codePostale);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Integer getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Integer codeClient) {
        Integer oldCodeClient = this.codeClient;
        this.codeClient = codeClient;
        changeSupport.firePropertyChange("codeClient", oldCodeClient, codeClient);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeClient != null ? codeClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.codeClient == null && other.codeClient != null) || (this.codeClient != null && !this.codeClient.equals(other.codeClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "informatique.Client[ codeClient=" + codeClient + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
