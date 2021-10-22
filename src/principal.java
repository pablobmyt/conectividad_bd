import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class principal extends JFrame implements ActionListener {


    static ResultSet resultados;
    static  Connection micon = lecturaDatos.conexion();
    static  Connection micon2 = lecturaDatos.conexion();

static PreparedStatement stmt;
    static JLabel autor1 = new JLabel();
    static JLabel et1 = new JLabel("Buscar por atributo");
    static JTextField br1 = new JTextField();
    static JButton btn1 = new JButton("Buscar");

    public static void main(String[] args) throws SQLException {

principal p1 = new principal();


        stmt = micon.prepareStatement("SELECT * FROM cancion where autor like 'ACDC'");
        resultados = stmt.executeQuery();
        while (resultados.next()) {
            System.out.println("Nombre: " + resultados.getString("autor"));
        }


//marco.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

       String consulta = (("SELECT nombre FROM cancion where autor like '"+br1.getText())+"'");
        System.out.println(consulta);

        try {
            stmt = micon.prepareStatement(consulta);
            resultados = stmt.executeQuery();
            while (resultados.next()) {
                System.out.println("Nombre: " + resultados.getString("autor"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public principal() throws SQLException {


        GridLayout GL = new GridLayout(1, 2, 0, 100);

        GridLayout layout = new GridLayout(3, 1, 0, 150);


        JPanel menuSuperior = new JPanel();
        menuSuperior.setBorder(new EmptyBorder(10, 30, 20, 20));
        menuSuperior.setLayout(GL);
        JPanel menuInferior = new JPanel();

        menuInferior.setLayout(new GridLayout(1, 1));


        menuSuperior.add(et1);
        menuSuperior.add(br1);
        menuSuperior.add(autor1);
        btn1.addActionListener(this);
        menuInferior.add(btn1);

        JFrame marco = new JFrame();
        marco.setBounds(500, 500, 500, 500);
        marco.setLayout(layout);

        marco.add(menuSuperior);
        marco.add(menuInferior);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}


