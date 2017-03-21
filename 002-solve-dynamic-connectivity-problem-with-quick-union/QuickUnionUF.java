import java.util.Arrays;

public class QuickUnionUF
{
  private int[] id; // access to component id (site indexed)
  private int count; // number of components

  public QuickUnionUF(int N)
  { // Initialize component id array.
    count = N;
    id = new int[N];
    for (int i = 0; i < N; i++)
      id[i] = i;
  }

  public int count()
  { return count; }

  public boolean connected(int p, int q)
  { return find(p) == find(q); }

  public int find(int p)
  { // Find component name.
    while (p != id[p]) p = id[p];
    return p;
  }

  public void union(int p, int q)
  { // Give p and q the same root.
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot) return;
    id[pRoot] = qRoot;
    count--;
  }

  public static void main(String[] args)
  { // Solve dynamic connectivity problem on StdIn.
    StdOut.println("Enter number of objects");
    int N = StdIn.readInt();
    QuickUnionUF uf = new QuickUnionUF(N);
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
