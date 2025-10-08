package fundamentos_java;

import javax.swing.*;


public class Exercicios_6_revisao
{
    public static void main(String args[])
    {
        /* resultado da soma dos números: */
        //JOptionPane.showMessageDialog(null, "O resultado da soma é: " + SomarNumeros());


        /* resultado da lista de nomes: */
        JOptionPane.showMessageDialog(null, PegaNomes());

    }


    /* somar dois números informados pelo usuário */

    public static Integer SomarNumeros()
    {
        int num1 = 0;
        int num2 = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));

        return (num1 + num2);

    }

    /* ler 3 nomes, armazenar em um array e exibí-los */

    public static String[] PegaNomes()
    {
        String[] nomes = new String[3];

        for (int i=0; i<3; i++)
        {
            String nome = JOptionPane.showInputDialog("Informe o " + (i+1) + "º nome: ");
            nomes[i] = nome;
        }

        return nomes;

    }


}
