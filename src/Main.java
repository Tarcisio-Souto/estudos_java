//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(HelloWorld());
        TiposDeDados();
        System.out.println("--------------------------------");
        OperadoresAritmeticos();
    }

    public static String HelloWorld() {
        return "Primeiro programa Java =)";
    }

    public static void TiposDeDados() {
        int idade = 32;
        String nome = "Tarcisio dos Santos Souto";
        double peso = (double)86.5F;
        double altura = 1.76;
        boolean ativo = true;
        ArrayList<String> apelidos = new ArrayList();
        apelidos.add("Tatá");
        apelidos.add("Black");
        apelidos.add("Oromaito");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Ativo: " + ativo);

        for(String apelido : apelidos) {
            System.out.println("Apelido: " + apelido);
        }

    }

    public static void OperadoresAritmeticos() {
        int a = 4;
        int b = 6;
        System.out.println("Adição: " + (a + b));
        System.out.println("Subtração: " + (b - a));
        System.out.println("Divisão: " + b / a);
        System.out.println("Multiplicação: " + a * b);
    }


}
