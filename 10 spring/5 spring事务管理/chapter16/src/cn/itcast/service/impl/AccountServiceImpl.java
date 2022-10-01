package cn.itcast.service.impl;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.itcast.dao.AccountDao;
import cn.itcast.service.AccountService;
//采用注解方式
@Transactional(propagation = Propagation.REQUIRED, 
		       isolation = Isolation.DEFAULT, readOnly = false)
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String outUser, String inUser, int money) {
		this.accountDao.out(outUser, money);
		// 模拟断电
		 int i = 1/0;
		this.accountDao.in(inUser, money);
	}
}
