// # Generic
//   - Generic is the ability to add type parameters
//     when creating a class or method.
//   - Different from the data types that we usually use in classes in functions,
//     generic allows us to change the form of the data type according to what we want.
//
// # Benefit
//   - Checking during the compilation process.
//   - No need to manually use data type checking and data type conversion.
//   - Makes it easier for programmers to create generic program code
//     so that it can be used by various data types.
//
public class Generic {
  public static void main(String[] args) {
    // # Without Generic
    WithoutGenericData dataString = new WithoutGenericData();
    dataString.setData("August Non-Generic");

    // this type check and cast in runtime, and type check & cast is not secure.
    String value = (String) dataString.getData();
    System.out.println(value);

    // # With Generic
    WithGenericData<String> dataString2 = new WithGenericData<String>();
    dataString2.setData("August Generic");

    // this type check and cast in compile time,
    // type check & cast is more secure than non-generic.
    String value2 = dataString2.getData();
    System.out.println(value2);

  }
}