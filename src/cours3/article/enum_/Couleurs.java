/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours3.article.enum_;

/**
 *
 * @author Mike
 */
public enum Couleurs {
    BLEU(1),
    JAUNE(2),
    VERT(3),
    ROUGE(4),
    VIOLET(5);

    private int valeur;

    Couleurs(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }

}
