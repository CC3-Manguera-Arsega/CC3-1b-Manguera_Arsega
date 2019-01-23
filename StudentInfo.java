/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacc;

/**
 *
 * @author m304user
 */
public class StudentInfo {  
    //fields
    private String idnumber;

    
    private String familyName;
    private String firstname;
    private String academicprogram;
    private String track;
    String University;
    String College;
    String term;
    
    //create constructor
    public StudentInfo(String college, String term){
        this.University = "University of the Cordilleras";
        this.College = college;
        this.term = term;
        this.idnumber = getidnumber();
        this.familyName = getfamilyName();
        this.firstname = getfirstname();
        this.academicprogram = getacademicprogram();
        this.track = gettrack();
    }
    
    public String getidnumber()
    {
        return idnumber;
    }
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
    public String getfamilyName()
    {
        return familyName;
    }
    public void setfamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getfirstname()
    {
        return firstname;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getacademicprogram()
    {
        return academicprogram;
    }
    public void setacademicprogram(String academicprogram) {
        this.academicprogram = academicprogram;
    }
    public String gettrack()
    {
        return track;
    }
    public void settrack(String track) {
        this.track = track;
    }
    public void print(){
        System.out.println(University);
        System.out.println(College);
        System.out.println(term);
        System.out.println(idnumber);
        System.out.print(familyName);
        System.out.println(firstname);
        System.out.print(academicprogram);
        System.out.println(track);
    }    
    
    }
    
    
    

