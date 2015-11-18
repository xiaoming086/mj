package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;

public interface ContractProductDao extends BaseDao<ContractProduct> {
	public void deleteByContractId(Serializable contractId);
	public List<ContractProduct> contractProductByContractId(StringBuffer[] ids);
}
