
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


public class GymMembershipFrame extends JFrame {
    
    //Panel
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTranerPnl;
    private JPanel commentsPnl;
    private JPanel membershipPnl;
    private JPanel buttonsPnl;
    private JPanel headingClintCombenedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    
    //Label
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTranerLbl;
    private JLabel contractsTypeLbl;
    
    
    //TextField
    private JTextField nameTxtF;
    private JTextField surnameTxtF;
    private JTextField idNoTxtF;
    
    //ComboBox
    private JComboBox genderComboBox;
    
    ///radioBox
    private JRadioButton MonthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    //CheckBox
    private JCheckBox personalTranerCheckBox;
    
    //button group
    private ButtonGroup BtnGrp;
    
    //TextArea
    private JTextArea commentsTxtA;
    
    //scrollpane
    private JScrollPane scrollableTxtArea;
    
    //Button
    private JButton applyBtn;
    
    
   
    
  public GymMembershipFrame(){
    setTitle("Gym membership");
    setSize(500,550);
    
    
    //creat panel
    headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    clientPnl = new JPanel(new GridLayout(4,1,1,1));
    clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client details"));
    
    namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    personalTranerPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    membershipPnl = new JPanel(new GridLayout(2,1,1,1));
    membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));
    
    commentsPnl  = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    buttonsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    headingClintCombenedPnl = new JPanel(new BorderLayout());
    membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
    mainPnl = new JPanel(new BorderLayout());
    
    //create Label
    headingLbl = new JLabel("Membership Form");
    headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD ,20));
    headingLbl.setForeground(Color.BLUE);
    headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
    
    nameLbl = new JLabel("Name:    ");
    surnameLbl = new JLabel("Surname:    ");
    idNoLbl = new JLabel("id no:    ");
    genderLbl = new JLabel("Gender:     ");
    contractsTypeLbl = new JLabel("Type of contract: ");
    personalTranerLbl = new JLabel("Select the checkbox if you need a personal trainer ");
    
    //create text fiels
    nameTxtF = new JTextField(10);
    surnameTxtF = new JTextField(10);
    idNoTxtF =  new JTextField(10);
    
    
    //create combo box
    genderComboBox = new JComboBox();
    genderComboBox.addItem("Male");
    genderComboBox.addItem("Female");
    
    //create radio button
    MonthToMonthRadBtn = new JRadioButton("Month-to-month");
    sixMonthsRadBtn = new JRadioButton("Six months");
    annualRadBtn = new JRadioButton("Annual");
    
    //create check box
    personalTranerCheckBox = new JCheckBox();
    
    //create button group
     BtnGrp = new ButtonGroup();
     BtnGrp.add(MonthToMonthRadBtn);
     BtnGrp.add(sixMonthsRadBtn);
     BtnGrp.add(annualRadBtn);
    
    //create text area
    commentsTxtA = new JTextArea(20,40);
    commentsTxtA.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Comments"));
    
    //create scrollpane
    scrollableTxtArea = new JScrollPane(commentsTxtA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    //create button
    applyBtn = new JButton("APPLY");
    
    
    //Add components to the panel
    headingPnl.add(headingLbl);
    
    namePnl.add(nameLbl);
    namePnl.add(nameTxtF);
    
    surnamePnl.add(surnameLbl);
    surnamePnl.add(surnameTxtF);
    
    idNoPnl.add(idNoLbl);
    idNoPnl.add(idNoTxtF);
    
    
    genderPnl.add(genderLbl);
    genderPnl.add( genderComboBox);
   
    clientPnl.add(namePnl);
    clientPnl.add(surnamePnl);
    clientPnl.add(idNoPnl);
    clientPnl.add(genderPnl);
    
    headingClintCombenedPnl.add(headingPnl, BorderLayout.NORTH);
    headingClintCombenedPnl.add(clientPnl, BorderLayout.CENTER);
    
    
    contractsPnl.add(contractsTypeLbl);
    contractsPnl.add(MonthToMonthRadBtn);
    contractsPnl.add(sixMonthsRadBtn);
    contractsPnl.add(annualRadBtn);
    
    personalTranerPnl.add(personalTranerLbl);
    personalTranerPnl.add(personalTranerCheckBox);
    
    membershipPnl.add(contractsPnl);
    membershipPnl.add(personalTranerPnl);
    
    commentsPnl.add(scrollableTxtArea);
    
    membershipCommentsCombinedPnl.add(membershipPnl, BorderLayout.NORTH);
    membershipCommentsCombinedPnl.add(commentsPnl,BorderLayout.CENTER);
    
    buttonsPnl.add(applyBtn);
    
    mainPnl.add(headingClintCombenedPnl, BorderLayout.NORTH);
    mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
    mainPnl.add(buttonsPnl, BorderLayout.SOUTH);
    
    add(mainPnl);
    
    pack();
    setVisible(true);
  }  
    
}
