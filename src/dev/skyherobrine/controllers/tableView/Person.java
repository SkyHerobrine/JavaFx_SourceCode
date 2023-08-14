package dev.skyherobrine.controllers.tableView;

import java.time.LocalDate;

public class Person {

	private int id;
	private String name;
	private int age;
	private String noiSong;
	public Person(int id, String name, int age, String noiSong) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.noiSong = noiSong;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNoiSong() {
		return noiSong;
	}
	public void setNoiSong(String noiSong) {
		this.noiSong = noiSong;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Location: " + noiSong;
	}
}
