package com.taotao.common.model;

/**
 * kindeditor上传文件返回的对象
 * @author admin
 *
 */
public class KindEditorUpLoadResult {
	/**
	 * 0=成功  1=失败
	 */
	private Integer error;
	private String url;
	private String message;
	
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public KindEditorUpLoadResult(Integer error, String url, String message) {
		this.error = error;
		this.url = url;
		this.message = message;
	}
	@Override
	public String toString() {
		return "KindEditorUpLoadResult [error=" + error + ", url=" + url + ", message=" + message + "]";
	}
	
}
