package com.dxc.importclaim.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.importclaim.io.ImportClaim;
import com.dxc.importclaim.service.ImportClaimService;

@Controller
public class ImportClaimController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3138835057077803718L;
	@Autowired
	ImportClaimService claimservice;
	
	
	@RequestMapping(value = "/importclaim", method = RequestMethod.GET)
	public String home(Model model) {
		List<ImportClaim> listclaim = claimservice.getAll();
//		for (ImportClaim importClaim : listclaim) {
//			System.out.println("List===" + importClaim.getVehicle_registration_no());	
//			
//		}
		model.addAttribute("ClaimList", listclaim);
		return "claim"; 
	}


	@RequestMapping(value = "/findclaim", method = RequestMethod.POST)

	public String doPost(HttpServletRequest req, HttpServletResponse resp, Model model) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id_claimno = "";
		String id_policyno = "";
		String id_policyowner = "";
		
		
		if ("" != req.getParameter("id_claimno") && "" == req.getParameter("id_policyno") && "" == req.getParameter("id_policyowner")) {
			id_claimno = req.getParameter("id_claimno");
			ImportClaim claimNoList = claimservice.claimByClaimNo(id_claimno);
			if (null == claimNoList) {
				return "claim";
			}
			System.out.println("------"+claimNoList.getPolicy_owner());
			
			model.addAttribute("ClaimNo", claimNoList);
			model.addAttribute("sym", 1);
		}
		
		if("" == req.getParameter("id_claimno") && "" != req.getParameter("id_policyno") && "" == req.getParameter("id_policyowner")) {
			id_policyno = req.getParameter("id_policyno");
			List<ImportClaim> policyNoclaim = claimservice.claimByPolicyNo(id_policyno);
			if (null == policyNoclaim) {
				return "claim";
			}
//			for (ImportClaim importPolicyNo : policyNoclaim) {
//				System.out.println("policyNo: " + importPolicyNo.getPolicy_no());
//			}
			model.addAttribute("PolicyNoClaim", policyNoclaim);
			model.addAttribute("sym", 2);
		}
		
		if ("" == req.getParameter("id_claimno") && "" == req.getParameter("id_policyno") && "" != req.getParameter("id_policyowner")) {
			id_policyowner = req.getParameter("id_policyowner");
			List<ImportClaim> policyOwnerClaim = claimservice.claimByPolicyOwner(id_policyowner);
//			for (ImportClaim importPolicyOwner : policyNoclaim) {
//				System.out.println("policyOwner:" + importPolicyOwner.getPolicy_no());
//			}
			if (null == policyOwnerClaim) {
				return "claim";
			}
			model.addAttribute("PolicyOwnerClaim", policyOwnerClaim);
			model.addAttribute("sym", 3);
		}
		
		if ("" != req.getParameter("id_claimno") && "" != req.getParameter("id_policyno") && "" != req.getParameter("id_policyowner")) {
			id_claimno = req.getParameter("id_claimno");
			id_policyno = req.getParameter("id_policyno");
			id_policyowner = req.getParameter("id_policyowner");
			ImportClaim claimByAll = claimservice.claimByAll(id_claimno, id_policyno, id_policyowner);
//			System.out.println("Claim All: "+ claimByAll.getClaim_no());
			if (null == claimByAll) {
				return "claim";
			}
			model.addAttribute("sym", 4);
			model.addAttribute("ClaimAll", claimByAll);
		}
		
		return "claim";
	}
		
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String readFileExcel(HttpServletRequest req, HttpServletResponse rsp, Model model) {
		Logger logger = Logger.getLogger(ImportClaimController.class);
		String excelFilePath = "/Users/admin/Desktop/dxc/" + req.getParameter("file");
		
		
 		List<ImportClaim> dataExcel = claimservice.readFileExcel(excelFilePath);
		for (ImportClaim importClaim : dataExcel) {	
			if (!importClaim.getClaim_no().isEmpty()) {
				logger.info("%n "+importClaim.getClaim_no() +", "+ importClaim.getPolicy_no() 
				+", "+ importClaim.getPolicy_owner() + ", " + importClaim.getDate_occurred()+", " );
			}
		}
		
		model.addAttribute("DataImportFile", dataExcel);
		model.addAttribute("sym", 5);
		return "claim";
	}
	
}
