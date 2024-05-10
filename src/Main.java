import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            float valorProduto = Float.parseFloat(showInputDialog(null, "Digite o valor do produto:"));
            float valorPago = Float.parseFloat(showInputDialog(null, "Digite o valor pago:"));
            
            float troco = valorPago - valorProduto;

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

            String mensagem = "Compra concluída com sucesso!";

            mensagem += "\nValor do produto: " + currencyFormat.format(valorProduto);
            mensagem += "\nSeu troco é: " + currencyFormat.format(troco);

            if (valorPago < valorProduto) {
                showMessageDialog(null, "Pagamento insuficiente!");
            } else {
                showMessageDialog(null, mensagem);
            }
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}
