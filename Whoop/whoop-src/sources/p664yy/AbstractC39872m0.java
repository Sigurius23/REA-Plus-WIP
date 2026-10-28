package p664yy;

import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: renamed from: yy.m0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39872m0 {
    private Map<String, String> postHeaders;
    private final boolean shouldCache;

    public abstract Map getHeaders();

    public abstract EnumC39868k0 getMethod();

    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public abstract Iterable getRetryResponseCodes();

    public boolean getShouldCache() {
        return this.shouldCache;
    }

    public abstract String getUrl();

    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public void writePostBody(OutputStream outputStream) {
    }
}
