package retrofit2;

import java.util.Objects;
import pg3.C29218v0;
import ud3.C34850x0;

/* JADX INFO: loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final int f128920w;

    /* JADX INFO: renamed from: x */
    public final String f128921x;

    /* JADX INFO: renamed from: y */
    public final transient C29218v0 f128922y;

    public HttpException(C29218v0 c29218v0) {
        Objects.requireNonNull(c29218v0, "response == null");
        StringBuilder sb4 = new StringBuilder("HTTP ");
        C34850x0 c34850x0 = c29218v0.f118269a;
        sb4.append(c34850x0.f146792z);
        sb4.append(" ");
        sb4.append(c34850x0.f146791y);
        super(sb4.toString());
        this.f128920w = c34850x0.f146792z;
        this.f128921x = c34850x0.f146791y;
        this.f128922y = c29218v0;
    }
}
