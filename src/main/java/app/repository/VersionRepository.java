package app.repository;

import app.domain.Version;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Version entity.
 */
@SuppressWarnings("unused")
public interface VersionRepository extends JpaRepository<Version,Long> {

}
