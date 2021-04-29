package com.angelina.calculadora.view;

import com.angelina.calculadora.services.Operacao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private TextField txtNumero1;
	private TextField txtNumero2;
	private Label result;
	private JComboBox<String> choseOp;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Calculadora frame = new Calculadora();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Calculadora() {
		contentPane();
		calcButton();
		comboBoxCompBox();
		txtNumero1();
		numero1();
		op();
		txtNumero2();
		numero2();
		result();
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 434);
	}
	
	private void contentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void calcButton() {
		JButton calcButton = new JButton("Calcular");
		calcButton.setBounds(90, 286, 117, 25);
		contentPane.add(calcButton);
		calcButton.addActionListener(e -> 
		executar()
		);
	}
	
	private JComboBox<String> comboBoxCompBox() {
		choseOp = new JComboBox<>();
		choseOp.setModel(new DefaultComboBoxModel<>(new String[] {"Somar", "Subtrair", "Multiplicar", "Dividir"}));
		choseOp.setBounds(25, 228, 247, 24);
		contentPane.add(choseOp);
		return choseOp;
	}
	
	private void txtNumero1() {
		txtNumero1 = new TextField();
		txtNumero1.setBounds(25, 67, 247, 26);
		contentPane.add(txtNumero1);
	}
	
	private void numero1()  {
		Label numero1 = new Label("Número 1");
		numero1.setBounds(15, 40, 69, 21);
		numero1.setAlignment(Label.CENTER);
		contentPane.add(numero1);
	}
	
	private void op() {
		Label op = new Label("Operação");
		op.setAlignment(Label.CENTER);
		op.setBounds(15, 188, 69, 21);
		contentPane.add(op);
	}
	
	private void txtNumero2() {
		txtNumero2 = new TextField();
		txtNumero2.setBounds(25, 141, 247, 26);
		contentPane.add(txtNumero2);
		
	}
	
	private void numero2() {
		Label numero2 = new Label("Número 2");
		numero2.setAlignment(Label.CENTER);
		numero2.setBounds(15, 114, 69, 21);
		contentPane.add(numero2);
		
	}
	
	private void result() {
		result = new Label("0");
		result.setAlignment(Label.CENTER);
		result.setBounds(109, 347, 69, 21);
		contentPane.add(result);
	}
	
	private void executar() {
		try {
			String numTxt1 = txtNumero1.getText();
			Double num1 = Double.parseDouble(numTxt1);
			Double num2 = Double.parseDouble(txtNumero2.getText());
			Double resultado = null;
			if(choseOp.getSelectedItem().equals("Somar")) {
				resultado = Operacao.somar(num1, num2);
			}
			else if(choseOp.getSelectedItem().equals("Subtrair")) {
				resultado = Operacao.subtrair(num1, num2);
			}
			else if(choseOp.getSelectedItem().equals("Multiplicar")) {
				resultado = Operacao.multiplicar(num1, num2);
			}
			else if(choseOp.getSelectedItem().equals("Dividir")) {
				resultado = Operacao.dividir(num1, num2);
			}
			result.setText(resultado.toString());
		} catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(this, "Algum valor está nulo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Erro ao converter: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro genérico: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
