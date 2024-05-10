import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            float valorProduto = Float.parseFloat(showInputDialog(null, "Digite o valor do produto:"));
            float valorPago = Float.parseFloat(showInputDialog(null, "Digite o valor pago:"));

            final float percentualDesconto1 = 0.10f;
            float valorDesconto = 0.0f;

            if (valorProduto > 300.0f) {
                valorDesconto = valorProduto * percentualDesconto1;
                valorProduto -= valorDesconto;
            }

            float troco = valorPago - valorProduto;

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

            String mensagem = "Compra concluída com sucesso!";
            if (valorDesconto > 0) {
                mensagem += "\nDesconto aplicado: " + currencyFormat.format(valorDesconto);
            }
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
