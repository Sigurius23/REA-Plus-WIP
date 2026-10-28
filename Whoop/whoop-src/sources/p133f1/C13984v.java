package p133f1;

import p132f0.C13828u;
import p510u0.AbstractC34339n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: f1.v */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13984v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49885a;

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX INFO: renamed from: a */
    public final C13981u m39795a(InterfaceC13970q0 interfaceC13970q0) {
        C13978t c13978tM39824m;
        C13978t c13978tM39824m2;
        boolean z4;
        C13981u c13981uM39791a;
        switch (this.f49885a) {
            case 0:
                return new C13981u(interfaceC13970q0.mo39708k().m39768a(interfaceC13970q0.mo39708k().f49817c), interfaceC13970q0.mo39707j().m39768a(interfaceC13970q0.mo39707j().f49818d), interfaceC13970q0.mo39702e() == EnumC13939g.f49690w);
            case 1:
                return AbstractC13994y0.m39820i(interfaceC13970q0, C13987w.f49894c);
            case 2:
                return AbstractC13994y0.m39820i(interfaceC13970q0, C13987w.f49893b);
            default:
                C13981u c13981uMo39706i = interfaceC13970q0.mo39706i();
                if (c13981uMo39706i == null) {
                    return AbstractC13994y0.m39820i(interfaceC13970q0, C13987w.f49894c);
                }
                C13978t c13978t = c13981uMo39706i.f49880b;
                C13978t c13978t2 = c13981uMo39706i.f49879a;
                if (interfaceC13970q0.mo39698a()) {
                    c13978tM39824m2 = AbstractC13994y0.m39824m(interfaceC13970q0, interfaceC13970q0.mo39708k(), c13978t2);
                    c13978tM39824m = c13978t;
                    c13978t = c13978t2;
                    c13978t2 = c13978tM39824m2;
                } else {
                    c13978tM39824m = AbstractC13994y0.m39824m(interfaceC13970q0, interfaceC13970q0.mo39707j(), c13978t);
                    c13978tM39824m2 = c13978tM39824m;
                }
                if (AbstractC22676k.m65745e(c13978tM39824m2, c13978t)) {
                    return c13981uMo39706i;
                }
                C13981u c13981u = new C13981u(c13978t2, c13978tM39824m, interfaceC13970q0.mo39702e() == EnumC13939g.f49690w || (interfaceC13970q0.mo39702e() == EnumC13939g.f49692y && c13978t2.f49872b > c13978tM39824m.f49872b));
                boolean z13 = false;
                C13978t c13978t3 = c13981u.f49879a;
                long j7 = c13978t3.f49873c;
                C13978t c13978t4 = c13981u.f49880b;
                if (j7 != c13978t4.f49873c) {
                    boolean z14 = c13981u.f49881c;
                    if ((z14 ? c13978t3 : c13978t4).f49872b == 0) {
                        if (z14) {
                            c13978t3 = c13978t4;
                        }
                        if (interfaceC13970q0.mo39700c().f49820f.f92227a.f92216a.f92135x.length() != c13978t3.f49872b) {
                            z4 = false;
                        } else {
                            C22659b0 c22659b0 = new C22659b0();
                            c22659b0.f89329w = true;
                            interfaceC13970q0.mo39704g(new C13828u(c22659b0, 1));
                            z4 = c22659b0.f89329w;
                        }
                    } else {
                        z4 = false;
                    }
                } else if (c13978t3.f49872b == c13978t4.f49872b) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    String str = interfaceC13970q0.mo39699b().f49820f.f92227a.f92216a.f92135x;
                    if (interfaceC13970q0.getSize() <= 1 && interfaceC13970q0.mo39706i() != null) {
                        if (!(str.length() == 0)) {
                            C13972r c13972rMo39699b = interfaceC13970q0.mo39699b();
                            String str2 = c13972rMo39699b.f49820f.f92227a.f92216a.f92135x;
                            int i13 = c13972rMo39699b.f49817c;
                            int length = str2.length();
                            if (i13 == 0) {
                                int iM108635m = AbstractC34339n0.m108635m(0, str2);
                                c13981uM39791a = interfaceC13970q0.mo39698a() ? C13981u.m39791a(c13981u, AbstractC13994y0.m39827p(c13981u.f49879a, c13972rMo39699b, iM108635m), null, true, 2) : C13981u.m39791a(c13981u, null, AbstractC13994y0.m39827p(c13981u.f49880b, c13972rMo39699b, iM108635m), false, 1);
                            } else if (i13 == length) {
                                int iM108638p = AbstractC34339n0.m108638p(length, str2);
                                c13981uM39791a = interfaceC13970q0.mo39698a() ? C13981u.m39791a(c13981u, AbstractC13994y0.m39827p(c13981u.f49879a, c13972rMo39699b, iM108638p), null, false, 2) : C13981u.m39791a(c13981u, null, AbstractC13994y0.m39827p(c13981u.f49880b, c13972rMo39699b, iM108638p), true, 1);
                            } else {
                                C13981u c13981uMo39706i2 = interfaceC13970q0.mo39706i();
                                if (c13981uMo39706i2 != null && c13981uMo39706i2.f49881c) {
                                    z13 = true;
                                }
                                int iM108638p2 = interfaceC13970q0.mo39698a() ^ z13 ? AbstractC34339n0.m108638p(i13, str2) : AbstractC34339n0.m108635m(i13, str2);
                                c13981uM39791a = interfaceC13970q0.mo39698a() ? C13981u.m39791a(c13981u, AbstractC13994y0.m39827p(c13981u.f49879a, c13972rMo39699b, iM108638p2), null, z13, 2) : C13981u.m39791a(c13981u, null, AbstractC13994y0.m39827p(c13981u.f49880b, c13972rMo39699b, iM108638p2), z13, 1);
                            }
                            return c13981uM39791a;
                        }
                    }
                }
                return c13981u;
        }
    }
}
