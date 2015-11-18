package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.lang.Thread.State;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.ContractProductDao;
import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.ContractProductService;
import cn.itcast.util.Arith;

@Service
public class ContractProductServiceImpl implements ContractProductService {
	@Resource
	ContractProductDao contractProductDao;
	@Resource
	FactoryDao factoryDao;

	public List<cn.itcast.jk.domain.ContractProduct> findPage(Page page) {
		
		return null;
	}

	public List<cn.itcast.jk.domain.ContractProduct> find(Map paraMap) {
		return contractProductDao.find(paraMap);
	}

	public cn.itcast.jk.domain.ContractProduct get(Serializable id) {
		return contractProductDao.get(id);
	}

	public void insert(cn.itcast.jk.domain.ContractProduct entity) {
		entity.setId(UUID.randomUUID().toString());
		Arith arith = new Arith();
		if(entity.getCnumber() !=null && entity.getPrice()!=null){
				Double amount = arith.mul(entity.getCnumber().doubleValue(), entity.getPrice().doubleValue());
				entity.setAmount(new BigDecimal(amount));
		}
		
		contractProductDao.insert(entity);
	}

	public void update(cn.itcast.jk.domain.ContractProduct entity) {
		Arith arith = new Arith();
		if(entity.getCnumber() !=null && entity.getPrice()!=null){
				Double amount = arith.mul(entity.getCnumber().doubleValue(), entity.getPrice().doubleValue());
				entity.setAmount(new BigDecimal(amount));
		}
		contractProductDao.update(entity);
	}

	public void deleteById(Serializable id) {
		contractProductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		contractProductDao.delete(ids);
	}

	public List<Factory> getFactoryList() {
		Map paraMap = new HashMap();
		paraMap.put("state", 1);//1启用
		factoryDao.find(paraMap);
		return factoryDao.find(paraMap);
	}





}
