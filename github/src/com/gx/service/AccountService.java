package com.gx.service;
import com.gx.domain.Account;
import java.util.List;
public interface AccountService {//serviceҵ���ӿ�  ��AccountServise��ʵ��
    public List<Account> findAll();
    public void saveAccount(Account account);
    public void deleteAccount(String nameing);
    public void updateAccount(Account account);
}
