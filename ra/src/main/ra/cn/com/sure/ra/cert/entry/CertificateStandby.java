/**
 * 
 */
package cn.com.sure.ra.cert.entry;

import java.util.Date;


/**
 * @author Limin
 *
 */
public class CertificateStandby {
	
	private String id;
	
	/**
	 * 证书系列号
	 */
	private String certSn;
	
	/**
	 * 证书dn
	 */
	private String certDn;
	
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
	private String ctmlId;
	
	/**
	 * 管理员
	 */
	private String admin;
	
	/**
	 * USBKEY编号
	 */
	private String UsbKeyNumber;
	
	/**
	 * 签名证书base64格式
	 */
	private String bsae64SignCert;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCertSn() {
		return certSn;
	}

	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}

	public String getCertDn() {
		return certDn;
	}

	public void setCertDn(String certDn) {
		this.certDn = certDn;
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

	public String getCtmlId() {
		return ctmlId;
	}

	public void setCtmlId(String ctmlId) {
		this.ctmlId = ctmlId;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getUsbKeyNumber() {
		return UsbKeyNumber;
	}

	public void setUsbKeyNumber(String usbKeyNumber) {
		UsbKeyNumber = usbKeyNumber;
	}

	public String getBsae64SignCert() {
		return bsae64SignCert;
	}

	public void setBsae64SignCert(String bsae64SignCert) {
		this.bsae64SignCert = bsae64SignCert;
	}

	public String getBase64EncCert() {
		return base64EncCert;
	}

	public void setBase64EncCert(String base64EncCert) {
		this.base64EncCert = base64EncCert;
	}

	public String getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(String isSingle) {
		this.isSingle = isSingle;
	}

	public String getCertStatus() {
		return certStatus;
	}

	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus;
	}

	public String getCertRef() {
		return certRef;
	}

	public void setCertRef(String certRef) {
		this.certRef = certRef;
	}

	/**
	 * 加密证书base64格式
	 */
	private String base64EncCert;
	
	/**
	 * 证书类型，单证书还是双证书
	 */
	private String isSingle;
	
	/**
	 * 证书状态
	 */
	private String certStatus;
	
	/**
	 * 证书授权码
	 */
	private String certRef;
	
}
