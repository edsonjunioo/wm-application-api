package wedding.manager.wm_application_api.couple;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoupleRepository extends JpaRepository<Couple, Long> {

    Page<Couple> findAllByActiveTrue(Pageable pageable);

}
