/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursjava3.article;

/**
 *
 * @author Mike
 */

public class ArticleLuxe extends Article{
    private int prix = 0;
    
  public  ArticleLuxe() {
        super();
        this.prix = this.conversion(prix);
    }
    
  public  ArticleLuxe(int prix) {
        this.prix = this.conversion(prix);
    }
    
    public void afficher(){
        System.out.println(this.getNom()+ " LUXE");
    }
    public int conversion(int prixEntree){
        return 2*prixEntree;
    }
    
}
