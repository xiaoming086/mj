package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.ExportProductDao;
import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.ExportProductService;
import cn.itcast.util.Arith;

@Service
public class ExportProductServiceImpl implements ExportProductService {
	@Resource
	ExportProductDao exportProductDao;

	public List<cn.itcast.jk.domain.ExportProduct> findPage(Page page) {
		
		return null;
	}

	public List<cn.itcast.jk.domain.ExportProduct> find(Map paraMap) {
		return exportProductDao.find(paraMap);
	}

	public cn.itcast.jk.domain.ExportProduct get(Serializable id) {
		return exportProductDao.get(id);
	}

	public void insert(cn.itcast.jk.domain.ExportProduct entity) {
		entity.setId(UUID.randomUUID().toString());
		exportProductDao.insert(entity);
	}

	public void update(cn.itcast.jk.domain.ExportProduct entity) {
		exportProductDao.update(entity);
	}

	public void deleteById(Serializable id) {
		exportProductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		exportProductDao.delete(ids);
	}



}
