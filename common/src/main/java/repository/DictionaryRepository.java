package repository;

import org.sha2001.common.domain.Dictionary;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DictionaryRepository extends CrudRepository {

    List<Dictionary> findByCategory(String category);
}
