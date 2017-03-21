import java.util.Arrays;

public class WeightedQuickUnionUF
{
  private int[] id; // parent link (site indexed)
  private int[] sz; // size of component for roots (site indexed)
  private int count; // number of components

  public WeightedQuickUnionUF(int N)
  { // Initialize component id array.
    count = N;
    id = new int[N];
    for (int i = 0; i < N; i++) id[i] = i;
    sz = new int[N];
    for (int i = 0; i < N; i++) sz[i] = 1;
  }

  public int count()
  { return count; }

  public boolean connected(int p, int q)
  { return find(p) == find(q); }

  private int find(int p)
  { // Follow links to find a root.
    while (p != id[p]) p = id[p];
    return p;
  }

  public void union(int p, int q)
  {
    int i = find(p);
    int j = find(q);
    if (i == j) return;

    // Make smaller root (in terms of number of nodes) point to a larger one.
    if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
    else               { id[j] = i; sz[i] += sz[j]; }
    count--;
  }

  public static void main(String[] args)
  { // Solve dynamic connectivity problem on StdIn.
    StdOut.println("Enter number of objects");
    int N = StdIn.readInt();
    WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
    StdOut.println("init -> " + Arrays.toString(uf.id));
    StdOut.println("Enter a pair of objects to connect (eg 4 3, or ctrl-d to display final solution)");
    while (!StdIn.isEmpty())
    {
      int p = StdIn.readInt();
      int q = StdIn.readInt(); // Read pair to connect.
      if (uf.connected(p, q)) continue; // Ignore if connected.
      uf.union(p, q);
      StdOut.println("union (" + p + ", " + q + ") -> " + Arrays.toString(uf.id));
      StdOut.println("Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)");
    }
    StdOut.println(uf.count() + " components");
  }
}
