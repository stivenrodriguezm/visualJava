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
    private JComboBox cmbIdioma;
    private JLabel lblIdioma;
    private JCheckBox chbTerminos;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndica;

    public IngresarPersona () {
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(plnPirncipal);
        this.setVisible(true);
        this.setSize(520,320);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected())?"Si":"No";
                String genero = (rbtMasculino.isSelected())?"Masculino":
                                (rbtFemenino.isSelected())?"Femenino":
                                (rbtOtro.isSelected())?"Otro":
                                (rbtNoIndica.isSelected())?"No indica":"";


                String mensaje = "Tus datos son: \n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n"+
                                 "Idioma: " + idioma + "\n"+
                                 "Acepta terminos: " + aceptoTerminos+"\n"+
                                 "Género: " + genero;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}