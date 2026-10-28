package p284ko;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p031b9.AbstractC2875y;
import p309lo.AbstractC24543a;
import p465rm.AbstractC31515a0;

/* JADX INFO: renamed from: ko.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C22630n {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f89018h = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f89019a;

    /* JADX INFO: renamed from: b */
    public final int f89020b;

    /* JADX INFO: renamed from: c */
    public final byte[] f89021c;

    /* JADX INFO: renamed from: d */
    public final Map f89022d;

    /* JADX INFO: renamed from: e */
    public final long f89023e;

    /* JADX INFO: renamed from: f */
    public final long f89024f;

    /* JADX INFO: renamed from: g */
    public final int f89025g;

    static {
        AbstractC31515a0.m97109a("goog.exo.datasource");
    }

    public C22630n(Uri uri, int i13, byte[] bArr, Map map, long j7, long j13, int i14) {
        AbstractC24543a.m71569e(j7 >= 0);
        AbstractC24543a.m71569e(j7 >= 0);
        AbstractC24543a.m71569e(j13 > 0 || j13 == -1);
        this.f89019a = uri;
        this.f89020b = i13;
        this.f89021c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f89022d = Collections.unmodifiableMap(new HashMap(map));
        this.f89023e = j7;
        this.f89024f = j13;
        this.f89025g = i14;
    }

    public final String toString() {
        String str;
        int i13 = this.f89020b;
        if (i13 == 1) {
            str = "GET";
        } else if (i13 == 2) {
            str = "POST";
        } else {
            if (i13 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        String strValueOf = String.valueOf(this.f89019a);
        StringBuilder sb4 = new StringBuilder("null".length() + strValueOf.length() + str.length() + 70);
        sb4.append("DataSpec[");
        sb4.append(str);
        sb4.append(" ");
        sb4.append(strValueOf);
        AbstractC2875y.m8285A(sb4, ", ", this.f89023e, ", ");
        sb4.append(this.f89024f);
        sb4.append(", null, ");
        sb4.append(this.f89025g);
        sb4.append("]");
        return sb4.toString();
    }
}
