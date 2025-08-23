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

public class Nu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCoefA;
	private JTextField textCoefB;
	private JTextField textCoefC;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
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
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double CoefA = Integer.parseInt(textCoefA.getText());
				double CoefB = Integer.parseInt(textCoefB.getText());
				double CoefC = Integer.parseInt(textCoefC.getText());
				
				double Delta = CoefB * CoefB - 4 * CoefA * CoefC ;
				lblDelta.setText(String.format("%.2f",Delta));
				
				if( Delta >  0) {
					double raiz = - CoefB /(2 * CoefA);
					double r = Math.sqrt(Delta);
					double raiz1 =  - Math.sqrt(Delta) / (2 * CoefA);
					double raiz2 = - CoefB + r / (2 * CoefA);
					
					lblRaiz1.setText(String.format("%.2f", raiz1));
					lblRaiz2.setText(String.format("%.2f", raiz2));
					
				}else if(Delta == 0) {
					double raiz = - CoefB /(2 * CoefA);;
					lblRaiz1.setText(String.format("%.2f", raiz));
					lblRaiz2.setText(String.format("%.2f", raiz));
				}
				else {
					int a  = 0;
					lblRaiz1.setText(Integer.toString(a));
					lblRaiz2.setText(Integer.toString(a));
				}
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
		

		
		JLabel lblNewLabel_6 = new JLabel("Raízes");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		

		

		
		JLabel lblNewLabel_7 = new JLabel("Raiz 1(x¹):");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8 = new JLabel("Raiz 2(x²):");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblMensagem = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(lblNewLabel_4)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textCoefB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCoefA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCoefC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnIgual)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel_6)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_8)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(15)
											.addComponent(lblMensagem))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblRaiz2, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblRaiz1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addContainerGap(165, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addGap(18)
									.addComponent(lblDelta, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
									.addGap(100))))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblDelta))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7)
								.addComponent(lblRaiz1))
							.addGap(16)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_8)
								.addComponent(lblRaiz2))
							.addGap(30))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(textCoefA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textCoefB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnIgual))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(textCoefC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addComponent(lblMensagem)))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}

}
