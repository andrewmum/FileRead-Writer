import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Final {
    public static void sortMethod(int arr[]) {
        int temp;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }

            }
        }

    }

    public static int avg(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x = x + arr[i];

        }
        int avg = x / arr.length;
        return avg;
    }

    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        File inputFile = new File("num.txt");
        File outputFile = new File("out.txt");
        int a[] = new int[7];
        try {
            Scanner sc = new Scanner(inputFile);
            FileWriter fw = new FileWriter(outputFile);
            int i = 0;
            while (sc.hasNextInt()) {
                a[i] = sc.nextInt();
                i++;
            }
            sortMethod(a);
            int av = avg(a);
            int larg = largest(a);
            for (int j = 0; j < a.length; j++) {
                fw.write(String.valueOf(a[j]) + "  ");
            }
            fw.write(" \t Average value: " + String.valueOf(av) + "  \t");
            fw.write("Largest value: " + String.valueOf(larg));
            fw.close();

        } catch (FileNotFoundException x) {
            System.out.println("File not found");
            System.out.println(x);
        } catch (IOException x) {
            System.out.println(x);
        }

        sortMethod(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Average: " + avg(a));
        System.out.println("Largest Element: " + largest(a));

    }
}