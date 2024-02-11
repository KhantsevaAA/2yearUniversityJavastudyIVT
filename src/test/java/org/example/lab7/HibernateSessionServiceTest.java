package org.example.lab7;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class HibernateSessionServiceTest {

    @Test
    void exec() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}