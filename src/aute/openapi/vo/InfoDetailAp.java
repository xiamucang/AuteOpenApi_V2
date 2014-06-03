/**
 * 
 */
package aute.openapi.vo;

import java.io.Serializable;

/**
 * @author Cangxu
 *
 */
public class InfoDetailAp implements Serializable {
	private String apMac;
	private String location;
	private String deviceName;
	private String acIp;
	public String getApMac() {
		return apMac;
	}
	public void setApMac(String apMac) {
		this.apMac = apMac;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getAcIp() {
		return acIp;
	}
	public void setAcIp(String acIp) {
		this.acIp = acIp;
	}
}
