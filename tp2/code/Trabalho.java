import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class Trabalho {
	        public static void main(String args[]) throws IOException {

            String path = "C:\\Users\\Administrator\\Desktop\\tp2\\code\\characters.csv";
            leitor(path);
        }
    

    public static void leitor(String path) throws IOException {
		
    	BufferedReader buffRead = new BufferedReader(new FileReader(path));
    	String linha = buffRead.readLine(); 
      while ((linha = buffRead.readLine()) != null) {
        String[] dados = linha.split(";");  
		
		
		
}

}



public class Personagem {
       
	 String id;
	 String name;
	 String alternateNames;
	 String house;
	 String ancestry;
	 String species;
	 String patronus;
	 boolean hogwartsStaff;
	 boolean hogwartsStudent;
	 String actorName;
	 boolean alive;
	 LocalDate dateOfBirth;
	 int yearOfBirth;
	 String eyeColour;
	 String gender;
	 String hairColour;
	 boolean wizard;


	 public Personagem(String id,String name,String alternateNames,String house,String ancestry,String species,String patronus,boolean hogwartsStaff,boolean hogwartsStudent,
	 String actorName,boolean alive,LocalDate dateOfBirth,int yearOfBirth,String eyeColour,String gender,String hairColour,boolean wizard){
					
			this.id = id;
			this.name = name;
			this.alternateNames = alternateNames;
			this.house = house;
			this.ancestry = ancestry;
			this.species = species;
			this.patronus = patronus;
			this.hogwartsStaff = hogwartsStaff;
			this.hogwartsStudent = hogwartsStudent;
			this.actorName = actorName;
			this.alive = alive;
			this.dateOfBirth = dateOfBirth;
			this.yearOfBirth = yearOfBirth;
			this.eyeColour = eyeColour;
			this.gender = gender;
			this.hairColour = hairColour;
			this.wizard = wizard;
		}

		public String getid(){
			return id;
		}

		public void setid(String id){
			this.id = id;
		}

		public String getname(){
			return name;
		}

		public void setname(String name){
			this.name = name;
		}

		public String getalternateNames(){
			return alternateNames;
		}

		public void setalternateNames(String alternateNames){
			this.alternateNames = alternateNames;
		}

		public String gethouse(){
			return house;
		}

		public void sethouse(String house){
			this.house = house;
		}

		public String getspecies(){
			return species;
		}

		public void setspecies(String ancestry){
		this.species = species;
        }

		public String getpatronus(){
			return patronus;
		}

		public void setpatronus(String patronus){
			this.patronus = patronus;
		}

		public boolean gethogwartsStaff(){
			return hogwartsStaff;
		}

		public void sethogwartsStaff(){
			this.hogwartsStaff = hogwartsStaff;
		}

		public boolean gethogwartsStudent(){
			return hogwartsStudent;
		}

		public void sethogwartsStudent(){
			this.hogwartsStudent = hogwartsStudent;
		}

		public String getactorName(){
			return actorName;
		}

		public void setactorName(){
			this.actorName = actorName;
		}

		public boolean getalive(){
			return alive;
		}

		public void setalive(){
			this.alive = alive;
		}

		public LocalDate getdateOfBirth(){
			return dateOfBirth;
		}

		public void setdateOfBirth(){
			this.dateOfBirth = dateOfBirth;
		}

		public int getyearOfBirth(){
			return yearOfBirth;
		}

		public void setyearOfBirth(){
			this.yearOfBirth = yearOfBirth;
		}

		public String geteyeColour(){
			return eyeColour;
		}

		public void seteyeColour(){
			this.eyeColour = eyeColour;
		}

		public String getgender(){
			return gender;
		}

		public void setgender(){
			this.gender = gender;
		}

		public String gethairColour(){
			return hairColour;
		}

		public void sethairColour(){
			this.hairColour = hairColour;
		}

		public boolean getwizard(){
			return wizard;
		}

		public void setwizard(){
			this.wizard = wizard;
		}
		
}
}
