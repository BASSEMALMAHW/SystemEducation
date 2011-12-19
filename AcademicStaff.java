package SystemEducation;


/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:09 �
 */
public class AcademicStaff extends Person {

//Data Method
        private AcademicDegree Academic_Degree;
        private int Degree_Year;
        
//Costructor
    public AcademicStaff(String First_Name, String Last_Name, String National_Security_Number, AcademicDegree Academic_Degree, int Degree_Year) {
        super(First_Name, Last_Name, National_Security_Number);
        setAcadimec_Degree(Academic_Degree);
        setDegree_Year(Degree_Year);
    }

//Method Set
    public void setAcadimec_Degree(AcademicDegree Academic_Degree) {
        this.Academic_Degree = Academic_Degree;
    }

    public void setDegree_Year(int Degree_Year) {
        this.Degree_Year = Degree_Year;
    }
//Method Get
    public AcademicDegree getAcadimec_Degree() {
        return Academic_Degree;
    }

    public int getDegree_Year() {
        return Degree_Year;
    }



	public void finalize() throws Throwable {
		super.finalize();
	}

}