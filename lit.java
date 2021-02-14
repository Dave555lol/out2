public class lit {
    private boolean[][] pole;
    public lit(int size) {
        pole = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pole[i][j] = false;
            }
        }
    }
    public void random() {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (Math.random() > 0.5) {
                    pole[i][j] = true;
                }
            }
        }
    }
    public void off(int x, int y) {
        pole[x][y] = !pole[x][y];
        pole[x + 1][y] = !pole[x + 1][y];
        pole[x - 1][y] = !pole[x - 1][y];
        pole[x][y + 1] = !pole[x][y + 1];
        pole[x][y - 1] = !pole[x][y - 1];
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j]) {
                    s.append(" # ");
                } else {
                    s.append(" . ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}