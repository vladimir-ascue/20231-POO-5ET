package Ventanas;

import Clases.CFlor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class crudFlor extends JFrame {
    JPanel panel;
    private JLabel lblTitulo;
    private JLabel lblIdFlor;
    private JLabel lblNombre;
    private JTextField jtfnombre;

    private JButton jbtGuardar = new JButton();

    public crudFlor(){
        setSize(500, 350);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        inicializarComponentes();
        cargarEventos();
    }
    public void inicializarComponentes(){
        int posX1 = 10;
        int posX2 = 110;
        int posY = 35;
        int ancho = 150;
        int alto = 35;

        panel = new JPanel();
        panel.setLayout(null);

        lblTitulo = new JLabel();
        lblTitulo.setText("CRUD FLOR");
        lblTitulo.setBounds((this.getSize().width-ancho)/2, 15, ancho, alto);

        lblIdFlor = new JLabel("idFlor");
        lblIdFlor.setBounds(posX1, posY, ancho, alto);

        lblNombre = new JLabel("Nombre");
        posY += 55;
        lblNombre.setBounds(posX1, posY, ancho, alto);

        jtfnombre = new JTextField();
        jtfnombre.setText("Tu nombrecito aqui");
        jtfnombre.setBounds(posX2, posY, ancho, alto);

        jbtGuardar.setText("Guardar");
        posY += 55;
        jbtGuardar.setBounds( posX2, posY, ancho, alto);

        panel.add(lblTitulo);
        panel.add(lblIdFlor);
        panel.add(lblNombre);
        panel.add(jtfnombre);
        panel.add(jbtGuardar);

        this.getContentPane().add(panel);
    }

    public void cargarEventos(){
        jbtGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CFlor f = new CFlor();
                f.setNombre(jtfnombre.getText());

                f.save();

            }
        });
    }

}


