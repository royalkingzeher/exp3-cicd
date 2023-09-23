package devops.b3.lab2.cicd;

public class myclass {
    public int add(int a, int b) {
    	return a + b;
    }
    
    public int subtract(int a, int b){
    	return a - b;
    }
	public static void main(String[] args) {
		myclass Myclass = new myclass();
		System.out.println(Myclass.add(10, 20));
		System.out.println(Myclass.add(30, 20));
	}

}
