package teste;

import dominio.DataBaseLoader;
import dominio.FileLoader;

public class teste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
