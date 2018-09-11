package com.circleci.demojavaspring;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
@TestPropertySource("/test.properties")
public class DemoJavaSpringApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void HistoryFrameworkService_CreateHistoryForbiddenValuesEmailDeleteress() {
		assertEquals(2,1);
	}
	
	@Test 
	public void HistoryFrameworkInterface_SetCountrytoEmptyString() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(2));
	}
	
	@Test 
	public void MobileHub_VerifyRenameTicketFromContextMenu() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	
	@Test 
	public void HooksProviderQueryOnDemandInvalidPublisherId() {
		Random rand = new Random();
		assertEquals(1,rand.nextInt(1));
	}
	
	@Test 
	public void ServiceHub_DeleteHistoryComments() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	
	@Test 
	public void ServiceHub_DeleteHistoryCommentsLong() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	
	@Test 
	public void ServiceHub_VerifyInlineEditParameterValuesInConflictingEdits() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}

	@Test 
	public void MobileHub_VerifyRunCompletedTicketFromContextMenu() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	
	@Test 
	public void MobileHub_VerifyRunCompletedTicketFromContextMenuMouseHover() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	
	@Test 
	public void MobileHub_VerifyDeleteTicketFromContextMenu() {
		Random rand = new Random();
		assertEquals(2,rand.nextInt(3));
	}
	

}
