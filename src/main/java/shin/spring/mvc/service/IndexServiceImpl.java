package shin.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shin.spring.mvc.mapper.IndexMapper;
import shin.spring.mvc.vo.MemberVO;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService{

    private IndexMapper mapper;

    @Autowired
    public IndexServiceImpl(IndexMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public MemberVO selectAllMember() {
        return mapper.selectOneMember();
    }
}
