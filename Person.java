package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:15 �
 */
public class Person  implements Comparable,Cloneable{
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
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = new Person(this.getFirst_Name(), this.getLast_Name(), this.getNational_Security_Number());
        return person;
    }
//comparable
    public int compareTo(Object o) {
                // throw new UnsupportedOperationException("Not supported yet.");
        if (o instanceof Person)
        {
            Person person = (Person)o;
            if (this.getFirst_Name().equals(person.getFirst_Name()))
            {
                  if (this.getLast_Name().equals(person.getLast_Name()))
                  {
                       if (this.getNational_Security_Number() == person.getNational_Security_Number())
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
        return String.format("First name :%s   Last name :%s   Natinal Security Number :%i",this.getFirst_Name(),this.getLast_Name(),this.getNational_Security_Number());
    }


	public void finalize() throws Throwable {

	}

}