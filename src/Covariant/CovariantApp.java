package Covariant;

// # Covariant
//   - Covariant means we can substitute
//     subtype (child) with supertype (parent).
//   - The way to make our generic object covariant
//     is to use the keyword (? extends ParentClass).
//   - This means that when we create an 'Example<String>' object,
//     it can be substituted into 'Example<? Extends Object>'.
//   - Covariant is 'read-only',
//     so we cannot change the generic data.
//
public class CovariantApp {
  public static void main(String[] args) {
    MyData<String> dataString = new MyData<>("August");
    process(dataString);
  }

  // # This is a Covariant.
  public static void process(MyData<? extends Object> myData) {
    System.out.println(myData.getData());

    // # Reason And Explanation
    // Why it can not? Because MyData is Object.
    // The problem is that for example 'myData.setData(1)' is accepted
    // because 'Integer' is an instance of object.
    //
    // This will cause problems and be dangerous.
    // Therefore, in Covariant we can only retrieve data (read-only),
    // because if we could change the data, it would be dangerous.
    //
    // myData.setData(1);
  }
}
