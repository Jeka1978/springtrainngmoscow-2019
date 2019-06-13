package qualifiers_example;

import my_spring.DBType;
import my_spring.EbayRepo;

/**
 * @author Evgeny Borisov
 */
@EbayRepo(DBType.MONGO)
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Saving to Mongo");
    }
}
