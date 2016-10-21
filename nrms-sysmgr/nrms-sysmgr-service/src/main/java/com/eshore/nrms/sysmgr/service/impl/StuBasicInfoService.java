package com.eshore.nrms.sysmgr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eshore.khala.core.data.api.dao.IBaseDao;
import com.eshore.khala.core.service.impl.BaseServiceImpl;
import com.eshore.nrms.sysmgr.dao.IStuBasicInfoDao;
import com.eshore.nrms.sysmgr.pojo.StuBasicInfo;
import com.eshore.nrms.sysmgr.service.IStuBasicInfoService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StuBasicInfoService extends BaseServiceImpl<StuBasicInfo> implements IStuBasicInfoService {

	@Autowired
	private IStuBasicInfoDao stuBasicInfoDao;

	@Override
	public IBaseDao<StuBasicInfo> getDao() {
		// TODO Auto-generated method stub
		return stuBasicInfoDao;
	}

	@Override
	public StuBasicInfo getStuUserBySno(String sno) {
		return this.stuBasicInfoDao.queryStuUserBySno(sno);
	}

	@Override
	@Transactional(readOnly = true)
	public StuBasicInfo userLogin(String sno) {
		StuBasicInfo stuBasicInfo = this.stuBasicInfoDao.queryStuUserBySno(sno);
		return stuBasicInfo;
	}

}
