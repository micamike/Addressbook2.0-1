package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import com.telran.repeat.provider.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test(dataProvider = "validGroups", dataProviderClass = StaticProvider.class  )
  public void testGroupCreation(Group group){

  app.getNavigationHelper().openGroupsPage();

  int before = app.getGroupHelper().getGroupsCount();

  app.getGroupHelper().initGroupCreation();

  app.getGroupHelper().fillGroupForm(group);
  app.getGroupHelper().confirmGroupCreation();
  app.getGroupHelper().returnToGroupsPage();
  int after = app.getGroupHelper().getGroupsCount();

  System.out.println("count before is: " + before + " and count after is: " + after);
  Assert.assertEquals(after, before+1);

}
}
