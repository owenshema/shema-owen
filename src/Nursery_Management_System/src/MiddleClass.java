package Nursery_Management_System;

// Middle Class
class MiddleClass extends NurseryClass {

    public MiddleClass(String classId, String className) {
        super(classId, className, 20);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.age < 3 || student.age > 4) {
            System.out.println("Student is not in the correct age range for Middle Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Middle Class is full.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        return true;
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking language development, basic counting, and storytelling progress.");
    }

    @Override
    public void conductActivity(String activityName) {
        System.out.println("Conducting activity: " + activityName + " in " + className);
    }

    @Override
    public void generateClassReport() {
        System.out.println("Class: " + className + ", Teacher: " + assignedTeacher.teacherName);
        System.out.println("Number of Students: " + students.size());
        System.out.println("Activities conducted: Language development, counting, and storytelling.");
        System.out.println("General Progress: Focusing on language and cognitive skills.");
    }
}
