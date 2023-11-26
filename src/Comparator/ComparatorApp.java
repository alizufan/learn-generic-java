package Comparator;

import java.util.Arrays;
import java.util.Comparator;

// # Comparator
//   - If we want to sort the classes we use,
//     it's quite easy just to implement the Comparable interface.
//   - But what if the class belongs to someone else?
//     Can't we change it?
//   - Then we can use a generic interface called Comparator.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Comparator.html
//
public class ComparatorApp {
  public static void main(String[] args) {
    Person[] people = {
            new Person("November", "Indonesia"),
            new Person("June", "Indonesia"),
            new Person("August", "Indonesia"),
    };

    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Arrays.sort(people, comparator);
    System.out.println(Arrays.toString(people));
  }
}
