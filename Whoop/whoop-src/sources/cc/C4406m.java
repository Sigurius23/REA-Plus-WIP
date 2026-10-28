package cc;

import ae3.C0803k;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p002a0.C0022g;
import p463rj.AbstractC31484o;
import p543v4.C35645d;

/* JADX INFO: renamed from: cc.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C4406m {

    /* JADX INFO: renamed from: p */
    public static final Matrix f17781p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f17782a;

    /* JADX INFO: renamed from: b */
    public final Path f17783b;

    /* JADX INFO: renamed from: c */
    public final Matrix f17784c;

    /* JADX INFO: renamed from: d */
    public Paint f17785d;

    /* JADX INFO: renamed from: e */
    public Paint f17786e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f17787f;

    /* JADX INFO: renamed from: g */
    public final C4403j f17788g;

    /* JADX INFO: renamed from: h */
    public float f17789h;

    /* JADX INFO: renamed from: i */
    public float f17790i;

    /* JADX INFO: renamed from: j */
    public float f17791j;

    /* JADX INFO: renamed from: k */
    public float f17792k;

    /* JADX INFO: renamed from: l */
    public int f17793l;

    /* JADX INFO: renamed from: m */
    public String f17794m;

    /* JADX INFO: renamed from: n */
    public Boolean f17795n;

    /* JADX INFO: renamed from: o */
    public final C0022g f17796o;

    public C4406m() {
        this.f17784c = new Matrix();
        this.f17789h = 0.0f;
        this.f17790i = 0.0f;
        this.f17791j = 0.0f;
        this.f17792k = 0.0f;
        this.f17793l = 255;
        this.f17794m = null;
        this.f17795n = null;
        this.f17796o = new C0022g(0);
        this.f17788g = new C4403j();
        this.f17782a = new Path();
        this.f17783b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m13825a(C4403j c4403j, Matrix matrix, Canvas canvas, int i13, int i14) {
        int i15;
        float f13;
        int i16;
        Matrix matrix2 = c4403j.f17767a;
        ArrayList arrayList = c4403j.f17768b;
        matrix2.set(matrix);
        Matrix matrix3 = c4403j.f17767a;
        matrix3.preConcat(c4403j.f17776j);
        canvas.save();
        char c3 = 0;
        int i17 = 0;
        while (i17 < arrayList.size()) {
            AbstractC4404k abstractC4404k = (AbstractC4404k) arrayList.get(i17);
            if (abstractC4404k instanceof C4403j) {
                m13825a((C4403j) abstractC4404k, matrix3, canvas, i13, i14);
            } else {
                if (abstractC4404k instanceof AbstractC4405l) {
                    AbstractC4405l abstractC4405l = (AbstractC4405l) abstractC4404k;
                    float f14 = i13 / this.f17791j;
                    float f15 = i14 / this.f17792k;
                    float fMin = Math.min(f14, f15);
                    Matrix matrix4 = this.f17784c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f14, f15);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c3], fArr[1]);
                    boolean z4 = c3;
                    i15 = i17;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f16 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f16) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f17782a;
                        path.reset();
                        C35645d[] c35645dArr = abstractC4405l.f17778a;
                        if (c35645dArr != null) {
                            AbstractC31484o.m96973y(c35645dArr, path);
                        }
                        Path path2 = this.f17783b;
                        path2.reset();
                        if (abstractC4405l instanceof C4401h) {
                            path2.setFillType(abstractC4405l.f17780c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C4402i c4402i = (C4402i) abstractC4405l;
                            float f17 = c4402i.f17761i;
                            if (f17 != 0.0f || c4402i.f17762j != 1.0f) {
                                float f18 = c4402i.f17763k;
                                float f19 = (f17 + f18) % 1.0f;
                                float f24 = (c4402i.f17762j + f18) % 1.0f;
                                if (this.f17787f == null) {
                                    this.f17787f = new PathMeasure();
                                }
                                this.f17787f.setPath(path, z4);
                                float length = this.f17787f.getLength();
                                float f25 = f19 * length;
                                float f26 = f24 * length;
                                path.reset();
                                if (f25 > f26) {
                                    this.f17787f.getSegment(f25, length, path, true);
                                    f13 = 0.0f;
                                    this.f17787f.getSegment(0.0f, f26, path, true);
                                } else {
                                    f13 = 0.0f;
                                    this.f17787f.getSegment(f25, f26, path, true);
                                }
                                path.rLineTo(f13, f13);
                            }
                            path2.addPath(path, matrix4);
                            C0803k c0803k = c4402i.f17758f;
                            float f27 = 255.0f;
                            if (((Shader) c0803k.f2965c) == null && c0803k.f2964b == 0) {
                                f27 = 255.0f;
                                i16 = 16777215;
                            } else {
                                if (this.f17786e == null) {
                                    i16 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f17786e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i16 = 16777215;
                                }
                                Paint paint2 = this.f17786e;
                                Shader shader = (Shader) c0803k.f2965c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c4402i.f17760h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i18 = c0803k.f2964b;
                                    float f28 = c4402i.f17760h;
                                    PorterDuff.Mode mode = C4409p.f17810J;
                                    paint2.setColor((i18 & i16) | (((int) (Color.alpha(i18) * f28)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c4402i.f17780c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C0803k c0803k2 = c4402i.f17756d;
                            if (((Shader) c0803k2.f2965c) != null || c0803k2.f2964b != 0) {
                                if (this.f17785d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f17785d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f17785d;
                                Paint.Join join = c4402i.f17765m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c4402i.f17764l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c4402i.f17766n);
                                Shader shader2 = (Shader) c0803k2.f2965c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c4402i.f17759g * f27));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i19 = c0803k2.f2964b;
                                    float f29 = c4402i.f17759g;
                                    PorterDuff.Mode mode2 = C4409p.f17810J;
                                    paint4.setColor((i19 & i16) | (((int) (Color.alpha(i19) * f29)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c4402i.f17757e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i17 = i15 + 1;
                c3 = 0;
            }
            i15 = i17;
            i17 = i15 + 1;
            c3 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f17793l;
    }

    public void setAlpha(float f13) {
        setRootAlpha((int) (f13 * 255.0f));
    }

    public void setRootAlpha(int i13) {
        this.f17793l = i13;
    }

    public C4406m(C4406m c4406m) {
        this.f17784c = new Matrix();
        this.f17789h = 0.0f;
        this.f17790i = 0.0f;
        this.f17791j = 0.0f;
        this.f17792k = 0.0f;
        this.f17793l = 255;
        this.f17794m = null;
        this.f17795n = null;
        C0022g c0022g = new C0022g(0);
        this.f17796o = c0022g;
        this.f17788g = new C4403j(c4406m.f17788g, c0022g);
        this.f17782a = new Path(c4406m.f17782a);
        this.f17783b = new Path(c4406m.f17783b);
        this.f17789h = c4406m.f17789h;
        this.f17790i = c4406m.f17790i;
        this.f17791j = c4406m.f17791j;
        this.f17792k = c4406m.f17792k;
        this.f17793l = c4406m.f17793l;
        this.f17794m = c4406m.f17794m;
        String str = c4406m.f17794m;
        if (str != null) {
            c0022g.put(str, this);
        }
        this.f17795n = c4406m.f17795n;
    }
}
