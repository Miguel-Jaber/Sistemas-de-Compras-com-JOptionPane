import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        try {
            float valorProduto = Float.parseFloat(showInputDialog(null, "Digite o valor do produto:"));
            float valorPago = Float.parseFloat(showInputDialog(null, "Digite o valor pago:"));

            float troco = valorPago - valorProduto;

            if (valorProduto == valorPago) {
                showMessageDialog(null, "Compra concluída com sucesso!");
            } else if (valorProduto > valorPago) {
                showMessageDialog(null, "Pagamento insuficiente!");
            } else {
                showMessageDialog(null, "Compra concluída com sucesso! Seu troco é R$" + troco);
            }
        }
        catch (NumberFormatException e) {
            showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}
