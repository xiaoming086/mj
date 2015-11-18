package cn.itcast.jk.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractProductDao;
import cn.itcast.jk.domain.ContractProduct;
@Repository
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements
		ContractProductDao {

	public ContractProductDaoImpl() {
		super.setNs("cn.itcast.jk.mapper.ContractProductMapper");
	}

	public void deleteByContractId(Serializable contractId) {
		super.getSqlSession().delete(this.getNs()+".deleteByContractId", contractId);
	}

	@Override
	public List<ContractProduct> contractProductByContractId(StringBuffer[] ids) {
		return super.getSqlSession().selectList(this.getNs()+".contractProductByContractId", ids);
	}

}
