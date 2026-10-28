package io.ktor.utils.p228io.internal;

import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import hc3.AbstractC17176i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C19992b implements InterfaceC30057d {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75043w = AtomicReferenceFieldUpdater.newUpdater(C19992b.class, Object.class, "state");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75044x = AtomicReferenceFieldUpdater.newUpdater(C19992b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: renamed from: a */
    public static final void m55789a(C19992b c19992b, InterfaceC3027k1 interfaceC3027k1, Throwable th3) {
        Object obj;
        InterfaceC30057d interfaceC30057d;
        do {
            obj = c19992b.state;
            if (!(obj instanceof InterfaceC30057d)) {
                return;
            }
            interfaceC30057d = (InterfaceC30057d) obj;
            if (interfaceC30057d.getContext().get(C3023j1.f12041w) != interfaceC3027k1) {
                return;
            }
        } while (!AbstractC17176i.m48522x(f75043w, c19992b, obj));
        interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
    }

    /* JADX INFO: renamed from: b */
    public final void m55790b(Throwable cause) {
        AbstractC22676k.m65750j(cause, "cause");
        resumeWith(AbstractC34132o.m107888l(cause));
        C19991a c19991a = (C19991a) f75044x.getAndSet(this, null);
        if (c19991a != null) {
            c19991a.m55788a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m55791d(InterfaceC30057d interfaceC30057d) throws Throwable {
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75043w;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC30057d)) {
                        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30057d.getContext().get(C3023j1.f12041w);
                        C19991a c19991a = (C19991a) this.jobCancellationHandler;
                        if ((c19991a != null ? c19991a.f75040w : null) != interfaceC3027k1) {
                            if (interfaceC3027k1 == null) {
                                C19991a c19991a2 = (C19991a) f75044x.getAndSet(this, null);
                                if (c19991a2 != null) {
                                    c19991a2.m55788a();
                                }
                            } else {
                                C19991a c19991a3 = new C19991a(this, interfaceC3027k1);
                                loop3: while (true) {
                                    Object obj2 = this.jobCancellationHandler;
                                    C19991a c19991a4 = (C19991a) obj2;
                                    if (c19991a4 != null && c19991a4.f75040w == interfaceC3027k1) {
                                        c19991a3.m55788a();
                                        break;
                                    }
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f75044x;
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c19991a3)) {
                                            if (c19991a4 == null) {
                                                break loop3;
                                            }
                                            c19991a4.m55788a();
                                            break loop3;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                                }
                            }
                        }
                        return EnumC31071a.f128113w;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f75043w;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        return obj;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj);
            }
        }
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        InterfaceC30063j context;
        Object obj = this.state;
        InterfaceC30057d interfaceC30057d = obj instanceof InterfaceC30057d ? (InterfaceC30057d) obj : null;
        return (interfaceC30057d == null || (context = interfaceC30057d.getContext()) == null) ? C30064k.f122676w : context;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        Object objM68037a;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objM68037a = C23468n.m68037a(obj);
                if (objM68037a == null) {
                    AbstractC34132o.m107864I(obj);
                    objM68037a = obj;
                }
            } else if (!(obj2 instanceof InterfaceC30057d)) {
                return;
            } else {
                objM68037a = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75043w;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM68037a)) {
                    if (obj2 instanceof InterfaceC30057d) {
                        ((InterfaceC30057d) obj2).resumeWith(obj);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
