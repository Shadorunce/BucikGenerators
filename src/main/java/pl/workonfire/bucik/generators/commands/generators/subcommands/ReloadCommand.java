package pl.workonfire.bucik.generators.commands.generators.subcommands;

import org.bukkit.command.CommandSender;
import pl.workonfire.bucik.generators.managers.ConfigManager;
import pl.workonfire.bucik.generators.managers.utils.CommandInterface;
import pl.workonfire.bucik.generators.managers.utils.Util;

import static pl.workonfire.bucik.generators.managers.ConfigManager.getPrefixedLanguageVariable;
import static pl.workonfire.bucik.generators.managers.utils.Util.sendMessage;

public class ReloadCommand implements CommandInterface {

    @Override
    public String permission() {
        return "bucik.generators.reload";
    }

    @Override
    public String name() {
        return "reload";
    }

    @Override
    public void run(CommandSender sender, String[] args) {
        if (Util.isAuthorized(sender, permission())) {
            ConfigManager.reloadAll();
            sendMessage(sender, getPrefixedLanguageVariable("plugin-reloaded"));
        }
    }

}
