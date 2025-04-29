package Nursery_Management_System;

// Teacher Class
class Teacher {
    String teacherId;
    String teacherName;
    String teacherRole;
    NurseryClass assignedClass;

    public Teacher(String teacherId, String teacherName, String teacherRole) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherRole = teacherRole;
    }

    public boolean assignToClass(NurseryClass nurseryClass) {
        if (nurseryClass instanceof BabyClass && !teacherRole.equals("Early Childhood Educator")) {
            System.out.println("Teacher role is not valid for Baby Class.");
            return false;
        }
        nurseryClass.assignedTeacher = this;
        this.assignedClass = nurseryClass;
        return true;
    }
}
