//Hệ thống quản lí sinh viên bằng Java GUI
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DangNhapHTQL extends JFrame{
	private String s;
	private JTextField readtk;
	private JTextField readmbv;
	private JPasswordField readmk;
	private JTextField showmbv;
	private JTextField check;
	
	public String usingRandom() {
        char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','a','B','b','C',
        'c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l',
        'M','m','N','n','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v',
        'W','w','X','x','Y','y','Z','z'};
        
        int index[] = new int[5];
        
        for (int i=0; i<5; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(36)+1;
            index[i] = ranNum;
        }
        char temp[] = {arr[index[0]], arr[index[1]], arr[index[2]], arr[index[3]], arr[index[4]]};
        String result = new String(temp);
        return result;
    }
	public DangNhapHTQL() {
		
		//Tạo khung 
		super.setTitle("Hệ thống quản lí sinh viên");
		super.setSize(548,390);
		super.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		//Set background
		getContentPane().setForeground(new Color(255, 255, 240));
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		//Tạo nhãn tiêu đề
		JLabel lbtd = new JLabel("Hệ thống quản lí  CTU");
		lbtd.setForeground(new Color(0, 0, 255));
		lbtd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbtd.setBounds(118, 36, 168, 20);
		getContentPane().add(lbtd);
		
		//Tạo nhãn nhập tài khoản
		JLabel lttk = new JLabel("Nhập tài khoản");
		lttk.setForeground(new Color(0, 0, 255));
		lttk.setFont(new Font("Tahoma", Font.BOLD, 15));
		lttk.setBounds(37, 89, 125, 19);
		getContentPane().add(lttk);
		
		//Tạo textfield nhập tài khoản
		readtk = new JTextField("");
		readtk.setBounds(190, 88, 160, 20);
		getContentPane().add(readtk);
		readtk.setColumns(10);
		
		//Tạo nhãn nhập mật khẩu
		JLabel lbmk = new JLabel("Nhập mật khẩu");
		lbmk.setForeground(new Color(0, 0, 255));
		lbmk.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbmk.setBounds(37, 156, 125, 19);
		getContentPane().add(lbmk);
		
		//Tạo Passwordfield nhập mật khẩu
		readmk = new JPasswordField();
		readmk.setBounds(190, 157, 160, 20);
		
		// Xu ly su kien moi khi nguoi dung nhap mat khau
        readmk.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                System.out.println(String.valueOf(readmk.getPassword()));
            }
        });
		getContentPane().add(readmk);
		
		//Tạo nhãn nhập mã bảo vệ
		JLabel lbdn = new JLabel("Nhập mã bảo vệ");
		
		lbdn.setForeground(new Color(0, 0, 255));
		lbdn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbdn.setBounds(37, 224, 138, 17);
		getContentPane().add(lbdn);

		//Tạo Textfield hiển thị mã bảo vệ
		s = usingRandom();
		
		//Tạo textfield nhập mã bảo vệ
		readmbv = new JTextField();
		readmbv.setBounds(190, 224, 160, 20);
		getContentPane().add(readmbv);
		readmbv.setColumns(10);
		
		//Tạo nút bấm đăng nhập
		JButton login = new JButton("Đăng nhập");
		login.setBounds(190, 288, 127, 23);
		getContentPane().add(login);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(readmbv.getText().equals(s)) {
					int hoi = JOptionPane.showConfirmDialog(null, "Bạn đã đăng nhập thành công\nBấm YES để thoát hệ thống"
							+ "\n Bấm NO để trở lại",null, JOptionPane.YES_NO_OPTION);
	                if (hoi == JOptionPane.YES_OPTION) System.exit(0);
	                else {
	                	
	                	readmbv.setText("");
	             	    s = usingRandom();
	             	    showmbv.setText(s);
	                	readmbv.requestFocus();
	                }
				}
				else {
					int hoi = JOptionPane.showConfirmDialog(null, "Bạn đã nhập sai mã bảo vệ\n Bấm YES để nhập lại"
							+ "\n Bấm NO để thoát hệ thống",null, JOptionPane.YES_NO_OPTION);
					if (hoi == JOptionPane.YES_OPTION) {
	                	readmbv.setText("");
	                	s = usingRandom();
	                	showmbv.setText(s);
	                	readmbv.requestFocus();
	                	
					}
					else System.exit(0);
				}
			}
		});
		login.setForeground(new Color(0, 0, 255));
		login.setFont(new Font("Tahoma", Font.BOLD, 15));
		showmbv = new JTextField(s);
		showmbv.setBounds(372, 224, 136, 20);
		getContentPane().add(showmbv);
		showmbv.setFont(new Font("Tahoma", Font.BOLD, 14));
		showmbv.setForeground(Color.BLACK);
		showmbv.setColumns(10);
		
		//2 bước cuối 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		
	}
	public static void main(String[] args) {
		new DangNhapHTQL();
	}
}
