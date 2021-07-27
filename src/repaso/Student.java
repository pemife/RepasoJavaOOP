package repaso;

public class Student extends Persona {
	
	public static void main(String[] args) {
		Student st = new Student();
		Student st2 = st;
		
		st.setName("Pepillo");
		st.walk(20);
		st.sleep();
		
		st2.setName("Juan");
		
		System.out.println(st.getName());
		System.out.println(st.getAge());
		
		System.out.println(st2.getName());
		System.out.println(st2.getAge());
	}
}