package pl.edu.wszib.jwd.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.homebudget.model.HomeBudget;

@Repository
public interface HomeBudgetDao extends CrudRepository<HomeBudget, Integer> {

HomeBudget findByName(String name);





}
