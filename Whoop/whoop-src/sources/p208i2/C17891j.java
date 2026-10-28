package p208i2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p181h2.C16618c;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17891j implements InterfaceC17910s0 {

    /* JADX INFO: renamed from: a */
    public final Path f69587a;

    /* JADX INFO: renamed from: b */
    public RectF f69588b;

    /* JADX INFO: renamed from: c */
    public float[] f69589c;

    /* JADX INFO: renamed from: d */
    public Matrix f69590d;

    public C17891j(Path path) {
        this.f69587a = path;
    }

    /* JADX INFO: renamed from: n */
    public static void m51456n(C16618c c16618c) {
        if (Float.isNaN(c16618c.f63939a) || Float.isNaN(c16618c.f63940b) || Float.isNaN(c16618c.f63941c) || Float.isNaN(c16618c.f63942d)) {
            AbstractC17897m.m51480c("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m51457d(InterfaceC17910s0 interfaceC17910s0, long j7) {
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f69587a.addPath(((C17891j) interfaceC17910s0).f69587a, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX INFO: renamed from: e */
    public final void m51458e(C16618c c16618c, float f13, float f14) {
        float f15 = c16618c.f63939a;
        float f16 = c16618c.f63940b;
        float f17 = c16618c.f63941c;
        float f18 = c16618c.f63942d;
        if (this.f69588b == null) {
            this.f69588b = new RectF();
        }
        RectF rectF = this.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(f15, f16, f17, f18);
        RectF rectF2 = this.f69588b;
        AbstractC22676k.m65747g(rectF2);
        this.f69587a.arcTo(rectF2, f13, f14, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m51459f() {
        this.f69587a.close();
    }

    /* JADX INFO: renamed from: g */
    public final C16618c m51460g() {
        if (this.f69588b == null) {
            this.f69588b = new RectF();
        }
        RectF rectF = this.f69588b;
        AbstractC22676k.m65747g(rectF);
        this.f69587a.computeBounds(rectF, true);
        return new C16618c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: h */
    public final void m51461h(float f13, float f14) {
        this.f69587a.lineTo(f13, f14);
    }

    /* JADX INFO: renamed from: i */
    public final void m51462i(float f13, float f14) {
        this.f69587a.moveTo(f13, f14);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m51463j(InterfaceC17910s0 interfaceC17910s0, InterfaceC17910s0 interfaceC17910s1, int i13) {
        Path.Op op3;
        if (AbstractC35785b.m113420o(i13, 0)) {
            op3 = Path.Op.DIFFERENCE;
        } else if (AbstractC35785b.m113420o(i13, 1)) {
            op3 = Path.Op.INTERSECT;
        } else if (AbstractC35785b.m113420o(i13, 4)) {
            op3 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op3 = AbstractC35785b.m113420o(i13, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C17891j) interfaceC17910s0).f69587a;
        if (interfaceC17910s1 instanceof C17891j) {
            return this.f69587a.op(path, ((C17891j) interfaceC17910s1).f69587a, op3);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: k */
    public final void m51464k() {
        this.f69587a.reset();
    }

    /* JADX INFO: renamed from: l */
    public final void m51465l(int i13) {
        this.f69587a.setFillType(i13 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* JADX INFO: renamed from: m */
    public final void m51466m(long j7) {
        Matrix matrix = this.f69590d;
        if (matrix == null) {
            this.f69590d = new Matrix();
        } else {
            AbstractC22676k.m65747g(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f69590d;
        AbstractC22676k.m65747g(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        Matrix matrix3 = this.f69590d;
        AbstractC22676k.m65747g(matrix3);
        this.f69587a.transform(matrix3);
    }
}
