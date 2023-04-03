package ra.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Config<T> {
    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static final String PATH_CATEGORY="E:\\code_md3\\MoHinhMVC\\src\\ra\\DataBase\\category.txt";
    public static final String PATH_PRODUCT = "E:\\code_md3\\MoHinhMVC\\src\\ra\\DataBase\\product.txt";
    public List<T> readFromFile(String pathFile) {
        List<T> tList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(pathFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException f) {
            System.err.println("File not Found!");
        } catch (IOException i) {
            System.err.println("IOE exception!");
        } catch (ClassNotFoundException c) {
            System.err.println("Class not Found!");
        }
        return tList;
    }

    // phuong thuc ghi file
    public void writeToFile(String pathFile, List<T> tList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch (FileNotFoundException f){
            System.err.println("File not Found!");
        }catch (IOException i){
            System.err.println("IOE exception!");
        }

    }
}
