package p208i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import p181h2.C16617b;
import p181h2.C16618c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17873c implements InterfaceC17915v {

    /* JADX INFO: renamed from: a */
    public Canvas f69556a = AbstractC17876d.f69560a;

    /* JADX INFO: renamed from: b */
    public Rect f69557b;

    /* JADX INFO: renamed from: c */
    public Rect f69558c;

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: a */
    public final void mo51411a(float f13, float f14) {
        this.f69556a.scale(f13, f14);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: b */
    public final void mo51412b(float f13, float f14, float f15, float f16, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.drawRect(f13, f14, f15, f16, ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: c */
    public final void mo51413c(C17885g c17885g, long j7, long j13, long j14, InterfaceC17906q0 interfaceC17906q0) {
        if (this.f69557b == null) {
            this.f69557b = new Rect();
            this.f69558c = new Rect();
        }
        Canvas canvas = this.f69556a;
        Bitmap bitmapM51527o = AbstractC17918w0.m51527o(c17885g);
        Rect rect = this.f69557b;
        AbstractC22676k.m65747g(rect);
        int i13 = (int) (j7 >> 32);
        rect.left = i13;
        int i14 = (int) (j7 & 4294967295L);
        rect.top = i14;
        rect.right = i13 + ((int) (j13 >> 32));
        rect.bottom = i14 + ((int) (j13 & 4294967295L));
        Rect rect2 = this.f69558c;
        AbstractC22676k.m65747g(rect2);
        int i15 = (int) 0;
        rect2.left = i15;
        int i16 = (int) 0;
        rect2.top = i16;
        rect2.right = i15 + ((int) (j14 >> 32));
        rect2.bottom = i16 + ((int) (4294967295L & j14));
        canvas.drawBitmap(bitmapM51527o, rect, rect2, ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: d */
    public final void mo51414d(C17885g c17885g, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.drawBitmap(AbstractC17918w0.m51527o(c17885g), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: e */
    public final void mo51415e(float f13, float f14, float f15, float f16, int i13) {
        this.f69556a.clipRect(f13, f14, f15, f16, i13 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: f */
    public final void mo51416f(float f13, float f14) {
        this.f69556a.translate(f13, f14);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: g */
    public final void mo51417g() {
        this.f69556a.restore();
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: i */
    public final void mo51418i() {
        AbstractC17918w0.m51530r(this.f69556a, true);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: j */
    public final void mo51419j(float f13) {
        this.f69556a.rotate(f13);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: k */
    public final void mo51420k(long j7, long j13, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.drawLine(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: l */
    public final void mo51421l(long j7, InterfaceC17906q0 interfaceC17906q0, float f13) {
        this.f69556a.drawCircle(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f13, ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: m */
    public final void mo51422m(ArrayList arrayList, InterfaceC17906q0 interfaceC17906q0) {
        if (AbstractC35902e.m113981u(1)) {
            m51431v(arrayList, interfaceC17906q0, 2);
            return;
        }
        if (AbstractC35902e.m113981u(2)) {
            m51431v(arrayList, interfaceC17906q0, 1);
            return;
        }
        if (AbstractC35902e.m113981u(0)) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                long j7 = ((C16617b) arrayList.get(i13)).f63937a;
                this.f69556a.drawPoint(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), ((C17887h) interfaceC17906q0).f69578a);
            }
        }
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: n */
    public final void mo51423n(InterfaceC17910s0 interfaceC17910s0, int i13) {
        Canvas canvas = this.f69556a;
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C17891j) interfaceC17910s0).f69587a, i13 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: o */
    public final void mo51424o(float f13, float f14, float f15, float f16, float f17, float f18, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.drawRoundRect(f13, f14, f15, f16, f17, f18, ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: p */
    public final void mo51425p(C16618c c16618c, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.saveLayer(c16618c.f63939a, c16618c.f63940b, c16618c.f63941c, c16618c.f63942d, ((C17887h) interfaceC17906q0).f69578a, 31);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: q */
    public final void mo51426q() {
        this.f69556a.save();
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: r */
    public final void mo51427r() {
        AbstractC17918w0.m51530r(this.f69556a, false);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: s */
    public final void mo51428s(float[] fArr) {
        if (AbstractC17918w0.m51534v(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC17918w0.m51499A(matrix, fArr);
        this.f69556a.concat(matrix);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: t */
    public final void mo51429t(InterfaceC17910s0 interfaceC17910s0, InterfaceC17906q0 interfaceC17906q0) {
        Canvas canvas = this.f69556a;
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C17891j) interfaceC17910s0).f69587a, ((C17887h) interfaceC17906q0).f69578a);
    }

    @Override // p208i2.InterfaceC17915v
    /* JADX INFO: renamed from: u */
    public final void mo51430u(float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, InterfaceC17906q0 interfaceC17906q0) {
        this.f69556a.drawArc(f13, f14, f15, f16, f17, f18, z4, ((C17887h) interfaceC17906q0).f69578a);
    }

    /* JADX INFO: renamed from: v */
    public final void m51431v(ArrayList arrayList, InterfaceC17906q0 interfaceC17906q0, int i13) {
        if (arrayList.size() >= 2) {
            Paint paint = ((C17887h) interfaceC17906q0).f69578a;
            int i14 = 0;
            while (i14 < arrayList.size() - 1) {
                long j7 = ((C16617b) arrayList.get(i14)).f63937a;
                long j13 = ((C16617b) arrayList.get(i14 + 1)).f63937a;
                this.f69556a.drawLine(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), paint);
                i14 += i13;
            }
        }
    }
}
