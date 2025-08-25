package besk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Nu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCoefA;
	private JTextField textCoefB;
	private JTextField textCoefC;
	private JLabel lblInfor_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nu frame = new Nu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Nu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblInfor_1 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		lblInfor_1.setVerticalAlignment(SwingConstants.TOP);
		lblInfor_1.setToolTipText("");
		lblInfor_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textCoefA = new JTextField();
		textCoefA.setColumns(10);
		
		textCoefB = new JTextField();
		textCoefB.setColumns(10);
		
		textCoefC = new JTextField();
		textCoefC.setColumns(10);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(new Color(255, 0, 0));
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblRaiz1 = new JLabel("0");
		lblRaiz1.setForeground(new Color(255, 0, 0));
		lblRaiz1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblRaiz2 = new JLabel("0");
		lblRaiz2.setForeground(new Color(255, 0, 0));
		lblRaiz2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JPanel panelInfor = new JPanel();
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double CoefA = Integer.parseInt(textCoefA.getText());
				double CoefB = Integer.parseInt(textCoefB.getText());
				double CoefC = Integer.parseInt(textCoefC.getText());
				
				double Delta = CoefB * CoefB - 4 * CoefA * CoefC ;
				lblDelta.setText(String.format("%.2f",Delta));
				
				if( Delta >  0) {
					
					double o = - CoefB /(2 * CoefA);
					double r = Math.sqrt(Delta);
					double raiz1 =  - Math.sqrt(Delta) / (2 * CoefA);
					double raiz2 = - CoefB + r / (2 * CoefA);
					
					lblRaiz1.setText(String.format("%.2f", raiz1));
					lblRaiz2.setText(String.format("%.2f", raiz2));
					
					lblInfor_1.setText("Sua equação é exata, pois seu Delta é maior que 0, e tem raízes diferentes");
					
				}else if(Delta == 0) {
					double raiz = - CoefB /(2 * CoefA);;
					lblRaiz1.setText(String.format("%.2f", raiz));
					lblRaiz2.setText(String.format("%.2f", raiz));
					
					lblInfor_1.setText("Sua equação é exata, porém seu Delta é igual a 0, e tem raízes iguais.");
				}
				else {
					int a  = 0;
					lblRaiz1.setText(Integer.toString(a));
					lblRaiz2.setText(Integer.toString(a));
					
					lblInfor_1.setText("Sua equação não e exata, pois seu Delta é menor que 0, Não á raízes(São números complexas).");
				}
				panelInfor.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Coeficiente A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Coeficiente B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Coeficiente C");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("Delta:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Baskara");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("Raízes:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		JLabel lblNewLabel_7 = new JLabel("Raiz 1(x¹):");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8 = new JLabel("Raiz 2(x²):");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblMensagem = new JLabel("");
		

		

		GroupLayout gl_panelInfor = new GroupLayout(panelInfor);
		gl_panelInfor.setHorizontalGroup(
			gl_panelInfor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInfor.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInfor_1, GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelInfor.setVerticalGroup(
			gl_panelInfor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInfor.createSequentialGroup()
					.addGap(25)
					.addComponent(lblInfor_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		panelInfor.setLayout(gl_panelInfor);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(panelInfor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblMensagem)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(71)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(15)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textCoefA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCoefB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCoefC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnIgual)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_6)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_8)
										.addComponent(lblNewLabel_7))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRaiz2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblRaiz1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDelta, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(74, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblMensagem)
					.addGap(21)
					.addComponent(lblNewLabel_4)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel)
							.addGap(13)
							.addComponent(lblNewLabel_1)
							.addGap(10)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addComponent(textCoefA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(15)
							.addComponent(textCoefB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textCoefC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8)
								.addComponent(lblRaiz2)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addComponent(btnIgual))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblDelta))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_7)
										.addComponent(lblRaiz1))
									.addGap(12))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
									.addComponent(lblNewLabel_6)
									.addGap(15)))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelInfor, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(208, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		panelInfor.setVisible(false);

	}
}
