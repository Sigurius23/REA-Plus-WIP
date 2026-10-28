package p412q3;

import p294l3.C23254g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29869e0 {

    /* JADX INFO: renamed from: a */
    public final C23254g f122088a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29884r f122089b;

    public C29869e0(C23254g c23254g, InterfaceC29884r interfaceC29884r) {
        this.f122088a = c23254g;
        this.f122089b = interfaceC29884r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29869e0)) {
            return false;
        }
        C29869e0 c29869e0 = (C29869e0) obj;
        return AbstractC22676k.m65745e(this.f122088a, c29869e0.f122088a) && AbstractC22676k.m65745e(this.f122089b, c29869e0.f122089b);
    }

    public final int hashCode() {
        return this.f122089b.hashCode() + (this.f122088a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f122088a) + ", offsetMapping=" + this.f122089b + ')';
    }
}
