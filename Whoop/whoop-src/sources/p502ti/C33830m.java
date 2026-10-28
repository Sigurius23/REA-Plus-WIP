package p502ti;

import android.graphics.Path;
import android.graphics.PointF;
import dj.AbstractC12058c;
import dj.AbstractC12062g;
import java.util.ArrayList;
import java.util.List;
import p031b9.AbstractC2875y;
import p078d1.C11457j;
import p119ej.C13224a;
import p584wi.C37301a;
import p649yi.C39557l;
import si.C32531q;

/* JADX INFO: renamed from: ti.m */
/* JADX INFO: loaded from: classes.dex */
public final class C33830m extends AbstractC33821d {

    /* JADX INFO: renamed from: i */
    public final C39557l f141673i;

    /* JADX INFO: renamed from: j */
    public final Path f141674j;

    /* JADX INFO: renamed from: k */
    public Path f141675k;

    /* JADX INFO: renamed from: l */
    public Path f141676l;

    /* JADX INFO: renamed from: m */
    public ArrayList f141677m;

    public C33830m(List list) {
        super(list);
        this.f141673i = new C39557l();
        this.f141674j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        C39557l c39557l;
        C39557l c39557l2;
        int i13;
        int i14;
        C39557l c39557l3;
        C39557l c39557l4;
        C39557l c39557l5 = (C39557l) c13224a.f45816b;
        C39557l c39557l6 = (C39557l) c13224a.f45817c;
        C39557l c39557l7 = c39557l6 == null ? c39557l5 : c39557l6;
        C39557l c39557l8 = this.f141673i;
        ArrayList arrayList = c39557l8.f170183a;
        if (c39557l8.f170184b == null) {
            c39557l8.f170184b = new PointF();
        }
        boolean z4 = c39557l5.f170185c;
        ArrayList arrayList2 = c39557l5.f170183a;
        boolean z13 = true;
        c39557l8.f170185c = z4 || c39557l7.f170185c;
        int size = arrayList2.size();
        ArrayList arrayList3 = c39557l7.f170183a;
        if (size != arrayList3.size()) {
            AbstractC12058c.m33239b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new C37301a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = c39557l5.f170184b;
        PointF pointF2 = c39557l7.f170184b;
        c39557l8.m126329a(AbstractC12062g.m33256f(pointF.x, pointF2.x, f13), AbstractC12062g.m33256f(pointF.y, pointF2.y, f13));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            C37301a c37301a = (C37301a) arrayList2.get(size4);
            C37301a c37301a2 = (C37301a) arrayList3.get(size4);
            PointF pointF3 = c37301a.f159492a;
            PointF pointF4 = c37301a.f159493b;
            PointF pointF5 = c37301a.f159494c;
            boolean z14 = z13;
            PointF pointF6 = c37301a2.f159492a;
            PointF pointF7 = c37301a2.f159493b;
            PointF pointF8 = c37301a2.f159494c;
            ((C37301a) arrayList.get(size4)).f159492a.set(AbstractC12062g.m33256f(pointF3.x, pointF6.x, f13), AbstractC12062g.m33256f(pointF3.y, pointF6.y, f13));
            ((C37301a) arrayList.get(size4)).f159493b.set(AbstractC12062g.m33256f(pointF4.x, pointF7.x, f13), AbstractC12062g.m33256f(pointF4.y, pointF7.y, f13));
            ((C37301a) arrayList.get(size4)).f159494c.set(AbstractC12062g.m33256f(pointF5.x, pointF8.x, f13), AbstractC12062g.m33256f(pointF5.y, pointF8.y, f13));
            size4--;
            z13 = z14;
            arrayList2 = arrayList2;
            c39557l8 = c39557l8;
            arrayList3 = arrayList3;
        }
        C39557l c39557l9 = c39557l8;
        boolean z15 = z13;
        ArrayList arrayList4 = this.f141677m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            c39557l = c39557l9;
            while (true) {
                ArrayList arrayList5 = c39557l.f170183a;
                if (size5 < 0) {
                    break;
                }
                C32531q c32531q = (C32531q) this.f141677m.get(size5);
                c32531q.getClass();
                if (arrayList5.size() <= 2) {
                    i13 = size5;
                } else {
                    float fFloatValue = ((Float) c32531q.f134820b.mo106981e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i13 = size5;
                    } else {
                        boolean z16 = c39557l.f170185c;
                        int size6 = arrayList5.size() - 1;
                        int i15 = 0;
                        while (size6 >= 0) {
                            C37301a c37301a3 = (C37301a) arrayList5.get(size6);
                            C37301a c37301a4 = (C37301a) arrayList5.get(C32531q.m101543d(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z16) ? c37301a4.f159494c : c39557l.f170184b;
                            int i16 = size5;
                            i15 = (((size6 != 0 || z16) ? c37301a4.f159493b : pointF9).equals(pointF9) && c37301a3.f159492a.equals(pointF9) && !((c39557l.f170185c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z15)) ? i15 + 2 : i15 + 1;
                            size6--;
                            size5 = i16;
                        }
                        i13 = size5;
                        C39557l c39557l10 = c32531q.f134821c;
                        if (c39557l10 == null || c39557l10.f170183a.size() != i15) {
                            ArrayList arrayList6 = new ArrayList(i15);
                            for (int i17 = 0; i17 < i15; i17++) {
                                arrayList6.add(new C37301a());
                            }
                            i14 = 0;
                            c32531q.f134821c = new C39557l(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i14 = 0;
                        }
                        C39557l c39557l11 = c32531q.f134821c;
                        c39557l11.f170185c = z16;
                        PointF pointF10 = c39557l.f170184b;
                        c39557l11.m126329a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = c39557l11.f170183a;
                        boolean z17 = c39557l.f170185c;
                        int i18 = i14;
                        int i19 = i18;
                        while (i18 < arrayList5.size()) {
                            C37301a c37301a5 = (C37301a) arrayList5.get(i18);
                            C37301a c37301a6 = (C37301a) arrayList5.get(C32531q.m101543d(i18 - 1, arrayList5.size()));
                            C37301a c37301a7 = (C37301a) arrayList5.get(C32531q.m101543d(i18 - 2, arrayList5.size()));
                            PointF pointF11 = (i18 != 0 || z17) ? c37301a6.f159494c : c39557l.f170184b;
                            PointF pointF12 = (i18 != 0 || z17) ? c37301a6.f159493b : pointF11;
                            float f14 = fFloatValue;
                            PointF pointF13 = c37301a5.f159492a;
                            PointF pointF14 = c37301a7.f159494c;
                            boolean z18 = z17;
                            PointF pointF15 = c37301a5.f159494c;
                            boolean z19 = (c39557l.f170185c || !(i18 == 0 || i18 == arrayList5.size() + (-1))) ? false : z15;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z19) {
                                float f15 = pointF11.x;
                                float f16 = f15 - pointF14.x;
                                float f17 = pointF11.y;
                                float f18 = f17 - pointF14.y;
                                float f19 = pointF15.x - f15;
                                float f24 = pointF15.y - f17;
                                double d3 = f16;
                                C39557l c39557l12 = c39557l11;
                                C39557l c39557l13 = c39557l;
                                float fHypot = (float) Math.hypot(d3, f18);
                                float fHypot2 = (float) Math.hypot(f19, f24);
                                float fMin = Math.min(f14 / fHypot, 0.5f);
                                float fMin2 = Math.min(f14 / fHypot2, 0.5f);
                                float f25 = pointF11.x;
                                float fM8288a = AbstractC2875y.m8288a(pointF14.x, f25, fMin, f25);
                                float f26 = pointF11.y;
                                float fM8288a2 = AbstractC2875y.m8288a(pointF14.y, f26, fMin, f26);
                                float fM8288a3 = AbstractC2875y.m8288a(pointF15.x, f25, fMin2, f25);
                                float fM8288a4 = AbstractC2875y.m8288a(pointF15.y, f26, fMin2, f26);
                                float f27 = fM8288a - ((fM8288a - f25) * 0.5519f);
                                float f28 = fM8288a2 - ((fM8288a2 - f26) * 0.5519f);
                                float f29 = fM8288a3 - ((fM8288a3 - f25) * 0.5519f);
                                float f34 = fM8288a4 - ((fM8288a4 - f26) * 0.5519f);
                                C37301a c37301a8 = (C37301a) arrayList7.get(C32531q.m101543d(i19 - 1, arrayList7.size()));
                                C37301a c37301a9 = (C37301a) arrayList7.get(i19);
                                c39557l4 = c39557l13;
                                c37301a8.f159493b.set(fM8288a, fM8288a2);
                                c37301a8.f159494c.set(fM8288a, fM8288a2);
                                c39557l3 = c39557l12;
                                if (i18 == 0) {
                                    c39557l3.m126329a(fM8288a, fM8288a2);
                                }
                                c37301a9.f159492a.set(f27, f28);
                                C37301a c37301a10 = (C37301a) arrayList7.get(i19 + 1);
                                c37301a9.f159493b.set(f29, f34);
                                c37301a9.f159494c.set(fM8288a3, fM8288a4);
                                c37301a10.f159492a.set(fM8288a3, fM8288a4);
                                i19 += 2;
                            } else {
                                c39557l3 = c39557l11;
                                c39557l4 = c39557l;
                                C37301a c37301a11 = (C37301a) arrayList7.get(C32531q.m101543d(i19 - 1, arrayList7.size()));
                                C37301a c37301a12 = (C37301a) arrayList7.get(i19);
                                PointF pointF16 = c37301a6.f159493b;
                                c37301a11.f159493b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c37301a6.f159494c;
                                c37301a11.f159494c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c37301a5.f159492a;
                                c37301a12.f159492a.set(pointF18.x, pointF18.y);
                                i19++;
                            }
                            i18++;
                            c39557l11 = c39557l3;
                            c39557l5 = c39557l5;
                            arrayList5 = arrayList5;
                            fFloatValue = f14;
                            z17 = z18;
                            c39557l6 = c39557l6;
                            c39557l = c39557l4;
                        }
                        c39557l = c39557l11;
                    }
                }
                size5 = i13 - 1;
                c39557l5 = c39557l5;
                c39557l6 = c39557l6;
            }
        } else {
            c39557l = c39557l9;
        }
        C39557l c39557l14 = c39557l5;
        C39557l c39557l15 = c39557l6;
        Path path = this.f141674j;
        AbstractC12062g.m33255e(c39557l, path);
        if (this.f141649e == null) {
            return path;
        }
        if (this.f141675k == null) {
            this.f141675k = new Path();
            this.f141676l = new Path();
        }
        AbstractC12062g.m33255e(c39557l14, this.f141675k);
        if (c39557l15 != null) {
            c39557l2 = c39557l15;
            AbstractC12062g.m33255e(c39557l2, this.f141676l);
        } else {
            c39557l2 = c39557l15;
        }
        C11457j c11457j = this.f141649e;
        float f35 = c13224a.f45821g;
        float fFloatValue2 = c13224a.f45822h.floatValue();
        C39557l c39557l16 = c39557l2;
        Path path2 = this.f141675k;
        return (Path) c11457j.m30731A(f35, fFloatValue2, path2, c39557l16 == null ? path2 : this.f141676l, f13, m106980d(), this.f141648d);
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: k */
    public final boolean mo106987k() {
        ArrayList arrayList = this.f141677m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
