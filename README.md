# Threads and Streams

When you designate a block of code as a "thread", you're telling the Java interpreter that not only is this block of code going to run, other blocks of code are going to be running at the same time and they should all run synchronously.

## Main Thread

- This is the thread that programmers deal with and where new Threads are created
- Think about our main() - code/threads executed/created in our main() are given a priority = 5
- 10 is the highest priority, 1 the lowest

### GetTime20 App

Goals:

- We're going to output the time at a set interval
- We're going to then do something else that occurs at the same time and doesn't interupt the time output

### System Time & Check

Goals:

- Similar to GetTime20, but we're going to look at creating a pool of threads
- Also going to learn how to execute threads at a specific interval without relying on for loops
- Talk about Locks

#### PerformSystemCheck - Locks

- Lock is just a way to ensure that two threads won't try to use an object at the same time
- Locks are used to avoid "Memory Consistency Errors", keeps threads from defining a happens-before relationship because multiple threads were/are accessing the same code at the same time.
