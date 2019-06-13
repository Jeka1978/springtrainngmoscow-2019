package qualifiers_example;

import my_spring.DBType;
import my_spring.EbayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class SomeService {

    @EbayRepo(DBType.ORACLE)
    private Dao mainDao;

    @EbayRepo(DBType.MONGO)
    private Dao backupDao;

    @Scheduled(fixedDelay = 500)
    public void doWork(){
        mainDao.saveAll();
    }

    @Scheduled(fixedDelay = 1500)
    public void doBackup(){
        backupDao.saveAll();
    }










}
