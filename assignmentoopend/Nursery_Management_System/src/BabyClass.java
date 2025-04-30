package Nursery_Management_System;

// Baby Class
class BabyClass extends NurseryClass {

    public BabyClass(String classId, String className) {
        super(classId, className, 15);
    }

    @Override
    public boolean enrollStudent(Student student) {
        if (student.age < 2 || student.age > 3) {
            System.out.println("Student is not in the correct age range for Baby Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Baby Class is full.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        return true;
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking motor skills and play-based learning progress.");
    }

    @Override
    public void conductActivity(String activityName) {
        System.out.println("Conducting activity: " + activityName + " in " + className);
    }

    @Override
    public void generateClassReport() {
        System.out.println("Class: " + className + ", Teacher: " + assignedTeacher.teacherName);
        System.out.println("Number of Students: " + students.size());
        System.out.println("Activities conducted: Play-based learning, motor skills development.");
        System.out.println("General Progress: Focusing on motor skills and interaction.");
    }
}
