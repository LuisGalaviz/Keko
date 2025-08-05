package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraBasica extends JFrame implements ActionListener {
    JTextField campo1, campo2, resultado;
    JButton btnSuma, btnResta, btnMultiplicacion, btnDivision;

    public CalculadoraBasica() {
        setTitle("Calculadora Básica");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        campo1 = new JTextField();
        campo2 = new JTextField();
        resultado = new JTextField();
        resultado.setEditable(false);

        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplicacion = new JButton("×");
        btnDivision = new JButton("÷");

        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);

        add(new JLabel("Número 1:"));
        add(campo1);
        add(new JLabel("Número 2:"));
        add(campo2);
        add(new JLabel("Resultado:"));
        add(resultado);
        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(campo1.getText());
            double num2 = Double.parseDouble(campo2.getText());
            double res = 0;

            if (e.getSource() == btnSuma) {
                res = num1 + num2;
            } else if (e.getSource() == btnResta) {
                res = num1 - num2;
            } else if (e.getSource() == btnMultiplicacion) {
                res = num1 * num2;
            } else if (e.getSource() == btnDivision) {
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede dividir entre cero.");
                    return;
                }
            }

            resultado.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraBasica().setVisible(true));
    }
}
