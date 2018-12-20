package excelfileoperation;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Raju
 */
public class Client {

    private String name = "";
    private String phone = "";
//    private String nameAndAge = "";
    private List<String> messageList = new LinkedList<String>();
//    private String profileText = "";
    private List<String> descList = new LinkedList<String>();
    
    private String message="";
    private String description="";

    public Client() {
    }

//    public String getNameAndAge() {
//        return nameAndAge;
//    }
//
//    public void setNameAndAge(String nameAndAge) {
//        this.nameAndAge = nameAndAge;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
    
    
    public List<String> getDescList() {
        return descList;
    }

    public void setDescList(List<String> descList) {
        this.descList = descList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

//    public String getProfileText() {
//        return profileText;
//    }
//
//    public void setProfileText(String profileText) {
//        this.profileText = profileText;
//    }

}
