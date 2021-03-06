package pl.workonfire.bucik.generators.managers.utils;

import net.md_5.bungee.api.ChatColor;

import java.io.PrintStream;

public enum Logger {

    INFO(ChatColor.WHITE, System.out),
    WARN(ChatColor.RED, System.err),
    DEBUG(ChatColor.DARK_PURPLE, System.out);

    private final ChatColor color;
    private final PrintStream stream;

    Logger(ChatColor color, PrintStream stream) {
        this.color = color;
        this.stream = stream;
    }

    public PrintStream getStream() {
        return stream;
    }

    public ChatColor getColor() {
        return !Util.isServerLegacy() ? color : null;
    }
}
