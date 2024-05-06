package org.eniso.session5.exercice1;

public abstract class BaseModel implements MachineLearningModel {
    protected String name;
    protected int version;
    protected String description;
    protected String device = "cpu";

    public BaseModel(String name, int version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public abstract void displayDetails();

}
