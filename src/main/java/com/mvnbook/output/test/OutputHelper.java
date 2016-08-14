package com.mvnbook.output.test;

import com.mvnbook.output.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

	public void generateOutput() {
		outputGenerator.generateOutput();
	}
}