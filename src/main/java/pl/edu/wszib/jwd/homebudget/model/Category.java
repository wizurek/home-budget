package pl.edu.wszib.jwd.homebudget.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {


    @Id
    private Long id;

    @NonNull
    private String name;

  //  public Long getId(){}
    //UTILITIES, FOOD, ENTERTAINMENT



}
