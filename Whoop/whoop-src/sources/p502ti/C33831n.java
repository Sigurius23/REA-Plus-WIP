package p502ti;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import p078d1.C11457j;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C33831n extends AbstractC33821d {

    /* JADX INFO: renamed from: i */
    public final PointF f141678i;

    /* JADX INFO: renamed from: j */
    public final PointF f141679j;

    /* JADX INFO: renamed from: k */
    public final C33825h f141680k;

    /* JADX INFO: renamed from: l */
    public final C33825h f141681l;

    /* JADX INFO: renamed from: m */
    public C11457j f141682m;

    /* JADX INFO: renamed from: n */
    public C11457j f141683n;

    public C33831n(C33825h c33825h, C33825h c33825h2) {
        super(Collections.EMPTY_LIST);
        this.f141678i = new PointF();
        this.f141679j = new PointF();
        this.f141680k = c33825h;
        this.f141681l = c33825h2;
        mo106985i(this.f141648d);
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: e */
    public final Object mo106981e() {
        return m106995l();
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo106982f(C13224a c13224a, float f13) {
        return m106995l();
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: i */
    public final void mo106985i(float f13) {
        C33825h c33825h = this.f141680k;
        c33825h.mo106985i(f13);
        C33825h c33825h2 = this.f141681l;
        c33825h2.mo106985i(f13);
        this.f141678i.set(((Float) c33825h.mo106981e()).floatValue(), ((Float) c33825h2.mo106981e()).floatValue());
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f141645a;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((InterfaceC33818a) arrayList.get(i13)).mo101529a();
            i13++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: l */
    public final PointF m106995l() {
        Float f13;
        Float f14 = null;
        if (this.f141682m != null) {
            C33825h c33825h = this.f141680k;
            C13224a c13224aMo9719b = c33825h.f141647c.mo9719b();
            if (c13224aMo9719b != null) {
                Float f15 = c13224aMo9719b.f45822h;
                C11457j c11457j = this.f141682m;
                float f16 = c13224aMo9719b.f45821g;
                f13 = (Float) c11457j.m30731A(f16, f15 == null ? f16 : f15.floatValue(), (Float) c13224aMo9719b.f45816b, (Float) c13224aMo9719b.f45817c, c33825h.m106979c(), c33825h.m106980d(), c33825h.f141648d);
            } else {
                f13 = null;
            }
        } else {
            f13 = null;
        }
        if (this.f141683n != null) {
            C33825h c33825h2 = this.f141681l;
            C13224a c13224aMo9719b2 = c33825h2.f141647c.mo9719b();
            if (c13224aMo9719b2 != null) {
                Float f17 = c13224aMo9719b2.f45822h;
                C11457j c11457j2 = this.f141683n;
                float f18 = c13224aMo9719b2.f45821g;
                f14 = (Float) c11457j2.m30731A(f18, f17 == null ? f18 : f17.floatValue(), (Float) c13224aMo9719b2.f45816b, (Float) c13224aMo9719b2.f45817c, c33825h2.m106979c(), c33825h2.m106980d(), c33825h2.f141648d);
            }
        }
        PointF pointF = this.f141678i;
        PointF pointF2 = this.f141679j;
        if (f13 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f13.floatValue(), 0.0f);
        }
        if (f14 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f14.floatValue());
        return pointF2;
    }

    /* JADX INFO: renamed from: m */
    public final void m106996m(C11457j c11457j) {
        C11457j c11457j2 = this.f141682m;
        if (c11457j2 != null) {
            c11457j2.getClass();
        }
        this.f141682m = c11457j;
    }

    /* JADX INFO: renamed from: n */
    public final void m106997n(C11457j c11457j) {
        C11457j c11457j2 = this.f141683n;
        if (c11457j2 != null) {
            c11457j2.getClass();
        }
        this.f141683n = c11457j;
    }
}
