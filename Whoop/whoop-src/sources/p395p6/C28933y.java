package p395p6;

import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C28933y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26398o f117064a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC26398o f117065b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C28933y(InterfaceC26398o interfaceC26398o, int i13) {
        int i14 = i13 & 2;
        C26396m c26396m = C26396m.f104850a;
        this(c26396m, i14 != 0 ? c26396m : interfaceC26398o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28933y)) {
            return false;
        }
        C28933y c28933y = (C28933y) obj;
        return AbstractC22676k.m65745e(this.f117064a, c28933y.f117064a) && AbstractC22676k.m65745e(this.f117065b, c28933y.f117065b);
    }

    public final int hashCode() {
        return this.f117065b.hashCode() + (this.f117064a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.f117064a + ", nonSizeOrCornerModifiers=" + this.f117065b + ')';
    }

    public C28933y(InterfaceC26398o interfaceC26398o, InterfaceC26398o interfaceC26398o2) {
        this.f117064a = interfaceC26398o;
        this.f117065b = interfaceC26398o2;
    }
}
