package cap3_ej18;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoempleadoP = new javax.swing.JPanel();
        infoempleadoL = new javax.swing.JLabel();
        codL = new javax.swing.JLabel();
        nomL = new javax.swing.JLabel();
        h_trabajoL = new javax.swing.JLabel();
        h_valorL = new javax.swing.JLabel();
        retefL = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        h_trabajo = new javax.swing.JTextField();
        h_valor = new javax.swing.JTextField();
        retef = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        infoempleadoSP = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoempleadoP.setBackground(new java.awt.Color(255, 255, 240));

        infoempleadoL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        infoempleadoL.setText("Información del empleado");

        codL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codL.setText("Código del empleado");

        nomL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomL.setText("Nombre del empleado");

        h_trabajoL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        h_trabajoL.setText("Horas trabajadas al mes");

        h_valorL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        h_valorL.setText("Valor hora trabajada");

        retefL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        retefL.setText("Valor de retención en la fuente");

        cod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cod.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        h_trabajo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        h_trabajo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        h_valor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        h_valor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        retef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        retef.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        consultar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        consultar.setForeground(new java.awt.Color(0, 0, 153));
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(153, 0, 0));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resultado.setLineWrap(true);
        resultado.setRows(6);
        resultado.setWrapStyleWord(true);
        resultado.setSize(new java.awt.Dimension(232, 90));
        infoempleadoSP.setViewportView(resultado);

        javax.swing.GroupLayout infoempleadoPLayout = new javax.swing.GroupLayout(infoempleadoP);
        infoempleadoP.setLayout(infoempleadoPLayout);
        infoempleadoPLayout.setHorizontalGroup(
            infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoempleadoPLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(infoempleadoL)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoempleadoPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoempleadoSP)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoempleadoPLayout.createSequentialGroup()
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codL)
                            .addComponent(nomL))
                        .addGap(18, 18, 18)
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom)
                            .addComponent(cod)))
                    .addGroup(infoempleadoPLayout.createSequentialGroup()
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_valorL)
                            .addComponent(h_trabajoL))
                        .addGap(10, 10, 10)
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_trabajo)
                            .addComponent(h_valor)))
                    .addGroup(infoempleadoPLayout.createSequentialGroup()
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retefL)
                            .addGroup(infoempleadoPLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(consultar)))
                        .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoempleadoPLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(infoempleadoPLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(retef)))))
                .addGap(30, 30, 30))
        );
        infoempleadoPLayout.setVerticalGroup(
            infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoempleadoPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(infoempleadoL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codL)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomL)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_trabajoL)
                    .addComponent(h_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_valorL)
                    .addComponent(h_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retefL)
                    .addComponent(retef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(infoempleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultar)
                    .addComponent(borrar))
                .addGap(15, 15, 15)
                .addComponent(infoempleadoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoempleadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoempleadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        int codigo = Integer.parseInt(cod.getText());
        String nombre = nom.getText();
        double horas_trabajadas = Double.parseDouble(h_trabajo.getText());
        double valor_hora = Double.parseDouble(h_valor.getText());
        double p_retencionf = Double.parseDouble(retef.getText());
        InfoEmpleado empleado = new InfoEmpleado(codigo,nombre,horas_trabajadas,valor_hora,p_retencionf);
        double salariobruto = empleado.calcularSalarioBruto();
        double salarioneto = empleado.calcularSalarioNeto();
        String resultadotxt = 
                "\nCódigo del empleado: " + empleado.codigo 
                + "\nNombre del empleado: " + empleado.nombre 
                + "\nSalario bruto del empleado: $ " + salariobruto 
                + "\nSalario neto del empleado: $ " + salarioneto;
        resultado.setText(resultadotxt);
    }//GEN-LAST:event_consultarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        cod.setText("");
        nom.setText("");
        h_trabajo.setText("");
        h_valor.setText("");
        retef.setText("");
        resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel codL;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField h_trabajo;
    private javax.swing.JLabel h_trabajoL;
    private javax.swing.JTextField h_valor;
    private javax.swing.JLabel h_valorL;
    private javax.swing.JLabel infoempleadoL;
    private javax.swing.JPanel infoempleadoP;
    private javax.swing.JScrollPane infoempleadoSP;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomL;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField retef;
    private javax.swing.JLabel retefL;
    // End of variables declaration//GEN-END:variables
}
