package com.eshore.nrms.sysmgr.service;

import com.eshore.khala.core.api.IBaseService;
import com.eshore.nrms.sysmgr.pojo.StuBasicInfo;

public interface IStuBasicInfoService extends IBaseService<StuBasicInfo> {
	public StuBasicInfo getStuUserBySno(String sno);
	
	public StuBasicInfo userLogin(String name);
}
