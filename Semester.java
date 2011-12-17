package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-���������-2011 08:03:16 �
 */
public class Semester {

	
//Data Member
        private int Distinguishing_Number;
        private int Present_Year;
        private int Finishing_Date;
        
//Constractor
    public Semester(int Distinguishing_Number, int Present_Year, int Finishing_Date) {
        setDistinguishing_Number(Distinguishing_Number);
        setFinishing_Date(Finishing_Date);
        setPresent_Year(Present_Year);
    }

//Method_Set
        public void setDistinguishing_Number(int Distinguishing_Number) {
            this.Distinguishing_Number = (Distinguishing_Number > 0 && Distinguishing_Number < 4 ? Distinguishing_Number :0 );
        }

        public void setFinishing_Date(int Finishing_Date) {
            this.Finishing_Date = Finishing_Date;
        }

        public void setPresent_Year(int Present_Year) {
            this.Present_Year = Present_Year;
        }
//Method Get
        public int getDistinguishing_Number() {
            return Distinguishing_Number;
        }

        public int getFinishing_Date() {
            return Finishing_Date;
        }

        public int getPresent_Year() {
            return Present_Year;
        }

	public void finalize() throws Throwable {

	}

}