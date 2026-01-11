package br.com.senac.controlepg.telas;

import br.com.senac.controlepg.dao.CadastroDAO;
import br.com.senac.controlepg.model.Cadastro;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorio extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaRelatorio.class.getName());
    private List<Cadastro> listaCadastros;

    public TelaRelatorio() {
        initComponents();

        // Chama o método no DAO para fazer a consulta no banco de dados da tabela cadastros
        try {
            CadastroDAO cadastroDao = new CadastroDAO();

            List<Cadastro> listaCadastro = cadastroDao.listar();
            preencheTabela(listaCadastro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar lista: " + e.getMessage());
        }
    }

    // Método para criar a tabela visualizada na tela
    public void preencheTabela(List<Cadastro> cadastros) {
        this.listaCadastros = cadastros;

        String colunas[] = {"Programa", "Número Protocolo", "Solicitante", "PCDP", "Valor Diária", "Valor Passagem", "Data Viagem", "Fonte do Recurso", "Tipo de Beneficiário", "Observação"};
        String dados[][] = new String[cadastros.size()][colunas.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");
        int i = 0;
        for (Cadastro c : cadastros) {
            dados[i] = new String[]{
                c.getPrograma().getPrograma(), // Pega o Programa da tabela programas
                c.getProtocolo(),
                c.getSolicitante(),
                c.getPcdp(),
                String.valueOf(c.getDiaria()),
                String.valueOf(c.getPassagem()),
                String.valueOf(c.getData()),
                c.getRecurso(),
                c.getBeneficiario(),
                c.getObs()
            };
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        TblCadastros.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        LbCampoPesquisa = new javax.swing.JLabel();
        TxCampoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCadastros = new javax.swing.JTable();
        BtExcluir = new javax.swing.JButton();
        BtFinalizar = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        LbTitulo.setText("Relatório de solicitações cadastradas");

        LbCampoPesquisa.setText("Pesquisar por nome do solicitante ou Programa:");

        TblCadastros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblCadastros);

        BtExcluir.setText("Excluir Item Cadastrado");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtFinalizar.setText("Finalizar Relatório");
        BtFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFinalizarActionPerformed(evt);
            }
        });

        BtPesquisar.setText("Pesquisar");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbCampoPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(TxCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(BtPesquisar)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BtFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCampoPesquisa)
                    .addComponent(TxCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtExcluir)
                    .addComponent(BtFinalizar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed

        try {
            // Pesquisa de acordo com o informado pelo usuário
            String filtro = TxCampoPesquisa.getText();

            CadastroDAO cadastroDao = new CadastroDAO();
            // Usa a sobrescrita do método para passar o termo buscado
            List<Cadastro> listaCadastro = cadastroDao.listar(filtro);

            preencheTabela(listaCadastro);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }

    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed

        try {
            // Exclusão de acordo com a linha selecionada
            if (TblCadastros.getSelectedRow() >= 0) { // Verifica se há algo selecionado na tabela
                // Obtém o valor da coluna id da linha selecionada
                int linha = TblCadastros.getSelectedRow();
                Cadastro selecionado = listaCadastros.get(linha);

                int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir esse registro do Programa " + selecionado.getPrograma() + "?");
                if (resposta == 0) {
                    CadastroDAO cadastroDao = new CadastroDAO();
                    // Chama o método de excluir de acordo com o id
                    cadastroDao.excluir(selecionado.getId());
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso");
                    // Refaz a pesquisa para atualizar a tabela na tela
                    BtPesquisarActionPerformed(evt);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }

    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinalizarActionPerformed
        dispose();
    }//GEN-LAST:event_BtFinalizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaRelatorio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtFinalizar;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel LbCampoPesquisa;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTable TblCadastros;
    private javax.swing.JTextField TxCampoPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
