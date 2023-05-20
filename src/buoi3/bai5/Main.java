package buoi3.bai5;

public class Main {
	public static void main(String[] args) {
		StudentManage studentManage = new StudentManage();
		
		Student student = new Student();
		student.setCode("1234");
		student.setName("Minh");
		student.setDateOfBirth("10-05-2010");
		
		studentManage.addStudent(student);
		
		Student student2 = new Student();
		student2.setCode("1234");
		student2.setName("Dương");
		student2.setDateOfBirth("10-05-2015");
		
		studentManage.addStudent(student2);
		
		Student minh = studentManage.findStudentById(1);
		
		
		studentManage.editStudent(1, "newMinh", "12345", "19-08-2009");
		
		studentManage.printStudentInfomation();
		studentManage.deleteStudentById(minh.getId());
		System.out.println("=================");
		studentManage.printStudentInfomation();
		
		
	}
}
