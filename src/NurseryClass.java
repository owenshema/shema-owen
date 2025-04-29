package Nursery_Management_System;

import java.util.ArrayList;
import java.util.List;

// Abstract Class for Nursery Classes
abstract class NurseryClass {
    protected String classId;
    protected String className;
    protected int maxCapacity;
    protected Teacher assignedTeacher;
    protected List<Student> students = new ArrayList<>();

    public NurseryClass(String classId, String className, int maxCapacity) {
        this.classId = classId;
        this.className = className;
        this.maxCapacity = maxCapacity;
    }

    // Abstract Methods
    public abstract boolean enrollStudent(Student student);

    public abstract void trackProgress();

    public abstract void conductActivity(String activityName);

    public abstract void generateClassReport();
}

