package Login;

import User.*;

public class PassValidator
    {
        public boolean valPassword(String password)
            {
                boolean isPassValid = false;

                if(password.length() > 7)
                    {
                        if(checkPass(password))
                            {
                                isPassValid=true;
                            }
                    }
                return isPassValid;
            }
        private boolean checkPass(String password)
            {
                boolean hasNum = false;
                boolean hasCap = false;
                boolean hasLow= false;
                char c;

                for (int i = 0; i < password.length(); i++)
                    {
                        c = password.charAt(i);
                        if (Character.isDigit(c))
                            {
                                hasNum = true;
                            } else if (Character.isUpperCase(c))
                            {
                                hasCap = true;
                            } else if (Character.isLowerCase(c))
                            {
                                hasLow = true;
                            }
                    }

                        if(hasNum && hasCap && hasLow)
                            {
                                return true;
                            }
                        else
                            {
                                return false;
                            }

            }
    }
