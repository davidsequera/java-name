package com.javaname.demo.user;

import javax.persistence.*;

enum State {
	ACTIVE,
	INACTIVE,
	DELETED
}
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String secret;
	@Enumerated(EnumType.STRING)
    private State state;
//	private int score;

	public User(Integer id, String name, String secret, int score) {
		this.id = id;
		this.name = name;
		this.secret = secret;
		this.state = State.ACTIVE;
//		this.score = score;
	}
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.secret = "secret";
//		this.score = 0;
		this.state = State.ACTIVE;
	}

	public User() {
		this.id = 00000;
		this.name = "name";
		this.secret = "secret";
//		this.score = 0;
		this.state = State.INACTIVE;
	}


	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return this.id;
	}
    public String getSecret() {
		return this.secret;
	}
	public State getState() {
		return this.state;
	}
	public int getScore() {
//		return this.score;
		return 0;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
    public void setSecret(String secret) {
		this.secret = secret;
	}
	public void setState(State state) {
		this.state = state;
	}
//	public void setScore(int score) {
//		this.score = score;
//	}
}