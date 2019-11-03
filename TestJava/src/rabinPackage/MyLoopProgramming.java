/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int Age=1; Age<20; Age=Age+1)
{
	System.out.println("Age: " +Age);
}
	}

}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
for (int Address=5820; Address<6000; Address=Address+10)
{
	System.out.println("Address to visit: " +Address);
}
	}

}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
int Height=6;
while (Height<8)
{
	System.out.println("Patient Height: " +Height);
	Height= Height +1 ;
}
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
int zipcode=22385;
do
{
	System.out.println("Zipcode: " +zipcode);
	zipcode=zipcode+2;
}
while (zipcode<22400);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String[] Name ={"John","David","Paul","Matt"};
System.out.println("CorrectName: " +Name[2]);
System.out.println("WrongName: " +Name[3]);
System.out.println("Number of Person: " +Name.length);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
int[] PatientID= {234,345,456,567,678};
System.out.println("Correct Pt. ID: " +PatientID[0]);
System.out.println("Incorrect Pt. ID: " +PatientID[3]);
System.out.println("Total No. of Patient: " +PatientID.length);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement="I am very happy.";
System.out.println(Statement);
int LengthofStatement=Statement.length();
System.out.println("Number of letters: " +LengthofStatement);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy";
String Statement2="  and energized.  ";
System.out.println("Combined Statement: " +Statement1+Statement2);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy,";
String Statement2="  energized  ";
String Statement3="   and excited.   ";
System.out.println("Combined Statement: " +Statement1+Statement2+Statement3);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy";
String Statement2="     and energized.      ";
System.out.println("Combined Statement: " +Statement1.concat(Statement2));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy,";
String Statement2="     energized     ";
String Statement3="   and excited.   ";
System.out.println("Combined Statement: " +Statement1.concat(Statement2).concat(Statement3));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="I am very very happy";
String Statement3="I am very happy.";
String Statement4="i am very happy.";
System.out.println("Comparing Stat1 & Stat2: " +Statement1.equals(Statement2));
System.out.println("Comparing Stat1 & Stat3: " +Statement1.equals(Statement3));
System.out.println("Comparing Stat1 & Stat4: " +Statement1.equals(Statement4));
System.out.println("Comparing Stat3 & Stat4: " +Statement3.equals(Statement4));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="I am very very happy";
String Statement3="I am very happy.";
String Statement4="i am very happy.";
boolean Compare3_4=Statement3.equals(Statement4);
boolean Compare1_3=Statement1.equals(Statement3);
System.out.println("Correct Statement: " +Statement1);
System.out.println("Comparing Stat2 & Stat3: " +Compare3_4);
System.out.println("Comparing Stat1 & Stat3: " +Compare1_3);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="You are sad.";
System.out.println("Character at 8: " +Statement1.charAt(8));
System.out.println("Character at 6: " +Statement2.charAt(6));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="You are sad.";
System.out.println("Location of h: " +Statement1.indexOf('h'));
System.out.println("Character at a: " +Statement2.indexOf("a"));
System.out.println("Character at d: " +Statement2.indexOf("d"));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="YOU ARE SAD.";
System.out.println("UPPERCASE STATEMENT: " +Statement1.toUpperCase());
System.out.println("lowercase statement: " +Statement2.toLowerCase());
String CombineStatement=Statement1+Statement2;
System.out.println("UPPERCASE Combine Statement: " +CombineStatement.toUpperCase());
System.out.println("lowercase combine statement: " +CombineStatement.toLowerCase());
}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy,";
String Statement2="     energized     ";
String Statement3="   and excited.   ";
System.out.println("Trimmed Statement2: " +Statement2.trim());
System.out.println("Trimmed Statement3: " +Statement3.trim());
String Trimmed2=Statement2.trim();
String Trimmed3=Statement3.trim();
System.out.println("Trimmed & Combined Statement: " +Statement1+Trimmed2+Trimmed3);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="I am very happy.";
String Statement2="I am very very happy";
String Statement3="I am very happy.";
String Statement4="i am very happy.";
System.out.println("location of very in Stat2: " +Statement2.indexOf("very"));
System.out.println("location of happy in Stat4: " +Statement4.indexOf("happy"));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
int HouseNumber=5820;
String HouseAddress=" Myrtle Avenue, Ridgewood, NY ";
int ZipCode=11385;
String House_Number=String.valueOf(HouseNumber);
String Zip_Code=String.valueOf(ZipCode);
System.out.println("Full Address: " +House_Number+HouseAddress+Zip_Code);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String HouseNumber="5820";
String HouseAddress=" Myrtle Avenue, Ridgewood, NY ";
String ZipCode="11385";
int House_Number=Integer.parseInt(HouseNumber);
int Zip_Code=Integer.parseInt(ZipCode);
int Added_value=House_Number+Zip_Code;
System.out.println("Added both value: " +Added_value);
System.out.println("Full Address: " +House_Number+HouseAddress+Zip_Code);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Address="5820 Myrtle Avenue Ridgewood NY 11385";
String[] text=Address.split(" ");
System.out.println("House Number: " +text[0]);
System.out.println("Street: " +text[1]+text[2]);
System.out.println("City: " +text[3]);
System.out.println("State: " +text[4]);
System.out.println("Zipcode: " +text[5]);

	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Person_Info="Rabin Pradhananga 30 M NY NY USA";
String[] text=Person_Info.split(" ");
System.out.println("FistName: " +text[0]);
System.out.println("LastName: " +text[1]);
System.out.println("Age: " +text[2]);
System.out.println("Sex: " +text[3]);
System.out.println("City: " +text[4]);
System.out.println("State: " +text[5]);
System.out.println("Country: " +text[6]);
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Person_Info="Rabin Pradhananga 30 M NY NY USA";
String Address="5820 Myrtle Avenue Ridgewood NY 11385";
String Zipcode="11385";
System.out.println("Contains Address: " +Person_Info.contains(Address));
System.out.println("Contains Zipcode: " +Person_Info.contains(Zipcode));
System.out.println("Contains Zipcode: " +Address.contains(Zipcode));
	}
}
*/

/*
package rabinPackage;

public class MyLoopProgramming {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
String Statement1="The population of the world is more than 6 billions.";
String Statement2="The population of the world";
String Statement3="more than 6 billions";
System.out.println("Contains The population of the world: " +Statement1.contains(Statement2));
System.out.println("Contains more than 6 billions: " +Statement1.contains(Statement3));
System.out.println("Contains more than 6 billions in Stat2: " +Statement2.contains(Statement3));
	}
}
*/
