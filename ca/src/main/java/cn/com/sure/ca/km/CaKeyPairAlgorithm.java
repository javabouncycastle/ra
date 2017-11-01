/**
 * 
 */
package cn.com.sure.ca.km;

/**
 * @author Limin
 *
 */
public class CaKeyPairAlgorithm {
	
	private Long id;
	
	private String name;//别名

	private String algorithmOid;//算法OID
	
	private String algorithmName;//算法英文缩写
	
	private Integer keysize;//密钥长度
	
	private String notes;//

    private Integer isValid;//是否有效,0无效，1有效

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlgorithmOid() {
		return algorithmOid;
	}

	public void setAlgorithmOid(String algorithmOid) {
		this.algorithmOid = algorithmOid;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public Integer getKeysize() {
		return keysize;
	}

	public void setKeysize(Integer keysize) {
		this.keysize = keysize;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
    
    

}
