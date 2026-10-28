package p674z8;

import android.net.Uri;
import ih0.AbstractC18489d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p516u8.AbstractC34628y;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: z8.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C40171g {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f173342i = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f173343a;

    /* JADX INFO: renamed from: b */
    public final int f173344b;

    /* JADX INFO: renamed from: c */
    public final byte[] f173345c;

    /* JADX INFO: renamed from: d */
    public final Map f173346d;

    /* JADX INFO: renamed from: e */
    public final long f173347e;

    /* JADX INFO: renamed from: f */
    public final long f173348f;

    /* JADX INFO: renamed from: g */
    public final String f173349g;

    /* JADX INFO: renamed from: h */
    public final int f173350h;

    static {
        AbstractC34628y.m109420a("media3.datasource");
    }

    public C40171g(Uri uri, int i13, byte[] bArr, Map map, long j7, long j13, String str, int i14) {
        AbstractC35849g.m113802d(j7 >= 0);
        AbstractC35849g.m113802d(j7 >= 0);
        AbstractC35849g.m113802d(j13 > 0 || j13 == -1);
        uri.getClass();
        this.f173343a = uri;
        this.f173344b = i13;
        this.f173345c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f173346d = Collections.unmodifiableMap(new HashMap(map));
        this.f173347e = j7;
        this.f173348f = j13;
        this.f173349g = str;
        this.f173350h = i14;
    }

    /* JADX INFO: renamed from: a */
    public final C40171g m128887a(long j7) {
        long j13 = this.f173348f;
        long j14 = j13 != -1 ? j13 - j7 : -1L;
        if (j7 == 0 && j13 == j14) {
            return this;
        }
        return new C40171g(this.f173343a, this.f173344b, this.f173345c, this.f173346d, this.f173347e + j7, j14, this.f173349g, this.f173350h);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("DataSpec[");
        int i13 = this.f173344b;
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
        sb4.append(str);
        sb4.append(" ");
        sb4.append(this.f173343a);
        sb4.append(", ");
        sb4.append(this.f173347e);
        sb4.append(", ");
        sb4.append(this.f173348f);
        sb4.append(", ");
        sb4.append(this.f173349g);
        sb4.append(", ");
        return AbstractC18489d0.m53371l(sb4, this.f173350h, "]");
    }
}
