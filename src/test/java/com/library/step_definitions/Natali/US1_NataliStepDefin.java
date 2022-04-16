package com.library.step_definitions.Natali;

import com.library.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class US1_NataliStepDefin {

    @Given("Establish the database connection")
    public void Establish_the_database_connection() {
        String MyUrl = "jdbc:mysql://34.230.35.214:3306/library2";
        String username = "library2_client ";
        String password = "6s2LQQTjBcGFfDhY";
        DB_Util.createConnection(MyUrl, username, password);
    }

    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {

        DB_Util.runQuery("SELECT id FROM users");

    }

    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {

       // int actualResult = 141;
     //   int expectedResult = 141;
      //  assertEquals(actualResult, expectedResult);

    }

    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
        DB_Util.runQuery("SELECT * FROM users");
    }

    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(List<String> dataTable) {
      //  List<String> expectedResult = DB_Util.getAllColumnNamesAsList();
       // assertEquals(dataTable, expectedResult);
    }

}
