package com.gx.service.Impl;

import com.gx.dao.IAccountdao;
import com.gx.domain.Account;
import com.gx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountdao iaccountdao;

    @Override
    public List<Account> findAll() {
        return iaccountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        iaccountdao.saveAccount(account);
    }
    @Override
    public void deleteAccount(String nameing){
        iaccountdao.deleteAccount(nameing);
    }
    @Override
    public void updateAccount(Account account) {
    	iaccountdao.updateAccount(account);
    }    
}


