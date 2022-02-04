import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InputForm extends Frame implements ActionListener{
	TextField t1=new TextField(40);
	TextField t2=new TextField(40);
	TextField t3=new TextField(40);
	TextField t4=new TextField(40);
	public InputForm() {
		setTitle("DETAILS COLLECTION");
		setSize(450,440);
		setVisible(true);
		 
		Button button;
		setLayout(null); 
		Label label1;
		Label l1= new Label("ENTER DETAILS :");
		add(l1);
		l1.setBounds(100, 30, 100, 50);
		//  **
		Label l2= new Label("Name :");
		add(l2);
		l2.setBounds(50, 90, 100, 50);
		add(t1);
		t1.setBounds(150, 90, 160, 30);
		//   **
		Label l3= new Label("Mobile Number :");
		add(l3);
		l3.setBounds(50, 145, 100, 50);
		add(t2);
		t2.setBounds(150, 150, 160, 30);
		//   **
		Label l4= new Label("Department :");
		add(l4);
		l4.setBounds(50, 200, 100, 50);
		add(t3);
		t3.setBounds(150, 200, 160, 30);
		//  **
		Label l5=new Label("Email:");
		add(l5);
		l5.setBounds(50, 250, 60, 40);
		add(t4);
		t4.setBounds(150, 260, 180, 30);
		
		Button b=new Button("SUBMIT");
		add(b);
		b.setBounds(170, 350, 100, 30);
		b.addActionListener(this);
		
		//window closing
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		//frame
		
	}
		public void actionPerformed(ActionEvent e) {
			System.out.println("Name:    - "+t1.getText());
			System.out.println("Number:  - "+t2.getText());
			System.out.println("department:  - "+t3.getText());
			System.out.println("email:  - "+t4.getText());
		}
		

	public static void main(String[] args) {
		InputForm IF =new InputForm();
		
	}
}