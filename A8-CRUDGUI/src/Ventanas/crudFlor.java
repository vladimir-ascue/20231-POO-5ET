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
        int margenIzq1 = 10;
        int margenIzq2 = 110;
        int anchoCol1 = 80;
        int anchoCol = 150;
        int altoStandar = 35;

        panel = new JPanel();
        panel.setLayout(null);

        lblTitulo = new JLabel();
        lblTitulo.setText("CRUD FLOR");
        lblTitulo.setBounds(240, 15, 200, 45);

        lblIdFlor = new JLabel("idFlor");
        lblIdFlor.setBounds(margenIzq1, altoStandar, 150, 45);

        lblNombre = new JLabel("Nombre");
        altoStandar = altoStandar+20;
        lblNombre.setBounds(margenIzq1, altoStandar, 50, 45);

        jtfnombre = new JTextField();
        jtfnombre.setText("Tu nombrecito aqui");
        altoStandar = altoStandar+20;
        jtfnombre.setBounds(margenIzq2, altoStandar, 120, 45);

        jbtGuardar.setText("Guardar");
        jbtGuardar.setBounds( margenIzq2, altoStandar,60, 35);

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


