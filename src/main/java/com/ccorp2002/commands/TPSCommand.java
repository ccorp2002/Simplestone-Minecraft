/*    */ package com.ccorp2002.commands;
/*    */ 
/*    */ import com.ccorp2002.Simplestone;
/*    */ import com.ccorp2002.utils.Utils;
/*    */ import com.google.common.base.Joiner;
/*    */ import java.text.DecimalFormat;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ 
/*    */ 
/*    */ public class TPSCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   private Simplestone plugin;
/*    */   
/*    */   public TPSCommand(Simplestone tenJava) {
/* 23 */     this.plugin = tenJava;
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
/* 27 */     arg0.sendMessage(Utils.prefix + "Current TPS: " + ChatColor.GREEN + (Double.parseDouble((new DecimalFormat("#.#")).format(this.plugin.getTpsCounter().getAverageTPS())) * 1.0D));
/* 28 */     arg0.sendMessage(Utils.prefix + "Total Entity Count: " + ChatColor.GREEN + this.plugin.getCalc().getAllEntities().size());
/*    */     
/* 30 */     List<String> disabled = new ArrayList<>();
/* 31 */     for (World w : Bukkit.getWorlds()) {
/* 32 */       if ((w.getLoadedChunks()).length == 0) {
/* 33 */         disabled.add(ChatColor.RED + w.getName()); continue;
/*    */       } 
/* 35 */       arg0.sendMessage(Utils.prefix + ChatColor.GREEN + w.getName() + ChatColor.AQUA + " - Chunks: " + ChatColor.GREEN + (w.getLoadedChunks()).length + ChatColor.AQUA + ", Entities: " + ChatColor.GREEN + w.getEntities().size());
/*    */     } 
/*    */ 
/*    */     
/* 39 */     if (disabled.size() > 0) {
/* 40 */       arg0.sendMessage(Utils.prefixe + "Unloaded: " + Joiner.on(ChatColor.DARK_RED + ", ").join(disabled));
/*    */     }
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/commands/TPSCommand.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */