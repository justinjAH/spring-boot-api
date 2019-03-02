package repositrypackage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beanpackage.Beanclas;
/**  repository. */
@Repository
public interface Repositry extends CrudRepository<Beanclas, Integer> {
}
