package bg;

import androidx.room.AbstractC1772c1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bg.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C3211f {

    /* JADX INFO: renamed from: a */
    public final String f12567a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1772c1 f12568b;

    public C3211f(String str, AbstractC1772c1 abstractC1772c1) {
        this.f12567a = str;
        this.f12568b = abstractC1772c1;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1772c1 m9254a() {
        return this.f12568b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3211f)) {
            return false;
        }
        C3211f c3211f = (C3211f) obj;
        return AbstractC22676k.m65745e(this.f12567a, c3211f.f12567a) && AbstractC22676k.m65745e(this.f12568b, c3211f.f12568b);
    }

    public final int hashCode() {
        return this.f12568b.hashCode() + (this.f12567a.hashCode() * 31);
    }

    public final String toString() {
        return "HostAddress(hostname=" + this.f12567a + ", address=" + this.f12568b + ')';
    }
}
