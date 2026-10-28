package si;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import dj.AbstractC12062g;
import dj.C12056a;
import java.util.ArrayList;
import java.util.List;
import p002a0.C0062y;
import p078d1.C11457j;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p462ri.C31441a;
import p502ti.AbstractC33821d;
import p502ti.C33822e;
import p502ti.C33825h;
import p502ti.C33826i;
import p502ti.C33835r;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p649yi.C39548c;
import p649yi.C39549d;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.h */
/* JADX INFO: loaded from: classes.dex */
public final class C32522h implements InterfaceC32519e, InterfaceC33818a, InterfaceC32525k {

    /* JADX INFO: renamed from: a */
    public final String f134744a;

    /* JADX INFO: renamed from: b */
    public final boolean f134745b;

    /* JADX INFO: renamed from: c */
    public final AbstractC40652b f134746c;

    /* JADX INFO: renamed from: d */
    public final C0062y f134747d = new C0062y((Object) null);

    /* JADX INFO: renamed from: e */
    public final C0062y f134748e = new C0062y((Object) null);

    /* JADX INFO: renamed from: f */
    public final Path f134749f;

    /* JADX INFO: renamed from: g */
    public final C31441a f134750g;

    /* JADX INFO: renamed from: h */
    public final RectF f134751h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f134752i;

    /* JADX INFO: renamed from: j */
    public final int f134753j;

    /* JADX INFO: renamed from: k */
    public final C33826i f134754k;

    /* JADX INFO: renamed from: l */
    public final C33822e f134755l;

    /* JADX INFO: renamed from: m */
    public final C33826i f134756m;

    /* JADX INFO: renamed from: n */
    public final C33826i f134757n;

    /* JADX INFO: renamed from: o */
    public C33835r f134758o;

    /* JADX INFO: renamed from: p */
    public C33835r f134759p;

    /* JADX INFO: renamed from: q */
    public final C30402w f134760q;

    /* JADX INFO: renamed from: r */
    public final int f134761r;

    /* JADX INFO: renamed from: s */
    public AbstractC33821d f134762s;

    /* JADX INFO: renamed from: t */
    public float f134763t;

    public C32522h(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b, C39549d c39549d) {
        Path path = new Path();
        this.f134749f = path;
        this.f134750g = new C31441a(1);
        this.f134751h = new RectF();
        this.f134752i = new ArrayList();
        this.f134763t = 0.0f;
        this.f134746c = abstractC40652b;
        this.f134744a = c39549d.f170140g;
        this.f134745b = c39549d.f170141h;
        this.f134760q = c30402w;
        this.f134753j = c39549d.f170134a;
        path.setFillType(c39549d.f170135b);
        this.f134761r = (int) (c30387i.m92859b() / 32.0f);
        AbstractC33821d abstractC33821dMo84473k0 = c39549d.f170136c.mo84473k0();
        this.f134754k = (C33826i) abstractC33821dMo84473k0;
        abstractC33821dMo84473k0.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k0);
        AbstractC33821d abstractC33821dMo84473k1 = c39549d.f170137d.mo84473k0();
        this.f134755l = (C33822e) abstractC33821dMo84473k1;
        abstractC33821dMo84473k1.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k1);
        AbstractC33821d abstractC33821dMo84473k2 = c39549d.f170138e.mo84473k0();
        this.f134756m = (C33826i) abstractC33821dMo84473k2;
        abstractC33821dMo84473k2.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k2);
        AbstractC33821d abstractC33821dMo84473k3 = c39549d.f170139f.mo84473k0();
        this.f134757n = (C33826i) abstractC33821dMo84473k3;
        abstractC33821dMo84473k3.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k3);
        if (abstractC40652b.mo131929j() != null) {
            C33825h c33825hMo84473k0 = abstractC40652b.mo131929j().m108296l().mo84473k0();
            this.f134762s = c33825hMo84473k0;
            c33825hMo84473k0.m106977a(this);
            abstractC40652b.m131926f(this.f134762s);
        }
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134760q.invalidateSelf();
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) list2.get(i13);
            if (interfaceC32517c instanceof InterfaceC32527m) {
                this.f134752i.add((InterfaceC32527m) interfaceC32517c);
            }
        }
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f134745b) {
            return;
        }
        Path path = this.f134749f;
        path.reset();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f134752i;
            if (i14 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC32527m) arrayList.get(i14)).getPath(), matrix);
            i14++;
        }
        path.computeBounds(this.f134751h, false);
        int i15 = this.f134753j;
        C33826i c33826i = this.f134754k;
        C33826i c33826i2 = this.f134757n;
        C33826i c33826i3 = this.f134756m;
        if (i15 == 1) {
            long jM101538h = m101538h();
            C0062y c0062y = this.f134747d;
            linearGradient = (LinearGradient) c0062y.m151c(jM101538h);
            if (linearGradient == null) {
                PointF pointF = (PointF) c33826i3.mo106981e();
                PointF pointF2 = (PointF) c33826i2.mo106981e();
                C39548c c39548c = (C39548c) c33826i.mo106981e();
                int[] iArrM101537f = m101537f(c39548c.f170133b);
                float[] fArr2 = c39548c.f170132a;
                if (iArrM101537f.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrM101537f[0], iArrM101537f[0]};
                } else {
                    iArr2 = iArrM101537f;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                c0062y.m155g(jM101538h, linearGradient);
            }
        } else {
            long jM101538h2 = m101538h();
            C0062y c0062y2 = this.f134748e;
            RadialGradient radialGradient = (RadialGradient) c0062y2.m151c(jM101538h2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) c33826i3.mo106981e();
                PointF pointF4 = (PointF) c33826i2.mo106981e();
                C39548c c39548c2 = (C39548c) c33826i.mo106981e();
                int[] iArrM101537f2 = m101537f(c39548c2.f170133b);
                float[] fArr3 = c39548c2.f170132a;
                if (iArrM101537f2.length < 2) {
                    iArr = new int[]{iArrM101537f2[0], iArrM101537f2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrM101537f2;
                }
                float f13 = pointF3.x;
                float f14 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f13, pointF4.y - f14);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f13, f14, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                c0062y2.m155g(jM101538h2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        C31441a c31441a = this.f134750g;
        c31441a.setShader(linearGradient);
        C33835r c33835r = this.f134758o;
        if (c33835r != null) {
            c31441a.setColorFilter((ColorFilter) c33835r.mo106981e());
        }
        AbstractC33821d abstractC33821d = this.f134762s;
        if (abstractC33821d != null) {
            float fFloatValue = ((Float) abstractC33821d.mo106981e()).floatValue();
            if (fFloatValue == 0.0f) {
                c31441a.setMaskFilter(null);
            } else if (fFloatValue != this.f134763t) {
                c31441a.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f134763t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f134755l.mo106981e()).intValue() / 100.0f;
        c31441a.setAlpha(AbstractC12062g.m33253c((int) (i13 * fIntValue)));
        if (c12056a != null) {
            c12056a.m33235a((int) (fIntValue * 255.0f), c31441a);
        }
        canvas.drawPath(path, c31441a);
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, this);
    }

    @Override // si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        Path path = this.f134749f;
        path.reset();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f134752i;
            if (i13 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC32527m) arrayList.get(i13)).getPath(), matrix);
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int[] m101537f(int[] iArr) {
        C33835r c33835r = this.f134759p;
        if (c33835r != null) {
            Integer[] numArr = (Integer[]) c33835r.mo106981e();
            int i13 = 0;
            if (iArr.length == numArr.length) {
                while (i13 < iArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i13 < numArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            }
        }
        return iArr;
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        PointF pointF = InterfaceC30372a0.f124620a;
        if (obj == 4) {
            this.f134755l.m106986j(c11457j);
            return;
        }
        ColorFilter colorFilter = InterfaceC30372a0.f124614F;
        AbstractC40652b abstractC40652b = this.f134746c;
        if (obj == colorFilter) {
            C33835r c33835r = this.f134758o;
            if (c33835r != null) {
                abstractC40652b.m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f134758o = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f134758o = c33835r2;
            c33835r2.m106977a(this);
            abstractC40652b.m131926f(this.f134758o);
            return;
        }
        if (obj != InterfaceC30372a0.f124615G) {
            if (obj == InterfaceC30372a0.f124624e) {
                AbstractC33821d abstractC33821d = this.f134762s;
                if (abstractC33821d != null) {
                    abstractC33821d.m106986j(c11457j);
                    return;
                }
                C33835r c33835r3 = new C33835r(c11457j, null);
                this.f134762s = c33835r3;
                c33835r3.m106977a(this);
                abstractC40652b.m131926f(this.f134762s);
                return;
            }
            return;
        }
        C33835r c33835r4 = this.f134759p;
        if (c33835r4 != null) {
            abstractC40652b.m131932m(c33835r4);
        }
        if (c11457j == null) {
            this.f134759p = null;
            return;
        }
        this.f134747d.m149a();
        this.f134748e.m149a();
        C33835r c33835r5 = new C33835r(c11457j, null);
        this.f134759p = c33835r5;
        c33835r5.m106977a(this);
        abstractC40652b.m131926f(this.f134759p);
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134744a;
    }

    /* JADX INFO: renamed from: h */
    public final int m101538h() {
        float f13 = this.f134756m.f141648d;
        float f14 = this.f134761r;
        int iRound = Math.round(f13 * f14);
        int iRound2 = Math.round(this.f134757n.f141648d * f14);
        int iRound3 = Math.round(this.f134754k.f141648d * f14);
        int i13 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i13 = i13 * 31 * iRound2;
        }
        return iRound3 != 0 ? i13 * 31 * iRound3 : i13;
    }
}
