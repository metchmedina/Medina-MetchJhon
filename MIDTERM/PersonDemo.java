public class PersonDemo {
   public static void main(String[] args){
      Person person = new Person();
     
    
      person.setFirstName("MetchJhon"); 
      person.setMiddleName("Torres");
      person.setLastName("Medina");
      person.setAge(20);
      person.setBday("November 22, 2002");
      person.setAddress("Ibabao Mambaling Cebu City"); 
      
      
     System.out.println("First Name: " +person.getFirstName());
     System.out.println("Middle Name: " +person.getMiddleName());
     System.out.println("Last Name: " +person.getLastName());
     System.out.println("Age: " +person.getAge());
     System.out.println("BirthDay: " +person.getBday());
     System.out.println("Address: " +person.getAddress());
   
 
 }
}
