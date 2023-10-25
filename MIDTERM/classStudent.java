package activity;

public class classStudent {
   String firstName;
   String middleName;
   String lastName;
   String suffix;
   
   public classStudent() {
    
   }
 
// Getters  
   public String getFirstName() {
      return firstName;
   }
   
   public String getMiddleName() {
      return middleName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
// Setters
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }

   
// 
  public String getFullName() {
   return firstName+ " " +middleName+ " " +lastName+ " or " +suffix;
  }
  
} 