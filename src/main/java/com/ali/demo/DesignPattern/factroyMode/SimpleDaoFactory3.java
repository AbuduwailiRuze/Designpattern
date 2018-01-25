package com.ali.demo.DesignPattern.factroyMode;

public class SimpleDaoFactory3 {

	public static UserDao createJDBCUserDao() {
		return new JdbcUserDao();
	}

	public static UserDao createJHibernateUserDao() {
		return new HibernateUserDao();
	}

}
