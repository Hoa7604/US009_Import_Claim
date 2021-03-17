package com.dxc.importclaim.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Repository;

import com.dxc.importclaim.interfaces.IImportClaim;
import com.dxc.importclaim.io.ImportClaim;
import com.dxc.importclaim.io.MotorPolicy;

@Repository
public class ImportClaimDAO implements IImportClaim{
	
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String connectionDB = "jdbc:sqlserver://localhost:1433";
	private static String user = "sa";
	private static String pass = "Password123@jkl#";
	public static Connection conn;
	public static Boolean checkReadFile;
	Logger logger = Logger.getLogger(ImportClaimDAO.class);
	
	public static Connection connection() {
		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(connectionDB, user, pass);
//				System.out.println("connect successfully!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
//				System.out.println("connect failure!");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	@Override
	public List<ImportClaim> findAll() {
		// TODO Auto-generated method stub
		Connection connection = connection();
		Statement stmt = null;				
		ResultSet rs = null; 
		String sql;
		List<ImportClaim> listclaim = new ArrayList<ImportClaim>();
		try {
			stmt = connection.createStatement();
			
			sql = "select * from [US009].[dbo].[IMPORT_CLAIM]";
			connection.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ImportClaim importclaim = new ImportClaim();
				importclaim.setClaim_no(rs.getString("ClaimNo"));
				importclaim.setPolicy_no(rs.getString("PolicyNo"));
				importclaim.setDate_occurred(rs.getDate("DateOccurred"));
				importclaim.setPolicy_owner(rs.getString("PolicyOwner"));
				importclaim.setEngine_no(rs.getString("EngineNo"));
				importclaim.setChassis_no(rs.getString("ChassisNo"));
				importclaim.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				importclaim.setReserve_currency(rs.getString("ReserveCurrency"));
				importclaim.setReserve_amount(rs.getDouble("ReserveAmount"));
				listclaim.add(importclaim);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listclaim;
	}

	@Override
	public ImportClaim findByClaimNo(String id) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null;																//|
		ResultSet rs = null; 
		String sql;
		ImportClaim importclaim = new ImportClaim();	
		try {
			
			sql = "select * from [US009].[dbo].[IMPORT_CLAIM] where ClaimNo = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
							
				importclaim.setClaim_no(rs.getString("ClaimNo"));
				importclaim.setPolicy_no(rs.getString("PolicyNo"));
				importclaim.setDate_occurred(rs.getDate("DateOccurred"));
				importclaim.setPolicy_owner(rs.getString("PolicyOwner"));
				importclaim.setEngine_no(rs.getString("EngineNo"));
				importclaim.setChassis_no(rs.getString("ChassisNo"));
				importclaim.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				importclaim.setReserve_currency(rs.getString("ReserveCurrency"));
				importclaim.setReserve_amount(rs.getDouble("ReserveAmount"));
				
			}
			return importclaim;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<ImportClaim> findByPolicyNo(String id) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null;																//|
		ResultSet rs = null; 
		String sql;
		List<ImportClaim> policyList = new ArrayList<ImportClaim>();
		try {
			
			sql = "select * from [US009].[dbo].[IMPORT_CLAIM] where PolicyNo = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ImportClaim importclaim = new ImportClaim();
				
				importclaim.setClaim_no(rs.getString("ClaimNo"));
				importclaim.setPolicy_no(rs.getString("PolicyNo"));
				importclaim.setDate_occurred(rs.getDate("DateOccurred"));
				importclaim.setPolicy_owner(rs.getString("PolicyOwner"));
				importclaim.setEngine_no(rs.getString("EngineNo"));
				importclaim.setChassis_no(rs.getString("ChassisNo"));
				importclaim.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				importclaim.setReserve_currency(rs.getString("ReserveCurrency"));
				importclaim.setReserve_amount(rs.getDouble("ReserveAmount"));
				policyList.add(importclaim);
				
			}
			return policyList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<ImportClaim> findByPolicyOwner(String id) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null;																//|
		ResultSet rs = null; 
		String sql;
		List<ImportClaim> policyList = new ArrayList<ImportClaim>();
		try {
			
			sql = "select * from [US009].[dbo].[IMPORT_CLAIM] where PolicyOwner = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ImportClaim importclaim = new ImportClaim();
				
				importclaim.setClaim_no(rs.getString("ClaimNo"));
				importclaim.setPolicy_no(rs.getString("PolicyNo"));
				importclaim.setDate_occurred(rs.getDate("DateOccurred"));
				importclaim.setPolicy_owner(rs.getString("PolicyOwner"));
				importclaim.setEngine_no(rs.getString("EngineNo"));
				importclaim.setChassis_no(rs.getString("ChassisNo"));
				importclaim.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				importclaim.setReserve_currency(rs.getString("ReserveCurrency"));
				importclaim.setReserve_amount(rs.getDouble("ReserveAmount"));
				policyList.add(importclaim);
				
			}
			return policyList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ImportClaim findByAll(String claimno, String pilicyno, String policyowner) {
		Connection connection = connection();
		PreparedStatement stmt = null;																//|
		ResultSet rs = null; 
		String sql;
		ImportClaim importclaim = new ImportClaim();
		try {
			
			sql = "select * from [US009].[dbo].[IMPORT_CLAIM] where ClaimNo = ? and PolicyNo = ? and PolicyOwner = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, claimno);
			stmt.setString(2, pilicyno);
			stmt.setString(3, policyowner);
			rs = stmt.executeQuery(); 
			while (rs.next()) {
				importclaim.setClaim_no(rs.getString("ClaimNo"));
				importclaim.setPolicy_no(rs.getString("PolicyNo"));
				importclaim.setDate_occurred(rs.getDate("DateOccurred"));
				importclaim.setPolicy_owner(rs.getString("PolicyOwner"));
				importclaim.setEngine_no(rs.getString("EngineNo"));
				importclaim.setChassis_no(rs.getString("ChassisNo"));
				importclaim.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				importclaim.setReserve_currency(rs.getString("ReserveCurrency"));
				importclaim.setReserve_amount(rs.getDouble("ReserveAmount"));
				
			}
			return importclaim;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ImportClaim> readFileExcel(String excelFilePath){
		// TODO Auto-generated method stub
		 List<ImportClaim> listClaim = new ArrayList<ImportClaim>();
		 
			try {
				FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
				Workbook workbook = new XSSFWorkbook(excelFile);
				Sheet dataTypeSheet = workbook.getSheetAt(0);
				DataFormatter fmt = new DataFormatter();
				
				Iterator<Row> iterator = dataTypeSheet.iterator();
				Row firstRow = iterator.next();
				Cell firstCell = firstRow.getCell(0);
			    System.out.println(firstCell.getStringCellValue());
			   
			    while (iterator.hasNext()) {
			    	Row currentRow = iterator.next();
			    	if (currentRow.getRowNum() == 0) {
		                // Ignore header
		                continue;
		            }
			    	
			    	ImportClaim importclaim = new ImportClaim();
			    	if (null == currentRow.getCell(2) || currentRow.getCell(2).toString().isEmpty()) {
			    		logger.error("%n ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+currentRow.getCell(1)+", "+"DateOccurred: "+", " + "DateOccurred not NULL or isEmpty");
			    		continue;
					}
			    	   
			    	if (null == currentRow.getCell(0) 
			    			|| currentRow.getCell(0).toString().isEmpty()) {
						logger.error("ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+currentRow.getCell(1)+", "+"DateOccurred: "+currentRow.getCell(2)+", "+"ClaimNo not NULL or isEmpty" +", ");
						continue;
					}
			    	if (null == currentRow.getCell(1) 
			    			|| currentRow.getCell(1).toString().isEmpty() ) {
						logger.error("ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+", "+"DateOccurred: "+currentRow.getCell(2)+", "+"PolicyNo is not NULL or is isEmpty" + ", ");
						continue;
					}
			    	
			    	  
			    	long millis=System.currentTimeMillis();  
//			        java.sql.Date date=new java.sql.Date(millis);
//			        System.out.println("current: "+date);  
//			        System.out.println("++"+millis); 
			        
			    	java.sql.Date sqlDate = new java.sql.Date(currentRow.getCell(2).getDateCellValue().getTime());
			    
			    	long millisTimeImport = sqlDate.getTime();
			    
			    	
			    	if (millis < millisTimeImport) {
			    		logger.error("ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+", "+"DateOccurred: "+currentRow.getCell(2)+", "+"Date cannot be in the future" + ", ");
			    		continue;
					}
			    	
			    	String policyno = (String) fmt.formatCellValue(currentRow.getCell(1));
			    	MotorPolicy motorpolicy = findPolicyMotor(policyno);
			    	if (null != motorpolicy) {
			    		
						if (currentRow.getCell(8).getNumericCellValue() >= motorpolicy.getSum_insured()) {
							System.out.println("khong duoc");
							logger.error("ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+", "+"DateOccurred: "+currentRow.getCell(2)+", "+"Reverse Amount must be lower than Sum Insured or Reverse Amount greater 0 " + ", ");
							continue;
						}
					}
			    	
			    	if (currentRow.getCell(8).getNumericCellValue() < 0) {
			    		logger.error("ClaimNo: "+currentRow.getCell(0)+", "+"PolicyNo: "+", "+"DateOccurred: "+currentRow.getCell(2)+", "+"Reverse Amount greater 0 " + ", ");
			    		continue;
					}

			    	importclaim.setClaim_no((String) fmt.formatCellValue(currentRow.getCell(0)));
			    	importclaim.setPolicy_no((String) fmt.formatCellValue(currentRow.getCell(1)));
			    	
			    	importclaim.setDate_occurred(sqlDate);
			    	importclaim.setPolicy_owner((String) fmt.formatCellValue(currentRow.getCell(3)));
			    	importclaim.setEngine_no((String) fmt.formatCellValue(currentRow.getCell(4)));
			    	importclaim.setChassis_no((String) fmt.formatCellValue(currentRow.getCell(5)));
			    	importclaim.setVehicle_registration_no((String) fmt.formatCellValue(currentRow.getCell(6)));
			    	importclaim.setReserve_currency((String) fmt.formatCellValue(currentRow.getCell(7)));
			    	importclaim.setReserve_amount(currentRow.getCell(8).getNumericCellValue());

					listClaim.add(importclaim);
			    	if (null == findByClaimNo(importclaim.getClaim_no())) {
						saveClaim(importclaim);
					}else{
						updateClaim(importclaim);
					}
			    	
			    }
			    
			    workbook.close();
			    excelFile.close();
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
				logger.error("File Not Found");
				
			} catch(IOException e) {
				e.printStackTrace();
				
			}
			
		    return listClaim;     
			
	}

	@Override
	public void saveClaim(ImportClaim addClaim) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null;	
		String sql;
		System.out.println("==========="+addClaim.getClaim_no());
		try {
			sql = "INSERT INTO [US009].[dbo].[IMPORT_CLAIM] (ClaimNo, PolicyNo, DateOccurred, PolicyOwner, EngineNo, ChassisNo,VehicleRegisterNo, ReserveCurrency, ReserveAmount)"
					+ "VALUES (?,?,?,?,?,?,?,?,?)";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, addClaim.getClaim_no());
			stmt.setString(2, addClaim.getPolicy_no());
			stmt.setDate(3, (Date) addClaim.getDate_occurred());
			stmt.setString(4, addClaim.getPolicy_owner());
			stmt.setString(5, addClaim.getEngine_no());
			stmt.setString(6, addClaim.getChassis_no());
			stmt.setString(7, addClaim.getVehicle_registration_no());
			stmt.setString(8, addClaim.getReserve_currency());
			stmt.setDouble(9, addClaim.getReserve_amount());
			stmt.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateClaim(ImportClaim updateClaim) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null;	
		String sql;
		try {
			sql = " UPDATE [US009].[dbo].[IMPORT_CLAIM]"
					+ " SET PolicyNo = ?, DateOccurred = ?, PolicyOwner=?, EngineNo=?,ChassisNo=?, "
					+ "VehicleRegisterNo=?, ReserveCurrency=?, ReserveAmount=? WHERE ClaimNo = ?";
			stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, updateClaim.getPolicy_no());
			stmt.setDate(2, (Date) updateClaim.getDate_occurred());
			stmt.setString(3, updateClaim.getPolicy_owner());
			stmt.setString(4, updateClaim.getEngine_no());
			stmt.setString(5, updateClaim.getChassis_no());
			stmt.setString(6, updateClaim.getVehicle_registration_no());
			stmt.setString(7, updateClaim.getReserve_currency());
			stmt.setDouble(8, updateClaim.getReserve_amount());
			stmt.setString(9, updateClaim.getClaim_no());
			stmt.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MotorPolicy findPolicyMotor(String id) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement stmt = null; // |
		ResultSet rs = null;
		String sql;
		MotorPolicy motorpolicy = new MotorPolicy();
		try {

			sql = "select * from [US009].[dbo].[MOTOR_POLICY] where PolicyNo = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {

				motorpolicy.setPolicy_no(rs.getString("PolicyNo"));
				/*motorpolicy.setInception_date(rs.getDate("InceptionDate"));
				motorpolicy.setExpire_date(rs.getDate("ExpireDate"));
				motorpolicy.setPolicy_owner(rs.getString("PolicyOwner"));
				motorpolicy.setEngine_no(rs.getString("EngineNo"));
				motorpolicy.setChassis_no(rs.getString("ChassisNo"));
				motorpolicy.setVehicle_registration_no(rs.getString("VehicleRegisterNo"));
				motorpolicy.setBill_currency(rs.getString("BillCurrency"));*/
				motorpolicy.setSum_insured(rs.getDouble("SumInsured"));
//				motorpolicy.setRate(rs.getInt("Rate"));
				return motorpolicy;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			connection.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
