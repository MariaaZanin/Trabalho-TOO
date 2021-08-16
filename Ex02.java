import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
    public static void main(String[] args) {
        String valor, locacao2, devolucao2;
        float diaria = 0;
        int aux = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date locacao = new Date();
        Date devolucao = new Date();
        do{
        try {
            valor =  JOptionPane.showInputDialog("Informe o valor da diária: ");
            diaria = Float.parseFloat(valor);
            locacao2 = JOptionPane.showInputDialog("Informe a data de locação no formato dd/mm/aaaa: ");
            devolucao2 = JOptionPane.showInputDialog("Informe a data de devolução no formato dd/mm/aaaa: ");
            locacao = sdf.parse(locacao2);
            devolucao = sdf.parse(devolucao2);
            aux++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        }}while (aux!=1);
        Long diferenca = devolucao.getTime() - locacao.getTime();
        int milisPorDia = (24 * 60 * 60 * 1000);
        Long dias = diferenca / milisPorDia;
        float resultado = dias*diaria;
        System.out.println("Valor da diária: " + diaria);
        System.out.println("Data de locação: " + sdf.format(locacao.getTime()));
        System.out.println("Data de devolução: " + sdf.format(devolucao.getTime()));
        System.out.println("Dias de locação: " + dias);
        System.out.println("Valor total da locação: " + String.format("%.2f", resultado));

    }
}


