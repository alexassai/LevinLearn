package patternLearning.factory;

public class Program {
    public static void main(String[] args) {

DeveloperFacrtory developerFacrtory = new JavaDeveloperFactory();
Developer developer = new DeveloperFacrtory().createDeveloper();

    }
}
