package nick.software.controller;

import nick.software.service.TestBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestBoardController {

    private final TestBoardService testBoardService;

    public TestBoardController(TestBoardService testBoardService) {
        this.testBoardService = testBoardService;
    }

    @GetMapping("/Board")
    public String getBoard(Model model){
        model.addAttribute("boardList", testBoardService.getTestBoardAll());
        return "boardList";
    }

}
