package com.lib.management.sys.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.lib.management.sys.dao.IUserDAO;
import com.lib.management.sys.dto.UserDTO;
import com.lib.management.sys.util.ModelMapperUtil;

public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void storeEntities(Collection<UserDTO> entities) {
		String query = "INSERT INTO usr (id,login,first_name,last_name,email_id,create_ts) VALUES (?,?,?,?,?,CURRENT_TIMESTAMP)";
		List<Object[]> data = new ArrayList<>();
		for (UserDTO dto : entities) {
			data.add(ModelMapperUtil.convertUserDTO(dto));
		}
		this.jdbcTemplate.batchUpdate(query, data);

	}

	@Override
	public UserDTO lookupEntity(List<String> idAttValues) {
		String query = "SELECT ID,LOGIN,FIRST_NAME,LAST_NAME,EMAIL_ID,CREATE_TS FROM USR WHERE ID = ?";
		return this.jdbcTemplate.query(query, new Object[] { idAttValues.get(0) }, new ResultSetExtractor<UserDTO>() {

			@Override
			public UserDTO extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					return ModelMapperUtil.readUserFromResultset(rs);
				} else {
					return null;
				}
			}
		});
	}

}
