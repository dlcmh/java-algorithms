public class Gcd {
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);
    int result = gcd(p, q);
    System.out.println(result);
  }

  private static int gcd(int p, int q) {
    if (q == 0) return p;
    int remainder = p % q;
    return gcd(q, remainder);
  }
}
