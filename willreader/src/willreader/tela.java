package willreader;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class tela extends javax.swing.JFrame {

    String caminho = null;
    String caminho_juntar = null;
    String caminho_juntar2 = null;
    String caminho_save_f = null;
    String versao = null;

    int i = 0;
    int j = 0;
    int k = 0;
    int w = 0;
    ArrayList<String> dadosarray = new ArrayList<>();
    ArrayList<String> dadosarray2 = new ArrayList<>();
    ArrayList<String> arrayjuntar1 = new ArrayList<>();
    ArrayList<String> arrayjuntar2 = new ArrayList<>();
    ArrayList<String> txtfinal = new ArrayList<>();
    BufferedImage imagemfundo;

    public tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao = new javax.swing.JButton();
        filepath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        separadortxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caminho1 = new javax.swing.JTextField();
        juntar_select1 = new javax.swing.JButton();
        caminho2 = new javax.swing.JTextField();
        juntar_select2 = new javax.swing.JButton();
        select_versao = new javax.swing.JComboBox<>();
        save2 = new javax.swing.JButton();
        nome2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qt_linha = new javax.swing.JLabel();
        t_linha1 = new javax.swing.JLabel();
        qt_linha2 = new javax.swing.JLabel();
        t_linha2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cod = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(964, 415));
        setResizable(false);
        getContentPane().setLayout(null);

        botao.setText("Selecionar Diretorio");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });
        getContentPane().add(botao);
        botao.setBounds(356, 39, 141, 23);

        filepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filepathActionPerformed(evt);
            }
        });
        getContentPane().add(filepath);
        filepath.setBounds(167, 40, 162, 20);

        lista.setEditable(false);
        lista.setColumns(20);
        lista.setRows(5);
        lista.setBorder(null);
        lista.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(347, 73, 280, 229);

        jToggleButton1.setText("Ler Arquivo");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(515, 39, 112, 23);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Desenvolvido por Will (PosionMoon) | Guild Ash | Bless Online");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 370, 470, 14);

        separadortxt.setToolTipText("");
        separadortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separadortxtActionPerformed(evt);
            }
        });
        getContentPane().add(separadortxt);
        separadortxt.setBounds(234, 13, 95, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Informe o separador: Ex \"=\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 20, 180, 14);

        salvar.setText("Salvar e dividir arquivos");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(440, 330, 182, 23);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(280, 330, 145, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Digite o nome do novo arquivo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 330, 190, 14);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Juntar arquivos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(735, 39, 184, 14);
        getContentPane().add(caminho1);
        caminho1.setBounds(655, 78, 187, 20);

        juntar_select1.setText("Selecionar");
        juntar_select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juntar_select1ActionPerformed(evt);
            }
        });
        getContentPane().add(juntar_select1);
        juntar_select1.setBounds(848, 77, 81, 23);
        getContentPane().add(caminho2);
        caminho2.setBounds(655, 127, 187, 20);

        juntar_select2.setText("Selecionar");
        juntar_select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juntar_select2ActionPerformed(evt);
            }
        });
        getContentPane().add(juntar_select2);
        juntar_select2.setBounds(848, 126, 81, 23);

        select_versao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", ".KOR", ".RUS" }));
        select_versao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_versaoActionPerformed(evt);
            }
        });
        getContentPane().add(select_versao);
        select_versao.setBounds(360, 10, 80, 20);

        save2.setText("Salvar");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        getContentPane().add(save2);
        save2.setBounds(717, 237, 81, 23);
        getContentPane().add(nome2);
        nome2.setBounds(655, 199, 173, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Digite o nome do novo arquivo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(655, 167, 230, 14);

        lista1.setEditable(false);
        lista1.setColumns(20);
        lista1.setRows(5);
        lista1.setBorder(null);
        lista1.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(lista1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(49, 73, 280, 229);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Coloque a primeira parte do arquivo abaixo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(655, 57, 260, 14);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Coloque a segunda parte do arquivo abaixo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(655, 106, 270, 14);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Diretorio Selecionado:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 40, 150, 14);

        qt_linha.setBackground(new java.awt.Color(255, 255, 255));
        qt_linha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qt_linha.setForeground(new java.awt.Color(255, 0, 0));
        qt_linha.setText("Qt. linhas:");
        getContentPane().add(qt_linha);
        qt_linha.setBounds(50, 310, 60, 14);

        t_linha1.setBackground(new java.awt.Color(255, 255, 255));
        t_linha1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_linha1.setForeground(new java.awt.Color(255, 0, 0));
        t_linha1.setText("0");
        getContentPane().add(t_linha1);
        t_linha1.setBounds(120, 308, 60, 14);

        qt_linha2.setBackground(new java.awt.Color(255, 255, 255));
        qt_linha2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qt_linha2.setForeground(new java.awt.Color(255, 0, 0));
        qt_linha2.setText("Qt. linhas:");
        getContentPane().add(qt_linha2);
        qt_linha2.setBounds(347, 308, 60, 14);

        t_linha2.setBackground(new java.awt.Color(255, 255, 255));
        t_linha2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_linha2.setForeground(new java.awt.Color(255, 0, 0));
        t_linha2.setText("0");
        getContentPane().add(t_linha2);
        t_linha2.setBounds(411, 308, 50, 14);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(750, 310, 210, 70);

        cod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","UTF-8", "UTF-16"}));
        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        getContentPane().add(cod);
        cod.setBounds(520, 10, 90, 20);

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Selecione a Codificação");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(620, 10, 170, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/willreader/bless.jpg.jpg"))); // NOI18N
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 970, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        // TODO add your handling code here:

        JFileChooser abrir = new JFileChooser();
        int retorno = abrir.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = abrir.getSelectedFile().getAbsolutePath();
        }
        filepath.setText(caminho);


    }//GEN-LAST:event_botaoActionPerformed

    private void filepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filepathActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_filepathActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here

        lista.setText("");
        lista1.setText("");
        try {
            try (FileReader arq = new FileReader(caminho)) {
                //BufferedReader lerArq = new BufferedReader(arq);
                BufferedReader lerArq = new BufferedReader(new InputStreamReader(new FileInputStream(caminho), (String) cod.getSelectedItem()));
                String linha = (lerArq.readLine()); // lê a primeira linha
                // a variável "linha" recebe o valor "null" quando o processo
                // de repetição atingir o final do arquivo texto
                String separador = separadortxt.getText();

                while (linha != null) {

                    int tamanho = linha.length(); // pega o tamanho da linha
                    final int indexOf = linha.indexOf(separador); // pega a linha quando enconta "=="
                    int pos = linha.indexOf(separador);
                    final String substring = linha.substring(indexOf + 1, tamanho); // atribui a variavel substring todo o texto depois do indexof baseado no tamanho da linha lida. 
                    final String substring2 = linha.substring(0, pos + 1); // atribui a variavel substring todo o texto depois do indexof baseado no tamanho da linha lida. 
                    dadosarray.add(substring);
                    dadosarray2.add(substring2);
                    i = i + 1;
                    System.out.println("-" + substring);
                    lista.append(substring + "\n");// adiciona a Jarea o que foi retirado da linha.
                    lista1.append(substring2 + "\n");

                    linha = lerArq.readLine(); // lê da segunda até a última linha
                }
                int size = dadosarray.size();
                int size2 = dadosarray2.size();
                t_linha1.setText(String.valueOf(size));
                t_linha2.setText(String.valueOf(size2));
                JOptionPane.showMessageDialog(null, "Processo Finalizado.");
                arq.close();
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        if (versao == null) {

            JOptionPane.showMessageDialog(null, "Você não selecionou a versão.");

        } else {
            String nome2 = nome.getText();
            JFileChooser fc = new JFileChooser();
            final CharsetEncoder utf8 = Charset.forName("UTF-8".intern()).newEncoder();
            // restringe a amostra a diretorios apenas
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int res = fc.showOpenDialog(null);
            if (res == JFileChooser.APPROVE_OPTION) {
                File diretorio = fc.getSelectedFile();
            } else {
                JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio");
            }
            caminho = fc.getSelectedFile().getAbsolutePath();
            String diretorio = caminho;

            OutputStreamWriter arquivo = null;
            OutputStreamWriter arquivo2 = null;
            try {
                arquivo = new OutputStreamWriter(new FileOutputStream(diretorio + "/" + nome2 + "_segunda_parte" + versao, true), utf8);
                arquivo2 = new OutputStreamWriter(new FileOutputStream(diretorio + "/" + nome2 + "_primeira_parte" + versao, true));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(tela.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Arquivos gerados com sucesso.");
            for (int j = 0; j < i; j++) {
                try {
                    arquivo.write(dadosarray.get(j).intern() + "\n");
                    arquivo2.write(dadosarray2.get(j).intern() + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(tela.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            try {
                arquivo.close();
                arquivo2.close();
            } catch (IOException e2) {

                e2.printStackTrace();
            }
        }

    }//GEN-LAST:event_salvarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void juntar_select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juntar_select1ActionPerformed

        JFileChooser abrir = new JFileChooser();
        int retorno = abrir.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho_juntar = abrir.getSelectedFile().getAbsolutePath();
        }
        caminho1.setText(caminho_juntar);

        try {
            try (FileReader arq = new FileReader(caminho_juntar)) {
                BufferedReader lerArq = new BufferedReader(new InputStreamReader(new FileInputStream(caminho_juntar), "UTF-8"));
                String linha = (lerArq.readLine()); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
                while (linha != null) {
                    arrayjuntar1.add(linha);
                    k = k + 1;
                    linha = lerArq.readLine(); // lê da segunda até a última linha
                }
                JOptionPane.showMessageDialog(null, "Processo Finalizado.");
                arq.close();
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();


    }//GEN-LAST:event_juntar_select1ActionPerformed

    private void juntar_select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juntar_select2ActionPerformed

        JFileChooser abrir = new JFileChooser();
        int retorno = abrir.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho_juntar2 = abrir.getSelectedFile().getAbsolutePath();
        }
        caminho2.setText(caminho_juntar2);

        try {
            try (FileReader arq = new FileReader(caminho_juntar2)) {
                BufferedReader lerArq = new BufferedReader(new InputStreamReader(new FileInputStream(caminho_juntar2), "UTF-8"));
                String linha = (lerArq.readLine()); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
                while (linha != null) {
                    arrayjuntar2.add(linha);
                    w = w + 1;
                    linha = lerArq.readLine(); // lê da segunda até a última linha
                }
                JOptionPane.showMessageDialog(null, "Processo Finalizado.");
                arq.close();
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();


    }//GEN-LAST:event_juntar_select2ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        if (versao == null) {

            JOptionPane.showMessageDialog(null, "Você não selecionou a versão.");

        } else {
            String nome3 = nome2.getText();
            JFileChooser fc = new JFileChooser();
            // restringe a amostra a diretorios apenas
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int res = fc.showOpenDialog(null);
            if (res == JFileChooser.APPROVE_OPTION) {
                File diretorio = fc.getSelectedFile();
            } else {
                JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio");
            }
            caminho_save_f = fc.getSelectedFile().getAbsolutePath();
            String diretorio = caminho_save_f;
            //FileWriter writer = null;   
            OutputStreamWriter arquivo = null;
            final CharsetEncoder utf = Charset.forName("UTF-8".intern()).newEncoder();
            try {
                arquivo = new OutputStreamWriter(new FileOutputStream(diretorio + "/" + nome3 + versao, true), utf);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(tela.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int r = 0; r < k; r++) {

                try {
                    txtfinal.add(arrayjuntar1.get(r) + arrayjuntar2.get(r));//JUNTA AS Arrays
                    arquivo.write(txtfinal.get(r).intern() + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(tela.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            try {
                JOptionPane.showMessageDialog(null, "Arquivo Salvo com sucesso!");
                arquivo.close();
            } catch (IOException e2) {

                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_save2ActionPerformed

    private void separadortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separadortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_separadortxtActionPerformed

    private void select_versaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_versaoActionPerformed
        // TODO add your handling code here:
        versao = (String) select_versao.getSelectedItem();
    }//GEN-LAST:event_select_versaoActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], String caminho) {
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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JTextField caminho1;
    private javax.swing.JTextField caminho2;
    private javax.swing.JComboBox<String> cod;
    private javax.swing.JTextField filepath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton juntar_select1;
    private javax.swing.JButton juntar_select2;
    private javax.swing.JTextArea lista;
    private javax.swing.JTextArea lista1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome2;
    private javax.swing.JLabel qt_linha;
    private javax.swing.JLabel qt_linha2;
    private javax.swing.JButton salvar;
    private javax.swing.JButton save2;
    private javax.swing.JComboBox<String> select_versao;
    private javax.swing.JTextField separadortxt;
    private javax.swing.JLabel t_linha1;
    private javax.swing.JLabel t_linha2;
    // End of variables declaration//GEN-END:variables
}
