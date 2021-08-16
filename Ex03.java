import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
    public static void main(String[] args) {
        String data2;
        int aux=0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        do{
        try {
            data2 = JOptionPane.showInputDialog("Informe uma data no formato dd/mm/aaaa: ");
            data = sdf.parse(data2);
            aux++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        }}while (aux!=1);
        System.out.println("Data informada: " + sdf.format(data));
        for(int i=0;i<5;i++){
            data.setDate(data.getDate() + 7);
            System.out.println("Data de pagamento: " +  sdf.format(data.getTime()));
        }
    }
}
