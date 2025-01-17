<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>2</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>505102e8-295a-4a0b-adc5-7ff9cd412823</testSuiteGuid>
   <testCaseLink>
      <guid>e5f1fc1b-c49f-4c08-b2a9-1eb601cd613a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'John Doe'</defaultValue>
         <description></description>
         <id>ddc6be60-4e3f-48e1-bcb1-89ec48805183</id>
         <masked>false</masked>
         <name>username</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/Scenario/01 - Login Scenario/011 - Valid Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c561972e-721a-4117-8704-169a0dd5ceb7</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Katalon Data/Login_Data_Excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c561972e-721a-4117-8704-169a0dd5ceb7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>ddc6be60-4e3f-48e1-bcb1-89ec48805183</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c561972e-721a-4117-8704-169a0dd5ceb7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>18cc84e8-1e1a-4aee-9de4-7748ce23300b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>de9ad38a-93ac-4e53-8477-fc047d2b5146</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/02 - Make Appointment/022 - Invalid Make Appointment</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>80875841-de12-4ae9-9818-390800366585</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>540c28d9-6f30-41ff-bfc2-a011ee902eb3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c695a453-a828-4e2c-ad82-5fb62e878e63</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>172ff71d-335c-483b-a2d3-e8c4b0d9b5d0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>47cdd243-f533-407c-b322-056bcf4e7028</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
