
import java.util.ArrayList;

public class method {
 private  String UserID;
 private  String Usename;
 private ArrayList<String>MY_MASSAGES;

 public String getUserID() {
  return UserID;
 }

 public void setUserID(String userID) {
  UserID = userID;
 }

 public String getUsename() {
  return Usename;
 }

 public void setUsename(String usename) {
  Usename = usename;
 }

 public ArrayList<String> getMY_MASSAGES() {
  return MY_MASSAGES;
 }

 public void setMY_MASSAGES(ArrayList<String> MY_MASSAGES) {
  this.MY_MASSAGES = MY_MASSAGES;
 }
 public method() {

 }

 public method(String userID, String usename, ArrayList<String> MY_MASSAGES) {
  UserID = userID;
  Usename = usename;
  this.MY_MASSAGES = MY_MASSAGES;
 }
}