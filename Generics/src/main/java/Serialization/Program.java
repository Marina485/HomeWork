package Serialization;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        ClassData patient_1 = new ClassData("Сергей", "Лапшин", 39, 36.6f);
        ClassData patient_2 = new ClassData("Алексей", "Голубев", 39, 37.8f);
        ClassData patient_3 = new ClassData("Дмитрий", "Бертов", 38, 38.1f);

        try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("Patients.scv"))) {

            oStream.writeObject(patient_1);
            oStream.writeObject(patient_2);
            oStream.writeObject(patient_3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("Patients.scv"))) {
            ClassData tmp = null;
            for(int i = 0; i < 3; i++) {
                tmp = (ClassData) iStream.readObject();
                System.out.println(tmp.getName() + " " + tmp.getLastName() + " " + tmp.getAge() + " " + tmp.getTemperature());
            }
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
