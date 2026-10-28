package r63;

import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: r63.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C30998j implements InterfaceC30057d, InterfaceC32270d {

    /* JADX INFO: renamed from: w */
    public int f127973w = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30999k f127974x;

    public C30998j(C30999k c30999k) {
        this.f127974x = c30999k;
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = C30997i.f127972w;
        int i13 = this.f127973w;
        C30999k c30999k = this.f127974x;
        if (i13 == Integer.MIN_VALUE) {
            this.f127973w = c30999k.f127976F;
        }
        int i14 = this.f127973w;
        if (i14 < 0) {
            this.f127973w = Integer.MIN_VALUE;
            interfaceC30057d = null;
        } else {
            try {
                InterfaceC30057d interfaceC30057d2 = c30999k.f127975E[i14];
                if (interfaceC30057d2 != null) {
                    this.f127973w = i14 - 1;
                    interfaceC30057d = interfaceC30057d2;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        InterfaceC30063j context;
        C30999k c30999k = this.f127974x;
        InterfaceC30057d interfaceC30057d = c30999k.f127975E[c30999k.f127976F];
        if (interfaceC30057d == null || (context = interfaceC30057d.getContext()) == null) {
            throw new IllegalStateException("Not started");
        }
        return context;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        boolean z4 = obj instanceof C23467m;
        C30999k c30999k = this.f127974x;
        if (!z4) {
            c30999k.m95534e(false);
            return;
        }
        Throwable thM68037a = C23468n.m68037a(obj);
        AbstractC22676k.m65747g(thM68037a);
        c30999k.m95535f(AbstractC34132o.m107888l(thM68037a));
    }
}
