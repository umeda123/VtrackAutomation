package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DriverAccessVehicle_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user should be able to login")
    public void user_should_be_able_to_login() {
        loginPage.loginAsDriver();
    }

//    @Given("truck driver see all Vehicle information.")
//    public void truck_driver_see_all_vehicle_information() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("truck driver can  see general information by clicking any car")
//    public void truck_driver_can_see_general_information_by_clicking_any_car() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("truck driver can  add Event")
//    public void truck_driver_can_add_event() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Truck driver can  reset the setting")
//    public void truck_driver_can_reset_the_setting() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
