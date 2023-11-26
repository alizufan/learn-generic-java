package Invariant;

// # Invariant
//   - By default, when we create a generic parameter type,
//     the nature of the parameter is invariant.
//   - Invariant means it cannot be substituted with
//     a subtype (child) or supertype (parent).
//   - This means that when we create an object 'Example<String>',
//     it is not the same as 'Example<Object>', and vice versa,
//     when we create an object 'Example<Object>',
//     it is not the same as 'Example<String>'.
//
// # Note: Summary!
//   So there is no connection between
//   polymorphism / inheritance in generic.
//
public class InvariantApp {
  public static void main(String[] args) {
    MyData<String> dataString = new MyData<>("August");
    // # This will be error invariant,
    //    even though Object is a superclass of String/Integer/etc.
    //    Still cannot be lowered when using generic.
    //
    // MyData<Object> dataObject = dataString;
    // doSomething(dataString);

    MyData<Integer> dataInteger = new MyData<>(100);
    // # This will be error invariant,
    //    even though Object is a superclass of String/Integer/etc.
    //    Still cannot be lowered when using generic.
    //
    // MyData<Object> dataObject = dataInteger;
    // doSomething(dataInteger);

    MyData<Object> dataObject= new MyData<>(100);
    // # This will be error invariant,
    //    even though Object is a superclass of String/Integer/etc.
    //    Still cannot be lowered when using generic.
    //
    // doSomethingInteger(dataObject);

  }

  public static void doSomething(MyData<Object> object) {
    // do something
  }

  public static void doSomethingInteger(MyData<Integer> integer) {
    // do something integer
  }
}
