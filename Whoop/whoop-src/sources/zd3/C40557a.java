package zd3;

import ae3.C0801i;
import ae3.InterfaceC0799g;
import be3.C3185g;
import ce3.C4516q;
import ce3.C4517r;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.C26637r0;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34826l0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: zd3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40557a implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public static final C40557a f174645w = new C40557a();

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws IOException {
        InterfaceC0799g c3185g;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C40571o c40571o = c0801i.f2951a;
        synchronized (c40571o) {
            if (!c40571o.f174717Q) {
                throw new IllegalStateException("released");
            }
            if (c40571o.f174714N || c40571o.f174713M || c40571o.f174716P || c40571o.f174715O) {
                throw new IllegalStateException("Check failed.");
            }
        }
        InterfaceC40564h interfaceC40564h = c40571o.f174709I;
        AbstractC22676k.m65747g(interfaceC40564h);
        C40572p c40572pMo131541a = interfaceC40564h.mo131541a();
        C34826l0 c34826l0 = c40571o.f174721w;
        c40572pMo131541a.getClass();
        int i13 = c0801i.f2957g;
        C31983m2 c31983m2 = c40572pMo131541a.f174731h;
        C4516q c4516q = c40572pMo131541a.f174733j;
        if (c4516q != null) {
            c3185g = new C4517r(c34826l0, c40572pMo131541a, c0801i, c4516q);
        } else {
            c40572pMo131541a.f174728e.setSoTimeout(i13);
            C26637r0 c26637r0Timeout = ((C26621j0) c31983m2.f132769x).f105871w.timeout();
            long j7 = i13;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c26637r0Timeout.mo79277g(j7, timeUnit);
            ((C26617h0) c31983m2.f132770y).f105867w.timeout().mo79277g(c0801i.f2958h, timeUnit);
            c3185g = new C3185g(c34826l0, c40572pMo131541a, c31983m2);
        }
        C40563g c40563g = new C40563g(c40571o, c40571o.f174705E, interfaceC40564h, c3185g);
        c40571o.f174712L = c40563g;
        c40571o.f174719S = c40563g;
        synchronized (c40571o) {
            c40571o.f174713M = true;
            c40571o.f174714N = true;
        }
        if (c40571o.f174718R) {
            throw new IOException("Canceled");
        }
        return C0801i.m1938a(c0801i, 0, c40563g, null, 61).m1939b(c0801i.f2955e);
    }
}
