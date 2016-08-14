package com.mvnbook.output.impl;

import com.mvnbook.output.IOutputGenerator;

public class JsonOutputGenerator  implements IOutputGenerator{

	@Override
	public void generateOutput(){
		System.out.println("Json Output Generator");
	}

}