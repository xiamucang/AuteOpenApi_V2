/**
 * 
 */
package aute.openapi.vo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Cangxu
 *
 */
@XmlRootElement(name="InfoArea")
public class InfoAreaAp implements Serializable {
	private String districtName;
	private String fullName;
	private List<InfoDetailAp> apInfo;
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public List<InfoDetailAp> getApInfo() {
		return apInfo;
	}
	public void setApInfo(List<InfoDetailAp> apInfo) {
		this.apInfo = apInfo;
	}
}
