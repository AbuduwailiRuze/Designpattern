package com.ali.demo.DesignPattern.factroyMode;

public class SimpleDaoFactory {

	public static final int JDBC_DAO = 1;
	public static final int HIBERNATE_DAO = 2;

	public static UserDao createDao(int type) {
		UserDao dao = null;
		switch (type) {
		case JDBC_DAO:
			dao = new JdbcUserDao();
			break;
		case HIBERNATE_DAO:
			dao = new HibernateUserDao();
			break;

		default:
			break;
		}
		return dao;

	}

}
