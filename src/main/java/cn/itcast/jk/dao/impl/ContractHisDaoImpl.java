package cn.itcast.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractHisDao;
import cn.itcast.jk.domain.Contract;
import cn.itcast.jk.vo.ContractVO;
@Repository
public class ContractHisDaoImpl extends BaseDaoImpl<Contract> implements
		ContractHisDao {

	public ContractHisDaoImpl(){
		super.setNs("cn.itcast.jk.mapper.ContractHisMapper");
	}
	
}
