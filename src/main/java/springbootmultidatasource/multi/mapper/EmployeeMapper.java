package springbootmultidatasource.multi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import springbootmultidatasource.multi.po.Employee;

@Repository
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}