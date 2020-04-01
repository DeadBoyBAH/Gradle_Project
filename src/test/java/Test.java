import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void test_Unirest(){
        // создание юзера с именем Владимир Ленин, полом мужской и почтой ussrisbeautiful@gmail.com
        try {
            HttpResponse<JsonNode> response = Unirest.post("https://gorest.co.in/public-api/users")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer Szq0s9Q47DIZ4FtiZaOi2HUAD-oxw-HV-ofY")
                    .body("{\"first_name\":\"Vladimir\", \"email\":\"ussrisbeautiful@gmail.com\", \"last_name\":\"Lenin\", \"gender\":\"male\"}")
                    .asJson();
            Assertions.assertEquals(302, response.getCode());
            System.out.println(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }

    }

}
