package p428qk;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C30438a {

    /* JADX INFO: renamed from: a */
    public final String f125060a;

    /* JADX INFO: renamed from: b */
    public final String f125061b;

    public C30438a(String str, String str2) {
        this.f125060a = str;
        this.f125061b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30438a)) {
            return false;
        }
        C30438a c30438a = (C30438a) obj;
        return AbstractC22676k.m65745e(this.f125060a, c30438a.f125060a) && AbstractC22676k.m65745e(this.f125061b, c30438a.f125061b);
    }

    public final int hashCode() {
        String str = this.f125060a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f125061b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Identity(userId=");
        sb4.append(this.f125060a);
        sb4.append(", deviceId=");
        return AbstractC25012a.m73377j(sb4, this.f125061b, ')');
    }
}
