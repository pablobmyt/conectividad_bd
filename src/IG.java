import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IG extends JFrame implements ActionListener {


 static JLabel autor1 = new JLabel();
 static JLabel et1 = new JLabel("Buscar por atributo");
 static JTextField br1 = new JTextField();
 static JButton btn1 = new JButton("Buscar");


 public static void main(String[] args) {


 }

 public IG() {
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

 @Override
 public void actionPerformed(ActionEvent e) {

 }
}
