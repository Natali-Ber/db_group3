package com.library.step_definitions.Natali;

import com.library.utility.DB_Util;
import org.testng.annotations.AfterClass;

public class tearDown {


    @AfterClass
   public void teardown() {
      DB_Util.destroy();
    }

}
