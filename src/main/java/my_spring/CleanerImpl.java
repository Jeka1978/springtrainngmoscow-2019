package my_spring;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3, max = 7)
    @Getter
    @Setter
    private int repeat=0;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVvvvvvvvvvvvvvvvvv");
        }
        long end = System.nanoTime();
        хочуКофе();
    }

    @Override
    public void хочуКофе(){
        System.out.println("NESSSSSSSSSS");
    }
}

