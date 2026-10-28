package io.sentry.util;

import io.sentry.C20407l0;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.util.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20580b {

    /* JADX INFO: renamed from: a */
    public static final C20407l0 f77080a;

    /* JADX INFO: renamed from: b */
    public static final C20407l0 f77081b;

    static {
        Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        f77080a = new C20407l0(400, 499);
        f77081b = new C20407l0(500, 599);
    }
}
