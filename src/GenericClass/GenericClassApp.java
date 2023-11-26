package GenericClass;

// # Generic Class
//  - Generic class is a class or interface that has a type parameter.
//  - There are no provisions for creating a generic parameter type,
//    but usually most people use 1 character as the generic parameter type.
//  - The name of the generic parameter type that is commonly used is:
//     + E - Element (usually used in collections or data structure)
//     + K - Key
//     + N - Number
//     + T - Type
//     + V - Value
//     + S, U, V etc. - 2nd, 3rd, 4th types
//
// # Multiple Parameter
//   - There can be more than one type parameter in a Generic class.
//   - However, you have to use a different type name
//   - This is very useful when we want to
//     create a lot of generic type parameters.
//
public class GenericClassApp {
  public static void main(String[] args) {
    // # Generic Object
    MyData<String> stringMyData = new MyData<String>("August");
    MyData<Integer> integerMyData = new MyData<Integer>(1000);

    // # Generic Object Value
    String stringValue = stringMyData.getData();
    Integer integerValue = integerMyData.getData();

    System.out.println(stringValue);
    System.out.println(integerValue);

    System.out.println();
    // # Generic Multiple Parameter Type Object
    Pair<String, Integer> pair = new Pair<String, Integer>("August Pair", 101);

    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
  }
}
