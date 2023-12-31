<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>02_update_username</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>04ce6b3c-aac9-496b-b04e-ef7a883449cf</testSuiteGuid>
   <testCaseLink>
      <guid>858b4928-6a7f-466a-a9ff-691988817b79</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/user_account_actions/login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>3583d59c-97ca-49e1-9396-ad5075a935ca</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>9d0df074-395f-42be-9649-25eec49892ac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/user_account_actions/update_user_name</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>535a4d5a-121c-43cb-9a20-1cac26be3820</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/first_last_name</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>535a4d5a-121c-43cb-9a20-1cac26be3820</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Firstname</value>
         <variableId>b00309b4-53a6-44de-ab8a-97882a3b39f4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>535a4d5a-121c-43cb-9a20-1cac26be3820</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>lastname</value>
         <variableId>26e8e691-451b-4d16-920f-889fe1c7f672</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c2f1cd3d-b43d-4c86-aeb4-c4562c70f7c3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/user_account_actions/logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
