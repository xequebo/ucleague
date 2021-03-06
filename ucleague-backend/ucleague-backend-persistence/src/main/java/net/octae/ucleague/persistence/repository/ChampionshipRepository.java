package net.octae.ucleague.persistence.repository;

import net.octae.ucleague.persistence.entity.ChampionshipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Championship repository.
 */
public interface ChampionshipRepository extends JpaRepository<ChampionshipEntity, Long> {

	@Modifying
	@Query("delete from CHAMPIONSHIP championship where championship.year = ?1")
	void removeChampionship(Long year);

	@Modifying
	@Query("delete from CHAMPIONSHIP championship where championship.winner.id = ?1 and championship.year = ?2")
	void removeTeamChampionship(Long teamId, Long year);

}
