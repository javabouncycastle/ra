package cn.com.sure.log.dao;

import java.util.List;

import cn.com.sure.log.entry.RaAuditOpLog;

public interface RaAuditOpLogDAO {

	void insert(RaAuditOpLog auditOpLog);

	/**
	 * @return
	 */
	List<RaAuditOpLog> selectAll();

	/**
	 * @param auditOpLog
	 * @return
	 */
	List<RaAuditOpLog> searchByCondition(RaAuditOpLog auditOpLog);
	
	

}
