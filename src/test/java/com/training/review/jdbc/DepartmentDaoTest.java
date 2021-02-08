package com.training.review.jdbc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
public class DepartmentDaoTest {
    private DepartmentDao departmentJDBCDao;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before
    public void setUp(){
        departmentJDBCDao = new DepartmentDao();
    }
    @After
    public void tearDown(){
        departmentJDBCDao = null;
    }

    @Test
    public void getDepartmentsTest(){

        logger.debug("start unit test for getDepartments");
        assertEquals(4,departmentJDBCDao.getDepartments().size());
    }


}
