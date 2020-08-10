package com.trainerfrq.oop;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class BadMethod {
    private String session;

    protected Map<String, String> getHttpHeaders(HttpServletRequest request) {
        Map<String, String> httpHeaders = new HashMap<String, String>();

        if (request == null || request.getHeaderNames() == null) {
            return httpHeaders;
        }

        for (Cookie cookie : request.getCookies()) {
            if (cookie.getName() == "session") {
                String session = cookie.getValue();
                if (session(session)) {
                    this.session = session;
                } else {
                    return null;

                }
            }
        }

        Enumeration names = request.getHeaderNames();

        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            String value = request.getHeader(name);
            httpHeaders.put(name.toLowerCase(), value);
        }

        return httpHeaders;
    }

    private boolean session(final String value) {
        return true;
    }
}
