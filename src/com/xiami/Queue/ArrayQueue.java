package com.xiami.Queue;

public class ArrayQueue{
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//存放数据，用于模拟队列

    public ArrayQueue(int arrayMaxSize) {
        maxSize=arrayMaxSize;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }
    //判断队列是否满

    /**
     * 这里要注意要maxSize-1
     * @return
     */
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return front==rear;
    }
    //添加数据到队列
    public void addQueue(int n){
        //先判断队列满不满
        if(isFull()){
            System.out.println("队列满了，没办法添加数据");
            return;
        }
        rear++;
        arr[rear]=n;
    }
    //取出数据
    public int getQueue(){
        //先判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列的所有数据
    public void showQueue(){
        //判断队列是否为空
        if(isEmpty()){
            System.out.println("队列空的，没有数据~~");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }
    //显示队列的头数据，注意并不是取出数据
    public int headQueue() {
        // 判断
        if (isEmpty()) {
            throw new RuntimeException("队列空的，没有数据~~");
        }
        return arr[front + 1];
    }
}