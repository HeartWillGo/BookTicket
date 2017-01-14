package com.example.book_ticket2;

import com.example.book_ticket.User_msg;

public class User_ArrayList {

	private User_msg[] array; // 声明对象数组
	private int size = 0; // 声明size属性，设置初始值为0

	/********* 构造方法 *************/
	public User_ArrayList() {
		array = new User_msg[0]; // 初始化
	}

	public User_ArrayList(int size) {
		array = new User_msg[size];
	}
	

	/*
	 * 向数组队列中添加元素，add()
	 */
	public void add(User_msg element) {
		// 创建一个新的数组
		User_msg[] newArray = new User_msg[size + 1];
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
	public User_msg delete(int index){
		if(index<0||index>=size){
			return null;
			
		}
		User_msg temp=array[index];//将要删除的元素赋予临时变量temp
		User_msg[] newArray=new User_msg[size-1];
		
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
	public User_msg insert(int index,User_msg element){
		User_msg[] newArray=new User_msg[size+1];
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
	public User_msg get(int index){
		if(index<0||index>=size){
			return null;
		}
		else 
			return (User_msg) array[index];
	}
	public User_msg find(User_msg obj){
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
	public void  modify(User_msg element,int index){
		array[index]=element;
	}
 


}
