package i63;

import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i63.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C18183v {

    /* JADX INFO: renamed from: c */
    public static final C18183v f70524c;

    /* JADX INFO: renamed from: d */
    public static final C18183v f70525d;

    /* JADX INFO: renamed from: e */
    public static final C18183v f70526e;

    /* JADX INFO: renamed from: f */
    public static final C18183v f70527f;

    /* JADX INFO: renamed from: g */
    public static final C18183v f70528g;

    /* JADX INFO: renamed from: h */
    public static final C18183v f70529h;

    /* JADX INFO: renamed from: a */
    public final int f70530a;

    /* JADX INFO: renamed from: b */
    public final String f70531b;

    static {
        C18183v c18183v = new C18183v(100, "Continue");
        C18183v c18183v2 = new C18183v(101, "Switching Protocols");
        C18183v c18183v3 = new C18183v(102, "Processing");
        C18183v c18183v4 = new C18183v(200, "OK");
        C18183v c18183v5 = new C18183v(201, "Created");
        C18183v c18183v6 = new C18183v(202, "Accepted");
        C18183v c18183v7 = new C18183v(203, "Non-Authoritative Information");
        C18183v c18183v8 = new C18183v(204, "No Content");
        C18183v c18183v9 = new C18183v(205, "Reset Content");
        C18183v c18183v10 = new C18183v(206, "Partial Content");
        C18183v c18183v11 = new C18183v(207, "Multi-Status");
        C18183v c18183v12 = new C18183v(300, "Multiple Choices");
        C18183v c18183v13 = new C18183v(301, "Moved Permanently");
        f70524c = c18183v13;
        C18183v c18183v14 = new C18183v(302, "Found");
        f70525d = c18183v14;
        C18183v c18183v15 = new C18183v(303, "See Other");
        f70526e = c18183v15;
        C18183v c18183v16 = new C18183v(304, "Not Modified");
        C18183v c18183v17 = new C18183v(305, "Use Proxy");
        C18183v c18183v18 = new C18183v(306, "Switch Proxy");
        C18183v c18183v19 = new C18183v(307, "Temporary Redirect");
        f70527f = c18183v19;
        C18183v c18183v20 = new C18183v(308, "Permanent Redirect");
        f70528g = c18183v20;
        C18183v c18183v21 = new C18183v(400, "Bad Request");
        C18183v c18183v22 = new C18183v(401, "Unauthorized");
        C18183v c18183v23 = new C18183v(402, "Payment Required");
        C18183v c18183v24 = new C18183v(403, "Forbidden");
        C18183v c18183v25 = new C18183v(404, "Not Found");
        f70529h = c18183v25;
        List listM118959K = AbstractC37056f.m118959K(c18183v, c18183v2, c18183v3, c18183v4, c18183v5, c18183v6, c18183v7, c18183v8, c18183v9, c18183v10, c18183v11, c18183v12, c18183v13, c18183v14, c18183v15, c18183v16, c18183v17, c18183v18, c18183v19, c18183v20, c18183v21, c18183v22, c18183v23, c18183v24, c18183v25, new C18183v(405, "Method Not Allowed"), new C18183v(406, "Not Acceptable"), new C18183v(407, "Proxy Authentication Required"), new C18183v(408, "Request Timeout"), new C18183v(409, "Conflict"), new C18183v(410, "Gone"), new C18183v(411, "Length Required"), new C18183v(412, "Precondition Failed"), new C18183v(413, "Payload Too Large"), new C18183v(414, "Request-URI Too Long"), new C18183v(415, "Unsupported Media Type"), new C18183v(416, "Requested Range Not Satisfiable"), new C18183v(417, "Expectation Failed"), new C18183v(422, "Unprocessable Entity"), new C18183v(423, "Locked"), new C18183v(424, "Failed Dependency"), new C18183v(426, "Upgrade Required"), new C18183v(429, "Too Many Requests"), new C18183v(431, "Request Header Fields Too Large"), new C18183v(500, "Internal Server Error"), new C18183v(501, "Not Implemented"), new C18183v(502, "Bad Gateway"), new C18183v(503, "Service Unavailable"), new C18183v(504, "Gateway Timeout"), new C18183v(505, "HTTP Version Not Supported"), new C18183v(506, "Variant Also Negotiates"), new C18183v(507, "Insufficient Storage"));
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM118959K, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : listM118959K) {
            linkedHashMap.put(Integer.valueOf(((C18183v) obj).f70530a), obj);
        }
    }

    public C18183v(int i13, String description) {
        AbstractC22676k.m65750j(description, "description");
        this.f70530a = i13;
        this.f70531b = description;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18183v) && ((C18183v) obj).f70530a == this.f70530a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70530a);
    }

    public final String toString() {
        return this.f70530a + ' ' + this.f70531b;
    }
}
