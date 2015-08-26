package me.prodigy4532;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;





public class Home extends JavaPlugin {
    
    public static final Logger log = Logger.getLogger("Minecraft");
    
    
    
    
    @Override
    public void onEnable(){
        log.log(Level.INFO, "[Puto] Tito Esta disponible en tu puto server.");
        
    }    
        
    @Override   
    public void onDisable(){
        log.log(Level.INFO, "[Puto] Tito ya no esta disponible en tu puto servidor.");
    }
    
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
       if(label.equals("tito"));
       //Decir Tito.
       sender.sendMessage(ChatColor.GRAY + "#########################");
       sender.sendMessage(" ");
       sender.sendMessage(" ");
       sender.sendMessage(ChatColor.GREEN + "╭☞( ͡° ͜ʖ ͡°)╭☞");
       sender.sendMessage(ChatColor.GREEN + "       \\   .   .\\");
       sender.sendMessage(ChatColor.GREEN + "        \\        \\");
       sender.sendMessage(ChatColor.GREEN + "         / ╰U╯\\");
       sender.sendMessage(ChatColor.AQUA + "Tito Es Un Homosexual <3");
       sender.sendMessage(" ");
       sender.sendMessage(ChatColor.GRAY + "#########################");
        return false;
    }
}
