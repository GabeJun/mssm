package com.mssm.dbTable.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Long userId;

    private String loginName;

    private String loginPassword;

    private String userNickname;

    private String userName;

    private String email;

    private String answer;

    private String question;

    private Integer sex;

    private Date birthday;

    private BigDecimal userMoney;

    private BigDecimal frozenMoney;

    private BigDecimal payPoints;

    private Integer userLevel;

    private Integer state;

    private String mobile;

    private String phone;

    private String userAddress;

    private String postCode;

    private String picUrl;

    private String location;

    private String lastIp;

    private String parentId;

    private String parentName;

    private Integer loginAmount;

    private Integer failtureAmount;

    private Date createDate;

    private Date updateDate;

    private Date loginDate;

    private Date loginErrorDate;

    private String createUser;

    private String updateUser;

    private BigDecimal frozenPoints;

    private String truePic;

    private String yibaoAccount;

    private String yibaoAccountInner;

    private String yibaoPwd;

    private String idCard;

    private String personId;

    private String personName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public BigDecimal getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(BigDecimal payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public Integer getLoginAmount() {
        return loginAmount;
    }

    public void setLoginAmount(Integer loginAmount) {
        this.loginAmount = loginAmount;
    }

    public Integer getFailtureAmount() {
        return failtureAmount;
    }

    public void setFailtureAmount(Integer failtureAmount) {
        this.failtureAmount = failtureAmount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginErrorDate() {
        return loginErrorDate;
    }

    public void setLoginErrorDate(Date loginErrorDate) {
        this.loginErrorDate = loginErrorDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public BigDecimal getFrozenPoints() {
        return frozenPoints;
    }

    public void setFrozenPoints(BigDecimal frozenPoints) {
        this.frozenPoints = frozenPoints;
    }

    public String getTruePic() {
        return truePic;
    }

    public void setTruePic(String truePic) {
        this.truePic = truePic == null ? null : truePic.trim();
    }

    public String getYibaoAccount() {
        return yibaoAccount;
    }

    public void setYibaoAccount(String yibaoAccount) {
        this.yibaoAccount = yibaoAccount == null ? null : yibaoAccount.trim();
    }

    public String getYibaoAccountInner() {
        return yibaoAccountInner;
    }

    public void setYibaoAccountInner(String yibaoAccountInner) {
        this.yibaoAccountInner = yibaoAccountInner == null ? null : yibaoAccountInner.trim();
    }

    public String getYibaoPwd() {
        return yibaoPwd;
    }

    public void setYibaoPwd(String yibaoPwd) {
        this.yibaoPwd = yibaoPwd == null ? null : yibaoPwd.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }
}