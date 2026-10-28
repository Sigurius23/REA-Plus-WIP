package kr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p258jr.C21890a;

/* JADX INFO: renamed from: kr.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C22796o extends AbstractC22801t {

    /* JADX INFO: renamed from: c */
    public final C22798q f89793c;

    public C22796o(C22798q c22798q) {
        this.f89793c = c22798q;
    }

    @Override // kr.AbstractC22801t
    /* JADX INFO: renamed from: a */
    public final void mo66032a(Matrix matrix, C21890a c21890a, int i13, Canvas canvas) {
        C22798q c22798q = this.f89793c;
        float f13 = c22798q.f89802f;
        float f14 = c22798q.f89803g;
        RectF rectF = new RectF(c22798q.f89798b, c22798q.f89799c, c22798q.f89800d, c22798q.f89801e);
        Paint paint = c21890a.f84583b;
        boolean z4 = f14 < 0.0f;
        Path path = c21890a.f84588g;
        int[] iArr = C21890a.f84580k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = c21890a.f84587f;
            iArr[2] = c21890a.f84586e;
            iArr[3] = c21890a.f84585d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f13, f14);
            path.close();
            float f15 = -i13;
            rectF.inset(f15, f15);
            iArr[0] = 0;
            iArr[1] = c21890a.f84585d;
            iArr[2] = c21890a.f84586e;
            iArr[3] = c21890a.f84587f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f16 = 1.0f - (i13 / fWidth);
        float[] fArr = C21890a.f84581l;
        fArr[1] = f16;
        fArr[2] = ((1.0f - f16) / 2.0f) + f16;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c21890a.f84589h);
        }
        canvas.drawArc(rectF, f13, f14, true, paint);
        canvas.restore();
    }
}
