package ellesse.doggydogworld;

import android.util.Log;

/**
 * Created by lsdejardin on 04/02/15.
 */
public class Dog {

    private String name;
    private int age;
    private int numberOfLegs=4;
    private String breed;

    Dog(String dogname){
        name=dogname;
        Log.d("Dog","Constructing...");
    }

    public void bark() {
        String bark= "Ouaf Ouaf, said "+name;
        Log.d("Dog", bark);
    }

    public void barkAt(String victim) {
        String bark= "Ouaf Ouaf, said "+name+" at "+victim;
        Log.d("Dog", bark);
    }

}
