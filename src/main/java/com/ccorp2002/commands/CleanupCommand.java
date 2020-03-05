/*    */ package com.ccorp2002.commands;
/*    */ 
/*    */ import com.ccorp2002.Simplestone;
/*    */ import com.ccorp2002.utils.Utils;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ 
/*    */ public class CleanupCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   private Simplestone plugin;
/*    */   
/*    */   public CleanupCommand(Simplestone tenJava) {
/* 16 */     this.plugin = tenJava;
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
/* 20 */     arg0.sendMessage(Utils.prefix + "Cleaning up " + (this.plugin.getCalc().getAllEntities().size() - Bukkit.getOnlinePlayers().size()) + " entities!");
/* 21 */     Utils.cleanupEntities();
/* 22 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/commands/CleanupCommand.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */