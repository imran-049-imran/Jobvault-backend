package hrms.hrms.core.concretes;

import org.springframework.stereotype.Service;
import hrms.hrms.core.abstracts.HrConfirmaitonService;
import hrms.hrms.core.utilities.Result;
import hrms.hrms.core.utilities.SuccessResult;
import hrms.hrms.model.Employee;

@Service
public class HrConfirmationManager implements HrConfirmaitonService {

	@Override
	public Result isConfirm(Employee employer) {
		return new SuccessResult("accepted");
	}

}
