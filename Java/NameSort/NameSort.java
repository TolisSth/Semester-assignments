import java.util.*;
public class NameSort {
   ArrayList<String> arrayOfNames  = new ArrayList<String>();

   public ArrayList<String> sortNames(){
        Collections.sort(arrayOfNames);
        return arrayOfNames;
   }

   public NameSort(ArrayList<String> name){
      if(name.size() > 6){
        System.out.println("Error: You can not add any other names.");
      }else {
          arrayOfNames.addAll(name);
      }
   }

}
