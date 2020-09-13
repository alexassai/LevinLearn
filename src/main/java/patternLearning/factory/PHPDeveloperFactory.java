package patternLearning.factory;

public class PHPDeveloperFactory implements DeveloperFacrtory{
    @Override
    public Developer createDeveloper() {return new PHPDeveloper();}
}



