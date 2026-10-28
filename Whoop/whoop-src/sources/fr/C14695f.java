package fr;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o73.C27648a;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: fr.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14695f extends AbstractC14704o {

    /* JADX INFO: renamed from: b */
    public float f54319b;

    /* JADX INFO: renamed from: c */
    public float f54320c;

    /* JADX INFO: renamed from: d */
    public float f54321d;

    /* JADX INFO: renamed from: e */
    public boolean f54322e;

    /* JADX INFO: renamed from: f */
    public float f54323f;

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: a */
    public final void mo42131a(Canvas canvas, Rect rect, float f13, boolean z4, boolean z13) {
        float fWidth = rect.width() / m42139i();
        float fHeight = rect.height() / m42139i();
        C14698i c14698i = (C14698i) this.f54365a;
        float f14 = (c14698i.f54339h / 2.0f) + c14698i.f54340i;
        canvas.translate((f14 * fWidth) + rect.left, (f14 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (c14698i.f54341j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f15 = -f14;
        canvas.clipRect(f15, f15, f14, f14);
        int i13 = c14698i.f54312a;
        int i14 = i13 / 2;
        int i15 = c14698i.f54313b;
        this.f54322e = i14 <= i15;
        this.f54319b = i13 * f13;
        this.f54320c = Math.min(i13 / 2, i15) * f13;
        int i16 = c14698i.f54339h;
        int i17 = c14698i.f54312a;
        float f16 = (i16 - i17) / 2.0f;
        this.f54321d = f16;
        if (z4 || z13) {
            if ((z4 && c14698i.f54316e == 2) || (z13 && c14698i.f54317f == 1)) {
                this.f54321d = (((1.0f - f13) * i17) / 2.0f) + f16;
            } else if ((z4 && c14698i.f54316e == 1) || (z13 && c14698i.f54317f == 2)) {
                this.f54321d = f16 - (((1.0f - f13) * i17) / 2.0f);
            }
        }
        if (z13 && c14698i.f54317f == 3) {
            this.f54323f = f13;
        } else {
            this.f54323f = 1.0f;
        }
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: b */
    public final void mo42132b(Canvas canvas, Paint paint, int i13, int i14) {
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: c */
    public final void mo42133c(Canvas canvas, Paint paint, C14703n c14703n, int i13) {
        int iM96961m = AbstractC31484o.m96961m(c14703n.f54363c, i13);
        float f13 = c14703n.f54361a;
        float f14 = c14703n.f54362b;
        int i14 = c14703n.f54364d;
        m42137g(canvas, paint, f13, f14, iM96961m, i14, i14);
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: d */
    public final void mo42134d(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        m42137g(canvas, paint, f13, f14, AbstractC31484o.m96961m(i13, i14), i15, i15);
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: e */
    public final int mo42135e() {
        return m42139i();
    }

    @Override // fr.AbstractC14704o
    /* JADX INFO: renamed from: f */
    public final int mo42136f() {
        return m42139i();
    }

    /* JADX INFO: renamed from: g */
    public final void m42137g(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        float f15 = f14 >= f13 ? f14 - f13 : (f14 + 1.0f) - f13;
        float f16 = f13 % 1.0f;
        if (this.f54323f < 1.0f) {
            float f17 = f16 + f15;
            if (f17 > 1.0f) {
                m42137g(canvas, paint, f16, 1.0f, i13, i14, 0);
                m42137g(canvas, paint, 1.0f, f17, i13, 0, i15);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f54320c / this.f54321d);
        if (f16 == 0.0f && f15 >= 0.99f) {
            f15 += (((degrees * 2.0f) / 360.0f) * (f15 - 0.99f)) / 0.01f;
        }
        float fM83569T = C27648a.m83569T(1.0f - this.f54323f, 1.0f, f16);
        float fM83569T2 = C27648a.m83569T(0.0f, this.f54323f, f15);
        float degrees2 = (float) Math.toDegrees(i14 / this.f54321d);
        float degrees3 = ((fM83569T2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i15 / this.f54321d));
        float f18 = (fM83569T * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i13);
        paint.setStrokeWidth(this.f54319b);
        float f19 = degrees * 2.0f;
        if (degrees3 < f19) {
            float f24 = degrees3 / f19;
            paint.setStyle(Paint.Style.FILL);
            m42138h(canvas, paint, (degrees * f24) + f18, this.f54320c * 2.0f, this.f54319b, f24);
            return;
        }
        float f25 = this.f54321d;
        float f26 = -f25;
        RectF rectF = new RectF(f26, f26, f25, f25);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f54322e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f27 = f18 + degrees;
        canvas.drawArc(rectF, f27, degrees3 - f19, false, paint);
        if (this.f54322e || this.f54320c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m42138h(canvas, paint, f27, this.f54320c * 2.0f, this.f54319b, 1.0f);
        m42138h(canvas, paint, (f18 + degrees3) - degrees, this.f54320c * 2.0f, this.f54319b, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m42138h(Canvas canvas, Paint paint, float f13, float f14, float f15, float f16) {
        float fMin = (int) Math.min(f15, this.f54319b);
        float f17 = f14 / 2.0f;
        float fMin2 = Math.min(f17, (this.f54320c * fMin) / this.f54319b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f14) / 2.0f, fMin / 2.0f, f17);
        canvas.save();
        double d3 = f13;
        canvas.translate((float) (Math.cos(Math.toRadians(d3)) * ((double) this.f54321d)), (float) (Math.sin(Math.toRadians(d3)) * ((double) this.f54321d)));
        canvas.rotate(f13);
        canvas.scale(f16, f16);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: i */
    public final int m42139i() {
        AbstractC14694e abstractC14694e = this.f54365a;
        return (((C14698i) abstractC14694e).f54340i * 2) + ((C14698i) abstractC14694e).f54339h;
    }
}
