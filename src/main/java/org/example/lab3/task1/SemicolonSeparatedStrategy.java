package org.example.lab3.task1;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
public class SemicolonSeparatedStrategy implements Strategy {
    @NotNull
    @Override
    public String process(@NotNull List<String> stings) {
        return StringUtils.join(stings, ";");
    }
}