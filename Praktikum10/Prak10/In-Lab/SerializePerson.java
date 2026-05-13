/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */

import java.io.*;

// class SerializePerson
public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");

        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);

            s.writeObject(person);

            System.out.println("selesai menulis objek person");

            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}