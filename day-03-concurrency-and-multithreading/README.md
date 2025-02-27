# Day 2 - Concurrency & Multithreading

## Overview
This folder contains my Java learning progress from Day 3, covering:
- **Multithreading Basics:** Creating threads with `Thread` & `Runnable`.
- **Synchronization & Thread Safety:** Using `synchronized` and `join()`.
- **Executors & Thread Pools:** Managing threads with `ExecutorService`.

## Files & What They Cover
- `MultithreadingBasics.java` -> Demonstrates creating threads using `Thread` and `Runnable`.
- `SynchronizationExample.java` -> Uses `synchronized` & `join()` to safely increment a counter.
- `ExecutorExample.java` -> Implements a thread pool with `Executors.newFixedThreadPool()`.

## Key Takeaways
- `Thread` **vs** `Runnable`:
  - `Thread` -> Extend `Thread` class and override `run()`.
  - `Runnable` -> Implement `Runnable` and pass to a `Thread` object.
- **Synchronization (`synchronized`):**
  - Ensures only one thread modifies shared data at a time.
- **Thread Pools (`ExecutorService`):**
  - `newFixedThreadPool(2)` creates a pool of 2 reusable threads.
  - Use `.execute()` to submit tasks & `.shutdown()` to stop accepting new ones.