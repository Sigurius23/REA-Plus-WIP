package lb;

import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import g73.C15556d;
import h20.C16670i0;
import hc3.C17193z;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.C19072b;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.sentry.internal.debugmeta.C20378c;
import p500tb.InterfaceC33687a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: lb.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C23562e implements InterfaceC23558b {

    /* JADX INFO: renamed from: E */
    public volatile boolean f93448E;

    /* JADX INFO: renamed from: F */
    public final long f93449F;

    /* JADX INFO: renamed from: G */
    public final int f93450G;

    /* JADX INFO: renamed from: w */
    public final C23576s f93451w;

    /* JADX INFO: renamed from: x */
    public final C23576s f93452x;

    /* JADX INFO: renamed from: y */
    public final C15556d f93453y;

    /* JADX INFO: renamed from: z */
    public final ThreadLocal f93454z;

    public C23562e(C20378c c20378c) {
        this.f93453y = new C15556d(19);
        this.f93454z = new ThreadLocal();
        Duration.Companion companion = Duration.INSTANCE;
        this.f93449F = DurationKt.toDuration(30, DurationUnit.SECONDS);
        this.f93450G = 2;
        C23576s c23576s = new C23576s(1, new C19683b(c20378c, 21));
        this.f93451w = c23576s;
        this.f93452x = c23576s;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #3 {all -> 0x01aa, blocks: (B:64:0x0123, B:69:0x0141, B:71:0x014c, B:86:0x01ae, B:87:0x01b5), top: B:113:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae A[Catch: all -> 0x01aa, TRY_ENTER, TryCatch #3 {all -> 0x01aa, blocks: (B:64:0x0123, B:69:0x0141, B:71:0x014c, B:86:0x01ae, B:87:0x01b5), top: B:113:0x0123 }] */
    @Override // lb.InterfaceC23558b
    /* JADX INFO: renamed from: A0 */
    public final Object mo68210A0(boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) throws Throwable {
        C23561d c23561d;
        C22669g0 c22669g0;
        Throwable th3;
        C23576s c23576s;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC30063j context;
        C15556d c15556d;
        C23576s c23576s2;
        C22669g0 c22669g1;
        boolean z13;
        Object obj;
        C22669g0 c22669g2;
        C23557a0 c23557a0;
        boolean z14 = z4;
        if (interfaceC30057d instanceof C23561d) {
            c23561d = (C23561d) interfaceC30057d;
            int i13 = c23561d.f93443J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23561d.f93443J = i13 - Integer.MIN_VALUE;
            } else {
                c23561d = new C23561d(this, interfaceC30057d);
            }
        } else {
            c23561d = new C23561d(this, interfaceC30057d);
        }
        Object objM8705K = c23561d.f93441H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23561d.f93443J;
        InterfaceC30057d interfaceC30057d2 = null;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM8705K);
                return objM8705K;
            }
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM8705K);
                return objM8705K;
            }
            if (i14 == 3) {
                z14 = c23561d.f93444w;
                c15556d = c23561d.f93440G;
                C22669g0 c22669g3 = c23561d.f93439F;
                context = c23561d.f93438E;
                C22669g0 c22669g4 = c23561d.f93447z;
                c23576s2 = (C23576s) c23561d.f93446y;
                interfaceC4351m2 = (InterfaceC4351m) c23561d.f93445x;
                try {
                    AbstractC34132o.m107864I(objM8705K);
                    c22669g1 = c22669g3;
                    c22669g0 = c22669g4;
                    try {
                        C23565h c23565h = (C23565h) objM8705K;
                        c23565h.getClass();
                        AbstractC22676k.m65750j(context, "context");
                        c23565h.f93460y = context;
                        c23565h.f93461z = new Throwable();
                        if (this.f93451w == this.f93452x && z14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c22669g1.f89336w = new C23557a0(c15556d, c23565h, z13);
                        obj = c22669g0.f89336w;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        C23557a0 c23557a1 = (C23557a0) obj;
                        C23556a c23556a = new C23556a(this.f93453y, c23557a1);
                        ThreadLocal threadLocal = this.f93454z;
                        AbstractC22676k.m65750j(threadLocal, "<this>");
                        InterfaceC30063j interfaceC30063jM36254T = AbstractC12889b.m36254T(c23556a, new C17193z(c23557a1, threadLocal));
                        C16670i0 c16670i0 = new C16670i0(interfaceC4351m2, c22669g0, (InterfaceC30057d) null, 21);
                        c23561d.f93445x = c23576s2;
                        c23561d.f93446y = c22669g0;
                        c23561d.f93447z = null;
                        c23561d.f93438E = null;
                        c23561d.f93439F = null;
                        c23561d.f93440G = null;
                        c23561d.f93443J = 4;
                        objM8705K = AbstractC3006f0.m8705K(interfaceC30063jM36254T, c16670i0, c23561d);
                        if (objM8705K != enumC31071a) {
                            c22669g2 = c22669g0;
                            c23576s = c23576s2;
                        }
                        return enumC31071a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        c23576s = c23576s2;
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                    c22669g0 = c22669g4;
                    c23576s = c23576s2;
                    throw th3;
                }
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g2 = (C22669g0) c23561d.f93446y;
            c23576s = (C23576s) c23561d.f93445x;
            try {
                AbstractC34132o.m107864I(objM8705K);
            } catch (Throwable th6) {
                c22669g0 = c22669g2;
                th3 = th6;
            }
            c23557a0 = (C23557a0) c22669g2.f89336w;
            if (c23557a0 != null) {
                if (!c23557a0.f93434e) {
                    c23557a0.f93434e = true;
                    if (c23557a0.f93431b.f93458w.mo68216v()) {
                        AbstractC17269i.m48864K("ROLLBACK TRANSACTION", c23557a0.f93431b);
                    }
                }
                C23565h c23565h2 = c23557a0.f93431b;
                c23565h2.f93460y = null;
                c23565h2.f93461z = null;
                c23576s.m68222e(c23565h2);
            }
            return objM8705K;
        }
        AbstractC34132o.m107864I(objM8705K);
        if (this.f93448E) {
            AbstractC17269i.m48901l0(21, "Connection pool is closed");
            throw null;
        }
        C23557a0 c23557a2 = (C23557a0) this.f93454z.get();
        if (c23557a2 == null) {
            C23556a c23556a2 = (C23556a) c23561d.getContext().get(this.f93453y);
            c23557a2 = c23556a2 != null ? c23556a2.f93429x : null;
        }
        if (c23557a2 == null) {
            C23576s c23576s3 = z14 ? this.f93451w : this.f93452x;
            c22669g0 = new C22669g0();
            try {
                InterfaceC30063j context2 = c23561d.getContext();
                C15556d c15556d2 = this.f93453y;
                long j7 = this.f93449F;
                C19072b c19072b = new C19072b(this, z14, 3);
                c23561d.f93445x = interfaceC4351m;
                c23561d.f93446y = c23576s3;
                c23561d.f93447z = c22669g0;
                c23561d.f93438E = context2;
                c23561d.f93439F = c22669g0;
                c23561d.f93440G = c15556d2;
                c23561d.f93444w = z14;
                c23561d.f93443J = 3;
                Object objM68219b = c23576s3.m68219b(j7, c19072b, c23561d);
                if (objM68219b != enumC31071a) {
                    interfaceC4351m2 = interfaceC4351m;
                    context = context2;
                    c15556d = c15556d2;
                    c23576s2 = c23576s3;
                    objM8705K = objM68219b;
                    c22669g1 = c22669g0;
                    C23565h c23565h3 = (C23565h) objM8705K;
                    c23565h3.getClass();
                    AbstractC22676k.m65750j(context, "context");
                    c23565h3.f93460y = context;
                    c23565h3.f93461z = new Throwable();
                    if (this.f93451w == this.f93452x) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    c22669g1.f89336w = new C23557a0(c15556d, c23565h3, z13);
                    obj = c22669g0.f89336w;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C23557a0 c23557a3 = (C23557a0) obj;
                    C23556a c23556a3 = new C23556a(this.f93453y, c23557a3);
                    ThreadLocal threadLocal2 = this.f93454z;
                    AbstractC22676k.m65750j(threadLocal2, "<this>");
                    InterfaceC30063j interfaceC30063jM36254T2 = AbstractC12889b.m36254T(c23556a3, new C17193z(c23557a3, threadLocal2));
                    C16670i0 c16670i1 = new C16670i0(interfaceC4351m2, c22669g0, (InterfaceC30057d) null, 21);
                    c23561d.f93445x = c23576s2;
                    c23561d.f93446y = c22669g0;
                    c23561d.f93447z = null;
                    c23561d.f93438E = null;
                    c23561d.f93439F = null;
                    c23561d.f93440G = null;
                    c23561d.f93443J = 4;
                    objM8705K = AbstractC3006f0.m8705K(interfaceC30063jM36254T2, c16670i1, c23561d);
                    if (objM8705K != enumC31071a) {
                        c22669g2 = c22669g0;
                        c23576s = c23576s2;
                        c23557a0 = (C23557a0) c22669g2.f89336w;
                        if (c23557a0 != null) {
                            if (!c23557a0.f93434e) {
                                c23557a0.f93434e = true;
                                if (c23557a0.f93431b.f93458w.mo68216v()) {
                                    AbstractC17269i.m48864K("ROLLBACK TRANSACTION", c23557a0.f93431b);
                                }
                            }
                            C23565h c23565h4 = c23557a0.f93431b;
                            c23565h4.f93460y = null;
                            c23565h4.f93461z = null;
                            c23576s.m68222e(c23565h4);
                        }
                        return objM8705K;
                    }
                }
            } catch (Throwable th7) {
                th3 = th7;
                c23576s = c23576s3;
            }
        } else {
            if (!z14 && c23557a2.f93432c) {
                AbstractC17269i.m48901l0(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (c23561d.getContext().get(this.f93453y) == null) {
                C23556a c23556a4 = new C23556a(this.f93453y, c23557a2);
                ThreadLocal threadLocal3 = this.f93454z;
                AbstractC22676k.m65750j(threadLocal3, "<this>");
                InterfaceC30063j interfaceC30063jM36254T3 = AbstractC12889b.m36254T(c23556a4, new C17193z(c23557a2, threadLocal3));
                C16670i0 c16670i2 = new C16670i0(interfaceC4351m, c23557a2, interfaceC30057d2, 20);
                c23561d.f93443J = 1;
                Object objM8705K2 = AbstractC3006f0.m8705K(interfaceC30063jM36254T3, c16670i2, c23561d);
                if (objM8705K2 != enumC31071a) {
                    return objM8705K2;
                }
            } else {
                c23561d.f93443J = 2;
                Object objInvoke = interfaceC4351m.invoke(c23557a2, c23561d);
                if (objInvoke != enumC31071a) {
                    return objInvoke;
                }
            }
        }
        return enumC31071a;
        try {
            throw th3;
        } catch (Throwable th8) {
            try {
                C23557a0 c23557a4 = (C23557a0) c22669g0.f89336w;
                if (c23557a4 == null) {
                    throw th8;
                }
                if (!c23557a4.f93434e) {
                    c23557a4.f93434e = true;
                    if (c23557a4.f93431b.f93458w.mo68216v()) {
                        AbstractC17269i.m48864K("ROLLBACK TRANSACTION", c23557a4.f93431b);
                    }
                }
                C23565h c23565h5 = c23557a4.f93431b;
                c23565h5.f93460y = null;
                c23565h5.f93461z = null;
                c23576s.m68222e(c23565h5);
                throw th8;
            } catch (Throwable th9) {
                AbstractC29125c.m88530g(th3, th9);
                throw th8;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f93448E) {
            return;
        }
        this.f93448E = true;
        this.f93451w.m68220c();
        this.f93452x.m68220c();
    }

    public C23562e(final C20378c c20378c, final String fileName, int i13) {
        AbstractC22676k.m65750j(fileName, "fileName");
        this.f93453y = new C15556d(19);
        this.f93454z = new ThreadLocal();
        Duration.Companion companion = Duration.INSTANCE;
        this.f93449F = DurationKt.toDuration(30, DurationUnit.SECONDS);
        this.f93450G = 2;
        if (i13 > 0) {
            final int i14 = 0;
            this.f93451w = new C23576s(i13, new InterfaceC4339a() { // from class: lb.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            InterfaceC33687a interfaceC33687aMo11169h = c20378c.mo11169h(fileName);
                            AbstractC17269i.m48864K("PRAGMA query_only = 1", interfaceC33687aMo11169h);
                            return interfaceC33687aMo11169h;
                        default:
                            return c20378c.mo11169h(fileName);
                    }
                }
            });
            final int i15 = 1;
            this.f93452x = new C23576s(1, new InterfaceC4339a() { // from class: lb.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            InterfaceC33687a interfaceC33687aMo11169h = c20378c.mo11169h(fileName);
                            AbstractC17269i.m48864K("PRAGMA query_only = 1", interfaceC33687aMo11169h);
                            return interfaceC33687aMo11169h;
                        default:
                            return c20378c.mo11169h(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
