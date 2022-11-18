package com.devoir1.inglog;

/**
 * Classe Produit repésentant un produit avec un prix et une référence.
 *
 * @author Justin Uwayo
 *
 */
public class Produit {
    /**
     * Attribut reference de type string.
     */
    private final String reference;
    /**
     * attribut prix prive de type double.
     */
    private double prix;
    /**
     * attribut tva privé etant une constate de type double.
     */
    private final double tva = 0.20;

    /**
     * Constructeur de la classe Produit.
     *
     * @param references
     *            chaines de caracteres
     */
    public Produit(final String references) {
        this.reference = references;
    }

    /**
     * accesseur de l'attribut.
     *
     * @return le prix du produit
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * modificateur de l'attribut prix.
     *
     * @param price
     */
    public final void setPrix(final Double price) {
        this.prix = price;
    }

    /**
     * @return la reference si le prix est positif, null sinon
     */
    public final String getReference() {
        String resultat = reference;
        if (prix > 0) {
            return reference;
        } else {
            return resultat;
        }
    }

    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof Produit)) {
            return false;
        }
        Produit produit = (Produit) o;
        return this.reference != null
                && this.reference.equals(produit.reference);
    }

    @Override
    public final int hashCode() {
        return reference == null ? 0 : reference.hashCode();
    }
}
