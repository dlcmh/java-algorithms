# Dynamic connectivity-client

Based on [Dynamic Connectivity - Princeton University | Coursera](https://www.coursera.org/learn/algorithms-part1/lecture/fjxHC/dynamic-connectivity) and Chapter 1.5 - Case Study: Union-Find of [Algorithms (4th Edition) by Robert Sedgewick & Kevin Wayne](https://www.amazon.com/Algorithms-4th-Robert-Sedgewick/dp/032157351X%3FSubscriptionId%3D0K1019RWK8CNM7CNZV82%26tag%3D0a0-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D032157351X).

Steps:

```bash
javac UF.java
java UF
4 # number of objects
0 1 # first pair of objects -> union(0, 1)
0 1 # new pair of objects created
1 0 # next pair of objects -> no response as this connection
    # (Symmetric : x.equals(y) is true if and only if y.equals(x)) already exists
2 3 # next pair of objects
2 3 # new pair of objects created
2 components # final solution displayed after pressing ctrl-d
```
