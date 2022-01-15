/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursjava3.article.exception_;

/**
 *
 * @author Mike
 */
public class ArticleException extends Exception {
    
    public ArticleException(Double prix){
        System.out.println("Le prix est negatif");
    }
    public ArticleException(String nom){
        System.out.println("Veuillez rentrer plus de 2 caracteres");
    }
}
