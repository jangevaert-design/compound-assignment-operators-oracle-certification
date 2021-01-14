package edu.cnm.deepdive;

public class CompoundAssignmentOperators {

  public static void main(String[] args) {
    int x = 2;
    int z = 3;
    x = x * z;// simple assignment.
    x *= z; // shorter form of x = x * z.

    //int a += 5; does not compile because a does not have an initial value.
    long a = 10;
    int b = 4;
    //b = b * a; does not compile because the result is promoted to long and we try to assign it to
    //int.

    b = (int) (b * a); // would be a solution.
    b *= a; // does compile and is shorter.


  }
}
