package fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {

	String filePath = null;

	public StockFileReader(String filePath) {
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException {
		String line = readFirstLine(filePath);
		String[] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}

	static String readFirstLine(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	/**
	 * Complete the body of this method.
	 * 
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException {
		List<String> lines = new ArrayList<String>();
		
		
		try (BufferedReader br = new BufferedReader(FileReader(filePath))){
			
		}
		
		System.out.println(lines);
		
		
		
	
		return lines;
		
	}

	private Reader FileReader(String filePath2) {
		// TODO Auto-generated method stub
		return null;
	}
}
