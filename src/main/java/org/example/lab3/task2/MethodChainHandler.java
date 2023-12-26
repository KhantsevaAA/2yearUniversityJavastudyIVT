package org.example.lab3.task2;

import org.jetbrains.annotations.NotNull;

public class MethodChainHandler extends AbstractChainHandler {
    private static final String KEY = "method";
    @Override
    void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY))
            request.setMethod(request.getHeaders().get(KEY));
    }
}