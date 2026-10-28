package p162g0;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p208i2.C17919x;

/* JADX INFO: renamed from: g0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14926c {

    /* JADX INFO: renamed from: a */
    public final long f55623a;

    /* JADX INFO: renamed from: b */
    public final long f55624b;

    /* JADX INFO: renamed from: c */
    public final long f55625c;

    /* JADX INFO: renamed from: d */
    public final long f55626d;

    /* JADX INFO: renamed from: e */
    public final long f55627e;

    public C14926c(long j7, long j13, long j14, long j15, long j16) {
        this.f55623a = j7;
        this.f55624b = j13;
        this.f55625c = j14;
        this.f55626d = j15;
        this.f55627e = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14926c)) {
            return false;
        }
        C14926c c14926c = (C14926c) obj;
        return C17919x.m51542d(this.f55623a, c14926c.f55623a) && C17919x.m51542d(this.f55624b, c14926c.f55624b) && C17919x.m51542d(this.f55625c, c14926c.f55625c) && C17919x.m51542d(this.f55626d, c14926c.f55626d) && C17919x.m51542d(this.f55627e, c14926c.f55627e);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f55627e) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f55623a) * 31, this.f55624b, 31), this.f55625c, 31), this.f55626d, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC13673n.m38574u(this.f55623a, ", textColor=", sb4);
        AbstractC13673n.m38574u(this.f55624b, ", iconColor=", sb4);
        AbstractC13673n.m38574u(this.f55625c, ", disabledTextColor=", sb4);
        AbstractC13673n.m38574u(this.f55626d, ", disabledIconColor=", sb4);
        sb4.append((Object) C17919x.m51548j(this.f55627e));
        sb4.append(')');
        return sb4.toString();
    }
}
