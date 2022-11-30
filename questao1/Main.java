package br.com.questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, FullStackException {

        Stack<String> pilha_nomes = new Stack();

        Scanner scan = new Scanner(new File("./nomes.txt"));
        while (scan.hasNextLine()){
            pilha_nomes.push(scan.nextLine());
        }

        ArrayStack x = new ArrayStack();
        while(x.size() > 0){
            x.push(pilha_nomes.pop());
        }

        System.out.println(x);

    }

}
