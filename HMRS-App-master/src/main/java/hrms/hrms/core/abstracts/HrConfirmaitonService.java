package hrms.hrms.core.abstracts;

import hrms.hrms.core.utilities.Result;
import hrms.hrms.model.Employee;

public interface HrConfirmaitonService {
	
	public Result isConfirm(Employee employer);

}
