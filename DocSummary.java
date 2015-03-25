package summarizeDocs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DocSummary {

	public static void main(String args[]) throws Exception {  
	    try {  
	    	TextExtractor TE = new TextExtractor();
	    	String Result = TE.getTextContent(args[0]);
	    	
	    	int Summarizer = 0;
	    	
	    	if(args[1].compareTo("Glowing") == 0)
	    		Summarizer = 1;
	    	if(args[1].compareTo("Simple") == 0)
	    		Summarizer = 2;
	    	if(args[1].compareTo("Sum") == 0)
	    		Summarizer = 3;
	    	
	    	BufferedWriter filewrite = new BufferedWriter(new FileWriter("./InputContent.txt"));
	    	filewrite.write(Result);
	    	filewrite.close();
	    	PythonCaller PC = new PythonCaller();
	    	PC.CallSummarizer("./InputContent.txt", Summarizer);
	    } 
	    
	    catch (Exception e) {
			e.printStackTrace();
		}
	}

}
