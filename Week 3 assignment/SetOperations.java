

package Aassignment;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
   public static void main(String[] args) {
      Set<String> firstStack = new HashSet<>();
      firstStack.add("Chemistry");
      firstStack.add("Mathematics");
      firstStack.add("Biology");
      firstStack.add("English");
   
      Set<String> secondStack = new HashSet<>();
      secondStack.add("Biology");
      secondStack.add("English");
      secondStack.add("Geography");
      secondStack.add("Physics");
   
      Set<String> firstStackOnly = new HashSet<>(firstStack);
      firstStackOnly.removeAll(secondStack);
      System.out.println("Subjects only present in first stack: " + firstStackOnly);
   
      Set<String> secondStackOnly = new HashSet<>(secondStack);
      secondStackOnly.removeAll(firstStack);
      System.out.println("Subjects only present in second stack: " + secondStackOnly);
   
      Set<String> bothStacks = new HashSet<>(firstStack);
      bothStacks.retainAll(secondStack);
      System.out.println("Subjects present in both stacks: " + bothStacks);
   }
}
