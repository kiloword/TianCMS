/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.repository.impl;

import org.springframework.stereotype.Repository;

import cn.kiloword.tiancms.data.Database;
import cn.kiloword.tiancms.repository.ConfigRepository;

/**
 * @author Yun Fang
 *
 */
@Repository
public class ConfigRepositoryImpl implements ConfigRepository {

	@Override
	public Database getDatabase() {
		return new Database(null, null);
	}

}
