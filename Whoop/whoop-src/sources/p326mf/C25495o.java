package p326mf;

import java.io.Closeable;
import ne3.InterfaceC26620j;
import p647yf.InterfaceC39508u;
import p679zf.C40605f;
import p679zf.C40607h;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34850x0;

/* JADX INFO: renamed from: mf.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C25495o extends AbstractC25491k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99830a = 0;

    /* JADX INFO: renamed from: b */
    public final Long f99831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Closeable f99832c;

    public C25495o(Long l7, InterfaceC39508u interfaceC39508u) {
        this.f99832c = interfaceC39508u;
        this.f99831b = l7;
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: a */
    public final Long mo74901a() {
        switch (this.f99830a) {
            case 0:
                break;
        }
        return this.f99831b;
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: c */
    public final boolean mo74902c() {
        switch (this.f99830a) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p326mf.AbstractC25491k
    /* JADX INFO: renamed from: d */
    public final InterfaceC39508u mo74903d() {
        switch (this.f99830a) {
            case 0:
                return (InterfaceC39508u) this.f99832c;
            default:
                InterfaceC26620j interfaceC26620jMo1940d1 = ((C34850x0) this.f99832c).f146778G.mo1940d1();
                AbstractC22676k.m65750j(interfaceC26620jMo1940d1, "<this>");
                return interfaceC26620jMo1940d1 instanceof C40607h ? ((C40607h) interfaceC26620jMo1940d1).f174970w : new C40605f(interfaceC26620jMo1940d1);
        }
    }

    public C25495o(C34850x0 c34850x0) {
        this.f99832c = c34850x0;
        this.f99831b = c34850x0.f146778G.mo1941i() >= 0 ? Long.valueOf(c34850x0.f146778G.mo1941i()) : null;
    }
}
