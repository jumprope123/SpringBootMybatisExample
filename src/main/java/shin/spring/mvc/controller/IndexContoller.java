package shin.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shin.spring.mvc.service.IndexService;
import shin.spring.mvc.vo.MemberVO;

import java.util.List;

@Controller
public class IndexContoller {

    private IndexService indexService;

    @Autowired
    public IndexContoller(IndexService indexService) {
        this.indexService = indexService;
    }

    @ResponseBody
    @GetMapping("/")
    public String index(){
        MemberVO memberVO = indexService.selectAllMember();
        return memberVO.getName();
    }

}
