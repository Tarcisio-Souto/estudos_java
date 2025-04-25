import javax.swing.*;

public class Exercicios {

    public static void main(String[] args)
    {
        //SomarNumeros();
        Calculadora();
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

}

