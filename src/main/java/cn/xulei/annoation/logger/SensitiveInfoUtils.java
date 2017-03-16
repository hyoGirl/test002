package cn.xulei.annoation.logger;

import java.lang.reflect.Field;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

public class SensitiveInfoUtils {

	public enum SensitiveType {
		/**
		 * 用户名
		 */
		username,

		/**
		 * 密码
		 */
		userpassword;

	}

	/**
	 * 说明：定义脱敏方法
	 * @param fullname 用户全名称例如 小明
	 * @return 小*
	 * @author 徐磊
	 * @time：2016年9月4日 下午5:40:54
	 */
	public static String username(String fullname) {
		if (StringUtils.isBlank(fullname)) {
			return "";
		}
		String simpleName = StringUtils.left(fullname, 1);
		int length = StringUtils.length(fullname);
		return StringUtils.rightPad(simpleName, length, "*");
	}

	// 获取需要进行脱敏处理的json
	public static String getJson(Object user) {
		String json = null;
		// 获取注解信息。步骤固定，先获取当前类class--method--Annoation--info信息
		if (null != User) {
			Class<? extends Object> raw = user.getClass();
			try {
				// 判断这个是不是自定义的注解
				if (raw.isInterface()) {
					return json;
					Gson g = new Gson();
					// 把对象转换为json格式的字符串
					String str = g.toJson(user, user.getClass());
					// 再把json格式的字符串转换为Object类型
					Object clone = g.fromJson(str, user.getClass());
					// 通过反射获取这个类中的所有字段
					Field[] allFiled = SensitiveInfoUtils.findALLFiled(raw);
					
					SensitiveInfoUtils.replace(allFiled,clone,,referenceCounter);

				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return json;

	}

	private static Field[] findALLFiled(Class<? extends Object> clazz) {
		Field[] fileds = clazz.getDeclaredFields();
		while (null != clazz.getSuperclass() && !Object.class.equals(clazz.getSuperclass())) {
			fileds = (Field[]) ArrayUtils.addAll(fileds, clazz.getSuperclass().getDeclaredFields());
			clazz = clazz.getSuperclass();
		}
		return fileds;
	}
}
