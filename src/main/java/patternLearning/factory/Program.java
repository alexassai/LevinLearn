package patternLearning.factory;

public class Program {
    public static void main(String[] args) {

        DeveloperFacrtory developerFacrtory = createDeveloperBySpeciality("Php");
        Developer developer = developerFacrtory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFacrtory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CPPDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PHPDeveloperFactory();
        } else throw new RuntimeException(speciality + " is inknown");
    }
}
