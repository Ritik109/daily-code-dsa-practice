package practiceJava2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
   private int id;
   private String employeeName;
   private String employeeDepartment;
   private int salary;

   @Override
   public int hashCode(){
      return this.getId();
   }

   @Override
   public boolean equals(Object e2){
      if (this==e2)
         return true;
      else
         return false;

   }
}
