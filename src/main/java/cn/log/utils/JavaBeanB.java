package cn.log.utils;

import java.util.Map;
import java.util.Set;

import cn.log.utils.SensitiveInfoUtils.SensitiveType;

public class JavaBeanB {
	@SensitiveInfo(type = SensitiveType.CHINESE_NAME)
	private String name = "B先生";

	private JavaBeanA a;

	private Set<JavaBeanA> list;

	private Map<String, JavaBeanA> map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JavaBeanA getA() {
		return a;
	}

	public void setA(JavaBeanA a) {
		this.a = a;
	}

	public Set<JavaBeanA> getList() {
		return list;
	}

	public void setList(Set<JavaBeanA> list) {
		this.list = list;
	}

	public Map<String, JavaBeanA> getMap() {
		return map;
	}

	public void setMap(Map<String, JavaBeanA> map) {
		this.map = map;
	}
}