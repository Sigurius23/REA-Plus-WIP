package androidx.lifecycle;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import mc3.C25437c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1582f1 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C3033m f6218E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C25437c f6219F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC32275i f6220G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ EnumC1632v f6221w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f6222x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f6223y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EnumC1632v f6224z;

    /* JADX WARN: Multi-variable type inference failed */
    public C1582f1(EnumC1632v enumC1632v, C22669g0 c22669g0, InterfaceC2994c0 interfaceC2994c0, EnumC1632v enumC1632v2, C3033m c3033m, C25437c c25437c, InterfaceC4351m interfaceC4351m) {
        this.f6221w = enumC1632v;
        this.f6222x = c22669g0;
        this.f6223y = interfaceC2994c0;
        this.f6224z = enumC1632v2;
        this.f6218E = c3033m;
        this.f6219F = c25437c;
        this.f6220G = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c93.m, s83.i] */
    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        EnumC1632v enumC1632v = this.f6221w;
        C22669g0 c22669g0 = this.f6222x;
        if (event == enumC1632v) {
            c22669g0.f89336w = AbstractC3006f0.m8732z(this.f6223y, null, null, new C1578e1(this.f6219F, (InterfaceC4351m) this.f6220G, (InterfaceC30057d) null), 3);
            return;
        }
        if (event == this.f6224z) {
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            c22669g0.f89336w = null;
        }
        if (event == EnumC1632v.ON_DESTROY) {
            this.f6218E.resumeWith(C23454a0.f92919a);
        }
    }
}
