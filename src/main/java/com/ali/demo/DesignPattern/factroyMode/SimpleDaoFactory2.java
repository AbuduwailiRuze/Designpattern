package com.ali.demo.DesignPattern.factroyMode;

public class SimpleDaoFactory2 {

	public static <T extends UserDao> T createDao(Class<T> clazz) {
		T dao = null;
		try {
			dao = (T) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}

}
