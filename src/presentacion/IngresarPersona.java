package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel plnPirncipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblApellido;
    private JButton btnGuardar;
    public IngresarPersona () {
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(plnPirncipal);
        this.setVisible(true);
        this.setSize(400,300);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();


                String mensaje = "tus datos son: \n" +
                                 " Codigo: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apelldio: " + apellido + "\n" ;

                JOptionPane.showMessageDialog(btnGuardar, "Guardado con exito");
            }
        });
    }
}