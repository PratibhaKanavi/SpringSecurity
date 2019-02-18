package com.tvd.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tvd.security.model.Employee;
import com.tvd.security.service.CURDService;

@Controller
public class CurdOperation {
	
	@Autowired
	private CURDService service;

	@RequestMapping("/add")
	public ModelAndView add(){
		return new ModelAndView("add");
		
	}
	
	@RequestMapping("/addemp")
	public ModelAndView AddEmp(@ModelAttribute("emp") Employee emp){
		service.save(emp);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("view")
	public ModelAndView view(){
		
		List<Employee> list=service.view();
		return new ModelAndView("viewemp","list",list);
		
	}
	
	@RequestMapping(value="editemp/{empid}")
	public ModelAndView edit(@PathVariable int empid){
		
		Employee emp = service.edit(empid);
		return new ModelAndView("editemp","emp",emp);
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Employee emp){
		service.update(emp);
		return "redirect:/view";
		
	}
	
	@RequestMapping(value="deleteemp/{empid}")
	public ModelAndView deleteemp(@PathVariable int empid){
		service.delete(empid);
		return new ModelAndView("redirect:/view");
		
	}
	
	
	
		
}

