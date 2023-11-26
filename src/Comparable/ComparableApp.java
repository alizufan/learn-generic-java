package Comparable;

import java.util.Arrays;

// # Comparable
//   - Previously we already knew that
//     the object comparison operator uses the equal method.
//   - What about other comparison operators?
//     Like less than or more than?.
//   - We can do this comparison operator if
//     our object inherits the generic Comparable interface.
//   - This is widely used, such as for
//     data sorting processes, for example.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Comparable.html
//
public class ComparableApp {
  public static void main(String[] args) {
    Person[] people = {
      new Person("November", "Indonesia"),
      new Person("June", "Indonesia"),
      new Person("August", "Indonesia"),
    };

    Arrays.sort(people);
    System.out.println(Arrays.toString(people));
  }
}
