package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j < cathetusLength*2; j++) {
                if (j>cathetusLength-i&&j<cathetusLength+i) {
                    if (j<=cathetusLength) {
                        System.out.print(cathetusLength+1-j);
                    } else {
                        System.out.print(j-cathetusLength+1);
                    }
                } else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
