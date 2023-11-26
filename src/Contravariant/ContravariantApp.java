package Contravariant;

// # Contravariant
//   - Contravariant means we can substitute
//     supertype (parent) with subtype (child).
//   - The way to make our generic object contravariant
//     is to use the keyword (? super SubClass).
//   - This means that when we create an object 'Example<Object>',
//     it can be substituted into 'Example<? Super String>'.
//   - Contravariant means you can 'write and read',
//     but you need to be careful when reading,
//     especially if the parent has many children.
//
// # Summary
//  For this code it looks fine,
//  but it is dangerous when doing this 'String value = (String) myData.getData();'.
//  What's the danger? Because what is sent here 'process(MyData<? super String> myData)'
//  is 'MyData<Object>', meaning it can be set to anything, be it String / Integer / others.
//
//  # The Example
//  For example, a set 'objectMyData.Set(1000);' is valid,
//  because it is Generic type is Object. If you try to run it, an error will appear.
//  So you have to be careful when using 'Contravariant'.
//  Even though 'Contravariant' are safe for the set data,
//  they are not safe when getting the data.
//
//  # The Solution
//  The Solution is doesn't be forced to use Strings,
//  uses Objects as data values to avoid cast errors.
//
//  # The Solution Example
//  For Example, in 'process' method block
//  in line 'String value = (String) myData.getData();'
//  change to 'Object value = myData.getData();' it will be safe to get data.
//
public class ContravariantApp {
  public static void main(String[] args) {

    MyData<Object> objectMyData = new MyData<>("August");

    // # The Solution For this bad boy: Read Summary
    objectMyData.setData(1000);

    // Test declare variable
    MyData<? super String> myData = objectMyData;

    process(objectMyData);
    System.out.println("Result Mutation from Process: " +objectMyData.getData());
  }

  public static void process(MyData<? super String> myData) {
    // Why is this an error? Because myData is the super of String,
    // which is an Object, so it must be forced to cast to String.
    //
    // # Wrong Example
    // String value = myData.getData();
    //
    // # Is Correct Example,
    // but still get error cast when data set to except 'String' type.
    //
    // String value = (String) myData.getData();

    // # Solution Example: Read Summary to Details.
    Object value = myData.getData();

    // # Test to Check data
    System.out.println("Process Paramater: " + value);

    // # Mutation Example
    myData.setData("June");
  }
}