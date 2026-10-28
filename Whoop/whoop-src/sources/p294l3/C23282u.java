package p294l3;

import i20.C17990z0;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C23282u extends AbstractC23284v {

    /* JADX INFO: renamed from: a */
    public final String f92248a;

    /* JADX INFO: renamed from: b */
    public final C23279s0 f92249b;

    /* JADX INFO: renamed from: c */
    public final C17990z0 f92250c;

    public C23282u(String str, C23279s0 c23279s0, C17990z0 c17990z0) {
        this.f92248a = str;
        this.f92249b = c23279s0;
        this.f92250c = c17990z0;
    }

    @Override // p294l3.AbstractC23284v
    /* JADX INFO: renamed from: a */
    public final C17990z0 mo67352a() {
        return this.f92250c;
    }

    @Override // p294l3.AbstractC23284v
    /* JADX INFO: renamed from: b */
    public final C23279s0 mo67353b() {
        return this.f92249b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23282u)) {
            return false;
        }
        C23282u c23282u = (C23282u) obj;
        return AbstractC22676k.m65745e(this.f92248a, c23282u.f92248a) && AbstractC22676k.m65745e(this.f92249b, c23282u.f92249b) && AbstractC22676k.m65745e(this.f92250c, c23282u.f92250c);
    }

    public final int hashCode() {
        int iHashCode = this.f92248a.hashCode() * 31;
        C23279s0 c23279s0 = this.f92249b;
        int iHashCode2 = (iHashCode + (c23279s0 != null ? c23279s0.hashCode() : 0)) * 31;
        C17990z0 c17990z0 = this.f92250c;
        return iHashCode2 + (c17990z0 != null ? c17990z0.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("LinkAnnotation.Url(url="), this.f92248a, ')');
    }
}
