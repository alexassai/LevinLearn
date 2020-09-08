package patternLearning.factory;

public class JavaDeveloperFactory implements DeveloperFacrtory  {
    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
