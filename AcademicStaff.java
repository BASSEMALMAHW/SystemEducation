package SystemEducation;


/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:09 �
 */
public class AcademicStaff extends Personaal {

//Data Method
        private String Acadimec_Degree;
        private int Degree_Year;
        
//Costructor
    public AcademicStaff(String First_Name, String Last_Name, String National_Security_Number, String Acadimec_Degree, int Degree_Year) {
        super(First_Name, Last_Name, National_Security_Number);
        setAcadimec_Degree(Acadimec_Degree);
        setDegree_Year(Degree_Year);
    }

//Method Set
    public void setAcadimec_Degree(String Acadimec_Degree) {
        this.Acadimec_Degree = Acadimec_Degree;
    }

    public void setDegree_Year(int Degree_Year) {
        this.Degree_Year = Degree_Year;
    }
//Method Get
    public String getAcadimec_Degree() {
        return Acadimec_Degree;
    }

    public int getDegree_Year() {
        return Degree_Year;
    }



	public void finalize() throws Throwable {
		super.finalize();
	}

}