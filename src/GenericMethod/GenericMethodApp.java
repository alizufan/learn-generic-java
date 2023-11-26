package GenericMethod;

// # Generic Method
//   - Generic parameter types cannot only be used in classes or interfaces.
//   - We can also use generic type parameters in methods.
//   - The generic parameter type that we declare in a method
//     can only be accessed in that method,
//     cannot be used outside the method.
//   - This is suitable if we want to create a generic method,
//     without having to change the class declaration.
//
public class GenericMethodApp {
  public static void main(String[] args) {
    String[] names = {"August", "The", "Destiny"};
    Integer[] values = {1, 2, 3, 4, 5, 6, 7};

    // # Manual Adds Generic Parameter Type (Optional).
    System.out.println(ArrayHelper.<String>count(names));

    // # Automatically Add Generic Parameter Type.
    System.out.println(ArrayHelper.count(values));
  }
}
