import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task11_12 {

    public static void main(String[] args) {

        int[] numbers = createNewArray();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Минимально = " + min(numbers));
    }

    private static int[] createNewArray() {
        Random r = new Random();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(numbers.length);
        }
        return numbers;
    }

    private static int min(int[] arrays) {
        Objects.requireNonNull(arrays, "Массив не может быть нулевой");
        long start = System.currentTimeMillis();
        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            assert min <= arrays[i];
        }
        long stop = System.currentTimeMillis();
        System.out.println("Время = " + (stop - start));
        final int minFinal = min;
        System.out.println("Тест = " + IntStream.of(arrays).allMatch(i -> i >= minFinal));
        return min;
    }

}