package cn.log.utils;

import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.log.utils.SensitiveInfoUtils.SensitiveType;

public class JavaBeanA {

	public JavaBeanA(String name, String id) {

	}

	@SensitiveInfo(type = SensitiveType.CHINESE_NAME)
	private String name = "A先生";

	private JavaBeanB b;

	private Date date;

	private List<JavaBeanB> list;

	private Map<String, JavaBeanB> map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JavaBeanB getB() {
		return b;
	}

	public void setB(JavaBeanB b) {
		this.b = b;
	}

	public List<JavaBeanB> getList() {
		return list;
	}

	public void setList(List<JavaBeanB> list) {
		this.list = list;
	}

	public Map<String, JavaBeanB> getMap() {
		return map;
	}

	public void setMap(Map<String, JavaBeanB> map) {
		this.map = map;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
