package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {
        this.personnes = new Personne[0];
    }

    public int getNombre() {
        return personnes.length;
    }

    public void vider() {
       Personne[] temp = new Personne[0];
       personnes = temp;
       System.out.println("Le tableau est vidé");
    }

    public boolean ajouter(Personne p) {
        boolean ajoutReussi = false;
        Personne[] temp = new Personne[personnes.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < personnes.length) {
                temp[i] = personnes[i];
            } else {
                temp[i] = p;
                ajoutReussi = true;
            }
        }
        personnes = temp;
        return ajoutReussi;
    }

    public boolean supprimer(Personne p) {
        boolean suppressionReussi = false;
        Personne[] temp = new Personne[personnes.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (personnes[i] == p) {
                personnes[i] = null;
                suppressionReussi = true;
            } else {
                temp[i] = personnes[i];
            }
        }
        personnes = temp;
        return suppressionReussi;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}

