package org.example.lab3.task1;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface StrategyService {
    String exec(List<String> strings);

    StrategyService setStrategy(@NotNull Strategy strategy);
}