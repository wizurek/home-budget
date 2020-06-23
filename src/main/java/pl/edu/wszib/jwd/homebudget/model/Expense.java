package pl.edu.wszib.jwd.homebudget.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expense")
public class Expense {

    @Id
    private Long id;

    private Instant expenseDate;

    private String descript;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;


}
