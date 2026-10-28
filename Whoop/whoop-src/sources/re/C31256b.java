package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31256b {

    /* JADX INFO: renamed from: a */
    public final String f128761a;

    /* JADX INFO: renamed from: b */
    public final String f128762b;

    public C31256b(C31253a c31253a) {
        String str = c31253a.f128756a;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for name");
        }
        this.f128761a = str;
        this.f128762b = c31253a.f128757b;
    }

    /* JADX INFO: renamed from: a */
    public final String m96281a() {
        return this.f128761a;
    }

    /* JADX INFO: renamed from: b */
    public final String m96282b() {
        return this.f128762b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31256b.class != obj.getClass()) {
            return false;
        }
        C31256b c31256b = (C31256b) obj;
        return AbstractC22676k.m65745e(this.f128761a, c31256b.f128761a) && AbstractC22676k.m65745e(this.f128762b, c31256b.f128762b);
    }

    public final int hashCode() {
        int iHashCode = this.f128761a.hashCode() * 31;
        String str = this.f128762b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AttributeType(");
        sb4.append("name=" + this.f128761a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("value=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
