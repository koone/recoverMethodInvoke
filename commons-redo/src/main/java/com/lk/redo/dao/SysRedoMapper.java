package com.lk.redo.dao;

import com.lk.redo.model.SysRedo;

import java.util.List;

public interface SysRedoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    int insert(SysRedo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    int insertSelective(SysRedo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    SysRedo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(SysRedo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_redo
     *
     * @mbg.generated Fri Nov 23 15:31:51 CST 2018
     */
    int updateByPrimaryKey(SysRedo record);

    List<SysRedo> findAutoRedoItem();

    int countNeedRedoItem();
}