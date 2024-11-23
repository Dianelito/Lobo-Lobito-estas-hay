package dianelito.lobito;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class Main extends JavaPlugin {

    private static Main instance;

    private FileConfiguration messagesConfig;


    @Override

    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        loadMessages();


        if (Bukkit.getPluginManager().getPlugin("Oraxen") == null) {

            getLogger().severe(getMessage("oraxen_not_found"));

            Bukkit.getPluginManager().disablePlugin(this);

            return;

        }


        getCommand("lobito").setExecutor(new LobitoCommand());

        getLogger().info(getMessage("plugin_enabled"));

    }


    @Override

    public void onDisable() {

        getLogger().info(getMessage("plugin_disabled"));

    }


    public static Main getInstance() {

        return instance;

    }


    public void loadMessages() {

        File messagesFile = new File(getDataFolder(), "messages.yml");

        if (!messagesFile.exists()) {

            saveResource("messages.yml", false);

        }

        messagesConfig = YamlConfiguration.loadConfiguration(messagesFile);

    }


    public String getMessage(String key) {

        return messagesConfig.getString(key, "¡Mensaje no definido: " + key + "!");

    }

}