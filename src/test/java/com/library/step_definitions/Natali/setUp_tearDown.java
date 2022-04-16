package com.library.step_definitions.Natali;

import com.library.utility.DB_Util;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.*;

public class setUp_tearDown {
    @BeforeClass
    public void setup() throws SQLException {
        String MyUrl  = "jdbc:mysql://34.230.35.214:3306/library2" ;
        String username = "library2_client " ;
        String password = "6s2LQQTjBcGFfDhY" ;
        DB_Util.createConnection(MyUrl, username, password);

    }
    @AfterClass
    public void teardown() {
        DB_Util.destroy();
    }

}
