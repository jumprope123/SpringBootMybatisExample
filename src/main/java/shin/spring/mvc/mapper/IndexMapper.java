package shin.spring.mvc.mapper;

import org.apache.ibatis.annotations.Mapper;
import shin.spring.mvc.vo.MemberVO;


@Mapper
public interface IndexMapper {

    MemberVO selectOneMember();
}
