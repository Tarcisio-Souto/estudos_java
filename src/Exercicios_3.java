import javafx.scene.control.RadioMenuItem;

import javax.swing.*;
import java.util.Random;

public class Exercicios_3 {

    /* Exercícios com vetores */

    public static void main(String args[])
    {
        //ArrayNumbers();
        //ArrayImprimePares();
        //ArrayDobro();
        //System.out.println(ArrayMaiorMenor());
        SomaVetores();
    }

    /* Crie um programa que leia 5 números inteiros e armazene em um array. Depois, mostre todos os números digitados. */

    public static void ArrayNumbers()
    {
        int[] numbers = new int[5];
        int num;

        for (int i = 0; i < numbers.length; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número: "));
            numbers[i] = num;
        }

        for (int numAux : numbers)
        {
            if (numAux != numbers[4])
                System.out.print(numAux + ", ");
            else
                System.out.print(numAux);
        }

    }

    /* Leia 10 números e mostre somente os números pares armazenados no array. */

    public static void ArrayImprimePares()
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número: "));
            numbers[i] = num;
        }

        for (int numPar : numbers)
        {
            if (numPar % 2 == 0)
            {
                System.out.println("Números pares: " + numPar);
            }
        }

    }

    /* Preencha um array de 8 posições com o dobro do valor do índice (ex: posição 0 = 0, posição 1 = 2, posição 2 = 4, etc.). */

    public static void ArrayDobro()
    {
        int[] numbers = new int[8];
        int count = 0;

        while (count < numbers.length)
        {
            numbers[count] = count * 2;
            count++;
        }

        count = 0;

        for (int num : numbers)
        {
            System.out.println("Posição: " + count + " | Dobro: " + num);
            count++;
        }

    }

    /* Preencha um vetor de 6 posições com números inteiros aleatórios entre 1 e 100 e depois exiba o maior e o menor valor armazenado. */

    public static String ArrayMaiorMenor()
    {
        int[] numbers = new int[6];
        Random rand = new Random();
        int numMax;
        int numMin;

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }

        /* Verificar quais números são maior e menor */
        numMin = numbers[0];
        numMax = numbers[0];

        for (int i : numbers)
        {
            if (numMin < i)
                numMin = i;
            if (numMax > i)
                numMax = i;
        }

        return "" + "\n" +  "Min: " + numMin + " | Max: " + numMax;

    }

    /* Leia dois vetores de 5 posições cada e crie um terceiro vetor que armazene a soma dos elementos dos dois primeiros vetores, posição por posição. */

    public static void SomaVetores()
    {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arrSoma = new int[5];

        Random rand = new Random();

        /* atribuindo os valores aos vetores */
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = rand.nextInt(20);
            arr2[i] = rand.nextInt(20);
            arrSoma[i] = arr1[i] + arr2[i];
        }

        /* exibindo o vetor 1*/
        for (int i = 0; i < arrSoma.length; i++)
        {
            System.out.println("Vetor 1: " + arr1[i]);
        }
        /* exibindo o vetor 2*/
        for (int i = 0; i < arrSoma.length; i++)
        {
            System.out.println("Vetor 2: " + arr2[i]);
        }
        /* exibindo o vetor soma*/
        for (int i = 0; i < arrSoma.length; i++)
        {
            System.out.println("Vetor Soma: " + arrSoma[i]);
        }

    }





























}
