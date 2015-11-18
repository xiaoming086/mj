package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.ExtCproductDao;
import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.dao.SysCodeDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.domain.SysCode;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.ExtCproductService;
import cn.itcast.util.Arith;

@Service
public class ExtCproductServiceImpl implements ExtCproductService {
	@Resource
	ExtCproductDao extCproductDao;
	@Resource
	FactoryDao factoryDao;
	@Resource
	SysCodeDao sysCodeDao ;

	public List<cn.itcast.jk.domain.ExtCproduct> findPage(Page page) {
		
		return null;
	}

	public List<cn.itcast.jk.domain.ExtCproduct> find(Map paraMap) {
		return extCproductDao.find(paraMap);
	}

	public cn.itcast.jk.domain.ExtCproduct get(Serializable id) {
		return extCproductDao.get(id);
	}

	public void insert(cn.itcast.jk.domain.ExtCproduct entity) {
		entity.setId(UUID.randomUUID().toString());
		if(entity.getCnumber() !=null && entity.getPrice()!=null){
				entity.setAmount(entity.getCnumber()*entity.getPrice());
		}
		
		extCproductDao.insert(entity);
	}

	public void update(cn.itcast.jk.domain.ExtCproduct entity) {
		if(entity.getCnumber() !=null && entity.getPrice()!=null){
			entity.setAmount(entity.getCnumber()*entity.getPrice());
	}
		extCproductDao.update(entity);
	}

	public void deleteById(Serializable id) {
		extCproductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		extCproductDao.delete(ids);
	}

	public List<Factory> getFactoryList() {
		Map paraMap = new HashMap();
		paraMap.put("state", 1);//1启用
		return factoryDao.find(paraMap);
	}

	public List<SysCode> getCtypeList() {
		Map paraMap = new HashMap();
		paraMap.put("parentId", 0104);
		return sysCodeDao.find(paraMap);
	}





}
