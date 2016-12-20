package com.nanda.dao;

import com.nanda.DAO.MenuDao;
import com.nanda.Model.Menu;

public class TestMenuDAO {
	public static void main(String[] args) {
		MenuDao menuDAO = new MenuDao();

		Menu menu = new Menu();

		menu.setId(2);
		menu.setName("IDLY");

		// menuDAO.save(menu);
		// menuDAO.update(menu);
		menuDAO.save(menu);
	}

}
