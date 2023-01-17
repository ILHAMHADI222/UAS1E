public class Messages {
    private  String UserID;
    private  String UserName;
    private  String WhatYoupots;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYoupots() {
        return WhatYoupots;
    }

    public void setWhatYoupots(String whatYoupots) {
        WhatYoupots = whatYoupots;
    }
    public Messages() {

    }

    public Messages(String userID, String userName, String whatYoupots) {
        UserID = userID;
        UserName = userName;
        WhatYoupots = whatYoupots;
    }
}
