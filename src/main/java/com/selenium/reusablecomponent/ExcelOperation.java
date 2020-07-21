/**
 * 
 */
package com.selenium.reusablecomponent;

import java.io.File;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author gslab
 *
 */
public class ExcelOperation {
	
	String filepath;
	
	public ExcelOperation() throws Exception {
		filepath=System.getProperty("user.dir")+PropertyOperations.getProperty("testdatalocation");
	}
	
	

	public HashMap<String, String> getTestDataInMap(int rownum) throws Exception {
		//location of excel file
		//open file
		File td_file=new File(filepath);
		Workbook wb=WorkbookFactory.create(td_file);
		Sheet sh=wb.getSheet("InsurancePremium");
		sh.getRow(0).getCell(1).toString();
		
		//read data row by row and put in map
		HashMap<String, String> hm=new HashMap<String, String>();
		for(int i=0;i<sh.getRow(0).getLastCellNum();i++) {
			sh.getRow(rownum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rownum).getCell(i).toString());
		}
		return hm;
	}
}
