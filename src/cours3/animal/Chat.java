/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours3.animal;

/**
 *
 * @author Mike
 */
public class Chat extends Animal {

    private void miauler() {
        System.out.println("miauler");
    }

    @Override
    public void dormir() {
    }

    @Override
    public void chasser() {
    }

    @Override
    public void seDeplacer() {
    }

    @Override
    public void communiquer() {
        this.miauler();
    }

}
