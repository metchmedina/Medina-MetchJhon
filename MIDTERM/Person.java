   public class Person {
      private String firstName;
      private String middleName;
      private String lastName;
      private int age;
      private String bday;
      private String address;
   
// These are the Getter 
   public String getFirstName() {return firstName;}
   public String getMiddleName() {return middleName;}
   public String getLastName() {return lastName;}
   public int getAge() {return age;}
   public String getBday() {return bday;}
   public String getAddress() {return address;}
   
  
// These are the Setter  
   public void setFirstName(String newFirstName){
      this.firstName = newFirstName;
   }
   public void setMiddleName(String newMiddleName){
      this.middleName = newMiddleName;
   }
   public void setLastName(String newLastName){
      this.lastName = newLastName;
   }
   public void setAge(int newAge){
      this.age = newAge;
   }
   public void setBday(String newBday){
      this.bday = newBday;
   }
   public void setAddress(String newAddress){
      this.address = newAddress;
   } 
}   
   
 