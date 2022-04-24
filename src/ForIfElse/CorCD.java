package ForIfElse;

import java.util.Scanner;

public class CorCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do cd: ");
        String cor = scanner.nextLine();


        if (cor.equals("Verde") || cor.equals("verde") ){
            System.out.println("Este disco custa 10,00 reais");
        }else
            if (cor.equals ("Azul") || cor.equals("azul")){
                System.out.println("Este disco custa 20,00 reais");
        }else
            if (cor.equals("Amarelo") || cor.equals("amarelo")) {
                System.out.println("Este disco custa 30,00 reais");
        }else
            if (cor.equals("Vermelho") || cor.equals("vermelho") ) {
                System.out.println("Este disco custa 40,00 reais");
        }else{
                System.out.println("Naõ temos este em estoque!");
            }





    }
}
