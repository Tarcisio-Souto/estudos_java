import javax.swing.*;

public class Exercicios_4 {

    /* Exercícios com matrizes */

    public static void main(String args[])
    {
        //MatrizExemplo1();
        //MatrizExemplo2();
        //MatrizExemplo3();
        MatrizExemplo4();
    }

    /* Crie uma matriz 3x3 e preencha com valores informados pelo usuário. Em seguida, exiba a matriz. */

    public static void MatrizExemplo1()
    {
        int[][] mtz = new int[3][3];

        for (int i = 0; i < mtz.length; i++)
        {
            for (int j = 0; j < mtz.length; j++)
            {
                mtz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
            }
        }

        for (int i = 0; i < mtz.length; i++)
        {
            for (int j = 0; j < mtz.length; j++)
            {
                System.out.print(mtz[i][j] + " ");
            }
            System.out.println();
        }

    }

    /* Leia uma matriz 4x4 de inteiros e exiba todos os elementos da diagonal principal. */

    public static void MatrizExemplo2()
    {
        int[][] mtz = new int[4][4];

        for (int i = 0; i < mtz.length; i++)
        {
            for (int j = 0; j < mtz.length; j++) {
                mtz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
            }
        }

        /* exibindo a matriz */
        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz.length; j++) {
                System.out.print(mtz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        /* exibindo somente a diagonal principal */
        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz.length; j++) {
                if (i == j)
                    System.out.print(mtz[i][j] + " ");
            }
        }

    }

    /* Crie uma matriz 3x3 e exiba os elementos da diagonal secundária. */

    public static void MatrizExemplo3()
    {
        int[][] mtz = new int[3][3];

        for (int i = 0; i < mtz.length; i++)
        {
            for (int j = 0; j < mtz.length; j++) {
                mtz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
            }
        }

        /* exibindo a matriz */
        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz.length; j++) {
                System.out.print(mtz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        /* exibindo somente a diagonal secundária */
        for (int i = 0; i < mtz.length; i++) {
            System.out.print(mtz[i][(mtz[i].length - 1 - i)]);
        }

    }

    /* Preencha uma matriz 6x6 com 0 na diagonal principal e 1 nos demais elementos. */

    public static void MatrizExemplo4()
    {
        int[][] mtz = new int[6][6];

        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz.length; j++) {
                if (j == i)
                    mtz[i][j] = 0;
                else
                    mtz[i][j] = 1;

            }
        }

        for (int i = 0; i < mtz.length; i++)
        {
            for (int j = 0; j < mtz.length; j++)
            {
                System.out.print(mtz[i][j] + " ");
            }
            System.out.println();
        }


    }













}
