
import java.sql.*;
import java.io.*;
import java.util.*;
class college
{
    String dname,cname,col="AU";
    int fac,stu,fee,highpac,depcode;
    public void read()
    {
      try{

                       Class.forName("oracle.jdbc.driver.OracleDriver");
                       Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
                       PreparedStatement ps = con.prepareStatement("insert into department values(?,?,?,?,?,?,?,?)");
                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                       System.out.println("Enter Department code:");
                       depcode=Integer.parseInt(br.readLine());
                       System.out.println("Enter Department name:");
                       dname=br.readLine();
                       System.out.println("Enter Clubs offered:");
                       cname=br.readLine();
                       System.out.println("Enter No. of Faculties:");
                       fac=Integer.parseInt(br.readLine());
                       System.out.println(" Enter No. of Students:");
                       stu=Integer.parseInt(br.readLine());
                       System.out.println("Enter Fee details:");
                       fee=Integer.parseInt(br.readLine());
                       System.out.println("Enter  highpackage:");
                       highpac=Integer.parseInt(br.readLine());
                       ps.setInt(1,depcode);
                       ps.setString(2,dname);
                       ps.setString(3,cname);
                       ps.setInt(4,fac);
                       ps.setInt(5,stu);
                       ps.setInt(6,fee);
                       ps.setInt(7,highpac);
                       ps.setString(8,col);
                       ps.executeUpdate();
                       System.out.println("record inserted");
          }
         catch(Exception e)
         {
             System.out.print(e);
         }
         }
         public void dis()
         {                                              
           try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select * from department"); 
           while(r.next())
           {
            depcode =r.getInt(1);
            dname = r.getString(2);
            cname = r.getString(3);
            fac =r.getInt(4);
            stu =r.getInt(5);
            fee =r.getInt(6);
            highpac=r.getInt(7);
            col = r.getString(8); 
            System.out.println(   depcode+"          	         "+dname+"	                 "+fac+"		            "+cname+"		     "+stu+"		      "+fee+"	         "+highpac+"      "+col);
            }
           System.out.print("\n");
        }
        catch(Exception e)
        {
          System.out.print(e);
        }
        }
        
         public void fee()
         {
             try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select dname,fees,college from department where college ='AU'"); 
           while(r.next())
           {
            
            dname = r.getString(1);
     
            fee =r.getInt(2);
           
            System.out.println(   dname+" 			"+fee);
         }
         }
         catch(Exception e)
        {
          System.out.print(e);
        }
         }
         public void fac()
         {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select dname,faculty,college from department where college ='AU'"); 
           while(r.next())
           {
            
            dname = r.getString(1);
     
            fac =r.getInt(2);
           
            System.out.println(   dname+" 			"+fac);
         }
         }
         catch(Exception e)
        {
          System.out.print(e);
        }
        
         }
         public void stu()
         {
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select dname,students,college from department where college ='AU'"); 
           while(r.next())
           {
            
            dname = r.getString(1);
     
            stu =r.getInt(2);
           
            System.out.println(   dname+" 			"+stu);
         }
         }
         catch(Exception e)
        {
          System.out.print(e);
        }

         } 
         public void club()
         {
  try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select dname,clubs,college from department where college ='AU'"); 
           while(r.next())
           {
            
            dname = r.getString(1);
     
            cname =r.getString(2);
           
            System.out.println(   dname+" 			"+cname);
         }
         }
         catch(Exception e)
        {
          System.out.print(e);
        }
         }
         public void highpack()
         {
  try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select dname,pac,college from department where college ='AU'"); 
           while(r.next())
           {
            
            dname = r.getString(1);
     
            highpac =r.getInt(2);
           
            System.out.println(   dname+" 			"+highpac);
         }
         }
         catch(Exception e)
        {
          System.out.print(e);
        }
         }
  public void search(int num)
{
try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
          Statement s = con.createStatement();
            ResultSet r =s.executeQuery("select * from department where depcode="+num); 
           while(r.next())
           {
            depcode =r.getInt(1);
            dname = r.getString(2);
            cname = r.getString(3);
            fac =r.getInt(4);
            stu =r.getInt(5);
            fee =r.getInt(6);
            highpac=r.getInt(7);
            col = r.getString(8); 
            System.out.println(   depcode+"          	         "+dname+"	                 "+fac+"		            "+cname+"		     "+stu+"		      "+fee+"	         "+highpac+"      "+col);
            }
           System.out.print("\n");
        }
        catch(Exception e)
        {
          System.out.print("department number not found!");
        }
     }
   public void update(int num)
 {
     String value;
  try{

                       Class.forName("oracle.jdbc.driver.OracleDriver");
                       Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
                       Statement s = con.createStatement();
                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                       System.out.println("Enter new No. of Faculties:");
                       fac=Integer.parseInt(br.readLine());
                       System.out.println(" Enter  new No. of Students:");
                       stu=Integer.parseInt(br.readLine());
                       System.out.println("Enter  new Fee details:");
                       fee=Integer.parseInt(br.readLine());
                       System.out.println("Enter  new  highpackage:");
                       highpac=Integer.parseInt(br.readLine());
                       s.executeUpdate("update department set faculty="+fac+",students="+stu+",fees="+fee+",pac="+highpac+"where depcode="+num);
                       
          }
         catch(Exception e)
         {
             System.out.print(e);
         }
 }
  public void delete (int num)
   {
     try{

                       Class.forName("oracle.jdbc.driver.OracleDriver");
                       Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamshi", "vamshi");
                       Statement s = con.createStatement();
                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                       
                       s.executeUpdate("delete from department where depcode="+num);
                       
          }
         catch(Exception e)
         {
             System.out.print(e);
         }
    }

   }
class dms
{
 public static void main(String name[])
 {
   int x;
   college obj[]=new college[10];
   college ob=new college();
   Scanner obj1=new Scanner(System.in);
   System.out.println("Enter No. Of Departments ");
   x=obj1.nextInt();
   int n;
   char ch;
do
{
System.out.println("1.insertion\n2.display\n3.search department details\n4.update department details\n5.course fee details\n6.No. of Faculty details\n7.No. of Students details\n8.Club details\n9.Highest highpackage department wise\n10.deletion");
System.out.println("Enter Choice:");
n=obj1.nextInt();
int i=-1,k,l;
   switch(n)
{
   case 1:
     for(i=0;i<x;i++)
     {
     obj[i]=new college();
     obj[i].read();
     }
     break;
  case 2:
     System.out.println("Department Code:   Department Name:	   No. of Faculties:	  Clubs offered:	  No. of Students:    fee details:     highpackage:    college:");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
     
    
      ob.dis();
   
      break;
  case 3:
    System.out.println("Enter Department Code");
    k=obj1.nextInt();
    System.out.println("Department Code	Department Name:	No. of Faculties:	Clubs offered:		No. of Students:  		fee details:	  Highest highpackage:");
  
  ob.search(k);
    break;
    case 4:
    System.out.println("Enter Department Code");
    l=obj1.nextInt();
    ob.update(l);
     System.out.println("updated successfully ");
    break;
  case 5:
     System.out.println("Department name:    Tuitionfee:");
    
     ob.fee();
    
    break;
  case 6:
    System.out.println("Department name:     No. of faculties:");
    
   ob.fac();
    
    break;
    case 7:
    System.out.println("Department name:     No. of students:");
    
   ob.stu();
    
    break;
    case 8:
    System.out.println("Department name:    Club offered");
    
   ob.club();
    
    break;
    case 9:
    System.out.println("Department name:      Highest highpackage");
    
   ob.highpack();
    
    break;
    case 10:
    char g='y';
    System.out.println("Enter Department code to be deleted:");
    l=obj1.nextInt();
    System.out.println("CONFORM  BY TYPING [Y/N] ");
    char ss = obj1.next().charAt(0);
     if(ss==g)
     {
      ob.delete(l);
      System.out.println("RECORD  DELETED"); 
     }
     else{
     System.out.println("RECORD NOT  DELETED");
     }   
     break;
}
System.out.println("do u want to continue(y/n)");
ch=obj1.next().charAt(0);
}while(ch=='y');
}
}
