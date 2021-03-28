package com.hp.demo;

import java.io.File;
import java.io.FileFilter;

public class Myfilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		String name = pathname.getName();
		return name.endsWith(".jpg");
	}

}
