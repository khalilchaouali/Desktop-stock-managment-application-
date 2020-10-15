/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatique;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author android
 */
@Entity
@Table(name = "commande", catalog = "gestionstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c")
    , @NamedQuery(name = "Commande.findByNumero", query = "SELECT c FROM Commande c WHERE c.numero = :numero")
    , @NamedQuery(name = "Commande.findByQuantite", query = "SELECT c FROM Commande c WHERE c.quantite = :quantite")
    , @NamedQuery(name = "Commande.findByDate", query = "SELECT c FROM Commande c WHERE c.date = :date")
    , @NamedQuery(name = "Commande.findByCodeClient", query = "SELECT c FROM Commande c WHERE c.codeClient = :codeClient")
    , @NamedQuery(name = "Commande.findByReferenceProduit", query = "SELECT c FROM Commande c WHERE c.referenceProduit = :referenceProduit")})
public class Commande implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "Quantite")
    private int quantite;
    @Basic(optional = false)
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "Code_Client")
    private int codeClient;
    @Basic(optional = false)
    @Column(name = "Reference_Produit")
    private String referenceProduit;

    public Commande() {
    }

    public Commande(Integer numero) {
        this.numero = numero;
    }

    public Commande(Integer numero, int quantite, Date date, int codeClient, String referenceProduit) {
        this.numero = numero;
        this.quantite = quantite;
        this.date = date;
        this.codeClient = codeClient;
        this.referenceProduit = referenceProduit;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        Integer oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        int oldQuantite = this.quantite;
        this.quantite = quantite;
        changeSupport.firePropertyChange("quantite", oldQuantite, quantite);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        int oldCodeClient = this.codeClient;
        this.codeClient = codeClient;
        changeSupport.firePropertyChange("codeClient", oldCodeClient, codeClient);
    }

    public String getReferenceProduit() {
        return referenceProduit;
    }

    public void setReferenceProduit(String referenceProduit) {
        String oldReferenceProduit = this.referenceProduit;
        this.referenceProduit = referenceProduit;
        changeSupport.firePropertyChange("referenceProduit", oldReferenceProduit, referenceProduit);
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "informatique.Commande[ numero=" + numero + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
