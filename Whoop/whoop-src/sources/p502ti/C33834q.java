package p502ti;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p078d1.C11457j;
import p119ej.C13224a;
import p119ej.C13226c;
import p372ol.C28007b;
import p426qi.InterfaceC30372a0;
import p616xi.C38313a;
import p616xi.C38314b;
import p616xi.C38317e;
import p616xi.InterfaceC38318f;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: ti.q */
/* JADX INFO: loaded from: classes.dex */
public final class C33834q {

    /* JADX INFO: renamed from: a */
    public final Matrix f141687a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f141688b;

    /* JADX INFO: renamed from: c */
    public final Matrix f141689c;

    /* JADX INFO: renamed from: d */
    public final Matrix f141690d;

    /* JADX INFO: renamed from: e */
    public final float[] f141691e;

    /* JADX INFO: renamed from: f */
    public AbstractC33821d f141692f;

    /* JADX INFO: renamed from: g */
    public AbstractC33821d f141693g;

    /* JADX INFO: renamed from: h */
    public AbstractC33821d f141694h;

    /* JADX INFO: renamed from: i */
    public AbstractC33821d f141695i;

    /* JADX INFO: renamed from: j */
    public AbstractC33821d f141696j;

    /* JADX INFO: renamed from: k */
    public C33825h f141697k;

    /* JADX INFO: renamed from: l */
    public C33825h f141698l;

    /* JADX INFO: renamed from: m */
    public AbstractC33821d f141699m;

    /* JADX INFO: renamed from: n */
    public AbstractC33821d f141700n;

    /* JADX INFO: renamed from: o */
    public final boolean f141701o;

    public C33834q(C38317e c38317e) {
        C28007b c28007b = c38317e.f164196a;
        this.f141692f = c28007b == null ? null : c28007b.mo84473k0();
        InterfaceC38318f interfaceC38318f = c38317e.f164197b;
        this.f141693g = interfaceC38318f == null ? null : interfaceC38318f.mo84473k0();
        C38313a c38313a = c38317e.f164198c;
        this.f141694h = c38313a == null ? null : c38313a.mo84473k0();
        C38314b c38314b = c38317e.f164199d;
        this.f141695i = c38314b == null ? null : c38314b.mo84473k0();
        C38314b c38314b2 = c38317e.f164201f;
        C33825h c33825hMo84473k0 = c38314b2 == null ? null : c38314b2.mo84473k0();
        this.f141697k = c33825hMo84473k0;
        this.f141701o = c38317e.f164205j;
        if (c33825hMo84473k0 != null) {
            this.f141688b = new Matrix();
            this.f141689c = new Matrix();
            this.f141690d = new Matrix();
            this.f141691e = new float[9];
        } else {
            this.f141688b = null;
            this.f141689c = null;
            this.f141690d = null;
            this.f141691e = null;
        }
        C38314b c38314b3 = c38317e.f164202g;
        this.f141698l = c38314b3 == null ? null : c38314b3.mo84473k0();
        C38313a c38313a2 = c38317e.f164200e;
        if (c38313a2 != null) {
            this.f141696j = c38313a2.mo84473k0();
        }
        C38314b c38314b4 = c38317e.f164203h;
        if (c38314b4 != null) {
            this.f141699m = c38314b4.mo84473k0();
        } else {
            this.f141699m = null;
        }
        C38314b c38314b5 = c38317e.f164204i;
        if (c38314b5 != null) {
            this.f141700n = c38314b5.mo84473k0();
        } else {
            this.f141700n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m106998a(AbstractC40652b abstractC40652b) {
        abstractC40652b.m131926f(this.f141696j);
        abstractC40652b.m131926f(this.f141699m);
        abstractC40652b.m131926f(this.f141700n);
        abstractC40652b.m131926f(this.f141692f);
        abstractC40652b.m131926f(this.f141693g);
        abstractC40652b.m131926f(this.f141694h);
        abstractC40652b.m131926f(this.f141695i);
        abstractC40652b.m131926f(this.f141697k);
        abstractC40652b.m131926f(this.f141698l);
    }

    /* JADX INFO: renamed from: b */
    public final void m106999b(InterfaceC33818a interfaceC33818a) {
        AbstractC33821d abstractC33821d = this.f141696j;
        if (abstractC33821d != null) {
            abstractC33821d.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d2 = this.f141699m;
        if (abstractC33821d2 != null) {
            abstractC33821d2.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d3 = this.f141700n;
        if (abstractC33821d3 != null) {
            abstractC33821d3.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d4 = this.f141692f;
        if (abstractC33821d4 != null) {
            abstractC33821d4.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d5 = this.f141693g;
        if (abstractC33821d5 != null) {
            abstractC33821d5.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d6 = this.f141694h;
        if (abstractC33821d6 != null) {
            abstractC33821d6.m106977a(interfaceC33818a);
        }
        AbstractC33821d abstractC33821d7 = this.f141695i;
        if (abstractC33821d7 != null) {
            abstractC33821d7.m106977a(interfaceC33818a);
        }
        C33825h c33825h = this.f141697k;
        if (c33825h != null) {
            c33825h.m106977a(interfaceC33818a);
        }
        C33825h c33825h2 = this.f141698l;
        if (c33825h2 != null) {
            c33825h2.m106977a(interfaceC33818a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m107000c(C11457j c11457j, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == InterfaceC30372a0.f124620a) {
            AbstractC33821d abstractC33821d = this.f141692f;
            if (abstractC33821d == null) {
                this.f141692f = new C33835r(c11457j, new PointF());
                return true;
            }
            abstractC33821d.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124621b) {
            AbstractC33821d abstractC33821d2 = this.f141693g;
            if (abstractC33821d2 == null) {
                this.f141693g = new C33835r(c11457j, new PointF());
                return true;
            }
            abstractC33821d2.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124622c) {
            AbstractC33821d abstractC33821d3 = this.f141693g;
            if (abstractC33821d3 instanceof C33831n) {
                ((C33831n) abstractC33821d3).m106996m(c11457j);
                return true;
            }
        }
        if (obj == InterfaceC30372a0.f124623d) {
            AbstractC33821d abstractC33821d4 = this.f141693g;
            if (abstractC33821d4 instanceof C33831n) {
                ((C33831n) abstractC33821d4).m106997n(c11457j);
                return true;
            }
        }
        if (obj == InterfaceC30372a0.f124629j) {
            AbstractC33821d abstractC33821d5 = this.f141694h;
            if (abstractC33821d5 == null) {
                this.f141694h = new C33835r(c11457j, new C13226c());
                return true;
            }
            abstractC33821d5.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124630k) {
            AbstractC33821d abstractC33821d6 = this.f141695i;
            if (abstractC33821d6 == null) {
                this.f141695i = new C33835r(c11457j, fValueOf2);
                return true;
            }
            abstractC33821d6.m106986j(c11457j);
            return true;
        }
        if (obj == 3) {
            AbstractC33821d abstractC33821d7 = this.f141696j;
            if (abstractC33821d7 == null) {
                this.f141696j = new C33835r(c11457j, 100);
                return true;
            }
            abstractC33821d7.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124643x) {
            AbstractC33821d abstractC33821d8 = this.f141699m;
            if (abstractC33821d8 == null) {
                this.f141699m = new C33835r(c11457j, fValueOf);
                return true;
            }
            abstractC33821d8.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124644y) {
            AbstractC33821d abstractC33821d9 = this.f141700n;
            if (abstractC33821d9 == null) {
                this.f141700n = new C33835r(c11457j, fValueOf);
                return true;
            }
            abstractC33821d9.m106986j(c11457j);
            return true;
        }
        if (obj == InterfaceC30372a0.f124631l) {
            if (this.f141697k == null) {
                this.f141697k = new C33825h(Collections.singletonList(new C13224a(fValueOf2)));
            }
            this.f141697k.m106986j(c11457j);
            return true;
        }
        if (obj != InterfaceC30372a0.f124632m) {
            return false;
        }
        if (this.f141698l == null) {
            this.f141698l = new C33825h(Collections.singletonList(new C13224a(fValueOf2)));
        }
        this.f141698l.m106986j(c11457j);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m107001d() {
        for (int i13 = 0; i13 < 9; i13++) {
            this.f141691e[i13] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m107002e() {
        PointF pointF;
        C13226c c13226c;
        PointF pointF2;
        Matrix matrix = this.f141687a;
        matrix.reset();
        AbstractC33821d abstractC33821d = this.f141693g;
        if (abstractC33821d != null && (pointF2 = (PointF) abstractC33821d.mo106981e()) != null) {
            float f13 = pointF2.x;
            if (f13 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f13, pointF2.y);
            }
        }
        if (!this.f141701o) {
            AbstractC33821d abstractC33821d2 = this.f141695i;
            if (abstractC33821d2 != null) {
                float fFloatValue = abstractC33821d2 instanceof C33835r ? ((Float) abstractC33821d2.mo106981e()).floatValue() : ((C33825h) abstractC33821d2).m106991l();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC33821d != null) {
            float f14 = abstractC33821d.f141648d;
            PointF pointF3 = (PointF) abstractC33821d.mo106981e();
            float f15 = pointF3.x;
            float f16 = pointF3.y;
            abstractC33821d.mo106985i(1.0E-4f + f14);
            PointF pointF4 = (PointF) abstractC33821d.mo106981e();
            abstractC33821d.mo106985i(f14);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f16, pointF4.x - f15)));
        }
        C33825h c33825h = this.f141697k;
        if (c33825h != null) {
            C33825h c33825h2 = this.f141698l;
            float fCos = c33825h2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c33825h2.m106991l()) + 90.0f));
            C33825h c33825h3 = this.f141698l;
            float fSin = c33825h3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c33825h3.m106991l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c33825h.m106991l()));
            m107001d();
            float[] fArr = this.f141691e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f17 = -fSin;
            fArr[3] = f17;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f141688b;
            matrix2.setValues(fArr);
            m107001d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f141689c;
            matrix3.setValues(fArr);
            m107001d();
            fArr[0] = fCos;
            fArr[1] = f17;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f141690d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC33821d abstractC33821d3 = this.f141694h;
        if (abstractC33821d3 != null && (c13226c = (C13226c) abstractC33821d3.mo106981e()) != null) {
            float f18 = c13226c.f45838a;
            if (f18 != 1.0f || c13226c.f45839b != 1.0f) {
                matrix.preScale(f18, c13226c.f45839b);
            }
        }
        AbstractC33821d abstractC33821d4 = this.f141692f;
        if (abstractC33821d4 != null && (pointF = (PointF) abstractC33821d4.mo106981e()) != null) {
            float f19 = pointF.x;
            if (f19 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f19, -pointF.y);
            }
        }
        return matrix;
    }

    /* JADX INFO: renamed from: f */
    public final Matrix m107003f(float f13) {
        AbstractC33821d abstractC33821d = this.f141693g;
        PointF pointF = abstractC33821d == null ? null : (PointF) abstractC33821d.mo106981e();
        AbstractC33821d abstractC33821d2 = this.f141694h;
        C13226c c13226c = abstractC33821d2 == null ? null : (C13226c) abstractC33821d2.mo106981e();
        Matrix matrix = this.f141687a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f13, pointF.y * f13);
        }
        if (c13226c != null) {
            double d3 = f13;
            matrix.preScale((float) Math.pow(c13226c.f45838a, d3), (float) Math.pow(c13226c.f45839b, d3));
        }
        AbstractC33821d abstractC33821d3 = this.f141695i;
        if (abstractC33821d3 != null) {
            float fFloatValue = ((Float) abstractC33821d3.mo106981e()).floatValue();
            AbstractC33821d abstractC33821d4 = this.f141692f;
            PointF pointF2 = abstractC33821d4 != null ? (PointF) abstractC33821d4.mo106981e() : null;
            matrix.preRotate(fFloatValue * f13, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
