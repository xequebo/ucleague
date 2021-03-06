package net.octae.ucleague.persistence.repository;

import net.octae.ucleague.persistence.entity.ImageEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Image repository.
 */
public interface ImageRepository extends CrudRepository<ImageEntity, Long> {
}
