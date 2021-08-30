/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesign;

import java.util.Scanner;
public class ObserverDesign {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String result = "";
        User1 u1 = new User1();
        User2 u2 = new User2();
        Server sv = new Server();
        sv.registerObserver(u1);
        sv.registerObserver(u2);
        boolean end = true;
        while(end){
            System.out.print("Enter Score ");
            result = inp.nextLine();
            if(result.equals("end")){
                end = !end;
                break;
            }else{
                sv.setResult(result);
            }
        }
        inp.close();
    }
    
}
