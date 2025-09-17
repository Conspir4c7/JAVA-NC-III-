package Task_Outputs;
class Task3 {
  public static void main(String[] args) {
String a = new String("Wow");
String b = "Wow";
String c = a;
String d = c;

boolean b1 = a != b;            // a and b are different objects → true
boolean b2 = d.equals(b);       // d is "Wow" and b is "Wow" → true
boolean b3 = c.equals(a);       // c equals a → true

if (b1 && b2 && b3) {
    System.out.println("Success!");
        }
    }
}
