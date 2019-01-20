package appPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EtchedBorder;

import appPackage.properties.*;
/**
 *
 * @author vpinob
 */
@SuppressWarnings("serial")
public class MainForm extends JFrame
{
    private final JLabel JLabel1;
    private final JLabel JLabel2;
	private final JLabel JLabel3;
	private final JLabel JLabel4;
	private final JLabel JLabel5;
	private final JLabel JLabel6;
	private final JLabel JLabel7;
	private final JLabel JLabel8;
	private final JLabel JLabel9;
	public JTextField idNumberText;
	private final JTextField lastNameText;
	private final JTextField firstNameText;
	private final JTextField addressText;
	private final JTextField postalCodeText;
	private final JTextField cityText;
	private final JTextField phoneText;
	private final JTextField emailText;
	public JFormattedTextField birthDayText;
	public JButton engButton;
	public JButton norButton;
	public JButton spaButton;
	public JButton closeButton;
	private final JSeparator JSeparator1;
	private final JSeparator JSeparador4;
	private final JSeparator JSeparador5;
	private final JSeparator JSeparador6;
	private final JSeparator JSeperador8;
	private final JSeparator JSeperador9;
    /** 
     *
     */
    //@SuppressWarnings({"CallToPrintStackTrace", "OverridableMethodCallInConstructor"})
    public MainForm() 
	{	
		/**
		 * JLabel1
		 */
		JLabel1 = new JLabel();
		JLabel1.setBounds(25, 20, 90, 20);
		JLabel1.setText(Messages.getString("JLabel1")); //$NON-NLS-1$
		/**
		 * JLabel2
		 */
		JLabel2 = new JLabel();
		JLabel2.setText(Messages.getString("JLabel2")); //$NON-NLS-1$
		JLabel2.setBounds(25, 75, 90, 20);
		/**
		 * JLabel3
		 */
		JLabel3 = new JLabel();
		JLabel3.setText(Messages.getString("JLabel3")); //$NON-NLS-1$
		JLabel3.setBounds(25, 105, 90, 20);
		/**
		 * JLabel4
		 */
		JLabel4 = new JLabel();
		JLabel4.setText(Messages.getString("JLabel4")); //$NON-NLS-1$
		JLabel4.setBounds(25, 135, 90, 20);
		/**
		 * JLabel5
		 */
		JLabel5 = new JLabel();
		JLabel5.setBounds(25, 185, 90, 20);
		JLabel5.setText(Messages.getString("JLabel5")); //$NON-NLS-1$
		/**
		 * JLabel6
		 */
		JLabel6 = new JLabel();
		JLabel6.setBounds(25, 215, 100, 20);
		JLabel6.setText(Messages.getString("JLabel6")); //$NON-NLS-1$
		/**
		 * JLabel7
		 */
		JLabel7 = new JLabel();
		JLabel7.setBounds(270, 215, 80, 20);
		JLabel7.setText(Messages.getString("JLabel7")); //$NON-NLS-1$
		/**
		 * JLabel8
		 */
		JLabel8 = new JLabel();
		JLabel8.setBounds(25, 265, 90, 20);
		JLabel8.setText(Messages.getString("JLabel8")); //$NON-NLS-1$
		/**
		 * JLabel9
		 */
		JLabel9 = new JLabel();
		JLabel9.setBounds(25, 295, 90, 20);
		JLabel9.setText(Messages.getString("JLabel9")); //$NON-NLS-1$
		/**
		 * JTextField1
		 */
		idNumberText = new JTextField();
		idNumberText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				onlyNumber(e, idNumberText);
			}
		});
		idNumberText.setBounds(125, 15, 120, 30);
		idNumberText.setColumns(5);
		idNumberText.setHorizontalAlignment(SwingConstants.RIGHT);
		
		/**
		 * JTextField2
		 */
		lastNameText = new JTextField();
		lastNameText.setColumns(50);
		lastNameText.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameText.setBounds(125, 70, 360, 30);
		/**
		 * JTextField3
		 */
		firstNameText = new JTextField();
		firstNameText.setColumns(50);
		firstNameText.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameText.setBounds(125, 100, 360, 30);
		/**
		 * JTextField4
		 */
		addressText = new JTextField();
		addressText.setBounds(125, 180, 360, 30);
		addressText.setColumns(50);
		addressText.setHorizontalAlignment(SwingConstants.LEFT);
		/**
		 * JTextField5
		 */
		postalCodeText = new JTextField();
		postalCodeText.setBounds(125, 210, 120, 30);
		postalCodeText.setHorizontalAlignment(SwingConstants.RIGHT);
		postalCodeText.setColumns(4);
		/**
		 * JTextField6
		 */
		cityText = new JTextField();
		cityText.setBounds(365, 210, 120, 30);
		cityText.setBackground(Color.WHITE);
		cityText.setDisabledTextColor(Color.BLACK);
		cityText.setColumns(30);
		cityText.setHorizontalAlignment(SwingConstants.LEFT);
		/**
		 * JTextField7
		 */
		phoneText = new JTextField();
		phoneText.setBounds(125, 260, 120, 30);
		phoneText.setColumns(8);
		phoneText.setHorizontalAlignment(SwingConstants.RIGHT);
		/**
		 * JTextField8
		 */
		emailText = new JTextField();
		emailText.setBounds(125, 290, 360, 30);
		emailText.setColumns(50);
		emailText.setHorizontalAlignment(SwingConstants.LEFT);
		/**
		 * 
		 */
		try { 
                birthDayText = new JFormattedTextField(new MyDateFormat()); } catch (ParseException e1) { e1.printStackTrace(); }
                birthDayText.setHorizontalAlignment(JTextField.RIGHT);
                birthDayText.setBounds(125, 130, 160, 30);
		/**
		 * JButton1
		 */
		engButton = new JButton();
		engButton.setText(Messages.getString("JButton1")); //$NON-NLS-1$
		engButton.setBounds(375, 340, 120, 40);
		engButton.setHorizontalAlignment(SwingConstants.CENTER);
		engButton.addActionListener((ActionEvent e) -> {
			engButtonActionListener();
		});
		/**
		 * JButton2
		 */
		norButton = new JButton();
		norButton.setText(Messages.getString("JButton2")); //$NON-NLS-1$
		norButton.setBounds(500, 340, 120, 40);
		norButton.setHorizontalAlignment(SwingConstants.CENTER);
		norButton.addActionListener((ActionEvent e) -> {
			norButtonActionListener();
		});
		/**
		 * JButton3
		 */
		spaButton = new JButton();
		spaButton.setText(Messages.getString("JButton3")); //$NON-NLS-1$
		spaButton.setBounds(625, 340, 120, 40);
		spaButton.setHorizontalAlignment(SwingConstants.CENTER);
		spaButton.addActionListener((ActionEvent e) -> {
			spaButtonActionListener();
		});
		/**
		 * JButton4
		 */
		closeButton = new JButton();
		closeButton.setText(Messages.getString("JButton4")); //$NON-NLS-1$
		closeButton.setHorizontalAlignment(SwingConstants.CENTER);
		closeButton.setBounds(760, 340, 120, 40);
		closeButton.addActionListener((ActionEvent e) -> {
			closeButtonActionListener();
        });
		/**
		 * JSeparator1
		 */
		JSeparator1 = new JSeparator();
		JSeparator1.setBounds(0, 60, 890, 3);
		JSeparator1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		/**
		 * JSeparator4
		 */
		JSeparador4 = new JSeparator();
		JSeparador4.setBounds(0, 170, 890, 3);
		JSeparador4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		/**
		 * JSeparator5
		 */
		JSeparador5 = new JSeparator();
		JSeparador5.setBounds(0, 250, 890, 3);
		JSeparador5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		/**
		 * JSeparator6
		 */
		JSeparador6 = new JSeparator();
		JSeparador6.setBounds(0, 330, 890, 3);
		JSeparador6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		/**
		 * JSeperador8
		 */
		JSeperador8 = new JSeparator();
		JSeperador8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		JSeperador8.setBounds(0, 390, 890, 3);
		/**
		 * JSeperador9
		 */
		JSeperador9 = new JSeparator();
		JSeperador9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		JSeperador9.setBounds(750, 330, 3, 60);
		/**
		 * getContentPane()
		 */
		this.setVisible(true);
		this.setResizable(true);
		this.setLocation(new Point(100, 100));
		this.setSize(new Dimension(900, 450));
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(JLabel1);
		this.getContentPane().add(JLabel2);
		this.getContentPane().add(JLabel3);
		this.getContentPane().add(JLabel4);
		this.getContentPane().add(JLabel5);
		this.getContentPane().add(JLabel6);
		this.getContentPane().add(JLabel7);
		this.getContentPane().add(JLabel8);
		this.getContentPane().add(JLabel9);
		this.getContentPane().add(idNumberText);
		this.getContentPane().add(lastNameText);
		this.getContentPane().add(firstNameText);
		this.getContentPane().add(birthDayText);
		this.getContentPane().add(addressText);
		this.getContentPane().add(postalCodeText);
		this.getContentPane().add(cityText);
		this.getContentPane().add(phoneText);
		this.getContentPane().add(emailText);
		this.getContentPane().add(JSeparator1);
		this.getContentPane().add(JSeparador4);
		this.getContentPane().add(JSeparador5);
		this.getContentPane().add(JSeparador6);
		this.getContentPane().add(JSeperador8);
		this.getContentPane().add(JSeperador9);
		this.getContentPane().add(engButton);
		this.getContentPane().add(norButton);
		this.getContentPane().add(spaButton);
		this.getContentPane().add(closeButton);
		
	}
	/**
	 * 
	 */
	private void onlyNumber(KeyEvent e, JTextField jTextField)
	{
	 	if((((e.getKeyChar() < '0') ||(e.getKeyChar() > '9')) && (e.getKeyChar() != '\b')) || (jTextField.getText().length()== jTextField.getColumns()))
	    {
	 		e.consume();
	 		Toolkit.getDefaultToolkit().beep();
	    }
	}
	/**
	 * 
	 */
	private void engButtonActionListener()
	{
		Messages.changeLanguage("en", "EN");
		SelfRestart();
	}
	/**
	 * 
	 */
	private void norButtonActionListener()
	{
		Messages.changeLanguage("no", "NO");
		SelfRestart();
	}
	/**
	 * 
	 */
	private void spaButtonActionListener()
	{
		Messages.changeLanguage("es", "ES");
		SelfRestart();
	}
	/**
	 * 
	 */
	private void closeButtonActionListener()
	{
		this.dispose();
	}
	/**
	 * 
	 */
	public void SelfRestart() 
	{
	
		StringBuilder cmd = new StringBuilder();
		cmd.append(System.getProperty("java.home") + File.separator + "bin" + File.separator + "java ");
		cmd.append("-cp ").append(ManagementFactory.getRuntimeMXBean().getClassPath()).append(" ");
		cmd.append(MainForm.class.getName()).append(" ");

		try {
			Thread.currentThread();
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
			e1.printStackTrace();
		} // 3 seconds delay before restart
		try {
			Runtime.getRuntime().exec(cmd.toString());
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
	/**
	 * 
	 */
	public static void main(String args[]) {

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new MainForm().setVisible(true);
		});

	}
}
