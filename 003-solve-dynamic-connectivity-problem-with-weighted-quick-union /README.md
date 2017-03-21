# Solve Dynamic Connectivity problem with Weighted Quick-Union

Based on [Quick-Union Improvements - Princeton University | Coursera](https://www.coursera.org/learn/algorithms-part1/lecture/RZW72/quick-union-improvements) and Chapter 1.5 - Case Study: Union-Find of [Algorithms (4th Edition) by Robert Sedgewick & Kevin Wayne](https://www.amazon.com/Algorithms-4th-Robert-Sedgewick/dp/032157351X%3FSubscriptionId%3D0K1019RWK8CNM7CNZV82%26tag%3D0a0-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D032157351X).

Steps:

```bash
javac WeightedQuickUnionUF.java

java WeightedQuickUnionUF
Enter number of objects
10
init -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Enter a pair of objects to connect (eg 4 3, or ctrl-d to display final solution)
4 3
union (4, 3) -> [0, 1, 2, 4, 4, 5, 6, 7, 8, 9]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
3 8
union (3, 8) -> [0, 1, 2, 4, 4, 5, 6, 7, 4, 9]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
6 5
union (6, 5) -> [0, 1, 2, 4, 4, 6, 6, 7, 4, 9]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
9 4
union (9, 4) -> [0, 1, 2, 4, 4, 6, 6, 7, 4, 4]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
2 1
union (2, 1) -> [0, 2, 2, 4, 4, 6, 6, 7, 4, 4]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
8 9
5 0
union (5, 0) -> [6, 2, 2, 4, 4, 6, 6, 7, 4, 4]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
7 2
union (7, 2) -> [6, 2, 2, 4, 4, 6, 6, 2, 4, 4]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
6 1
union (6, 1) -> [6, 2, 6, 4, 4, 6, 6, 2, 4, 4]
Enter the next pair of objects to connect (eg 5 1), or ctrl-d to display final solution)
1 0
6 7
2 components
```
