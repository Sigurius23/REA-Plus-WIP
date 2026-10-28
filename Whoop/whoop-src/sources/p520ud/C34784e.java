package p520ud;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p141f9.C14279u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C34784e {

    /* JADX INFO: renamed from: a */
    public final String f146476a;

    /* JADX INFO: renamed from: b */
    public final String f146477b;

    public C34784e(C14279u c14279u) {
        String str = c14279u.f52138b;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for arn");
        }
        this.f146476a = str;
        String str2 = c14279u.f52139c;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for assumedRoleId");
        }
        this.f146477b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34784e.class != obj.getClass()) {
            return false;
        }
        C34784e c34784e = (C34784e) obj;
        return AbstractC22676k.m65745e(this.f146476a, c34784e.f146476a) && AbstractC22676k.m65745e(this.f146477b, c34784e.f146477b);
    }

    public final int hashCode() {
        return this.f146477b.hashCode() + (this.f146476a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AssumedRoleUser(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("arn="), this.f146476a, DateTimeRange.lowerUpperDelimiter, sb4, "assumedRoleId="), this.f146477b, sb4, ")");
    }
}
