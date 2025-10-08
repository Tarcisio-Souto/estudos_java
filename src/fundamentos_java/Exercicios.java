package fundamentos_java;

import javax.swing.*;

/* EXERCÍCIOS SOBRE TIPOS E CONDIÇÕES */

public class Exercicios {

    public static void main(String[] args)
    {
        //SomarNumeros();
        //Calculadora();
        //System.out.println(AprovadoReprovado());
        //System.out.println(VerificaNumero());
        //System.out.println(FaixaEtaria());
        System.out.println(MenuOpcoes());

    }

    public static void SomarNumeros()
    {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));

        JOptionPane.showMessageDialog(null, "Soma: " + (num1 + num2));

    }

    public static void Calculadora()
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));

        JOptionPane.showMessageDialog(null, "Soma: " + (num1 + num2)
                + " | Multiplicação: " + (num1 * num2) + " | Subtração: " + (num1 - num2) + " | Divisão: " + (num1 / num2));


    }

    /* VERIFICAR SE O ALUNO ESTÁ APROVADO OU REPROVADO */

    public static String AprovadoReprovado()
    {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: "));
        double media;

        if (((num1 + num2 + num3) / 3) < 6)
        {
            return "Reprovado!";
        } else
        {
            return "Aprovado!";
        }

    }

    /* Leia um número e diga se ele é positivo, negativo ou zero. */

    public static String VerificaNumero()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));

        if (num < 0)
        {
            return "O número " + num + " é negativo";
        } else if (num > 0)
        {
            return "O número " + num + " é positivo";
        } else
        {
            return "O número " + num + " é zero";
        }

    }

    /*
        Leia a idade de uma pessoa e diga em qual categoria ela se encaixa:
        *   Criança (0-12)
        *   Adolescente (13-17)
        *   Adulto (18-59)
        *   Idoso (60+)
     */

    public static String FaixaEtaria()
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));

        if (idade > 0 && idade <= 12)
        {
            return "Criança";
        } else if (idade >= 13 && idade <= 17)
        {
            return "Adolescente";
        } else if (idade >= 18 && idade <= 59)
        {
            return "Adulto";
        } else if (idade >= 60)
        {
            return "Idoso";
        } else
        {
            return "Idade inválida";
        }

    }

    /*
        Implemente um pequeno menu usando switch:

        1 - Cadastrar produto
        2 - Listar produtos
        3 - Sair

     */

    public static String MenuOpcoes()
    {
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção:\n1 - Cadastrar produto \n2 - Listar Produtos \n3 - Sair: "));

        switch (opt)
        {
            case (1):
                return "Cadastrar produto";
            case (2):
                return "Listar produtos";
            case (3):
                return "Sair";
            default:
                return "Opção inválida";
        }

    }

}

