package br.com.senac.controlepg.main;

import br.com.senac.controlepg.telas.TelaInicial;

public class App {

    //Método main único, chamando a tela de início
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }

}
