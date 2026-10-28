package fr;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import o73.C27648a;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: fr.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C14706q extends AbstractC14704o {

    /* JADX INFO: renamed from: b */
    public float f54369b;

    /* JADX INFO: renamed from: c */
    public float f54370c;

    /* JADX INFO: renamed from: d */
    public float f54371d;

    /* JADX INFO: renamed from: e */
    public boolean f54372e;

    /* JADX INFO: renamed from: f */
    public float f54373f;

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: a */
    public final void mo42131a(Canvas canvas, Rect rect, float f13, boolean z4, boolean z13) {
        this.f54369b = rect.width();
        C14710u c14710u = (C14710u) this.f54365a;
        float f14 = c14710u.f54312a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f14) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (c14710u.f54396j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f15 = this.f54369b / 2.0f;
        float f16 = f14 / 2.0f;
        canvas.clipRect(-f15, -f16, f15, f16);
        int i13 = c14710u.f54312a;
        int i14 = i13 / 2;
        int i15 = c14710u.f54313b;
        this.f54372e = i14 == i15;
        this.f54370c = i13 * f13;
        this.f54371d = Math.min(i13 / 2, i15) * f13;
        if (z4 || z13) {
            if ((z4 && c14710u.f54316e == 2) || (z13 && c14710u.f54317f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z4 || (z13 && c14710u.f54317f != 3)) {
                canvas.translate(0.0f, ((1.0f - f13) * c14710u.f54312a) / 2.0f);
            }
        }
        if (z13 && c14710u.f54317f == 3) {
            this.f54373f = f13;
        } else {
            this.f54373f = 1.0f;
        }
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: b */
    public final void mo42132b(Canvas canvas, Paint paint, int i13, int i14) {
        int iM96961m = AbstractC31484o.m96961m(i13, i14);
        C14710u c14710u = (C14710u) this.f54365a;
        if (c14710u.f54397k <= 0 || iM96961m == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM96961m);
        PointF pointF = new PointF((this.f54369b / 2.0f) - (this.f54370c / 2.0f), 0.0f);
        int i15 = c14710u.f54397k;
        m42148h(canvas, paint, pointF, null, i15, i15);
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: c */
    public final void mo42133c(Canvas canvas, Paint paint, C14703n c14703n, int i13) {
        int iM96961m = AbstractC31484o.m96961m(c14703n.f54363c, i13);
        float f13 = c14703n.f54361a;
        float f14 = c14703n.f54362b;
        int i14 = c14703n.f54364d;
        m42147g(canvas, paint, f13, f14, iM96961m, i14, i14);
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: d */
    public final void mo42134d(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        m42147g(canvas, paint, f13, f14, AbstractC31484o.m96961m(i13, i14), i15, i15);
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: e */
    public final int mo42135e() {
        return ((C14710u) this.f54365a).f54312a;
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: f */
    public final int mo42136f() {
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final void m42147g(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        float f15;
        float fM96938q = AbstractC31479j.m96938q(f13, 0.0f, 1.0f);
        float fM96938q2 = AbstractC31479j.m96938q(f14, 0.0f, 1.0f);
        float fM83569T = C27648a.m83569T(1.0f - this.f54373f, 1.0f, fM96938q);
        float fM83569T2 = C27648a.m83569T(1.0f - this.f54373f, 1.0f, fM96938q2);
        int iM96938q = (int) ((AbstractC31479j.m96938q(fM83569T, 0.0f, 0.01f) * i14) / 0.01f);
        float fM96938q3 = 1.0f - AbstractC31479j.m96938q(fM83569T2, 0.99f, 1.0f);
        float f16 = this.f54369b;
        int i16 = (int) ((fM83569T * f16) + iM96938q);
        int i17 = (int) ((fM83569T2 * f16) - ((int) ((fM96938q3 * i15) / 0.01f)));
        float f17 = (-f16) / 2.0f;
        if (i16 <= i17) {
            float f18 = this.f54371d;
            float f19 = i16 + f18;
            float f24 = i17 - f18;
            float f25 = f18 * 2.0f;
            paint.setColor(i13);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f54370c);
            if (f19 >= f24) {
                m42148h(canvas, paint, new PointF(f19 + f17, 0.0f), new PointF(f24 + f17, 0.0f), f25, this.f54370c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f54372e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f26 = f19 + f17;
            float f27 = f24 + f17;
            canvas.drawLine(f26, 0.0f, f27, 0.0f, paint);
            if (this.f54372e || this.f54371d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f19 > 0.0f) {
                f15 = f25;
                m42148h(canvas, paint, new PointF(f26, 0.0f), null, f15, this.f54370c);
            } else {
                f15 = f25;
            }
            if (f24 < this.f54369b) {
                m42148h(canvas, paint, new PointF(f27, 0.0f), null, f15, this.f54370c);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m42148h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f13, float f14) {
        float fMin = Math.min(f14, this.f54370c);
        float f15 = f13 / 2.0f;
        float fMin2 = Math.min(f15, (this.f54371d * fMin) / this.f54370c);
        RectF rectF = new RectF((-f13) / 2.0f, (-fMin) / 2.0f, f15, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
