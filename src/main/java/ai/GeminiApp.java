/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

/**
 *
 * @author haydnmaneval
 */
public class GeminiApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // The client gets the API key from the environment variable `GEMINI_API_KEY`.
//        Client client = new Client();
Client client = Client.builder()
    .apiKey("AIzaSyCR7pPa84H6NON8BfPzCf1_2aYUbSnVZjk")
    .build();
        GenerateContentResponse response =
        client.models.generateContent(
            "gemini-3-flash-preview",
            "Explain how AI works in a few words",
            null);

    System.out.println(response.text());
    }
}
