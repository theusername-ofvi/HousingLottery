
public class Student {
    /*
    private final String password;
    private final String firstName;
    private final String lastName;
    private final int grade;
    private boolean isStaying;
    private final int sex;
    private String preferences;
    String currentDorm;
    // profile that we need to account for... open to any recommendations

*/

    private String email;
    private int cleanliness, quietness, stayUp, getUp, guestover, sportsOrArtsy;
    private boolean isChosen, isInternational;
    Student () {
        isChosen = false;

    }

        // for new student


        public void setEmail(String email){
            this.email = email;
        }
        public void setRoomPreference(int cleanliness,int quietness, int guestover){
            this.cleanliness = cleanliness;
            this.quietness = quietness;
            this.guestover = guestover;
        }
        public void setSleepinghabit(int stayUp,int getUp){
            this.stayUp = stayUp;
            this.getUp = getUp;
        }
        public void setPaired(){isChosen = true;}
        public boolean getPairedStatus(){return isChosen;}
        public void setSportsOrArtsy(int sportsOrArtsy){
            this.sportsOrArtsy = sportsOrArtsy;
        }

        public boolean getInternationalStatus(){
            return isInternational;
        }


        public String getEmail() {return email;}
        public int getClean() {return cleanliness;}
        public int getQuiet() {return quietness;}
        public int getGuest() {return guestover;}
        public int getStayUp() {return stayUp;}
        public int getGetUp(){return getUp;}
        public int getSportsOrArtsy(){return sportsOrArtsy;}
}