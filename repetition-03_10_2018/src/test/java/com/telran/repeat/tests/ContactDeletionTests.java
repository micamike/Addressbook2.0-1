package com.telran.repeat.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactDeletionTests extends  TestBase {
  @BeforeMethod
  public void ensurePreconditions(){

    app.getNavigationHelper().openHomePage();

    if(!app.getContactHelper().isContactPresent()){
        app.getContactHelper().createContact();
    }
  }


  @Test
  public void testFirstContactDeletion(){

    int before = app.getContactHelper().getContactCount();

    app.getContactHelper().selectContactByIndex(0);
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmAlert();

    int after = app.getContactHelper().getContactCount();


  }

  @Test
  public void testLastContactDeletion(){

    int before = app.getContactHelper().getContactCount();

    app.getContactHelper().selectContactByIndex(before-1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmAlert();

    int after = app.getContactHelper().getContactCount();


  }

}
