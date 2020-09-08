package patternLearning.factory;

public class CPPDeveloperFactory implements DeveloperFacrtory{
    @Override
    public Developer createDeveloper(){
        return new CPPDeveloper();
    }
}