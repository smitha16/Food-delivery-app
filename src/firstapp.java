import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class screen1 extends JFrame implements ActionListener{
	 JFrame f= new JFrame();  
	 JTextField t1, t2, t3;
	 JLabel l1,l2,l3,l4,label;
	 JButton b;
	 public String name, phno, addr;
	 public screen1(){
	    try {
	    	JLabel label = new JLabel(new ImageIcon("C:\\Users\\smitha\\Desktop\\italy.jpg"));
	    	f.setContentPane(label);

		} catch (HeadlessException expn) {
			expn.printStackTrace();
		}
	    
	    Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
	    Border border1 = BorderFactory.createLineBorder(Color.BLACK, 1);
	    l1=new JLabel(" FOOD DELIVERY ");
	    l1.setOpaque(true);
	    l1.setBackground(Color.YELLOW);
	    l1.setFont(new Font("", Font.BOLD, 40));
	    l1.setAlignmentX(CENTER_ALIGNMENT);
	    l1.setMaximumSize(new Dimension(355,70));
	    l1.setBorder(border);
	    f.add(l1);
	    f.add(Box.createRigidArea(new Dimension(0, 100)));

        l2 = new JLabel(" Name: ");  
        l2.setFont(new Font("", Font.BOLD, 25));
        l2.setOpaque(true);
	    l2.setBackground(Color.YELLOW);
	    l2.setAlignmentX(CENTER_ALIGNMENT);
	    l2.setPreferredSize(new Dimension(50, 30));
	    l2.setBorder(border1);
	    f.add(l2);
	    f.add(Box.createRigidArea(new Dimension(0, 5)));
	    
	    t1 = new JTextField("", 1); 
        t1.setAlignmentX(CENTER_ALIGNMENT);
        t1.setMaximumSize(new Dimension(150,30));
        t1.setBorder(border1);
        f.add(t1);
        f.add(Box.createRigidArea(new Dimension(0, 30)));
        
        l3 = new JLabel(" Phone Number: ");  
        l3.setFont(new Font("", Font.BOLD, 25));
        l3.setOpaque(true);
	    l3.setBackground(Color.YELLOW);
	    l3.setAlignmentX(CENTER_ALIGNMENT);
	    l3.setPreferredSize(new Dimension(50, 30));
	    l3.setBorder(border1);
	    f.add(l3);
	    f.add(Box.createRigidArea(new Dimension(0, 5)));
	    
	    t2 = new JTextField("", 5);  
        t2.setAlignmentX(CENTER_ALIGNMENT);
        t2.setMaximumSize(new Dimension(150,30));
        t2.setBorder(border1);
        f.add(t2);
        f.add(Box.createRigidArea(new Dimension(0, 30)));
        
        l4 = new JLabel(" Address: ");  
        l4.setFont(new Font("", Font.BOLD, 25));
        l4.setOpaque(true);
	    l4.setBackground(Color.YELLOW);
	    l4.setAlignmentX(CENTER_ALIGNMENT);
	    l4.setPreferredSize(new Dimension(50, 30));
	    l4.setBorder(border1);
	    f.add(l4);
	    f.add(Box.createRigidArea(new Dimension(0, 5)));
	    
        t3 = new JTextField("", 5);  
        t3.setMaximumSize(new Dimension(250,50));
        t3.setAlignmentX(CENTER_ALIGNMENT);
        t3.setBorder(border1);
        f.add(t3);
        f.add(Box.createRigidArea(new Dimension(0, 40)));
        
        b=new JButton("SUBMIT"); 
        b.setFont(new Font("", Font.BOLD, 20));
        b.addActionListener(this); 
        b.setMaximumSize(new Dimension(150,50));
        b.setAlignmentX(CENTER_ALIGNMENT);
        b.setBorder(border1);
        f.add(b);
        
        f.getContentPane().setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));
        f.pack();
        f.setSize(1050, 700);
	    f.setVisible(true);  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 public static boolean mobile(String str)  
	 {  
	 Pattern ptrn = Pattern.compile("[2-9][0-9]{9}");  
	 Matcher match = ptrn.matcher(str);  
	 return (match.find() && match.group().equals(str));  
	 }  

public void actionPerformed(ActionEvent e) {  
		 if(e.getSource()==b) {
			 name = t1.getText();
			 phno = t2.getText();
			 addr = t3.getText();
			 boolean val = mobile(phno); 
			 if(name.equals("") || phno.equals("") || addr.equals(""))
					 JOptionPane.showMessageDialog(this,"Input all the fields");			 
			 else {
				 if(val == true)
					 new screen2(name,phno,addr);
				 else
					 JOptionPane.showMessageDialog(this,"Enter a valid phone number");	 
			 }
		 }
	 }  
}

class screen2 extends JFrame implements ActionListener{
	 JFrame f1;
	 JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	 DefaultListModel<String> lol = new DefaultListModel<>();  
	 JList<String> list = new JList<String>(lol); 
	 DefaultListModel<String> lol1 = new DefaultListModel<>();  
	 JList<String> list1 = new JList<String>(lol1); 
	 JButton b,b1,b2;
	 JPanel p,p1,p2,p3,p4;
	 String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, ctr1,ctr2,ctr3,ctr4,ctr5,ctr6,ctr7,ctr8,ctr9,ctr10;
	 String name, phno, addr;
	 SpinnerModel value =  new SpinnerNumberModel(1,1,5,1);  
	 SpinnerModel value1 =  new SpinnerNumberModel(1,1,5,1);
	 SpinnerModel value2 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value3 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value4 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value5 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value6 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value7 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value8 =  new SpinnerNumberModel(1,1,5,1); 
	 SpinnerModel value9 =  new SpinnerNumberModel(1,1,5,1); 
     JSpinner s1 = new JSpinner(value);  
     JSpinner s2 = new JSpinner(value1);
     JSpinner s3 = new JSpinner(value2); 
     JSpinner s4 = new JSpinner(value3); 
     JSpinner s5 = new JSpinner(value4); 
     JSpinner s6 = new JSpinner(value5); 
     JSpinner s7 = new JSpinner(value6); 
     JSpinner s8 = new JSpinner(value7); 
     JSpinner s9 = new JSpinner(value8); 
     JSpinner s10 = new JSpinner(value9); 
     int c = 0;
     int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
     Boolean t1=false,t2=false,t3=false,t4=false,t5=false,t6=false,t7=false,t8=false,t9=false,t10=false;
     int i1= 100, i2 = 200, i3 = 300, i4 = 400, i5= 500, i6= 400, i7 = 300, i8= 200, i9=100, i10=50;
	 public JLabel addlabel(JLabel x, String y, JPanel p)
	 {
		 x= new JLabel(y);
		 x.setFont(new Font("", Font.BOLD, 20));
		 p.add(x);
		 return x;
	 }
	 public JCheckBox addcb(JCheckBox x, String y, JPanel p)
	 {
		 x= new JCheckBox(y);
		 x.setFont(new Font("", Font.BOLD, 20));
		 p.add(x);
		 return x;
	 }
	 public void state(ItemEvent e1, String y)
	 {
		 if(e1.getStateChange()==1)
 		{
 		    c+=100;
 		    lol.addElement(y);
 		    p1.add(list);
 		    f1.setVisible(true);
 		}
    	 else {
    		 if(c>0)
    		   c-=100;
    		lol.removeElement(y);
	    }
	 }
	 public screen2(String n, String ph, String add) {
		f1= new JFrame();
		list.setFont(new Font("", Font.BOLD, 20));
		list.setBackground(Color.pink);
		list1.setFont(new Font("", Font.BOLD, 20));
		list1.setBackground(Color.pink);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) list1.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.RIGHT);
		/*renderer = (DefaultListCellRenderer) list.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);*/
		name=n; phno=ph; addr=add;
		
		((DefaultEditor) s1.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s2.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s3.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s4.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s5.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s6.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s7.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s8.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s9.getEditor()).getTextField().setEditable( false );
	    ((DefaultEditor) s10.getEditor()).getTextField().setEditable( false );
		
		p = new JPanel(new FlowLayout(FlowLayout.TRAILING, 100, 10));
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 10));
		p.setBackground(Color.pink);
		p1.setBackground(Color.pink);
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.setBackground(Color.pink);
		p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
		p3.setBackground(Color.pink);
		p4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 45, 10));
		p4.setBackground(Color.pink);
		
		p.setBorder(BorderFactory.createTitledBorder("  Menu:"));
		((TitledBorder) p.getBorder()).setTitleFont(new Font("Arial", Font.BOLD, 30));
		p2.setBorder(BorderFactory.createTitledBorder("Your Order:"));
		((TitledBorder) p2.getBorder()).setTitleFont(new Font("Arial", Font.BOLD, 30));
		p1.add(list);
	    p1.add(list1);
	   
		l1=addlabel(l1,"Items",p);
		l2=addlabel(l2,"  Price",p);
		l3=addlabel(l3,"QTY",p);
		
		c1=addcb(c1,"Pasta",p);
	    l4=addlabel(l4,"100 RS",p);
	    p.add(s1);
		c1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
           	 if(e1.getStateChange()==1)
        		{
           		t1= true;
           		a1=(int)s1.getValue();
           		c+=i1*a1;
    		    str1 = "Pasta"; 
           		ctr1 =i1*a1 + " RS";
           		l9.setText(String.valueOf(c) + "RS");
    		    lol.addElement(str1);
    		    lol1.addElement(ctr1);	    
    		    f1.setVisible(true);
        		}
           	 else {
           		 t1=false;
           		 if(c>0) {
           		 c-=i1*(int)s1.getValue();
           		l9.setText(String.valueOf(c) + "RS");
           		 }
           		lol.removeElement(str1);
           		lol1.removeElement(ctr1);
           		((DefaultEditor) s1.getEditor()).getTextField().setValue(1);
           	 }
            }
		});
		s1.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t1==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a1)
	        		c+=i1;
	        	else
	        		c-=i1;
	        	a1=r;
	        int p=lol.indexOf(str1);
 		    str1 = "Pasta"; 
 		    ctr1 = i1*a1 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str1);
 		    lol1.set(p, ctr1);
	        }  
	        }
		});
	
		c2=addcb(c2,"Pizza",p);
		l5=addlabel(l5,"200 RS",p);
		p.add(s2);
		c2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
           	 if(e1.getStateChange()==1)
        		{
           		t2= true;
           		a2=(int)s2.getValue();
           		c+=i2*a2;
    		    str2 = "Pizza"; ctr2= i2*a2 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str2);
     		    lol1.addElement(ctr2);
        		    f1.setVisible(true);
        		}
           	 else {
           		t2=false;
           		if(c>0) {
           			c-=i2*(int)s2.getValue();
               		l9.setText(String.valueOf(c) + "RS");
           		}
            		lol.removeElement(str2);
            		lol1.removeElement(ctr2);
            		((DefaultEditor) s2.getEditor()).getTextField().setValue(1);
           	 }
            }
		});
		s2.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t2==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a2)
	        		c+=i2;
	        	else
	        		c-=i2;
	        	a2=r;
	        int p=lol.indexOf(str2);
 		    str2 = "Pizza"; ctr2= i2*a2 + " RS" ; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str2); lol1.set(p, ctr2);
	        }  
	        }
		});
		c3=addcb(c3,"Sphegatti",p);
		l6=addlabel(l6,"300 RS",p);
		p.add(s3);
		c3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
           	 if(e1.getStateChange()==1)
        		{
           		t3= true;
           		a3=(int)s3.getValue();
           		c+=i3*a3;
    		    str3 = "Sphegatti"; ctr3=i3*a3 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str3); lol1.addElement(ctr3);
        		f1.setVisible(true);
        		}
           	 else {
           		 	t3=false;
            		if(c>0) {
            			c-=i3*(int)s3.getValue();
             		  l9.setText(String.valueOf(c) + "RS");
            		}
             		lol.removeElement(str3); lol1.removeElement(ctr3);
             		((DefaultEditor) s3.getEditor()).getTextField().setValue(1);
            	 }
            }
		});
		s3.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t3==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a3)
	        		c+=i3;
	        	else
	        		c-=i3;
	        	a3=r;
	        int p=lol.indexOf(str3); 
 		    str3 = "sphegatti"; ctr3= i3*a3 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str3); lol1.set(p, ctr3);
	        }  
	        }
		});
		
		c4=addcb(c4,"Ravioli",p);
		l7=addlabel(l7,"400 RS",p);
		p.add(s4);
		c4.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) {               
           	 if(e1.getStateChange()==1)
        		{
           		t4= true;
           		a4=(int)s4.getValue();
           		c+=i4*a4;
    		    str4 = "Ravioli";
    		    ctr4=i4*a4 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str4); lol1.addElement(ctr4);
        		    f1.setVisible(true);
        		}
           	 else {
           		t4=false;
         		if(c>0) {
         			c-=i4*(int)s4.getValue();
          		 l9.setText(String.valueOf(c) + "RS");
         		}
          		lol.removeElement(str4); lol1.removeElement(ctr4);
          		((DefaultEditor) s4.getEditor()).getTextField().setValue(1);
         	 }
            }
		});
		s4.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t4==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a4)
	        		c+=i4;
	        	else
	        		c-=i4;
	        	a4=r;
	        int p=lol.indexOf(str4);
 		    str4 = "Ravioli"; ctr4=i4*a4 + " RS" ; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str4); lol1.set(p, ctr4);
	        }  
	        }
		});
		
		c5=addcb(c5,"Tacos",p);
		l8=addlabel(l8,"500 RS",p);
		p.add(s5);
		c5.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t5= true;
           		a5=(int)s5.getValue();
           		c+=i5*a5;
    		    str5 = "Tacos"; ctr5= i5*a5 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str5); lol1.addElement(ctr5);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t5=false;
          		if(c>0) {
          			c-=i5*(int)s5.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str5); lol1.removeElement(ctr5);
           		((DefaultEditor) s5.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s5.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t5==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a5)
	        		c+=i5;
	        	else
	        		c-=i5;
	        	a5=r;
	        int p=lol.indexOf(str5);
 		    str5 = "Tacos"; ctr5 = i5*a5 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str5); lol1.set(p, ctr5);
	        }  
	        }
		});
		
		c6=addcb(c6,"Burritos",p);
		l11=addlabel(l11,"400 RS",p);
		p.add(s6);
		c6.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t6= true;
           		a6=(int)s6.getValue();
           		c+=i6*a6;
    		    str6 = "Burritos"; ctr6 = i6*a6 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str6); lol1.addElement(ctr6);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t6=false;
          		if(c>0) {
          			c-=i6*(int)s6.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str6); lol1.removeElement(ctr6);
           		((DefaultEditor) s6.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s6.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t6==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a6)
	        		c+=i6;
	        	else
	        		c-=i6;
	        	a6=r;
	        int p=lol.indexOf(str6);
 		    str6 = "Burritos"; ctr6 = i6*a6 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str6);  lol1.set(p, ctr6);
	        }  
	        }
		});
		
		c7=addcb(c7,"Noodles",p);
		l12=addlabel(l12,"300 RS",p);
		p.add(s7);
		c7.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t7= true;
           		a7=(int)s7.getValue();
           		c+=i7*a7;
    		    str7 = "Noodles"; ctr7 = i7*a7 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str7); lol1.addElement(ctr7);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t7=false;
          		if(c>0) {
          			c-=i7*(int)s7.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str7); lol1.removeElement(ctr7);
           		((DefaultEditor) s7.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s7.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t7==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a7)
	        		c+=i7;
	        	else
	        		c-=i7;
	        	a7=r;
	        int p=lol.indexOf(str7);
 		    str7 = "Noodles"; ctr7=i7*a7 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str7); lol1.set(p, ctr7);
	        }  
	        }
		});
		
		c8=addcb(c8,"Quesedilla",p);
		l13=addlabel(l13,"200 RS",p);
		p.add(s8);
		c8.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t8= true;
           		a8=(int)s8.getValue();
           		c+=i8*a8;
    		    str8 = "Quesadilla"; ctr8 = i8*a8 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str8);  lol1.addElement(ctr8);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t8=false;
          		if(c>0) {
          			c-=i8*(int)s8.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str8); lol1.removeElement(ctr8);
           		((DefaultEditor) s8.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s8.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t8==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a8)
	        		c+=i8;
	        	else
	        		c-=i8;
	        	a8=r;
	        int p=lol.indexOf(str8);
 		    str8 = "Quesadilla"; ctr8 = i8*a8 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str8); lol1.set(p, ctr8);
	        }  
	        }
		});
		
		c9=addcb(c9,"Nachos",p);
		l14=addlabel(l14,"100 RS",p);
		p.add(s9);
		c9.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t9= true;
           		a9=(int)s9.getValue();
           		c+=i9*a9;
    		    str9 = "Nachos"; ctr9 = i9*a9 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str9);  lol1.addElement(ctr9);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t9=false;
          		if(c>0) {
          			c-=i9*(int)s9.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str9); lol1.removeElement(ctr9);
           		((DefaultEditor) s9.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s9.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t9==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a9)
	        		c+=i9;
	        	else
	        		c-=i9;
	        	a9=r;
	        int p=lol.indexOf(str9);
 		    str9 = "Nachos"; ctr9 = i9*a9 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str9); lol1.set(p, ctr9);
	        }  
	        }
		});
		
		c10=addcb(c10,"Maggi",p);
		l15=addlabel(l15,"  50 RS",p);
		p.add(s10);
		c10.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e1) { 
           	 if(e1.getStateChange()==1)
        		{
           		t10= true;
           		a10=(int)s10.getValue();
           		c+=i10*a10;
    		    str10 = "Maggi"; ctr10 = i10*a10 + " RS"; 
           		l9.setText(String.valueOf(c) + "RS");
     		    lol.addElement(str10);  lol1.addElement(ctr10);
        		    f1.setVisible(true);
        		}
           	 else {
           		 t10=false;
          		if(c>0) {
          			c-=i10*(int)s10.getValue();
           		l9.setText(String.valueOf(c) + "RS");
          		}
           		lol.removeElement(str10); lol1.removeElement(ctr10);
           		((DefaultEditor) s10.getEditor()).getTextField().setValue(1);
          	 }
            }
		});
		s10.addChangeListener(new ChangeListener() {  
	        public void stateChanged(ChangeEvent e) {
	        	if(t10==true) {
	        	int r = (int)((JSpinner)e.getSource()).getValue();
	        	if(r>a10)
	        		c+=i10;
	        	else
	        		c-=i10;
	        	a10=r;
	        int p=lol.indexOf(str10);
 		    str10 = "Maggi"; ctr10 = i10*a10 + " RS"; 
 		    l9.setText(String.valueOf(c) + "RS");
 		    lol.set(p, str10); lol1.set(p, ctr10);
	        }  
	        }
		});
		p2.add(p1, BorderLayout.NORTH);
		
		b = new JButton("Clear ALL");
		b.setFont(new Font("", Font.BOLD, 20));
		b.setPreferredSize(new Dimension(140, 40));
		p.add(b);
		b.addActionListener(this);

		l10 = addlabel(l10,"Total:",p4);
		l9 = addlabel(l9,"0 RS",p4);
		p3.add(p4);
		b2 = new JButton("Place Order");
		b2.setFont(new Font("", Font.BOLD, 20));
		b2.setPreferredSize(new Dimension(230, 40));
		b2.setAlignmentX(CENTER_ALIGNMENT);
		p3.add(b2);
		p3.add(Box.createRigidArea(new Dimension(0, 90)));
		b2.addActionListener(this);
		p2.add(p3, BorderLayout.SOUTH);
		
		f1.add(p);
		f1.add(p2);
		f1.pack();
		f1.setLayout(new GridLayout());
		f1.setSize(500,500);
	    f1.setVisible(true); 
	    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b)
			{
				p1.setVisible(true);
				//p1.revalidate();
				//p1.repaint();
				c=0;
				l9.setText(String.valueOf(c) + "RS");
				Component[] components = (Component[]) p.getComponents();
				for (Component comp : components) {
					if (comp instanceof JCheckBox) {
	                    JCheckBox box = (JCheckBox) comp;
	                    box.setSelected(false); 
	                }
			    }
			}
			if(e.getSource()==b2) {
				String msg="Personal detials:\nName:";
				msg+=name + "\nPhone Number:";
				msg+=phno + "\nAddress:";
				msg+=addr + "\n";
				msg+="\nORDER SUMMARY:\n";
				    if(c1.isSelected())  
			            msg+=str1+ "              " + ctr1+ "\n";  
			        if(c2.isSelected()) 
			            msg+=str2+ "               " + ctr2+  "\n";  
			        if(c3.isSelected())
			        	msg+=str3+ "       " + ctr3+  "\n";   
			        if(c4.isSelected())  
			        	msg+=str4+ "             " + ctr4+  "\n";  
			        if(c5.isSelected())   
			        	msg+=str5+ "              " + ctr5+ "\n"; 
			        if(c6.isSelected())  
			            msg+=str6+"          " + ctr6+ "\n";  
			        if(c7.isSelected()) 
			            msg+=str7+"          " + ctr7+  "\n";  
			        if(c8.isSelected())
			        	msg+=str8+"     " + ctr8+  "\n";   
			        if(c9.isSelected())  
			        	msg+=str9+"           " + ctr9+  "\n";  
			        if(c10.isSelected())   
			        	msg+=str10+"              " + ctr10+  "\n";  
			        
			        msg+="-----------------\n";
				JOptionPane.showMessageDialog(this,msg+"Total:  "+c+" RS" + "\nYour order has been sucessfully placed!\n");  
			}
       }
}

public class firstapp {
	public static void main(String args[])
	{
		new screen1();
	}
}

