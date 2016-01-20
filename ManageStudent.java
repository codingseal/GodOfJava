public class ManageStudent {
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask2godofjava.com");
		return student;
	}
	public void printStudents(Student[] students) {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		Student[] student = null;
		ManageStudent manager = new ManageStudent();
		student = manager.addStudent();
		manager.printStudents(student);
	}
}