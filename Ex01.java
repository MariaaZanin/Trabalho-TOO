import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double inss = 0, salarioNovo = 0;
        int aux = 0;

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();
        double salario;

        do {
            System.out.println("Informe o salário: ");
            salario = sc.nextFloat();
            if (salario <= 1100.00) {
                inss = salario * 0.075;
                aux++;
            } else if (salario <= 2203.48) {
                inss = salario * 0.09;
                aux++;
            } else if (salario <= 3305.22) {
                inss = salario * 0.12;
                aux++;
            } else if (salario <= 6433.57) {
                inss = salario * 0.14;
                aux++;
            } else {
                System.out.println("Salário muito elevado, informe um salario correto.");
                aux=0;
            }
        }while(aux!=1);

        if(aux > 0){
            salarioNovo = salario - inss;
            System.out.println("Nome: " + nome);
            System.out.println("Salário bruto: " + String.format("%.2f", salario));
            System.out.println("INSS: " + String.format("%.2f", inss));
            System.out.println("Salário líquido: " + String.format("%.2f", salarioNovo));
        }
    }
}
