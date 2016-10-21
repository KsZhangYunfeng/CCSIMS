package com.eshore.nrms.sysmgr.dao;

import com.eshore.khala.core.data.api.dao.IBaseDao;
import com.eshore.nrms.sysmgr.pojo.StuBasicInfo;
import com.eshore.nrms.sysmgr.pojo.UserInfo;

public interface IStuBasicInfoDao extends IBaseDao<StuBasicInfo>{
	public StuBasicInfo queryStuUserBySno(String sno);
}
