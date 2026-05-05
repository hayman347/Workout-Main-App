package ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class AIClient {

    private static final String API_KEY = "fghgf";

   
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