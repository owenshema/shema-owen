package Nursery_Management_System;

// Top Class
class TopClass extends NurseryClass {

    public TopClass(String classId, String className) {
        super(classId, className, 25);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.age < 4 || student.age > 5) {
            System.out.println("Student is not in the correct age range for Top Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Top Class is full.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        return true;
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking reading, writing, and arithmetic progress.");
    }

    @Override
    public void conductActivity(String activityName) {
        System.out.println("Conducting activity: " + activityName + " in " + className);
    }

    @Override
    public void generateClassReport() {
        System.out.println("Class: " + className + ", Teacher: " + assignedTeacher.teacherName);
        System.out.println("Number of Students: " + students.size());
        System.out.println("Activities conducted: Reading, writing, arithmetic.");
        System.out.println("General Progress: Preparing for primary school with academic assessments.");
    }
}
