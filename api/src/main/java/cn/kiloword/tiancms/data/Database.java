/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.data;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yun Fang
 *
 */
public class Database implements IDatabase {
	private String databaseName;

	public Database(DatabaseType databaseType, String connectionString) {
	}

	public String getDatabaseName() {
		return databaseName;
	}

	@Override
	public boolean isConnectionWorks() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> getDatabaseNames() {
		// TODO Auto-generated method stub
		return Arrays.asList("tiancms");
	}
}
