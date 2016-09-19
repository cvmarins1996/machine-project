package operacoesmath;

import javax.swing.JOptionPane;

public class Interface extends RealizarCalculo {
    //mostrar mensagem primeiro a escolha
    //depois os calculos
        public void Efetuar(){
            //String escolha = String.valueOf('')
            escolha.setEscolha(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha uma das operações:" +"\n 1 - Area do Quadrado"+"\n 2 - Area do Triangulo"+
                                                      "\n 3 - Somar" + "\n 4 - Multiplicar "+
                                                      "\nDigite o valor correspondente a operação que deseja efetuar:")));
            x.setX(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor para x:")));
            y.setY(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor para y:")));
            Calculo();
            
            
            JOptionPane.showMessageDialog(null, mensagem.getMensagem());
            
            
        }   
}
