package com.gx.controller;
import com.gx.domain.Account;
import com.gx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class AccountController {
    @Autowired//2��autowired˵����2�����ϣ�mybatis�����ļ������ӳ�д��spirng�����ļ���spirng�������ļ��Լ�����д��web.xml�� // by type
    private AccountService accountService;
    @RequestMapping("/menu")
    public String menu()
    {
    	return "menu";
    }
    @RequestMapping("/all")//4 find
    public String findAll(Model model){  //�����ݣ� Model����
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "all";
    }
    @RequestMapping("/add")//1 add
    public String gun()
    {
    	return "add";
    }
    @RequestMapping("/del/{name}")//2 delete
    public String delete(@PathVariable("name") String nameing)//ע��
    {
    	accountService.deleteAccount(nameing);
    	return "redirect:/all";
    }
    @RequestMapping("account/save")//add form action
    public void save(HttpServletRequest request, HttpServletResponse response, Account account)throws IOException
    {
		accountService.saveAccount(account);
		response.sendRedirect(request.getContextPath()+"/all");	  	
    }
    @RequestMapping("/update")// 3 update
    public String update()
    {
    	return "update";
    	
    }
    @RequestMapping("account/up")//update form action
    public String up( Account account)throws IOException
    {
		accountService.updateAccount(account);
		return "redirect:/all";		  	
    }   
}



