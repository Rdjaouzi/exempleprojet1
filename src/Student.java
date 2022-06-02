public class Student {

    // les attributs
    private String name ;
    private String surname;
    private int department;
    private String formation;
    private int yearTraining;

    // Constructeur vide
    public Student() {
    }

    // constructeur sur charger

    public Student(String name, String surname, int department, String formation, int yearTraining) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.formation = formation;
        this.yearTraining = yearTraining;
    }

    // getters

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getDepartment() {
        return department;
    }
    public String getFormation() {
        return formation;
    }
    public int getYearTraining() {
        return yearTraining;
    }
    //  setters
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setFormation(String formation) {
        this.formation = formation;
    }
    public void setYearTraining(int yearTraining) {
        this.yearTraining = yearTraining;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", formation='" + formation + '\'' +
                ", yearTraining=" + yearTraining +
                '}';
    }
}
