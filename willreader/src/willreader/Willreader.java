package willreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Willreader extends JFrame{
 public static void main(String[] args) {
     tela jn = new tela();
        jn.setVisible(true);
    Scanner ler = new Scanner(System.in);
 
   // System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
    System.out.printf("\nConteúdo do arquivo texto:\n");
 }
}