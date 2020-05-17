package pl.edu.wszib.jwd.homebudget.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "home_budget")
public class HomeBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date time;
    private String name;

    public HomeBudget()  {

    }

    public HomeBudget(Date time, String name) {
        this.time = time;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
