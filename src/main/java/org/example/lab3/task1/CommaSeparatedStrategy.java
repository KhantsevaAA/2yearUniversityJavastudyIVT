package org.example.lab3.task1;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;
public class CommaSeparatedStrategy implements Strategy {
    @NotNull
    @Override
    public String process(
            @NotNull List<String> stings) {
        return StringUtils.join(stings, ",");
    }
}