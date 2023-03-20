package Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends JFrame {
    private JPanel panel;
    private JLabel jlbTitulo;
    private JButton jbtnFlores;
    private JButton jbtnClientes;
    private JButton jbtnVendedores;
    private JTextField jtfNombre;

    public principal(){
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        inicializarComponentes();
        cargarEventos();
    }

    public void inicializarComponentes() {
        panel = new JPanel();
        panel.setLayout(null);

        jlbTitulo = new JLabel();
        jlbTitulo.setText("CRUD GUI");
        jlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jlbTitulo.setBounds(0, 0, 80, 40); // (posX, posY, ancho, alto)

        jbtnFlores = new JButton();
        jbtnFlores.setBounds(10, 40, 120, 70);
        jbtnFlores.setText("Gestionar\nFlores");

        jbtnClientes = new JButton();
        jbtnClientes.setBounds(140, 40, 120, 70);
        jbtnClientes.setText("Gestionar\nClientes");

        jbtnVendedores = new JButton();
        jbtnVendedores.setBounds(280, 40, 120, 70);
        jbtnVendedores.setText("Gestionar\nVendedores");

        panel.add(jlbTitulo);
        panel.add(jbtnFlores);
        panel.add(jbtnClientes);
        panel.add(jbtnVendedores);

        this.getContentPane().add(panel);
    }

    public void cargarEventos(){
        jbtnFlores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crudFlor cf = new crudFlor();
                cf.setVisible(true);
                cf.setTitle("CRUD FLOR");
            }
        });
    }
    /**/

}


