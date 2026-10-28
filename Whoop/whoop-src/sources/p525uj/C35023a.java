package p525uj;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p208i2.C17919x;

/* JADX INFO: renamed from: uj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35023a {

    /* JADX INFO: renamed from: a */
    public final long f148203a;

    /* JADX INFO: renamed from: b */
    public final long f148204b;

    /* JADX INFO: renamed from: c */
    public final long f148205c;

    /* JADX INFO: renamed from: d */
    public final long f148206d;

    public C35023a(long j7, long j13, long j14, long j15) {
        this.f148203a = j7;
        this.f148204b = j13;
        this.f148205c = j14;
        this.f148206d = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35023a)) {
            return false;
        }
        C35023a c35023a = (C35023a) obj;
        return C17919x.m51542d(this.f148203a, c35023a.f148203a) && C17919x.m51542d(this.f148204b, c35023a.f148204b) && C17919x.m51542d(this.f148205c, c35023a.f148205c) && C17919x.m51542d(this.f148206d, c35023a.f148206d);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f148206d) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f148203a) * 31, this.f148204b, 31), this.f148205c, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ButtonColors(background=");
        AbstractC13673n.m38574u(this.f148203a, ", border=", sb4);
        AbstractC13673n.m38574u(this.f148204b, ", content=", sb4);
        AbstractC13673n.m38574u(this.f148205c, ", shadow=", sb4);
        sb4.append((Object) C17919x.m51548j(this.f148206d));
        sb4.append(')');
        return sb4.toString();
    }
}
