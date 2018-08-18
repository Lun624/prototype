package xyz.masaimara.prototype.database.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.masaimara.prototype.database.domain.JobInfo;

@org.apache.ibatis.annotations.Mapper
public interface TestMapper {

    @Select("select job_name from job_base_information where job_id=#{job_id}")
    JobInfo findJobById(@Param("job_id") String jobId);

}
