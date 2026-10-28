package kr;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p258jr.C21890a;

/* JADX INFO: renamed from: kr.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C22797p extends AbstractC22801t {

    /* JADX INFO: renamed from: c */
    public final C22799r f89794c;

    /* JADX INFO: renamed from: d */
    public final float f89795d;

    /* JADX INFO: renamed from: e */
    public final float f89796e;

    public C22797p(C22799r c22799r, float f13, float f14) {
        this.f89794c = c22799r;
        this.f89795d = f13;
        this.f89796e = f14;
    }

    @Override // kr.AbstractC22801t
    /* JADX INFO: renamed from: a */
    public final void mo66032a(Matrix matrix, C21890a c21890a, int i13, Canvas canvas) {
        C22799r c22799r = this.f89794c;
        float f13 = c22799r.f89805c;
        float f14 = this.f89796e;
        float f15 = c22799r.f89804b;
        float f16 = this.f89795d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f13 - f14, f15 - f16), 0.0f);
        Matrix matrix2 = this.f89808a;
        matrix2.set(matrix);
        matrix2.preTranslate(f16, f14);
        matrix2.preRotate(m66033b());
        c21890a.getClass();
        rectF.bottom += i13;
        rectF.offset(0.0f, -i13);
        int i14 = c21890a.f84587f;
        int[] iArr = C21890a.f84578i;
        iArr[0] = i14;
        iArr[1] = c21890a.f84586e;
        iArr[2] = c21890a.f84585d;
        Paint paint = c21890a.f84584c;
        float f17 = rectF.left;
        paint.setShader(new LinearGradient(f17, rectF.top, f17, rectF.bottom, iArr, C21890a.f84579j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m66033b() {
        C22799r c22799r = this.f89794c;
        return (float) Math.toDegrees(Math.atan((c22799r.f89805c - this.f89796e) / (c22799r.f89804b - this.f89795d)));
    }
}
