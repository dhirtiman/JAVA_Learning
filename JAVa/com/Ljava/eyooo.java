package com.Ljava;

public class eyooo {
    public static void main(String[] args) {
      Thread t1 = new Thread(new Task1());
      Thread t2 = new Thread(new Task2());
      t1.start();
      t2.start();
    }
  }
  
  class Task1 implements Runnable {
    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Task 1: " + i);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  
  class Task2 implements Runnable {
    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Task 2: " + i);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  