package com.noone.jlogger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;

public class JLogger {

	private File file;
	
	public JLogger(File file) {
		this.file = file;
	}
	
	public JLogger() {
		
	}
	
	public void error(String text) {
		write(text , "Error" , ConsoleColor.RED);
	}
	
	public void success(String text) {
		write(text , "Success" , ConsoleColor.GREEN);
	}
	
	public void warning(String text) {
		write(text , "Warning" , ConsoleColor.YELLOW);
	}
	
	public void message(String text) {
		write(text , "Message" , ConsoleColor.BLUE);
	}
	
	public void log(String text) {
		write(text , "Log" , ConsoleColor.CYAN);
	}
	
	public void exception(String text) {
		write(text , "Exception" , ConsoleColor.PURPLE);
	}
	
	private void write(String text , String type , String color) {
		Calendar calendar = Calendar.getInstance();
		String date = calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DAY_OF_MONTH);
		String time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
		String result = type + " === " + date + " === " + time + " >>> " + text;
		System.out.println(color + result + ConsoleColor.RESET);
		if(file != null && file.canWrite()) {
			try {
				result += "\n\n";
				Files.write(Paths.get(file.getAbsolutePath()), result.getBytes(), StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
