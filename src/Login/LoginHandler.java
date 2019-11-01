package Login;

import User.*;

public class LoginHandler
    {
        User myUser;

        public boolean checkLogin(String aUser, Password aPass)
            {

               return myUser.checkPass(aPass);
            }
    }
