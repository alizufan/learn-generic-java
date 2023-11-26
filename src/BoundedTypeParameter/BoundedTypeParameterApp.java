package BoundedTypeParameter;

// # Bounded Type Parameter
//   - Sometimes we want to limit the data that
//     can be used in the generic parameter type.
//   - We can add constraints in the generic type
//     parameter by specifying the types that are allowed.
//   - Automatically, the data types that can be used are the
//     types that we have mentioned, or their derived classes.
//   - By default, the constraint type for generic
//     parameter types is Object, so all data types can be used.
//
public class BoundedTypeParameterApp {
  public static void main(String[] args) {
    NumberData<Integer> integerNumberData = new NumberData<>(1);
    NumberData<Long> longNumberData = new NumberData<>(1L);

    // Error:
    // Type parameter 'java.lang.String' is not within its bound;
    // should extend 'java.lang.Number'
    //
    // NumberData<String> stringNumberData = new NumberData<String>("August");
  }

  // What are the Benefits?
  // In 'NumberData' class, all methods in the 'Number' Class can automatically be accessed.
  //
  public static class NumberData<T extends Number> {
    private T data;

    public NumberData(T data) {
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
