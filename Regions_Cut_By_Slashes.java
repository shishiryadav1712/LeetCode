// Regions Cut By Slashes
class Solution {
    int[] parent;
    int[] rank;
    int size;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        size = 4 * n * n;
        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int index = 4 * (i * n + j);

                if (grid[i].charAt(j) == ' ') {
                    union(index, index + 1);
                    union(index + 1, index + 2);
                    union(index + 2, index + 3);
                } else if (grid[i].charAt(j) == '/') {
                    union(index, index + 3);
                    union(index + 1, index + 2);
                } else {
                    union(index, index + 1);
                    union(index + 2, index + 3);
                }

                if (j + 1 < n) {
                    union(index + 1, 4 * (i * n + j + 1) + 3);
                }
                if (i + 1 < n) {
                    union(index + 2, 4 * ((i + 1) * n + j));
                }
            }
        }

        int regions = 0;
        for (int i = 0; i < size; i++) {
            if (parent[i] == i) {
                regions++;
            }
        }

        return regions;
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}