package p437qt;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: qt.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30578a {

    /* JADX INFO: renamed from: a */
    public final String f125820a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f125821b;

    public C30578a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f125820a = str;
        this.f125821b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static C30578a m93810a(String str, ArrayList arrayList) {
        return new C30578a(str, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final List m93811b() {
        return this.f125821b;
    }

    /* JADX INFO: renamed from: c */
    public final String m93812c() {
        return this.f125820a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30578a)) {
            return false;
        }
        C30578a c30578a = (C30578a) obj;
        return this.f125820a.equals(c30578a.f125820a) && this.f125821b.equals(c30578a.f125821b);
    }

    public final int hashCode() {
        return ((this.f125820a.hashCode() ^ 1000003) * 1000003) ^ this.f125821b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f125820a + ", usedDates=" + this.f125821b + "}";
    }
}
