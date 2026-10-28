package p197hj;

import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hj.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17320c {

    /* JADX INFO: renamed from: a */
    public String f67097a;

    /* JADX INFO: renamed from: b */
    public String f67098b;

    /* JADX INFO: renamed from: c */
    public Map f67099c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17320c)) {
            return false;
        }
        C17320c c17320c = (C17320c) obj;
        return AbstractC22676k.m65745e(this.f67097a, c17320c.f67097a) && AbstractC22676k.m65745e(this.f67098b, c17320c.f67098b) && AbstractC22676k.m65745e(this.f67099c, c17320c.f67099c);
    }

    public final int hashCode() {
        String str = this.f67097a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67098b;
        return this.f67099c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AmplitudeEndUser(userId=");
        sb4.append(this.f67097a);
        sb4.append(", deviceId=");
        sb4.append(this.f67098b);
        sb4.append(", userProperties=");
        return AbstractC30802r.m94764m(sb4, this.f67099c, ')');
    }
}
