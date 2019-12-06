import java.io.*;
class Test{
	enum testing{
		ROCK,PAPER,SCISSOR
	}

	public static void main(String args[]){
		testing t1,t2;
		for(testing t : EnumTest.testing.values()){
			System.out.println(t.ordinal());
		}
	}
}
