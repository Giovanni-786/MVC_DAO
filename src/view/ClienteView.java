package view;

import controller.ClienteController;
import controller.EnderecoController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ClienteModel;
import model.EnderecoModel;

public class ClienteView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "Cpf", "Email", "DDD", "Telefone", "END_ID"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<ClienteModel> lista;
    private ArrayList<EnderecoModel> listaenderecos;
    
    private ClienteTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public ClienteView() {
        this.setPreferredSize(new Dimension(750, 650));
        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        // adiciona evento para qdo navegar no JTable, atualizar os dados nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(lista.get(selecionado));
                }
            }
        });
        setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnINCLUIR = new javax.swing.JButton();
        btnGRAVAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblUSU_ID = new javax.swing.JLabel();
        lblUSU_NOME = new javax.swing.JLabel();
        lblUSU_LOGIN = new javax.swing.JLabel();
        edtCLI_ID = new javax.swing.JTextField();
        edtCLI_NOME = new javax.swing.JTextField();
        edtCLI_DDD = new javax.swing.JTextField();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        edtCLI_CPF = new javax.swing.JTextField();
        lblUSU_LOGIN2 = new javax.swing.JLabel();
        edtCLI_EMAIL = new javax.swing.JTextField();
        lblUSU_LOGIN3 = new javax.swing.JLabel();
        edtCLI_TELEFONE = new javax.swing.JTextField();
        lblUSU_ID1 = new javax.swing.JLabel();
        edtEND_ID = new javax.swing.JTextField();
        lblUSU_ID2 = new javax.swing.JLabel();
        edtEND_RUA = new javax.swing.JTextField();
        lblUSU_ID3 = new javax.swing.JLabel();
        edtEND_NUMERO = new javax.swing.JTextField();
        lblUSU_ID4 = new javax.swing.JLabel();
        edtEND_ESTADO = new javax.swing.JTextField();
        lblUSU_ID5 = new javax.swing.JLabel();
        edtEND_CIDADE = new javax.swing.JTextField();
        lblUSU_ID6 = new javax.swing.JLabel();
        edtEND_CEP = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        lblCONS_LOGIN = new javax.swing.JLabel();
        edtCONS_LOGIN = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MVC - Cadastro de Usuários");
        setFocusable(false);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 10, 730, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Clientes");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(230, 110, 260, 29);

        lblUSU_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID.setText("ID");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Nome");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("CPF");

        edtCLI_ID.setEditable(false);
        edtCLI_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtCLI_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLI_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLI_NOMEActionPerformed(evt);
            }
        });

        edtCLI_DDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("E-mail");

        edtCLI_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN2.setText("DDD");

        edtCLI_EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN3.setText("Telefone");

        edtCLI_TELEFONE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_ID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID1.setText("Código Endereço");

        edtEND_ID.setEditable(false);
        edtEND_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_ID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID2.setText("Rua");

        edtEND_RUA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEND_RUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEND_RUAActionPerformed(evt);
            }
        });

        lblUSU_ID3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID3.setText("Número");

        edtEND_NUMERO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEND_NUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEND_NUMEROActionPerformed(evt);
            }
        });

        lblUSU_ID4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID4.setText("Cidade");

        edtEND_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEND_ESTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEND_ESTADOActionPerformed(evt);
            }
        });

        lblUSU_ID5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID5.setText("Estado");

        edtEND_CIDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEND_CIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEND_CIDADEActionPerformed(evt);
            }
        });

        lblUSU_ID6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID6.setText("CEP");

        edtEND_CEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEND_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEND_CEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblUSU_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCLI_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, Short.MAX_VALUE)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_ID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtEND_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addComponent(lblUSU_ID2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edtEND_RUA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                                .addComponent(lblUSU_ID4)
                                                .addGap(18, 18, 18)
                                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                                        .addComponent(lblUSU_ID6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(edtEND_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addComponent(lblUSU_ID3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUSU_LOGIN1)
                                    .addComponent(lblUSU_LOGIN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtCLI_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCLI_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblUSU_ID)
                                .addGap(23, 23, 23)
                                .addComponent(edtCLI_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtCLI_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN2)
                                .addGap(18, 18, 18)
                                .addComponent(edtCLI_DDD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUSU_ID5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtEND_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUSU_ID1)
                            .addComponent(edtEND_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCLI_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_ID))))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUSU_NOME)
                            .addComponent(edtCLI_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEND_RUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_ID2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUSU_LOGIN)
                        .addComponent(edtCLI_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_ID3)))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUSU_LOGIN1)
                            .addComponent(edtCLI_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_ID4))))
                .addGap(1, 1, 1)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUSU_LOGIN2)
                        .addComponent(edtCLI_DDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUSU_ID5)
                            .addComponent(edtEND_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN3)
                    .addComponent(edtCLI_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_ID6)
                    .addComponent(edtEND_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Usuário", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 130, 710, 220);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_LOGIN.setText("Login");

        edtCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCONS_LOGIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(edtCONS_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_LOGIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consulta", painelCONSULTA);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 350, 720, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtCLI_ID.setText("0");
        edtCLI_NOME.setText("");
        edtCLI_CPF.setText("");
        edtCLI_EMAIL.setText("");
        edtCLI_DDD.setText("");
        edtCLI_TELEFONE.setText("");
        
        edtEND_ID.setText("0");
        edtEND_RUA.setText("");
        edtEND_NUMERO.setText("");
        edtEND_CIDADE.setText("");
        edtEND_ESTADO.setText("");
        edtEND_CEP.setText("");
        
    }

    private void mostrar(ClienteModel cliente) {
        edtCLI_ID.setText(String.valueOf(cliente.getCLI_ID()));
        edtCLI_NOME.setText(cliente.getCLI_NOME());
        edtCLI_CPF.setText(cliente.getCLI_CPF());
        edtCLI_EMAIL.setText(cliente.getCLI_EMAIL());
        edtCLI_TELEFONE.setText(cliente.getCLI_EMAIL());
        
        edtEND_ID.setText(String.valueOf(cliente.getEND_ID()));
        edtEND_RUA.setText(cliente.getCLI_NOME());
        edtEND_NUMERO.setText(cliente.getCLI_NOME());
        edtEND_CIDADE.setText(cliente.getCLI_NOME());
        edtEND_ESTADO.setText(cliente.getCLI_NOME());
        edtEND_CEP.setText(cliente.getCLI_NOME());
        
        /*chkUSU_ATIVO.setSelected((usuario.getUSU_ATIVO() == 1));*/
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(CLI_ID >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_ID <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "( upper(USU_NOME) LIKE ('%" + edtCONS_NOME.getText().toUpperCase() + "%'))";
        }
        if (!edtCONS_LOGIN.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "( upper(USU_LOGIN) LIKE ('%" + edtCONS_LOGIN.getText().toUpperCase() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            ClienteController clientecontroller = new ClienteController();
            lista = null;
            lista = clientecontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
            } else {
                tabela = new ClienteTableModel(lista, colunas);
                tblConsulta.setModel(tabela);
                tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
        }
    }

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        edtCLI_NOME.setFocusable(true);
        /*chkUSU_ATIVO.setSelected(true);*/
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Usuário ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ClienteModel objcliente = new ClienteModel();
                EnderecoModel objendereco = new EnderecoModel();
                objcliente.setCLI_ID(Integer.parseInt(edtCLI_ID.getText()));
                objcliente.setCLI_NOME(edtCLI_NOME.getText());
                objcliente.setCLI_CPF(edtCLI_CPF.getText());
                objcliente.setCLI_EMAIL(edtCLI_EMAIL.getText());
                objcliente.setCLI_DDD(Integer.parseInt(edtCLI_DDD.getText()));
                objcliente.setCLI_TELEFONE(Integer.parseInt(edtCLI_TELEFONE.getText()));
                /*objcliente.setUSU_ATIVO((chkUSU_ATIVO.isSelected() ? 1 : 0));*/
                
                objendereco.setEND_ID(Integer.parseInt(edtEND_ID.getText()));
                objendereco.setEND_RUA(edtEND_RUA.getText());
                objendereco.setEND_NUMERO(edtEND_NUMERO.getText());
                objendereco.setEND_CIDADE(edtEND_CIDADE.getText());
                objendereco.setEND_ESTADO(edtEND_ESTADO.getText());
                objendereco.setEND_CEP(edtEND_CEP.getText());
                
                
                
                ClienteController clientecontroller = new ClienteController();
                
                EnderecoController enderecocontroller = new EnderecoController();
                
                clientecontroller.gravar(getOperacao(), objcliente);
                enderecocontroller.gravarEnd(getOperacao(), objendereco);

                JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void mostrarRegistro(int registro) {
        if (registro >= 0 && registro < lista.size()) {
            // exibe os dados do registro na aba Dados
            mostrar(lista.get(registro));
            
            // posicionar o registro selecionado na tabela (JTable)
            tblConsulta.changeSelection(registro, 0, false, false);
        }
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");
        edtCLI_NOME.setText("");
        edtCLI_CPF.setText("");
        edtCLI_EMAIL.setText("");
        edtCLI_DDD.setText("");
        edtCLI_TELEFONE.setText("");
        edtCONS_LOGIN.setText("");
        
        edtEND_ID.setText("");
        edtEND_RUA.setText("");
        edtEND_NUMERO.setText("");
        edtEND_CIDADE.setText("");
        edtEND_ESTADO.setText("");
        edtEND_CEP.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ClienteModel objcliente = new ClienteModel();
                objcliente.setCLI_ID(Integer.parseInt(edtCLI_ID.getText()));
                objcliente.setCLI_NOME(edtCLI_NOME.getText());
                objcliente.setCLI_CPF(edtCLI_CPF.getText());
                objcliente.setCLI_EMAIL(edtCLI_EMAIL.getText());
                objcliente.setCLI_DDD(Integer.parseInt(edtCLI_DDD.getText()));
                objcliente.setCLI_TELEFONE(Integer.parseInt(edtCLI_TELEFONE.getText()));
                /*objcliente.setUSU_ATIVO((chkUSU_ATIVO.isSelected() ? 1 : 0));*/

                ClienteController clientecontroller = new ClienteController();
                clientecontroller.excluir(objcliente);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtCLI_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLI_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLI_NOMEActionPerformed

    private void edtEND_RUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEND_RUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEND_RUAActionPerformed

    private void edtEND_NUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEND_NUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEND_NUMEROActionPerformed

    private void edtEND_ESTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEND_ESTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEND_ESTADOActionPerformed

    private void edtEND_CIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEND_CIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEND_CIDADEActionPerformed

    private void edtEND_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEND_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEND_CEPActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JTextField edtCLI_CPF;
    private javax.swing.JTextField edtCLI_DDD;
    private javax.swing.JTextField edtCLI_EMAIL;
    private javax.swing.JTextField edtCLI_ID;
    private javax.swing.JTextField edtCLI_NOME;
    private javax.swing.JTextField edtCLI_TELEFONE;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_LOGIN;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtEND_CEP;
    private javax.swing.JTextField edtEND_CIDADE;
    private javax.swing.JTextField edtEND_ESTADO;
    private javax.swing.JTextField edtEND_ID;
    private javax.swing.JTextField edtEND_NUMERO;
    private javax.swing.JTextField edtEND_RUA;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_LOGIN;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JLabel lblUSU_ID1;
    private javax.swing.JLabel lblUSU_ID2;
    private javax.swing.JLabel lblUSU_ID3;
    private javax.swing.JLabel lblUSU_ID4;
    private javax.swing.JLabel lblUSU_ID5;
    private javax.swing.JLabel lblUSU_ID6;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_LOGIN2;
    private javax.swing.JLabel lblUSU_LOGIN3;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
