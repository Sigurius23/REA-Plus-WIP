package p208i2;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: i2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17887h implements InterfaceC17906q0 {

    /* JADX INFO: renamed from: a */
    public final Paint f69578a;

    /* JADX INFO: renamed from: b */
    public int f69579b = 3;

    /* JADX INFO: renamed from: c */
    public Shader f69580c;

    /* JADX INFO: renamed from: d */
    public AbstractC17921y f69581d;

    /* JADX INFO: renamed from: e */
    public InterfaceC17912t0 f69582e;

    public C17887h(Paint paint) {
        this.f69578a = paint;
    }

    /* JADX INFO: renamed from: a */
    public final int m51443a() {
        Paint.Cap strokeCap = this.f69578a.getStrokeCap();
        int i13 = strokeCap == null ? -1 : AbstractC17889i.f69584a[strokeCap.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m51444b() {
        Paint.Join strokeJoin = this.f69578a.getStrokeJoin();
        int i13 = strokeJoin == null ? -1 : AbstractC17889i.f69585b[strokeJoin.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public final void m51445c(float f13) {
        this.f69578a.setAlpha((int) Math.rint(f13 * 255.0f));
    }

    /* JADX INFO: renamed from: d */
    public final void m51446d(int i13) {
        if (this.f69579b == i13) {
            return;
        }
        this.f69579b = i13;
        int i14 = Build.VERSION.SDK_INT;
        Paint paint = this.f69578a;
        if (i14 >= 29) {
            AbstractC17870b.m51408c(paint, i13);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC17870b.m51410e(i13)));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m51447e(long j7) {
        this.f69578a.setColor(AbstractC17918w0.m51506H(j7));
    }

    /* JADX INFO: renamed from: f */
    public final void m51448f(AbstractC17921y abstractC17921y) {
        this.f69581d = abstractC17921y;
        this.f69578a.setColorFilter(abstractC17921y != null ? abstractC17921y.f69663a : null);
    }

    /* JADX INFO: renamed from: g */
    public final void m51449g(int i13) {
        this.f69578a.setFilterBitmap(!(i13 == 0));
    }

    /* JADX INFO: renamed from: h */
    public final void m51450h(InterfaceC17912t0 interfaceC17912t0) {
        C17893k c17893k = (C17893k) interfaceC17912t0;
        this.f69578a.setPathEffect(c17893k != null ? c17893k.f69591a : null);
        this.f69582e = interfaceC17912t0;
    }

    /* JADX INFO: renamed from: i */
    public final void m51451i(Shader shader) {
        this.f69580c = shader;
        this.f69578a.setShader(shader);
    }

    /* JADX INFO: renamed from: j */
    public final void m51452j(int i13) {
        Paint.Cap cap;
        if (i13 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i13 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i13 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.f69578a.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: k */
    public final void m51453k(int i13) {
        Paint.Join join;
        if (i13 == 0) {
            join = Paint.Join.MITER;
        } else if (i13 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i13 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.f69578a.setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: l */
    public final void m51454l(float f13) {
        this.f69578a.setStrokeWidth(f13);
    }

    /* JADX INFO: renamed from: m */
    public final void m51455m(int i13) {
        this.f69578a.setStyle(i13 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
