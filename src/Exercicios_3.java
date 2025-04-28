import javax.swing.*;

public class Exercicios_3 {

    /* Exercícios com vetores */

    public static void main(String args[])
    {
        //ArrayNumbers();
        //ArrayImprimePares();
        ArrayDobro();
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

}
