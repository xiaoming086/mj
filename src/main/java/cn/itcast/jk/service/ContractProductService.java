package cn.itcast.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;

public interface ContractProductService {
	public List<ContractProduct> findPage(Page page);		//分页查询
	public List<ContractProduct> find(Map paraMap);			//带条件查询，条件可以为null，既没有条件；返回list对象集合
	public ContractProduct get(Serializable id);			//只查询一个，常用于修改
	public void insert(ContractProduct entity);				//插入，用实体作为参数
	public void update(ContractProduct entity);				//修改，用实体作为参数
	public void deleteById(Serializable id);		//按id删除，删除一条；支持整数型和字符串类型ID
	public void delete(Serializable[] ids);			//批量删除；支持整数型和字符串类型ID
	
	public List<Factory> getFactoryList();          //获取厂家集合
}
