DROP TABLE IF EXISTS `UserProfile`;
CREATE TABLE `UserProfile` (
	`Uid`	int AUTO_INCREMENT NOT NULL,
	`fname`	varchar(45) NOT NULL,
	`lname`	varchar(45) NOT NULL,
	`username`	varchar(45) NOT NULL,
	`password`	varchar(45) NOT NULL,
	`key` varchar(45) DEFAULT NULL,
	PRIMARY KEY(Uid)
);
INSERT INTO `userprofile` VALUES (1,'Ans','Riaz','Ans.Riaz','pass','c1c53056-081e-4a15-a716-32d4eed35a23'),(2,'Vevake','Balaraman','vvek','pass',NULL);


DROP TABLE IF EXISTS `MeasureDefinition`;
CREATE TABLE `MeasureDefinition` (
	`Mid` int AUTO_INCREMENT NOT NULL,
	`measureName`	varchar(45) NOT NULL,
	`measureType`	varchar(45) NOT NULL,
	PRIMARY KEY(Mid)
);
INSERT INTO `measuredefinition` VALUES (1,'weight','double'),(2,'height','double'),(3,'step count','integer'),(4,'heart rate','double'),(5,'calories consumed','double'),(6,'bmi','double'),(7,'blood pressure','double');


DROP TABLE IF EXISTS `MeasureDefaultRange`;
CREATE TABLE `MeasureDefaultRange` (
	`MRid` int AUTO_INCREMENT NOT NULL,
	`Mid` int NOT NULL,
	`rangeName`	varchar(45) NOT NULL,
	`startValue`	double NOT NULL,
	`endValue`	double NOT NULL,
	`alarmLevel`	double NULL,
	PRIMARY KEY(`MRid` , `Mid`),
	FOREIGN KEY (`Mid`) REFERENCES `MeasureDefinition` (`Mid`)
);
INSERT INTO `measuredefaultrange` VALUES (1,1,'Overweight',25.01,30,1),(2,1,'Obesity',30.01,40,2),(3,1,'Normal weight',20.01,25,0),(4,1,'Underweight',23.02,20,1);


DROP TABLE IF EXISTS `LifeStatus`;
CREATE TABLE `LifeStatus` (
	`LSid` int AUTO_INCREMENT NOT NULL,
	`Mid` int AUTO_INCREMENT NOT NULL,
	`Uid`	int NOT NULL,
	`value`	double NOT NULL,
	`DateTime`	datetime NOT NULL,
	PRIMARY KEY(LSid),
	FOREIGN KEY(`Uid`) REFERENCES `UserProfile` ( `Uid` ),
	FOREIGN KEY(`Mid`) REFERENCES `MeasureDefinition` ( `Mid` )
);
INSERT INTO `LifeStatus` VALUES (1,1,1,73,'2014-09-12 04:05:50'),(2,1,2,63,'2014-01-24 15:08:24');


DROP TABLE IF EXISTS `HealthMeasureHistory`;
CREATE TABLE `HealthMeasureHistory` (
	`HMid` int AUTO_INCREMENT NOT NULL,
	`Uid`	int NOT NULL,
	`Mid`	int AUTO_INCREMENT NOT NULL,
	`value`	double NOT NULL,
	`DateTime`	datetime NOT NULL,
	PRIMARY KEY(HMid),
	FOREIGN KEY(`Uid`) REFERENCES `UserProfile` ( `Uid` ),
	FOREIGN KEY(`Mid`) REFERENCES `MeasureDefinition` ( `Mid` )
);
INSERT INTO `HealthMeasureHistory` VALUES (1,1,3,7844,'2013-04-19 23:18:26'),(2,1,2,197,'2012-12-21 15:03:57');

/*DROP TABLE IF EXISTS `Medic`;
CREATE TABLE `Medic` (
  `MedicId` int AUTO_INCREMENT NOT NULL,
  `MedicName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (MedicId)	
);
*/

DROP TABLE IF EXISTS `Advice`;
CREATE TABLE `Advice` (
  `AId` int AUTO_INCREMENT NOT NULL,
  `Advice` varchar(500) DEFAULT NULL,  
  `Uid` int(10) NOT NULL,
  PRIMARY KEY (`AId`,`Uid`),	
  FOREIGN KEY(`Uid`) REFERENCES `UserProfile` ( `Uid` )ON DELETE NO ACTION ON UPDATE NO ACTION
);

DROP TABLE IF EXISTS `CareGiver`;
CREATE TABLE `CareGiver` (
  `CGid` int AUTO_INCREMENT NOT NULL,
  `CGName` varchar(45) DEFAULT NULL,
  `UPid` int AUTO_INCREMENT NOT NULL,
  `care_Uid` int AUTO_INCREMENT NOT NULL,
  PRIMARY KEY (CGid),
  FOREIGN KEY (`Care_Uid`) REFERENCES `UserProfile` (`Uid`),
  FOREIGN KEY (`UPid`) REFERENCES `UserProfile` (`Uid`) 
);
INSERT INTO `caregiver` VALUES (1,'vevake',2,1),(2,'Ans',1,2);


DROP TABLE IF EXISTS `Goal`;
CREATE TABLE `Goal` (
  `GoalId` int AUTO_INCREMENT NOT NULL,
  `Goal` varchar(45) NOT NULL,
  `byCareGiver` int DEFAULT NULL,
  `byUserProfile` int DEFAULT NULL,
  `scheduleDateTime` datetime NOT NULL,
  `Uid` int NOT NULL,
  `Progress` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`GoalId`),
  FOREIGN KEY (`Uid`) REFERENCES `UserProfile` (`Uid`)
);
INSERT INTO `Goal` VALUES (1,'stringing',1,0,'2015-02-10 01:22:00',1,'1');
