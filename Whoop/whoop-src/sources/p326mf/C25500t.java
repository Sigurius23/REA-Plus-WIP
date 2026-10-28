package p326mf;

import androidx.core.app.FrameMetricsAggregator;
import l83.C23465k;
import m83.AbstractC25247g0;

/* JADX INFO: renamed from: mf.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C25500t {

    /* JADX INFO: renamed from: c */
    public static final C25500t f99849c;

    /* JADX INFO: renamed from: d */
    public static final C25500t f99850d;

    /* JADX INFO: renamed from: e */
    public static final C25500t f99851e;

    /* JADX INFO: renamed from: f */
    public static final C25500t f99852f;

    /* JADX INFO: renamed from: g */
    public static final C25500t f99853g;

    /* JADX INFO: renamed from: h */
    public static final C25500t f99854h;

    /* JADX INFO: renamed from: i */
    public static final Object f99855i;

    /* JADX INFO: renamed from: a */
    public final int f99856a;

    /* JADX INFO: renamed from: b */
    public final String f99857b;

    static {
        C25500t c25500t = new C25500t(100, "Continue");
        C25500t c25500t2 = new C25500t(101, "Switching Protocols");
        C25500t c25500t3 = new C25500t(102, "Processing");
        C25500t c25500t4 = new C25500t(200, "OK");
        f99849c = c25500t4;
        C25500t c25500t5 = new C25500t(201, "Created");
        C25500t c25500t6 = new C25500t(202, "Accepted");
        C25500t c25500t7 = new C25500t(203, "Non-Authoritative Information");
        C25500t c25500t8 = new C25500t(204, "No Content");
        C25500t c25500t9 = new C25500t(205, "Reset Content");
        C25500t c25500t10 = new C25500t(206, "Partial Content");
        C25500t c25500t11 = new C25500t(207, "Multi-Status");
        C25500t c25500t12 = new C25500t(300, "Multiple Choices");
        C25500t c25500t13 = new C25500t(301, "Moved Permanently");
        C25500t c25500t14 = new C25500t(302, "Found");
        C25500t c25500t15 = new C25500t(303, "See Other");
        C25500t c25500t16 = new C25500t(304, "Not Modified");
        C25500t c25500t17 = new C25500t(305, "Use Proxy");
        C25500t c25500t18 = new C25500t(307, "Temporary Redirect");
        C25500t c25500t19 = new C25500t(308, "Permanent Redirect");
        C25500t c25500t20 = new C25500t(400, "Bad Request");
        C25500t c25500t21 = new C25500t(401, "Unauthorized");
        f99850d = c25500t21;
        C25500t c25500t22 = new C25500t(402, "Payment Required");
        C25500t c25500t23 = new C25500t(403, "Forbidden");
        f99851e = c25500t23;
        C25500t c25500t24 = new C25500t(404, "Not Found");
        f99852f = c25500t24;
        C25500t c25500t25 = new C25500t(405, "Method Not Allowed");
        C25500t c25500t26 = new C25500t(406, "Not Acceptable");
        C25500t c25500t27 = new C25500t(407, "Proxy Authentication Required");
        C25500t c25500t28 = new C25500t(408, "Request Timeout");
        C25500t c25500t29 = new C25500t(409, "Conflict");
        C25500t c25500t30 = new C25500t(410, "Gone");
        C25500t c25500t31 = new C25500t(411, "Length Required");
        C25500t c25500t32 = new C25500t(412, "Precondition Failed");
        C25500t c25500t33 = new C25500t(413, "Payload Too Large");
        C25500t c25500t34 = new C25500t(414, "Request-URI Too Long");
        C25500t c25500t35 = new C25500t(415, "Unsupported Media Type");
        C25500t c25500t36 = new C25500t(416, "Requested Range Not Satisfiable");
        C25500t c25500t37 = new C25500t(417, "Expectation Failed");
        C25500t c25500t38 = new C25500t(422, "Unprocessable Entity");
        C25500t c25500t39 = new C25500t(423, "Locked");
        C25500t c25500t40 = new C25500t(424, "Failed Dependency");
        C25500t c25500t41 = new C25500t(425, "Too Early");
        C25500t c25500t42 = new C25500t(426, "Upgrade Required");
        C25500t c25500t43 = new C25500t(428, "Precondition Required");
        C25500t c25500t44 = new C25500t(429, "Too Many Requests");
        f99853g = c25500t44;
        C25500t c25500t45 = new C25500t(431, "Request Header Fields Too Large");
        C25500t c25500t46 = new C25500t(451, "Unavailable For Legal Reason");
        C25500t c25500t47 = new C25500t(500, "Internal Server Error");
        f99854h = c25500t47;
        f99855i = AbstractC25247g0.m73990Y(new C23465k(100, c25500t), new C23465k(101, c25500t2), new C23465k(102, c25500t3), new C23465k(200, c25500t4), new C23465k(201, c25500t5), new C23465k(202, c25500t6), new C23465k(203, c25500t7), new C23465k(204, c25500t8), new C23465k(205, c25500t9), new C23465k(206, c25500t10), new C23465k(207, c25500t11), new C23465k(300, c25500t12), new C23465k(301, c25500t13), new C23465k(302, c25500t14), new C23465k(303, c25500t15), new C23465k(304, c25500t16), new C23465k(305, c25500t17), new C23465k(307, c25500t18), new C23465k(308, c25500t19), new C23465k(400, c25500t20), new C23465k(401, c25500t21), new C23465k(402, c25500t22), new C23465k(403, c25500t23), new C23465k(404, c25500t24), new C23465k(405, c25500t25), new C23465k(406, c25500t26), new C23465k(407, c25500t27), new C23465k(408, c25500t28), new C23465k(409, c25500t29), new C23465k(410, c25500t30), new C23465k(411, c25500t31), new C23465k(412, c25500t32), new C23465k(413, c25500t33), new C23465k(414, c25500t34), new C23465k(415, c25500t35), new C23465k(416, c25500t36), new C23465k(417, c25500t37), new C23465k(422, c25500t38), new C23465k(423, c25500t39), new C23465k(424, c25500t40), new C23465k(425, c25500t41), new C23465k(426, c25500t42), new C23465k(428, c25500t43), new C23465k(429, c25500t44), new C23465k(431, c25500t45), new C23465k(451, c25500t46), new C23465k(500, c25500t47), new C23465k(501, new C25500t(501, "Not Implemented")), new C23465k(502, new C25500t(502, "Bad Gateway")), new C23465k(503, new C25500t(503, "Service Unavailable")), new C23465k(504, new C25500t(504, "Gateway Timeout")), new C23465k(505, new C25500t(505, "HTTP Version Not Supported")), new C23465k(506, new C25500t(506, "Variant Also Negotiates")), new C23465k(507, new C25500t(507, "Insufficient Storage")), new C23465k(508, new C25500t(508, "Loop Detected")), new C23465k(510, new C25500t(510, "Not Extended")), new C23465k(Integer.valueOf(FrameMetricsAggregator.EVERY_DURATION), new C25500t(FrameMetricsAggregator.EVERY_DURATION, "Network Authentication Required")));
    }

    public C25500t(int i13, String str) {
        this.f99856a = i13;
        this.f99857b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m74906a() {
        return this.f99856a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C25500t) && ((C25500t) obj).f99856a == this.f99856a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99856a);
    }

    public final String toString() {
        return this.f99856a + ": " + this.f99857b;
    }
}
