package app.model;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "I am dog";
    }
}
