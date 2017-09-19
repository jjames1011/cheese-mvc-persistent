package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, message = "Please fill in the name")
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    //constructors
    public Menu() {

    }
    public Menu(String aName){
        this.name = aName;
    }
    //getters&setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }
    //Add Cheese items to cheeses list
    public void addItem(Cheese item){
        cheeses.add(item);
    }
}
