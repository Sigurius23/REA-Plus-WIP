package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5153k0 {

    /* JADX INFO: renamed from: b */
    public static final C5178u f21534b = new C5178u(1);

    /* JADX INFO: renamed from: a */
    public final Object f21535a;

    public C5153k0(C5158m c5158m) {
        AbstractC5126b0.m16123a(c5158m, "output");
        this.f21535a = c5158m;
        c5158m.f21545b = this;
    }

    /* JADX INFO: renamed from: a */
    public static C5153k0 m16207a(C5158m c5158m) {
        C5153k0 c5153k0 = c5158m.f21545b;
        return c5153k0 != null ? c5153k0 : new C5153k0(c5158m);
    }

    /* JADX INFO: renamed from: b */
    public void m16208b(int i13, AbstractC5146i abstractC5146i) {
        C5158m c5158m = (C5158m) this.f21535a;
        c5158m.m16274y0(i13, 2);
        c5158m.m16275z0(abstractC5146i.size());
        C5143h c5143h = (C5143h) abstractC5146i;
        c5158m.m16268s0(c5143h.f21510z, c5143h.mo16167j(), c5143h.size());
    }

    /* JADX INFO: renamed from: c */
    public void m16209c(int i13) {
        ((C5158m) this.f21535a).m16274y0(i13, 4);
    }

    /* JADX INFO: renamed from: d */
    public void m16210d(int i13, int i14) {
        ((C5158m) this.f21535a).m16269t0(i13, i14);
    }

    /* JADX INFO: renamed from: e */
    public void m16211e(int i13, long j7) {
        ((C5158m) this.f21535a).m16271v0(i13, j7);
    }

    /* JADX INFO: renamed from: f */
    public void m16212f(int i13, Object obj, InterfaceC5124a1 interfaceC5124a1) {
        C5158m c5158m = (C5158m) this.f21535a;
        c5158m.m16274y0(i13, 3);
        interfaceC5124a1.mo16119h((AbstractC5122a) obj, c5158m.f21545b);
        c5158m.m16274y0(i13, 4);
    }

    /* JADX INFO: renamed from: g */
    public void m16213g(int i13, long j7) {
        ((C5158m) this.f21535a).m16264A0(i13, j7);
    }

    /* JADX INFO: renamed from: h */
    public void m16214h(int i13, Object obj, InterfaceC5124a1 interfaceC5124a1) {
        C5158m c5158m = (C5158m) this.f21535a;
        AbstractC5122a abstractC5122a = (AbstractC5122a) obj;
        c5158m.m16274y0(i13, 2);
        c5158m.m16275z0(abstractC5122a.mo16105b(interfaceC5124a1));
        interfaceC5124a1.mo16119h(abstractC5122a, c5158m.f21545b);
    }

    /* JADX INFO: renamed from: i */
    public void m16215i(int i13) {
        ((C5158m) this.f21535a).m16274y0(i13, 3);
    }

    public C5153k0() {
        InterfaceC5165o0 interfaceC5165o0;
        try {
            interfaceC5165o0 = (InterfaceC5165o0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC5165o0 = f21534b;
        }
        InterfaceC5165o0[] interfaceC5165o0Arr = {C5178u.f21589b, interfaceC5165o0};
        C5150j0 c5150j0 = new C5150j0();
        c5150j0.f21524a = interfaceC5165o0Arr;
        Charset charset = AbstractC5126b0.f21479a;
        this.f21535a = c5150j0;
    }
}
