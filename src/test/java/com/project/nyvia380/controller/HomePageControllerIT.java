package com.project.nyvia380.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomePageControllerIT {


    @Test
    void indexTest() {
        HomePageController homePageController = new HomePageController();
        String response = homePageController.index();
        assertEquals("Welcome to Nyvia380 Project Page!", response);
    }




}