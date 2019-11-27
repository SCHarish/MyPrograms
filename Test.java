import java.io.*;
class Test{
	public static void main(String args[])throws FileNotFoundException{
		File file = new File("/Users/harish-7361/Practise/results.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

	}

	void msg()throws Exception{
		System.out.println("Msg printed");
	}
}

class A extends Test{
	void msg()throws IOException{
		System.out.println("subclass printed");
	}
}