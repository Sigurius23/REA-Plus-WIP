package p682zi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import dj.C12056a;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p462ri.C31441a;
import p502ti.AbstractC33821d;
import p502ti.C33835r;

/* JADX INFO: renamed from: zi.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C40658h extends AbstractC40652b {

    /* JADX INFO: renamed from: D */
    public final RectF f175537D;

    /* JADX INFO: renamed from: E */
    public final C31441a f175538E;

    /* JADX INFO: renamed from: F */
    public final float[] f175539F;

    /* JADX INFO: renamed from: G */
    public final Path f175540G;

    /* JADX INFO: renamed from: H */
    public final C40655e f175541H;

    /* JADX INFO: renamed from: I */
    public C33835r f175542I;

    /* JADX INFO: renamed from: J */
    public C33835r f175543J;

    public C40658h(C30402w c30402w, C40655e c40655e) {
        super(c30402w, c40655e);
        this.f175537D = new RectF();
        C31441a c31441a = new C31441a();
        this.f175538E = c31441a;
        this.f175539F = new float[8];
        this.f175540G = new Path();
        this.f175541H = c40655e;
        c31441a.setAlpha(0);
        c31441a.setStyle(Paint.Style.FILL);
        c31441a.setColor(c40655e.f175520l);
    }

    @Override // p682zi.AbstractC40652b, si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        super.mo101533e(rectF, matrix, z4);
        C40655e c40655e = this.f175541H;
        float f13 = c40655e.f175518j;
        float f14 = c40655e.f175519k;
        RectF rectF2 = this.f175537D;
        rectF2.set(0.0f, 0.0f, f13, f14);
        this.f175476n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // p682zi.AbstractC40652b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        if (obj == InterfaceC30372a0.f124614F) {
            if (c11457j == null) {
                this.f175542I = null;
                return;
            } else {
                this.f175542I = new C33835r(c11457j, null);
                return;
            }
        }
        if (obj == 1) {
            if (c11457j != null) {
                this.f175543J = new C33835r(c11457j, null);
                return;
            }
            this.f175543J = null;
            this.f175538E.setColor(this.f175541H.f175520l);
        }
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: i */
    public final void mo131928i(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        C40655e c40655e = this.f175541H;
        int iAlpha = Color.alpha(c40655e.f175520l);
        if (iAlpha == 0) {
            return;
        }
        C33835r c33835r = this.f175543J;
        Integer num = c33835r == null ? null : (Integer) c33835r.mo106981e();
        C31441a c31441a = this.f175538E;
        if (num != null) {
            c31441a.setColor(num.intValue());
        } else {
            c31441a.setColor(c40655e.f175520l);
        }
        AbstractC33821d abstractC33821d = this.f175485w.f141696j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (abstractC33821d == null ? 100 : ((Integer) abstractC33821d.mo106981e()).intValue())) / 100.0f) * (i13 / 255.0f) * 255.0f);
        c31441a.setAlpha(iIntValue);
        if (c12056a == null || Color.alpha(c12056a.f39979d) <= 0) {
            c31441a.clearShadowLayer();
        } else {
            c31441a.setShadowLayer(Math.max(c12056a.f39976a, Float.MIN_VALUE), c12056a.f39977b, c12056a.f39978c, c12056a.f39979d);
        }
        C33835r c33835r2 = this.f175542I;
        if (c33835r2 != null) {
            c31441a.setColorFilter((ColorFilter) c33835r2.mo106981e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f175539F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f13 = c40655e.f175518j;
            fArr[2] = f13;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            float f14 = c40655e.f175519k;
            fArr[5] = f14;
            fArr[6] = 0.0f;
            fArr[7] = f14;
            matrix.mapPoints(fArr);
            Path path = this.f175540G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c31441a);
        }
    }
}
