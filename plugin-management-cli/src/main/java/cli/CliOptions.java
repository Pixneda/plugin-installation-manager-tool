package cli;

import config.Settings;

import org.kohsuke.args4j.Option;
import javax.annotation.Nonnull;


import java.io.File;

public class CliOptions {
    //path must include plugins.txt
    @Option(name="-pluginTxtPath", usage="Path to plugins.txt")
    public File pluginTxt;

    @Option(name="-pluginDirPath", usage="Directory in which to install plugins")
    public File pluginDir;


    @Nonnull
    public File getPluginTxt() {
        return pluginTxt != null ? pluginTxt : Settings.DEFAULT_PLUGIN_TXT;
    }

    @Nonnull
    public File getPluginDir() {
        return pluginDir != null ? pluginTxt : Settings.DEFAULT_PLUGIN_DIR;
    }

}
