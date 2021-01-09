package blockTest;

public class BlockTest {
	{
	System.out.println("Normal Block");
	}
	
	static {
		System.out.println("Static block");
		
	}
	static {
		System.out.println("Static block1");
		
	}
	static {
		System.out.println("Static block2");
		
	}
	
	public static void add(){
		System.out.println("Functional Block");
	}
	//object create will call
	public BlockTest(){
		System.out.println("Constructor block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
BlockTest b= new BlockTest();
	}

}
