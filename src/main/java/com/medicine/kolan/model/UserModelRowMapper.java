package com.medicine.kolan.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModelRowMapper implements RowMapper<UserModel> {
    @Override
    public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UserModel(
                rs.getInt("id"),
                rs.getString("created_at"),
                rs.getString("updated_at"),
                rs.getString("email"),
                rs.getString("name"),
                rs.getString("password"),
                rs.getString("user_name")
        );
    }
}
