package cn.itcast.jk.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ExtCproductDao;
import cn.itcast.jk.domain.ExtCproduct;

@Repository
public class ExtCproductDaoImpl extends BaseDaoImpl<ExtCproduct> implements
		ExtCproductDao {

	public ExtCproductDaoImpl() {
		super.setNs("cn.itcast.jk.mapper.ExtCproductMapper");
	}

	public void deleteByContractId(Serializable contractId) {
		super.getSqlSession().delete(super.getNs()+".deleteByContractId", contractId);
	}

	public List<ExtCproduct> extCproductByContractId(String[] contractIds) {
		return super.getSqlSession().selectList(this.getNs()+".extCproductByContractId",contractIds);
	}

}
