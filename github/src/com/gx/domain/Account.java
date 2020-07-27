package com.gx.domain;
import java.io.Serializable;
public class Account implements Serializable{
	private Integer id;
	private String name;
	private Integer money;
	public Integer getID(){
		return id;		
	}
	public void setID(Integer id) {
		this.id=id;
	}
	public String getName(){
		return name;		
	}
	public void setName(String name) {
		this.name=name;
	}
	public Integer getMoney(){
		return money;		
	}
	public void setMoney(Integer money){
		this.money=money;
	}
	@Override
	public String toString()
	{
		return "Account{" +"id=" +id+", name=" + name +",money=" +money+"}";	
	}
}