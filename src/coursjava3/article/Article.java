/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursjava3.article;

import coursjava3.article.exception_.ArticleException;
import cours3.article.enum_.*;
/**
 *
 * @author Mike
 */
public class Article {

    public static int nombreObjetCrée;
    //atribut d'inctance
    private String nom;
    private int code;
    private double prix;
    private Couleurs couleur;

    public Article() {
        nombreObjetCrée++;
        code = 1;
        nom = "Televieur";
        
    }

    public Article(String nom, int code) {
        this.code = code;
        this.nom = nom;
        this.couleur = Couleurs.BLEU;
    }

    public Article(String nom, int code, double prix) throws ArticleException{
        this.code = code;
        if (nom.length() < 2) {
            throw new ArticleException(nom);
        } else {
            this.nom = nom;
        }
        if (prix < 0) {
            throw new ArticleException(prix);
        } else {
            this.prix = prix;
        }

    }

    public void afficher() {
        System.out.println(this.getNom());
    }

    /*
    Article(String name) {
    name=nom;
            }
     */
    public String getNom() {
        return this.nom.toUpperCase();
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public int getID() {
        return this.code * 2;
        //return this.String.valueOf(code);
    }

    public void setID(int identifiant) {
        this.code = identifiant;
    }

}
