package address.book;

import java.awt.*;
import javax.swing.*;

public class ContactListGUIMain {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    
    JPanel addpanel = new JPanel(new GridLayout(8,2));
    f.getContentPane().add(addpanel);
    JRadioButton radioButton1=new JRadioButton("주소 있음");
    JRadioButton radioButton2=new JRadioButton("주소 없음");
    
    ButtonGroup bGroup=new ButtonGroup();
    bGroup.add(radioButton1);
    bGroup.add(radioButton2);
    
    
    JLabel label1=new JLabel("이름");
    JLabel label2=new JLabel("전화번호");
    JLabel label3=new JLabel("주소");
    JLabel label4=new JLabel("");
    JLabel label5=new JLabel("이름");
    JLabel label6=new JLabel("");
    
    JTextField nameTf1=new JTextField(20);
    JTextField pnTf2=new JTextField(20);
    JTextField addrTf3=new JTextField(20);
    JTextField nameTf4=new JTextField(20);
    JButton b1=new JButton("추가");
    JButton b2=new JButton("검색");
    JButton b3=new JButton("삭제");
    JButton b4=new JButton("주소록 전체 보기");
    
    //b1.addActionListener(new ContactListListener());
      
    addpanel.add(radioButton1);
    addpanel.add(radioButton2);
    
    addpanel.add(label1);
    addpanel.add(nameTf1);
    addpanel.add(label2);
    addpanel.add(pnTf2);
    addpanel.add(label3);
    addpanel.add(addrTf3);
    addpanel.add(label4);
    addpanel.add(b1);
    addpanel.add(label5);
    addpanel.add(nameTf4);
    addpanel.add(b2);
    addpanel.add(b3);
    addpanel.add(label6);
    addpanel.add(b4);

    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}