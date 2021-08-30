/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesign;
import java.util.ArrayList;
public class Server implements Source{
    private final ArrayList<MyObserver> list;
    private String result;
    
    public Server(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setResult(String newResult){
        result = newResult;
        notifyObserver();
    }
    public String getResult(){
        return result;
    }
    
    
    @Override
    public void notifyObserver() {
        for(int i = 0; i< list.size();i++){
            list.get(i).update(this);
        }
    }

    @Override
    public void registerObserver(MyObserver observer) {
        list.add(observer);
    }
    
}
