package com.eshore.nrms.sysmgr.dao.impl;

import org.springframework.stereotype.Repository;

import com.eshore.khala.core.data.jpa.dao.impl.JpaDaoImpl;
import com.eshore.nrms.sysmgr.dao.IStuBasicInfoDao;
import com.eshore.nrms.sysmgr.pojo.StuBasicInfo;

@Repository
public class StuBasicInfoImpl extends JpaDaoImpl<StuBasicInfo> implements IStuBasicInfoDao {

	@Override
	public StuBasicInfo queryStuUserBySno(String sno) {

		String hql = "from StuBasicInfo u where u.sno = ?";

		return this.getPojo(hql, new Object[] { sno });
	}

}
