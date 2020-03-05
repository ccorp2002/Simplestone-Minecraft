/*     */ package com.ccorp2002.utils;
/*     */ 
/*     */ import com.ccorp2002.Simplestone;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.BlockFace;
/*     */ import org.bukkit.entity.Entity;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.scheduler.BukkitRunnable;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ 
/*     */ public class Utils
/*     */ {
/*  18 */   public static String prefix = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.AQUA;
/*     */   
/*  20 */   public static String prefixe = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.DARK_RED;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector faceToForce(BlockFace face) {
/*  30 */     Vector out = new Vector(0, 0, 0);
/*  31 */     if (face == BlockFace.NORTH)
/*  32 */       out.setZ(-0.01D); 
/*  33 */     if (face == BlockFace.SOUTH)
/*  34 */       out.setZ(0.01D); 
/*  35 */     if (face == BlockFace.EAST)
/*  36 */       out.setX(0.01D); 
/*  37 */     if (face == BlockFace.WEST)
/*  38 */       out.setX(-0.01D); 
/*  39 */     if (face == BlockFace.UP)
/*  40 */       out.setY(0.01D); 
/*  41 */     if (face == BlockFace.DOWN)
/*  42 */       out.setY(-0.01D); 
/*  43 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector center(Location align) {
/*  53 */     Vector out = new Vector(0, 0, 0);
/*  54 */     if (align.getX() > align.getBlockX() + 0.5D)
/*  55 */       out.setX(-0.1D); 
/*  56 */     if (align.getX() < align.getBlockX() + 0.5D)
/*  57 */       out.setX(0.1D); 
/*  58 */     if (align.getZ() > align.getBlockZ() + 0.5D)
/*  59 */       out.setZ(-0.1D); 
/*  60 */     if (align.getZ() < align.getBlockZ() + 0.5D)
/*  61 */       out.setZ(0.1D); 
/*  62 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Vector centerExcludeFace(Location align, BlockFace face) {
/*  74 */     Vector out = new Vector(0, 0, 0);
/*  75 */     if (face == BlockFace.NORTH || face == BlockFace.SOUTH) {
/*  76 */       if (align.getX() > align.getBlockX() + 0.5D)
/*  77 */         out.setX(-0.1D); 
/*  78 */       if (align.getX() < align.getBlockX() + 0.5D) {
/*  79 */         out.setX(0.1D);
/*     */       }
/*     */     } 
/*  82 */     if (face == BlockFace.EAST || face == BlockFace.WEST) {
/*  83 */       if (align.getZ() > align.getBlockZ() + 0.5D)
/*  84 */         out.setZ(-0.1D); 
/*  85 */       if (align.getZ() < align.getBlockZ() + 0.5D) {
/*  86 */         out.setZ(0.1D);
/*     */       }
/*     */     } 
/*  89 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void powerBlock(Location location) {
/* 100 */     if (!Simplestone.getPlugin().getConfig().getBoolean("Settings.Other.Redstone"))
/*     */       return; 
/* 102 */     final Block b = location.getBlock();
/*     */     
/* 104 */     if (b.getRelative(BlockFace.NORTH).getType() == Material.REDSTONE_WIRE) {
/* 105 */       b.getRelative(BlockFace.NORTH).setData((byte)15);
/* 106 */       Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Simplestone.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run() {
/* 109 */               b.getRelative(BlockFace.NORTH).setData((byte)0);
/*     */             }
/*     */           },  5L);
/* 112 */     } else if (b.getRelative(BlockFace.EAST).getType() == Material.REDSTONE_WIRE) {
/* 113 */       b.getRelative(BlockFace.EAST).setData((byte)15);
/* 114 */       Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Simplestone.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run() {
/* 117 */               b.getRelative(BlockFace.EAST).setData((byte)0);
/*     */             }
/*     */           },  5L);
/* 120 */     } else if (b.getRelative(BlockFace.SOUTH).getType() == Material.REDSTONE_WIRE) {
/* 121 */       b.getRelative(BlockFace.SOUTH).setData((byte)15);
/* 122 */       Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Simplestone.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run() {
/* 125 */               b.getRelative(BlockFace.SOUTH).setData((byte)0);
/*     */             }
/*     */           },  5L);
/* 128 */     } else if (b.getRelative(BlockFace.WEST).getType() == Material.REDSTONE_WIRE) {
/* 129 */       b.getRelative(BlockFace.WEST).setData((byte)15);
/* 130 */       Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Simplestone.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run() {
/* 133 */               b.getRelative(BlockFace.WEST).setData((byte)0);
/*     */             }
/*     */           },  5L);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void pushEntities(Location location, BlockFace face) {
/* 148 */     for (Entity e : location.getWorld().getEntities()) {
/* 149 */       if (e.getLocation().getBlockX() == location.getBlockX() && e
/* 150 */         .getLocation().getBlockY() == location.getBlockY() && e
/* 151 */         .getLocation().getBlockZ() == location.getBlockZ()) {
/* 152 */         e.setVelocity(e.getVelocity().add(
/* 153 */               faceToForce(face).multiply(100.0D * Simplestone.getPlugin().getConfig().getDouble("Settings.Piston.Force"))));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void cleanupEntities() {
/* 159 */     (new BukkitRunnable() {
/*     */         public void run() {
/* 161 */           int i = 0;
/* 162 */           if (Simplestone.getPlugin().getCalc().getAllEntities().size() == 0) cancel(); 
/* 163 */           for (Entity e : Simplestone.getPlugin().getCalc().getAllEntities()) {
/* 164 */             if (e instanceof org.bukkit.entity.Player)
/* 165 */               continue;  if (i == 10)
/* 166 */               return;  e.remove();
/* 167 */             i++;
/*     */           } 
/* 169 */           cancel();
/*     */         }
/* 171 */       }).runTaskTimer((Plugin)Simplestone.getPlugin(), 0L, 1L);
/*     */   }
/*     */ }


/* Location:              /home/c/Code/Simplestone.jar!/com/ccorp2002/utils/Utils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */