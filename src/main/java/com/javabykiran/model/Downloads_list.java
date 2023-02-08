package com.javabykiran.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="downloads_list", catalog = "adminlte")
public class Downloads_list implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private byte[] name;
	private String vendor;
	private String version;
	private String bit_32;
	private String bit_64;
	private String common;
	private String officialSourrce;

	public Downloads_list() {
		// TODO Auto-generated constructor stub
	}

	public Downloads_list(Integer id, byte[] name, String vendor, String version, String bit_32, String bit_64,
			String common, String officialSource) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.version = version;
		this.bit_32 = bit_32;
		this.bit_64 = bit_64;
		this.common = common;
		officialSourrce = officialSource;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getName() {
		return name;
	}

	public void setName(byte[] name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBit_32() {
		return bit_32;
	}

	public void setBit_32(String bit_32) {
		this.bit_32 = bit_32;
	}

	public String getBit_64() {
		return bit_64;
	}

	public void setBit_64(String bit_64) {
		this.bit_64 = bit_64;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getOfficialSourrce() {
		return officialSourrce;
	}

	public void setOfficialSourrce(String officialSource) {
		officialSourrce = officialSource;
	}
	
	
	
}
