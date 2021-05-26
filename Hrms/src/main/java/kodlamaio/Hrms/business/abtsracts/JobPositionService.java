package kodlamaio.Hrms.business.abtsracts;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
