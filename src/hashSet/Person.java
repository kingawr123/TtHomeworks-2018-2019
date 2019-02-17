package hashSet;

import java.nio.charset.Charset;
import java.util.Random;

public class Person {
    private String id;
    private String name;
    private String secondName;

    Person(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        this.id = generatedId();
    }

    private static String generatedId(){
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
