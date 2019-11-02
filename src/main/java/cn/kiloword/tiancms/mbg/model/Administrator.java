package cn.kiloword.tiancms.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Administrator implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String passwordSalt;

    private String icon;

    private String email;

    private String mobile;

    private String nickname;

    private String note;

    private Date createTime;

    private Date modifyTime;

    private Date lastLoginTime;

    private Integer countOfLogin;

    private Integer countOfFailedLogin;

    private String creatorName;

    private Boolean lockedOut;

    private Long departmentId;

    private Long areaId;

    private String siteIdSet;

    private Long siteId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getCountOfLogin() {
        return countOfLogin;
    }

    public void setCountOfLogin(Integer countOfLogin) {
        this.countOfLogin = countOfLogin;
    }

    public Integer getCountOfFailedLogin() {
        return countOfFailedLogin;
    }

    public void setCountOfFailedLogin(Integer countOfFailedLogin) {
        this.countOfFailedLogin = countOfFailedLogin;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Boolean getLockedOut() {
        return lockedOut;
    }

    public void setLockedOut(Boolean lockedOut) {
        this.lockedOut = lockedOut;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getSiteIdSet() {
        return siteIdSet;
    }

    public void setSiteIdSet(String siteIdSet) {
        this.siteIdSet = siteIdSet;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", passwordSalt=").append(passwordSalt);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", nickname=").append(nickname);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", countOfLogin=").append(countOfLogin);
        sb.append(", countOfFailedLogin=").append(countOfFailedLogin);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", lockedOut=").append(lockedOut);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", areaId=").append(areaId);
        sb.append(", siteIdSet=").append(siteIdSet);
        sb.append(", siteId=").append(siteId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}