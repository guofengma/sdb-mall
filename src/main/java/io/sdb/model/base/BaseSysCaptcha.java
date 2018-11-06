package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysCaptcha<M extends BaseSysCaptcha<M>> extends Model<M> implements IBean {

	public void setUuid(java.lang.String uuid) {
		set("uuid", uuid);
	}
	
	public java.lang.String getUuid() {
		return getStr("uuid");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}

	public void setExpireTime(java.util.Date expireTime) {
		set("expire_time", expireTime);
	}
	
	public java.util.Date getExpireTime() {
		return get("expire_time");
	}

}