/*    */ package com.ccorp2002.tasks;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ 
/*    */ public class TPSCounter
/*    */   extends BukkitRunnable
/*    */ {
/*  9 */   private transient long lastPoll = System.nanoTime();
/* 10 */   private final LinkedList<Double> history = new LinkedList<>();
/* 11 */   private final long tickInterval = 50L;
/*    */   
/*    */   public TPSCounter() {
/* 14 */     this.history.add(Double.valueOf(20.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 19 */     long startTime = System.nanoTime();
/* 20 */     long timeSpent = (startTime - this.lastPoll) / 1000L;
/* 21 */     timeSpent = (timeSpent == 0L) ? 1L : timeSpent;
/* 22 */     if (this.history.size() > 10) this.history.remove(); 
/* 23 */     double tps = 5.0E7D / timeSpent;
/* 24 */     if (tps <= 21.0D) this.history.add(Double.valueOf(tps)); 
/* 25 */     this.lastPoll = startTime;
/*    */   }
/*    */   
/*    */   public double getAverageTPS() {
/* 29 */     double avg = 0.0D;
/* 30 */     for (Double f : this.history) {
/* 31 */       if (f != null) avg += f.doubleValue(); 
/*    */     } 
/* 33 */     return avg / this.history.size();
/*    */   }
/*    */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/tasks/TPSCounter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */