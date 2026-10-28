package p040c0;

import p000.AbstractC30802r;
import p026b2.InterfaceC2302h;
import p031b9.AbstractC2875y;
import p077d0.InterfaceC11337c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3753k0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2302h f15341a;

    /* JADX INFO: renamed from: b */
    public final Function1 f15342b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11337c0 f15343c;

    /* JADX INFO: renamed from: d */
    public final boolean f15344d;

    public C3753k0(InterfaceC2302h interfaceC2302h, InterfaceC11337c0 interfaceC11337c0, Function1 function1, boolean z4) {
        this.f15341a = interfaceC2302h;
        this.f15342b = function1;
        this.f15343c = interfaceC11337c0;
        this.f15344d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3753k0)) {
            return false;
        }
        C3753k0 c3753k0 = (C3753k0) obj;
        return AbstractC22676k.m65745e(this.f15341a, c3753k0.f15341a) && AbstractC22676k.m65745e(this.f15342b, c3753k0.f15342b) && AbstractC22676k.m65745e(this.f15343c, c3753k0.f15343c) && this.f15344d == c3753k0.f15344d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15344d) + ((this.f15343c.hashCode() + AbstractC30802r.m94756e(this.f15342b, this.f15341a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ChangeSize(alignment=");
        sb4.append(this.f15341a);
        sb4.append(", size=");
        sb4.append(this.f15342b);
        sb4.append(", animationSpec=");
        sb4.append(this.f15343c);
        sb4.append(", clip=");
        return AbstractC2875y.m8305r(sb4, this.f15344d, ')');
    }
}
