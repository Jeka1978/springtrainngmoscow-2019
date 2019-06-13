package qualifiers_example;

import lombok.SneakyThrows;
import my_spring.DBType;
import my_spring.EbayRepo;

/**
 * @author Evgeny Borisov
 */
@EbayRepo(DBType.ORACLE)
public class OracleDao implements Dao {
    @Override
    @SneakyThrows
    public void saveAll() {
        System.out.println("saving to Oracle");
        Thread.sleep(10);
    }
}
