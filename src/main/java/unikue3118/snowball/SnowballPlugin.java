package unikue3118.snowball;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SnowballPlugin extends JavaPlugin implements CommandExecutor, Listener {
    @Override
    public void onEnable() {    //플러그인 활성화시 실행
        getLogger().info("On!");  //서버의 로그에 출력
        getCommand("snowballexplode").setExecutor(new SnowballCommand());
        getServer().getPluginManager().registerEvents(new SnowballListener(), this);
    }
    @Override
    public void onDisable() {   //플러그인 비활성화시 실행
        getLogger().info("Off."); //서버의 로그에 출력
    }
}

