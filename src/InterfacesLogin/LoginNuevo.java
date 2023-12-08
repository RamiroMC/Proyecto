/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesLogin;

import InterfacesApp.Tablon;
import ClasesApp.Mecanico;
import static InterfacesLogin.RegistroNuevo.imprimirContenidoBinario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.ArrayList;

/**
 *
 * @author MADE
 */
public class LoginNuevo extends javax.swing.JPanel {

    /**
     * Creates new form LoginNuevo
     */
    public LoginNuevo() {
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

        Contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JTextField();
        Iniciar = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicia sesión");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO:");
        jLabel3.setToolTipText("");

        Nombre.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña:");

        Contraseña.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        Iniciar.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciar.setText("ingresar");
        Iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseClicked
        //Obtener los datos de los campos de texto
        String nombreUsuario = Nombre.getText();
        String contraseñaUsuario = Contraseña.getText();

        try {
            //Validar que el nombre y la contraseña no estén vacíos.
            if (nombreUsuario.isEmpty() || contraseñaUsuario.isEmpty()) {
                throw new IllegalArgumentException("Ambos campos deben llenarse.");
            }

            //Validar que el nombre solo contenga letras.
            if (!esNombreValido(nombreUsuario)) {
                throw new IllegalArgumentException("El nombre debe contener solo letras.");
            }

            //Validar datos en el archivo binario.
            ArrayList<Mecanico> mecanicos = RegistroNuevo.leerBinario("mecanicos.dat");
            boolean usuarioAutenticado = false;

            //Iterar sobre la lista de mecánicos para verificar los datos.
            for (Mecanico mecanico : mecanicos) {
                if (mecanico.getNombre().equals(nombreUsuario) && mecanico.getContraseña().equals(contraseñaUsuario)) {
                   //Actualizar el estado del mecánico a true.
                     mecanico.setEstado(true);

                    //Escribir la lista actualizada de mecánicos en el archivo binario.
                     actualizarBinario("mecanicos.dat", mecanicos);
                          
                     usuarioAutenticado = true;
    
                break;
                }
            }

            //Verificar el resultado de la autenticación del usuario
            if (usuarioAutenticado) {
                //Si los datos son correctas, mostrar el siguiente tablón y cerrar la ventana actual
                Tablon tablon = new Tablon();
                this.setVisible(false);
                tablon.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    frame.dispose();
                }
                RegistroNuevo.imprimirContenidoBinario("mecanicos.dat");
            } else {
                //Si los datos son incorrectas, imprimir un mensaje de error en la consola
                System.out.println("Usuario o contraseña incorrectos.");
            }
        } catch (IllegalArgumentException e) {
            //Capturar y manejar excepciones de argumento ilegal, imprimir el mensaje de error en la consola
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_IniciarMouseClicked
    
    public static void actualizarBinario(String ruta, ArrayList<Mecanico> mecanicos) {
    try {
        //Se crea un FileOutputStream para escribir en el archivo binario en la ruta especificada
        FileOutputStream f = new FileOutputStream(ruta);
        ObjectOutputStream file = new ObjectOutputStream(f);

        //Se escribe la lista de mecánicos en el archivo
        file.writeObject(mecanicos.toArray(new Mecanico[0]));

        //Se cierra el archivo después de la escritura
        file.close();
    } catch (IOException ex) {
        //Manejo de excepciones: Imprime el error en la consola en caso de fallo en la escritura
        System.out.println(ex);
    }
}
    
    private boolean esNombreValido(String nombre) {
        //Se itera sobre cada carácter en el nombre utilizando un bucle for-each.
        for (char c : nombre.toCharArray()) {
            //Se verifica si el carácter actual no es una letra.
            if (!Character.isLetter(c)) {
                //Si se encuentra un carácter que no es una letra, se devuelve false.
                return false;
            }
        }
        //Si todos los caracteres son letras, se devuelve true.
        return true;
    }
    
    
    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JTextField Contraseña;
    private javax.swing.JLabel Iniciar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
