class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // Overloaded Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Overloaded Constructor Called");
    }

    // Copy Constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor Called");
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Student student1 = new Student();
        student1.display();

        Student student2 = new Student("Alice", 22);
        student2.display();

        Student student3 = new Student(student2);
        student3.display();
    }
}







































































