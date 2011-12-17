package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:15 �
 */
public class Personaal {
//DataMember
    private String First_Name;
    private String Last_Name;
    private String National_Security_Number;

//Constructor
    public Personaal(String First_Name, String Last_Name, String National_Security_Number) {
         setFirst_Name(First_Name);
         setLast_Name(Last_Name);
         setNational_Security_Number(National_Security_Number);
    }

//Method Set
    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setNational_Security_Number(String National_Security_Number) {
        this.National_Security_Number = National_Security_Number;
    }

//Method Get
    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getNational_Security_Number() {
        return National_Security_Number;
    }



	public void finalize() throws Throwable {

	}

}