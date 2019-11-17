/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.common.api;

/**
 * @author Yun Fang
 *
 */
public class ActionResult<T> {
	private long code;
	private String message;
	private T data;

	protected ActionResult() {
	}

	protected ActionResult(long code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static <T> ActionResult<T> success(T data) {
		return new ActionResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
	}

	public static <T> ActionResult<T> forbidden(T data) {
		return new ActionResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
