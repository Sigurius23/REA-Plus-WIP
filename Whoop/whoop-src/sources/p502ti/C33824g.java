package p502ti;

import android.graphics.Color;
import android.graphics.Matrix;
import b30.C2570m;
import dj.C12056a;
import p078d1.C11457j;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: ti.g */
/* JADX INFO: loaded from: classes.dex */
public final class C33824g implements InterfaceC33818a {

    /* JADX INFO: renamed from: a */
    public final AbstractC40652b f141656a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40652b f141657b;

    /* JADX INFO: renamed from: c */
    public final C33822e f141658c;

    /* JADX INFO: renamed from: d */
    public final C33825h f141659d;

    /* JADX INFO: renamed from: e */
    public final C33825h f141660e;

    /* JADX INFO: renamed from: f */
    public final C33825h f141661f;

    /* JADX INFO: renamed from: g */
    public final C33825h f141662g;

    /* JADX INFO: renamed from: h */
    public Matrix f141663h;

    public C33824g(AbstractC40652b abstractC40652b, AbstractC40652b abstractC40652b2, C2570m c2570m) {
        this.f141657b = abstractC40652b;
        this.f141656a = abstractC40652b2;
        AbstractC33821d abstractC33821dMo84473k0 = c2570m.m7494u().mo84473k0();
        this.f141658c = (C33822e) abstractC33821dMo84473k0;
        abstractC33821dMo84473k0.m106977a(this);
        abstractC40652b2.m131926f(abstractC33821dMo84473k0);
        C33825h c33825hMo84473k0 = c2570m.m7474A().mo84473k0();
        this.f141659d = c33825hMo84473k0;
        c33825hMo84473k0.m106977a(this);
        abstractC40652b2.m131926f(c33825hMo84473k0);
        C33825h c33825hMo84473k1 = c2570m.m7495v().mo84473k0();
        this.f141660e = c33825hMo84473k1;
        c33825hMo84473k1.m106977a(this);
        abstractC40652b2.m131926f(c33825hMo84473k1);
        C33825h c33825hMo84473k2 = c2570m.m7496w().mo84473k0();
        this.f141661f = c33825hMo84473k2;
        c33825hMo84473k2.m106977a(this);
        abstractC40652b2.m131926f(c33825hMo84473k2);
        C33825h c33825hMo84473k3 = c2570m.m7477D().mo84473k0();
        this.f141662g = c33825hMo84473k3;
        c33825hMo84473k3.m106977a(this);
        abstractC40652b2.m131926f(c33825hMo84473k3);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f141657b.mo101529a();
    }

    /* JADX INFO: renamed from: b */
    public final C12056a m106989b(Matrix matrix, int i13) {
        float fM106991l = this.f141660e.m106991l() * 0.017453292f;
        float fFloatValue = ((Float) this.f141661f.mo106981e()).floatValue();
        double d3 = fM106991l;
        float fSin = ((float) Math.sin(d3)) * fFloatValue;
        float fCos = ((float) Math.cos(d3 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f141662g.mo106981e()).floatValue();
        int iIntValue = ((Integer) this.f141658c.mo106981e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f141659d.mo106981e()).floatValue() * i13) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        C12056a c12056a = new C12056a();
        c12056a.f39976a = fFloatValue2 * 0.33f;
        c12056a.f39977b = fSin;
        c12056a.f39978c = fCos;
        c12056a.f39979d = iArgb;
        c12056a.f39980e = null;
        c12056a.m33237c(matrix);
        if (this.f141663h == null) {
            this.f141663h = new Matrix();
        }
        this.f141656a.f175485w.m107002e().invert(this.f141663h);
        c12056a.m33237c(this.f141663h);
        return c12056a;
    }

    /* JADX INFO: renamed from: c */
    public final void m106990c(C11457j c11457j) {
        C33825h c33825h = this.f141659d;
        if (c11457j == null) {
            c33825h.m106986j(null);
        } else {
            c33825h.m106986j(new C33823f(c11457j, 0));
        }
    }
}
