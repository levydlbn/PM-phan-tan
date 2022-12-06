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
import view.LoginFrm;
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
        FINDROOM,
        CREATEROOMPASSWORD,
        ROOMNAMERM,
        ROOMLIST,
    }
    
    public static User user;
     
    public static LoginFrm loginFrm;
    public static RegisterFrm registerFrm;
    public static HomePageFrm homePageFrm;
    public static RoomListFrm roomListFrm;
    public static FindRoomFrm findRoomFrm;
    public static RoomNameFrm roomNameFrm;
    public static CreateRoomPasswordFrm createRoomPasswordFrm;
    
    public void initView(){
        loginFrm = new LoginFrm();
        loginFrm.setVisible(true);
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
    
    public static void main(String[] args) {
       new CodeClient().initView();
    }
}
