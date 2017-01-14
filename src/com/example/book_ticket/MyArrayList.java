package com.example.book_ticket;

public class MyArrayList {
	private Message[] array; // 声明对象数组
	private int size = 0; // 声明size属性，设置初始值为0

	/********* 构造方法 *************/
	public MyArrayList() {
		array = new Message[0]; // 初始化
	}

	public MyArrayList(int size) {
		array = new Message[size];
	}
	

	/*
	 * 向数组队列中添加元素，add()
	 */
	public void add(Message element) {
		// 创建一个新的数组
		Message[] newArray = new Message[size + 1];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i]; // 赋值

		}
		newArray[size] = element;// 添加元素至数组最后一位
		size++; // 长度加一
		array = newArray;// 把newArray的地址给array

	}
	/*
	 * 数组队列的删除操作，删除指定索引的元素
	 */
	public Message delete(int index){
		if(index<0||index>=size){
			return null;
			
		}
		Message temp=array[index];//将要删除的元素赋予临时变量temp
		Message[] newArray=new Message[size-1];
		
		for(int i=0;i<index;i++){
			newArray[i] =array[i];
		}
		for(int i=index;i<size-1;i++){
			array[i]=array[i+1];
			newArray[i]=array[i];
			
		}
		array=newArray;
		size--;
		return temp;
	}
	/*
	 * 按照索引插入元素
	 */
	public Message insert(int index,Message element){
		Message[] newArray=new Message[size+1];
		for(int i=0;i<index;i++){
			newArray[i]=array[i];
		}
		newArray[index] =element;
		for(int i=index;i<size;i++){
			newArray[i+1]=array[i];
		}
		array=newArray;
		size++;
		return element;
	}
	
	/*
	 * 获取数组队列的长度
	 */
	public int size(){
		return size;
	}
	public Message get(int index){
		if(index<0||index>=size){
			return null;
		}
		else 
			return (Message) array[index];
	}
	public Message find(Message obj){
		for(int i=0;i<size;i++){
			if(array[i].equals(obj)){
				return array[i];
			}
			
		}
		  
			return null;
	}
	
	/*
	 * 修改指定索引的元素
	 * 
	 */
	public void  modify(Message element,int index){
		array[index]=element;
	}
 

}
