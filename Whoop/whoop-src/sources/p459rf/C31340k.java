package p459rf;

import ae3.C0801i;
import gf.C15760a;
import gf.C15762c;
import p423qf.C30318b;
import p424qg.C30335d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: rf.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C31340k implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public static final C31340k f128960w = new C31340k();

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        C30318b c30318b;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        Object objM109908c = c34832o0.m109908c(C31352w.class);
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        C34810e0 c34810e0 = c34832o0.f146712a;
        C31352w c31352w = (C31352w) objM109908c;
        if (c31352w == null || (c30318b = c31352w.f128997c) == null) {
            return c0801i.m1939b(c34832o0);
        }
        C15762c c15762c = new C15762c();
        String value = c34810e0.f146565d + ':' + c34810e0.f146566e;
        AbstractC22676k.m65750j(value, "value");
        c15762c.mo33083c(new C15760a("server.address"), value);
        if (abstractC34846v0 != null) {
            C34830n0 c34830n0M109907b = c34832o0.m109907b();
            String str = c34832o0.f146713b;
            C30335d counter = c30318b.f124390M;
            AbstractC22676k.m65750j(counter, "counter");
            c34830n0M109907b.m109904e(str, new C31336g(abstractC34846v0, counter, c15762c));
            c34832o0 = new C34832o0(c34830n0M109907b);
        }
        C34850x0 c34850x0M1939b = c0801i.m1939b(c34832o0);
        AbstractC34799a1 abstractC34799a1 = c34850x0M1939b.f146778G;
        if (abstractC34799a1.mo1941i() == 0) {
            return c34850x0M1939b;
        }
        C34848w0 c34848w0M109933h = c34850x0M1939b.m109933h();
        C30335d counter2 = c30318b.f124391N;
        AbstractC22676k.m65750j(counter2, "counter");
        c34848w0M109933h.f146767g = new C31337h(abstractC34799a1, counter2, c15762c);
        return c34848w0M109933h.m109930a();
    }
}
