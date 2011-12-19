package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:17 �
 */
public class Student extends Person {

//Data Member
        private int ID;
        private static int I_D;

//Constructor
	public Student(String First_Name, String Last_Name, String National_Security_Number){
         super( First_Name, Last_Name, National_Security_Number);
         this.I_D  = I_D + 1 ;
         this.ID = this.I_D ;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}