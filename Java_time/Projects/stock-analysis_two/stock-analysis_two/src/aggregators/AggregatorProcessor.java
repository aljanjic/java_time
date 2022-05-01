package aggregators;

import java.io.IOException;
import java.util.ArrayList;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {

	T agg;
	String table;

	public AggregatorProcessor(T agg, String table) {
		super();
		this.agg = agg;
		this.table = table;
	}


	public double runAggregator(int column) throws IOException {

		
		double result;

		StockFileReader fr = new StockFileReader(table);
		ArrayList<String> lines = new ArrayList<>(fr.readFileData()); // Import data from file to this method

		for (String line : lines) {

			String[] values = line.split(","); // You are receiving 5 columns of data as CSV format, you are splitting
			double rez = Double.parseDouble(values[column - 1]); // Converting split data from String to Double and -1
																	// because of Index position

			agg.add(rez);

		}

		result = agg.calculate();

		return result;
	}

}
