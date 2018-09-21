package com.rskt.spring.cloud.domain;

public class TblUser extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String loginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_name
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.email
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.passwd
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String passwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_type
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    private String userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_id
     *
     * @return the value of tbl_user.user_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_id
     *
     * @param userId the value for tbl_user.user_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_id
     *
     * @return the value of tbl_user.login_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_id
     *
     * @param loginId the value for tbl_user.login_id
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_name
     *
     * @return the value of tbl_user.user_name
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_name
     *
     * @param userName the value for tbl_user.user_name
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.email
     *
     * @return the value of tbl_user.email
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.email
     *
     * @param email the value for tbl_user.email
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.passwd
     *
     * @return the value of tbl_user.passwd
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.passwd
     *
     * @param passwd the value for tbl_user.passwd
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_type
     *
     * @return the value of tbl_user.user_type
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_type
     *
     * @param userType the value for tbl_user.user_type
     *
     * @mbg.generated Fri Sep 21 16:17:16 CST 2018
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}