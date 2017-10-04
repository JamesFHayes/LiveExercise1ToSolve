package ie.cit.soft8027.liveexercise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ie.cit.soft8027.liveexercise1.entity.Module;
import ie.cit.soft8027.liveexercise1.repository.LearningOutcomeRepository;
import ie.cit.soft8027.liveexercise1.repository.ModuleRepository;

// MISSING!
public class LearningServiceImpl {
	private Module module;
	
	@Autowired
	private ModuleRepository moduleRepo;

	
	private LearningOutcomeRepository loRepo;
	
	/**
	 * This may not be the most efficient way to do this - using a join query with result set extractor might be faster
	 */
	@Autowired
	public void populateLearningOutcomes(Module module) {
		module.setLearningOutcomes(loRepo.getByModuleId(module.getId()));
	}

	public List<Module> getAllModules() {
		return moduleRepo.findAll();
	}

}
