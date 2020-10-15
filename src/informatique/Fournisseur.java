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
@Table(name = "fournisseur", catalog = "gestionstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fournisseur.findAll", query = "SELECT f FROM Fournisseur f")
    , @NamedQuery(name = "Fournisseur.findByNumero", query = "SELECT f FROM Fournisseur f WHERE f.numero = :numero")
    , @NamedQuery(name = "Fournisseur.findByAdresse", query = "SELECT f FROM Fournisseur f WHERE f.adresse = :adresse")
    , @NamedQuery(name = "Fournisseur.findByNom", query = "SELECT f FROM Fournisseur f WHERE f.nom = :nom")
    , @NamedQuery(name = "Fournisseur.findByCodePostale", query = "SELECT f FROM Fournisseur f WHERE f.codePostale = :codePostale")
    , @NamedQuery(name = "Fournisseur.findByFax", query = "SELECT f FROM Fournisseur f WHERE f.fax = :fax")
    , @NamedQuery(name = "Fournisseur.findByVille", query = "SELECT f FROM Fournisseur f WHERE f.ville = :ville")
    , @NamedQuery(name = "Fournisseur.findByMail", query = "SELECT f FROM Fournisseur f WHERE f.mail = :mail")
    , @NamedQuery(name = "Fournisseur.findByT\u00e9l\u00e9phone", query = "SELECT f FROM Fournisseur f WHERE f.t\u00e9l\u00e9phone = :t\u00e9l\u00e9phone")})
public class Fournisseur implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "Code_Postale")
    private int codePostale;
    @Basic(optional = false)
    @Column(name = "Fax")
    private int fax;
    @Basic(optional = false)
    @Column(name = "Ville")
    private String ville;
    @Basic(optional = false)
    @Column(name = "Mail")
    private String mail;
    @Basic(optional = false)
    @Column(name = "T\u00e9l\u00e9phone")
    private int téléphone;

    public Fournisseur() {
    }

    public Fournisseur(Integer numero) {
        this.numero = numero;
    }

    public Fournisseur(Integer numero, String adresse, String nom, int codePostale, int fax, String ville, String mail, int téléphone) {
        this.numero = numero;
        this.adresse = adresse;
        this.nom = nom;
        this.codePostale = codePostale;
        this.fax = fax;
        this.ville = ville;
        this.mail = mail;
        this.téléphone = téléphone;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        Integer oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        int oldCodePostale = this.codePostale;
        this.codePostale = codePostale;
        changeSupport.firePropertyChange("codePostale", oldCodePostale, codePostale);
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        int oldFax = this.fax;
        this.fax = fax;
        changeSupport.firePropertyChange("fax", oldFax, fax);
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        String oldVille = this.ville;
        this.ville = ville;
        changeSupport.firePropertyChange("ville", oldVille, ville);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        String oldMail = this.mail;
        this.mail = mail;
        changeSupport.firePropertyChange("mail", oldMail, mail);
    }

    public int getTéléphone() {
        return téléphone;
    }

    public void setTéléphone(int téléphone) {
        int oldTéléphone = this.téléphone;
        this.téléphone = téléphone;
        changeSupport.firePropertyChange("t\u00e9l\u00e9phone", oldTéléphone, téléphone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fournisseur)) {
            return false;
        }
        Fournisseur other = (Fournisseur) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "informatique.Fournisseur[ numero=" + numero + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
