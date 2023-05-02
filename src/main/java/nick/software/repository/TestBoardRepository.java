package nick.software.repository;

import nick.software.entity.testBoard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestBoardRepository extends JpaRepository<testBoard, Long> {

    List<testBoard> findAll();

}
