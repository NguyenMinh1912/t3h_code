package buoi3.bai5;

public class Student {
	
	private long id;
	
	private String name;
	
	private String code;
	
	private String dateOfBirth;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Id = " + id + 
		" name = " +  name
		+ " code = " + code
		+ " Ngày sinh " + dateOfBirth;
	}
	
}
