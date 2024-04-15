import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Trabalho {
    public static void main(String[] args) {
        String path = "C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\characters.csv";
        try {
            ArrayList<Personagem> personagens = leitor(path);
            Scanner scanner = new Scanner(System.in);
           
            String leitor = scanner.nextLine(); 

            while (!"FIM".equalsIgnoreCase(leitor)) {
                boolean found = false;
                for (Personagem p : personagens) {
                    if (p.getid().equals(leitor)) {
                        System.out.println(p);
                        found = true;
                        
                    }
                }
                if (!found) {
                   
                }
                leitor = scanner.nextLine(); // Lê o próximo ID
            }
            scanner.close();
        } catch (IOException e) {
            
        }
    }

    public static ArrayList<Personagem> leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        ArrayList<Personagem> personagens = new ArrayList<>(); 
        String linha = buffRead.readLine(); 

        while ((linha = buffRead.readLine()) != null) {
            String[] dados = linha.split(";");

            Personagem personagem = new Personagem(); 

            personagem.setid(dados[0]);
            personagem.setname(dados[1]);
            personagem.setalternateNames(dados[2]);
            personagem.sethouse(dados[3]);
            personagem.setancestry(dados[4]);
            personagem.setspecies(dados[5]);
            personagem.setpatronus(dados[6]);
            personagem.sethogwartsStaff(dados[7].equalsIgnoreCase("VERDADEIRO"));
            personagem.sethogwartsStudent(dados[8].equalsIgnoreCase("VERDADEIRO"));
            personagem.setactorName(dados[9]);
            personagem.setalive(dados[10].equalsIgnoreCase("VERDADEIRO"));
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date data = formato.parse(dados[12]); 
                personagem.setdateOfBirth(data);
            } catch (ParseException e) {
            }

            personagem.setyearOfBirth(Integer.parseInt(dados[13])); 
            personagem.seteyeColour(dados[14]);
            personagem.setgender(dados[15]);
            personagem.sethairColour(dados[16]);
            personagem.setwizard(dados[17].equalsIgnoreCase("VERDADEIRO"));

            personagens.add(personagem); 
        }
        buffRead.close();
        return personagens;
    }

    public static class Personagem {
       
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
        Date dateOfBirth;
        int yearOfBirth;
        String eyeColour;
        String gender;
        String hairColour;
        boolean wizard;
   
        public Personagem(){}
   
   
        public Personagem(String id,String name,String alternateNames,String house,String ancestry,String species,String patronus,boolean hogwartsStaff,boolean hogwartsStudent,
        String actorName,boolean alive, Date dateOfBirth,int yearOfBirth,String eyeColour,String gender,String hairColour,boolean wizard){
                       
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
   
           public String getancestry(){
               return ancestry;
           }
   
           public void setancestry(String ancestry){
               this.ancestry = ancestry;
           }
   
           public String getspecies(){
               return species;
           }
   
           public void setspecies(String species){
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
   
           public void sethogwartsStaff(boolean hogwartsStaff){
               this.hogwartsStaff = hogwartsStaff;
           }
   
           public boolean gethogwartsStudent(){
               return hogwartsStudent;
           }
   
           public void sethogwartsStudent(boolean hogwartsStudent){
               this.hogwartsStudent = hogwartsStudent;
           }
   
           public String getactorName(){
               return actorName;
           }
   
           public void setactorName(String actorName){
               this.actorName = actorName;
           }
   
           public boolean getalive(){
               return alive;
           }
   
           public void setalive(boolean alive){
               this.alive = alive;
           }
   
           
           public Date getdateOfBirth(){
               return dateOfBirth;
           }
   
           public void setdateOfBirth(Date dateOfBirth){
               this.dateOfBirth = dateOfBirth;
           } 
           
   
           public int getyearOfBirth(){
               return yearOfBirth;
           }
   
           public void setyearOfBirth(int yearOfBirth){
               this.yearOfBirth = yearOfBirth;
           }
   
           public String geteyeColour(){
               return eyeColour;
           }
   
           public void seteyeColour(String eyeColour){
               this.eyeColour = eyeColour;
           }
   
           public String getgender(){
               return gender;
           }
   
           public void setgender(String gender){
               this.gender = gender;
           }
   
           public String gethairColour(){
               return hairColour;
           }
   
           public void sethairColour(String hairColour){
               this.hairColour = hairColour;
           }
   
           public boolean getwizard(){
               return wizard;
           }
   
           public void setwizard(boolean wizard){
               this.wizard = wizard;
           }
           @Override

		   
           public String toString() {
               return "[" + id  +
                      " ## " + name +
					  " ## " + alternateNames +
					  " ## " + house + 
					  " ## " + ancestry + 
					  " ## " + species + 
					  " ## " + patronus + 
					  " ## " + hogwartsStaff + 
					  " ## " + hogwartsStudent + 
					  " ## " + actorName + 
					  " ## " + alive + 
					  " ## " + dateOfBirth + 
					  " ## " + yearOfBirth + 
					  " ## " + eyeColour +
					  " ## " + gender +
					  " ## " + hairColour +
					  " ## " + wizard +
                      ']';
           }
           
   }
       
    }

