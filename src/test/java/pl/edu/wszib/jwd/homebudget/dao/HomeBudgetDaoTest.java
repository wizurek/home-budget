package pl.edu.wszib.jwd.homebudget.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.homebudget.model.HomeBudget;


import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HomeBudgetDaoTest {

    public static final String UTILITIES = "Opłaty czynszowe";
    public static final String FOOD = "Spożywcze";
    public static final String ENTERTAINMENT = "Rozrywka";
    public static final int COUNTER = 3;

    @Autowired
    HomeBudgetDao homeBudgetDao;

    //  Date time, String name,

    @BeforeEach
    void setUp() {
        HomeBudget utilities = new HomeBudget(new Date(), UTILITIES);
        HomeBudget food = new HomeBudget(new Date(), FOOD);
        HomeBudget entertainment = new HomeBudget(new Date(), ENTERTAINMENT);

        assertNull(utilities.getId());
        assertNull(food.getId());
        assertNull(entertainment.getId());

        homeBudgetDao.save(utilities);
        homeBudgetDao.save(food);
        homeBudgetDao.save(entertainment);

        assertNotNull(utilities.getId());
        assertNotNull(food.getId());
        assertNotNull(entertainment.getId());


    }

    @AfterEach
    void tearDown() {
        homeBudgetDao.deleteAll();
    }

    @Test
    void testFetchData() {
        HomeBudget homeBudget = homeBudgetDao.findByName(UTILITIES);

        assertNotNull(homeBudget);
        assertEquals(UTILITIES,homeBudget.getName());
    }

    @Test
    void testFetchAllData() {
       Collection homebudget = (Collection) homeBudgetDao.findAll();
       assertEquals(3, homebudget.size());
    }
}
