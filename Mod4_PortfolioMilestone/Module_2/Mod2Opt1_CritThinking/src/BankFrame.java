import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankFrame extends JFrame implements ActionListener {
	JButton balanceButton;
	JButton withdrawButton;
	JButton depositButton;
	JButton quitButton;
	JLabel initBalLabel;
	JLabel withdrawLabel;
	JLabel depositLabel;
	JLabel curBalLabel;
	JFormattedTextField initBalField;
	JFormattedTextField withdrawField;
	JFormattedTextField depositField;
	JTextField curBalField;
	
	BankFrame() {
		GridBagConstraints layoutConst = null;
		
		setTitle("My Bank App");
		
		initBalLabel = new JLabel("Enter initial balance:");
		withdrawLabel = new JLabel("Enter amount to withdraw:");
		depositLabel = new JLabel("Enter amount to deposit:");
		curBalLabel = new JLabel("Current Balance:");
		
		initBalField = new JFormattedTextField(NumberFormat.getNumberInstance());
		initBalField.setEditable(true);
		initBalField.setText("0");
		initBalField.setColumns(15);
		
		withdrawField = new JFormattedTextField(NumberFormat.getNumberInstance());
		withdrawField.setEditable(true);
		withdrawField.setText("0");
		withdrawField.setColumns(15);
		
		depositField = new JFormattedTextField(NumberFormat.getNumberInstance());
		depositField.setEditable(true);
		depositField.setText("0");
		depositField.setColumns(15);
		
		curBalField = new JTextField(15);
		curBalField.setEditable(false);
		curBalField.setText("0");
		
		balanceButton = new JButton("Submit");
		balanceButton.addActionListener(this);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.addActionListener(this);
		
		depositButton = new JButton("Deposit");
		depositButton.addActionListener(this);
		
		quitButton = new JButton("Quit");
		quitButton.addActionListener(this);
		
		
		setLayout(new GridBagLayout());
		
		layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 0;
	    add(initBalLabel, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 0;
	    add(initBalField, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 1;
	    add(withdrawLabel, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 1;
	    add(withdrawField, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 2;
	    add(depositLabel, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 2;
	    add(depositField, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 3;
	    add(curBalLabel, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 3;
	    add(curBalField, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 0;
	    add(balanceButton, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 1;
	    add(withdrawButton, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 2;
	    add(depositButton, layoutConst);
	    
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 3;
	    add(quitButton, layoutConst);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		double balance;
		double withdraw;
		double deposit;
		
		JButton eventSource = (JButton) event.getSource();
		
		
		if (eventSource == balanceButton) {
			balance = ((Number) initBalField.getValue()).doubleValue();
			curBalField.setText(Double.toString(balance));
		}
		
		else if (eventSource == withdrawButton) {
			balance = Double.parseDouble(curBalField.getText());
			withdraw = ((Number) withdrawField.getValue()).doubleValue();
			curBalField.setText(Double.toString(balance - withdraw));
		}
		
		else if (eventSource == depositButton) {
			balance = Double.parseDouble(curBalField.getText());
			deposit = ((Number) depositField.getValue()).doubleValue();
			curBalField.setText(Double.toString(balance + deposit));
		}
		
		else if (eventSource == quitButton) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		BankFrame myFrame = new BankFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}
