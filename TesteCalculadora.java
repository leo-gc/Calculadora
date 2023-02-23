import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero que deseja"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero que deseja"));
        String operacao = JOptionPane.showInputDialog("Dentre as opcoes escolha qual operacao deseja utilizar(somar,subtrair,multiplicar,dividir,potencia,raiz)");
        switch(operacao){
            case "somar":
                float resSoma = calc.somar(a, b);
                JOptionPane.showMessageDialog(null, resSoma);
                break;
            case "subtrair":
                float resSubtracao = calc.subtrair(a, b);
                JOptionPane.showMessageDialog(null, resSubtracao);
                break;
            case "multiplicar":
                float resMultiplicacao = calc.multiplicar(a, b);
                JOptionPane.showMessageDialog(null, resMultiplicacao);
                break;
            case "dividir":
                float resDivisao = calc.dividir(a, b);
                JOptionPane.showMessageDialog(null, resDivisao);
                break;
            case "potencia":
                float resPotencia = calc.potencia(a, b);
                JOptionPane.showMessageDialog(null, resPotencia);
                break;
            case "raiz":
                float resRaiz = calc.raiz(a);
                JOptionPane.showMessageDialog(null, resRaiz);
                break;

        }
    }
}