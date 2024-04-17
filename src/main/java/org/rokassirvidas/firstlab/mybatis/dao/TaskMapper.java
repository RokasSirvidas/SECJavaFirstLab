package org.rokassirvidas.firstlab.mybatis.dao;

import org.mybatis.cdi.Mapper;
import org.rokassirvidas.firstlab.mybatis.model.Task;

import java.util.List;
@Mapper
public interface TaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TASK
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TASK
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    int insert(Task row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TASK
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    Task selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TASK
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    List<Task> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TASK
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    int updateByPrimaryKey(Task row);
}