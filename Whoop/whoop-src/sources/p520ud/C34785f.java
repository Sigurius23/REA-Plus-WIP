package p520ud;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: ud.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C34785f {

    /* JADX INFO: renamed from: a */
    public final String f146478a;

    /* JADX INFO: renamed from: b */
    public final C34913b f146479b;

    /* JADX INFO: renamed from: c */
    public final String f146480c;

    /* JADX INFO: renamed from: d */
    public final String f146481d;

    public C34785f(C29662f c29662f) {
        String str = (String) c29662f.f121230x;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId");
        }
        this.f146478a = str;
        C34913b c34913b = (C34913b) c29662f.f121231y;
        if (c34913b == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiration");
        }
        this.f146479b = c34913b;
        String str2 = (String) c29662f.f121232z;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey");
        }
        this.f146480c = str2;
        String str3 = (String) c29662f.f121228E;
        if (str3 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken");
        }
        this.f146481d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34785f.class != obj.getClass()) {
            return false;
        }
        C34785f c34785f = (C34785f) obj;
        return AbstractC22676k.m65745e(this.f146478a, c34785f.f146478a) && AbstractC22676k.m65745e(this.f146479b, c34785f.f146479b) && AbstractC22676k.m65745e(this.f146480c, c34785f.f146480c) && AbstractC22676k.m65745e(this.f146481d, c34785f.f146481d);
    }

    public final int hashCode() {
        return this.f146481d.hashCode() + AbstractC11266d.m30450d(AbstractC21702c.m61131b(this.f146479b.f147018w, this.f146478a.hashCode() * 31, 31), 31, this.f146480c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Credentials(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("accessKeyId="), this.f146478a, DateTimeRange.lowerUpperDelimiter, sb4, "expiration=");
        sbM94768q.append(this.f146479b);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(new StringBuilder("sessionToken="), this.f146481d, sb4, ")");
    }
}
