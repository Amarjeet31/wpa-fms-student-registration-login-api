package com.cpg.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
	private String test1;
	private String test2;
	private String test3;
	private String test4;
	private String test5;
	
	public String getTest1() {
		return test1;
	}
	public void setTest1(String test1) {
		this.test1 = test1;
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	public String getTest3() {
		return test3;
	}
	public void setTest3(String test3) {
		this.test3 = test3;
	}
	public String getTest4() {
		return test4;
	}
	public void setTest4(String test4) {
		this.test4 = test4;
	}
	public String getTest5() {
		return test5;
	}
	public void setTest5(String test5) {
		this.test5 = test5;
	}
	@Override
	public String toString() {
		return "Test [test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", test4=" + test4 + ", test5="
				+ test5 + "]";
	}

}
