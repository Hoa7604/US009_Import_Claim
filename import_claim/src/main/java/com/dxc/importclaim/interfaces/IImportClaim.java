package com.dxc.importclaim.interfaces;

import java.util.List;

import com.dxc.importclaim.io.ImportClaim;
import com.dxc.importclaim.io.MotorPolicy;

public interface IImportClaim {
	
	public List<ImportClaim> findAll();
//	public ImportClaim findOne(String id);
	public ImportClaim findByClaimNo(String id);
	public List<ImportClaim> findByPolicyNo(String id);
	public List<ImportClaim> findByPolicyOwner(String id);
	public ImportClaim findByAll(String claimno, String pilicyno, String policyowner);
	public List<ImportClaim> readFileExcel(String excelFilePath);
	public void saveClaim(ImportClaim addClaim);
	public void updateClaim(ImportClaim updateClaim); 
	public MotorPolicy findPolicyMotor(String id);
}
