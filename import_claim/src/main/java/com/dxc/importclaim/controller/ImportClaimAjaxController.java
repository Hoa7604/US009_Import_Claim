package com.dxc.importclaim.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxc.importclaim.io.ImportClaim;
import com.dxc.importclaim.service.ImportClaimService;

@Controller
@RequestMapping(value = "/handleAjax")
public class ImportClaimAjaxController extends HttpServlet{
	@Autowired
	ImportClaimService claimservice;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5587586759752591690L;
	@RequestMapping(value = "/importclaim1", method = RequestMethod.GET)
	@ResponseBody
	public ImportClaim home1(HttpServletRequest req, HttpServletResponse resp) {

//		List<ImportClaim> listclaim = claimservice.getAll();
		ImportClaim listclaim = new ImportClaim("1", "2", null, "1", "1", "1", "1", "1", 1000000.0);
		
		return listclaim;
	}
	
	@RequestMapping(value = "/importclaim2", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		
		return "111111111";
	}
	
}
