package org.example.lab3.task2;

import org.jetbrains.annotations.NotNull;

public class PathChainHandler extends AbstractChainHandler {
    private static final String KEY = "path";
    @Override
    public void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY))
            request.setPath(request.getHeaders().get(KEY));
    }
}
