/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesign;

/**
 *
 * @author asus
 */
public class User2 implements MyObserver{
    
    @Override
    public void update(Source o) {
        System.out.println("Live Result : "+ ((Server)o).getResult());
    }
}
