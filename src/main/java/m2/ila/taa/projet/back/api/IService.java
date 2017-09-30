package m2.ila.taa.projet.back.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
//@Repository
public interface IService<T> extends JpaRepository<T,Long> {

}

