package com.ali.demo.DesignPattern.factroyMode;

public class LoginController {

	private UserDao dao;

	public LoginController() {
//		dao = new JdbcUserDao();
//		dao=SimpleDaoFactory.createDao(SimpleDaoFactory.JDBC_DAO);
//		dao=SimpleDaoFactory2.createDao(JdbcUserDao.class);
		dao = SimpleDaoFactory3.createJDBCUserDao();
	}

	public void login() {
		User user = dao.findUser(1);
	}
}
