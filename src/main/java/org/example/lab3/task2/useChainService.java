package org.example.lab3.task2;

public class useChainService {
    public static void main(String[] args) {

//        ChainService service = new ChainService();
//        Request result = service.exec("31.01.2004");

        String inputStream = "method:GET\npath:/example\nsession:12345";

        ChainService chainService = new ChainService();
        Request processedRequest = chainService.exec(inputStream);

        // Displaying the processed request
        System.out.println("Processed Request:");
        System.out.println("Method: " + processedRequest.getMethod());
        System.out.println("Path: " + processedRequest.getPath());
        System.out.println("Session: " + processedRequest.getSession());
        System.out.println("Headers: " + processedRequest.getHeaders());
    }
}