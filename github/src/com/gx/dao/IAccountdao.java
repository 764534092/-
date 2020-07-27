package com.gx.dao;

import com.gx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //此注解代表这是一个持久层，用法类似@controller、@service
public interface IAccountdao {

    @Select("select * from account")
    public List<Account> findAll();//4 find
    @Insert("insert into account (name,money) values(#{name},#{money})")//1 add
    public void saveAccount(Account account);//controller
    @Delete("delete from account where name=#{name}")//2 del
    public void deleteAccount(String nameing);
    @Update("update account	set money=#{money} where name=#{name}")//3 update
    public void updateAccount(Account account);       
}


