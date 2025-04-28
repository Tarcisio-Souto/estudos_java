import javax.swing.*;
import java.util.ArrayList;

public class Exercicios_2 {

    /* Resolvendo exercícios com for, while e do-while */

    /* Imprima os números de 1 a 100 usando um for. */

    public static void main(String args[])
    {
        //ImprimindoNumeros();
        //ImprimePares();
        //System.out.println("A soma dos números é " + SomaNumeros());
        //Tabuada();
        System.out.println(CheckPassword());
    }


    public static void ImprimindoNumeros()
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }

    }

    /* Peça um número e imprima todos os números pares de 0 até esse número. */

    public static void ImprimePares()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
        int count = 0;

        while (count < num)
        {
            if (count % 2 == 0)
            {
                System.out.println(count);
            }
            count++;
        }

        if (num % 2 == 0)
        {
            System.out.println(num);
        }

    }

    /* Peça números ao usuário até que ele digite 0. Então exiba a soma de todos os números digitados. */

    public static Integer SomaNumeros()
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int soma = num;
        while (num != 0)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            soma = soma + num;

        }

        return soma;

    }

    /* Mostre a tabuada de um número informado pelo usuário (de 1 a 10). */

    public static void Tabuada()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + i * num);
        }

    }

    /* Usando do-while, peça repetidamente ao usuário para digitar uma senha até que ele acerte a senha correta. */

    public static String CheckPassword()
    {
        String key;

        do
        {
            key = JOptionPane.showInputDialog("Senha incorreta! Informe a senha: ");
        } while (!key.equals("silenthill"));

        return "Senha correta!";
    }


}
