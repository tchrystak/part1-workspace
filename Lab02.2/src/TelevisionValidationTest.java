public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.setBrand("Samsung");
    System.out.println(tv);

    tv.setBrand("LG"); // Should print LG
    System.out.println(tv);

    tv.setBrand("Sony"); // Should print Sony
    System.out.println(tv);

    tv.setBrand("Samsung"); // Should print Samsung
    System.out.println(tv);

    tv.setBrand("Vizio"); // Should print error message
    System.out.println(tv);
  }
}
