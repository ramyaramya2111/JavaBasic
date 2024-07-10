package day5;
import java.util.*;
import java.net.*;
import java.io.*;
public class Filereaderdemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 URL resource = Filereaderdemo.class.getResource("MVIT.txt");
	        
	        // Check if the resource URL is null (file not found)
	        if (resource == null) {
	            System.err.println("File not found");
	            return;
	        }
try {
	        // Convert the URL to a File object
	        File file = new File(resource.getFile()); 

	        // Create a FileReader object to read the file
	        FileReader fileReader = new FileReader(file);

	        // Create a BufferedReader object to wrap the FileReader
	        BufferedReader reader = new BufferedReader(fileReader);

	        // Variable to hold each line read from the file
	        String line;

	        // Read the file line by line using readLine() method
	        while ((line = reader.readLine()) != null) {
	            // Print each line to the console
	            System.out.println(line);
	        }

	        }catch (Exception e) {

	            System.out.println(e);
	        }
	}

}


