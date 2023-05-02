package nick.software.service;

import nick.software.entity.testBoard;
import nick.software.repository.TestBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TestBoardService {

    final
    TestBoardRepository testBoardRepository;

    public TestBoardService(TestBoardRepository testBoardRepository) {
        this.testBoardRepository = testBoardRepository;
    }

    @Transactional
    public List<testBoard> getTestBoardAll(){
        return testBoardRepository.findAll();
    }

}
