
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andreia
 */
public class CursosTela extends javax.swing.JFrame {

    /**
     * Creates new form CursosTela
     */
    public CursosTela() {
        super("Cursos");
        initComponents();
        buscarCursos();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursosPanel = new javax.swing.JPanel();
        cursosComboBox = new javax.swing.JComboBox<>();
        idCursoTextField = new javax.swing.JTextField();
        nomeCursoTextField = new javax.swing.JTextField();
        tipoCursoTextField = new javax.swing.JTextField();
        novoCursoButton = new javax.swing.JButton();
        atualizarCursoButton = new javax.swing.JButton();
        removerCursoButton = new javax.swing.JButton();
        cancelarCursoButton = new javax.swing.JButton();
        mostrarAlunosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cursosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Cursos"));

        idCursoTextField.setEditable(false);
        idCursoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        nomeCursoTextField.setEditable(false);
        nomeCursoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("nome"));

        tipoCursoTextField.setEditable(false);
        tipoCursoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("tipo"));

        novoCursoButton.setText("Novo");

        atualizarCursoButton.setText("Atualizar");

        removerCursoButton.setText("Remover");

        cancelarCursoButton.setText("Cancelar");

        mostrarAlunosButton.setText("Mostrar Alunos");

        javax.swing.GroupLayout cursosPanelLayout = new javax.swing.GroupLayout(cursosPanel);
        cursosPanel.setLayout(cursosPanelLayout);
        cursosPanelLayout.setHorizontalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tipoCursoTextField)
                                .addComponent(idCursoTextField)
                                .addComponent(cursosComboBox, 0, 330, Short.MAX_VALUE)
                                .addComponent(nomeCursoTextField))
                            .addGroup(cursosPanelLayout.createSequentialGroup()
                                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novoCursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removerCursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atualizarCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(cancelarCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(mostrarAlunosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        cursosPanelLayout.setVerticalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cursosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(idCursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeCursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoCursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novoCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(atualizarCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(removerCursoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(mostrarAlunosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cursosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cursosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosTela().setVisible(true);
            }
        });
    }

    private void buscarCursos() {
        try {
            DAO dao = new DAO();
            Curso[] cursos = dao.obterCursos();
            cursosComboBox.setModel(new DefaultComboBoxModel<>(cursos));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cursos indisponíveis...");
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarCursoButton;
    private javax.swing.JButton cancelarCursoButton;
    private javax.swing.JComboBox<Curso> cursosComboBox;
    private javax.swing.JPanel cursosPanel;
    private javax.swing.JTextField idCursoTextField;
    private javax.swing.JButton mostrarAlunosButton;
    private javax.swing.JTextField nomeCursoTextField;
    private javax.swing.JButton novoCursoButton;
    private javax.swing.JButton removerCursoButton;
    private javax.swing.JTextField tipoCursoTextField;
    // End of variables declaration//GEN-END:variables
}
