/*
 *  To change this license header, choose License Headers in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */
package polimorfismo;

//import java.text.DecimalFormat;

/*
 *
 *  @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {
        /*
         *  Calculadora calc = new Calculadora();
         *  DecimalFormat f = new DecimalFormat("#.#");
         *  System.out.print(f.format(calc.somar(2.764,2.453)));
         */
        Animal Pedro = new Animal();
        Cat Mingau = new Cat();
        Dog Pedroo = new Dog();
        Duck PatinFei = new Duck();
        
        Pedro.comunicar();
        Pedroo.comunicar();
    }

}
