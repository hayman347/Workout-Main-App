package ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class AIClient {

    private static final String API_KEY = "AIzaSyCR7pPa84H6NON8BfPzCf1_2aYUbSnVZjk";

   
    public static String sendPrompt(String prompt) throws Exception {
Client client = Client.builder()
    .apiKey(API_KEY)
    .build();
        GenerateContentResponse response =
        client.models.generateContent(
            "gemini-3-flash-preview",
            prompt,
            null);

       return response.text();
    }
}