import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double valor = sc.nextDouble();
        System.out.println("Informe a quantidade de parcelas: ");
        int parcela = sc.nextInt();

        Double precoParcela[] = new Double[parcela];
        Date dataParcela[] = new Date[parcela];
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = new Date();
            System.out.println("Valor da compra: "+ String.format("%.2f", valor));
            System.out.println("Total de parcelas: "+ parcela);
            for(int i=0;i<parcela;i++){
                precoParcela[i] = valor/parcela;
                System.out.println("Valor da parcela: "+ precoParcela[i] + " Data do "+ i+1 + "º vencimento: " + sdf.format(data.getTime()));
                data.setDate(data.getDate() + 30);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        }
    }
}
