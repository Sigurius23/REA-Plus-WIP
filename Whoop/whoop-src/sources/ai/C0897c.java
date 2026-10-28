package ai;

import java.util.Map;
import p000.AbstractC30802r;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ai.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0897c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f3284a;

    /* JADX INFO: renamed from: b */
    public final Map f3285b;

    public C0897c(InterfaceC31421j interfaceC31421j, Map map) {
        this.f3284a = interfaceC31421j;
        this.f3285b = AbstractC37978j.m121638W(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897c)) {
            return false;
        }
        C0897c c0897c = (C0897c) obj;
        return AbstractC22676k.m65745e(this.f3284a, c0897c.f3284a) && AbstractC22676k.m65745e(this.f3285b, c0897c.f3285b);
    }

    public final int hashCode() {
        return this.f3285b.hashCode() + (this.f3284a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Value(image=");
        sb4.append(this.f3284a);
        sb4.append(", extras=");
        return AbstractC30802r.m94764m(sb4, this.f3285b, ')');
    }
}
