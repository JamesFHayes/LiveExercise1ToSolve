package ie.cit.soft8027.liveexercise1.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cit.soft8027.liveexercise1.entity.Module;

public class ModuleRowMapper {

	public Module mapRow(ResultSet rs, int row) throws SQLException {
		return new Module(rs.getInt("id"),
				rs.getString("code"), 
				rs.getInt("credits"), 
				rs.getString("nfq_level"), 
				rs.getString("description")
		);
	}

}
