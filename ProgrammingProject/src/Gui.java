import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
public class Gui implements ActionListener {
	private JFrame frame;
	private JPanel FirstPanel;
	private JPanel Manager;
	private JButton ManagerButton;
    private JButton CustomerButton;
    private JLabel HelloLabel;
    private JLabel lblChooseAVehicle;
    private JButton NewTripButton;
    private JButton UpdateNewInfo;
    private JLabel ManagerPath;
    private JButton BackToMain;
    private JPanel NewTrip;
    private JRadioButton ExternalRadio ;
    private JRadioButton InternalRadio; 
    private ButtonGroup ticketType; 
    private ButtonGroup GroupOne;
    private JLabel FillUp;
    private JLabel TypeOfTrip;
    private ButtonGroup GroupTwo;
    private JLabel EnterThePrice;
    private JTextField PriceField;
    private JLabel EnterNameOf;
    private JTextField TripName;
    private ButtonGroup groupThree;
    private JButton BackToSecond;
    private JPanel PasswordPanel;
    private JLabel EnterThePassword;
    private JButton LogInManager;
    private JButton BackToMainmenu;
    private JPasswordField ThePassword;
    private JButton Save;
    private JButton btnChangeThePassword;
    private JPanel PasswordChange;
    private JTextField ChangePassText;
    private JLabel lblEnterTheNew;
    private JButton SavePass;
    private JButton btnReturn;
    private JTextArea ticketArea ;
    private int i=0;
    boolean exTripsFlag = false;
	boolean inTripsFlag = false;
	int updatePriceIndex = 0;
	private files     file = new files();
	private String    password=file.readPass();
	private Buses[]   buses = file.Read_File_ToBuses() ;
	private Cars[]    cars = file.Read_File_ToCars();
	private MiniBus[] miniBus = file.Read_File_ToMiniBus();
	private Trips[]   extrips = file.Read_File_ToExTrips();
	private Trips[]   intrips = file.Read_File_ToIntTrips();
	private Reservations[] reservations = file.Read_File_ToReservations();
	String[] vehicleList = { "Mini-Bus", "Car", "Bus"};
	String[] vehicleNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	String[] ticketClass = {"First Class", "Bussiness Class", "Economic Class"};
	String[] CarType = {"Mercedes","Hyundai","BMW","Toyota","Renault","Geely"};
	private JPanel MrCustomer;
	private JButton btnNewButton_1;
	private JPanel PurchaseTrips;
	private JLabel lblSelectYourDestinatin;
	private JButton btnBack;
	private JTextField Extripname;
	private JButton Exprevious;
	private JButton Exnext;
	private JButton ExPurchase;
	private JLabel lblChooseYourPath;
	private JLabel lblEnterYourName;
	private JTextField FirstName;
	private JComboBox comboBox;
	private JLabel lblAvailableSeats;
	private JTextField textField_3;
	private JLabel lblNumberOfSeats;
	private JTextField textFieldseats;
	private JLabel lblPreferedClass;
	private JComboBox comboBoxClass;
	private JTextField textField_5;
	private JComboBox comboBoxvehiclenum;	
	private JLabel lblVehicleNo ;
	private JLabel lblPreferedCar ;
	private JComboBox comboBoxCarType;
    Double totalfees ;
    Double flag ;
    Double mark ;
    private JTextField UnderCover;
    private JTextField undercoverticket;
    private JTextField undercovervehicle;
    private JTextField undercovercarbrand;
    private JTextField undercovervehiclenum;
    private JTextField undercoverclass;
    private JButton btnSingleTicket ;
    private JButton btnRoundTicket ;
    private JLabel lblDate;
    private JLabel lblTime;
    private JComboBox comboBoxhour ;
    private JComboBox comboBoxminute;
    private JComboBox comboBoxtime;
    private JTextField undercoverday;
    private JTextField undercovertime;
    private JTextField undercovermonth;
    private JTextField undercoveryear;
    private JTextField undercoverhour;
    private JTextField undercoverminute;
    private  JComboBox comboBoxday ;
    private  JComboBox comboBoxmonth ;
    private  JComboBox comboBoxyear ;
    String Day , month , year ;
    String hour , minute , time ;
    String Client , Date , TIME , car ;
    Double fees;
    private JLabel lblLastName;
    private JTextField lastName;
    private JLabel lblprice;
    private JPanel receipt;
    private JButton btnNewButton_2;
    private JPanel PassengersList;
    private JTextArea List;
    private JPanel ListOptions;
    private JPanel EnterList;
    private JLabel lblNewLabel;
    private JTextField vehicleno;
    private JButton btnGo;
    private JButton btnNewButton_7;
    int vehicle ;
    private JLabel lblPassengersList;
    private JButton btnNewButton_8;
    private JTextField tripDestinationField;
    private JTextField tripNameField;
    private JTextField tripPriceField;
    private JLabel lblNewLabel_1;
    private JTextField newPriceField;
    private JButton btnNewButton_10;
    private JLabel lblUpdateSuccessful;
    private JButton backButtonPrice;
    private JButton checkInButton;
    private JPanel checkInPanel;
    private JLabel lblNewLabel_2;
    private JButton btnCar;
    private JButton btnBus;
    private JButton btnMinibus;
    private JLabel lblEnterCarName;
    private JTextField textField;
    private JButton btnEnter_1;
    private JLabel lblCheckInSuccessful;
    private JLabel lblEnterBusNumber;
    private JTextField textField_1;
    private JButton btnNewButton_11;
    private JLabel lblEnterMinibusNumber;
    private JTextField textField_4;
    private JButton btnNewButton_12;
    private JLabel lblCarNotFound;
    private JButton btnBackToMain_1;
    private JLabel label_2;
    private JLabel label_3;
    private JLabel label_4;
    private JLabel label_5;
    private JLabel label_6;
    private JLabel label_7;
    private JLabel label_8;
    private JLabel label_9;
    private JLabel lblNewLabel_3;
    private JLabel label_10;
    private JLabel label_11;
    private JLabel label_12;

	
	
   
  

    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
	    FirstPanel = new JPanel();
		FirstPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(FirstPanel, "name_220505910326318");
		
		Manager = new JPanel();
		Manager.setBackground(new Color(221, 160, 221));
		Manager.setForeground(new Color(100, 149, 237));
		frame.getContentPane().add(Manager, "name_220524926300222");
		Manager.setLayout(null);
		GroupOne = new ButtonGroup();
		
	
		PasswordChange = new JPanel();
		PasswordChange.setBackground(new Color(51, 102, 102));
		frame.getContentPane().add(PasswordChange, "name_413102338132215");
		PasswordChange.setLayout(null);
		NewTrip = new JPanel();
		NewTrip.setBackground(new Color(248, 248, 255));
		NewTrip.setForeground(new Color(221, 160, 221));
		frame.getContentPane().add(NewTrip, "name_234948546758779");
		NewTrip.setLayout(null);
		
		 InternalRadio = new JRadioButton("Internal");
		 InternalRadio.setFont(new Font("Tahoma", Font.PLAIN, 19));
		 InternalRadio.setHorizontalAlignment(SwingConstants.CENTER);
		 InternalRadio.setBackground(new Color(255, 255, 255));
		InternalRadio.setBounds(347, 58, 222, 70);
		NewTrip.add(InternalRadio);
		
		 ExternalRadio = new JRadioButton("External");
		 ExternalRadio.setFont(new Font("Tahoma", Font.PLAIN, 19));
		 ExternalRadio.setBackground(new Color(255, 255, 255));
		 ExternalRadio.setHorizontalAlignment(SwingConstants.CENTER);
		 ExternalRadio.setSelected(true);
		ExternalRadio.setBounds(148, 58, 195, 70);
		NewTrip.add(ExternalRadio);
		GroupOne = new ButtonGroup();
		GroupOne.add(InternalRadio);
		GroupOne.add(ExternalRadio);
		GroupTwo = new ButtonGroup();
		
		FillUp = new JLabel("Please Fill Up The Form Of The New Trip.");
		FillUp.setHorizontalAlignment(SwingConstants.CENTER);
		FillUp.setFont(new Font("Segoe Script", Font.BOLD, 22));
		FillUp.setBounds(-15, 0, 534, 70);
		NewTrip.add(FillUp);
		PasswordPanel = new JPanel();
		PasswordPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(PasswordPanel, "name_339622788819783");
		PasswordPanel.setLayout(null);
		GroupTwo = new ButtonGroup();
		
		
		TypeOfTrip = new JLabel("-Type Of Trip:");
		TypeOfTrip.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 21));
		TypeOfTrip.setHorizontalAlignment(SwingConstants.LEFT);
		TypeOfTrip.setBounds(0, 58, 253, 62);
		NewTrip.add(TypeOfTrip);
		groupThree = new ButtonGroup();
		
		EnterThePrice = new JLabel("-Enter The Price:");
		EnterThePrice.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 21));
		EnterThePrice.setHorizontalAlignment(SwingConstants.LEFT);
		EnterThePrice.setBounds(583, 20, 189, 29);
		NewTrip.add(EnterThePrice);
		
		PriceField = new JTextField();
		PriceField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PriceField.setHorizontalAlignment(SwingConstants.CENTER);
		PriceField.setBounds(765, 24, 225, 26);
		NewTrip.add(PriceField);
		PriceField.setColumns(10);
		
		EnterNameOf = new JLabel("-Destination:");
		EnterNameOf.setHorizontalAlignment(SwingConstants.LEFT);
		EnterNameOf.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		EnterNameOf.setBounds(577, 77, 187, 32);
		NewTrip.add(EnterNameOf);
		
		TripName = new JTextField();
		TripName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TripName.setHorizontalAlignment(SwingConstants.CENTER);
		TripName.setBounds(765, 76, 225, 39);
		NewTrip.add(TripName);
		TripName.setColumns(10);
		
		BackToSecond = new JButton("Back");
		BackToSecond.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 18));
		BackToSecond.setBackground(new Color(255, 255, 255));
		BackToSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordChange.setVisible(false);
				PasswordPanel.setVisible(false);
				
			}
		});
		BackToSecond.setBounds(821, 572, 169, 70);
		NewTrip.add(BackToSecond);
		
		Save = new JButton("Save");
		Save.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 19));
		Save.setBackground(new Color(255, 255, 255));
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					try {
						double d = Double.parseDouble(PriceField.getText());
						if(TripName.getText().equals(""))
								{
							JOptionPane.showMessageDialog(null,
									   "Check All Your Informations Again",
									   "An Error Has Occurred",
									    JOptionPane.WARNING_MESSAGE); 
								}
						else {
							if(ExternalRadio.isSelected())
							{
								int x= file.sizeEx;
								extrips[x] = new Trips("External", TripName.getText(),d);
								file.sizeEx++;
								file.writeToExTrips(extrips);
							}
							else {
								int x=file.sizeIn;
								intrips[x] = new Trips("Internal", TripName.getText(),d);
								file.sizeIn++;
								file.writeToInTrips(intrips);
							}
						FirstPanel.setVisible(false);
						Manager.setVisible(true);
						MrCustomer.setVisible(false);
						NewTrip.setVisible(false);
						PasswordChange.setVisible(false);
						PasswordPanel.setVisible(false);
						TripName.setText("");
						PriceField.setText("");
						
					}
					}
					catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null,
								   "Check All Your Informations Again",
								   "An Error Has Occurred",
								    JOptionPane.WARNING_MESSAGE); 
						
					}
					
					
				
					
				}}
			);
		Save.setBounds(821, 257, 169, 62);
		NewTrip.add(Save);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(".\\src\\NewTripAdv.jpg"));
		lblNewLabel_3.setBounds(22, 119, 1079, 642);
		NewTrip.add(lblNewLabel_3);
		
		PasswordChange.setVisible(false);
		FirstPanel.setVisible(true);
		Manager.setVisible(false);
		NewTrip.setVisible(false);
		PasswordPanel.setVisible(false);
		NewTripButton = new JButton("Create A New Trip");
		NewTripButton.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		NewTripButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				PasswordChange.setVisible(false);
				NewTrip.setVisible(true);
				PasswordPanel.setVisible(false);
			}
		});

			
		JPanel UpdatePrice = new JPanel();
		UpdatePrice.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(UpdatePrice, "name_526731337340869");
		UpdatePrice.setLayout(null);
		UpdatePrice.setVisible(false);	
		NewTripButton.setBackground(new Color(255, 250, 250));
		NewTripButton.setBounds(12, 106, 214, 64);
		Manager.add(NewTripButton);
		
		UpdateNewInfo = new JButton("Update A Current Trip");
		UpdateNewInfo.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		UpdateNewInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
				UpdatePrice.setVisible(true);
				
			}
		});
		UpdateNewInfo.setBackground(new Color(255, 250, 250));
		UpdateNewInfo.setBounds(83, 217, 214, 64);
		Manager.add(UpdateNewInfo);
		
		ManagerPath = new JLabel("Welcome Back Sir..");
		ManagerPath.setFont(new Font("Lithos Pro Regular", Font.BOLD, 29));
		ManagerPath.setHorizontalAlignment(SwingConstants.CENTER);
		ManagerPath.setBounds(0, 0, 456, 64);
		Manager.add(ManagerPath);
		
		BackToMain = new JButton("Back To Main Menu");
		BackToMain.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		BackToMain.setBackground(new Color(255, 250, 250));
		BackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(true);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
			}
		});
		BackToMain.setBounds(12, 565, 196, 64);
		Manager.add(BackToMain);
		
		
		btnChangeThePassword = new JButton("Change The Password");
		btnChangeThePassword.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		btnChangeThePassword.setBackground(new Color(255, 250, 250));
		btnChangeThePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(false);
				PasswordChange.setVisible(true);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				
			}
		});

		btnChangeThePassword.setBounds(143, 314, 196, 64);
		Manager.add(btnChangeThePassword);
		
		btnNewButton_2 = new JButton("View Passenger's List");
		btnNewButton_2.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		btnNewButton_2.setBackground(new Color(255, 250, 250));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setBounds(237, 433, 196, 64);
		Manager.add(btnNewButton_2);
		
		checkInButton = new JButton("Check In");
		checkInButton.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 17));
		checkInButton.setBackground(new Color(255, 250, 250));
		checkInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkInPanel.setVisible(true);
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				
			}
		});
		checkInButton.setBounds(366, 513, 176, 64);
		Manager.add(checkInButton);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(".\\src\\Manager.jpg"));
		label_3.setBounds(-152, -35, 1275, 828);
		Manager.add(label_3);

		
		
		 ManagerButton = new JButton("Manager");
		 ManagerButton.setBounds(12, 565, 395, 64);
		 ManagerButton.setFont(new Font("Lucida Handwriting", Font.PLAIN, 17));
		ManagerButton.setForeground(Color.BLACK);
		ManagerButton.setBackground(new Color(255, 255, 255));
		ManagerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(true);
				PasswordChange.setVisible(false);
			}
		});
		FirstPanel.setLayout(null);
		FirstPanel.add(ManagerButton);
		
		 CustomerButton = new JButton("Customer");
		 CustomerButton.setBounds(599, 565, 391, 64);
		 CustomerButton.setFont(new Font("Lucida Handwriting", Font.PLAIN, 17));
		CustomerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				MrCustomer.setVisible(true);
				comboBoxyear.setVisible(false);
                comboBoxtime.setVisible(false);
                comboBoxday.setVisible(false);
                comboBoxmonth.setVisible(false);
                comboBoxhour.setVisible(false);
                comboBoxminute.setVisible(false);

			}
			
		});
		CustomerButton.setBackground(new Color(255, 255, 255));
		CustomerButton.setForeground(new Color(0, 0, 0));
		FirstPanel.add(CustomerButton);
		
	     HelloLabel = new JLabel("Hello And Welcome To The Station");
	     HelloLabel.setBounds(-266, -12, 1002, 145);
		HelloLabel.setForeground(new Color(0, 0, 0));
		HelloLabel.setBackground(Color.PINK);
		HelloLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 22));
		HelloLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FirstPanel.add(HelloLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(".\\src\\Welcoming.jpg"));
		label.setBounds(-150, -12, 1403, 901);
		FirstPanel.add(label);
		EnterThePassword = new JLabel("Enter The Password First:");
		EnterThePassword.setFont(new Font("Source Sans Pro Black", Font.BOLD, 26));
		EnterThePassword.setHorizontalAlignment(SwingConstants.CENTER);
		EnterThePassword.setBounds(12, 29, 346, 55);
		PasswordPanel.add(EnterThePassword);
		 LogInManager = new JButton("Log In");
		LogInManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ThePassword.getText().equals(password)) {
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				PasswordChange.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(null,
							   "Wrong Password",
							   "An Error Has Occurred",
							    JOptionPane.WARNING_MESSAGE); 
			}
		});
		LogInManager.setBackground(new Color(248, 248, 255));
		LogInManager.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
		LogInManager.setBounds(387, 136, 149, 63);
		PasswordPanel.add(LogInManager);
		
		 BackToMainmenu = new JButton("Back To MainMenu");
		 BackToMainmenu.setBackground(new Color(248, 248, 255));
		 BackToMainmenu.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		FirstPanel.setVisible(true);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
		 	}
		 });
		BackToMainmenu.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
		BackToMainmenu.setBounds(22, 137, 173, 63);
		PasswordPanel.add(BackToMainmenu);
		
		ThePassword = new JPasswordField();
		ThePassword.setBackground(Color.DARK_GRAY);
		ThePassword.setForeground(Color.WHITE);
		ThePassword.setHorizontalAlignment(SwingConstants.CENTER);
		ThePassword.setBounds(343, 40, 241, 36);
		PasswordPanel.add(ThePassword);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(".\\src\\P.jpg"));
		label_4.setBounds(22, 0, 1002, 1345);
		PasswordPanel.add(label_4);
		
		
		
		ChangePassText = new JTextField();
		ChangePassText.setHorizontalAlignment(SwingConstants.CENTER);
		ChangePassText.setBounds(430, 26, 289, 34);
		PasswordChange.add(ChangePassText);
		ChangePassText.setColumns(10);
		
		lblEnterTheNew = new JLabel("Enter the new password you'd like:");
		lblEnterTheNew.setFont(new Font("Lithos Pro Regular", Font.BOLD, 19));
		lblEnterTheNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheNew.setBounds(10, 13, 408, 59);
		PasswordChange.add(lblEnterTheNew);
		
		SavePass = new JButton("Save");
		SavePass.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		SavePass.setBackground(new Color(255, 250, 250));
		SavePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				password = ChangePassText.getText();
				file.changePass(password);
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
			}
		});
		SavePass.setBounds(844, 583, 158, 59);
		PasswordChange.add(SavePass);
		
		btnReturn = new JButton("Back");
		btnReturn.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		btnReturn.setBackground(new Color(255, 250, 250));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
			}
		});
		btnReturn.setBounds(10, 570, 158, 72);
		PasswordChange.add(btnReturn);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(".\\src\\confused Password.jpg"));
		label_6.setBounds(-20, 26, 1034, 684);
		PasswordChange.add(label_6);
		
		MrCustomer = new JPanel();
		MrCustomer.setBackground(new Color(221, 160, 221));
		frame.getContentPane().add(MrCustomer, "name_127853011307088");
		MrCustomer.setLayout(null);
		
		JLabel lblHelloMrCustomer = new JLabel("Hello Customer");
		lblHelloMrCustomer.setForeground(new Color(173, 216, 230));
		lblHelloMrCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloMrCustomer.setFont(new Font("Rockwell", Font.PLAIN, 23));
		lblHelloMrCustomer.setBounds(-96, 0, 414, 98);
		MrCustomer.add(lblHelloMrCustomer);
		
		JButton btnBuyATicket_1 = new JButton("Internal Trip");
		btnBuyATicket_1.setForeground(Color.BLACK);
		btnBuyATicket_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		btnBuyATicket_1.setBackground(SystemColor.activeCaption);
		btnBuyATicket_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticketArea.setText("Internal Trip");
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				PurchaseTrips.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				MrCustomer.setVisible(false);
			}
		});
		btnBuyATicket_1.setBounds(579, 311, 388, 98);
		MrCustomer.add(btnBuyATicket_1);
		
		btnNewButton_1 = new JButton("External Trip");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ticketArea.setText("External Trip");
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				PurchaseTrips.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				MrCustomer.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(579, 154, 388, 112);
		MrCustomer.add(btnNewButton_1);
		
		lblChooseYourPath = new JLabel("Choose Your Path ");
		lblChooseYourPath.setForeground(new Color(0, 255, 255));
		lblChooseYourPath.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		lblChooseYourPath.setBounds(12, 84, 239, 81);
		MrCustomer.add(lblChooseYourPath);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setBackground(SystemColor.activeCaption);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Extripname.setText(null);
				i=0 ;
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				PurchaseTrips.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				MrCustomer.setVisible(false);
				FirstPanel.setVisible(true);
			}
		});
		btnBackToMain.setFont(new Font("Perpetua Titling MT", Font.BOLD, 18));
		btnBackToMain.setBounds(0, 578, 321, 64);
		MrCustomer.add(btnBackToMain);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(".\\src\\Astro Passenger.png"));
		label_1.setBounds(-41, -11, 1032, 787);
		MrCustomer.add(label_1);
		
		PurchaseTrips = new JPanel();
		PurchaseTrips.setBackground(Color.WHITE);
		frame.getContentPane().add(PurchaseTrips, "name_131152478440329");
		PurchaseTrips.setLayout(null);
		
		lblSelectYourDestinatin = new JLabel("Select Your Destination :");
		lblSelectYourDestinatin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectYourDestinatin.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 18));
		lblSelectYourDestinatin.setBounds(-42, 13, 449, 37);
		PurchaseTrips.add(lblSelectYourDestinatin);
		
		btnBack = new JButton("Back ");
		btnBack.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 17));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Extripname.setText(null);
				i=0 ;
				Manager.setVisible(false);
				FirstPanel.setVisible(false);
				PurchaseTrips.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				MrCustomer.setVisible(true);
			}
		});
		btnBack.setBackground(new Color(255, 250, 250));
		btnBack.setBounds(12, 594, 92, 37);
		PurchaseTrips.add(btnBack);
		
		Extripname = new JTextField();
		Extripname.setEditable(false);
		Extripname.setColumns(10);
		Extripname.setBounds(375, 12, 197, 37);
		PurchaseTrips.add(Extripname);
		
		Exprevious = new JButton("Previous");
		Exprevious.setFont(new Font("Lucida Handwriting", Font.PLAIN, 16));
		Exprevious.setBackground(new Color(255, 250, 250));
		Exprevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( ticketArea.getText().matches("External Trip") )
				{	
					try 
						{
						    i-- ;
							Extripname.setText(extrips[i].destination);
					    	UnderCover.setText(Double.toString(extrips[i].price));

						}
						catch(Exception o)
						{
							i++ ;
							Extripname.setText("You are at the Start !");
							
						}
				}
				else if(ticketArea.getText().matches("Internal Trip"))
				{
					try 
					{
						i-- ;
						Extripname.setText(intrips[i].destination);
				    	UnderCover.setText(Double.toString(intrips[i].price));

					}
					catch(Exception exd)
					{
						i++ ;
						Extripname.setText("You are at the Start !");
						
					}
				}
			}
		});
		Exprevious.setBounds(242, 63, 247, 31);
		PurchaseTrips.add(Exprevious);
		
		Exnext = new JButton("Next");
		Exnext.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 16));
		Exnext.setBackground(new Color(255, 250, 250));
		Exnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if ( ticketArea.getText().matches("External Trip") )
		{	
			try 
				{
			        
					Extripname.setText(extrips[i].destination);
					UnderCover.setText(Double.toString(extrips[i].price));
			        i++;
				}
				catch(Exception o)
				{
					i--;
					Extripname.setText("You've reached the End !");
					//i--;
				}
		}
		else if(ticketArea.getText().matches("Internal Trip"))
		{
			try 
			{
				
				Extripname.setText(intrips[i].destination);
				UnderCover.setText(Double.toString(intrips[i].price));
		    	i++;
			}
			catch(Exception exd)
			{
				i--;
				Extripname.setText("You've reached the End !");
				//i--;
			}
		}
			}
		});
		Exnext.setBounds(555, 62, 247, 31);
		PurchaseTrips.add(Exnext);
		
		
		JList list = new JList();
		list.setBounds(12, 201, 38, -19);
		PurchaseTrips.add(list);
		
		lblEnterYourName = new JLabel("First Name :");
		lblEnterYourName.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblEnterYourName.setBounds(10, 70, 92, 22);
		PurchaseTrips.add(lblEnterYourName);
		lblEnterYourName.setVisible(true);
		
		FirstName = new JTextField();
		FirstName.setBounds(99, 64, 131, 31);
		PurchaseTrips.add(FirstName);
		FirstName.setColumns(10);
		FirstName.setVisible(true);
		ticketType = new ButtonGroup();

		lblChooseAVehicle = new JLabel("Pick a Vehicle :");
		lblChooseAVehicle.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblChooseAVehicle.setBounds(0, 154, 114, 22);
		PurchaseTrips.add(lblChooseAVehicle);
		lblChooseAVehicle.setVisible(true);
		
		lblAvailableSeats = new JLabel("Current Available Seats :");
		lblAvailableSeats.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblAvailableSeats.setBounds(679, 160, 168, 22);
		PurchaseTrips.add(lblAvailableSeats);
		lblAvailableSeats.setVisible(true);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(859, 154, 46, 31);
		PurchaseTrips.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(true);
		
		
		
		lblNumberOfSeats = new JLabel("Your Number Of Seats :");
		lblNumberOfSeats.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblNumberOfSeats.setBounds(679, 202, 158, 22);
		PurchaseTrips.add(lblNumberOfSeats);
		lblNumberOfSeats.setVisible(true);

		textFieldseats = new JTextField();
		textFieldseats.setBounds(859, 201, 46, 31);
		PurchaseTrips.add(textFieldseats);
		textFieldseats.setColumns(10);
		textFieldseats.setVisible(true);
		
	
		
		lblPreferedClass = new JLabel("Prefered Class :");
		lblPreferedClass.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblPreferedClass.setBounds(0, 189, 131, 22);
		PurchaseTrips.add(lblPreferedClass);
		lblPreferedClass.setVisible(true);
		
		comboBoxClass = new JComboBox(ticketClass);
		comboBoxClass.setBackground(new Color(255, 250, 250));
		comboBoxClass.setBounds(0, 226, 99, 26);
		PurchaseTrips.add(comboBoxClass);
		comboBoxClass.addActionListener(this);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(807, 293, 131, 37);
		PurchaseTrips.add(textField_5);
		textField_5.setColumns(10);

		comboBoxvehiclenum = new JComboBox(vehicleNum);
		comboBoxvehiclenum.setBackground(new Color(255, 250, 250));
		comboBoxvehiclenum.setSelectedIndex(0);
		comboBoxvehiclenum.setBounds(0, 300, 63, 23);
		PurchaseTrips.add(comboBoxvehiclenum);
		textField_5.setVisible(true);
		comboBoxvehiclenum.setVisible(true);
		comboBoxvehiclenum.addActionListener(this);
		
	    ticketArea = new JTextArea();
	    ticketArea.setBackground(Color.WHITE);
	    ticketArea.setFont(new Font("Tahoma", Font.BOLD, 15));
		ticketArea.setEditable(false);
		ticketArea.setBounds(850, 18, 117, 37);
		PurchaseTrips.add(ticketArea);
		
		lblVehicleNo = new JLabel("Vehicle no. :");
		lblVehicleNo.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblVehicleNo.setBounds(0, 265, 92, 22);
		PurchaseTrips.add(lblVehicleNo);
		
		comboBox = new JComboBox(vehicleList);
		comboBox.setBackground(new Color(255, 250, 250));
		comboBox.setBounds(109, 154, 99, 28);
		PurchaseTrips.add(comboBox);
		comboBox.addActionListener(comboBox);
		
	    lblPreferedCar = new JLabel("Prefered Car Brand :");
		lblPreferedCar.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblPreferedCar.setBounds(104, 265, 158, 22);
		PurchaseTrips.add(lblPreferedCar);
		lblPreferedCar.setVisible(false);
		
		comboBoxCarType = new JComboBox(CarType);
		comboBoxCarType.setSelectedIndex(4);
		comboBoxCarType.setBounds(99, 298, 147, 27);
		PurchaseTrips.add(comboBoxCarType);
		
		UnderCover = new JTextField();
		UnderCover.setBounds(710, 12, 92, 37);
		PurchaseTrips.add(UnderCover);
		UnderCover.setColumns(10);
		UnderCover.setVisible(false);
		
		comboBoxCarType.setVisible(false);
		comboBoxCarType.addActionListener(this);
		comboBox.setVisible(true);
		comboBox.addActionListener(this);
		//System.out.println(comboBox.getSelectedIndex());
		
		ExPurchase = new JButton("Purchase");
		ExPurchase.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 17));
		ExPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	if(FirstName.getText().equals("")||lastName.getText().equals("")||Extripname.getText().equals("")) {
		JOptionPane.showMessageDialog(null,
				   "Check your informations",
				   "An Error Has Occurred",
				    JOptionPane.WARNING_MESSAGE); 
		
	}
	else {
		
		Manager.setVisible(false);
		FirstPanel.setVisible(false);
		PurchaseTrips.setVisible(false);
		NewTrip.setVisible(false);
		PasswordPanel.setVisible(false);
		PasswordChange.setVisible(false);
		MrCustomer.setVisible(false);
		receipt.setVisible(true);
		if( undercovervehicle.getText().matches("Car"))
				{
					try {
						        int x = file.sizereserve ;
						        String Client = FirstName.getText() + lastName.getText() ;
						        String d = Extripname.getText() ;
						        String vehicle = undercovercarbrand.getText() ;
						        int NumOfSeats = 1 ;
						        System.out.println(vehicle);
								reservations[x] = new Reservations(Client,d,"Car",vehicle ,"Class Cars" , NumOfSeats);
								file.sizereserve++;
								file.writeToReservations(reservations);							
					    }
					catch(NullPointerException ed)
					{
						System.out.append("Oh Crap !");
					}
				}	
				else if( undercovervehicle.getText().matches("Bus") || undercovervehicle.getText().matches("Mini-Bus"))
				{
					try {
						  int x = file.sizereserve ;
						        String Client = FirstName.getText() + lastName.getText() ;
						        String d = Extripname.getText() ;
						        String vehicle = undercovervehicle.getText() ;
						        String vehicleno = undercovervehiclenum.getText() ;
						        String classs = undercoverclass.getText() ;						 
						        int NumOfSeats = Integer.parseInt(textFieldseats.getText());
								reservations[x] = new Reservations(Client,d,vehicle ,vehicleno,classs,NumOfSeats);
								file.sizereserve++;
								if(NumOfSeats <= Integer.parseInt(textField_3.getText()))
								{
									if(reservations[x].vehicle.matches("Bus"))
									{
										int f = Integer.parseInt((String) comboBoxvehiclenum.getSelectedItem()) ;
									    file.Read_File_ToBuses();
									    buses[f-1].numberOfSeats -= NumOfSeats ;
									    file.writeToReservations(reservations);
									    file.writeToBus(buses);
									}
									else if (reservations[x].vehicle.matches("Mini-Bus"))
									{
										int f = Integer.parseInt((String) comboBoxvehiclenum.getSelectedItem()) ;
										file.Read_File_ToMiniBus();
										miniBus[f-1].numberOfSeats -= NumOfSeats ;
										file.writeToReservations(reservations);
										file.writeToMinibus(miniBus);
										
									}
								}
								else
								{
									FirstPanel.setVisible(false);
									Manager.setVisible(false);
									NewTrip.setVisible(false);
									PasswordPanel.setVisible(false);
									PasswordChange.setVisible(false);
									PassengersList.setVisible(false);
									MrCustomer.setVisible(false);
									receipt.setVisible(false);
									PurchaseTrips.setVisible(true);
									ListOptions.setVisible(false);
									EnterList.setVisible(false);
									
									JOptionPane.showMessageDialog(null,
											   "The Vehicle doesn't have Enough Seats !",
											   "An Error Has Occurred",
											    JOptionPane.WARNING_MESSAGE); 
									return ;
								}
						
					    }
					catch(NullPointerException ed)
					{
						System.out.append("All Field are required !");
					}
					
				}
				
	}
				}
			
			
		});
		ExPurchase.setBackground(new Color(248, 248, 255));
		ExPurchase.setBounds(363, 605, 484, 37);
		PurchaseTrips.add(ExPurchase);
		
		JLabel lblTicketDirection = new JLabel("Select Ticket :");
		lblTicketDirection.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblTicketDirection.setBounds(124, 190, 114, 17);
		PurchaseTrips.add(lblTicketDirection);
		
		JButton btnSingleTicket = new JButton("Single Ticket");
		btnSingleTicket.setBackground(new Color(255, 250, 250));
		btnSingleTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxmonth.setVisible(false);
				comboBoxday.setVisible(false);
				lblDate.setVisible(false);
				comboBoxyear.setVisible(false);
				undercoverticket.setText(btnSingleTicket.getText());
				System.out.println(undercoverticket.getText());
				btnRoundTicket.setBackground(Color.WHITE);
				btnSingleTicket.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnSingleTicket.setBounds(130, 228, 108, 22);
		PurchaseTrips.add(btnSingleTicket);
		
		btnRoundTicket = new JButton("Round Ticket");
		btnRoundTicket.setBackground(new Color(255, 250, 250));
		btnRoundTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxmonth.setVisible(true);
				comboBoxday.setVisible(true);
				lblDate.setVisible(true);
				comboBoxyear.setVisible(true);
				undercoverticket.setText(btnRoundTicket.getText());
				System.out.println(undercoverticket.getText());
				btnRoundTicket.setBackground(Color.LIGHT_GRAY);
				btnSingleTicket.setBackground(Color.WHITE);
				//Double res = (Double.parseDouble(UnderCover.getText())*2)/1.2 ;
				//textField_5.setText(Double.toString(res));

			}
		});
		btnRoundTicket.setBounds(258, 225, 108, 23);
		PurchaseTrips.add(btnRoundTicket);

		
		undercoverticket = new JTextField();
		undercoverticket.setBackground(Color.WHITE);
		undercoverticket.setVisible(false);
		undercoverticket.setBounds(915, 69, 20, 20);
		PurchaseTrips.add(undercoverticket);
		undercoverticket.setColumns(10);

		
		undercovervehicle = new JTextField();
		undercovervehicle.setBackground(new Color(221, 160, 221));
		undercovervehicle.setVisible(false);
		undercovervehicle.setColumns(10);
		undercovervehicle.setBounds(883, 98, 20, 20);
		PurchaseTrips.add(undercovervehicle);

		
		undercovercarbrand = new JTextField();
		undercovercarbrand.setBackground(Color.WHITE);
		undercovercarbrand.setVisible(false);
		undercovercarbrand.setBounds(883, 69, 20, 20);
		PurchaseTrips.add(undercovercarbrand);
		undercovercarbrand.setColumns(10);

		
		undercovervehiclenum = new JTextField();
		undercovervehiclenum.setBackground(new Color(221, 160, 221));
		undercovervehiclenum.setVisible(false);
		undercovervehiclenum.setBounds(915, 98, 20, 20);
		PurchaseTrips.add(undercovervehiclenum);
		undercovervehiclenum.setColumns(10);

		
		undercoverclass = new JTextField();
		undercoverclass.setBackground(Color.WHITE);
		undercoverclass.setVisible(false);
		undercoverclass.setBounds(851, 69, 20, 20);
		PurchaseTrips.add(undercoverclass);
		undercoverclass.setColumns(10);
		
		lblDate = new JLabel("Date Of Return :");
		lblDate.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblDate.setBounds(268, 265, 124, 24);
		PurchaseTrips.add(lblDate);
		lblDate.setVisible(false);
		
		
	    comboBoxday = new JComboBox();
		comboBoxday.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxday.setSelectedIndex(0);
		comboBoxday.setBounds(336, 299, 46, 24);
		PurchaseTrips.add(comboBoxday);
		comboBoxday.addActionListener(this);
		
		comboBoxmonth = new JComboBox();
		comboBoxmonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxmonth.setSelectedIndex(0);
		comboBoxmonth.setBounds(278, 299, 46, 24);
		PurchaseTrips.add(comboBoxmonth);
		comboBoxmonth.addActionListener(this);
		
		comboBoxyear = new JComboBox();
		comboBoxyear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028"}));
		comboBoxyear.setSelectedIndex(0);
		comboBoxyear.setBounds(394, 299, 63, 24);
		PurchaseTrips.add(comboBoxyear);
		comboBoxyear.addActionListener(this);
		comboBoxyear.setVisible(false);
		
	    lblTime = new JLabel("PickUp Time :");
		lblTime.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblTime.setBounds(486, 302, 99, 22);
		PurchaseTrips.add(lblTime);
		lblTime.setVisible(false);
		
		comboBoxhour = new JComboBox();
		comboBoxhour.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxhour.setSelectedIndex(0);
		comboBoxhour.setBounds(609, 301, 46, 24);
		PurchaseTrips.add(comboBoxhour);
		comboBoxhour.setVisible(false);
		comboBoxhour.addActionListener(this);
		
		comboBoxminute = new JComboBox();
		comboBoxminute.setModel(new DefaultComboBoxModel(new String[] {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		comboBoxminute.setSelectedIndex(0);
		comboBoxminute.setBounds(679, 299, 46, 24);
		PurchaseTrips.add(comboBoxminute);
		comboBoxminute.setVisible(false);
		comboBoxminute.addActionListener(this);

		comboBoxtime = new JComboBox();
		comboBoxtime.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBoxtime.setSelectedIndex(0);
		comboBoxtime.setBounds(749, 299, 46, 24);
		PurchaseTrips.add(comboBoxtime);
		comboBoxtime.addActionListener(this);
		comboBoxtime.setVisible(false);

		undercoverday = new JTextField();
		undercoverday.setBackground(Color.WHITE);
		undercoverday.setVisible(false);
		undercoverday.setBounds(850, 98, 20, 20);
		PurchaseTrips.add(undercoverday);
		undercoverday.setColumns(10);
		
		undercovertime = new JTextField();
		undercovertime.setBackground(new Color(221, 160, 221));
		undercovertime.setVisible(false);
		undercovertime.setBounds(915, 129, 20, 20);
		PurchaseTrips.add(undercovertime);
		undercovertime.setColumns(10);
		
		undercovermonth = new JTextField();
		undercovermonth.setBackground(new Color(221, 160, 221));
		undercovermonth.setVisible(false);
		undercovermonth.setBounds(884, 129, 19, 20);
		PurchaseTrips.add(undercovermonth);
		undercovermonth.setColumns(10);
		
		undercoveryear = new JTextField();
		undercoveryear.setBackground(new Color(221, 160, 221));
		undercoveryear.setVisible(false);
		undercoveryear.setBounds(850, 131, 20, 20);
		PurchaseTrips.add(undercoveryear);
		undercoveryear.setColumns(10);
		
		undercoverhour = new JTextField();
		undercoverhour.setBackground(Color.WHITE);
		undercoverhour.setVisible(false);
		undercoverhour.setBounds(947, 69, 20, 20);
		PurchaseTrips.add(undercoverhour);
		undercoverhour.setColumns(10);
		
		undercoverminute = new JTextField();
		undercoverminute.setBackground(new Color(221, 160, 221));
		undercoverminute.setVisible(false);
		undercoverminute.setBounds(947, 98, 20, 20);
		PurchaseTrips.add(undercoverminute);
		undercoverminute.setColumns(10);
		
		lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblLastName.setBounds(0, 108, 103, 23);
		PurchaseTrips.add(lblLastName);
		
		lastName = new JTextField();
		lastName.setBounds(99, 112, 131, 29);
		PurchaseTrips.add(lastName);
		lastName.setColumns(10);
		
		JButton btnCalculatePrice = new JButton("Calculate Price");
		btnCalculatePrice.setBackground(new Color(255, 250, 250));
		btnCalculatePrice.addActionListener(new ActionListener() {
			int flag=0;
			public void actionPerformed(ActionEvent e) {
				switch(undercoverticket.getText())
				{
			    	case "Single Ticket" :
			    	{
			    		flag=1;
			    		switch(undercovervehicle.getText())
			    		{
			    	    	case "Car" :
			    	    	{
			    	    		mark = Double.parseDouble(UnderCover.getText()) + 200 ;
			    	    		textField_5.setText(Double.toString(mark));
			    	    		switch(undercovercarbrand.getText())
			    	    		{
			    	    		case "Mercedes" :
			    	    		case "BMW" :
			    	    		{
			    	    			fees = mark*1.4 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		case "Renault" :
			    	    		case "Geely" :
			    	    		{
			    	    			fees = mark*1.2 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		case "Hyundai" :
			    	    		case "Toyota" :
			    	    		{
			    	    			fees = mark*1.1 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		}
			    	    	}break;
			    		    case "Bus" :
			    		    {
			    		    	mark = Double.parseDouble(UnderCover.getText());
			    		    	textField_5.setText(Double.toString(mark));
			    		    	switch(undercoverclass.getText())
			    		    	{
			    		    	case "First Class":
			    		    	{
			    		    		fees = mark*1.5 ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Bussiness Class" :
			    		    	{
			    		    		fees = mark*1.2 ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Economic Class" :
			    		    	{
			    		    		fees = mark ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		 
			    		    	}
			    		    }break;
			    		    case "Mini-Bus" :
			    		    {
			    		    	mark = Double.parseDouble(UnderCover.getText());
			    		    	textField_5.setText(Double.toString(mark));
			    		    	switch(undercoverclass.getText())
			    		    	{
			    		    	case "First Class":
			    		    	{
			    		    		fees = mark*1.5 ;		    
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Bussiness Class" :
			    		    	{
			    		    		fees = mark*1.2 ;
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Economic Class" :
			    		    	{
			    		    		fees = mark ;
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		 
			    		    	}
			    		    	
			    		    }break;
			    		}
			    	}break;
				    case "Round Ticket"  :
				    { 
				    	flag =1;
				    	Double price = (Double.parseDouble(UnderCover.getText())*2)/1.2 ;
				    	switch(undercovervehicle.getText())
			    		{
			    	    	case "Car" :
			    	    	{
			    	    		mark = price + 200 ;
			    	    		textField_5.setText(Double.toString(mark));
			    	    		switch(undercovercarbrand.getText())
			    	    		{
			    	    		case "Mercedes" :
			    	    		case "BMW" :
			    	    		{
			    	    			fees = mark*1.4 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		case "Renault" :
			    	    		case "Geely" :
			    	    		{
			    	    			fees = mark*1.2 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		case "Hyundai" :
			    	    		case "Toyota" :
			    	    		{
			    	    			fees = mark*1.1 ;
			    	    			textField_5.setText(Double.toString(fees));
			    	    		}break;
			    	    		}
			    	    	}break;
			    		    case "Bus" :
			    		    {
			    		    	mark = price ;
			    		    	textField_5.setText(Double.toString(mark));
			    		    	switch(undercoverclass.getText())
			    		    	{
			    		    	case "First Class":
			    		    	{
			    		    		fees = mark*1.5 ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Bussiness Class" :
			    		    	{
			    		    		fees = mark*1.2 ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Economic Class" :
			    		    	{
			    		    		fees = mark ;			    		    		
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		 
			    		    	}
			    		    }break;
			    		    case "Mini-Bus" :
			    		    {
			    		    	mark = price;
			    		    	textField_5.setText(Double.toString(mark));
			    		    	switch(undercoverclass.getText())
			    		    	{
			    		    	case "First Class":
			    		    	{
			    		    		fees = mark*1.5 ;		    
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Bussiness Class" :
			    		    	{
			    		    		fees = mark*1.2 ;
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		    	case "Economic Class" :
			    		    	{
			    		    		fees = mark ;
			    		    		textField_5.setText(Double.toString(fees));
			    		    	}break;
			    		 
			    		    	}
			    		    	
			    		    }break;
			    		}
				    }break;
				}
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null,
							   "Check your informations",
							   "An Error Has Occurred",
							    JOptionPane.WARNING_MESSAGE); 
					
				}
			}
		});
		btnCalculatePrice.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 15));
		btnCalculatePrice.setBounds(764, 238, 226, 37);
		PurchaseTrips.add(btnCalculatePrice);
		
		lblprice = new JLabel("/ Seat");
		lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblprice.setBounds(945, 292, 57, 37);
		PurchaseTrips.add(lblprice);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(".\\src\\Get Ready.jpg"));
		label_2.setBounds(-96, -221, 3894, 960);
		PurchaseTrips.add(label_2);
		
		receipt = new JPanel();
		receipt.setBackground(Color.WHITE);
		frame.getContentPane().add(receipt, "name_386694367025336");
		receipt.setLayout(null);
		JLabel lblReservationSuccessful = new JLabel("Reservation Successful !");
		lblReservationSuccessful.setForeground(Color.BLACK);
		lblReservationSuccessful.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblReservationSuccessful.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservationSuccessful.setBounds(649, 42, 278, 65);
		receipt.add(lblReservationSuccessful);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(".\\src\\bag.jpg"));
		label_7.setBounds(476, 42, 514, 689);
		receipt.add(label_7);
		
		JButton btnBackToMainmenu = new JButton("Back To MainMenu");
		btnBackToMainmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPanel.setVisible(true);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
				
			}
		});
		btnBackToMainmenu.setBackground(new Color(153, 255, 204));
		btnBackToMainmenu.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnBackToMainmenu.setBounds(62, 137, 402, 85);
		receipt.add(btnBackToMainmenu);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(153, 255, 204));
		btnExit.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnExit.setBounds(62, 408, 402, 85);
		receipt.add(btnExit);
		
		PassengersList = new JPanel();
		PassengersList.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(PassengersList, "name_475640755615250");
		PassengersList.setLayout(null);
		
		List = new JTextArea();
		List.setAlignmentX(Component.RIGHT_ALIGNMENT);
		List.setFont(new Font("Rockwell", Font.PLAIN, 17));
		List.setBounds(219, 13, 771, 224);
		PassengersList.add(List);
		List.setColumns(10);
		
		lblPassengersList = new JLabel("Passengers List");
		lblPassengersList.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassengersList.setFont(new Font("Rockwell", Font.PLAIN, 26));
		lblPassengersList.setBounds(10, 6, 216, 45);
		PassengersList.add(lblPassengersList);
		
		btnNewButton_8 = new JButton("Back");
		btnNewButton_8.setBackground(new Color(255, 250, 250));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(true);
				UpdatePrice.setVisible(false);
			}
		});
		btnNewButton_8.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_8.setBounds(0, 568, 103, 37);
		PassengersList.add(btnNewButton_8);
		
		label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(".\\src\\air-travel.jpg"));
		label_10.setBounds(115, 244, 1061, 477);
		PassengersList.add(label_10);
		
		ListOptions = new JPanel();
		ListOptions.setBackground(Color.WHITE);
		frame.getContentPane().add(ListOptions, "name_476334711253883");
		ListOptions.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Bus Passengers");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(true);
				
		        vehicle = 1;
			}
		});
		btnNewButton_3.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_3.setBounds(12, 160, 321, 64);
		ListOptions.add(btnNewButton_3);
		
		JButton btnMinibusPassengers = new JButton("Mini-Bus Passengers");
		btnMinibusPassengers.setBackground(Color.WHITE);
		btnMinibusPassengers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(true);
				vehicle = 2;
			}
		});
		btnMinibusPassengers.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnMinibusPassengers.setBounds(12, 13, 321, 64);
		ListOptions.add(btnMinibusPassengers);
		
		JButton btnNewButton_4 = new JButton("Car Passengers");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(true);
				vehicle = 3;
				
			}
		});
		btnNewButton_4.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_4.setBounds(12, 90, 321, 64);
		ListOptions.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
			}
		});
		btnNewButton_5.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_5.setBounds(786, 24, 137, 42);
		ListOptions.add(btnNewButton_5);
		
		label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(".\\src\\PaperLists.jpg"));
		label_11.setBounds(-30, -276, 1108, 918);
		ListOptions.add(label_11);
		
		EnterList = new JPanel();
		EnterList.setBackground(Color.WHITE);
		frame.getContentPane().add(EnterList, "name_477039141832472");
		EnterList.setLayout(null);
		
		lblNewLabel = new JLabel("Enter Vehicle Number :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblNewLabel.setBounds(25, 24, 282, 46);
		EnterList.add(lblNewLabel);
		
		vehicleno = new JTextField();
		vehicleno.setBackground(Color.LIGHT_GRAY);
		vehicleno.setBounds(333, 36, 254, 31);
		EnterList.add(vehicleno);
		vehicleno.setColumns(10);
		
		btnGo = new JButton("View");
		btnGo.setBackground(new Color(255, 250, 250));
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(false);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(true);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
				file.Read_File_ToReservations();
				int flag =0;
				switch(vehicle)
				 {
				
				   case 1 :
				  {
					  List.setText(null);
					  for(int k =0 ; k<file.sizereserve ; k++)
					{
						if(vehicleno.getText().matches(reservations[k].vehicleNum) && reservations[k].vehicle.matches("Bus"))
					   {
							flag=0;
						  List.append(reservations[k].Client + " " + reservations[k].phoneNum);
						  break;
					   }
						else
							flag=1;
				    }
				  }break;
				  case 2 :
				  {  
					  List.setText(null);
					  for(int k =0 ; k<file.sizereserve ; k++)
					{
						  
						if(vehicleno.getText().matches(reservations[k].vehicleNum) && reservations[k].vehicle.matches("Mini-Bus"))
					   {
							flag=0;
						  List.append(reservations[k].Client + " " + reservations[k].phoneNum);
						  break;
					   }
						else 
							flag=1;
				    }
				  }break ;
				  case 3 :
				  {
					  List.setText(null);  
					  for(int k =0 ; k<file.sizereserve ; k++)
					  { 
						  if(vehicleno.getText().matches(reservations[k].vehicleNum) && reservations[k].vehicle.matches("Car"))
						{
							  flag=0;
							List.append(reservations[k].Client + "-" + reservations[k].phoneNum + "-" + reservations[k].destination + "\n");
							break;
						}
						  else
							  flag =1;
						 
					  }
				  }break;
				  
				}
				if(flag==1)
					{
						JOptionPane.showMessageDialog(null,
								   "Wrong Vehicle",
								   "An Error Has Occurred",
								    JOptionPane.WARNING_MESSAGE); 
						FirstPanel.setVisible(false);
						Manager.setVisible(false);
						NewTrip.setVisible(false);
						PasswordPanel.setVisible(false);
						PasswordChange.setVisible(false);
						PassengersList.setVisible(false);
						MrCustomer.setVisible(false);
						receipt.setVisible(false);
						PurchaseTrips.setVisible(false);
						ListOptions.setVisible(true);
						EnterList.setVisible(false);
					}
				
			}
		});
		btnGo.setFont(new Font("Rockwell", Font.PLAIN, 17));
		btnGo.setBounds(630, 30, 178, 38);
		EnterList.add(btnGo);
		
		btnNewButton_7 = new JButton("Back");
		btnNewButton_7.setBackground(new Color(255, 250, 250));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThePassword.setText("");
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
			}
		});
		btnNewButton_7.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_7.setBounds(872, 591, 118, 38);
		EnterList.add(btnNewButton_7);
		
		label_9 = new JLabel("");
		label_9.setBounds(35, 87, 696, 46);
		EnterList.add(label_9);
		
		label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(".\\src\\ListOfVehicles.jpg"));
		label_12.setBounds(0, 217, 990, 425);
		EnterList.add(label_12);
		
		
		
		JLabel lblEnterTripDestination = new JLabel("Enter Trip Destination");
		lblEnterTripDestination.setForeground(new Color(255, 255, 255));
		lblEnterTripDestination.setBackground(new Color(255, 255, 255));
		lblEnterTripDestination.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		lblEnterTripDestination.setBounds(12, 381, 248, 69);
		UpdatePrice.add(lblEnterTripDestination);
		
		tripDestinationField = new JTextField();
		tripDestinationField.setBounds(240, 397, 153, 40);
		UpdatePrice.add(tripDestinationField);
		tripDestinationField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag =0;
				file.Read_File_ToExTrips();
				file.Read_File_ToIntTrips();
				for(updatePriceIndex=0; updatePriceIndex<file.sizeEx; updatePriceIndex++)
				{
					if(tripDestinationField.getText().matches(extrips[updatePriceIndex].destination))
					{
						flag++;
						tripNameField.setText(extrips[updatePriceIndex].destination);
						tripPriceField.setText(Double.toString(extrips[updatePriceIndex].price));
						exTripsFlag = true;
						inTripsFlag = false;
					}
					else if(tripDestinationField.getText().matches(intrips[updatePriceIndex].destination))
					{
						flag++;
						tripNameField.setText(intrips[updatePriceIndex].destination);
						tripPriceField.setText(Double.toString(intrips[updatePriceIndex].price));
						exTripsFlag = false;
						inTripsFlag = true;
					}
				}
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null,
							   "Wrong Destination",
							   "An Error Has Occurred",
							    JOptionPane.WARNING_MESSAGE); 
					tripDestinationField.setText("");
					
				}
				else
				{
					tripNameField.setVisible(true);
					tripPriceField.setVisible(true);
					lblNewLabel_1.setVisible(true);
					newPriceField.setVisible(true);
					btnNewButton_10.setVisible(true);
					file.Read_File_ToExTrips();
					file.Read_File_ToIntTrips();
				}
				
				
			}
		});
		btnEnter.setBounds(425, 391, 90, 52);
		UpdatePrice.add(btnEnter);
		
		tripNameField = new JTextField();
		tripNameField.setEditable(false);
		tripNameField.setFont(new Font("Rockwell", Font.PLAIN, 13));
		tripNameField.setBounds(22, 449, 129, 40);
		UpdatePrice.add(tripNameField);
		tripNameField.setColumns(10);
		tripNameField.setVisible(false);
		tripPriceField = new JTextField();
		tripPriceField.setFont(new Font("Rockwell", Font.PLAIN, 12));
		tripPriceField.setEnabled(true);
		tripPriceField.setEditable(false);
		tripPriceField.setText("");
		tripPriceField.setBounds(239, 450, 129, 40);
		tripPriceField.setVisible(false);
		UpdatePrice.add(tripPriceField);
		tripPriceField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Enter New Price");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		lblNewLabel_1.setBounds(573, 406, 205, 18);
		UpdatePrice.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		newPriceField = new JTextField();
		newPriceField.setBounds(778, 403, 147, 28);
		UpdatePrice.add(newPriceField);
		newPriceField.setColumns(10);
		newPriceField.setVisible(false);
		btnNewButton_10 = new JButton("Update");
		btnNewButton_10.setVisible(false);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(exTripsFlag == true)
				{
					double f = Double.parseDouble(newPriceField.getText()) ;
					file.Read_File_ToExTrips();
					for(int l=0 ; l<file.sizeEx ; l++)
					{
						if(extrips[l].destination.matches(tripNameField.getText()))
						{
							extrips[l].price = f ;
							file.writeToExTrips(extrips);
						}
						
				    }
					
					lblUpdateSuccessful.setVisible(true);
					
				}
				else if(inTripsFlag == true)
				{
					double f = Double.parseDouble(newPriceField.getText()) ;
					file.Read_File_ToIntTrips();
					for(int l=0 ; l<file.sizeIn ; l++)
					{
						if(intrips[l].destination.matches(tripNameField.getText()))
						{
							intrips[l].price = f ;
							file.writeToInTrips(intrips);;
						}
						
				    }
					
					lblUpdateSuccessful.setVisible(true);
				}
			}
		});
		btnNewButton_10.setFont(new Font("Stencil", Font.BOLD, 16));
		btnNewButton_10.setBounds(871, 560, 119, 69);
		UpdatePrice.add(btnNewButton_10);
		
		lblUpdateSuccessful = new JLabel("Update Successful!");
		lblUpdateSuccessful.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateSuccessful.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		lblUpdateSuccessful.setBounds(215, 513, 153, 40);
		lblUpdateSuccessful.setVisible(false);
		UpdatePrice.add(lblUpdateSuccessful);
		
		backButtonPrice = new JButton("Back");
		backButtonPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FirstPanel.setVisible(false);
				Manager.setVisible(true);
				NewTrip.setVisible(false);
				PasswordPanel.setVisible(false);
				PasswordChange.setVisible(false);
				PassengersList.setVisible(false);
				MrCustomer.setVisible(false);
				receipt.setVisible(false);
				PurchaseTrips.setVisible(false);
				ListOptions.setVisible(false);
				EnterList.setVisible(false);
				UpdatePrice.setVisible(false);
			}
		});
		backButtonPrice.setFont(new Font("Stencil", Font.BOLD, 16));
		backButtonPrice.setBounds(12, 559, 119, 69);
		UpdatePrice.add(backButtonPrice);
		
		label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(".\\src\\Money.jpg"));
		label_8.setBounds(0, -38, 949, 553);
		UpdatePrice.add(label_8);
		
		checkInPanel = new JPanel();
		checkInPanel.setBackground(new Color(221, 160, 221));
		frame.getContentPane().add(checkInPanel, "name_534614692844504");
		checkInPanel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Which vehicle would you like to check in?");
		lblNewLabel_2.setBounds(22, 28, 579, 51);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Minion Pro Med", Font.BOLD, 21));
		checkInPanel.add(lblNewLabel_2);
		
		btnCar = new JButton("Car");
		btnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblEnterCarName.setVisible(true);
				textField.setVisible(true);
				btnEnter_1.setVisible(true);
			
			}
		});
		btnCar.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnCar.setBounds(231, 102, 140, 51);
		checkInPanel.add(btnCar);
		
		btnBus = new JButton("Bus");
		btnBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_11.setVisible(true);
				lblEnterBusNumber.setVisible(true);
				textField_1.setVisible(true);
			}
		});
		btnBus.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnBus.setBounds(231, 227, 140, 51);
		checkInPanel.add(btnBus);
		
		btnMinibus = new JButton("Minibus");
		btnMinibus.setBackground(new Color(255, 250, 250));
		btnMinibus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_12.setVisible(true);
				lblEnterMinibusNumber.setVisible(true);
				textField_4.setVisible(true);
			}
		});
		btnMinibus.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnMinibus.setBounds(231, 355, 140, 51);
		checkInPanel.add(btnMinibus);
		
		lblEnterCarName = new JLabel("Enter Car Name:");
		lblEnterCarName.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblEnterCarName.setBounds(458, 82, 143, 18);
		lblEnterCarName.setVisible(false);
		checkInPanel.add(lblEnterCarName);
		
		textField = new JTextField();
		textField.setBounds(511, 113, 131, 30);
		textField.setVisible(false);
		checkInPanel.add(textField);
		textField.setColumns(10);
		
		btnEnter_1 = new JButton("Enter");
		btnEnter_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnEnter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean carFoundFlag = false;
				for(int i =0; i<file.sizeCars; i++)
				{
					System.out.println(file.sizeCars);
					if(textField.getText().equals(cars[i].name))
					{
						cars[i].numberOfVehicles++;
						carFoundFlag = true; 
						file.writeToCars(cars);
					}
						
				}
				if (carFoundFlag == true)
					lblCheckInSuccessful.setVisible(true);
				else
				{
					lblCarNotFound.setVisible(true);
				}
			}
		});
		btnEnter_1.setBounds(697, 112, 252, 30);
		btnEnter_1.setVisible(false);
		checkInPanel.add(btnEnter_1);
		
		lblCheckInSuccessful = new JLabel("Check In Successful!");
		lblCheckInSuccessful.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblCheckInSuccessful.setBounds(12, 154, 198, 51);
		lblCheckInSuccessful.setVisible(false);
		checkInPanel.add(lblCheckInSuccessful);
		
		lblEnterBusNumber = new JLabel("Enter Bus Number:");
		lblEnterBusNumber.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblEnterBusNumber.setBounds(458, 215, 172, 18);
		lblEnterBusNumber.setVisible(false);
		checkInPanel.add(lblEnterBusNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(511, 248, 131, 30);
		checkInPanel.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		btnNewButton_11 = new JButton("Enter");
		btnNewButton_11.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean carFoundFlag = false;
				for(int i =0; i<file.size; i++)
				{
					System.out.println(file.size);
					if(Double.parseDouble(textField_1.getText()) == buses[i].vehicleNumber)
					{
						buses[i].numberOfSeats = buses[i].maxSeats;
						carFoundFlag = true; 
						file.writeToBus(buses);
					}
						
				}
				if (carFoundFlag == true)
					lblCheckInSuccessful.setVisible(true);
				else
				{
					lblCarNotFound.setVisible(true);
				}
			}
		});
		btnNewButton_11.setBounds(697, 239, 252, 27);
		checkInPanel.add(btnNewButton_11);
		
		lblEnterMinibusNumber = new JLabel("Enter Minibus Number:");
		lblEnterMinibusNumber.setFont(new Font("Segoe UI Emoji", Font.BOLD, 17));
		lblEnterMinibusNumber.setBounds(458, 339, 208, 30);
		lblEnterMinibusNumber.setVisible(false);
		checkInPanel.add(lblEnterMinibusNumber);
		
		textField_4 = new JTextField();
		textField_4.setBounds(511, 376, 131, 30);
		textField_4.setVisible(false);
		checkInPanel.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton_12 = new JButton("Enter");
		btnNewButton_12.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnNewButton_12.setBackground(new Color(255, 250, 250));
		btnNewButton_12.setVisible(false);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean carFoundFlag = false;
				for(int i =0; i<file.sizeMiniBus; i++)
				{
					if(Double.parseDouble(textField_4.getText()) == miniBus[i].vehicleNumber)
					{
						
						miniBus[i].numberOfSeats = miniBus[i].maxSeats;
						carFoundFlag = true; 
						file.writeToMinibus(miniBus);
					}
						
				}
				if (carFoundFlag == true)
					lblCheckInSuccessful.setVisible(true);
				else
				{
					lblCarNotFound.setVisible(true);
				}
			}
		});
		btnNewButton_12.setBounds(697, 375, 252, 30);
		checkInPanel.add(btnNewButton_12);
		
		lblCarNotFound = new JLabel("Car Not Found! Try Again?");
		lblCarNotFound.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblCarNotFound.setBounds(0, 231, 277, 42);
		lblCarNotFound.setVisible(false);
		checkInPanel.add(lblCarNotFound);
		
		btnBackToMain_1 = new JButton("Back To Main Menu");
		btnBackToMain_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		btnBackToMain_1.setBackground(new Color(255, 250, 250));
		btnBackToMain_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FirstPanel.setVisible(true);
				checkInPanel.setVisible(false);
			}
		});
		btnBackToMain_1.setBounds(22, 548, 236, 81);
		checkInPanel.add(btnBackToMain_1);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(".\\src\\29681061_577421442638490_83333570_o.jpg"));
		label_5.setBounds(-92, -91, 1289, 762);
		checkInPanel.add(label_5);
		btnNewButton_11.setVisible(false);
		comboBoxtime.setVisible(true);
	}
	public void actionPerformed(ActionEvent en) {
		if(en.getSource() == comboBox)
		{
			JComboBox d = (JComboBox)en.getSource();
       	    String dir  = (String)d.getSelectedItem();
            switch(dir)
            {
               case"Bus": 
               { 
   	    		     lblprice.setVisible(true);
            	     comboBoxvehiclenum.setVisible(true);
                	 textField_3.setVisible(true);
                	 lblAvailableSeats.setVisible(true);
                	 lblVehicleNo.setVisible(true);
                	 comboBoxCarType.setVisible(false);
                	 lblPreferedCar.setVisible(false);
                	 lblPreferedClass.setVisible(true);
                	 comboBoxClass.setVisible(true);
                	 lblNumberOfSeats.setVisible(true);
                	 textFieldseats.setVisible(true);
               
               	     lblTime.setVisible(false);
             	     comboBoxhour.setVisible(false);
             	     comboBoxminute.setVisible(false);
             	     comboBoxtime.setVisible(false);
             	  

              	     undercovervehicle.setText("Bus");
              	     System.out.println(undercovervehicle.getText());

               }break;
               case"Mini-Bus": 
               {
   	    		   lblprice.setVisible(true);
            	   comboBoxvehiclenum.setVisible(true);
                	 textField_3.setVisible(true);
                	 lblAvailableSeats.setVisible(true);
                	 lblVehicleNo.setVisible(true);
                	 comboBoxCarType.setVisible(false);
                	 lblPreferedCar.setVisible(false);
                	 lblPreferedClass.setVisible(true);
                	 comboBoxClass.setVisible(true);
                	 lblNumberOfSeats.setVisible(true);
                	 textFieldseats.setVisible(true);
                     undercovercarbrand.setText(null);
              	     undercovervehicle.setText("Mini-Bus");
              	
              	    lblTime.setVisible(false);
            	     comboBoxhour.setVisible(false);
            	     comboBoxminute.setVisible(false);
            	     comboBoxtime.setVisible(false);
            	    
              	     System.out.println(undercovervehicle.getText());
               }break;
               case"Car": 
               {
   	    		     lblprice.setVisible(false);
            	     comboBoxvehiclenum.setVisible(false);
            	   
                	 textField_3.setVisible(false);
                	 lblAvailableSeats.setVisible(false);
                	 lblVehicleNo.setVisible(false);
                	 comboBoxCarType.setVisible(true);
                	 lblPreferedCar.setVisible(true);
                	 lblPreferedClass.setVisible(false);
                	 comboBoxClass.setVisible(false);
                	 lblNumberOfSeats.setVisible(false);
                	 textFieldseats.setVisible(false);
                     undercovervehiclenum.setText(null);
                     undercoverclass.setText(null);
              	     undercovervehicle.setText("Car");
              	     lblTime.setVisible(true);
              	    
              	     comboBoxhour.setVisible(true);
              	     comboBoxminute.setVisible(true);
              	     comboBoxtime.setVisible(true);

              	     
              	     System.out.println(undercovervehicle.getText());

               }break;
            }
		}
		
		
		else if (en.getSource() == comboBoxvehiclenum)
		 {
			 JComboBox cg = (JComboBox)en.getSource();
			 String msgg = (String)cg.getSelectedItem();
			 String x = (String)comboBox.getSelectedItem();
		switch(x)	{
		
		   case "Bus" :
		       {	 switch(msgg)
		    	   {
		             case "1" :
   	        	     {   undercovervehiclenum.setText("1");
   	        	    	 System.out.println(undercovervehiclenum.getText());
   	        	         textField_3.setText(Integer.toString(buses[0].numberOfSeats));
   	        	     }
   	        	     break;
               	 case "2" :
   	         	     {
   	         	         undercovervehiclenum.setText("2");
	        	    	 System.out.println(undercovervehiclenum.getText());
   		                 textField_3.setText(Integer.toString(buses[1].numberOfSeats));
   	         	     }
   		             break;
   	             case "3" :
   	                 {
   	                	 undercovervehiclenum.setText("3");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[2].numberOfSeats));
   	                 }
   	         	     break; 
                    case "4" :
                   	 {
                   		 undercovervehiclenum.setText("4");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[3].numberOfSeats));
                   	 }
       	             break;
                    case "5" :
                   	 {
                   		 undercovervehiclenum.setText("5");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[4].numberOfSeats)); 
                   	 }
       		         break;
                    case "6" :
                   	 {
                   		 undercovervehiclenum.setText("6");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[5].numberOfSeats));                	
                   	 }
       		         break;
                    case "7" :
                   	 {
                   		 undercovervehiclenum.setText("7");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[6].numberOfSeats)); 
                   	 }
       		         break;
                    case "8" :
                   	 {
                   		 undercovervehiclenum.setText("8");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[7].numberOfSeats)); 
                   	 }
       		         break;
                    case "9" :
                   	 {
                   		 undercovervehiclenum.setText("9");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[8].numberOfSeats));   
                   	 }               
       		         break;
                    case "10" :
                   	 {
                   		 undercovervehiclenum.setText("10");
  	        	    	 System.out.println(undercovervehiclenum.getText());
       		             textField_3.setText(Integer.toString(buses[9].numberOfSeats));
                   	 }
       		         break;
		    	   } break ;
		       }
		   case "Mini-Bus" :
	       {	 switch(msgg)
	    	   {
	    	  case "1" :
	        	     {   undercovervehiclenum.setText("1");
	        	    	 System.out.println(undercovervehiclenum.getText());
	        	         textField_3.setText(Integer.toString(miniBus[0].numberOfSeats));
	        	     }
	        	     break;
         	  case "2" :
	         	     {
	         	         undercovervehiclenum.setText("2");
      	    	         System.out.println(undercovervehiclenum.getText());
		                 textField_3.setText(Integer.toString(miniBus[1].numberOfSeats));
	         	     }
		             break;
	          case "3" :
	                 {
	                	 undercovervehiclenum.setText("3");
        	         	 System.out.println(undercovervehiclenum.getText());
 		                 textField_3.setText(Integer.toString(miniBus[2].numberOfSeats));
	                 }
	         	     break; 
              case "4" :
                 	 {
             		      undercovervehiclenum.setText("4");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[3].numberOfSeats));
                	 }
 	             break;
              case "5" :
             	    {
             		      undercovervehiclenum.setText("5");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[4].numberOfSeats)); 
             	    }
 		         break;
              case "6" :
             	    {
             		      undercovervehiclenum.setText("6");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[5].numberOfSeats));                	
             	    }
 		         break;
              case "7" :
             	    {
             		      undercovervehiclenum.setText("7");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[6].numberOfSeats)); 
             	    }
 		         break;
              case "8" :
             	 {
             		      undercovervehiclenum.setText("8");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[7].numberOfSeats)); 
             	 }
 		         break;
              case "9" :
             	 {
             		      undercovervehiclenum.setText("9");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[8].numberOfSeats));   
             	 }               
 		         break;
              case "10" :
             	 {
             		      undercovervehiclenum.setText("10");
        	    	      System.out.println(undercovervehiclenum.getText());
 		                  textField_3.setText(Integer.toString(miniBus[9].numberOfSeats));
             	 }
 		         break;
	    	   } 
	            	  
		    }break;
		   case "Car" :
		   {
			    System.out.println("loser");
				comboBoxClass.setVisible(false);
                
		   }break;
	   }
	}

		else if(en.getSource() == comboBoxClass)
			
        {
      	         JComboBox b = (JComboBox)en.getSource();
            	 String m = (String)b.getSelectedItem();
      	 switch(m)
      	 {
               case "First Class" :
                {    
                	undercoverclass.setText("First Class");
 	    	        System.out.println(undercoverclass.getText());
          	    }
          	     break;
               case "Bussiness Class" :
                {    
                	undercoverclass.setText("Bussiness Class");
 	    	        System.out.println(undercoverclass.getText());
              	 }
          	     break;
               case "Economic Class" :
              	 { 
              		undercoverclass.setText("Economic Class");
     	    	    System.out.println(undercoverclass.getText());
               	 }
              	 break;
          	 
       	 }
       }
		
	else if(en.getSource() == comboBoxCarType)
		
  {
	         JComboBox b = (JComboBox)en.getSource();
	         String car = (String)b.getSelectedItem();
     	 switch(car)
	    {
           case "Mercedes" :
    	      {
    	    	   undercovercarbrand.setText("Mercedes");
    	    	   System.out.println(undercovercarbrand.getText());
    	      
              }  break;
        
           case "Hyundai" :
              {
            	  undercovercarbrand.setText("Hyundai");
   	    	      System.out.println(undercovercarbrand.getText());

              }break;
         
           case "BMW" :
              { 
            	  undercovercarbrand.setText("BMW");
   	    	      System.out.println(undercovercarbrand.getText());
              }
        	 break;
           case "Toyota" :
      	     {
      	    	 undercovercarbrand.setText("Toyota");
 	    	     System.out.println(undercovercarbrand.getText());
      	     }
      	    break;
           case "Renault" :
             { 
            	 undercovercarbrand.setText("Renault");
  	    	   System.out.println(undercovercarbrand.getText());
             }
      	   break;
           case "Geely" :
             { 
            	 undercovercarbrand.setText("Geely");
  	    	     System.out.println(undercovercarbrand.getText());

             }break;
    	 
 	  }
    }
	 else if (en.getSource() == comboBoxday)
	 {
		 JComboBox td = (JComboBox)en.getSource();
         String day = (String)td.getSelectedItem();
         Day = (String)comboBoxday.getSelectedItem();
         undercoverday.setText(day);
         System.out.println(Day);

	 }
		
	 else if (en.getSource() == comboBoxmonth)
	 {
		 JComboBox tm = (JComboBox)en.getSource();
         String m = (String)tm.getSelectedItem();
         month = (String)comboBoxmonth.getSelectedItem();
         undercovermonth.setText(month);
         System.out.println(month);
	 }
		
	 else if (en.getSource() == comboBoxyear)
	 {
		 JComboBox ty = (JComboBox)en.getSource();
         String y = (String)ty.getSelectedItem();
         year = (String)comboBoxyear.getSelectedItem();
         undercoveryear.setText(y);
         System.out.println(year);

	 }
	 else if (en.getSource() == comboBoxhour)
	 {
		 JComboBox th = (JComboBox)en.getSource();
         String h = (String)th.getSelectedItem();
         hour = (String)comboBoxhour.getSelectedItem();
         undercoverhour.setText(h);
         System.out.println(hour);
	 }
	 else if (en.getSource() == comboBoxminute)
	 {
		 JComboBox tm = (JComboBox)en.getSource();
         String y = (String)tm.getSelectedItem();
         minute = (String)comboBoxminute.getSelectedItem();
         undercoverminute.setText(minute);
         System.out.println(minute);
	 }
	 else if (en.getSource() == comboBoxtime)
	 {
		 JComboBox tt = (JComboBox)en.getSource();
         String t = (String)tt.getSelectedItem();
         time = (String)comboBoxtime.getSelectedItem();
         undercovertime.setText(time); ;
         System.out.println(time);
	 }
  }
}

	

