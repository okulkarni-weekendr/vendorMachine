package headFirst;

public class ClientCard {
    public static void main(String[] args){
        System.out.println(Preferences.globalPreferences.getPreferenceDetails());

        Preferences secondPreference = new Preferences("Second Preference");
        Preferences.globalPreferences = secondPreference;

        System.out.println(Preferences.globalPreferences.getPreferenceDetails());
    }
}
