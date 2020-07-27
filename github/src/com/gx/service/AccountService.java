package com.gx.service;
import com.gx.domain.Account;
import java.util.List;
public interface AccountService {//service业务层接口  以AccountServise来实现
    public List<Account> findAll();
    public void saveAccount(Account account);
    public void deleteAccount(String nameing);
    public void updateAccount(Account account);
}
