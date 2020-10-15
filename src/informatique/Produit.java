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
@Table(name = "produit", catalog = "gestionstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
    , @NamedQuery(name = "Produit.findByReference", query = "SELECT p FROM Produit p WHERE p.reference = :reference")
    , @NamedQuery(name = "Produit.findByDesignation", query = "SELECT p FROM Produit p WHERE p.designation = :designation")
    , @NamedQuery(name = "Produit.findByCategorie", query = "SELECT p FROM Produit p WHERE p.categorie = :categorie")
    , @NamedQuery(name = "Produit.findByMarque", query = "SELECT p FROM Produit p WHERE p.marque = :marque")
    , @NamedQuery(name = "Produit.findByQuantite", query = "SELECT p FROM Produit p WHERE p.quantite = :quantite")
    , @NamedQuery(name = "Produit.findByPrix", query = "SELECT p FROM Produit p WHERE p.prix = :prix")
    , @NamedQuery(name = "Produit.findByNumf", query = "SELECT p FROM Produit p WHERE p.numf = :numf")})
public class Produit implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Reference")
    private String reference;
    @Basic(optional = false)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @Column(name = "Categorie")
    private String categorie;
    @Basic(optional = false)
    @Column(name = "Marque")
    private String marque;
    @Basic(optional = false)
    @Column(name = "Quantite")
    private int quantite;
    @Basic(optional = false)
    @Column(name = "Prix")
    private int prix;
    @Basic(optional = false)
    @Column(name = "numf")
    private int numf;

    public Produit() {
    }

    public Produit(String reference) {
        this.reference = reference;
    }

    public Produit(String reference, String designation, String categorie, String marque, int quantite, int prix, int numf) {
        this.reference = reference;
        this.designation = designation;
        this.categorie = categorie;
        this.marque = marque;
        this.quantite = quantite;
        this.prix = prix;
        this.numf = numf;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        String oldReference = this.reference;
        this.reference = reference;
        changeSupport.firePropertyChange("reference", oldReference, reference);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        String oldDesignation = this.designation;
        this.designation = designation;
        changeSupport.firePropertyChange("designation", oldDesignation, designation);
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        String oldCategorie = this.categorie;
        this.categorie = categorie;
        changeSupport.firePropertyChange("categorie", oldCategorie, categorie);
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        String oldMarque = this.marque;
        this.marque = marque;
        changeSupport.firePropertyChange("marque", oldMarque, marque);
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        int oldQuantite = this.quantite;
        this.quantite = quantite;
        changeSupport.firePropertyChange("quantite", oldQuantite, quantite);
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        int oldPrix = this.prix;
        this.prix = prix;
        changeSupport.firePropertyChange("prix", oldPrix, prix);
    }

    public int getNumf() {
        return numf;
    }

    public void setNumf(int numf) {
        int oldNumf = this.numf;
        this.numf = numf;
        changeSupport.firePropertyChange("numf", oldNumf, numf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reference != null ? reference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "informatique.Produit[ reference=" + reference + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
