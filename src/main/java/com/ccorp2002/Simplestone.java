/*    */ package com.ccorp2002;
/*    */ 
/*    */ import com.ccorp2002.commands.CleanupCommand;
/*    */ import com.ccorp2002.commands.TPSCommand;
/*    */ import com.ccorp2002.tasks.EntityCalculator;
/*    */ import com.ccorp2002.tasks.TPSCounter;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Simplestone
/*    */   extends JavaPlugin {
/*    */   private static Simplestone plugin;
/*    */   private EntityCalculator calc;
/*    */   private TPSCounter tps;
/*    */   
/*    */   public void onEnable() {
/* 20 */     plugin = this;
/* 21 */     saveDefaultConfig();
/*    */     
/* 23 */     this.calc = new EntityCalculator(this);
/* 24 */     this.calc.runTaskTimer((Plugin)this, 0L, 5L);
/*    */     
/* 27 */     getCommand("cleanup").setExecutor((CommandExecutor)new CleanupCommand(this));
/* 28 */     getCommand("tps").setExecutor((CommandExecutor)new TPSCommand(this));
/*    */     
/* 30 */     this.tps = new TPSCounter();
/* 31 */     this.tps.runTaskTimer((Plugin)this, 1000L, 50L);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisable() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Simplestone getPlugin() {
/* 46 */     return plugin;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EntityCalculator getCalc() {
/* 55 */     return this.calc;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TPSCounter getTpsCounter() {
/* 64 */     return this.tps;
/*    */   }
/*    */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/Simplestone.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
