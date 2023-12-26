package org.example.lab3.task1;
import java.util.List;
import org.jetbrains.annotations.NotNull;;
public interface Strategy {
    @NotNull
    String process(@NotNull List<String> stings);
}