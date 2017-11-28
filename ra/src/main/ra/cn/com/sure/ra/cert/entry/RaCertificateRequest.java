/**
 * 
 */
package cn.com.sure.ra.cert.entry;

import java.util.Date;

import org.bouncycastle.asn1.crmf.CertTemplate;

/**
 * @author Limin
 *
 */
public class RaCertificateRequest {
	
	private String id;
	
	/**
	 * 证书cn
	 */
	private String certCn;
	
	/**
	 * 证书dn
	 */
	private String certDn;
	
	/**
	 * 证书申请时间
	 */
	private Date requestTime;
	
	/**
	 * 证书开始时间
	 */
	private Date startTime;
	
	/**
	 * 证书结束时间
	 */
	private Date endTime;
	
	/**
	 * 证书模板号
	 */
	private CertTemplate ctmlId;
	
	/**
	 * 管理员
	 */
	private String admin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCertCn() {
		return certCn;
	}

	public void setCertCn(String certCn) {
		this.certCn = certCn;
	}

	public String getCertDn() {
		return certDn;
	}

	public void setCertDn(String certDn) {
		this.certDn = certDn;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public CertTemplate getCtmlId() {
		return ctmlId;
	}

	public void setCtmlId(CertTemplate ctmlId) {
		this.ctmlId = ctmlId;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
}
