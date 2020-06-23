package pl.edu.wszib.jwd.homebudget.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.jwd.homebudget.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    Category findByName(String string);




}
