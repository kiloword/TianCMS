/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.common.enums;

/**
 * @author Yun Fang
 *
 */
public enum CacheType {
	Memory("Memory"), //
	Redis("Redis"), //
	Database("Database");

	private String value;

	private CacheType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
