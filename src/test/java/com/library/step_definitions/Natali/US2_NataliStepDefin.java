package com.library.step_definitions.Natali;

import com.library.pages.LoginPage;
import com.library.utility.ConfigurationReader;
import com.library.utility.DB_Util;
import com.library.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class US2_NataliStepDefin extends tearDown {

    @Given("I am in the homepage of the library app")
    public void i_am_in_the_homepage_of_the_library_app() {
        DB_Util.createConnection("jdbc:mysql://34.230.35.214:3306/library2",
                "library2_client", "6s2LQQTjBcGFfDhY");
    }

    @When("I take borrowed books number")
    public void i_take_borrowed_books_number() {

        DB_Util.runQuery("SELECT COUNT(*) AS BOOK_COUNT FROM book_borrow");
    }

    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {
        int actualBookCount = 26;
        int expectedResult = Integer.parseInt(DB_Util.getFirstRowFirstColumn());
        assertEquals(actualBookCount, expectedResult);
    }

}
