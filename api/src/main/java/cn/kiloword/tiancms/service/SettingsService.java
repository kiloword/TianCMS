/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.service;

import cn.kiloword.tiancms.common.enums.CacheType;
import cn.kiloword.tiancms.data.DatabaseType;

/**
 * @author Yun Fang
 *
 */
public interface SettingsService {
	public String getDatabaseConnectionString();

	public String getProductVersion();

	public String getContentRootPath();

	public String getJavaVersion();

	public String getPluginVersion();

	public DatabaseType getDatabaseType();

	public CacheType getCacheType();
}
