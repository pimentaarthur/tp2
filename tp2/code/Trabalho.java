import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.List;

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
        System.out.println(linha);
    }
    	buffRead.close();
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
    	 Integer yearOfBirth;
    	 String eyeColour;
    	 String gender;
    	 String hairColour;
    	 boolean wizard;

}


}