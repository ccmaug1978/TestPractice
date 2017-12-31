package test.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//School is a Instituion -->Inheritance
		// School has a rooms-->Encapsulation.
		Room r=new Room();
		r.setspace(1000);
		School s=new School(r);
		s.teach();
		System.out.println(s.r.getspace());

	}

}
