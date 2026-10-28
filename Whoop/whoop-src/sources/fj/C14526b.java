package fj;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fj.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14526b {

    /* JADX INFO: renamed from: a */
    public final String f53076a;

    /* JADX INFO: renamed from: b */
    public final String f53077b;

    /* JADX INFO: renamed from: c */
    public final Map f53078c;

    public C14526b(String str, String str2, Map userProperties) {
        AbstractC22676k.m65750j(userProperties, "userProperties");
        this.f53076a = str;
        this.f53077b = str2;
        this.f53078c = userProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14526b)) {
            return false;
        }
        C14526b c14526b = (C14526b) obj;
        return AbstractC22676k.m65745e(this.f53076a, c14526b.f53076a) && AbstractC22676k.m65745e(this.f53077b, c14526b.f53077b) && AbstractC22676k.m65745e(this.f53078c, c14526b.f53078c);
    }

    public final int hashCode() {
        String str = this.f53076a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f53077b;
        return this.f53078c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Identity(userId=");
        sb4.append((Object) this.f53076a);
        sb4.append(", deviceId=");
        sb4.append((Object) this.f53077b);
        sb4.append(", userProperties=");
        return AbstractC30802r.m94764m(sb4, this.f53078c, ')');
    }

    public /* synthetic */ C14526b(String str, String str2, int i13) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, C25272z.f99163w);
    }
}
