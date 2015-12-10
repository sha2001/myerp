package repository;

import org.sha2001.common.domain.Dictionary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DictionaryRepository extends CrudRepository<Dictionary, UUID> {

    List<Dictionary> findByCategory(String category);
}
