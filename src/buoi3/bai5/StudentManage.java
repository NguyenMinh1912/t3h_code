package buoi3.bai5;

import java.util.ArrayList;
import java.util.List;

public class StudentManage {

	private List<Student> studentList = new ArrayList<>();
	
	private long id = 1;
	
	public void addStudent(Student student) {
		student.setId(id);
		id++;
		studentList.add(student);
	}
	
	public void printStudentInfomation() {
		for(Student student: studentList) {
			System.out.println(student);
		}
	}
	
	public Student findStudentById(long id) {
		for(Student student: studentList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	public void editStudent(long id, String name, String code, String dateOfBirth) {
		Student student = findStudentById(id);
		if (student == null) {
			System.out.println("Sinh viên không tồn tại");
			return;
		}
		student.setName(name);
		student.setCode(code);
		student.setDateOfBirth(dateOfBirth);
	}
	
	public void deleteStudentById(long id) {
		Student student = findStudentById(id);
		if (student == null) {
			System.out.println("Sinh viên không tồn tại");
			return;
		}
		studentList.remove(student);
	}
	
}
