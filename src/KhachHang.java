import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;


public class KhachHang extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblTien;
	private JTextField txtms;
	private JTextField txthoten;
	private JTextField txttien;
	private ButtonGroup buttonGroup;
	private JRadioButton rnam;
	private JRadioButton rnu;
	private JLabel lblGioitinh;
	private JButton bthem;
	private JButton bsua;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHang frame = new KhachHang();
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
	public KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblTien());
		contentPane.add(getTxtms());
		contentPane.add(getTxthoten());
		contentPane.add(getTxttien());
		contentPane.add(getRnam());
		contentPane.add(getRnu());
		contentPane.add(getLblGioitinh());
		contentPane.add(getBthem());
		contentPane.add(getBsua());
		contentPane.add(getBtnNewButton());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("MSKH:");
			lblNewLabel.setBounds(10, 21, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Ho ten:");
			lblNewLabel_1.setBounds(10, 53, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblTien() {
		if (lblTien == null) {
			lblTien = new JLabel("Tien:");
			lblTien.setBounds(10, 89, 46, 14);
		}
		return lblTien;
	}
	private JTextField getTxtms() {
		if (txtms == null) {
			txtms = new JTextField();
			txtms.setBounds(76, 18, 86, 20);
			txtms.setColumns(10);
		}
		return txtms;
	}
	private JTextField getTxthoten() {
		if (txthoten == null) {
			txthoten = new JTextField();
			txthoten.setBounds(86, 50, 115, 20);
			txthoten.setColumns(10);
		}
		return txthoten;
	}
	private JTextField getTxttien() {
		if (txttien == null) {
			txttien = new JTextField();
			txttien.setBounds(76, 86, 115, 20);
			txttien.setColumns(10);
		}
		return txttien;
	}
	/**
	 * @wbp.nonvisual location=42,259
	 */
	private ButtonGroup getButtonGroup() {
		if (buttonGroup == null) {
			buttonGroup = new ButtonGroup();
		}
		return buttonGroup;
	}
	private JRadioButton getRnam() {
		if (rnam == null) {
			rnam = new JRadioButton("Nam");
			rnam.setBounds(86, 129, 109, 23);
		}
		return rnam;
	}
	private JRadioButton getRnu() {
		if (rnu == null) {
			rnu = new JRadioButton("Nu");
			rnu.setBounds(86, 155, 109, 23);
		}
		return rnu;
	}
	private JLabel getLblGioitinh() {
		if (lblGioitinh == null) {
			lblGioitinh = new JLabel("GioiTinh:");
			lblGioitinh.setBounds(41, 133, 46, 14);
		}
		return lblGioitinh;
	}
	private JButton getBthem() {
		if (bthem == null) {
			bthem = new JButton("New button");
			bthem.setBounds(103, 196, 89, 23);
		}
		return bthem;
	}
	private JButton getBsua() {
		if (bsua == null) {
			bsua = new JButton("New button");
			bsua.setBounds(199, 196, 89, 23);
		}
		return bsua;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(102, 228, 89, 23);
		}
		return btnNewButton;
	}
}
