package com.nanda.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.Model.Menu;
import com.nanda.Util.ConnectionUtil;

public class MenuDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {

		String sql = "insert into fooditems(id,name) values(?,?)";
		Object[] params = { menu.getId(), menu.getName() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(Menu menu) {

		String sql = "update fooditems set name=? where id=?";
		Object[] params = { menu.getName(), menu.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from fooditems where id=?";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows deleted: " + rows);

	}

}
