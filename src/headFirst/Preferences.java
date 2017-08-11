package headFirst;

public class Preferences {

    private static Preferences instance = null;
    public static Preferences globalPreferences = new Preferences("First one created");
    private String preference;

    public Preferences(String preference){
        this.preference = preference;
    }

    public String getPreferenceDetails(){
        return preference;
    }
}
