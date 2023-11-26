package TypeErasure;

// # Type Erasure
//   - Type erasure is the process of checking generics at compile time,
//     and ignoring checks at runtime.
//   - Type erasure means that the generic information
//     we create will be lost when our program code
//     has been compiled into a binary file.
//   - The compiler will change the generic
//     parameter type to the Object type in Java.
//
// # Problem Type Erasure
//   - Because generic information is
//     lost when it becomes a binary file.
//   - Therefore, conversion to generic data types
//     will be dangerous if done unwisely.
//
public class TypeErasureApp {
  public static void main(String[] args) {

    // # Type Erasure Example
    // It can cause a problem, so be careful.
    //
    MyData myData = new MyData("August");

    // # Without Type Erasure Example
    // MyData<String> myData = new MyData<String>("August");

    // # Note:
    // You have to be careful when 'casting' to another type.
    MyData<Integer> integerMyData = (MyData<Integer>) myData;
    Integer integer = integerMyData.getData(); // Error
  }
}
