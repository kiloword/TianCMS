/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.service.impl;

import org.springframework.stereotype.Service;

import cn.kiloword.tiancms.common.enums.CacheType;
import cn.kiloword.tiancms.data.DatabaseType;
import cn.kiloword.tiancms.service.SettingsService;

/**
 * @author Yun Fang
 *
 */
@Service
public class SettingsServiceImpl implements SettingsService {

	@Override
	public String getDatabaseConnectionString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContentRootPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJavaVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPluginVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseType getDatabaseType() {
		// TODO Auto-generated method stub
		return DatabaseType.MYSQL;
	}

	@Override
	public CacheType getCacheType() {
		// TODO Auto-generated method stub
		return CacheType.Memory;
	}

}
