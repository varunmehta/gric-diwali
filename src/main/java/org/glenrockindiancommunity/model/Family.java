package org.glenrockindiancommunity.model;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Family {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private String familyNameCode;
  private String lastname;
  private String firstname;
  private String town;
  private Integer adults;
  private Integer children;
  private BigDecimal amount;
  private String primaryEmail;
  private String stripeReceiptNumber;
  private boolean participant;
  private boolean volunteer;

  public Family() {
    // Stupid Jackson needs this
  }

  public Family(String lastname, String firstname, String town, Integer adults, Integer children, String primaryEmail,
      boolean participant, boolean volunteer) {
    this.familyNameCode = lastname + "-" + UUID.randomUUID().toString().replaceAll("-", "");
    this.lastname = lastname;
    this.firstname = firstname;
    this.town = town;
    this.adults = adults;
    this.children = children;
    this.primaryEmail = primaryEmail;
    this.participant = participant;
    this.volunteer = volunteer;
  }

  public Integer getId() {
    return id;
  }
  
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public String getFamilyNameCode() {
    return familyNameCode;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getTown() {
    return town;
  }

  public Integer getAdults() {
    return adults;
  }

  public Integer getChildren() {
    return children;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public String getStripeReceiptNumber() {
    return stripeReceiptNumber;
  }

  public boolean isParticipant() {
    return participant;
  }

  public boolean isVolunteer() {
    return volunteer;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setFamilyNameCode(String familyNameCode) {
    this.familyNameCode = familyNameCode;
  }

  public void setLastname(String lastname) {
    this.familyNameCode = lastname + "-" + UUID.randomUUID().toString().replaceAll("-", "");
    this.lastname = lastname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public void setStripeReceiptNumber(String stripeReceiptNumber) {
    this.stripeReceiptNumber = stripeReceiptNumber;
  }

  public void setParticipant(boolean participant) {
    this.participant = participant;
  }

  public void setVolunteer(boolean volunteer) {
    this.volunteer = volunteer;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((adults == null) ? 0 : adults.hashCode());
    result = prime * result + ((amount == null) ? 0 : amount.hashCode());
    result = prime * result + ((children == null) ? 0 : children.hashCode());
    result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
    result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
    result = prime * result + (participant ? 1231 : 1237);
    result = prime * result + ((primaryEmail == null) ? 0 : primaryEmail.hashCode());
    result = prime * result + ((town == null) ? 0 : town.hashCode());
    result = prime * result + (volunteer ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Family other = (Family) obj;
    if (adults == null) {
      if (other.adults != null)
        return false;
    } else if (!adults.equals(other.adults))
      return false;
    if (amount == null) {
      if (other.amount != null)
        return false;
    } else if (!amount.equals(other.amount))
      return false;
    if (children == null) {
      if (other.children != null)
        return false;
    } else if (!children.equals(other.children))
      return false;
    if (firstname == null) {
      if (other.firstname != null)
        return false;
    } else if (!firstname.equals(other.firstname))
      return false;
    if (lastname == null) {
      if (other.lastname != null)
        return false;
    } else if (!lastname.equals(other.lastname))
      return false;
    if (participant != other.participant)
      return false;
    if (primaryEmail == null) {
      if (other.primaryEmail != null)
        return false;
    } else if (!primaryEmail.equals(other.primaryEmail))
      return false;
    if (town == null) {
      if (other.town != null)
        return false;
    } else if (!town.equals(other.town))
      return false;
    if (volunteer != other.volunteer)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Family [id=" + id + ", familyNameCode=" + familyNameCode + ", lastname=" + lastname + ", firstname="
        + firstname + ", town=" + town + ", adults=" + adults + ", children=" + children + ", amount=" + amount
        + ", primaryEmail=" + primaryEmail + ", stripeReceiptNumber=" + stripeReceiptNumber + ", participant="
        + participant + ", volunteer=" + volunteer + "]";
  }

}