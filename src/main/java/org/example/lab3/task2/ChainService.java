package org.example.lab3.task2;

public class ChainService {

    public Request exec(String inputStream) {
        Request request = new Request();
        request.setInputStream(inputStream);
                ChainHandler handler = new HeadersChainHandler();
        handler.next(new MethodChainHandler())
                .next(new PathChainHandler())
                .next(new SessionChainHandler());
        handler.process(request);
        return request;
    }
}
