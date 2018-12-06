import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIconstruction {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Pirex");
		Container contentPane = frame.getContentPane();
		JPanel search, load, summarize, sp1, sp2, sp3, lp1, lp2, lp3, lp4, lp5, panel1, panel2;
		JTabbedPane tabbedPane;
		JMenuBar menuBar;
		JMenu helpMenu, optionsMenu, fileMenu, editMenu, historyMenu, viewMenu;
		JScrollPane scrollpane;
		JMenuItem menuItem; 
		JTextField textField, textField1, textField2, textField3, textField5;
		JTextArea textOfLongFormDisplay, textOfLongFormDisplaySP1, textArea, textArea1;
		JLabel titleLabel, titleLabel2, titleLabel3, titleLabel4, titleLabel1;
		JButton clearButton, processButton, browseButton;

		// Creates and Adds a menu bar to the Pirex Frame
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File"); 
		helpMenu = new JMenu("Help");
		optionsMenu = new JMenu("Options");
		editMenu = new JMenu("Edit");
		historyMenu = new JMenu("History");
		viewMenu = new JMenu("View");

		menuBar.add(fileMenu); 
		menuBar.add(viewMenu);
		menuBar.add(optionsMenu);
		menuBar.add(editMenu);
		menuBar.add(historyMenu);
		menuBar.add(helpMenu);

		// Creates File Menu Item (Exit) 
		JMenuItem exit = new JMenuItem("Exit", KeyEvent.VK_T);
		fileMenu.add(exit);

		// Creates Option Menu Item (Documents)
		JMenuItem optionsMenu11 = new JMenuItem("Documents");
		optionsMenu.add(optionsMenu11);

		frame.setJMenuBar(menuBar);

		// Creates Help Menu Item
		menuItem = new JMenuItem("About", KeyEvent.VK_T);
		helpMenu.add(menuItem);

		// Creates History Menu Item
		JMenuItem historymenu1 = new JMenuItem("Recent Searches", KeyEvent.VK_T);
		historyMenu.add(historymenu1);

		// Creates View Menu Item
		JMenuItem viewmenu1 = new JMenuItem("Zoom", KeyEvent.VK_T);
		viewMenu.add(viewmenu1);

		// Adds Sub Item into View Menu Item
		JMenuItem viewmenu2 = new JMenuItem("Toggle Fullscreen", KeyEvent.VK_T);
		viewMenu.add(viewmenu2);

		// Adds an action listener to the Options Menu Bar Item (Documents) 
		optionsMenu11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This feature is currently unavailable.", "Documents",
						JOptionPane.WARNING_MESSAGE);
			}
		});

		// Adds an action listener to the View Menu Bar Item (Zoom) 
		viewmenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This feature is currently unavailable.", "Zoom",
						JOptionPane.WARNING_MESSAGE);
			}
		});

		// Adds an action listener to the View Menu Bar Item (Toggle Fullscreen) 
		viewmenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This feature is currently unavailable.", "Toggle Fullscreen",
						JOptionPane.WARNING_MESSAGE);
			}
		});

		// Adds an action listener to the History Menu Bar Item (Recent Searches) -
		
		historymenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This feature is currently unavailable.", "Recent Searches",
						JOptionPane.WARNING_MESSAGE);
			}
		});

		// Adds an action listener to the File Menu Bar Item (Exit) 
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Press ALT-F4 (Windows) or вЊ�Q (Mac) to EXIT this application.",
						"Close Application", JOptionPane.WARNING_MESSAGE);
			}
		});

		// Adds an action listener to the Help Menu Item
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Pirex - (Personal Information Retrieval Experimental System) is an information \n retrieval system that individuals can use to investigate their own texts.",
						"About", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// Create the three tabs
		tabbedPane = new JTabbedPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		// Start of search tab
		search = new JPanel();
		search.setLayout(new BorderLayout(3, 10));
		tabbedPane.addTab("Search For Documents", search);

		// first panel in the search tab that has query, textfield and button
		sp1 = new JPanel(new BorderLayout());

		titleLabel = new JLabel();
		titleLabel.setText("Query:");

		textField = new JTextField(600);
		// clear button
		clearButton = new JButton();
		clearButton.setText("Clear");

		sp1.add(titleLabel, BorderLayout.WEST);
		sp1.add(textField, BorderLayout.CENTER);
		sp1.add(clearButton, BorderLayout.EAST);

		search.add(sp1, BorderLayout.NORTH);

		// second panel in the screen tab that has a textarea
		sp2 = new JPanel(new GridLayout());

		JTextArea ta = new JTextArea(10, 65);
		ta.setLineWrap(true);
		sp2.add(new JScrollPane(ta));
		search.add(sp2, BorderLayout.CENTER);

		// third panel in the search that has the scrollbar
		sp3 = new JPanel(new GridLayout(1, 1));
		textOfLongFormDisplay = new JTextArea(10, 64);
		JScrollPane textOfLongFormDisplaySP = new JScrollPane(textOfLongFormDisplay,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp3.add(textOfLongFormDisplaySP, "South");

		search.add(sp3, BorderLayout.SOUTH);

		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textOfLongFormDisplay.setText("");
				ta.setText("");
			}
		});
		// Start of Load Tab
		load = new JPanel();
		load.setLayout(new BorderLayout()); 
		tabbedPane.addTab("Load Documents", load);
		
		// Panel 1. divide into 4 panels
		panel1 = new JPanel(new GridLayout(4, 1));

		lp1 = new JPanel(new BorderLayout()); 
		titleLabel1 = new JLabel();
		titleLabel1.setText("Text File:");

		textField1 = new JTextField(600);

		// browse button
		browseButton = new JButton();
		browseButton.setText("Browse");

		
		lp1.add(titleLabel1, BorderLayout.WEST);
		lp1.add(textField1, BorderLayout.CENTER);
		lp1.add(browseButton, BorderLayout.EAST);

		lp2 = new JPanel(new BorderLayout(1, 5)); // add text file type west), drop menu(center)

		titleLabel2 = new JLabel();
		titleLabel2.setText("Text File Type: ");

		// Panel Dropbox
		String[] fileType = { " ", "", " ", " ", " ", " " };
		JComboBox<String> fileTypeList = new JComboBox<String>(fileType);

		// Panel lp2
		lp2.add(titleLabel2, BorderLayout.WEST);
		lp2.add(fileTypeList, BorderLayout.CENTER);
		//panel lp3
		lp3 = new JPanel(new BorderLayout()); // add title, textfield, author, textfield

		titleLabel3 = new JLabel();
		titleLabel3.setText("Title: ");

		textField2 = new JTextField(600);

		titleLabel4 = new JLabel();
		titleLabel4.setText("Author");

		textField3 = new JTextField(600);

		lp3.add(titleLabel3, BorderLayout.WEST);
		lp3.add(textField2, BorderLayout.CENTER);
		lp3.add(titleLabel4, BorderLayout.EAST);
		// panel lp4
		lp4 = new JPanel(new BorderLayout()); // process button, to west
		processButton = new JButton(); // creates button
		processButton.setText("Process");
		lp4.add(processButton, BorderLayout.WEST); // add this button to the west

		

		// these will add the 4 panels in the panel 1 of load
		panel1.add(lp1);
		panel1.add(lp2);
		panel1.add(lp3);
		panel1.add(lp4);
		load.add(panel1, BorderLayout.NORTH); 
		
		//start of panel 2 that will add the textarea
		panel2 = new JPanel(new BorderLayout());

		lp5 = new JPanel(new BorderLayout()); // add textfield to center
		textArea1 = new JTextArea(800, 200);
		lp5.add(textArea1, BorderLayout.CENTER);
		panel2.add(lp5);
		load.add(panel2, BorderLayout.SOUTH);


		// Creates Summary Tab
		summarize = new JPanel();
		summarize.setLayout(new BorderLayout());

		textArea = new JTextArea(10, 64);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		summarize.add(scrollPane, "Center");
		tabbedPane.add("Summarize Documents", summarize);

		

		// The current frame is set to these
		frame.pack();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);

	}
}
