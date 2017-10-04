package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cit.soft8027.liveexercise1.entity.LearningOutcome;
import ie.cit.soft8027.liveexercise1.rowmapper.LearningOutcomeRowMapper;

@Repository
public class JdbcLearningOutcomeRepository {

	// MISSING!
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<LearningOutcome> getByModuleId(int id) {
		// MISSING! How dow I return all learning outcomes for a given module id?
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
