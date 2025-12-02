package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        if(bpms.isEmpty() || bpms == null){
            return "bpm not accepted";
        }
        //calculating sum
        int sum = 0;
        for(Integer num: bpms){
            sum += num;
        }
        double avg = sum/bpms.size();

        if(avg >= 140){
            return "HIGH";
        }
        else if(avg >= 100 && avg <= 139){
            return "MEDIUM";
        }
        else if(avg < 100){
            return "LOW";
        }
        return "bpm not processable";
    }

    public static boolean isValidTrackTitle(String title) {
        if(title == null || title.length() < 1 || title.length() >30){ //reject null or alphabetic characters + spaces out of 1–30 chars bounds
            return false;
        }
        for(int i = 0; i<title.length(); i++){
            if(!Character.isLetterOrDigit(title.charAt(i)) && !Character.isWhitespace(title.charAt(i))) { //rejecting special characters
                return false;
            }
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        //Clamp volume into range 0–100 (e.g., 120 -> 100, -10 -> 0)
        if(volumeDb > 100){
            return 100;
        }
        else if(volumeDb < 0){
            return 0;
        }
        return volumeDb;
    }
}
