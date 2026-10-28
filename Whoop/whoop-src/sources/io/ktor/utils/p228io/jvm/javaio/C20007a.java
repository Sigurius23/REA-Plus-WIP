package io.ktor.utils.p228io.jvm.javaio;

import bc3.InterfaceC3027k1;
import bc3.InterfaceC3056s0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20007a implements InterfaceC30057d {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f75078w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC20008b f75079x;

    public C20007a(AbstractC20008b abstractC20008b) {
        this.f75079x = abstractC20008b;
        InterfaceC3027k1 interfaceC3027k1 = abstractC20008b.f75081a;
        this.f75078w = interfaceC3027k1 != null ? C20017k.f75101w.plus(interfaceC3027k1) : C20017k.f75101w;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f75078w;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        Object obj2;
        boolean z4;
        boolean z13;
        Throwable thM68037a;
        InterfaceC3027k1 interfaceC3027k1;
        Object objM68037a = C23468n.m68037a(obj);
        if (objM68037a == null) {
            objM68037a = C23454a0.f92919a;
        }
        AbstractC20008b abstractC20008b = this.f75079x;
        do {
            obj2 = abstractC20008b.state;
            z4 = obj2 instanceof Thread;
            z13 = true;
            if (!(z4 ? true : obj2 instanceof InterfaceC30057d ? true : AbstractC22676k.m65745e(obj2, this))) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC20008b.f75080f;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractC20008b, obj2, objM68037a)) {
                if (atomicReferenceFieldUpdater.get(abstractC20008b) != obj2) {
                    z13 = false;
                    break;
                }
            }
        } while (!z13);
        if (z4) {
            InterfaceC20015i interfaceC20015i = (InterfaceC20015i) AbstractC20016j.f75100a.get();
            if (interfaceC20015i == null) {
                interfaceC20015i = C20011e.f75088b;
            }
            interfaceC20015i.mo55817b(obj2);
        } else if ((obj2 instanceof InterfaceC30057d) && (thM68037a = C23468n.m68037a(obj)) != null) {
            ((InterfaceC30057d) obj2).resumeWith(AbstractC34132o.m107888l(thM68037a));
        }
        if ((obj instanceof C23467m) && !(C23468n.m68037a(obj) instanceof CancellationException) && (interfaceC3027k1 = this.f75079x.f75081a) != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC3056s0 interfaceC3056s0 = this.f75079x.f75083c;
        if (interfaceC3056s0 != null) {
            interfaceC3056s0.dispose();
        }
    }
}
