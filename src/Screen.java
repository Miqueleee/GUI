import javax.swing.JFrame;

//import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Screen extends JFrame {
    public Screen() {
    	JFrame jFrame = new JFrame("Cadastro de Aluno");
        //setTitle("Cadastro de Aluno");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        JFrame jFrame2 = new JFrame("Cadastro de Aluno");
        //setTitle("Cadastro de Aluno");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        JButton Cadastrar = new JButton("Cadastrar");
        Cadastrar.setBounds(10, 10, 150, 50);
        add(Cadastrar);
        Cadastrar.setVisible(true);
        Cadastrar.setFont(new Font ("Arial", Font.BOLD, 18));

        JButton Listar = new JButton("Listar");
        Listar.setBounds(180, 10, 150, 50);
        add(Listar);
        Listar.setVisible(true);
        Listar.setFont(new Font ("Arial", Font.BOLD, 18));
        
        JButton Atualizar = new JButton("Atualizar");
        Atualizar.setBounds(350, 10, 150, 50);
        add(Atualizar);
        Atualizar.setVisible(true);
        Atualizar.setFont(new Font ("Arial", Font.BOLD, 18));
        
        JButton Deletar = new JButton("Deletar");
        Deletar.setBounds(530, 10, 150, 50);
        add(Deletar);
        Deletar.setVisible(true);
        Deletar.setFont(new Font ("Arial", Font.BOLD, 18));
        

        
        setVisible(true);
    }


}
