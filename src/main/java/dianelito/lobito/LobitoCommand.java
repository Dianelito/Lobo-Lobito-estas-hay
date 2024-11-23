package dianelito.lobito;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class LobitoCommand implements CommandExecutor {


    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {

            sender.sendMessage(Main.getInstance().getMessage("only_players"));

            return true;

        }

        Player player = (Player) sender;


        if (args.length == 0) {

            player.sendMessage(Main.getInstance().getMessage("command_usage"));

            return true;

        }


        switch (args[0].toLowerCase()) {

            case "spawn":

                // Lógica para generar un lobo personalizado

                player.sendMessage(Main.getInstance().getMessage("wolf_spawned"));

                break;


            case "config":

                player.sendMessage(Main.getInstance().getMessage("current_config")

                        .replace("{model}", Main.getInstance().getConfig().getString("models.wolf.model")));

                break;


            case "reload":

                Main.getInstance().reloadConfig();

                Main.getInstance().loadMessages();

                player.sendMessage(Main.getInstance().getMessage("config_reloaded"));

                break;


            default:

                player.sendMessage(Main.getInstance().getMessage("invalid_command"));

                break;

        }

        return true;

    }
}