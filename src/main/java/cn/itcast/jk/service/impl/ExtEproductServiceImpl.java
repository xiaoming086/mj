package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.ExtEproductDao;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.ExtEproductService;

@Service
public class ExtEproductServiceImpl implements ExtEproductService {
	@Resource
	ExtEproductDao extEproductDao;

	public List<cn.itcast.jk.domain.ExtEproduct> findPage(Page page) {
		
		return null;
	}

	public List<cn.itcast.jk.domain.ExtEproduct> find(Map paraMap) {
		return extEproductDao.find(paraMap);
	}

	public cn.itcast.jk.domain.ExtEproduct get(Serializable id) {
		return extEproductDao.get(id);
	}

	public void insert(cn.itcast.jk.domain.ExtEproduct entity) {
		entity.setId(UUID.randomUUID().toString());
		extEproductDao.insert(entity);
	}

	public void update(cn.itcast.jk.domain.ExtEproduct entity) {
		extEproductDao.update(entity);
	}

	public void deleteById(Serializable id) {
		extEproductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		extEproductDao.delete(ids);
	}







}
