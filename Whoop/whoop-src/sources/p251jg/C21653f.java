package p251jg;

import e73.C12803b;
import m83.AbstractC25260n;
import p048ce.AbstractC4482w;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17250k;
import p194hg.InterfaceC17244e;
import p194hg.InterfaceC17245f;
import p194hg.InterfaceC17252m;
import p194hg.InterfaceC17253n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C21653f implements InterfaceC17252m, InterfaceC17244e, InterfaceC17245f, InterfaceC17253n {

    /* JADX INFO: renamed from: w */
    public final C12803b f83167w = new C12803b(false);

    static {
        AbstractC25260n.m74059b1(new Double[]{Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY), Double.valueOf(Double.NaN)});
        AbstractC25260n.m74059b1(new Float[]{Float.valueOf(Float.NEGATIVE_INFINITY), Float.valueOf(Float.POSITIVE_INFINITY), Float.valueOf(Float.NaN)});
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: a */
    public final void mo30739a(C17248i c17248i, String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f83167w.m35874q(AbstractC4482w.m13980P(c17248i));
        m60924b(value);
    }

    /* JADX INFO: renamed from: b */
    public final void m60924b(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f83167w.m35875r(value);
    }

    @Override // p194hg.InterfaceC17252m
    /* JADX INFO: renamed from: e */
    public final InterfaceC17253n mo48823e(C17249j c17249j) {
        this.f83167w.m35863f();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // p194hg.InterfaceC17247h
    /* JADX INFO: renamed from: j */
    public final void mo48822j(C17250k c17250k) {
        c17250k.f66271b.invoke(this, c17250k.f66270a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: l */
    public final void mo30744l(C17248i c17248i, C17250k c17250k) {
        this.f83167w.m35874q(AbstractC4482w.m13980P(c17248i));
        c17250k.f66271b.invoke(this, c17250k.f66270a);
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: o */
    public final void mo30746o() {
        this.f83167w.m35868k();
    }

    @Override // p194hg.InterfaceC17245f
    /* JADX INFO: renamed from: p */
    public final void mo48821p(String key, String str) {
        AbstractC22676k.m65750j(key, "key");
        C12803b c12803b = this.f83167w;
        c12803b.m35874q(key);
        if (str != null) {
            m60924b(str);
        } else {
            c12803b.m35867j("null");
        }
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: r */
    public final void mo30748r(C17248i c17248i, boolean z4) {
        String strM13980P = AbstractC4482w.m13980P(c17248i);
        C12803b c12803b = this.f83167w;
        c12803b.m35874q(strM13980P);
        c12803b.m35867j(String.valueOf(z4));
    }
}
