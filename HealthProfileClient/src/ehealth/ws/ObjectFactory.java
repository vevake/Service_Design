
package ehealth.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ehealth.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LogoutResponse_QNAME = new QName("http://ws.ehealth/", "logoutResponse");
    private final static QName _GetMeasuresDefinition_QNAME = new QName("http://ws.ehealth/", "getMeasuresDefinition");
    private final static QName _Login_QNAME = new QName("http://ws.ehealth/", "login");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://ws.ehealth/", "getAllUsersResponse");
    private final static QName _SetGoal_QNAME = new QName("http://ws.ehealth/", "setGoal");
    private final static QName _GoalUpdateResponse_QNAME = new QName("http://ws.ehealth/", "GoalUpdateResponse");
    private final static QName _ViewLifeStatus_QNAME = new QName("http://ws.ehealth/", "viewLifeStatus");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.ehealth/", "deleteUserResponse");
    private final static QName _GetPushMessageResponse_QNAME = new QName("http://ws.ehealth/", "GetPushMessageResponse");
    private final static QName _LifeStatus_QNAME = new QName("http://ws.ehealth/", "lifeStatus");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.ehealth/", "deleteGoalResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.ehealth/", "createUserResponse");
    private final static QName _LoginCheckResponse_QNAME = new QName("http://ws.ehealth/", "loginCheckResponse");
    private final static QName _GetCurrentGoalResponse_QNAME = new QName("http://ws.ehealth/", "getCurrentGoalResponse");
    private final static QName _GetPushMessage_QNAME = new QName("http://ws.ehealth/", "GetPushMessage");
    private final static QName _GetCurrentGoal_QNAME = new QName("http://ws.ehealth/", "getCurrentGoal");
    private final static QName _UpdateUser_QNAME = new QName("http://ws.ehealth/", "updateUser");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.ehealth/", "deleteUser");
    private final static QName _GetUserProfile_QNAME = new QName("http://ws.ehealth/", "getUserProfile");
    private final static QName _GoalUpdate_QNAME = new QName("http://ws.ehealth/", "GoalUpdate");
    private final static QName _ViewLifeStatusResponse_QNAME = new QName("http://ws.ehealth/", "viewLifeStatusResponse");
    private final static QName _Logout_QNAME = new QName("http://ws.ehealth/", "logout");
    private final static QName _CreateUser_QNAME = new QName("http://ws.ehealth/", "createUser");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.ehealth/", "deleteGoal");
    private final static QName _GetUserProfileResponse_QNAME = new QName("http://ws.ehealth/", "getUserProfileResponse");
    private final static QName _SetGoalResponse_QNAME = new QName("http://ws.ehealth/", "setGoalResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://ws.ehealth/", "updateUserResponse");
    private final static QName _LoginCheck_QNAME = new QName("http://ws.ehealth/", "loginCheck");
    private final static QName _AddLifeStatus_QNAME = new QName("http://ws.ehealth/", "addLifeStatus");
    private final static QName _AddLifeStatusResponse_QNAME = new QName("http://ws.ehealth/", "addLifeStatusResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://ws.ehealth/", "getAllUsers");
    private final static QName _GetMotivationResponse_QNAME = new QName("http://ws.ehealth/", "GetMotivationResponse");
    private final static QName _GetMeasuresDefinitionResponse_QNAME = new QName("http://ws.ehealth/", "getMeasuresDefinitionResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.ehealth/", "loginResponse");
    private final static QName _GetMotivation_QNAME = new QName("http://ws.ehealth/", "GetMotivation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ehealth.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPushMessage }
     * 
     */
    public GetPushMessage createGetPushMessage() {
        return new GetPushMessage();
    }

    /**
     * Create an instance of {@link GetCurrentGoalResponse }
     * 
     */
    public GetCurrentGoalResponse createGetCurrentGoalResponse() {
        return new GetCurrentGoalResponse();
    }

    /**
     * Create an instance of {@link LoginCheckResponse }
     * 
     */
    public LoginCheckResponse createLoginCheckResponse() {
        return new LoginCheckResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link GetPushMessageResponse }
     * 
     */
    public GetPushMessageResponse createGetPushMessageResponse() {
        return new GetPushMessageResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link ViewLifeStatus }
     * 
     */
    public ViewLifeStatus createViewLifeStatus() {
        return new ViewLifeStatus();
    }

    /**
     * Create an instance of {@link GoalUpdateResponse }
     * 
     */
    public GoalUpdateResponse createGoalUpdateResponse() {
        return new GoalUpdateResponse();
    }

    /**
     * Create an instance of {@link SetGoal }
     * 
     */
    public SetGoal createSetGoal() {
        return new SetGoal();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetMeasuresDefinition }
     * 
     */
    public GetMeasuresDefinition createGetMeasuresDefinition() {
        return new GetMeasuresDefinition();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetMotivation }
     * 
     */
    public GetMotivation createGetMotivation() {
        return new GetMotivation();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetMotivationResponse }
     * 
     */
    public GetMotivationResponse createGetMotivationResponse() {
        return new GetMotivationResponse();
    }

    /**
     * Create an instance of {@link GetMeasuresDefinitionResponse }
     * 
     */
    public GetMeasuresDefinitionResponse createGetMeasuresDefinitionResponse() {
        return new GetMeasuresDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link AddLifeStatusResponse }
     * 
     */
    public AddLifeStatusResponse createAddLifeStatusResponse() {
        return new AddLifeStatusResponse();
    }

    /**
     * Create an instance of {@link AddLifeStatus }
     * 
     */
    public AddLifeStatus createAddLifeStatus() {
        return new AddLifeStatus();
    }

    /**
     * Create an instance of {@link LoginCheck }
     * 
     */
    public LoginCheck createLoginCheck() {
        return new LoginCheck();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link SetGoalResponse }
     * 
     */
    public SetGoalResponse createSetGoalResponse() {
        return new SetGoalResponse();
    }

    /**
     * Create an instance of {@link GetUserProfileResponse }
     * 
     */
    public GetUserProfileResponse createGetUserProfileResponse() {
        return new GetUserProfileResponse();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link ViewLifeStatusResponse }
     * 
     */
    public ViewLifeStatusResponse createViewLifeStatusResponse() {
        return new ViewLifeStatusResponse();
    }

    /**
     * Create an instance of {@link GoalUpdate }
     * 
     */
    public GoalUpdate createGoalUpdate() {
        return new GoalUpdate();
    }

    /**
     * Create an instance of {@link GetUserProfile }
     * 
     */
    public GetUserProfile createGetUserProfile() {
        return new GetUserProfile();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetCurrentGoal }
     * 
     */
    public GetCurrentGoal createGetCurrentGoal() {
        return new GetCurrentGoal();
    }

    /**
     * Create an instance of {@link UserProfile }
     * 
     */
    public UserProfile createUserProfile() {
        return new UserProfile();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasuresDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getMeasuresDefinition")
    public JAXBElement<GetMeasuresDefinition> createGetMeasuresDefinition(GetMeasuresDefinition value) {
        return new JAXBElement<GetMeasuresDefinition>(_GetMeasuresDefinition_QNAME, GetMeasuresDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "setGoal")
    public JAXBElement<SetGoal> createSetGoal(SetGoal value) {
        return new JAXBElement<SetGoal>(_SetGoal_QNAME, SetGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GoalUpdateResponse")
    public JAXBElement<GoalUpdateResponse> createGoalUpdateResponse(GoalUpdateResponse value) {
        return new JAXBElement<GoalUpdateResponse>(_GoalUpdateResponse_QNAME, GoalUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "viewLifeStatus")
    public JAXBElement<ViewLifeStatus> createViewLifeStatus(ViewLifeStatus value) {
        return new JAXBElement<ViewLifeStatus>(_ViewLifeStatus_QNAME, ViewLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPushMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GetPushMessageResponse")
    public JAXBElement<GetPushMessageResponse> createGetPushMessageResponse(GetPushMessageResponse value) {
        return new JAXBElement<GetPushMessageResponse>(_GetPushMessageResponse_QNAME, GetPushMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "lifeStatus")
    public JAXBElement<LifeStatus> createLifeStatus(LifeStatus value) {
        return new JAXBElement<LifeStatus>(_LifeStatus_QNAME, LifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "loginCheckResponse")
    public JAXBElement<LoginCheckResponse> createLoginCheckResponse(LoginCheckResponse value) {
        return new JAXBElement<LoginCheckResponse>(_LoginCheckResponse_QNAME, LoginCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getCurrentGoalResponse")
    public JAXBElement<GetCurrentGoalResponse> createGetCurrentGoalResponse(GetCurrentGoalResponse value) {
        return new JAXBElement<GetCurrentGoalResponse>(_GetCurrentGoalResponse_QNAME, GetCurrentGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPushMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GetPushMessage")
    public JAXBElement<GetPushMessage> createGetPushMessage(GetPushMessage value) {
        return new JAXBElement<GetPushMessage>(_GetPushMessage_QNAME, GetPushMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getCurrentGoal")
    public JAXBElement<GetCurrentGoal> createGetCurrentGoal(GetCurrentGoal value) {
        return new JAXBElement<GetCurrentGoal>(_GetCurrentGoal_QNAME, GetCurrentGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getUserProfile")
    public JAXBElement<GetUserProfile> createGetUserProfile(GetUserProfile value) {
        return new JAXBElement<GetUserProfile>(_GetUserProfile_QNAME, GetUserProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GoalUpdate")
    public JAXBElement<GoalUpdate> createGoalUpdate(GoalUpdate value) {
        return new JAXBElement<GoalUpdate>(_GoalUpdate_QNAME, GoalUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "viewLifeStatusResponse")
    public JAXBElement<ViewLifeStatusResponse> createViewLifeStatusResponse(ViewLifeStatusResponse value) {
        return new JAXBElement<ViewLifeStatusResponse>(_ViewLifeStatusResponse_QNAME, ViewLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getUserProfileResponse")
    public JAXBElement<GetUserProfileResponse> createGetUserProfileResponse(GetUserProfileResponse value) {
        return new JAXBElement<GetUserProfileResponse>(_GetUserProfileResponse_QNAME, GetUserProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "setGoalResponse")
    public JAXBElement<SetGoalResponse> createSetGoalResponse(SetGoalResponse value) {
        return new JAXBElement<SetGoalResponse>(_SetGoalResponse_QNAME, SetGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "loginCheck")
    public JAXBElement<LoginCheck> createLoginCheck(LoginCheck value) {
        return new JAXBElement<LoginCheck>(_LoginCheck_QNAME, LoginCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "addLifeStatus")
    public JAXBElement<AddLifeStatus> createAddLifeStatus(AddLifeStatus value) {
        return new JAXBElement<AddLifeStatus>(_AddLifeStatus_QNAME, AddLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "addLifeStatusResponse")
    public JAXBElement<AddLifeStatusResponse> createAddLifeStatusResponse(AddLifeStatusResponse value) {
        return new JAXBElement<AddLifeStatusResponse>(_AddLifeStatusResponse_QNAME, AddLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GetMotivationResponse")
    public JAXBElement<GetMotivationResponse> createGetMotivationResponse(GetMotivationResponse value) {
        return new JAXBElement<GetMotivationResponse>(_GetMotivationResponse_QNAME, GetMotivationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasuresDefinitionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "getMeasuresDefinitionResponse")
    public JAXBElement<GetMeasuresDefinitionResponse> createGetMeasuresDefinitionResponse(GetMeasuresDefinitionResponse value) {
        return new JAXBElement<GetMeasuresDefinitionResponse>(_GetMeasuresDefinitionResponse_QNAME, GetMeasuresDefinitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMotivation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ehealth/", name = "GetMotivation")
    public JAXBElement<GetMotivation> createGetMotivation(GetMotivation value) {
        return new JAXBElement<GetMotivation>(_GetMotivation_QNAME, GetMotivation.class, null, value);
    }

}
