package b30;

import c93.InterfaceC4339a;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2598p3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f10106a;

    /* JADX INFO: renamed from: b */
    public final boolean f10107b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f10108c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f10109d;

    /* JADX INFO: renamed from: e */
    public final boolean f10110e;

    /* JADX INFO: renamed from: f */
    public final boolean f10111f;

    public C2598p3(InterfaceC41211c interfaceC41211c, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z13, boolean z14) {
        this.f10106a = interfaceC41211c;
        this.f10107b = z4;
        this.f10108c = interfaceC4339a;
        this.f10109d = interfaceC4339a2;
        this.f10110e = z13;
        this.f10111f = z14;
    }

    /* JADX INFO: renamed from: a */
    public static C2598p3 m7511a(C2598p3 c2598p3, boolean z4) {
        InterfaceC41211c interfaceC41211c = c2598p3.f10106a;
        boolean z13 = c2598p3.f10107b;
        InterfaceC4339a interfaceC4339a = c2598p3.f10108c;
        InterfaceC4339a interfaceC4339a2 = c2598p3.f10109d;
        boolean z14 = c2598p3.f10111f;
        c2598p3.getClass();
        return new C2598p3(interfaceC41211c, z13, interfaceC4339a, interfaceC4339a2, z4, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598p3)) {
            return false;
        }
        C2598p3 c2598p3 = (C2598p3) obj;
        return AbstractC22676k.m65745e(this.f10106a, c2598p3.f10106a) && this.f10107b == c2598p3.f10107b && AbstractC22676k.m65745e(this.f10108c, c2598p3.f10108c) && AbstractC22676k.m65745e(this.f10109d, c2598p3.f10109d) && this.f10110e == c2598p3.f10110e && this.f10111f == c2598p3.f10111f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10111f) + AbstractC2875y.m8289b(AbstractC30802r.m94755d(AbstractC30802r.m94755d(AbstractC2875y.m8289b(this.f10106a.hashCode() * 31, 31, this.f10107b), 31, this.f10108c), 31, this.f10109d), 31, this.f10110e);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("UIState(label=");
        sb4.append(this.f10106a);
        sb4.append(", canClickWhileDisabled=");
        sb4.append(this.f10107b);
        sb4.append(", onClick=");
        sb4.append(this.f10108c);
        sb4.append(", onDisabledClick=");
        sb4.append(this.f10109d);
        sb4.append(", enabled=");
        return AbstractC36095b.m114682j(sb4, this.f10110e, ", lockVisible=", this.f10111f, ")");
    }
}
