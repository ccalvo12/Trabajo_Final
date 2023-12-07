package org.vista;

public class usuariosLogin {
    private usuariosLogin(String nomUser, String userId, String password) {
        this.nomUser = nomUser;
        this.userId = userId;
        this.password = password;
    }

    usuariosLogin(String nomUser) {
        this.nomUser = nomUser;
    }
    public static usuariosLogin getsingletonInstance(String nomUser, String userId, String password){
        if(login==null){
            login=new usuariosLogin(nomUser,userId,password);
        }else{

        }
        return login;
    }
    public static usuariosLogin getsingletonInstance(String nomUser){
        if(login==null){
            login=new usuariosLogin(nomUser);
        }else{

        }
        return login;
    }


    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String nomUser;
    private String userId;
    private String password;

    private static usuariosLogin login;

}
