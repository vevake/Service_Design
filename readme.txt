HealthProfileSolution is simple service that helps user keep track of their LifeStatus and achieve their goals

Implementation

REST Services 
	The following 2 methods were implemented using the REST services
	
	The URL for REST services is 
		URL : http://localhost:8000/rest/LifestyleCoach/
		
	Method : getUserProfile
		Retrives the UserProfile of a user by passing the username.
		eg : http://localhost:8000/rest/LifestyleCoach/rest/profile?username=vvek
		
	Method : AllProfile
		Retrieves All UserProfile 
		eg : http://localhost:8000/rest/LifestyleCoach/rest/AllProfile
		

WebServices
	The URL in which the WebServics are hosted
		URL : http://localhost:8000/ehealth/LifestyleCoach/?wsdl
		
	The following methods were implemented using SOAP services
	
	Method : login
		Validates login credentials for the user
	 
	Method : loginCheck
		Check if a user is logged-on
	 
	Method : logout
		logs out the user from the system 
	
	Method : UserProfile
		Retrieves UserProfile matching the username
	
	Method : getAllUsers
		Retrieve details of all users
	 
	Method : createNewUser
		Create new User
	
	Method : deleteUser
		Delete User PRofile
	
	Method : updateUser
		Update a userProfile
		
	Method : getMeasuresDefinition
		Get Measures Definition
	
	Method : addLifeStatus
		add current lifeStatus of the user
	
	Method : viewLifeStatus
		Retrieve the current LifeStatus
	
	Method : getCurrentGoal
		Check for the current Goal 
	
	Method : setGoal
		Set a goal for a user
	
	Method : deleteGoal
		Delete a goal
	
	Method : GoalUpdate
		Update an existing goal
	
	Method : getMotivation
		Get motivation
	
	Method : getPushMessage
		Get push notifications
