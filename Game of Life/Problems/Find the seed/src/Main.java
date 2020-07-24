import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int answerValue = 0;
        int counter = 0;
        int answerKeyFinal = 0;


        ArrayList<Integer> max = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = a; i < b + 1; i = a++) {
            Random random = new Random(i);
            for (int j = 0; j < n; j++) {
                max.add(random.nextInt(k));
            }
            map.put(i, Collections.max(max));
            max.clear();
        }


        answerValue = (int) map.values().toArray()[0];
        for (int i = 0; i < map.size(); i++) {
            if ((int) map.values().toArray()[i] < answerValue)
                answerValue = (int) map.values().toArray()[i];
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(answerValue) && counter < 1) {
                answerKeyFinal = entry.getKey();
                counter++;
            }
        }

        System.out.println(answerKeyFinal);
        System.out.println(answerValue);

    }


}