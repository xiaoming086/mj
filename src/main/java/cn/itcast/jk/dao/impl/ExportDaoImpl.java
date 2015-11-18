package cn.itcast.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractDao;
import cn.itcast.jk.dao.ExportDao;
import cn.itcast.jk.domain.Contract;
import cn.itcast.jk.domain.Export;
import cn.itcast.jk.vo.ContractVO;
@Repository
public class ExportDaoImpl extends BaseDaoImpl<Export> implements
		ExportDao {

	public ExportDaoImpl(){
		super.setNs("cn.itcast.jk.mapper.ExportMapper");
	}
	public void updateState(Map<String, Object> map) {
		super.getSqlSession().update(this.getNs() + ".updateState",map);
	}
	public Export wsview(String contractNo) {
		return super.getSqlSession().selectOne(this.getNs()+ ".wsview", contractNo);
	}
	
}
