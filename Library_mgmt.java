
	
	import java.sql.*;
	import org.apache.derby.jdbc.ClientDriver;
	import java.util.Scanner;
	import java.io.Console;
	
	public class library
	{
	   public static void main(String[] args)
	   {
	      char esc = 27;
	      String clear = esc + "[2J";
	      Connection conn = null;
	      try
	      {
	
	        Driver d = new ClientDriver();
	        String url = "jdbc:derby://localhost:3343/Librarydbmgmt"
	                       + ";create=true";
	        conn = d.connect(url, null);
	
	        Console console = System.console();
	        Scanner type= new Scanner(System.in);
	        int response1, response2;
	        int i=0,k=0;
	
	        while(k==0)
	        {
		  System.out.print(clear);
		  String str = "\t\t\t\tWELCOME TO LIBRARY MANAGEMENT SYSTEM ! ..."; 
		  System.out.printf("%" + (80 + str.length())/2 + "s\n", str); 
	
		  System.out.println("\t\t\t\t1:Administrator\n");
		  System.out.println("\t\t\t\t2:Librarian\n");
		  System.out.println("\t\t\t\t3:Exit\n");
		  System.out.print("\t\t\t\tEnter Your Choice: ");
		  response1=type.nextInt();
		  if(response1==1)
		  {
		    k=1;
		    while(i<3)
		    {
			char[] pass = console.readPassword("\t\t\t\t\nEnter your given password: ");
			String s=new String("asdf");
			String p=new String(pass);
			if (!p.equals(s))
			{
			  if(i<2)
			    System.out.println("\t\t\t\tWrong Password Entered, Try again!!");
			  else
			    System.out.println("\t\t\t\tWrong Password Entered, Exiting");
			  i++;
			}
			else
			{
			  int j=0;
	                  while(j==0)
		          {
			    System.out.print(clear);
			    System.out.println();
			    System.out.println("\t\t\t\tChoose from one of the following options:");
			    System.out.println("\t\t\t\tOption 1:The details of the books rented by users:");
			    System.out.println("\t\t\t\tOption 2:Users detail who rented the books:");
			    System.out.println("\t\t\t\tOption 3:Books currently rented from the library:");
			    System.out.println("\t\t\t\tOption 4:Searching availble books:");
			    System.out.println("\t\t\t\tOption 5:Users who rented the most books:");
			    System.out.println("\t\t\t\tOption 6:Adding a new book into library:");
			    System.out.println("\t\t\t\tOption 7:The number of books that have been checked out:");
			    System.out.println("\t\t\t\tOption 8:Books that have been checked out the most times:");
			    System.out.println("\t\t\t\tOption 9:The author(s) that has had the most books checked out:");
			    System.out.println("\t\t\t\tOption 10:The books that are available for checking out given a subject:");
			    System.out.println("\t\t\t\tOption 11:Update the phone of user details:");
			    System.out.println("\t\t\t\tOption 12:Delete the librarian details :");
			    System.out.println();
			    System.out.print("\t\t\t\tEnter your choice:");
			    response2=type.nextInt();
			    switch (response2)
	        	    {
		              case 1: 
				      Query1(conn);	
		        	      break;
		              case 2:
		            	  Query2(conn);
		            	  break;
		              case 3:
		            	  Query3(conn);
		            	  break;
		              case 4:
		            	  Query4(conn);
		            	  break;
		              case 5:
		            	  Query5(conn);
		            	  break;
		              case 6:
		            	  Query6(conn);
		            	  break;
		              case 7:
		            	  Query7(conn);
		            	  break;
		              case 8:
		            	  Query8(conn);
		            	  break;
		              case 9:
		            	  Query9(conn);
		            	  break;
		              case 10:
		            	  Query10(conn);
		            	  break;
		              case 11:
		            	  Query11(conn);
		            	  break;
		              case 12:
		            	  Query12(conn);
		            	  break;
	           	      default: System.out.println("Invalid Response");
	                              break;
	
	  		    }
	
			    Scanner keyboard=new Scanner(System.in);
			    int l=0;
			    System.out.print("Do you want to continue(yes or y /no or n)?:");
			    while(l==0)
			    {
			        String cont = keyboard.nextLine();
				if(cont.equals("yes") || cont.equals("y"))
				{
				  j=0;
				  l=1;
				}
	
				else if(cont.equals("no") || cont.equals("n"))
				{
				  j=1;
				  l=1;
				}
	
				else
				{
				  System.out.print("Invalid Entry. Enter(yes or y /no or n):");
				}
			    }
			    i=3;
			  }
			}
		    }
		}
	 
		else if(response1==2)
		{
		  k=1;
		  int j=0;
		  while(j==0)
		  {
			System.out.println();
			System.out.println("\t\t\t\tChoose from one of the following options:");
		    System.out.println("\t\t\t\tOption 1:The details of the books rented by users:");
		    System.out.println("\t\t\t\tOption 2:Users detail who rented the books:");
		    System.out.println("\t\t\t\tOption 3:Books currently rented from the library:");
		    System.out.println("\t\t\t\tOption 4:Searching availble books:");
		    System.out.println("\t\t\t\tOption 5:The number of books that have been checked out:");
		    System.out.println("\t\t\t\tOption 6:Books that have been checked out the most times:");
		    System.out.println("\t\t\t\tOption 7:The author(s) that has had the most books checked out:");
		    System.out.println("\t\t\t\tOption 8:The books that are available for checking out given a subject:");
	
			System.out.print("Enter your choice:");
			response2=type.nextInt();
	
			 switch (response2)
	         	{
	         		  case 1: 
				      Query1(conn);	
		        	      break;
		              case 2:
		            	  Query2(conn);
		            	  break;
		              case 3:
		            	  Query3(conn);
		            	  break;
		              case 4:
		            	  Query4(conn);
		            	  break;
		              case 5:
		            	  Query7(conn);
		            	  break;
		              case 6:
		            	  Query8(conn);
		            	  break;
		              case 7:
		            	  Query9(conn);
		            	  break;
		              case 8:
		            	  Query10(conn);
		            	  break;
	                   default: System.out.println("Invalid Response");
	                                break;
	        	 }
	
			Scanner keyboard=new Scanner(System.in);
			int l=0;
			System.out.print("Do you want to continue(yes or y /no or n)?:");
			while(l==0)
			{
				String cont = keyboard.nextLine();
				if(cont.equals("yes") || cont.equals("y"))
				{
					j=0;
					l=1;
				}
				
				else if(cont.equals("no") || cont.equals("n"))
				{
					j=1;
					l=1;
				}
	
				else
				{
					System.out.print("Invalid Entry. Enter(yes or y /no or n):");
				}
			}		
	           }
		}
	
		else if(response1==3)
		{
			System.exit(0);
		}
	
		else
		{
			System.out.println("Invalid response,Enter (1/2)");
		}
	    }
	
	  }
	
	  catch(SQLException e)
	  {
	         e.printStackTrace();
	  }
	
	  finally
	  {
	     try
	     {
	        if(conn != null)
	        conn.close();
	     }
	    
	     catch(SQLException e)
	     {
	        e.printStackTrace();
	     }
	  }
	}
	
	
	public static void Query1(Connection conn) throws SQLException
	{
	char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat1 = conn.createStatement();
	
	String query1 = "SELECT u.USID, u.UFName, u.ULName, b.Title, r.StartDate,r.FinishDate"
	                + " FROM RENT r, USERDETAILS u,BOOK b"
	                + " WHERE r.UId = u.USID and r.Bid = b.BID";
	ResultSet rs1 = stat1.executeQuery(query1);
	
	System.out.println();
	System.out.format("%-12s %-18s %-18s %-18s %-12s %-12s%n","USID","UFName","ULName","Title","StartDate","FinishDate");
	
	
	 while (rs1.next())
	      {
	         String usrid = rs1.getString("USID");
	         String usrfname = rs1.getString("UFName");
	         String usrlname = rs1.getString("ULName");
	         String usrttl = rs1.getString("Title");
	         String strtdt = rs1.getString("StartDate");
	         String enddt = rs1.getString("FinishDate");
	
	System.out.format("%-12s %-18s %-18s %-18s %-12s %-12s%n",usrid,usrfname,usrlname,usrttl,strtdt,enddt);
	
	}
	 System.out.println();
		rs1.close();
	
	}
	
	public static void Query2(Connection conn) throws SQLException
	{
	Scanner keyboard=new Scanner(System.in);
	Statement stat = conn.createStatement();
	
	String query = "SELECT  u.UFName, u.ULName, u.UPhone, u.Address, u.Email"
	                + " FROM    USERDETAILS u,RENT r"
	                + " WHERE	u.USID = r.UId";
	                
	ResultSet rs = stat.executeQuery(query);
	
	System.out.println();
	System.out.format("%-18s %-18s %-10s %-20s %-18s%n","UFName","ULName","UPhone","Address","Email");
	 while (rs.next())
	      {
	         String FsName = rs.getString("UFName");
	         String LSname = rs.getString("ULName");
	         String Mphone = rs.getString("UPhone");
			 String User_Add = rs.getString("Address");
			 String User_email = rs.getString("Email");
	
	
	System.out.format("%-18s %-18s %-10s %-20s %-18s%n",FsName,LSname,Mphone,User_Add,User_email);
	}
	
	System.out.println();
	rs.close();
	
	
	}
	
	public static void Query3(Connection conn) throws SQLException
	{
	char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat3 = conn.createStatement();
	
	String query3 = "SELECT  b.BID, b.Title, b.ISBN, b.YearIss"
	                + " FROM    BOOK b,RENT r"
					+ " WHERE b.BID = r.Bid"
					+ " group by b.BID,b.Title, b.ISBN, b.YearIss";
	
	
	ResultSet rs3 = stat3.executeQuery(query3);
	
	System.out.println();
	System.out.format("%-18s %-18s %-10s %-10s%n","BID","Title","ISBN","YearIss");
	
	 while (rs3.next())
	      {
	         String book_id = rs3.getString("BID");
	         String book_title = rs3.getString("Title");
	         String book_isbn = rs3.getString("ISBN");
			 String book_yer_issued = rs3.getString("YearIss");
			
			 System.out.format("%-18s %-18s %-10s %-10s%n",book_id,book_title,book_isbn,book_yer_issued);
	}
	System.out.println();
	rs3.close();
	}
	
	public static void Query4(Connection conn) throws SQLException
	{
	char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	Scanner keyboard=new Scanner(System.in);
	Statement stat4 = conn.createStatement();
	
	System.out.print("Enter the book id :");
	String bbid = keyboard.nextLine();
	
	String query4= "SELECT b.BID,b.Title,b.ISBN,b.YearIss"
	                + " FROM BOOK b"
					+ " WHERE b.BID not in (select Bid from RENT) and b.BID =" + bbid 
					+ " group by b.BID, b.Title, b.ISBN, b.YearIss" ;
	
	
	
	
	ResultSet rs4 = stat4.executeQuery(query4);
	
	System.out.println();
	System.out.format("%-18s %-18s %-10s %-20s%n","BID","Title","ISBN","YearIss");
	while(rs4.next())
	{
			 String book_id1 = rs4.getString("BID");
	         String book_title1 = rs4.getString("Title");
	         String book_isbn1 = rs4.getString("ISBN");
			 String book_yer_issued1 = rs4.getString("YearIss");
			
	System.out.format("%-18s %-18s %-10s %-20s%n",book_id1,book_title1,book_isbn1,book_yer_issued1);
	 }
	System.out.println();
	rs4.close();
	
	}
	public static void Query5(Connection conn) throws SQLException
	{
	char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat1 = conn.createStatement();
	
	String query1 = "select r.*"
	                + " from MaxReant mr, RentCount r"
	                + " where mr.MaxCount = r.rCount";
	ResultSet rs1 = stat1.executeQuery(query1);
	
	System.out.println();
	System.out.format("%-12s %-18s %-18s %-10s %-20s %-18s %-5s%n","UID","UFName","ULName","UPHONE","ADDRESS","EMAIL","RCOUNT");
	
	
	 while (rs1.next())
	      {
	         String usrid = rs1.getString("UID");
	         String usrfname = rs1.getString("UFName");
	         String usrlname = rs1.getString("ULName");
	         String usrphn = rs1.getString("UPHONE");
	         String addr = rs1.getString("ADDRESS");
	         String eml = rs1.getString("EMAIL");
	         String rcnt = rs1.getString("RCOUNT");
	
	System.out.format("%-12s %-18s %-18s %-10s %-20s %-18s %-5s%n",usrid,usrfname,usrlname,usrphn,addr,eml,rcnt);
	         
	      }
	 System.out.println();
		rs1.close();
	
	}
	
	public static void Query6(Connection conn) throws SQLException
	{
		char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat6 = conn.createStatement();
	
	String query6 = "select *"
	                + " from book";
	
	ResultSet rs6 = stat6.executeQuery(query6);
	System.out.println();
	System.out.format("%-10s %-10s %-10s %-18s %-10s %-10s%n","Book ID","Subject ID","Publisher ID","Title","ISBN","Year Issued");
	
	
	 while (rs6.next())
	      {
	         String Book_id = rs6.getString("BID");
	         String Sub_id = rs6.getString("SId");
			 String P_id = rs6.getString("PId");
			 String BTitle = rs6.getString("Title");
			 String bISBN = rs6.getString("ISBN");
			 String yeissued = rs6.getString("YearIss");
	
	System.out.format("%-10s %-10s %-10s %-18s %-10s %-10s%n",Book_id,Sub_id,P_id,BTitle,bISBN,yeissued);
	
	}
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println();
	System.out.print("Enter the Book Id: ");
	String bbid = keyboard.nextLine();
	
	
	System.out.print("Enter subject ID: ");
	String ssid = keyboard.nextLine();
	
	
	System.out.print("Enter Publisher ID: ");
	String ppid = keyboard.nextLine();
	
	
	System.out.print("Enter the Title of the book: ");
	String ttl = keyboard.nextLine();
	
	
	System.out.print("Enter ISBN of the book: ");
	String bsbn = keyboard.nextLine();
	
	
	System.out.print("Enter Year issues of the book: ");
	String yrissued = keyboard.nextLine();
	
	
	Statement stat = conn.createStatement();
	
	String query = "insert into BOOK  (BID, SId, PId, Title, ISBN, YearIss) values ("
					 + bbid + "," + ssid + "," + ppid + ",'" + ttl + "', " + bsbn + ", '" +yrissued+"')";
	
	
	 stat.executeUpdate(query);
	 System.out.println("values successfully inserted into table");
	
	
	
	}
	
	
	public static void Query7(Connection conn) throws SQLException
	{
	char esc = 27;
	String clear = esc + "[2J";
	System.out.print(clear);
	Statement stat7 = conn.createStatement();
	Scanner keyboard=new Scanner(System.in);
	
	System.out.print("Enter Book ID:");
	String bbid = keyboard.nextLine();
		
	String query7 = "SELECT COUNT(RID) AS TotalCountOfRentedBooks"
	                + " FROM RENT "
	                + " where bid =" +bbid;
	
	
	ResultSet rs7 = stat7.executeQuery(query7);
	
	System.out.println();
	System.out.println("TotalCountOfRentedBooks");
	
	 while (rs7.next())
	      {
	         String Tot_count = rs7.getString("TotalCountOfRentedBooks");
	         
	System.out.println(Tot_count);
	}
	
	System.out.println();
	rs7.close();
	
	}
	
	public static void Query8(Connection conn) throws SQLException
	{
	char esc = 27;
	      String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat1 = conn.createStatement();
	
	String query1 = "select r.*"
	                + " from MaxBookReant mr, RentBookCount r"
	                + " where mr.MaxBkCount = r.MostRent";
	ResultSet rs1 = stat1.executeQuery(query1);
	
	System.out.println();
	System.out.format("%-10s %-18s %-10s %-10s %-10s%n","BID","TITLE","ISBN","YEARISS","MOSTRENT");
	
	 while (rs1.next())
	      {
	         String bokid = rs1.getString("BID");
	         String ttl = rs1.getString("TITLE");
	         String isbnm = rs1.getString("ISBN");
	         String yriss = rs1.getString("YEARISS");
	         String mstrnt = rs1.getString("MOSTRENT");
	         	
	System.out.format("%-10s %-18s %-10s %-10s %-10s%n",bokid,ttl,isbnm,yriss,mstrnt);
	
	}
	 System.out.println();
		rs1.close();
	
	}

	public static void Query9(Connection conn) throws SQLException
	{
	char esc = 27;
	String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat9 = conn.createStatement();
	
	String query9 = "select ac.AID, ac.AFName, ac.ALName, ac.Aphone, ac.AEmail,ac.Bid, ac.Title, ac.AuthorBkRentCount"
            + " from AuthorBookRentCount ac, MaxAuthorBookRentCount mc"
            + " where ac.AuthorBkRentCount = mc.MCount";
	
	
	ResultSet rs9 = stat9.executeQuery(query9);
	
	System.out.println();
	System.out.format("%-5s %-18s %-18s %-10s %-18s %-5s %-20s %-5s%n","AID","AFNAME","ALNAME","APHONE","AEMAIL","BID","TITLE","AuthorBkRentCount");
	
	
	 while (rs9.next())
	      {
	         String A_ID = rs9.getString("AID");
	         String afnm = rs9.getString("AFNAME");
	         String alnm = rs9.getString("ALNAME");
	         String aphn = rs9.getString("APHONE");
	         String aeml = rs9.getString("AEMAIL");
	         String b_id = rs9.getString("BID");
	         String ttl = rs9.getString("TITLE");
	         String athrbk = rs9.getString("AuthorBkRentCount");
	         System.out.format("%-5s %-18s %-18s %-10s %-18s %-5s %-20s %-5s%n",A_ID,afnm,alnm,aphn,aeml,b_id,ttl,athrbk);
	         
	}
	 System.out.println();
		rs9.close();
	
	}
	

	public static void Query10(Connection conn) 
	{
		try{
	char esc = 27;
	String clear = esc + "[2J";
	System.out.print(clear);
	
	Statement stat10 = conn.createStatement();
Scanner keyboard=new Scanner(System.in);
	
	System.out.print("Enter the subject title :");
	String subj = keyboard.nextLine();
	
	String query10 = "SELECT  b.BID, b.Title, b.ISBN, b.YearIss"
            + " FROM    BOOK b , SUBJECT s"
            + " WHERE s.SubID = b.SId and b.BID not in ( select Bid from RENT) and s.SContent ='" + subj +"'";
	
	
	ResultSet rs10 = stat10.executeQuery(query10);
	
	System.out.println();
	System.out.format("%-10s %-18s %-10s %-10s%n","BID","TITLE","ISBN","YEARISS");
	
	
	 while (rs10.next())
	      {
	         String BID_ID = rs10.getString("BID");
	         String Book_titl = rs10.getString("TITLE");
	         String Book_isbn = rs10.getString("ISBN");
	         String YEar_issued = rs10.getString("YEARISS");
	         System.out.format("%-10s %-18s %-10s %-10s%n",BID_ID,Book_titl,Book_isbn,YEar_issued);
	         
	}
	 System.out.println();
		rs10.close();
		}
		catch(SQLException ex)
		{
			System.out.print("Errrrrrrror");
		}
	}
	
	public static void Query11(Connection conn) throws SQLException
	{
	char esc = 27;
	String clear = esc + "[2J";
	System.out.print(clear);
	
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.print("Enter the user id :");
	String uid = keyboard.nextLine();
	
	System.out.print("Enter the phone number :");
	String phn = keyboard.nextLine();
	
	Statement stat11 = conn.createStatement();
	String query11 = "UPDATE USERDETAILS"
            + " SET UPhone= " + phn
            + " WHERE USID = " + uid;
	
	
	stat11.executeUpdate(query11);
	System.out.println("phone number successfully updated into user table");
	System.out.println();
	
	
	}
	
	public static void Query12(Connection conn) throws SQLException
	{
	try {
	char esc = 27;
	String clear = esc + "[2J";
	System.out.print(clear);
	
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.print("Enter the librarian id :");
	String uid = keyboard.nextLine();
	
		
	Statement stat12 = conn.createStatement();
	String query12 = "DELETE FROM LIBRARIAN"
                        + " WHERE LibID = " + uid;
	
	
	stat12.executeUpdate(query12);
	System.out.println("Librarian details successfully deleted ");
	System.out.println();
	}
	catch(SQLException ex)
	{
		System.out.println("Error: Failed to delete due to FK constraint...");
	}
	}
	
	}