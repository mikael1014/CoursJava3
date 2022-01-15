/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursjava3;

import cours3.article.enum_.Droits;
import coursjava3.article.Article;
import coursjava3.article.ArticleLuxe;
import coursjava3.article.Utilisateur;
import coursjava3.article.exception_.ArticleException;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class CoursJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//throws ArticleException {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        /*
        Article article = new Article();
        Article article2 = new Article("Smartphone", 5);
        //ArticleLuxe article3 = new ArticleLuxe();
        //ArticleLuxe article4 = new ArticleLuxe("Télévision","TV");
       
        //Article article5 = new Article("Smartphone", 5,-10); //tp erreur
        //Article article6 = new Article("S", 5,10); //tp erreur

        System.out.println("L'ID et nom de l'article est :");
        //System.out.println(article.code + " : " + article.nom);
        System.out.println(article.getID() + " : " + article.getNom());

        System.out.println("L'ID et nom de l'article est :");
        //System.out.println(article2.code + " : " + article2.nom);
        System.out.println(article2.getID() + " : " + article2.getNom());
        
        article2.setID(2);
        
        System.out.println("L'ID et nom de l'article est :");
        //System.out.println(article2.code + " : " + article2.nom);
        System.out.println(article2.getID() + " : " + article2.getNom());
        
        System.out.println(Article.nombreObjetCrée);
         
        //System.out.println(article5.getID() + " : " + article5.getNom());
        
        //System.out.println(article6.getID() + " : " + article6.getNom());
       
         */
        Utilisateur utilisateur = new Utilisateur("Lavie", "EstBelle");
        Utilisateur utilisateur1 = new Utilisateur("Mikael", "toto",Droits.ADMINISTRATEUR);
        Utilisateur utilisateur2 = new Utilisateur("login2", "motdepass2",Droits.OPERATEURSDECOMPTE); // cas droit inexistant
        Utilisateur utilisateur3 = new Utilisateur();

        //System.out.println(utilisateur.getNomUtilisateur() +" : "+ utilisateur.getPassUtilisateur()+ " Avec des droits : " + utilisateur.getDroitsUtilisateur()) ;
        //System.out.println(utilisateur1.getNomUtilisateur() +" : "+ utilisateur1.getPassUtilisateur()+ " Avec des droits : " + utilisateur1.getDroitsUtilisateur());
        //System.out.println(utilisateur2.getNomUtilisateur() + " : "+ utilisateur2.getPassUtilisateur()+ " Avec des droits : " + utilisateur2.getDroitsUtilisateur());
        //System.out.println(utilisateur3.getNomUtilisateur() + " : "+ utilisateur3.getPassUtilisateur()+ " Avec des droits : " + utilisateur3.getDroitsUtilisateur());
        
        //System.out.println("Veuillez enter un login                       ");
        //    login = sc.nextLine();

        
        System.out.println(utilisateur);
        System.out.println(utilisateur1);
        System.out.println(utilisateur2);
        System.out.println(utilisateur3);
        
    }

}
