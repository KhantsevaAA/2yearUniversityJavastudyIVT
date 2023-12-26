package org.example.lab3.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class useChainServiceTest {

    @Test
    void main() {
        String inputStream = "method:GET\npath:/user/info\nsession:hfhfhfdhdhdhdhf-ayeye76";
        ChainService service = new ChainService();
        Request request = service.exec(inputStream);
        assertEquals("GET", request.getMethod());
        assertEquals("/user/info", request.getPath());
        assertEquals("hfhfhf-dhdhdhdhf-ayeye76", request.getSession());
    }
}