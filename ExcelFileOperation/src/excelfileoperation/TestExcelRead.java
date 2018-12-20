/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelfileoperation;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.ss.util.NumberToTextConverter;

public class TestExcelRead {

    private static final String FILE_NAME = "C:\\Users\\MAC_03\\Documents\\NetBeansProjects\\sample.xlsx";

    public static void main(String[] args) {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            List<String> listOfColumnHeader = new LinkedList<String>();
            List<Client> listOfClient = new LinkedList<Client>();

            int numberOfSheets = workbook.getNumberOfSheets();

            for (int i = 0; i < numberOfSheets; i++) {
                Sheet datatypeSheet = workbook.getSheetAt(i);
                Iterator<Row> iterator = datatypeSheet.iterator();
                int p = 0;
                while (iterator.hasNext()) {

                    Row currentRow = iterator.next();
                    Iterator<Cell> cellIterator = currentRow.iterator();

                    int col = 0;
                    Client client = new Client();
                    while (cellIterator.hasNext()) {
                        Cell currentCell = cellIterator.next();
                        if (p != 0) {
                            if (col == 0) {
                                client.setName(currentCell.getStringCellValue());
                            } else if (col == 2) {
                                client.setMessage(currentCell.getStringCellValue());
                            } else if (col == 3) {
                                client.setDescription(currentCell.getStringCellValue());
                            } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                                if (col == 1) {
                                    String str = NumberToTextConverter.toText(currentCell.getNumericCellValue());
                                    client.setPhone(str);
                                }

                            }
                        }

                        col++;
                    }
                    p = 1;
                    listOfClient.add(client);
                    

                }
            }

            System.out.println("Yes,output is print");
            for (int i = 0; i < listOfClient.size(); i++) {
                System.out.print(listOfClient.get(i).getName() + " ");
                System.out.print(listOfClient.get(i).getPhone() + " ");
                System.out.print(listOfClient.get(i).getMessage() + " ");
                System.out.println(listOfClient.get(i).getDescription());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("client list print");

    }
}
