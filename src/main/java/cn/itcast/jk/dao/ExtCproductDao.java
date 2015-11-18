package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.List;

import cn.itcast.jk.domain.ExtCproduct;

public interface ExtCproductDao extends BaseDao<ExtCproduct> {
	public void deleteByContractId(Serializable contractId);
	public List<ExtCproduct> extCproductByContractId(String[] contractIds);
}
