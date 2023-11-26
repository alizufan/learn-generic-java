package Wildcard;

import BoundedTypeParameter.MultipleBoundedTypeParameterApp;

// # Wildcard
//   - Sometimes there are cases where we don't care about
//     the generic parameter type on the object'
//   - For example, we only want to print T data, no matter what type'
//   - If we experience a case like this, we can use wildcards'
//   - Wildcards can be created by replacing the generic parameter
//     type with the character '?'.
//
public class WildcardApp {
  public static void main(String[] args) {
    print(new MyData<Integer>(1));
    print(new MyData<String>("August"));
    print(new MyData<MultipleBoundedTypeParameterApp.VicePresident>(new MultipleBoundedTypeParameterApp.VicePresident()));
  }

  // # Note:
  //   - Must careful to cast data.
  //     Because the object parameters are too free.
  //
  public static void print(MyData<?> myData) {
    System.out.println(myData.getData());
  }
}
