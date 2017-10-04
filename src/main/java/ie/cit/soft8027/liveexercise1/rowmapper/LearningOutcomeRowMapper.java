package ie.cit.soft8027.liveexercise1.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cit.soft8027.liveexercise1.entity.LearningOutcome;
import ie.cit.soft8027.liveexercise1.entity.Module;

public class LearningOutcomeRowMapper {

	public LearningOutcome mapRow(ResultSet rs, int row) throws SQLException {
		
		Module module = new Module();
		module.setId(rs.getInt("module_id"));
		
		return new LearningOutcome(rs.getInt("id"),
				rs.getInt("display_order"), 
				rs.getString("description"),
				module
		);
	}

}
