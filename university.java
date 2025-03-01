class University {
    String universityName;

    University(String name) {
        this.universityName = name;
    }

    static class Library {
        String libraryName;

        Library(String name) {
            this.libraryName = name;
        }

        void displayLibrary() {
            System.out.println("Library Name: " + libraryName);
        }
    }

    class Department {
        String departmentName;

        Department(String name) {
            this.departmentName = name;
        }

        void displayDepartment() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("University Name: " + universityName);
        }
    }

    public static void main(String[] args) {
        University.Library lib = new University.Library("Central Library");
        lib.displayLibrary();

        University uni = new University("ABC University");

        University.Department dept = uni.new Department("Computer Science");
        dept.displayDepartment();
    }
}
