package co.develhope.repository2.repository;


import co.develhope.repository2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammingLanguageRepo extends JpaRepository<ProgrammingLanguage, Integer> {
}
