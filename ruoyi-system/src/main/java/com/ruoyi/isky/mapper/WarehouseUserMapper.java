package com.ruoyi.isky.mapper;

import com.ruoyi.isky.domain.WarehouseUser;
import java.util.List;	

/**
 * 用户 数据层
 * 
 * @author sunlei
 * @date 2019-11-05
 */
public interface WarehouseUserMapper 
{
	/**
     * 查询用户信息
     * 
     * @param id 用户ID
     * @return 用户信息
     */
	public WarehouseUser selectWarehouseUserById(Integer id);
	
	/**
     * 查询用户列表
     * 
     * @param warehouseUser 用户信息
     * @return 用户集合
     */
	public List<WarehouseUser> selectWarehouseUserList(WarehouseUser warehouseUser);
	
	/**
     * 新增用户
     * 
     * @param warehouseUser 用户信息
     * @return 结果
     */
	public int insertWarehouseUser(WarehouseUser warehouseUser);
	
	/**
     * 修改用户
     * 
     * @param warehouseUser 用户信息
     * @return 结果
     */
	public int updateWarehouseUser(WarehouseUser warehouseUser);
	
	/**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
	public int deleteWarehouseUserById(Integer id);
	
	/**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteWarehouseUserByIds(String[] ids);
	
}