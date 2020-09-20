package patternLearning.abstractFactory.banking;

import patternLearning.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    void writeCode(){
        System.out.println("Java developer writes banking Java code");
    }
}
