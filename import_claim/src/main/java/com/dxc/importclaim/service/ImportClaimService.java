package com.dxc.importclaim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.importclaim.dao.ImportClaimDAO;
import com.dxc.importclaim.io.ImportClaim;

@Service
public class ImportClaimService {
	
	@Autowired
	ImportClaimDAO claimdao;
	
	public List<ImportClaim> getAll() {
		List<ImportClaim> listClaim = claimdao.findAll();
//		System.out.println("-------------"+listClaim);
		return listClaim;
	}
	
	public ImportClaim claimByClaimNo(String id) {
		ImportClaim listClaim = claimdao.findByClaimNo(id);
//		System.out.println("-------------"+listClaim.getPolicy_no());
		return listClaim;	
	}
	
	public List<ImportClaim> claimByPolicyNo(String id) {
		List<ImportClaim> listPolicyNo = claimdao.findByPolicyNo(id);
		return listPolicyNo;
	}
	
	public List<ImportClaim> claimByPolicyOwner(String id) {
		List<ImportClaim> listPolicyOwner = claimdao.findByPolicyOwner(id);
		return listPolicyOwner;
	}
	
	public ImportClaim claimByAll(String claimno, String pilicyno, String policyowner) {
		ImportClaim listClaimAll = claimdao.findByAll(claimno, pilicyno, policyowner);
		return listClaimAll;
	}
	
	public List<ImportClaim> readFileExcel(String excelFilePath) {
		List<ImportClaim> dataExcel = claimdao.readFileExcel(excelFilePath);
		return dataExcel;
	}
}
