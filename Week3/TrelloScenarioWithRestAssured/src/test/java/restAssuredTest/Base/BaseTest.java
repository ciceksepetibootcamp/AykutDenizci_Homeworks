package restAssuredTest.Base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import restAssuredTest.Constants.Constants;

import java.util.HashMap;
import static io.restassured.RestAssured.given;


public class BaseTest {

    protected String boardId;
    public static HashMap map = new HashMap<>();

    @BeforeSuite
    public void setup() {

        map.put("key", YOURKEY);
        map.put("token", YOURTOKEN);


        RestAssured.baseURI = "https://api.trello.com/1";
    }

    @BeforeClass
    public void createBoard() {

        Response response =
                given().header("Accept-Encoding", "gzip,deflate")
                        .contentType("application/json")
                        .queryParam("name", "AykutDenizci")
                        .body(map)
                        .log().all().
                        when()
                        .post("/boards");

        response.then()
                .statusCode(200)
                .extract().body().jsonPath().get("name").equals("AykutDenizci");

        boardId = (String) response.then()
                .extract().jsonPath().getMap("$").get("id");
        System.out.println(boardId);
    }

    @AfterClass
    public void tearDown() {

        given()
                .body(map)
                .pathParam("id", boardId)
                .contentType(ContentType.JSON).log().all().

                when()
                .delete(Constants.deleteBoard).

                then()
                .statusCode(200)
                .contentType(ContentType.JSON);

    }

}