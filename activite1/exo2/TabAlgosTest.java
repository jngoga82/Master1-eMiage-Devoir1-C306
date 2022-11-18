package org.exercice02.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;


/**
 * Dans cette classe, nous allons impl�menter
 * des tests unitaires.
 * Ils nous permettront de tester les m�thodes
 * �crites dans la classe TabAlgos.
 * @author Justin Uwayo
 */
public class TabAlgosTest {

  /**
   * Constante ayant pour valeur 99.
   */
  private final int val1 = 99;

  /**
   * Constante ayant pour valeur 45.
   */
  private final int val2 = 45;

  /**
   * Constante ayant pour valeur 68.
   */
  private final int val3 = 68;

  /**
   * Constante ayant pour valeur 18.
   */
  private final int val4 = 18;

  /**
   * Constante ayant pour valeur 34.
   */
  private final int val5 = 34;

  /**
   * Constante ayant pour valeur 50.
   */
  private final int val6 = 50;

  /**
   * Constante ayant pour valeur 50.
   */
  private final int val7 = 37;

  /**
   * Tableau N� 01.
   */
  private final int[] tab1 = {val1, val2, val3, val4, val5, val6};

  /**
   * Tableau N� 02.
   */
  private final int[] tab2 = {val1, val2, val3, val4, val5, val6};

  /**
   * Tableau N� 03.
   */
  private final int[] tab3 = {val3, val2, val1, val4, val6, val5};

  /**
   * Tableau N� 04.
   */
  private final int[] tab4 = {val3, val4, val6, val5};

  /**
   * Tableau N� 05.
   */
  private final int[] tab5 = {val3, val2, val7, val4, val6, val5};

  /**
   * Tableau null.
   */
  private final int[] tabNull = null;

  /**
   * Tableau vide.
   */
  private final int[] tabVide = new int[0];

  /**
   * Constante ayant pour valeur 0,1.
   */
  private final double delta = 0.1;

  /**
   * Constante ayant pour valeur 41,3.
   */
  private final double moyenne = 52.33;

  /**
   * Test pour la m�thode plusGrand. Cas nominal
   */
  @Test
  public void plusGrandTest() {
    assertEquals(val1, TabAlgos.plusGrand(tab1));
  }


  /**
   * Test de la m�thode plusGrand avec tableau vide.
   */
  @Test
  public void plusGrandTestAvecParamVide() {
    try {
      TabAlgos.plusGrand(tabVide);
      fail("l'exception pour les tableaux vides aurait d� �tre lev�e.");
    } catch (IllegalArgumentException e) {
      // rien � faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la m�thode plusGrand avec tableau vide.
   */
  @Test
  public void plusGrandTestAvecParamNull() {
    try {
      TabAlgos.plusGrand(tabNull);
      fail("l'exception pour les tableaux nulls aurait d� �tre lev�e.");
    } catch (IllegalArgumentException e) {
      // rien � faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la m�thode moyenne cas nominal.
   */
  @Test
  public void moyenneTest() {
    assertEquals(moyenne, TabAlgos.moyenne(tab1), delta);
  }

  /**
   * Test de la m�thode moyenne avec tableau vide.
   */
  @Test
  public void moyenneTestAvecParamVide() {
    try {
      TabAlgos.moyenne(tabVide);
      fail("l'exception pour les tableaux vides "
          + "et nulls aurait d� �tre lev�e.");
    } catch (IllegalArgumentException e) {
      // rien � faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test de la m�thode moyenne avec tableau null ou vide.
   */
  @Test
  public void moyenneTestAvecParamNull() {
    try {
      TabAlgos.moyenne(tabNull);
      fail("l'exception pour les tableaux vides "
          + "et nulls aurait d� �tre lev�e.");
    } catch (IllegalArgumentException e) {
      // rien � faire il s'agit d'un comportement normal
    }
  }

  /**
   * Test pour la m�thode egaux. Cas nominal
   */
  @Test
  public void egauxTest() {
    assertEquals(true, TabAlgos.egaux(tab1, tab2));
  }

  /**
   * Test pour la m�thode egaux: tableaux de m�me
   * taille avec des diff�rences de valeurs.
   */
  @Test
  public void egauxTestDifferenceValeurs() {
    assertEquals(false, TabAlgos.egaux(tab1, tab3));
  }

  /**
   * Test pour la m�thode egaux: tableaux de
   * taille diff�rentes.
   */
  @Test
  public void egauxTestTaillesDifferente() {
    assertEquals(false, TabAlgos.egaux(tab1, tab4));
  }

  /**
   * Test pour la m�thode similaires. Cas nominal
   */
  @Test
  public void similairesTest() {
    assertEquals(true, TabAlgos.similaires(tab1, tab3));
  }

  /**
   * Test pour la m�thode similaires:
   * tableaux de m�me taille avec diff�rences de valeurs.
   */
  @Test
  public void similairesTestDifferenceValeurs() {
    assertEquals(false, TabAlgos.similaires(tab1, tab5));
  }

  /**
   * Test pour la m�thode similaires: tableaux de
   * taille diff�rentes.
   */
  @Test
  public void similairesTestTaillesDifferente() {
    assertEquals(false, TabAlgos.similaires(tab1, tab4));
  }

}
