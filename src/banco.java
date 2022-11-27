import javax.swing.*;

public class banco {
    public  static void main(String[] args){

        mycount myc = new mycount();
        myc.mostrarNome();
        myc.mostrarSobreNome();
        myc.mostrarPalavraChave();

        System.out.println(myc.mostrarTudo());


        //myc.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        //myc.setSobreNome(JOptionPane.showInputDialog("Sobre Nome:"));
        //myc.setPalavraChave(JOptionPane.showInputDialog("Palavra-Chave:"));

        //System.out.println("Nome: " + myc.getNome() + " " + myc.getSobreNome() +"\nPalavra-Chave: "+ myc.getPalavraChave());
    }
}
