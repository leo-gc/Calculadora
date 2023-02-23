import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero que deseja"));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero que deseja"));
        String operacao = JOptionPane.showInputDialog("Dentre as opcoes escolha qual operacao deseja utilizar(somar,subtrair,multiplicar,dividir,potencia,raiz)");
        switch(operacao){
            case "somar":
                Double resSoma = calc.somar(a, b);
                JOptionPane.showMessageDialog(null, resSoma);
                break;
            case "subtrair":
                Double resSubtracao = calc.subtrair(a, b);
                JOptionPane.showMessageDialog(null, resSubtracao);
                break;
            case "multiplicar":
                Double resMultiplicacao = calc.multiplicar(a, b);
                JOptionPane.showMessageDialog(null, resMultiplicacao);
                break;
            case "dividir":
                Double resDivisao = calc.dividir(a, b);
                JOptionPane.showMessageDialog(null, resDivisao);
                break;
            case "potencia":
                Double resPotencia = calc.potencia(a, b);
                JOptionPane.showMessageDialog(null, resPotencia);
                break;
            case "raiz":
                Double resRaiz = calc.raiz(a);
                JOptionPane.showMessageDialog(null, resRaiz);
                break;

        }
    }
}
