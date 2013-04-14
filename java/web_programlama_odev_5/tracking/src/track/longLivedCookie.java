package track;

import javax.servlet.http.*;

public class longLivedCookie extends Cookie {
	public static final int SECONDS_PER_YEAR = 60*60*24*365;
	public longLivedCookie(String name, String value) {
		super(name, value);
		setMaxAge(SECONDS_PER_YEAR);
	}
}