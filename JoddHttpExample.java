import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class JoddHttpExample {
    public static void main(String[] args) {
        // Sending a GET request to a sample API
        HttpRequest request = HttpRequest.get("https://jsonplaceholder.typicode.com/posts/1");
        HttpResponse response = request.send();

        // Printing the response status and body
        System.out.println("Response Status: " + response.statusCode());
        System.out.println("Response Body: " + response.bodyText());
    }
}
