package cv;

import p078d1.C11457j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11142b {

    /* JADX INFO: renamed from: a */
    public final Long f35594a;

    /* JADX INFO: renamed from: b */
    public final Long f35595b;

    public C11142b(C11457j c11457j) {
        this.f35594a = (Long) c11457j.f36753x;
        this.f35595b = (Long) c11457j.f36754y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11142b)) {
            return false;
        }
        C11142b c11142b = (C11142b) obj;
        return AbstractC22676k.m65745e(this.f35595b, c11142b.f35595b) && AbstractC22676k.m65745e(this.f35594a, c11142b.f35594a);
    }

    public final int hashCode() {
        Long l7 = this.f35594a;
        int iHashCode = (l7 != null ? l7.hashCode() : 0) * 31;
        Long l12 = this.f35595b;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }
}
