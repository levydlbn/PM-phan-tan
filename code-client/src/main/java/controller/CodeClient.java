/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package controller;

/**
 *
 * @author 84965
 */
<<<<<<< HEAD

import javax.swing.JFrame;


public class CodeClient {
=======
import javax.swing.JFrame;
import model.user;
import view.CompetitorInfoFrm;
import view.CreateRoomPasswordFrm;
import view.LoginFrm;
import view.GameClientFrm;
import view.GameNoticeFrm;
import view.HomePageFrm;
import view.RankFrm;
import view.RegisterFrm;
import view.RoomListFrm;
import view.RoomNameFrm;
import view.CreateRoomPasswordFrm;
import view.FindRoomFrm;
>>>>>>> 46f3e3558b00d5d385a167023e6879a90991ddd5


public class CodeClient {
    public enum View {
        LOGIN,
        REGISTER,
        HOMEPAGE,
        FINDROOM,
        GAMECLIENT,
        CREATEROOMPASSWORD,
        ROOMNAMERM,
        JOINROOMPASSWORD,
        COMPETITORINFO,
        RANK,
        GAMENOTICE,
        ROOMLIST,
    }
    
    public static User user;
     
    public static LoginFrm loginFrm;
    public static RegisterFrm registerFrm;
    public static HomePageFrm homePageFrm;
    public static RoomListFrm roomListFrm;
    public static FindRoomFrm findRoomFrm;
    public static WaitingRoomFrm waitingRoomFrm;
    public static GameClientFrm gameClientFrm;
    public static JoinRoomPasswordFrm joinRoomPasswordFrm;
    public static CompetitorInfoFrm competitorInfoFrm;
    public static RankFrm rankFrm;
    public static GameNoticeFrm gameNoticeFrm;
    public static RoomNameFrm roomNameFrm;
    public static CreateRoomPasswordFrm createRoomPasswordFrm;
     //Thiết lập socket
    public static SocketHandle socketHandle;
    
    public Client() {
    }
    
    public static JFrame getVisibleJFrame(){
        if(roomListFrm!=null&&roomListFrm.isVisible())
            return roomListFrm;
        if(friendListFrm!=null&&friendListFrm.isVisible()){
            return friendListFrm;
        }
        if(createRoomPasswordFrm!=null&&createRoomPasswordFrm.isVisible()){
            return createRoomPasswordFrm;
        }
        if(joinRoomPasswordFrm!=null&&joinRoomPasswordFrm.isVisible()){
            return joinRoomPasswordFrm;
        }
        if(rankFrm!=null&&rankFrm.isVisible()){
            return rankFrm;
        }
        return homePageFrm;
    }
    
    public void initView(){
        loginFrm = new LoginFrm();
        loginFrm.setVisible(true);
        socketHandle = new SocketHandle();
        socketHandle.run();
    }
    
        public static void openView(View viewName){
        if(viewName != null){
            switch(viewName){
                case LOGIN:
                    loginFrm = new LoginFrm();
                    loginFrm.setVisible(true);
                    break;
                case REGISTER:
                    registerFrm = new RegisterFrm();
                    registerFrm.setVisible(true);
                    break;
                case HOMEPAGE:
                    homePageFrm = new HomePageFrm();
                    homePageFrm.setVisible(true);
                    break;
                case ROOMLIST:
                    roomListFrm = new RoomListFrm();
                    roomListFrm.setVisible(true);
                    break;
               
                case FINDROOM:
                    findRoomFrm = new FindRoomFrm();
                    findRoomFrm.setVisible(true);
                    break;
                
                case CREATEROOMPASSWORD:
                    createRoomPasswordFrm = new CreateRoomPasswordFrm();
                    createRoomPasswordFrm.setVisible(true);
                    break;
              
                case ROOMNAMEFRM:
                    roomNameFrm = new RoomNameFrm();
                    roomNameFrm.setVisible(true);
                    
                    case FRIENDLIST:
                    friendListFrm = new FriendListFrm();
                    friendListFrm.setVisible(true);
                    break;
                case FINDROOM:
                    findRoomFrm = new FindRoomFrm();
                    findRoomFrm.setVisible(true);
                    break;
                case WAITINGROOM:
                    waitingRoomFrm = new WaitingRoomFrm();
                    waitingRoomFrm.setVisible(true);
                    break;
                
                case CREATEROOMPASSWORD:
                    createRoomPasswordFrm = new CreateRoomPasswordFrm();
                    createRoomPasswordFrm.setVisible(true);
                    break;
                case RANK:
                    rankFrm = new RankFrm();
                    rankFrm.setVisible(true);
                    break;
             
                case ROOMNAMEFRM:
                    roomNameFrm = new RoomNameFrm();
                    roomNameFrm.setVisible(true);
            }
        }
    }
    
       public static void closeView(View viewName){
        if(viewName != null){
            switch(viewName){
                case LOGIN:
                    loginFrm.dispose();
                    break;
                case REGISTER:
                    registerFrm.dispose();
                    break;
                case HOMEPAGE:
                    homePageFrm.dispose();
                    break;
                case ROOMLIST:
                    roomListFrm.dispose();
                    break;
                case FINDROOM:
                    findRoomFrm.stopAllThread();
                    findRoomFrm.dispose();
                    break;
                case CREATEROOMPASSWORD:
                    createRoomPasswordFrm.dispose();
                    break;
                case JOINROOMPASSWORD:
                    joinRoomPasswordFrm.dispose();
                    break;
                case ROOMNAMEFRM:
                    roomNameFrm.dispose();
                    break;
            }
            
        }
    }
    
     public static void openView(View viewName, int arg1, String arg2){
        if(viewName != null){
            switch(viewName){
                case JOINROOMPASSWORD:
                    joinRoomPasswordFrm = new JoinRoomPasswordFrm(arg1, arg2);
                    joinRoomPasswordFrm.setVisible(true);
                    break;
                case FRIENDREQUEST:
                    friendRequestFrm = new FriendRequestFrm(arg1, arg2);
                    friendRequestFrm.setVisible(true);
            }
        }
    }
    public static void openView(View viewName, User competitor, int room_ID, int isStart, String competitorIP){
        if(viewName != null){
            switch(viewName){
                case GAMECLIENT:
                    gameClientFrm = new GameClientFrm(competitor, room_ID, isStart, competitorIP);
                    gameClientFrm.setVisible(true);
                    break;
            }
        }
    }
    public static void openView(View viewName, User user){
        if(viewName != null){
            switch(viewName){
                case COMPETITORINFO:
                    competitorInfoFrm = new CompetitorInfoFrm(user);
                    competitorInfoFrm.setVisible(true);
                    break;
            }
        }
    }
    public static void openView(View viewName, String arg1, String arg2){
        if(viewName != null){
            switch(viewName){
                case GAMENOTICE:
                    gameNoticeFrm = new GameNoticeFrm(arg1, arg2);
                    gameNoticeFrm.setVisible(true);
                    break;
                case LOGIN:
                    loginFrm = new LoginFrm(arg1, arg2);
                    loginFrm.setVisible(true);
            }
        }
    }
    
    public static void closeAllViews(){
        if(loginFrm!=null) loginFrm.dispose();
        if(registerFrm!=null) registerFrm.dispose();
        if(homePageFrm!=null) homePageFrm.dispose();
        if(roomListFrm!=null) roomListFrm.dispose();
        if(friendListFrm!=null){
            friendListFrm.stopAllThread();
            friendListFrm.dispose();
        } 
        if(findRoomFrm!=null){
            findRoomFrm.stopAllThread();
            findRoomFrm.dispose();
        } 
        if(waitingRoomFrm!=null) waitingRoomFrm.dispose();
        if(gameClientFrm!=null){
            gameClientFrm.stopAllThread();
            gameClientFrm.dispose();
        } 
        if(createRoomPasswordFrm!=null) createRoomPasswordFrm.dispose();
        if(joinRoomPasswordFrm!=null) joinRoomPasswordFrm.dispose();
        if(competitorInfoFrm!=null) competitorInfoFrm.dispose();
        if(rankFrm!=null) rankFrm.dispose();
        if(gameNoticeFrm!=null) gameNoticeFrm.dispose();
        if(friendRequestFrm!=null) friendRequestFrm.dispose();
        if(roomNameFrm!=null) roomNameFrm.dispose();
    }
    
    public static void main(String[] args) {
       new CodeClient().initView();
    }
}
