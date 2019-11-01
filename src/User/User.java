package User;

public class User
    {
        private int age;
        private double weight;
        private double lenght;
        private String gender;
        private String name;
        private String userName;
        private Password myPassword;


        public User (int myAge, double myWeight, double myLenght, String myGender, String myName, String myUserName, Password myUserPassword)
            {
                this.age=myAge;
                this.weight=myWeight;
                this.lenght=myLenght;
                this.gender=myGender;
                this.name=myName;
                this.userName=myUserName;
                this.myPassword=myUserPassword;
            }


        public String getGender()
            {
                return gender;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int newAge) { age = newAge; }

        public double getWeight()
            {
                return weight;
            }

        public void setWeight(double newWeight) { weight = newWeight; }

        public String getName()
            {
                return name;
            }

        public String getUserName()
            {
                return userName;
            }

        public double getLenght()
            {
                return lenght;
            }

        public void setLenght(double newLenght) { lenght = newLenght; }

        public boolean checkPass(Password aPassword)
            {
                boolean isValid = false;
                if (myPassword.equals(aPassword))
                    {
                        isValid = true;
                    }
                return isValid;
            }
    }
