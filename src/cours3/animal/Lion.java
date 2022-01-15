/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours3.animal;

/**
 *
 * @author Mike
 */
public class Lion extends Animal {

    private void rugir() {
        System.out.println("rugir");
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
        this.rugir();
    }

}
