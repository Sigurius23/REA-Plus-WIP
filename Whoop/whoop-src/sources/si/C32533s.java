package si;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import dj.C12056a;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p462ri.C31441a;
import p502ti.AbstractC33821d;
import p502ti.C33822e;
import p502ti.C33835r;
import p649yi.C39561p;
import p682zi.AbstractC40652b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: si.s */
/* JADX INFO: loaded from: classes.dex */
public final class C32533s extends AbstractC32516b {

    /* JADX INFO: renamed from: q */
    public final AbstractC40652b f134829q;

    /* JADX INFO: renamed from: r */
    public final String f134830r;

    /* JADX INFO: renamed from: s */
    public final boolean f134831s;

    /* JADX INFO: renamed from: t */
    public final C33822e f134832t;

    /* JADX INFO: renamed from: u */
    public C33835r f134833u;

    public C32533s(C30402w c30402w, AbstractC40652b abstractC40652b, C39561p c39561p) {
        super(c30402w, abstractC40652b, AbstractC38963t7.m124371a(c39561p.f170205g), AbstractC38963t7.m124372b(c39561p.f170206h), c39561p.f170207i, c39561p.f170203e, c39561p.f170204f, c39561p.f170201c, c39561p.f170200b);
        this.f134829q = abstractC40652b;
        this.f134830r = c39561p.f170199a;
        this.f134831s = c39561p.f170208j;
        AbstractC33821d abstractC33821dMo84473k0 = c39561p.f170202d.mo84473k0();
        this.f134832t = (C33822e) abstractC33821dMo84473k0;
        abstractC33821dMo84473k0.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k0);
    }

    @Override // si.AbstractC32516b, si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        if (this.f134831s) {
            return;
        }
        C33822e c33822e = this.f134832t;
        int iM106988l = c33822e.m106988l(c33822e.f141647c.mo9719b(), c33822e.m106979c());
        C31441a c31441a = this.f134704i;
        c31441a.setColor(iM106988l);
        C33835r c33835r = this.f134833u;
        if (c33835r != null) {
            c31441a.setColorFilter((ColorFilter) c33835r.mo106981e());
        }
        super.mo101531c(canvas, matrix, i13, c12056a);
    }

    @Override // si.AbstractC32516b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        PointF pointF = InterfaceC30372a0.f124620a;
        C33822e c33822e = this.f134832t;
        if (obj == 2) {
            c33822e.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124614F) {
            C33835r c33835r = this.f134833u;
            AbstractC40652b abstractC40652b = this.f134829q;
            if (c33835r != null) {
                abstractC40652b.m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f134833u = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f134833u = c33835r2;
            c33835r2.m106977a(this);
            abstractC40652b.m131926f(c33822e);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134830r;
    }
}
