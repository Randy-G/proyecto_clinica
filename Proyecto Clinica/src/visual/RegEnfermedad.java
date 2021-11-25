package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logica.Clinica;
import logica.Enfermedad;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JTextArea;
import java.awt.Font;

public class RegEnfermedad extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtTipo;
	private JTextArea txtInfo;
	private JLabel lblNewLabel_2;
	private JPanel panel_1;
	private JButton btnCancel;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegEnfermedad frame = new RegEnfermedad();
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
	public RegEnfermedad() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Registro de enfermedad");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(10, 103, 411, 25);
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(10, 78, 233, 14);
		panel.add(lblNewLabel);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(10, 177, 411, 25);
		panel.add(txtTipo);
		txtTipo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo: ");
		lblNewLabel_1.setBounds(10, 152, 233, 14);
		panel.add(lblNewLabel_1);
		
		txtInfo = new JTextArea();
		txtInfo.setLineWrap(true);
		txtInfo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtInfo.setBounds(10, 247, 411, 90);
		panel.add(txtInfo);
		txtInfo.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Descripci\u00F3n: ");
		lblNewLabel_2.setBounds(10, 222, 233, 14);
		panel.add(lblNewLabel_2);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 411, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(331, 361, 90, 25);
		panel.add(btnCancel);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Enfermedad newEnfermedad =  new Enfermedad(Clinica.getInstance().GenerateEnfCode());
				
				newEnfermedad.setNombre(txtName.getText());
				newEnfermedad.setTipo(txtTipo.getText());
				newEnfermedad.setDescipcion(txtInfo.getText());
				
				Clinica.getInstance().getMisEnfermedades().add(newEnfermedad);
				Clinica.getInstance().setEnfermedadCodeGenerator(Clinica.getInstance().getEnfermedadCodeGenerator() + 1);
				Clinica.getInstance().guardarClinica();
				
				JOptionPane.showMessageDialog(panel, "La enfermedad se ha registrado con �xito", "Registro de enfermedad", JOptionPane.INFORMATION_MESSAGE);
				txtName.setText("");
				txtTipo.setText("");
				txtInfo.setText("");
			}
		});
		btnRegistrar.setBounds(231, 361, 90, 25);
		panel.add(btnRegistrar);
	}
}