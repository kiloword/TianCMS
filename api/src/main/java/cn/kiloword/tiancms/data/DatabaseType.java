/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.data;

import java.util.Objects;

/**
 * @author Yun Fang
 *
 */
public class DatabaseType {
	private DatabaseType(String value) {
		Objects.requireNonNull(value);
		this.value = value;
	}

	private String value;

	public String getValue() {
		return value;
	}

	public static final DatabaseType MYSQL = new DatabaseType("MySql");
	public static final DatabaseType SQLSERVER = new DatabaseType("SqlServer");
	public static final DatabaseType POSTGRESQL = new DatabaseType("PostgreSql");
	public static final DatabaseType ORACLE = new DatabaseType("Oracle");
	public static final DatabaseType SQLITE = new DatabaseType("SQLite");

	public static DatabaseType parse(String databaseType) {
		DatabaseType retVal = MYSQL;

		if (databaseType.equalsIgnoreCase(SQLSERVER.value)) {
			retVal = SQLSERVER;
		} else if (databaseType.equalsIgnoreCase(POSTGRESQL.value)) {
			retVal = POSTGRESQL;
		} else if (databaseType.equalsIgnoreCase(ORACLE.value)) {
			retVal = ORACLE;
		} else if (databaseType.equalsIgnoreCase(SQLITE.value)) {
			retVal = SQLITE;
		}
		return retVal;
	}
}
