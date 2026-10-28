package dj;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.AbstractC1079m;
import bd3.C3143v;
import p108e4.AbstractC12682p;
import p462ri.C31441a;
import p543v4.AbstractC35644c;

/* JADX INFO: renamed from: dj.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12063h {

    /* JADX INFO: renamed from: B */
    public static final Matrix f40003B = new Matrix();

    /* JADX INFO: renamed from: A */
    public C12056a f40004A;

    /* JADX INFO: renamed from: a */
    public Canvas f40005a;

    /* JADX INFO: renamed from: b */
    public C3143v f40006b;

    /* JADX INFO: renamed from: c */
    public int f40007c;

    /* JADX INFO: renamed from: d */
    public RectF f40008d;

    /* JADX INFO: renamed from: e */
    public RectF f40009e;

    /* JADX INFO: renamed from: f */
    public Rect f40010f;

    /* JADX INFO: renamed from: g */
    public RectF f40011g;

    /* JADX INFO: renamed from: h */
    public RectF f40012h;

    /* JADX INFO: renamed from: i */
    public Rect f40013i;

    /* JADX INFO: renamed from: j */
    public RectF f40014j;

    /* JADX INFO: renamed from: k */
    public C31441a f40015k;

    /* JADX INFO: renamed from: l */
    public Bitmap f40016l;

    /* JADX INFO: renamed from: m */
    public Canvas f40017m;

    /* JADX INFO: renamed from: n */
    public Rect f40018n;

    /* JADX INFO: renamed from: o */
    public C31441a f40019o;

    /* JADX INFO: renamed from: p */
    public Matrix f40020p;

    /* JADX INFO: renamed from: q */
    public float[] f40021q;

    /* JADX INFO: renamed from: r */
    public Bitmap f40022r;

    /* JADX INFO: renamed from: s */
    public Bitmap f40023s;

    /* JADX INFO: renamed from: t */
    public Canvas f40024t;

    /* JADX INFO: renamed from: u */
    public Canvas f40025u;

    /* JADX INFO: renamed from: v */
    public C31441a f40026v;

    /* JADX INFO: renamed from: w */
    public BlurMaskFilter f40027w;

    /* JADX INFO: renamed from: x */
    public float f40028x = 0.0f;

    /* JADX INFO: renamed from: y */
    public RenderNode f40029y;

    /* JADX INFO: renamed from: z */
    public RenderNode f40030z;

    /* JADX INFO: renamed from: a */
    public static Bitmap m33258a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m33259d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    /* JADX INFO: renamed from: b */
    public final RectF m33260b(RectF rectF, C12056a c12056a) {
        if (this.f40009e == null) {
            this.f40009e = new RectF();
        }
        if (this.f40011g == null) {
            this.f40011g = new RectF();
        }
        this.f40009e.set(rectF);
        this.f40009e.offsetTo(rectF.left + c12056a.f39977b, rectF.top + c12056a.f39978c);
        RectF rectF2 = this.f40009e;
        float f13 = c12056a.f39976a;
        rectF2.inset(-f13, -f13);
        this.f40011g.set(rectF);
        this.f40009e.union(this.f40011g);
        return this.f40009e;
    }

    /* JADX INFO: renamed from: c */
    public final void m33261c() {
        float f13;
        C31441a c31441a;
        if (this.f40005a == null || this.f40006b == null || this.f40021q == null || this.f40008d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iM35485e = AbstractC12682p.m35485e(this.f40007c);
        if (iM35485e == 0 || iM35485e == 1) {
            this.f40005a.restore();
        } else {
            if (iM35485e != 2) {
                if (iM35485e == 3) {
                    if (this.f40029y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f40005a.save();
                    Canvas canvas = this.f40005a;
                    float[] fArr = this.f40021q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f40029y.endRecording();
                    if (this.f40006b.m9039h()) {
                        Canvas canvas2 = this.f40005a;
                        C12056a c12056a = (C12056a) this.f40006b.f12311y;
                        if (this.f40029y == null || this.f40030z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i13 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f40021q;
                        float f14 = fArr2 != null ? fArr2[0] : 1.0f;
                        f13 = fArr2 != null ? fArr2[4] : 1.0f;
                        C12056a c12056a2 = this.f40004A;
                        if (c12056a2 == null || c12056a.f39976a != c12056a2.f39976a || c12056a.f39977b != c12056a2.f39977b || c12056a.f39978c != c12056a2.f39978c || c12056a.f39979d != c12056a2.f39979d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c12056a.f39979d, PorterDuff.Mode.SRC_IN));
                            float f15 = c12056a.f39976a;
                            if (f15 > 0.0f) {
                                float f16 = ((f14 + f13) * f15) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f16, f16, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f40030z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.f40004A = c12056a;
                        }
                        RectF rectFM33260b = m33260b(this.f40008d, c12056a);
                        RectF rectF = new RectF(rectFM33260b.left * f14, rectFM33260b.top * f13, rectFM33260b.right * f14, rectFM33260b.bottom * f13);
                        this.f40030z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f40030z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((c12056a.f39977b * f14) + (-rectF.left), (c12056a.f39978c * f13) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f40029y);
                        this.f40030z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f40030z);
                        canvas2.restore();
                    }
                    this.f40005a.drawRenderNode(this.f40029y);
                    this.f40005a.restore();
                }
            } else {
                if (this.f40016l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f40006b.m9039h()) {
                    Canvas canvas3 = this.f40005a;
                    C12056a c12056a3 = (C12056a) this.f40006b.f12311y;
                    RectF rectF2 = this.f40008d;
                    if (rectF2 == null || this.f40016l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFM33260b2 = m33260b(rectF2, c12056a3);
                    if (this.f40010f == null) {
                        this.f40010f = new Rect();
                    }
                    this.f40010f.set((int) Math.floor(rectFM33260b2.left), (int) Math.floor(rectFM33260b2.top), (int) Math.ceil(rectFM33260b2.right), (int) Math.ceil(rectFM33260b2.bottom));
                    float[] fArr3 = this.f40021q;
                    float f17 = fArr3 != null ? fArr3[0] : 1.0f;
                    f13 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f40012h == null) {
                        this.f40012h = new RectF();
                    }
                    this.f40012h.set(rectFM33260b2.left * f17, rectFM33260b2.top * f13, rectFM33260b2.right * f17, rectFM33260b2.bottom * f13);
                    if (this.f40013i == null) {
                        this.f40013i = new Rect();
                    }
                    this.f40013i.set(0, 0, Math.round(this.f40012h.width()), Math.round(this.f40012h.height()));
                    if (m33259d(this.f40022r, this.f40012h)) {
                        Bitmap bitmap = this.f40022r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f40023s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f40022r = m33258a(this.f40012h, Bitmap.Config.ARGB_8888);
                        this.f40023s = m33258a(this.f40012h, Bitmap.Config.ALPHA_8);
                        this.f40024t = new Canvas(this.f40022r);
                        this.f40025u = new Canvas(this.f40023s);
                    } else {
                        Canvas canvas4 = this.f40024t;
                        if (canvas4 == null || this.f40025u == null || (c31441a = this.f40019o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f40013i, c31441a);
                        this.f40025u.drawRect(this.f40013i, this.f40019o);
                    }
                    if (this.f40023s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f40026v == null) {
                        this.f40026v = new C31441a(1);
                    }
                    RectF rectF3 = this.f40008d;
                    this.f40025u.drawBitmap(this.f40016l, Math.round((rectF3.left - rectFM33260b2.left) * f17), Math.round((rectF3.top - rectFM33260b2.top) * f13), (Paint) null);
                    if (this.f40027w == null || this.f40028x != c12056a3.f39976a) {
                        float f18 = ((f17 + f13) * c12056a3.f39976a) / 2.0f;
                        if (f18 > 0.0f) {
                            this.f40027w = new BlurMaskFilter(f18, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f40027w = null;
                        }
                        this.f40028x = c12056a3.f39976a;
                    }
                    this.f40026v.setColor(c12056a3.f39979d);
                    if (c12056a3.f39976a > 0.0f) {
                        this.f40026v.setMaskFilter(this.f40027w);
                    } else {
                        this.f40026v.setMaskFilter(null);
                    }
                    this.f40026v.setFilterBitmap(true);
                    this.f40024t.drawBitmap(this.f40023s, Math.round(c12056a3.f39977b * f17), Math.round(c12056a3.f39978c * f13), this.f40026v);
                    canvas3.drawBitmap(this.f40022r, this.f40013i, this.f40010f, this.f40015k);
                }
                if (this.f40018n == null) {
                    this.f40018n = new Rect();
                }
                this.f40018n.set(0, 0, (int) (this.f40008d.width() * this.f40021q[0]), (int) (this.f40008d.height() * this.f40021q[4]));
                this.f40005a.drawBitmap(this.f40016l, this.f40018n, this.f40008d, this.f40015k);
            }
        }
        this.f40005a = null;
    }

    /* JADX INFO: renamed from: e */
    public final Canvas m33262e(Canvas canvas, RectF rectF, C3143v c3143v) {
        if (this.f40005a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f40021q == null) {
            this.f40021q = new float[9];
        }
        if (this.f40020p == null) {
            this.f40020p = new Matrix();
        }
        canvas.getMatrix(this.f40020p);
        this.f40020p.getValues(this.f40021q);
        float[] fArr = this.f40021q;
        float f13 = fArr[0];
        int i13 = 4;
        float f14 = fArr[4];
        if (this.f40014j == null) {
            this.f40014j = new RectF();
        }
        this.f40014j.set(rectF.left * f13, rectF.top * f14, rectF.right * f13, rectF.bottom * f14);
        this.f40005a = canvas;
        this.f40006b = c3143v;
        if (c3143v.f12310x >= 255 && !c3143v.m9039h()) {
            i13 = 1;
        } else if (c3143v.m9039h()) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 29 || !canvas.isHardwareAccelerated() || i14 <= 31) {
                i13 = 3;
            }
        } else {
            i13 = 2;
        }
        this.f40007c = i13;
        if (this.f40008d == null) {
            this.f40008d = new RectF();
        }
        this.f40008d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f40015k == null) {
            this.f40015k = new C31441a();
        }
        this.f40015k.reset();
        int iM35485e = AbstractC12682p.m35485e(this.f40007c);
        if (iM35485e == 0) {
            canvas.save();
            return canvas;
        }
        if (iM35485e == 1) {
            this.f40015k.setAlpha(c3143v.f12310x);
            this.f40015k.setColorFilter(null);
            C31441a c31441a = this.f40015k;
            Matrix matrix = AbstractC12064i.f40031a;
            canvas.saveLayer(rectF, c31441a);
            return canvas;
        }
        Matrix matrix2 = f40003B;
        if (iM35485e == 2) {
            if (this.f40019o == null) {
                C31441a c31441a2 = new C31441a();
                this.f40019o = c31441a2;
                c31441a2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (m33259d(this.f40016l, this.f40014j)) {
                Bitmap bitmap = this.f40016l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f40016l = m33258a(this.f40014j, Bitmap.Config.ARGB_8888);
                this.f40017m = new Canvas(this.f40016l);
            } else {
                Canvas canvas2 = this.f40017m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f40017m.drawRect(-1.0f, -1.0f, this.f40014j.width() + 1.0f, this.f40014j.height() + 1.0f, this.f40019o);
            }
            AbstractC35644c.m112843a(0, this.f40015k);
            this.f40015k.setColorFilter(null);
            this.f40015k.setAlpha(c3143v.f12310x);
            Canvas canvas3 = this.f40017m;
            canvas3.scale(f13, f14);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iM35485e != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f40029y == null) {
            this.f40029y = AbstractC1079m.m3213a();
        }
        if (c3143v.m9039h() && this.f40030z == null) {
            this.f40030z = AbstractC1079m.m3216d();
            this.f40004A = null;
        }
        this.f40029y.setAlpha(c3143v.f12310x / 255.0f);
        if (c3143v.m9039h()) {
            RenderNode renderNode = this.f40030z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(c3143v.f12310x / 255.0f);
        }
        this.f40029y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f40029y;
        RectF rectF2 = this.f40014j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f40029y.beginRecording((int) this.f40014j.width(), (int) this.f40014j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f13, f14);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
