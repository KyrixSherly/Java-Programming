package com.sd.gui;

import java.awt.*;
import java.swing.*;
public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButtom)e.getSource();
    String cmd=e.getActionCommand();
    if(cmd.equals("���")) {
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�");
    }
    else if(cmd.equals("���")) {
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�");
    }
  }
}