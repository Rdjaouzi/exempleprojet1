public class Student {

    // les attributs
    private String name ;
    private String surname;
    private String department;
    private String formation;
    private String yearTraining;

    // paramètre de position dans l'arbre
    private String posHimself
    private String posFather ;
    private String posLeftSon;
    private String posRight

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
    public String getPosHimself() {
        return posHimself;
    }
    public String getPosFather() {
        return posFather;
    }
    public String getPosLeftSon() {
        return posLeftSon;
    }
    public String getPosRight() {
        return posRight;
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
    public void setPosHimself(String posHimself) {this.posHimself = posHimself;}
    public void setPosFather(String posFather) {
        this.posFather = posFather;
    }
    public void setPosLeftSon(String posLeftSon) {
        this.posLeftSon = posLeftSon;
    }
    public void setPosRight(String posRight) {
        this.posRight = posRight;
    }
}
