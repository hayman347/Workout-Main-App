/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ffole
 */
public class UserData {
    public static String getDOB (int userID){
        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT dob FROM users WHERE id = ?"
            );
            stmt.setInt(1, userID);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("dob");
            }
        } catch (Exception e) {
            
        }
        return "2000-01-01";
    }
    public static String getGender(int userID){
        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT gender FROM users WHERE id = ?"
            );
            stmt.setInt(1, userID);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("gender");
            }
        } catch (Exception e) {
            
        }
        return "Unknown";
    }
    public static double getHeight(int userID){
        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT height FROM users WHERE id = ?"
            );
            stmt.setInt(1, userID);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("height");
            }
        } catch (Exception e) {
            
        }
        return 135;
    } 
    public static double getWeight(int userID) {
        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT weight FROM users WHERE id = ?"
            );
            stmt.setInt(1, userID);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("weight");
            }
        } catch (Exception e) {
            
        }
        return 135;
    }
    public static String getWorkoutHistory(int userID) {
        StringBuilder history = new StringBuilder();

        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT exercise, sets, weight, reps, fatigue, date FROM workouts WHERE user_id = ?"
            );
            stmt.setInt(1, userID);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                history.append(String.format(
                    "(%s, %d, %.0f, %d, %d, %s)\n",
                    rs.getString("exercise"),
                    rs.getInt("sets"),
                    rs.getDouble("weight"),
                    rs.getInt("reps"),
                    rs.getInt("fatigue"),
                    rs.getString("date")
                ));
            }

        } catch (Exception e) {
            
        }

        return history.toString();
    }
}
