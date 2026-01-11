package br.com.senac.controlepg.telas;

import br.com.senac.controlepg.dao.CadastroDAO;
import br.com.senac.controlepg.dao.ProgramaDAO;
import br.com.senac.controlepg.model.Cadastro;
import br.com.senac.controlepg.model.Programa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());

    public TelaCadastro() {
        initComponents();
        carregarProgramasNoCombo();
    }

    private void carregarProgramasNoCombo() {
        ProgramaDAO programaDAO = new ProgramaDAO();
        List<Programa> programas = programaDAO.listar();

        CbPrograma.removeAllItems();
        for (Programa p : programas) {
            CbPrograma.addItem(p); // Adiciona o Objeto Programa
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        LbPrograma = new javax.swing.JLabel();
        LbProtocolo = new javax.swing.JLabel();
        LbSolicitante = new javax.swing.JLabel();
        LbPcdp = new javax.swing.JLabel();
        LbDiaria = new javax.swing.JLabel();
        LbPassagem = new javax.swing.JLabel();
        LbDataViagem = new javax.swing.JLabel();
        LbRecurso = new javax.swing.JLabel();
        LbTipoBeneficiario = new javax.swing.JLabel();
        LbObservacao = new javax.swing.JLabel();
        CbPrograma = new javax.swing.JComboBox<>();
        FtxProtocolo = new javax.swing.JFormattedTextField();
        TxSolicitante = new javax.swing.JTextField();
        FtxPcdp = new javax.swing.JFormattedTextField();
        TxDiaria = new javax.swing.JTextField();
        TxPassagem = new javax.swing.JTextField();
        FtxDataViagem = new javax.swing.JFormattedTextField();
        TxRecurso = new javax.swing.JTextField();
        CbTipoBeneficiario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxaObs = new javax.swing.JTextArea();
        BtCadastrar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LbTitulo.setText("Cadastro de Solicitação");

        LbPrograma.setText("Nome do Programa:");

        LbProtocolo.setText("Número do Protocolo:");

        LbSolicitante.setText("Nome do Solicitante:");

        LbPcdp.setText("Número PCDP:");

        LbDiaria.setText("Valor da Diária:");

        LbPassagem.setText("Valor da Passagem:");

        LbDataViagem.setText("Data da Viagem:");

        LbRecurso.setText("Fonte do Recurso:");

        LbTipoBeneficiario.setText("Tipo do Beneficiário:");

        LbObservacao.setText("Observação:");

        try {
            FtxProtocolo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####.######/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            FtxPcdp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            FtxDataViagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CbTipoBeneficiario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente Interno", "Docente Externo", "Discente", "Técnico" }));

        TxaObs.setColumns(20);
        TxaObs.setRows(5);
        jScrollPane1.setViewportView(TxaObs);

        BtCadastrar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        BtVoltar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(LbTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbPrograma)
                            .addComponent(LbProtocolo)
                            .addComponent(LbSolicitante)
                            .addComponent(LbPcdp)
                            .addComponent(LbDiaria)
                            .addComponent(LbPassagem)
                            .addComponent(LbDataViagem)
                            .addComponent(LbRecurso)
                            .addComponent(LbTipoBeneficiario)
                            .addComponent(LbObservacao))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxSolicitante)
                            .addComponent(CbPrograma, 0, 240, Short.MAX_VALUE)
                            .addComponent(FtxProtocolo)
                            .addComponent(FtxDataViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FtxPcdp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbTipoBeneficiario, 0, 150, Short.MAX_VALUE)
                            .addComponent(TxPassagem)
                            .addComponent(TxDiaria)
                            .addComponent(TxRecurso)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(BtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPrograma)
                    .addComponent(CbPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbProtocolo)
                    .addComponent(FtxProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbSolicitante)
                    .addComponent(TxSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPcdp)
                    .addComponent(FtxPcdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDiaria)
                    .addComponent(TxDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPassagem)
                    .addComponent(TxPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataViagem)
                    .addComponent(FtxDataViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbRecurso)
                    .addComponent(TxRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbTipoBeneficiario)
                    .addComponent(CbTipoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtCadastrar)
                    .addComponent(BtVoltar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
        Cadastro cad = new Cadastro();

        try {
            Programa programaSelecionado = (Programa) CbPrograma.getSelectedItem();
            if (programaSelecionado == null) {
                JOptionPane.showMessageDialog(null, "Selecione um programa");
                return;
            }
            cad.setPrograma(programaSelecionado);

            Object numProtocolo = FtxProtocolo.getValue();
            if (numProtocolo == null) {
                JOptionPane.showMessageDialog(null, "O campo Número do Protocolo precisa ser preenchido");
                return;
            } else {
                cad.setProtocolo(FtxProtocolo.getText());
            }

            if (TxSolicitante.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo Nome do Solicitante precisa ser preenchido");
                return;
            } else {
                cad.setSolicitante(TxSolicitante.getText());
            }

            Object numPcdp = FtxPcdp.getValue();
            if (numPcdp == null) {
                JOptionPane.showMessageDialog(null, "O campo Número PCDP precisa ser preenchido");
                return;
            } else {
                cad.setPcdp(FtxPcdp.getText());
            }

            // Valores de diária e passagem não tem NOT NULL no banco, verificação apenas aqui
            String valorDiaria = TxDiaria.getText().trim().replace(",", ".");
            if (valorDiaria.isEmpty() || Double.parseDouble(valorDiaria) < 0) {
                JOptionPane.showMessageDialog(null, "O campo Valor da Diária precisa ser preenchido e o valor não pode ser negativo");
                return;
            } else {
                double diaria = Double.parseDouble(valorDiaria);
                cad.setDiaria(diaria);
            }

            String valorPassagem = TxPassagem.getText().trim().replace(",", ".");
            if (valorPassagem.isEmpty() || Double.parseDouble(valorPassagem) < 0) {
                JOptionPane.showMessageDialog(null, "O campo Valor da Passagem precisa ser preenchido e o valor não pode ser negativo");
                return;
            } else {
                double passagem = Double.parseDouble(valorPassagem);
                cad.setPassagem(passagem);
            }

            Object data = FtxDataViagem.getValue();
            if (data == null) {
                JOptionPane.showMessageDialog(null, "O campo Data da Viagem precisa ser preenchido");
                return;
            } else {
                String dataTexto = FtxDataViagem.getText();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    LocalDate dataViagem = LocalDate.parse(dataTexto, formatter);
                    cad.setData(dataViagem);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null,
                            "Data inválida. Verifique se o dia e o mês existem.");
                    return;
                }
            }

            // Não tem verificação pois no banco fonte_recurso não tem NOT NULL
            cad.setRecurso(TxRecurso.getText());

            String beneficiarioSelecionado = (String) CbTipoBeneficiario.getSelectedItem();
            cad.setBeneficiario(beneficiarioSelecionado);

            cad.setObs(TxaObs.getText());

            CadastroDAO cadastroDao = new CadastroDAO();
            cadastroDao.salvar(cad);

            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }

        dispose();

    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<Programa> CbPrograma;
    private javax.swing.JComboBox<String> CbTipoBeneficiario;
    private javax.swing.JFormattedTextField FtxDataViagem;
    private javax.swing.JFormattedTextField FtxPcdp;
    private javax.swing.JFormattedTextField FtxProtocolo;
    private javax.swing.JLabel LbDataViagem;
    private javax.swing.JLabel LbDiaria;
    private javax.swing.JLabel LbObservacao;
    private javax.swing.JLabel LbPassagem;
    private javax.swing.JLabel LbPcdp;
    private javax.swing.JLabel LbPrograma;
    private javax.swing.JLabel LbProtocolo;
    private javax.swing.JLabel LbRecurso;
    private javax.swing.JLabel LbSolicitante;
    private javax.swing.JLabel LbTipoBeneficiario;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTextField TxDiaria;
    private javax.swing.JTextField TxPassagem;
    private javax.swing.JTextField TxRecurso;
    private javax.swing.JTextField TxSolicitante;
    private javax.swing.JTextArea TxaObs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
