package Validador;

import java.util.Scanner;

public class ValidadorSenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        if (senhaValida(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }

        sc.close();
    }

    private static boolean senhaValida(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        return temMaiuscula && temMinuscula && temNumero;
    }
}