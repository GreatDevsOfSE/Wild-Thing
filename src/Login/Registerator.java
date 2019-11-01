package Login;

import User.*;

public class Registerator
    {
        private Password userPass;

        public void createPass (String givenPass)
            {
              userPass = new Password(givenPass);
            }

        public User createUser(int age, double weight, double lenght, String gender, String name, String userName)
            {
                return new User(age, weight, lenght, gender, name, userName, userPass);

            }
    }
