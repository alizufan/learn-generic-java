package BoundedTypeParameter;

// # Multiple Bounded Type Parameter
//   - Sometimes we want to limit the data type to
//     several data types in the generic parameter type.
//   - We can add several bounded type parameters with
//     the & character after the first bounded type.
//   - If you want to add more, use the character &
//     followed by the bounded type again.
//
public class MultipleBoundedTypeParameterApp {
  public static void main(String[] args) {
    // Error: Because 'Manager' class don't implement a 'Greet' interface.
    //
    // Data<Manager> managerData = new Data<>(new Manager());
    Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
  }

  public static interface Greet {
    void sayHi(String Name);
  }

  public static abstract class Employee {}

  public static  class Manager extends Employee {}

  public static  class VicePresident extends Employee implements Greet {
    @Override
    public void sayHi(String name) {
      System.out.println("Hi " + name);
    }
  }

  // # Note:
  // You can only have one parent class,
  // if you want to add more,
  // you have to add an interface in 'extends' with separator '&' symbol.
  //
  // Example:
  // - 'public static class Data<T extends Employee & Greet & Meet & MakeCoffee>'
  public static class Data<T extends Employee & Greet> {
    private T data;

    public Data(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }
}
