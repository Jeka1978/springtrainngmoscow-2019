package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class CleanerImplTest {
    @Test
    public void injectRandomIntIsSupported() {
        CleanerImpl cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);
        Assert.assertNotEquals(0,cleaner.getRepeat());
    }
}