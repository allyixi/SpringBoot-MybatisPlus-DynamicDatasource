package springbootmultidatasource.multi;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springbootmultidatasource.multi.mapper.EmployeeMapper;
import springbootmultidatasource.multi.mapper.db2Mapper;
import springbootmultidatasource.multi.po.Employee;
import springbootmultidatasource.multi.po.db2;

@RunWith(SpringRunner.class)
@SpringBootTest
class MultiApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private db2Mapper db2Mapper;


    //主库测试
    @Test
    void primary() {
        //匹配查询
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        //eq(键,值)相等
        wrapper.eq("last_name", "Tom");
        //查询一个
        Employee employee = employeeMapper.selectOne(wrapper);
        System.out.println(employee);
    }

    //从库测试
    @Test
    void slave_1() {
        //匹配查询
        QueryWrapper<db2> wrapper = new QueryWrapper<>();
        //eq(键,值)相等
        wrapper.eq("id", 1);
        //查询一个
        db2 db2 = db2Mapper.selectOne(wrapper);
        System.out.println(db2);
    }

}
