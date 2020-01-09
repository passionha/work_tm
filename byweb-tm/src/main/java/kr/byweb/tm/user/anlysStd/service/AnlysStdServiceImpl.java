package kr.byweb.tm.user.anlysStd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.byweb.tm.user.anlysStd.dao.AnlysStdDao;

@Service
public class AnlysStdServiceImpl implements AnlysStdService{
	
	@Autowired
	private AnlysStdDao anlysStdDao;
	
	@Override
	public String selectTime() throws Exception {
		String queryId = "selectTime";
		return anlysStdDao.selectTime(queryId);
	}
	
}
