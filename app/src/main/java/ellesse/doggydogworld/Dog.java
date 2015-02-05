package ellesse.doggydogworld;

import android.util.Log;

/**
 * Created by lsdejardin on 04/02/15.
 */
public class Dog {

    public String name;
    int age;
    int numberOfLegs=4;
    String breed;

    void bark() {
        String bark= "Ouaf Ouaf, said "+name;
        Log.d("Dog", bark);
    }
}
