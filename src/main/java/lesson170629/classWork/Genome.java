package lesson170629.classWork;

public class Genome {
    public static void main(String[] args) {
        byte[] data = DataGeneration.generate(30);
        //System.out.println(Arrays.toString(data));

        for (byte b : data) {
            System.out.print((char) b);
        }

        findDuplicates(data, 3);

    }

    private static void findDuplicates(byte[] data, int w) {
        int counter = 0;
        for (int i = 0; i < data.length - w; i++) {
            for (int j = i + 1; j < data.length - w + 1; j++) {
                boolean found = true;
                for (int k = 0; k < w; k++) {
                    if (data[i + k] != data[j + k]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    counter++;
                }
                System.out.println("\nhurray!");
                System.out.println("i= " + i + ", j = " + j);
            }
        }
        System.out.println();
        System.out.println(counter);
    }

}
