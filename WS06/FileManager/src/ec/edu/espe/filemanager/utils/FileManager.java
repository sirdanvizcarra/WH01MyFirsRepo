/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.utils;

/**
 *
 * @author Daniel Vizcarra ESPE - DCCO
 */
public class FileManager {
    
    //read, edit, delete, search (find), save
    //CRUD operations: Create, Read, Update, Delete information (data) from a DB
    
    public void save(String fileName, String data){
        //TODO saving data inthe file FileName
        
        System.out.println("Saving --> " + data + "<-- in file -->" + fileName);
     
    }
    
    public static String find(String fileName, String dataToFind){
        //TODO finding dataToFind in the file filename
        
        String results;
        
        results = "Edison Lascano,14,12,15";
        
        System.out.println("returning --> " + results);
        
        return results;
        
    }
    
    public static String findAll(String fileName){
        //TODO finding dataToFind in the file filename
        
        String results;
        
        results = "Edison Lascano,14,12,15\nJorge Salazar,19,19,20";
        
        System.out.println("returning --> " + results);
        
        return results;
        
    }
    
    public static boolean update(String fileName, String dataToFind, String dataToUpdate){
        //TODO update information
        
        boolean updated;
        
        updated =true;
        
        System.out.println("updating" + dataToFind + " in " + fileName);
        
        return updated;
       
    }
    
    public static boolean delete(String fileName, String dataToDelete){
        //TODO update information
        
        boolean deleted;
        
        deleted =true;
        
        System.out.println("deleting " + dataToDelete + " from " + fileName);
        
        return deleted;
       
    }
    
    // .jar --> Java Archive
    // .war --> Web Application
    // .ear --> Enterprise Archive
    
}

    