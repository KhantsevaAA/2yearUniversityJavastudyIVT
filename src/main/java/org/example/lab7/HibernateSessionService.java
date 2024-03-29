package org.example.lab7;

import org.hibernate.SessionFactory;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


import java.util.List;

public class HibernateSessionService {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HibernateSessionService.class);
    private final GroupDao groupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
// studentDao = new SessionStudentDao(sessionFactory);
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new GroupDao(sessionFactory);
    }

    public void exec() {
        Student student = studentDao.findById(1L);
        LOGGER.info(()-> String.format("%s", student));
        List<Student> students = studentDao.findAll();
        LOGGER.info(()-> String.format("%s", students));
        Group group = groupDao.findById(1L);
        Student newStudent = new Student();
        newStudent.setName("Иван");
        newStudent.setSurname("Новый");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}