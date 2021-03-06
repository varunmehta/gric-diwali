package org.glenrockindiancommunity.integrate;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class EventRegistrationTest {

  @Autowired
  private EventRegistration doEverything;

  // @Test
  public void testCalculateTotalChargeOffLoadTxFee() {
    Integer eventId = 5;
    int adultCount = 2;
    int childCount = 1;

    BigDecimal expectedTotalCharge = new BigDecimal("103.30");

    BigDecimal totalCharge = doEverything.calculateTotalCharge(eventId, adultCount, childCount);

//    GricEvent mockEvent = Mockito.mock(GricEvent.class);

    Assert.assertEquals(expectedTotalCharge, totalCharge);
  }

  // @Test
  public void testCalculateTotalChargeabsorbTxFee() {
    Integer eventId = 5;
    int adultCount = 2;
    int childCount = 1;

    BigDecimal expectedTotalCharge = new BigDecimal("113.60");

    BigDecimal totalCharge = doEverything.calculateTotalCharge(eventId, adultCount, childCount);

    Assert.assertEquals(expectedTotalCharge, totalCharge);
  }

}
