package org.example.lab3.task2;

import org.jetbrains.annotations.NotNull;

public interface ChainHandler {
    void process(@NotNull Request request);
    ChainHandler next();
    ChainHandler next(ChainHandler chainHandler);
}
