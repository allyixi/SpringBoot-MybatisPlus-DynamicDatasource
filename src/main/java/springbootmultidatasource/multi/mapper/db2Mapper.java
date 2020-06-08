package springbootmultidatasource.multi.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import springbootmultidatasource.multi.po.db2;

@Repository
@Mapper
@DS("slave_1")
public interface db2Mapper extends BaseMapper<db2> {

}
