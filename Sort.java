/**
 * Created by cody
 */
public class Sort {
    public static void main(String[] args) {

        int mas[] = {1,5,4,3,2,6,8,7,10};

        for(int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int minI = i;

            for (int j = i+1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = mas[i];
                mas[i] = mas[minI];
                mas[minI] = tmp;

            }
        }
        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
    }
}

