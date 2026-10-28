package si;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import dj.C12056a;
import p002a0.C0062y;
import p078d1.C11457j;
import p108e4.AbstractC12682p;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.AbstractC33821d;
import p502ti.C33826i;
import p502ti.C33835r;
import p649yi.C39548c;
import p649yi.C39550e;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C32523i extends AbstractC32516b {

    /* JADX INFO: renamed from: A */
    public C33835r f134764A;

    /* JADX INFO: renamed from: q */
    public final String f134765q;

    /* JADX INFO: renamed from: r */
    public final boolean f134766r;

    /* JADX INFO: renamed from: s */
    public final C0062y f134767s;

    /* JADX INFO: renamed from: t */
    public final C0062y f134768t;

    /* JADX INFO: renamed from: u */
    public final RectF f134769u;

    /* JADX INFO: renamed from: v */
    public final int f134770v;

    /* JADX INFO: renamed from: w */
    public final int f134771w;

    /* JADX INFO: renamed from: x */
    public final C33826i f134772x;

    /* JADX INFO: renamed from: y */
    public final C33826i f134773y;

    /* JADX INFO: renamed from: z */
    public final C33826i f134774z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32523i(C30402w c30402w, AbstractC40652b abstractC40652b, C39550e c39550e) {
        Paint.Join join;
        Paint.Join join2;
        int iM35485e = AbstractC12682p.m35485e(c39550e.f170149h);
        Paint.Cap cap = iM35485e != 0 ? iM35485e != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM35485e2 = AbstractC12682p.m35485e(c39550e.f170150i);
        if (iM35485e2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iM35485e2 != 1) {
                if (iM35485e2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(c30402w, abstractC40652b, cap, join2, c39550e.f170151j, c39550e.f170145d, c39550e.f170148g, c39550e.f170152k, c39550e.f170153l);
                this.f134767s = new C0062y((Object) null);
                this.f134768t = new C0062y((Object) null);
                this.f134769u = new RectF();
                this.f134765q = c39550e.f170142a;
                this.f134770v = c39550e.f170143b;
                this.f134766r = c39550e.f170154m;
                this.f134771w = (int) (c30402w.f124769w.m92859b() / 32.0f);
                AbstractC33821d abstractC33821dMo84473k0 = c39550e.f170144c.mo84473k0();
                this.f134772x = (C33826i) abstractC33821dMo84473k0;
                abstractC33821dMo84473k0.m106977a(this);
                abstractC40652b.m131926f(abstractC33821dMo84473k0);
                AbstractC33821d abstractC33821dMo84473k1 = c39550e.f170146e.mo84473k0();
                this.f134773y = (C33826i) abstractC33821dMo84473k1;
                abstractC33821dMo84473k1.m106977a(this);
                abstractC40652b.m131926f(abstractC33821dMo84473k1);
                AbstractC33821d abstractC33821dMo84473k2 = c39550e.f170147f.mo84473k0();
                this.f134774z = (C33826i) abstractC33821dMo84473k2;
                abstractC33821dMo84473k2.m106977a(this);
                abstractC40652b.m131926f(abstractC33821dMo84473k2);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(c30402w, abstractC40652b, cap, join2, c39550e.f170151j, c39550e.f170145d, c39550e.f170148g, c39550e.f170152k, c39550e.f170153l);
        this.f134767s = new C0062y((Object) null);
        this.f134768t = new C0062y((Object) null);
        this.f134769u = new RectF();
        this.f134765q = c39550e.f170142a;
        this.f134770v = c39550e.f170143b;
        this.f134766r = c39550e.f170154m;
        this.f134771w = (int) (c30402w.f124769w.m92859b() / 32.0f);
        AbstractC33821d abstractC33821dMo84473k3 = c39550e.f170144c.mo84473k0();
        this.f134772x = (C33826i) abstractC33821dMo84473k3;
        abstractC33821dMo84473k3.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k3);
        AbstractC33821d abstractC33821dMo84473k4 = c39550e.f170146e.mo84473k0();
        this.f134773y = (C33826i) abstractC33821dMo84473k4;
        abstractC33821dMo84473k4.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k4);
        AbstractC33821d abstractC33821dMo84473k5 = c39550e.f170147f.mo84473k0();
        this.f134774z = (C33826i) abstractC33821dMo84473k5;
        abstractC33821dMo84473k5.m106977a(this);
        abstractC40652b.m131926f(abstractC33821dMo84473k5);
    }

    @Override // si.AbstractC32516b, si.InterfaceC32519e
    /* JADX INFO: renamed from: c */
    public final void mo101531c(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        Shader shader;
        Shader radialGradient;
        if (this.f134766r) {
            return;
        }
        mo101533e(this.f134769u, matrix, false);
        int i14 = this.f134770v;
        C33826i c33826i = this.f134772x;
        C33826i c33826i2 = this.f134774z;
        C33826i c33826i3 = this.f134773y;
        if (i14 == 1) {
            long jM101540h = m101540h();
            C0062y c0062y = this.f134767s;
            shader = (LinearGradient) c0062y.m151c(jM101540h);
            if (shader == null) {
                PointF pointF = (PointF) c33826i3.mo106981e();
                PointF pointF2 = (PointF) c33826i2.mo106981e();
                C39548c c39548c = (C39548c) c33826i.mo106981e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m101539f(c39548c.f170133b), c39548c.f170132a, Shader.TileMode.CLAMP);
                c0062y.m155g(jM101540h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jM101540h2 = m101540h();
            C0062y c0062y2 = this.f134768t;
            shader = (RadialGradient) c0062y2.m151c(jM101540h2);
            if (shader == null) {
                PointF pointF3 = (PointF) c33826i3.mo106981e();
                PointF pointF4 = (PointF) c33826i2.mo106981e();
                C39548c c39548c2 = (C39548c) c33826i.mo106981e();
                int[] iArrM101539f = m101539f(c39548c2.f170133b);
                float[] fArr = c39548c2.f170132a;
                float f13 = pointF3.x;
                float f14 = pointF3.y;
                radialGradient = new RadialGradient(f13, f14, (float) Math.hypot(pointF4.x - f13, pointF4.y - f14), iArrM101539f, fArr, Shader.TileMode.CLAMP);
                c0062y2.m155g(jM101540h2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f134704i.setShader(shader);
        super.mo101531c(canvas, matrix, i13, c12056a);
    }

    /* JADX INFO: renamed from: f */
    public final int[] m101539f(int[] iArr) {
        C33835r c33835r = this.f134764A;
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

    @Override // si.AbstractC32516b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        if (obj == InterfaceC30372a0.f124615G) {
            C33835r c33835r = this.f134764A;
            AbstractC40652b abstractC40652b = this.f134701f;
            if (c33835r != null) {
                abstractC40652b.m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f134764A = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f134764A = c33835r2;
            c33835r2.m106977a(this);
            abstractC40652b.m131926f(this.f134764A);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134765q;
    }

    /* JADX INFO: renamed from: h */
    public final int m101540h() {
        float f13 = this.f134773y.f141648d;
        float f14 = this.f134771w;
        int iRound = Math.round(f13 * f14);
        int iRound2 = Math.round(this.f134774z.f141648d * f14);
        int iRound3 = Math.round(this.f134772x.f141648d * f14);
        int i13 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i13 = i13 * 31 * iRound2;
        }
        return iRound3 != 0 ? i13 * 31 * iRound3 : i13;
    }
}
