/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.controller.model;

import java.util.List;

/**
 * @author Yun Fang
 *
 */
public class TryDatabaseResponse {
	private boolean success;
	private List<String> databaseNames;
	private String errorMessage;

	public TryDatabaseResponse(boolean success, List<String> databaseNames, String errorMessage) {
		this.success = success;
		this.databaseNames = databaseNames;
		this.errorMessage = errorMessage;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<String> getDatabaseNames() {
		return databaseNames;
	}

	public void setDatabaseNames(List<String> databaseNames) {
		this.databaseNames = databaseNames;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
