import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

//Dưới đây là tạo trực tiếp đối tượng JFrame không thừa kế từ lớp JFrame

public class MayTinh{
	
	//Các Textfield để nhập thông tin và xuất kết quả
	private static JTextField j1;
	private static JTextField jkq;
	private static JTextField j2;
	
	//Hàm trả về kết quả
	public static void ketqua(String key) {	
		double x = Double.parseDouble(j1.getText());
		double y = Double.parseDouble(j2.getText());
		double kq;
		
		if(key.equals("Phép cộng")) {
			 kq = x + y;
			jkq.setText(String.valueOf(kq));
		}
		else if(key.equals("Phép trừ")) {
			 kq = x - y;
			jkq.setText(String.valueOf(kq));
		}
		else if(key.equals("Phép nhân")) {
			kq = x*y;
			jkq.setText(String.valueOf(kq));
		}
		else {
			kq = x/y;
			jkq.setText(String.valueOf(kq));
		}
	}
	
	//Hàm xử lý
	public static void main(String[] args){

		//Tạo JFrame
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);//Set Background
		f.getContentPane().setForeground(Color.PINK);//SetForeground
		f.setForeground(Color.RED);//màu
		f.setSize(648, 346);//Thiết lập cửa sổ
		f.setFont(new Font("Dialog", Font.BOLD, 12));//Định dạng các thứ
		f.setTitle("Phép tính trên 2 số nguyên - Java Swing - Nguyễn Hữu Nhân");//Tiêu đề
		f.getContentPane().setLayout(null);//Cách sắp xếp bố cục
		
		//Tất cả các định dạng, tạo nhãn, tạo nút bấm, xử lí xự kiện nên sử dụng WindowBuilder kéo thả cho nhanh
		
		//Tạo nhãn nhập số thứ nhất
		JLabel nhan1 = new JLabel("Nhập số thứ 1");
		nhan1.setBounds(116, 41, 116, 19);
		nhan1.setForeground(Color.BLUE);
		nhan1.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(nhan1);
		
		//Tạo j1 nhập số thứ 1
		j1 = new JTextField();
		j1.setBounds(260, 40, 167, 20);
		f.getContentPane().add(j1);
		j1.setColumns(10);
		
		
		//Tạo nhãn nhập số thứ 2
		JLabel nhan2 = new JLabel("Nhập số thứ 2");
		nhan2.setBounds(116, 75, 116, 20);
		nhan2.setForeground(Color.BLUE);
		nhan2.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(nhan2);
		
		//Tạo text nhập số thứ hai
		j2 = new JTextField();
		j2.setBounds(260, 77, 167, 20);
		j2.setColumns(10);
		f.getContentPane().add(j2);
		
		//Tạo nút bấm tiêu đề tính tổng
		JLabel nhan3_kq = new JLabel("Bạn muốn thực hiện phép tính nào ?");
		nhan3_kq.setBounds(150, 125, 275, 23);
		nhan3_kq.setForeground(Color.RED);
		nhan3_kq.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(nhan3_kq);
		
		//Tạo nút bấm phép cộng
		JButton btcong = new JButton("Phép cộng");
		btcong.setBounds(38, 187, 116, 23);
		
		//Xử lí sự kiện cộng hai số
		btcong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "Phép cộng";
				MayTinh.ketqua(s);
			}
		});
		btcong.setForeground(Color.BLUE);
		btcong.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(btcong);
		
		//Tạo nút bấm phép trừ
		JButton bttru = new JButton("Phép trừ");
		bttru.setBounds(164, 187, 113, 23);
		//Xử lí sự kiện trừ hai số
		bttru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "Phép trừ";
				//Gọi hàm 
				MayTinh.ketqua(s);
			}
		});
		bttru.setFont(new Font("Tahoma", Font.BOLD, 15));
		bttru.setForeground(Color.BLUE);
		f.getContentPane().add(bttru);
		
		//Tạo nút bấm phép nhân
		JButton btnhan = new JButton("Phép nhân");
		btnhan.setBounds(287, 187, 116, 23);
		//Xử lí sự kiện nhân hai số
		btnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "Phép nhân";
				MayTinh.ketqua(s);
			}
		});
		btnhan.setForeground(Color.BLUE);
		btnhan.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(btnhan);
		
		//Tạo nút bấm phép chia
		JButton btchia = new JButton("Phép chia");
		btchia.setBounds(413, 187, 116, 23);
		
		//Xử lí sự kiện chia hai số
		btchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "Phép chia";
				MayTinh.ketqua(s);
			}
		});
		btchia.setFont(new Font("Tahoma", Font.BOLD, 15));
		btchia.setForeground(Color.BLUE);
		f.getContentPane().add(btchia);
		
		//Tạo nhãn kết quả
		JLabel btkq = new JLabel("Kết quả");
		btkq.setBounds(112, 259, 64, 19);
		btkq.setBackground(Color.PINK);
		btkq.setForeground(Color.RED);
		btkq.setFont(new Font("Tahoma", Font.BOLD, 15));
		f.getContentPane().add(btkq);
		
		//Tạo text xuất kết quả
		jkq = new JTextField();
		jkq.setBounds(210, 256, 275, 20);
		f.getContentPane().add(jkq);
		jkq.setColumns(10);
		jkq.setText("0");
		
		//Exit chương trình
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?",
                        null, JOptionPane.YES_NO_OPTION);
                if (hoi == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
		exit.setForeground(Color.RED);
		exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		exit.setBounds(533, 11, 89, 23);
		f.getContentPane().add(exit);
		
		//Reset máy tính
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j1.setText("");
                j2.setText("");
                jkq.setText("");
                j1.requestFocus();
            }
        });
		reset.setForeground(Color.RED);
		reset.setFont(new Font("Tahoma", Font.BOLD, 15));
		reset.setBounds(533, 45, 89, 23);
		f.getContentPane().add(reset);
		
		// hiển thị cửa sổ
		f.setVisible(true);
	}
}
