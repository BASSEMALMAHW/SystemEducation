package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:15 �
 */
public class Person {
//DataMember
    private String First_Name;
    private String Last_Name;
    private String National_Security_Number;

//Constructor
    public Person(String First_Name, String Last_Name, String National_Security_Number) {
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

//Copy Constructor
public Personaal Deep_Copy (Object obj){
        Personaal person = (Personaal)obj;
        this.First_Name = person.First_Name;
        this.Last_Name =person.Last_Name;
        this.National_Security_Number = person.National_Security_Number;

        return new Personaal(this.First_Name, this.Last_Name, this.National_Security_Number);
    }
//comparable
    public int compareTo(Object o) {
                // throw new UnsupportedOperationException("Not supported yet.");
        if (o instanceof Personaal)
        {
            Personaal person = (Personaal)o;
            if (this.First_Name.equals(person.First_Name))
            {
                  if (this.Last_Name.equals(person.Last_Name))
                  {
                       if (this.National_Security_Number == person.National_Security_Number)
                           return 0;
                       else
                           return -1;
                  }
                  else
                       return -1;
            }
            else
                return -1;
        }
        else
            return -1;


    }

    @Override
    public String toString() {
        return String.format("First name :%s   Last name :%s   Natinal Security Number :%i",this.First_Name,this.Last_Name,this.National_Security_Number);
    }


	public void finalize() throws Throwable {

	}

}