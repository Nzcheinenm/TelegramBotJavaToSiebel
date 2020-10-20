
package com.siebel.xml.contact_20io;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accomplishments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPartnerFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountSurveyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentExcluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assistant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssistantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellularPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactOrganizationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contacted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEnteredHousehold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateExitedHousehold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeDupKeyModificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeDupLastMatchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionCriteriaBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionCriteriaProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionOrientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DedupToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeduplicationMatchScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeduplicationObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DegreeofInfluence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESPDecisionOrientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESPOrgStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESPPoliticalAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESPRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESPTimeSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EconomicBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSRUpdatesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Evidencetosupportrating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HiredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hobby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Income" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomeExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviteToSeminars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JoinedAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keylastupdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastClnseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastKeyGenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastUpdate-SDQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerPrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerPrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Married" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityContactComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnedById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIMCurrentUserSyncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentOpptyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnershipContactFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnershipKeyContactFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonUId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonalContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalWin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoliticalAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoliticalStrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredCommunications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousJobs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternateEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternatePhoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentDenormFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentManualFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentSystemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryGroupHouseholdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOpportunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPIMSyncOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalPaymentProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryResponsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryServiceAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectContactComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProspectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceForCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationSourceAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationtoHousehold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipStrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRReadFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRRedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendNewsletter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendPromotions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendQuarterlyFinancials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareHomePhoneFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressAllCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressAllEmails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressAllFaxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressAllMailings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearsatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfContact_BusinessAddress" type="{http://www.siebel.com/xml/Contact%20IO}ListOfContact_BusinessAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accomplishments",
    "accountCurrencyCode",
    "accountId",
    "accountIntegrationId",
    "accountModId",
    "accountPartnerFlag",
    "accountPriceListId",
    "accountPrimaryBillToAddressId",
    "accountPrimaryBillToPersonId",
    "accountPrimaryShipToAddressId",
    "accountPrimaryShipToPersonId",
    "accountSurveyType",
    "activeStatus",
    "agenda",
    "alias",
    "alignment",
    "approvalAuthority",
    "approvalStatus",
    "assignmentExcluded",
    "assistant",
    "assistantPhone",
    "birthDate",
    "businessResults",
    "csn",
    "call",
    "cellularPhone",
    "challengeAnswer",
    "challengeQuestion",
    "coach",
    "comment",
    "contactOrganizationIntegrationId",
    "contacted",
    "createdByName",
    "currencyCode",
    "dunsNumber",
    "dateEnteredHousehold",
    "dateExitedHousehold",
    "deDupKeyModificationDate",
    "deDupLastMatchDate",
    "decisionCriteriaBusiness",
    "decisionCriteriaProduct",
    "decisionOrientation",
    "dedupToken",
    "deduplicationMatchScore",
    "deduplicationObjectId",
    "degreeofInfluence",
    "disableDataCleansing",
    "dockFlag",
    "espDecisionOrientation",
    "espOrgStatus",
    "espPoliticalAnalysis",
    "espRole",
    "espTimeSpent",
    "economicBuyer",
    "education",
    "educationalBackground",
    "emailAddress",
    "emailSRUpdatesFlag",
    "employeeFlag",
    "employeeId",
    "employeeLoginName",
    "employeeNumber",
    "endDate",
    "evidencetosupportrating",
    "faxPhone",
    "firstName",
    "hiredBy",
    "hobby",
    "homePhone",
    "income",
    "incomeCurrencyCode",
    "incomeExchangeDate",
    "industry",
    "integrationId",
    "inviteToSeminars",
    "invoiceComments",
    "jobTitle",
    "joinedAccountId",
    "keylastupdated",
    "lastClnseDate",
    "lastKeyGenDate",
    "lastName",
    "lastUpdateSDQ",
    "loginName",
    "mf",
    "mm",
    "mailStop",
    "managerFirstName",
    "managerId",
    "managerIntegrationId",
    "managerLastName",
    "managerMiddleName",
    "managerPrimaryOrganization",
    "managerPrimaryOrganizationId",
    "managerUId",
    "married",
    "middleName",
    "mode",
    "opportunityContactComment",
    "orgStatus",
    "ownedBy",
    "ownedById",
    "pimCurrentUserSyncFlag",
    "parentOpptyId",
    "partnershipContactFlag",
    "partnershipKeyContactFlag",
    "partyName",
    "partyTypeCode",
    "partyUId",
    "personUId",
    "personalContact",
    "personalWin",
    "personality",
    "politicalAnalysis",
    "politicalStrategy",
    "preferredCommunications",
    "preferredLanguageCode",
    "previousJobs",
    "priceList",
    "priceListId",
    "priceListIntegrationId",
    "primaryAccountName",
    "primaryAddressCounty",
    "primaryAddressId",
    "primaryAddressIntegrationId",
    "primaryAddressModId",
    "primaryAddressName",
    "primaryAddressStreetAddress2",
    "primaryAddressStreetAddress3",
    "primaryAlternateEmailId",
    "primaryAlternatePhoneId",
    "primaryAssignmentDenormFlag",
    "primaryAssignmentManualFlag",
    "primaryAssignmentSystemFlag",
    "primaryCategoryId",
    "primaryCity",
    "primaryCountry",
    "primaryGroupHouseholdId",
    "primaryOpportunityId",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPIMSyncOwnerId",
    "primaryPersonalAddressId",
    "primaryPersonalPaymentProfileId",
    "primaryPositionId",
    "primaryPostalCode",
    "primaryResponsibilityId",
    "primaryServiceAgreementId",
    "primaryState",
    "primaryStreetAddress",
    "projectAccountId",
    "projectContactComment",
    "projectRole",
    "prospectFlag",
    "race",
    "rating",
    "referenceFlag",
    "referenceForCode",
    "registrationSourceAppName",
    "relationtoHousehold",
    "relationshipStrategy",
    "responsibilities",
    "role",
    "rowId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "srReadFlag",
    "srRedFlag",
    "sendNewsletter",
    "sendPromotions",
    "sendQuarterlyFinancials",
    "shareHomePhoneFlag",
    "socialSecurityNumber",
    "spouse",
    "spouseName",
    "startDate",
    "status",
    "suppressAllCalls",
    "suppressAllEmails",
    "suppressAllFaxes",
    "suppressAllMailings",
    "surveyFlag",
    "surveyLanguage",
    "technicalBuyer",
    "timeSpent",
    "timeZone",
    "timeZoneId",
    "timeZoneName",
    "userBuyer",
    "userStatus",
    "userType",
    "workPhone",
    "workPhoneExtension",
    "xModId",
    "yearsatAccount",
    "listOfContactBusinessAddress"
})
public class Contact {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "Accomplishments")
    protected String accomplishments;
    @XmlElement(name = "AccountCurrencyCode")
    protected String accountCurrencyCode;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "AccountModId")
    protected String accountModId;
    @XmlElement(name = "AccountPartnerFlag")
    protected String accountPartnerFlag;
    @XmlElement(name = "AccountPriceListId")
    protected String accountPriceListId;
    @XmlElement(name = "AccountPrimaryBillToAddressId")
    protected String accountPrimaryBillToAddressId;
    @XmlElement(name = "AccountPrimaryBillToPersonId")
    protected String accountPrimaryBillToPersonId;
    @XmlElement(name = "AccountPrimaryShipToAddressId")
    protected String accountPrimaryShipToAddressId;
    @XmlElement(name = "AccountPrimaryShipToPersonId")
    protected String accountPrimaryShipToPersonId;
    @XmlElement(name = "AccountSurveyType")
    protected String accountSurveyType;
    @XmlElement(name = "ActiveStatus")
    protected String activeStatus;
    @XmlElement(name = "Agenda")
    protected String agenda;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "Alignment")
    protected String alignment;
    @XmlElement(name = "ApprovalAuthority")
    protected String approvalAuthority;
    @XmlElement(name = "ApprovalStatus")
    protected String approvalStatus;
    @XmlElement(name = "AssignmentExcluded")
    protected String assignmentExcluded;
    @XmlElement(name = "Assistant")
    protected String assistant;
    @XmlElement(name = "AssistantPhone")
    protected String assistantPhone;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "BusinessResults")
    protected String businessResults;
    @XmlElement(name = "CSN")
    protected String csn;
    @XmlElement(name = "Call")
    protected String call;
    @XmlElement(name = "CellularPhone")
    protected String cellularPhone;
    @XmlElement(name = "ChallengeAnswer")
    protected String challengeAnswer;
    @XmlElement(name = "ChallengeQuestion")
    protected String challengeQuestion;
    @XmlElement(name = "Coach")
    protected String coach;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ContactOrganizationIntegrationId")
    protected String contactOrganizationIntegrationId;
    @XmlElement(name = "Contacted")
    protected String contacted;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "DateEnteredHousehold")
    protected String dateEnteredHousehold;
    @XmlElement(name = "DateExitedHousehold")
    protected String dateExitedHousehold;
    @XmlElement(name = "DeDupKeyModificationDate")
    protected String deDupKeyModificationDate;
    @XmlElement(name = "DeDupLastMatchDate")
    protected String deDupLastMatchDate;
    @XmlElement(name = "DecisionCriteriaBusiness")
    protected String decisionCriteriaBusiness;
    @XmlElement(name = "DecisionCriteriaProduct")
    protected String decisionCriteriaProduct;
    @XmlElement(name = "DecisionOrientation")
    protected String decisionOrientation;
    @XmlElement(name = "DedupToken")
    protected String dedupToken;
    @XmlElement(name = "DeduplicationMatchScore")
    protected String deduplicationMatchScore;
    @XmlElement(name = "DeduplicationObjectId")
    protected String deduplicationObjectId;
    @XmlElement(name = "DegreeofInfluence")
    protected String degreeofInfluence;
    @XmlElement(name = "DisableDataCleansing")
    protected String disableDataCleansing;
    @XmlElement(name = "DockFlag")
    protected String dockFlag;
    @XmlElement(name = "ESPDecisionOrientation")
    protected String espDecisionOrientation;
    @XmlElement(name = "ESPOrgStatus")
    protected String espOrgStatus;
    @XmlElement(name = "ESPPoliticalAnalysis")
    protected String espPoliticalAnalysis;
    @XmlElement(name = "ESPRole")
    protected String espRole;
    @XmlElement(name = "ESPTimeSpent")
    protected String espTimeSpent;
    @XmlElement(name = "EconomicBuyer")
    protected String economicBuyer;
    @XmlElement(name = "Education")
    protected String education;
    @XmlElement(name = "EducationalBackground")
    protected String educationalBackground;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "EmailSRUpdatesFlag")
    protected String emailSRUpdatesFlag;
    @XmlElement(name = "EmployeeFlag")
    protected String employeeFlag;
    @XmlElement(name = "EmployeeId")
    protected String employeeId;
    @XmlElement(name = "EmployeeLoginName")
    protected String employeeLoginName;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Evidencetosupportrating")
    protected String evidencetosupportrating;
    @XmlElement(name = "FaxPhone")
    protected String faxPhone;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "HiredBy")
    protected String hiredBy;
    @XmlElement(name = "Hobby")
    protected String hobby;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "Income")
    protected String income;
    @XmlElement(name = "IncomeCurrencyCode")
    protected String incomeCurrencyCode;
    @XmlElement(name = "IncomeExchangeDate")
    protected String incomeExchangeDate;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InviteToSeminars")
    protected String inviteToSeminars;
    @XmlElement(name = "InvoiceComments")
    protected String invoiceComments;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "JoinedAccountId")
    protected String joinedAccountId;
    @XmlElement(name = "Keylastupdated")
    protected String keylastupdated;
    @XmlElement(name = "LastClnseDate")
    protected String lastClnseDate;
    @XmlElement(name = "LastKeyGenDate")
    protected String lastKeyGenDate;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "LastUpdate-SDQ")
    protected String lastUpdateSDQ;
    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "MF")
    protected String mf;
    @XmlElement(name = "MM")
    protected String mm;
    @XmlElement(name = "MailStop")
    protected String mailStop;
    @XmlElement(name = "ManagerFirstName")
    protected String managerFirstName;
    @XmlElement(name = "ManagerId")
    protected String managerId;
    @XmlElement(name = "ManagerIntegrationId")
    protected String managerIntegrationId;
    @XmlElement(name = "ManagerLastName")
    protected String managerLastName;
    @XmlElement(name = "ManagerMiddleName")
    protected String managerMiddleName;
    @XmlElement(name = "ManagerPrimaryOrganization")
    protected String managerPrimaryOrganization;
    @XmlElement(name = "ManagerPrimaryOrganizationId")
    protected String managerPrimaryOrganizationId;
    @XmlElement(name = "ManagerUId")
    protected String managerUId;
    @XmlElement(name = "Married")
    protected String married;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElement(name = "OpportunityContactComment")
    protected String opportunityContactComment;
    @XmlElement(name = "OrgStatus")
    protected String orgStatus;
    @XmlElement(name = "OwnedBy")
    protected String ownedBy;
    @XmlElement(name = "OwnedById")
    protected String ownedById;
    @XmlElement(name = "PIMCurrentUserSyncFlag")
    protected String pimCurrentUserSyncFlag;
    @XmlElement(name = "ParentOpptyId")
    protected String parentOpptyId;
    @XmlElement(name = "PartnershipContactFlag")
    protected String partnershipContactFlag;
    @XmlElement(name = "PartnershipKeyContactFlag")
    protected String partnershipKeyContactFlag;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyTypeCode", required = true)
    protected String partyTypeCode;
    @XmlElement(name = "PartyUId", required = true)
    protected String partyUId;
    @XmlElement(name = "PersonUId", required = true)
    protected String personUId;
    @XmlElement(name = "PersonalContact")
    protected String personalContact;
    @XmlElement(name = "PersonalWin")
    protected String personalWin;
    @XmlElement(name = "Personality")
    protected String personality;
    @XmlElement(name = "PoliticalAnalysis")
    protected String politicalAnalysis;
    @XmlElement(name = "PoliticalStrategy")
    protected String politicalStrategy;
    @XmlElement(name = "PreferredCommunications")
    protected String preferredCommunications;
    @XmlElement(name = "PreferredLanguageCode")
    protected String preferredLanguageCode;
    @XmlElement(name = "PreviousJobs")
    protected String previousJobs;
    @XmlElement(name = "PriceList")
    protected String priceList;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected String priceListIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected String primaryAccountName;
    @XmlElement(name = "PrimaryAddressCounty")
    protected String primaryAddressCounty;
    @XmlElement(name = "PrimaryAddressId")
    protected String primaryAddressId;
    @XmlElement(name = "PrimaryAddressIntegrationId")
    protected String primaryAddressIntegrationId;
    @XmlElement(name = "PrimaryAddressModId")
    protected String primaryAddressModId;
    @XmlElement(name = "PrimaryAddressName")
    protected String primaryAddressName;
    @XmlElement(name = "PrimaryAddressStreetAddress2")
    protected String primaryAddressStreetAddress2;
    @XmlElement(name = "PrimaryAddressStreetAddress3")
    protected String primaryAddressStreetAddress3;
    @XmlElement(name = "PrimaryAlternateEmailId")
    protected String primaryAlternateEmailId;
    @XmlElement(name = "PrimaryAlternatePhoneId")
    protected String primaryAlternatePhoneId;
    @XmlElement(name = "PrimaryAssignmentDenormFlag")
    protected String primaryAssignmentDenormFlag;
    @XmlElement(name = "PrimaryAssignmentManualFlag")
    protected String primaryAssignmentManualFlag;
    @XmlElement(name = "PrimaryAssignmentSystemFlag")
    protected String primaryAssignmentSystemFlag;
    @XmlElement(name = "PrimaryCategoryId")
    protected String primaryCategoryId;
    @XmlElement(name = "PrimaryCity")
    protected String primaryCity;
    @XmlElement(name = "PrimaryCountry")
    protected String primaryCountry;
    @XmlElement(name = "PrimaryGroupHouseholdId")
    protected String primaryGroupHouseholdId;
    @XmlElement(name = "PrimaryOpportunityId")
    protected String primaryOpportunityId;
    @XmlElement(name = "PrimaryOrganization")
    protected String primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPIMSyncOwnerId")
    protected String primaryPIMSyncOwnerId;
    @XmlElement(name = "PrimaryPersonalAddressId")
    protected String primaryPersonalAddressId;
    @XmlElement(name = "PrimaryPersonalPaymentProfileId")
    protected String primaryPersonalPaymentProfileId;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "PrimaryPostalCode")
    protected String primaryPostalCode;
    @XmlElement(name = "PrimaryResponsibilityId")
    protected String primaryResponsibilityId;
    @XmlElement(name = "PrimaryServiceAgreementId")
    protected String primaryServiceAgreementId;
    @XmlElement(name = "PrimaryState")
    protected String primaryState;
    @XmlElement(name = "PrimaryStreetAddress")
    protected String primaryStreetAddress;
    @XmlElement(name = "ProjectAccountId")
    protected String projectAccountId;
    @XmlElement(name = "ProjectContactComment")
    protected String projectContactComment;
    @XmlElement(name = "ProjectRole")
    protected String projectRole;
    @XmlElement(name = "ProspectFlag")
    protected String prospectFlag;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "Rating")
    protected String rating;
    @XmlElement(name = "ReferenceFlag")
    protected String referenceFlag;
    @XmlElement(name = "ReferenceForCode")
    protected String referenceForCode;
    @XmlElement(name = "RegistrationSourceAppName")
    protected String registrationSourceAppName;
    @XmlElement(name = "RelationtoHousehold")
    protected String relationtoHousehold;
    @XmlElement(name = "RelationshipStrategy")
    protected String relationshipStrategy;
    @XmlElement(name = "Responsibilities")
    protected String responsibilities;
    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "S-SInstance")
    protected String ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected String ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected String ssKeyId;
    @XmlElement(name = "SRReadFlag")
    protected String srReadFlag;
    @XmlElement(name = "SRRedFlag")
    protected String srRedFlag;
    @XmlElement(name = "SendNewsletter")
    protected String sendNewsletter;
    @XmlElement(name = "SendPromotions")
    protected String sendPromotions;
    @XmlElement(name = "SendQuarterlyFinancials")
    protected String sendQuarterlyFinancials;
    @XmlElement(name = "ShareHomePhoneFlag")
    protected String shareHomePhoneFlag;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "Spouse")
    protected String spouse;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SuppressAllCalls")
    protected String suppressAllCalls;
    @XmlElement(name = "SuppressAllEmails")
    protected String suppressAllEmails;
    @XmlElement(name = "SuppressAllFaxes")
    protected String suppressAllFaxes;
    @XmlElement(name = "SuppressAllMailings")
    protected String suppressAllMailings;
    @XmlElement(name = "SurveyFlag")
    protected String surveyFlag;
    @XmlElement(name = "SurveyLanguage")
    protected String surveyLanguage;
    @XmlElement(name = "TechnicalBuyer")
    protected String technicalBuyer;
    @XmlElement(name = "TimeSpent")
    protected String timeSpent;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "TimeZoneId")
    protected String timeZoneId;
    @XmlElement(name = "TimeZoneName")
    protected String timeZoneName;
    @XmlElement(name = "UserBuyer")
    protected String userBuyer;
    @XmlElement(name = "UserStatus")
    protected String userStatus;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkPhoneExtension")
    protected String workPhoneExtension;
    @XmlElement(name = "XModId")
    protected String xModId;
    @XmlElement(name = "YearsatAccount")
    protected String yearsatAccount;
    @XmlElement(name = "ListOfContact_BusinessAddress")
    protected ListOfContactBusinessAddress listOfContactBusinessAddress;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accomplishments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccomplishments() {
        return accomplishments;
    }

    /**
     * Sets the value of the accomplishments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccomplishments(String value) {
        this.accomplishments = value;
    }

    /**
     * Gets the value of the accountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCurrencyCode() {
        return accountCurrencyCode;
    }

    /**
     * Sets the value of the accountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCurrencyCode(String value) {
        this.accountCurrencyCode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountModId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountModId() {
        return accountModId;
    }

    /**
     * Sets the value of the accountModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountModId(String value) {
        this.accountModId = value;
    }

    /**
     * Gets the value of the accountPartnerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPartnerFlag() {
        return accountPartnerFlag;
    }

    /**
     * Sets the value of the accountPartnerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPartnerFlag(String value) {
        this.accountPartnerFlag = value;
    }

    /**
     * Gets the value of the accountPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPriceListId() {
        return accountPriceListId;
    }

    /**
     * Sets the value of the accountPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPriceListId(String value) {
        this.accountPriceListId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryBillToAddressId() {
        return accountPrimaryBillToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryBillToAddressId(String value) {
        this.accountPrimaryBillToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryBillToPersonId() {
        return accountPrimaryBillToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryBillToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryBillToPersonId(String value) {
        this.accountPrimaryBillToPersonId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryShipToAddressId() {
        return accountPrimaryShipToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryShipToAddressId(String value) {
        this.accountPrimaryShipToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryShipToPersonId() {
        return accountPrimaryShipToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryShipToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryShipToPersonId(String value) {
        this.accountPrimaryShipToPersonId = value;
    }

    /**
     * Gets the value of the accountSurveyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSurveyType() {
        return accountSurveyType;
    }

    /**
     * Sets the value of the accountSurveyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSurveyType(String value) {
        this.accountSurveyType = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the agenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Sets the value of the agenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenda(String value) {
        this.agenda = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the approvalAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalAuthority() {
        return approvalAuthority;
    }

    /**
     * Sets the value of the approvalAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalAuthority(String value) {
        this.approvalAuthority = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the assignmentExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentExcluded() {
        return assignmentExcluded;
    }

    /**
     * Sets the value of the assignmentExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentExcluded(String value) {
        this.assignmentExcluded = value;
    }

    /**
     * Gets the value of the assistant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistant() {
        return assistant;
    }

    /**
     * Sets the value of the assistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistant(String value) {
        this.assistant = value;
    }

    /**
     * Gets the value of the assistantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets the value of the assistantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantPhone(String value) {
        this.assistantPhone = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the businessResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessResults() {
        return businessResults;
    }

    /**
     * Sets the value of the businessResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessResults(String value) {
        this.businessResults = value;
    }

    /**
     * Gets the value of the csn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSN() {
        return csn;
    }

    /**
     * Sets the value of the csn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSN(String value) {
        this.csn = value;
    }

    /**
     * Gets the value of the call property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCall() {
        return call;
    }

    /**
     * Sets the value of the call property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCall(String value) {
        this.call = value;
    }

    /**
     * Gets the value of the cellularPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellularPhone() {
        return cellularPhone;
    }

    /**
     * Sets the value of the cellularPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellularPhone(String value) {
        this.cellularPhone = value;
    }

    /**
     * Gets the value of the challengeAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeAnswer() {
        return challengeAnswer;
    }

    /**
     * Sets the value of the challengeAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeAnswer(String value) {
        this.challengeAnswer = value;
    }

    /**
     * Gets the value of the challengeQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeQuestion() {
        return challengeQuestion;
    }

    /**
     * Sets the value of the challengeQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeQuestion(String value) {
        this.challengeQuestion = value;
    }

    /**
     * Gets the value of the coach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoach() {
        return coach;
    }

    /**
     * Sets the value of the coach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoach(String value) {
        this.coach = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contactOrganizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOrganizationIntegrationId() {
        return contactOrganizationIntegrationId;
    }

    /**
     * Sets the value of the contactOrganizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOrganizationIntegrationId(String value) {
        this.contactOrganizationIntegrationId = value;
    }

    /**
     * Gets the value of the contacted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacted() {
        return contacted;
    }

    /**
     * Sets the value of the contacted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacted(String value) {
        this.contacted = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByName(String value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the dateEnteredHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnteredHousehold() {
        return dateEnteredHousehold;
    }

    /**
     * Sets the value of the dateEnteredHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnteredHousehold(String value) {
        this.dateEnteredHousehold = value;
    }

    /**
     * Gets the value of the dateExitedHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExitedHousehold() {
        return dateExitedHousehold;
    }

    /**
     * Sets the value of the dateExitedHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExitedHousehold(String value) {
        this.dateExitedHousehold = value;
    }

    /**
     * Gets the value of the deDupKeyModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeDupKeyModificationDate() {
        return deDupKeyModificationDate;
    }

    /**
     * Sets the value of the deDupKeyModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeDupKeyModificationDate(String value) {
        this.deDupKeyModificationDate = value;
    }

    /**
     * Gets the value of the deDupLastMatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeDupLastMatchDate() {
        return deDupLastMatchDate;
    }

    /**
     * Sets the value of the deDupLastMatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeDupLastMatchDate(String value) {
        this.deDupLastMatchDate = value;
    }

    /**
     * Gets the value of the decisionCriteriaBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionCriteriaBusiness() {
        return decisionCriteriaBusiness;
    }

    /**
     * Sets the value of the decisionCriteriaBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionCriteriaBusiness(String value) {
        this.decisionCriteriaBusiness = value;
    }

    /**
     * Gets the value of the decisionCriteriaProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionCriteriaProduct() {
        return decisionCriteriaProduct;
    }

    /**
     * Sets the value of the decisionCriteriaProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionCriteriaProduct(String value) {
        this.decisionCriteriaProduct = value;
    }

    /**
     * Gets the value of the decisionOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionOrientation() {
        return decisionOrientation;
    }

    /**
     * Sets the value of the decisionOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionOrientation(String value) {
        this.decisionOrientation = value;
    }

    /**
     * Gets the value of the dedupToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedupToken() {
        return dedupToken;
    }

    /**
     * Sets the value of the dedupToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedupToken(String value) {
        this.dedupToken = value;
    }

    /**
     * Gets the value of the deduplicationMatchScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduplicationMatchScore() {
        return deduplicationMatchScore;
    }

    /**
     * Sets the value of the deduplicationMatchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduplicationMatchScore(String value) {
        this.deduplicationMatchScore = value;
    }

    /**
     * Gets the value of the deduplicationObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduplicationObjectId() {
        return deduplicationObjectId;
    }

    /**
     * Sets the value of the deduplicationObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduplicationObjectId(String value) {
        this.deduplicationObjectId = value;
    }

    /**
     * Gets the value of the degreeofInfluence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeofInfluence() {
        return degreeofInfluence;
    }

    /**
     * Sets the value of the degreeofInfluence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeofInfluence(String value) {
        this.degreeofInfluence = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableDataCleansing(String value) {
        this.disableDataCleansing = value;
    }

    /**
     * Gets the value of the dockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDockFlag() {
        return dockFlag;
    }

    /**
     * Sets the value of the dockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDockFlag(String value) {
        this.dockFlag = value;
    }

    /**
     * Gets the value of the espDecisionOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPDecisionOrientation() {
        return espDecisionOrientation;
    }

    /**
     * Sets the value of the espDecisionOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPDecisionOrientation(String value) {
        this.espDecisionOrientation = value;
    }

    /**
     * Gets the value of the espOrgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPOrgStatus() {
        return espOrgStatus;
    }

    /**
     * Sets the value of the espOrgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPOrgStatus(String value) {
        this.espOrgStatus = value;
    }

    /**
     * Gets the value of the espPoliticalAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPPoliticalAnalysis() {
        return espPoliticalAnalysis;
    }

    /**
     * Sets the value of the espPoliticalAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPPoliticalAnalysis(String value) {
        this.espPoliticalAnalysis = value;
    }

    /**
     * Gets the value of the espRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPRole() {
        return espRole;
    }

    /**
     * Sets the value of the espRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPRole(String value) {
        this.espRole = value;
    }

    /**
     * Gets the value of the espTimeSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPTimeSpent() {
        return espTimeSpent;
    }

    /**
     * Sets the value of the espTimeSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPTimeSpent(String value) {
        this.espTimeSpent = value;
    }

    /**
     * Gets the value of the economicBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicBuyer() {
        return economicBuyer;
    }

    /**
     * Sets the value of the economicBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicBuyer(String value) {
        this.economicBuyer = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * Gets the value of the educationalBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalBackground() {
        return educationalBackground;
    }

    /**
     * Sets the value of the educationalBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalBackground(String value) {
        this.educationalBackground = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailSRUpdatesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSRUpdatesFlag() {
        return emailSRUpdatesFlag;
    }

    /**
     * Sets the value of the emailSRUpdatesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSRUpdatesFlag(String value) {
        this.emailSRUpdatesFlag = value;
    }

    /**
     * Gets the value of the employeeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFlag() {
        return employeeFlag;
    }

    /**
     * Sets the value of the employeeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeFlag(String value) {
        this.employeeFlag = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLoginName() {
        return employeeLoginName;
    }

    /**
     * Sets the value of the employeeLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLoginName(String value) {
        this.employeeLoginName = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the evidencetosupportrating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidencetosupportrating() {
        return evidencetosupportrating;
    }

    /**
     * Sets the value of the evidencetosupportrating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidencetosupportrating(String value) {
        this.evidencetosupportrating = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhone(String value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the hiredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredBy() {
        return hiredBy;
    }

    /**
     * Sets the value of the hiredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredBy(String value) {
        this.hiredBy = value;
    }

    /**
     * Gets the value of the hobby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * Sets the value of the hobby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHobby(String value) {
        this.hobby = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncome(String value) {
        this.income = value;
    }

    /**
     * Gets the value of the incomeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeCurrencyCode() {
        return incomeCurrencyCode;
    }

    /**
     * Sets the value of the incomeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeCurrencyCode(String value) {
        this.incomeCurrencyCode = value;
    }

    /**
     * Gets the value of the incomeExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeExchangeDate() {
        return incomeExchangeDate;
    }

    /**
     * Sets the value of the incomeExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeExchangeDate(String value) {
        this.incomeExchangeDate = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the inviteToSeminars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteToSeminars() {
        return inviteToSeminars;
    }

    /**
     * Sets the value of the inviteToSeminars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteToSeminars(String value) {
        this.inviteToSeminars = value;
    }

    /**
     * Gets the value of the invoiceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceComments() {
        return invoiceComments;
    }

    /**
     * Sets the value of the invoiceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceComments(String value) {
        this.invoiceComments = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the joinedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinedAccountId() {
        return joinedAccountId;
    }

    /**
     * Sets the value of the joinedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinedAccountId(String value) {
        this.joinedAccountId = value;
    }

    /**
     * Gets the value of the keylastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeylastupdated() {
        return keylastupdated;
    }

    /**
     * Sets the value of the keylastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeylastupdated(String value) {
        this.keylastupdated = value;
    }

    /**
     * Gets the value of the lastClnseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastClnseDate() {
        return lastClnseDate;
    }

    /**
     * Sets the value of the lastClnseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastClnseDate(String value) {
        this.lastClnseDate = value;
    }

    /**
     * Gets the value of the lastKeyGenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKeyGenDate() {
        return lastKeyGenDate;
    }

    /**
     * Sets the value of the lastKeyGenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKeyGenDate(String value) {
        this.lastKeyGenDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastUpdateSDQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateSDQ() {
        return lastUpdateSDQ;
    }

    /**
     * Sets the value of the lastUpdateSDQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateSDQ(String value) {
        this.lastUpdateSDQ = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMF() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMF(String value) {
        this.mf = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM(String value) {
        this.mm = value;
    }

    /**
     * Gets the value of the mailStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailStop() {
        return mailStop;
    }

    /**
     * Sets the value of the mailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailStop(String value) {
        this.mailStop = value;
    }

    /**
     * Gets the value of the managerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerFirstName() {
        return managerFirstName;
    }

    /**
     * Sets the value of the managerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerFirstName(String value) {
        this.managerFirstName = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the managerIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerIntegrationId() {
        return managerIntegrationId;
    }

    /**
     * Sets the value of the managerIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerIntegrationId(String value) {
        this.managerIntegrationId = value;
    }

    /**
     * Gets the value of the managerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLastName() {
        return managerLastName;
    }

    /**
     * Sets the value of the managerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLastName(String value) {
        this.managerLastName = value;
    }

    /**
     * Gets the value of the managerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerMiddleName() {
        return managerMiddleName;
    }

    /**
     * Sets the value of the managerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerMiddleName(String value) {
        this.managerMiddleName = value;
    }

    /**
     * Gets the value of the managerPrimaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerPrimaryOrganization() {
        return managerPrimaryOrganization;
    }

    /**
     * Sets the value of the managerPrimaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerPrimaryOrganization(String value) {
        this.managerPrimaryOrganization = value;
    }

    /**
     * Gets the value of the managerPrimaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerPrimaryOrganizationId() {
        return managerPrimaryOrganizationId;
    }

    /**
     * Sets the value of the managerPrimaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerPrimaryOrganizationId(String value) {
        this.managerPrimaryOrganizationId = value;
    }

    /**
     * Gets the value of the managerUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerUId() {
        return managerUId;
    }

    /**
     * Sets the value of the managerUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerUId(String value) {
        this.managerUId = value;
    }

    /**
     * Gets the value of the married property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarried() {
        return married;
    }

    /**
     * Sets the value of the married property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarried(String value) {
        this.married = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the opportunityContactComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityContactComment() {
        return opportunityContactComment;
    }

    /**
     * Sets the value of the opportunityContactComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityContactComment(String value) {
        this.opportunityContactComment = value;
    }

    /**
     * Gets the value of the orgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgStatus() {
        return orgStatus;
    }

    /**
     * Sets the value of the orgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgStatus(String value) {
        this.orgStatus = value;
    }

    /**
     * Gets the value of the ownedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedBy() {
        return ownedBy;
    }

    /**
     * Sets the value of the ownedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedBy(String value) {
        this.ownedBy = value;
    }

    /**
     * Gets the value of the ownedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedById() {
        return ownedById;
    }

    /**
     * Sets the value of the ownedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedById(String value) {
        this.ownedById = value;
    }

    /**
     * Gets the value of the pimCurrentUserSyncFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIMCurrentUserSyncFlag() {
        return pimCurrentUserSyncFlag;
    }

    /**
     * Sets the value of the pimCurrentUserSyncFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIMCurrentUserSyncFlag(String value) {
        this.pimCurrentUserSyncFlag = value;
    }

    /**
     * Gets the value of the parentOpptyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOpptyId() {
        return parentOpptyId;
    }

    /**
     * Sets the value of the parentOpptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOpptyId(String value) {
        this.parentOpptyId = value;
    }

    /**
     * Gets the value of the partnershipContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnershipContactFlag() {
        return partnershipContactFlag;
    }

    /**
     * Sets the value of the partnershipContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnershipContactFlag(String value) {
        this.partnershipContactFlag = value;
    }

    /**
     * Gets the value of the partnershipKeyContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnershipKeyContactFlag() {
        return partnershipKeyContactFlag;
    }

    /**
     * Sets the value of the partnershipKeyContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnershipKeyContactFlag(String value) {
        this.partnershipKeyContactFlag = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Sets the value of the partyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTypeCode(String value) {
        this.partyTypeCode = value;
    }

    /**
     * Gets the value of the partyUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUId() {
        return partyUId;
    }

    /**
     * Sets the value of the partyUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUId(String value) {
        this.partyUId = value;
    }

    /**
     * Gets the value of the personUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonUId() {
        return personUId;
    }

    /**
     * Sets the value of the personUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonUId(String value) {
        this.personUId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalContact(String value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the personalWin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalWin() {
        return personalWin;
    }

    /**
     * Sets the value of the personalWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalWin(String value) {
        this.personalWin = value;
    }

    /**
     * Gets the value of the personality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonality() {
        return personality;
    }

    /**
     * Sets the value of the personality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonality(String value) {
        this.personality = value;
    }

    /**
     * Gets the value of the politicalAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalAnalysis() {
        return politicalAnalysis;
    }

    /**
     * Sets the value of the politicalAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalAnalysis(String value) {
        this.politicalAnalysis = value;
    }

    /**
     * Gets the value of the politicalStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalStrategy() {
        return politicalStrategy;
    }

    /**
     * Sets the value of the politicalStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalStrategy(String value) {
        this.politicalStrategy = value;
    }

    /**
     * Gets the value of the preferredCommunications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCommunications() {
        return preferredCommunications;
    }

    /**
     * Sets the value of the preferredCommunications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCommunications(String value) {
        this.preferredCommunications = value;
    }

    /**
     * Gets the value of the preferredLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    /**
     * Sets the value of the preferredLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguageCode(String value) {
        this.preferredLanguageCode = value;
    }

    /**
     * Gets the value of the previousJobs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousJobs() {
        return previousJobs;
    }

    /**
     * Sets the value of the previousJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousJobs(String value) {
        this.previousJobs = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIntegrationId(String value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountName(String value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the primaryAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressCounty() {
        return primaryAddressCounty;
    }

    /**
     * Sets the value of the primaryAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressCounty(String value) {
        this.primaryAddressCounty = value;
    }

    /**
     * Gets the value of the primaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressId() {
        return primaryAddressId;
    }

    /**
     * Sets the value of the primaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressId(String value) {
        this.primaryAddressId = value;
    }

    /**
     * Gets the value of the primaryAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressIntegrationId() {
        return primaryAddressIntegrationId;
    }

    /**
     * Sets the value of the primaryAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressIntegrationId(String value) {
        this.primaryAddressIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAddressModId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressModId() {
        return primaryAddressModId;
    }

    /**
     * Sets the value of the primaryAddressModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressModId(String value) {
        this.primaryAddressModId = value;
    }

    /**
     * Gets the value of the primaryAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressName() {
        return primaryAddressName;
    }

    /**
     * Sets the value of the primaryAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressName(String value) {
        this.primaryAddressName = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressStreetAddress2() {
        return primaryAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressStreetAddress2(String value) {
        this.primaryAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressStreetAddress3() {
        return primaryAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressStreetAddress3(String value) {
        this.primaryAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryAlternateEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAlternateEmailId() {
        return primaryAlternateEmailId;
    }

    /**
     * Sets the value of the primaryAlternateEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAlternateEmailId(String value) {
        this.primaryAlternateEmailId = value;
    }

    /**
     * Gets the value of the primaryAlternatePhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAlternatePhoneId() {
        return primaryAlternatePhoneId;
    }

    /**
     * Sets the value of the primaryAlternatePhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAlternatePhoneId(String value) {
        this.primaryAlternatePhoneId = value;
    }

    /**
     * Gets the value of the primaryAssignmentDenormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAssignmentDenormFlag() {
        return primaryAssignmentDenormFlag;
    }

    /**
     * Sets the value of the primaryAssignmentDenormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAssignmentDenormFlag(String value) {
        this.primaryAssignmentDenormFlag = value;
    }

    /**
     * Gets the value of the primaryAssignmentManualFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAssignmentManualFlag() {
        return primaryAssignmentManualFlag;
    }

    /**
     * Sets the value of the primaryAssignmentManualFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAssignmentManualFlag(String value) {
        this.primaryAssignmentManualFlag = value;
    }

    /**
     * Gets the value of the primaryAssignmentSystemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAssignmentSystemFlag() {
        return primaryAssignmentSystemFlag;
    }

    /**
     * Sets the value of the primaryAssignmentSystemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAssignmentSystemFlag(String value) {
        this.primaryAssignmentSystemFlag = value;
    }

    /**
     * Gets the value of the primaryCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    /**
     * Sets the value of the primaryCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryId(String value) {
        this.primaryCategoryId = value;
    }

    /**
     * Gets the value of the primaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCity() {
        return primaryCity;
    }

    /**
     * Sets the value of the primaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCity(String value) {
        this.primaryCity = value;
    }

    /**
     * Gets the value of the primaryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCountry() {
        return primaryCountry;
    }

    /**
     * Sets the value of the primaryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCountry(String value) {
        this.primaryCountry = value;
    }

    /**
     * Gets the value of the primaryGroupHouseholdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupHouseholdId() {
        return primaryGroupHouseholdId;
    }

    /**
     * Sets the value of the primaryGroupHouseholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupHouseholdId(String value) {
        this.primaryGroupHouseholdId = value;
    }

    /**
     * Gets the value of the primaryOpportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOpportunityId() {
        return primaryOpportunityId;
    }

    /**
     * Sets the value of the primaryOpportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOpportunityId(String value) {
        this.primaryOpportunityId = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization(String value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPIMSyncOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPIMSyncOwnerId() {
        return primaryPIMSyncOwnerId;
    }

    /**
     * Sets the value of the primaryPIMSyncOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPIMSyncOwnerId(String value) {
        this.primaryPIMSyncOwnerId = value;
    }

    /**
     * Gets the value of the primaryPersonalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPersonalAddressId() {
        return primaryPersonalAddressId;
    }

    /**
     * Sets the value of the primaryPersonalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPersonalAddressId(String value) {
        this.primaryPersonalAddressId = value;
    }

    /**
     * Gets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPersonalPaymentProfileId() {
        return primaryPersonalPaymentProfileId;
    }

    /**
     * Sets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPersonalPaymentProfileId(String value) {
        this.primaryPersonalPaymentProfileId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionId(String value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    /**
     * Sets the value of the primaryPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPostalCode(String value) {
        this.primaryPostalCode = value;
    }

    /**
     * Gets the value of the primaryResponsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryResponsibilityId() {
        return primaryResponsibilityId;
    }

    /**
     * Sets the value of the primaryResponsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryResponsibilityId(String value) {
        this.primaryResponsibilityId = value;
    }

    /**
     * Gets the value of the primaryServiceAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryServiceAgreementId() {
        return primaryServiceAgreementId;
    }

    /**
     * Sets the value of the primaryServiceAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryServiceAgreementId(String value) {
        this.primaryServiceAgreementId = value;
    }

    /**
     * Gets the value of the primaryState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryState() {
        return primaryState;
    }

    /**
     * Sets the value of the primaryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryState(String value) {
        this.primaryState = value;
    }

    /**
     * Gets the value of the primaryStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStreetAddress() {
        return primaryStreetAddress;
    }

    /**
     * Sets the value of the primaryStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStreetAddress(String value) {
        this.primaryStreetAddress = value;
    }

    /**
     * Gets the value of the projectAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectAccountId() {
        return projectAccountId;
    }

    /**
     * Sets the value of the projectAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectAccountId(String value) {
        this.projectAccountId = value;
    }

    /**
     * Gets the value of the projectContactComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectContactComment() {
        return projectContactComment;
    }

    /**
     * Sets the value of the projectContactComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectContactComment(String value) {
        this.projectContactComment = value;
    }

    /**
     * Gets the value of the projectRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectRole() {
        return projectRole;
    }

    /**
     * Sets the value of the projectRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectRole(String value) {
        this.projectRole = value;
    }

    /**
     * Gets the value of the prospectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProspectFlag() {
        return prospectFlag;
    }

    /**
     * Sets the value of the prospectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProspectFlag(String value) {
        this.prospectFlag = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the referenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceFlag() {
        return referenceFlag;
    }

    /**
     * Sets the value of the referenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceFlag(String value) {
        this.referenceFlag = value;
    }

    /**
     * Gets the value of the referenceForCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceForCode() {
        return referenceForCode;
    }

    /**
     * Sets the value of the referenceForCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceForCode(String value) {
        this.referenceForCode = value;
    }

    /**
     * Gets the value of the registrationSourceAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationSourceAppName() {
        return registrationSourceAppName;
    }

    /**
     * Sets the value of the registrationSourceAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationSourceAppName(String value) {
        this.registrationSourceAppName = value;
    }

    /**
     * Gets the value of the relationtoHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationtoHousehold() {
        return relationtoHousehold;
    }

    /**
     * Sets the value of the relationtoHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationtoHousehold(String value) {
        this.relationtoHousehold = value;
    }

    /**
     * Gets the value of the relationshipStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipStrategy() {
        return relationshipStrategy;
    }

    /**
     * Sets the value of the relationshipStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipStrategy(String value) {
        this.relationshipStrategy = value;
    }

    /**
     * Gets the value of the responsibilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the value of the responsibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilities(String value) {
        this.responsibilities = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the ssInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSInstance() {
        return ssInstance;
    }

    /**
     * Sets the value of the ssInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSInstance(String value) {
        this.ssInstance = value;
    }

    /**
     * Gets the value of the ssInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSInstanceId() {
        return ssInstanceId;
    }

    /**
     * Sets the value of the ssInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSInstanceId(String value) {
        this.ssInstanceId = value;
    }

    /**
     * Gets the value of the ssKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSKeyId() {
        return ssKeyId;
    }

    /**
     * Sets the value of the ssKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSKeyId(String value) {
        this.ssKeyId = value;
    }

    /**
     * Gets the value of the srReadFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRReadFlag() {
        return srReadFlag;
    }

    /**
     * Sets the value of the srReadFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRReadFlag(String value) {
        this.srReadFlag = value;
    }

    /**
     * Gets the value of the srRedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRRedFlag() {
        return srRedFlag;
    }

    /**
     * Sets the value of the srRedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRRedFlag(String value) {
        this.srRedFlag = value;
    }

    /**
     * Gets the value of the sendNewsletter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendNewsletter() {
        return sendNewsletter;
    }

    /**
     * Sets the value of the sendNewsletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendNewsletter(String value) {
        this.sendNewsletter = value;
    }

    /**
     * Gets the value of the sendPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendPromotions() {
        return sendPromotions;
    }

    /**
     * Sets the value of the sendPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendPromotions(String value) {
        this.sendPromotions = value;
    }

    /**
     * Gets the value of the sendQuarterlyFinancials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendQuarterlyFinancials() {
        return sendQuarterlyFinancials;
    }

    /**
     * Sets the value of the sendQuarterlyFinancials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendQuarterlyFinancials(String value) {
        this.sendQuarterlyFinancials = value;
    }

    /**
     * Gets the value of the shareHomePhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHomePhoneFlag() {
        return shareHomePhoneFlag;
    }

    /**
     * Sets the value of the shareHomePhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHomePhoneFlag(String value) {
        this.shareHomePhoneFlag = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the spouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the value of the spouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouse(String value) {
        this.spouse = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the suppressAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllCalls() {
        return suppressAllCalls;
    }

    /**
     * Sets the value of the suppressAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllCalls(String value) {
        this.suppressAllCalls = value;
    }

    /**
     * Gets the value of the suppressAllEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllEmails() {
        return suppressAllEmails;
    }

    /**
     * Sets the value of the suppressAllEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllEmails(String value) {
        this.suppressAllEmails = value;
    }

    /**
     * Gets the value of the suppressAllFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllFaxes() {
        return suppressAllFaxes;
    }

    /**
     * Sets the value of the suppressAllFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllFaxes(String value) {
        this.suppressAllFaxes = value;
    }

    /**
     * Gets the value of the suppressAllMailings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllMailings() {
        return suppressAllMailings;
    }

    /**
     * Sets the value of the suppressAllMailings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllMailings(String value) {
        this.suppressAllMailings = value;
    }

    /**
     * Gets the value of the surveyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyFlag() {
        return surveyFlag;
    }

    /**
     * Sets the value of the surveyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyFlag(String value) {
        this.surveyFlag = value;
    }

    /**
     * Gets the value of the surveyLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyLanguage() {
        return surveyLanguage;
    }

    /**
     * Sets the value of the surveyLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyLanguage(String value) {
        this.surveyLanguage = value;
    }

    /**
     * Gets the value of the technicalBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalBuyer() {
        return technicalBuyer;
    }

    /**
     * Sets the value of the technicalBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalBuyer(String value) {
        this.technicalBuyer = value;
    }

    /**
     * Gets the value of the timeSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSpent() {
        return timeSpent;
    }

    /**
     * Sets the value of the timeSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSpent(String value) {
        this.timeSpent = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

    /**
     * Gets the value of the userBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBuyer() {
        return userBuyer;
    }

    /**
     * Sets the value of the userBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBuyer(String value) {
        this.userBuyer = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneExtension(String value) {
        this.workPhoneExtension = value;
    }

    /**
     * Gets the value of the xModId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXModId() {
        return xModId;
    }

    /**
     * Sets the value of the xModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXModId(String value) {
        this.xModId = value;
    }

    /**
     * Gets the value of the yearsatAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsatAccount() {
        return yearsatAccount;
    }

    /**
     * Sets the value of the yearsatAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsatAccount(String value) {
        this.yearsatAccount = value;
    }

    /**
     * Gets the value of the listOfContactBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactBusinessAddress }
     *     
     */
    public ListOfContactBusinessAddress getListOfContactBusinessAddress() {
        return listOfContactBusinessAddress;
    }

    /**
     * Sets the value of the listOfContactBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactBusinessAddress }
     *     
     */
    public void setListOfContactBusinessAddress(ListOfContactBusinessAddress value) {
        this.listOfContactBusinessAddress = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
