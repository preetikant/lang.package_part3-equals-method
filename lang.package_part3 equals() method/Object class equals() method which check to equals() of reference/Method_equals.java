class Method_equals{
	String name;
	int rollno;
	Method_equals(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String args[]){
	
		Method_equals m1 = new Method_equals("Preeti",101);
		Method_equals m2 = new Method_equals("Neelam", 102);
		Method_equals m3 = new Method_equals("Preeti",101);
		Method_equals m4 = m1;
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
	}

}