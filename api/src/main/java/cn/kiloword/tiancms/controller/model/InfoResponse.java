/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.controller.model;

import java.util.Date;

/**
 * @author Yun Fang
 *
 */
public class InfoResponse {
	private boolean installed;
	private String apiUrl;
	private String apiServerName;
	private String productVersion;
	private String javaVersion;
	private String contentRootPath;
	private String webRootPath;
	private boolean contentRootPathWritable;
	private boolean webRootPathWritable;
	private String remoteIpAddress;
	private String pluginVersion;
	private Date updateDate;
	private String databaseType;
	private String database;
	private String cacheType;

	public InfoResponse(boolean installed, String apiUrl, String apiServerName, String productVersion,
			String javaVersion, String contentRootPath, String webRootPath, boolean contentRootPathWritable,
			boolean webRootPathWritable, String remoteIpAddress, String pluginVersion, Date updateDate,
			String databaseType, String database, String cacheType) {
		this.installed = installed;
		this.apiUrl = apiUrl;
		this.apiServerName = apiServerName;
		this.productVersion = productVersion;
		this.javaVersion = javaVersion;
		this.contentRootPath = contentRootPath;
		this.webRootPath = webRootPath;
		this.contentRootPathWritable = contentRootPathWritable;
		this.webRootPathWritable = webRootPathWritable;
		this.remoteIpAddress = remoteIpAddress;
		this.pluginVersion = pluginVersion;
		this.updateDate = updateDate;
		this.databaseType = databaseType;
		this.database = database;
		this.cacheType = cacheType;
	}

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiServerName() {
		return apiServerName;
	}

	public void setApiServerName(String apiServerName) {
		this.apiServerName = apiServerName;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getContentRootPath() {
		return contentRootPath;
	}

	public void setContentRootPath(String contentRootPath) {
		this.contentRootPath = contentRootPath;
	}

	public String getWebRootPath() {
		return webRootPath;
	}

	public void setWebRootPath(String webRootPath) {
		this.webRootPath = webRootPath;
	}

	public boolean isContentRootPathWritable() {
		return contentRootPathWritable;
	}

	public void setContentRootPathWritable(boolean contentRootPathWritable) {
		this.contentRootPathWritable = contentRootPathWritable;
	}

	public boolean isWebRootPathWritable() {
		return webRootPathWritable;
	}

	public void setWebRootPathWritable(boolean webRootPathWritable) {
		this.webRootPathWritable = webRootPathWritable;
	}

	public String getRemoteIpAddress() {
		return remoteIpAddress;
	}

	public void setRemoteIpAddress(String remoteIpAddress) {
		this.remoteIpAddress = remoteIpAddress;
	}

	public String getPluginVersion() {
		return pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getCacheType() {
		return cacheType;
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}
}
