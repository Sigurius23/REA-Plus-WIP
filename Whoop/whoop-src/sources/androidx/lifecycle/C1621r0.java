package androidx.lifecycle;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import p000.C12473e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: androidx.lifecycle.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1621r0 implements InterfaceC1618q0 {

    /* JADX INFO: renamed from: a */
    public final C1596j f6302a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f6303b;

    public C1621r0(C1596j c1596j, InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        this.f6302a = c1596j;
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f6303b = context.plus(AbstractC17182o.f65999a.mo8825s());
    }

    /* JADX INFO: renamed from: a */
    public final Object m5031a(Object obj, InterfaceC30057d interfaceC30057d) {
        Object objM8705K = AbstractC3006f0.m8705K(this.f6303b, new C12473e(this, obj, (InterfaceC30057d) null, 10), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }
}
