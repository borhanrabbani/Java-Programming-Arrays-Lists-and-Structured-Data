package third.week.counting.website.visit;

import java.util.Date;

public class LogEntryMap {
	
	private String ipAddress;
	private Date accessTime;
	private String request;
	private int statusCode;
	private int bytesReturned;
	
	public LogEntryMap(String ip, Date time, String req, int status, int bytes) {
		ipAddress = ip;
		accessTime = time;
		request = req;
		statusCode = status;
		bytesReturned = bytes;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public String getRequest() {
		return request;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public int getBytesReturned() {
		return bytesReturned;
	}

	@Override
	public String toString() {
		return "LogEntry [ipAddress=" + ipAddress + ", accessTime=" + accessTime + ", request=" + request
				+ ", statusCode=" + statusCode + ", bytesReturned=" + bytesReturned + "]";
	}
	

}
