package com.kaldit.tutor.controller.access;

import javax.servlet.http.HttpServletRequest;

public class ClientCheck {
    public static boolean ipCheck(HttpServletRequest request){
        System.out.println(request.getRemoteUser());
        return true;
    }
}
