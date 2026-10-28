package ag;

import p647yf.InterfaceC39492e;
import p715kotlin.jvm.internal.AbstractC22676k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ag.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0851a implements InterfaceC39492e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39492e f3052a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0852b f3053b;

    public C0851a(InterfaceC39492e handler, InterfaceC0852b with) {
        AbstractC22676k.m65750j(handler, "handler");
        AbstractC22676k.m65750j(with, "with");
        this.f3052a = handler;
        this.f3053b = with;
    }

    @Override // p647yf.InterfaceC39492e
    /* JADX INFO: renamed from: a */
    public final Object mo2061a(Object obj, AbstractC32269c abstractC32269c) {
        return this.f3053b.mo2062a(obj, this.f3052a, abstractC32269c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0851a)) {
            return false;
        }
        C0851a c0851a = (C0851a) obj;
        return AbstractC22676k.m65745e(this.f3052a, c0851a.f3052a) && AbstractC22676k.m65745e(this.f3053b, c0851a.f3053b);
    }

    public final int hashCode() {
        return this.f3053b.hashCode() + (this.f3052a.hashCode() * 31);
    }

    public final String toString() {
        return "DecoratedHandler(handler=" + this.f3052a + ", with=" + this.f3053b + ')';
    }
}
