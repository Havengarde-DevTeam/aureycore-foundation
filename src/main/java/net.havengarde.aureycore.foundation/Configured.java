package net.havengarde.aureycore.foundation;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

public interface Configured {
    void setConfigDefaults(FileConfiguration config);
    void loadSettingsFromConfig(FileConfiguration config) throws InvalidConfigurationException;
    void saveSettingsToConfig(FileConfiguration config);
}
