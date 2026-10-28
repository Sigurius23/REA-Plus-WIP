package p132f0;

import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import e63.C12776e;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.C20028u;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import mc3.InterfaceC25435a;
import ne3.InterfaceC26620j;
import p040c0.C3743h;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13773b1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f49128E;

    /* JADX INFO: renamed from: F */
    public Object f49129F;

    /* JADX INFO: renamed from: G */
    public Object f49130G;

    /* JADX INFO: renamed from: H */
    public Object f49131H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f49132I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f49133J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f49134K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49135w = 0;

    /* JADX INFO: renamed from: x */
    public int f49136x;

    /* JADX INFO: renamed from: y */
    public Object f49137y;

    /* JADX INFO: renamed from: z */
    public Object f49138z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13773b1(EnumC13840z0 enumC13840z0, C13776c1 c13776c1, InterfaceC4351m interfaceC4351m, Object obj, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49133J = enumC13840z0;
        this.f49132I = c13776c1;
        this.f49134K = (AbstractC32275i) interfaceC4351m;
        this.f49130G = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49135w) {
            case 0:
                C13773b1 c13773b1 = new C13773b1((EnumC13840z0) this.f49133J, (C13776c1) this.f49132I, (AbstractC32275i) this.f49134K, this.f49130G, interfaceC30057d);
                c13773b1.f49129F = obj;
                return c13773b1;
            default:
                C13773b1 c13773b2 = new C13773b1((InterfaceC26620j) this.f49132I, (InterfaceC30063j) this.f49133J, (C12776e) this.f49134K, interfaceC30057d);
                c13773b2.f49137y = obj;
                return c13773b2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49135w) {
            case 0:
                return ((C13773b1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C13773b1) create((C20028u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mc3.a, r83.a] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC25435a interfaceC25435a;
        C13770a1 c13770a1;
        Object obj2;
        ?? r10;
        Throwable th3;
        C13770a1 c13770a2;
        InterfaceC25435a interfaceC25435a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        C23454a0 c23454a0;
        Closeable closeable;
        C20028u c20028u;
        InterfaceC30063j interfaceC30063j;
        C22665e0 c22665e0;
        C12776e c12776e;
        ?? r14;
        switch (this.f49135w) {
            case 0:
                C13776c1 c13776c1 = (C13776c1) this.f49132I;
                ?? r15 = EnumC31071a.f128113w;
                int i13 = this.f49136x;
                try {
                    try {
                        if (i13 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f49129F;
                            EnumC13840z0 enumC13840z0 = (EnumC13840z0) this.f49133J;
                            InterfaceC30061h interfaceC30061h = interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w);
                            AbstractC22676k.m65747g(interfaceC30061h);
                            C13770a1 c13770a3 = new C13770a1(enumC13840z0, (InterfaceC3027k1) interfaceC30061h);
                            C13776c1.m39136a(c13776c1, c13770a3);
                            interfaceC25435a = c13776c1.f49150b;
                            AbstractC32275i abstractC32275i = (AbstractC32275i) this.f49134K;
                            Object obj3 = this.f49130G;
                            this.f49129F = c13770a3;
                            this.f49138z = interfaceC25435a;
                            this.f49137y = abstractC32275i;
                            this.f49128E = obj3;
                            this.f49131H = c13776c1;
                            this.f49136x = 1;
                            if (interfaceC25435a.mo68211b(this) == r15) {
                                return r15;
                            }
                            c13770a1 = c13770a3;
                            obj2 = obj3;
                            r10 = abstractC32275i;
                        } else {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c13776c1 = (C13776c1) this.f49137y;
                                interfaceC25435a2 = (InterfaceC25435a) this.f49138z;
                                c13770a2 = (C13770a1) this.f49129F;
                                try {
                                    AbstractC34132o.m107864I(obj);
                                    atomicReference2 = c13776c1.f49149a;
                                    while (!atomicReference2.compareAndSet(c13770a2, null) && atomicReference2.get() == c13770a2) {
                                    }
                                    interfaceC25435a2.mo68214i(null);
                                    return obj;
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    atomicReference = c13776c1.f49149a;
                                    while (!atomicReference.compareAndSet(c13770a2, null) && atomicReference.get() == c13770a2) {
                                    }
                                    throw th3;
                                }
                            }
                            c13776c1 = (C13776c1) this.f49131H;
                            obj2 = this.f49128E;
                            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f49137y;
                            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.f49138z;
                            c13770a1 = (C13770a1) this.f49129F;
                            AbstractC34132o.m107864I(obj);
                            interfaceC25435a = interfaceC25435a3;
                            r10 = interfaceC4351m;
                        }
                        this.f49129F = c13770a1;
                        this.f49138z = interfaceC25435a;
                        this.f49137y = c13776c1;
                        this.f49128E = null;
                        this.f49131H = null;
                        this.f49136x = 2;
                        Object objInvoke = r10.invoke(obj2, this);
                        if (objInvoke == r15) {
                            return r15;
                        }
                        interfaceC25435a2 = interfaceC25435a;
                        obj = objInvoke;
                        c13770a2 = c13770a1;
                        atomicReference2 = c13776c1.f49149a;
                        while (!atomicReference2.compareAndSet(c13770a2, null)) {
                        }
                        interfaceC25435a2.mo68214i(null);
                        return obj;
                    } catch (Throwable th5) {
                        th3 = th5;
                        c13770a2 = c13770a1;
                        atomicReference = c13776c1.f49149a;
                        while (!atomicReference.compareAndSet(c13770a2, null)) {
                        }
                        throw th3;
                    }
                } catch (Throwable th6) {
                    r15.mo68214i(null);
                    throw th6;
                }
            default:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f49136x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                Throwable th7 = null;
                try {
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C20028u c20028u2 = (C20028u) this.f49137y;
                        closeable = (InterfaceC26620j) this.f49132I;
                        InterfaceC30063j interfaceC30063j2 = (InterfaceC30063j) this.f49133J;
                        C12776e c12776e2 = (C12776e) this.f49134K;
                        c20028u = c20028u2;
                        interfaceC30063j = interfaceC30063j2;
                        c22665e0 = new C22665e0();
                        c12776e = c12776e2;
                        r14 = closeable;
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c22665e0 = (C22665e0) this.f49131H;
                        InterfaceC26620j interfaceC26620j = (InterfaceC26620j) this.f49130G;
                        c12776e = (C12776e) this.f49129F;
                        interfaceC30063j = (InterfaceC30063j) this.f49128E;
                        closeable = (Closeable) this.f49138z;
                        c20028u = (C20028u) this.f49137y;
                        AbstractC34132o.m107864I(obj);
                        r14 = interfaceC26620j;
                    }
                    while (r14.isOpen() && AbstractC3006f0.m8730x(interfaceC30063j) && c22665e0.f89334w >= 0) {
                        C20020m c20020m = c20028u.f75136w;
                        C3743h c3743h = new C3743h(c22665e0, r14, c12776e, 4);
                        this.f49137y = c20028u;
                        this.f49138z = closeable;
                        this.f49128E = interfaceC30063j;
                        this.f49129F = c12776e;
                        this.f49130G = r14;
                        this.f49131H = c22665e0;
                        this.f49136x = 1;
                        if (C20020m.m55818J(c20020m, 1, c3743h, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        break;
                    }
                    c23454a0 = c23454a1;
                } catch (Throwable th8) {
                    th7 = th8;
                    c23454a0 = null;
                }
                if (closeable != null) {
                    try {
                        closeable.close();
                        break;
                    } catch (Throwable th9) {
                        if (th7 == null) {
                            th7 = th9;
                        } else {
                            AbstractC29125c.m88530g(th7, th9);
                        }
                    }
                }
                if (th7 != null) {
                    throw th7;
                }
                AbstractC22676k.m65747g(c23454a0);
                return c23454a1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13773b1(InterfaceC26620j interfaceC26620j, InterfaceC30063j interfaceC30063j, C12776e c12776e, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49132I = interfaceC26620j;
        this.f49133J = interfaceC30063j;
        this.f49134K = c12776e;
    }
}
