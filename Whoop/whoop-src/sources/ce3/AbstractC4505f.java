package ce3;

import com.mapbox.common.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4505f {

    /* JADX INFO: renamed from: a */
    public static final C4500c[] f18152a;

    /* JADX INFO: renamed from: b */
    public static final Map f18153b;

    static {
        C4500c c4500c = new C4500c("", C4500c.f18130i);
        C26624l c26624l = C4500c.f18127f;
        C4500c c4500c2 = new C4500c("GET", c26624l);
        C4500c c4500c3 = new C4500c("POST", c26624l);
        C26624l c26624l2 = C4500c.f18128g;
        C4500c c4500c4 = new C4500c("/", c26624l2);
        C4500c c4500c5 = new C4500c("/index.html", c26624l2);
        C26624l c26624l3 = C4500c.f18129h;
        C4500c c4500c6 = new C4500c("http", c26624l3);
        C4500c c4500c7 = new C4500c("https", c26624l3);
        C26624l c26624l4 = C4500c.f18126e;
        C4500c[] c4500cArr = {c4500c, c4500c2, c4500c3, c4500c4, c4500c5, c4500c6, c4500c7, new C4500c("200", c26624l4), new C4500c("204", c26624l4), new C4500c("206", c26624l4), new C4500c("304", c26624l4), new C4500c("400", c26624l4), new C4500c("404", c26624l4), new C4500c("500", c26624l4), new C4500c("accept-charset", ""), new C4500c("accept-encoding", "gzip, deflate"), new C4500c("accept-language", ""), new C4500c("accept-ranges", ""), new C4500c(HttpHeaders.ACCEPT, ""), new C4500c("access-control-allow-origin", ""), new C4500c(HttpHeaders.AGE, ""), new C4500c("allow", ""), new C4500c("authorization", ""), new C4500c(HttpHeaders.CACHE_CONTROL, ""), new C4500c("content-disposition", ""), new C4500c(HttpHeaders.CONTENT_ENCODING, ""), new C4500c("content-language", ""), new C4500c(HttpHeaders.CONTENT_LENGTH, ""), new C4500c("content-location", ""), new C4500c("content-range", ""), new C4500c(HttpHeaders.CONTENT_TYPE, ""), new C4500c("cookie", ""), new C4500c(HttpHeaders.DATE, ""), new C4500c(HttpHeaders.ETAG, ""), new C4500c("expect", ""), new C4500c("expires", ""), new C4500c("from", ""), new C4500c("host", ""), new C4500c("if-match", ""), new C4500c("if-modified-since", ""), new C4500c(HttpHeaders.IF_NONE_MATCH, ""), new C4500c("if-range", ""), new C4500c("if-unmodified-since", ""), new C4500c(HttpHeaders.LAST_MODIFIED, ""), new C4500c("link", ""), new C4500c("location", ""), new C4500c("max-forwards", ""), new C4500c("proxy-authenticate", ""), new C4500c("proxy-authorization", ""), new C4500c("range", ""), new C4500c("referer", ""), new C4500c("refresh", ""), new C4500c(HttpHeaders.RETRY_AFTER, ""), new C4500c("server", ""), new C4500c("set-cookie", ""), new C4500c("strict-transport-security", ""), new C4500c("transfer-encoding", ""), new C4500c(HttpHeaders.USER_AGENT, ""), new C4500c("vary", ""), new C4500c("via", ""), new C4500c("www-authenticate", "")};
        f18152a = c4500cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i13 = 0; i13 < 61; i13++) {
            if (!linkedHashMap.containsKey(c4500cArr[i13].f18131a)) {
                linkedHashMap.put(c4500cArr[i13].f18131a, Integer.valueOf(i13));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(...)");
        f18153b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m14126a(C26624l name) throws IOException {
        AbstractC22676k.m65750j(name, "name");
        int iMo79253d = name.mo79253d();
        for (int i13 = 0; i13 < iMo79253d; i13++) {
            byte bMo79257i = name.mo79257i(i13);
            if (65 <= bMo79257i && bMo79257i < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.m79265s()));
            }
        }
    }
}
