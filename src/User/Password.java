package User;

import java.util.Objects;

public class Password
    {
        private String pass;

        @Override
        public boolean equals(Object obj)
            {
                boolean result;

                if(obj instanceof Password && obj != null)
                    {
                        Password givenPass = (Password) obj;
                        result = (givenPass.getPass().equals(pass));
                    }
                else
                    result= false;

                return result;
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(pass);
            }


        public Password (String inputPass)
            {
                pass = inputPass;
            }

        private String getPass()
            {
                return pass;
            }
    }
