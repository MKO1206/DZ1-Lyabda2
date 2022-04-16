package calc;

import java.util.function.*;

  public class Calculator {
     static Supplier<Calculator> instance = Calculator::new;

     BinaryOperator<Integer> plus = Integer::sum;
     BinaryOperator<Integer> minus = (x, y) -> x - y;
     BinaryOperator<Integer> divide = (x, y) -> x / y;

     UnaryOperator<Integer> abs = x -> x >= 0 ? x : x * -1;

     Consumer<Integer> println = System.out::println;
  }