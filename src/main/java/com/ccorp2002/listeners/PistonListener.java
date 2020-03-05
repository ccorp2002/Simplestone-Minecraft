/*    */ package com.ccorp2002.listeners;
/*    */ 
/*    */ import com.ccorp2002.Simplestone;
/*    */ import com.ccorp2002.utils.Utils;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockPistonExtendEvent;
/*    */ 
/*    */ public class PistonListener
/*    */   implements Listener
/*    */ {
/*    */   private Simplestone plugin;
/*    */   
/*    */   public PistonListener(Simplestone plugin) {
/* 15 */     this.plugin = plugin;
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onPistonExtend(BlockPistonExtendEvent evt) {
/* 20 */     if (!this.plugin.getConfig().getBoolean("Settings.Piston.Enabled"))
/* 21 */       return;  Utils.pushEntities(evt.getBlock().getRelative(evt.getDirection()).getLocation(), evt.getDirection());
/*    */   }
/*    */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/listeners/PistonListener.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */