package p426qi;

import ad3.C0783z;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.lifecycle.RunnableC1645z0;
import b30.C2570m;
import bj.AbstractC3319r;
import dj.AbstractC12058c;
import dj.AbstractC12062g;
import dj.AbstractC12064i;
import dj.ChoreographerFrameCallbackC12060e;
import dj.ThreadFactoryC12059d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p462ri.C31441a;
import p581we.C37199o;
import p584wi.C37305e;
import p584wi.C37308h;
import p616xi.C38317e;
import p682zi.C40653c;
import p682zi.C40655e;
import vi.C36055a;

/* JADX INFO: renamed from: qi.w */
/* JADX INFO: loaded from: classes.dex */
public final class C30402w extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: q0 */
    public static final List f124729q0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: r0 */
    public static final ThreadPoolExecutor f124730r0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC12059d());

    /* JADX INFO: renamed from: E */
    public boolean f124731E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f124732F;

    /* JADX INFO: renamed from: G */
    public C36055a f124733G;

    /* JADX INFO: renamed from: H */
    public String f124734H;

    /* JADX INFO: renamed from: I */
    public C2570m f124735I;

    /* JADX INFO: renamed from: J */
    public Map f124736J;

    /* JADX INFO: renamed from: K */
    public String f124737K;

    /* JADX INFO: renamed from: L */
    public final C0783z f124738L;

    /* JADX INFO: renamed from: M */
    public boolean f124739M;

    /* JADX INFO: renamed from: N */
    public boolean f124740N;

    /* JADX INFO: renamed from: O */
    public C40653c f124741O;

    /* JADX INFO: renamed from: P */
    public int f124742P;

    /* JADX INFO: renamed from: Q */
    public boolean f124743Q;

    /* JADX INFO: renamed from: R */
    public boolean f124744R;

    /* JADX INFO: renamed from: S */
    public boolean f124745S;

    /* JADX INFO: renamed from: T */
    public boolean f124746T;

    /* JADX INFO: renamed from: U */
    public boolean f124747U;

    /* JADX INFO: renamed from: V */
    public EnumC30384g0 f124748V;

    /* JADX INFO: renamed from: W */
    public boolean f124749W;

    /* JADX INFO: renamed from: X */
    public final Matrix f124750X;

    /* JADX INFO: renamed from: Y */
    public Bitmap f124751Y;

    /* JADX INFO: renamed from: Z */
    public Canvas f124752Z;

    /* JADX INFO: renamed from: a0 */
    public Rect f124753a0;

    /* JADX INFO: renamed from: b0 */
    public RectF f124754b0;

    /* JADX INFO: renamed from: c0 */
    public C31441a f124755c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f124756d0;

    /* JADX INFO: renamed from: e0 */
    public Rect f124757e0;

    /* JADX INFO: renamed from: f0 */
    public RectF f124758f0;

    /* JADX INFO: renamed from: g0 */
    public RectF f124759g0;

    /* JADX INFO: renamed from: h0 */
    public Matrix f124760h0;

    /* JADX INFO: renamed from: i0 */
    public final float[] f124761i0;

    /* JADX INFO: renamed from: j0 */
    public Matrix f124762j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f124763k0;

    /* JADX INFO: renamed from: l0 */
    public EnumC30371a f124764l0;

    /* JADX INFO: renamed from: m0 */
    public final Semaphore f124765m0;

    /* JADX INFO: renamed from: n0 */
    public final RunnableC1645z0 f124766n0;

    /* JADX INFO: renamed from: o0 */
    public float f124767o0;

    /* JADX INFO: renamed from: p0 */
    public int f124768p0;

    /* JADX INFO: renamed from: w */
    public C30387i f124769w;

    /* JADX INFO: renamed from: x */
    public final ChoreographerFrameCallbackC12060e f124770x;

    /* JADX INFO: renamed from: y */
    public final boolean f124771y;

    /* JADX INFO: renamed from: z */
    public boolean f124772z;

    public C30402w() {
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = new ChoreographerFrameCallbackC12060e();
        this.f124770x = choreographerFrameCallbackC12060e;
        this.f124771y = true;
        this.f124772z = false;
        this.f124731E = false;
        this.f124768p0 = 1;
        this.f124732F = new ArrayList();
        this.f124738L = new C0783z(27);
        this.f124739M = false;
        this.f124740N = true;
        this.f124742P = 255;
        this.f124747U = false;
        this.f124748V = EnumC30384g0.f124675w;
        this.f124749W = false;
        this.f124750X = new Matrix();
        this.f124761i0 = new float[9];
        this.f124763k0 = false;
        C30398s c30398s = new C30398s(this, 0);
        this.f124765m0 = new Semaphore(1);
        this.f124766n0 = new RunnableC1645z0(this, 18);
        this.f124767o0 = -3.4028235E38f;
        choreographerFrameCallbackC12060e.addUpdateListener(c30398s);
    }

    /* JADX INFO: renamed from: f */
    public static void m92874f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: a */
    public final void m92875a(final C37305e c37305e, final Object obj, final C11457j c11457j) {
        List list;
        C40653c c40653c = this.f124741O;
        if (c40653c == null) {
            this.f124732F.add(new InterfaceC30401v() { // from class: qi.o
                @Override // p426qi.InterfaceC30401v
                public final void run() {
                    this.f124713a.m92875a(c37305e, obj, c11457j);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c37305e == C37305e.f159517c) {
            c40653c.mo101534g(c11457j, obj);
        } else if (c37305e.m119479c() != null) {
            c37305e.m119479c().mo101534g(c11457j, obj);
        } else {
            if (this.f124741O == null) {
                AbstractC12058c.m33239b("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                this.f124741O.mo101532d(c37305e, 0, arrayList, new C37305e(new String[0]));
                list = arrayList;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((C37305e) list.get(i13)).m119479c().mo101534g(c11457j, obj);
            }
            zIsEmpty = true ^ list.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == InterfaceC30372a0.f124645z) {
                m92896w(this.f124770x.m33241a());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92876b(Context context) {
        if (this.f124772z) {
            return true;
        }
        if (!this.f124771y) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = AbstractC12064i.f40031a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final void m92877c() {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            return;
        }
        C37199o c37199o = AbstractC3319r.f12899a;
        Rect rect = c30387i.f124691k;
        List list = Collections.EMPTY_LIST;
        C40653c c40653c = new C40653c(this, new C40655e(list, c30387i, "__container", -1L, 1, -1L, null, list, new C38317e(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), c30387i.f124690j, c30387i);
        this.f124741O = c40653c;
        if (this.f124744R) {
            c40653c.mo131934o(true);
        }
        this.f124741O.f175497L = this.f124740N;
    }

    /* JADX INFO: renamed from: d */
    public final void m92878d() {
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        if (choreographerFrameCallbackC12060e.f39995M) {
            choreographerFrameCallbackC12060e.cancel();
            if (!isVisible()) {
                this.f124768p0 = 1;
            }
        }
        this.f124769w = null;
        this.f124741O = null;
        this.f124733G = null;
        this.f124767o0 = -3.4028235E38f;
        choreographerFrameCallbackC12060e.f39994L = null;
        choreographerFrameCallbackC12060e.f39992J = -2.1474836E9f;
        choreographerFrameCallbackC12060e.f39993K = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C40653c c40653c = this.f124741O;
        if (c40653c == null) {
            return;
        }
        EnumC30371a enumC30371a = this.f124764l0;
        if (enumC30371a == null) {
            enumC30371a = EnumC30371a.f124606w;
        }
        boolean z4 = enumC30371a == EnumC30371a.f124607x;
        RunnableC1645z0 runnableC1645z0 = this.f124766n0;
        ThreadPoolExecutor threadPoolExecutor = f124730r0;
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        Semaphore semaphore = this.f124765m0;
        if (z4) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z4) {
                    return;
                }
                semaphore.release();
                if (c40653c.f175496K == choreographerFrameCallbackC12060e.m33241a()) {
                    return;
                }
            } catch (Throwable th3) {
                if (z4) {
                    semaphore.release();
                    if (c40653c.f175496K != choreographerFrameCallbackC12060e.m33241a()) {
                        threadPoolExecutor.execute(runnableC1645z0);
                    }
                }
                throw th3;
            }
        }
        if (z4 && m92897x()) {
            m92896w(choreographerFrameCallbackC12060e.m33241a());
        }
        if (this.f124731E) {
            try {
                if (this.f124749W) {
                    m92887n(canvas, c40653c);
                } else {
                    m92881h(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC12058c.f39982a.getClass();
            }
        } else if (this.f124749W) {
            m92887n(canvas, c40653c);
        } else {
            m92881h(canvas);
        }
        this.f124763k0 = false;
        if (z4) {
            semaphore.release();
            if (c40653c.f175496K == choreographerFrameCallbackC12060e.m33241a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC1645z0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m92879e() {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            return;
        }
        EnumC30384g0 enumC30384g0 = this.f124748V;
        int i13 = c30387i.f124695o;
        int iOrdinal = enumC30384g0.ordinal();
        boolean z4 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || i13 > 4)) {
            z4 = true;
        }
        this.f124749W = z4;
    }

    /* JADX INFO: renamed from: g */
    public final void m92880g(Canvas canvas, Matrix matrix) {
        float f13;
        float fM33241a;
        C40653c c40653c = this.f124741O;
        C30387i c30387i = this.f124769w;
        if (c40653c == null || c30387i == null) {
            return;
        }
        EnumC30371a enumC30371a = this.f124764l0;
        if (enumC30371a == null) {
            enumC30371a = EnumC30371a.f124606w;
        }
        boolean z4 = enumC30371a == EnumC30371a.f124607x;
        RunnableC1645z0 runnableC1645z0 = this.f124766n0;
        ThreadPoolExecutor threadPoolExecutor = f124730r0;
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        Semaphore semaphore = this.f124765m0;
        if (z4) {
            try {
                semaphore.acquire();
                if (m92897x()) {
                    m92896w(choreographerFrameCallbackC12060e.m33241a());
                }
            } catch (InterruptedException unused) {
                if (!z4) {
                    return;
                } else {
                    if ((f13 > fM33241a ? 1 : (f13 == fM33241a ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (z4) {
                    semaphore.release();
                    if (c40653c.f175496K != choreographerFrameCallbackC12060e.m33241a()) {
                        threadPoolExecutor.execute(runnableC1645z0);
                    }
                }
            }
        }
        if (this.f124731E) {
            try {
                int i13 = this.f124742P;
                if (this.f124749W) {
                    canvas.save();
                    canvas.concat(matrix);
                    m92887n(canvas, c40653c);
                    canvas.restore();
                } else {
                    c40653c.mo101531c(canvas, matrix, i13, null);
                }
            } catch (Throwable unused2) {
                AbstractC12058c.f39982a.getClass();
            }
        } else {
            int i14 = this.f124742P;
            if (this.f124749W) {
                canvas.save();
                canvas.concat(matrix);
                m92887n(canvas, c40653c);
                canvas.restore();
            } else {
                c40653c.mo101531c(canvas, matrix, i14, null);
            }
        }
        this.f124763k0 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f124742P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            return -1;
        }
        return c30387i.f124691k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            return -1;
        }
        return c30387i.f124691k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m92881h(Canvas canvas) {
        C40653c c40653c = this.f124741O;
        C30387i c30387i = this.f124769w;
        if (c40653c == null || c30387i == null) {
            return;
        }
        Matrix matrix = this.f124750X;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / c30387i.f124691k.width();
            float fHeight = bounds.height() / c30387i.f124691k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        c40653c.mo101531c(canvas, matrix, this.f124742P, null);
    }

    /* JADX INFO: renamed from: i */
    public final Context m92882i() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f124763k0) {
            return;
        }
        this.f124763k0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m92884k();
    }

    /* JADX INFO: renamed from: j */
    public final C2570m m92883j() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f124735I == null) {
            C2570m c2570m = new C2570m(getCallback());
            this.f124735I = c2570m;
            String str = this.f124737K;
            if (str != null) {
                c2570m.m7482I(str);
            }
        }
        return this.f124735I;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m92884k() {
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        if (choreographerFrameCallbackC12060e == null) {
            return false;
        }
        return choreographerFrameCallbackC12060e.f39995M;
    }

    /* JADX INFO: renamed from: l */
    public final void m92885l() {
        this.f124732F.clear();
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        choreographerFrameCallbackC12060e.m33247g(true);
        Iterator it = choreographerFrameCallbackC12060e.f39999y.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC12060e);
        }
        if (isVisible()) {
            return;
        }
        this.f124768p0 = 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m92886m() {
        if (this.f124741O == null) {
            this.f124732F.add(new InterfaceC30401v() { // from class: qi.t
                @Override // p426qi.InterfaceC30401v
                public final void run() {
                    this.f124726a.m92886m();
                }
            });
            return;
        }
        m92879e();
        boolean zM92876b = m92876b(m92882i());
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        if (zM92876b || choreographerFrameCallbackC12060e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC12060e.f39995M = true;
                boolean zM33244d = choreographerFrameCallbackC12060e.m33244d();
                Iterator it = choreographerFrameCallbackC12060e.f39998x.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(choreographerFrameCallbackC12060e, zM33244d);
                }
                choreographerFrameCallbackC12060e.m33248h((int) (choreographerFrameCallbackC12060e.m33244d() ? choreographerFrameCallbackC12060e.m33242b() : choreographerFrameCallbackC12060e.m33243c()));
                choreographerFrameCallbackC12060e.f39988F = 0L;
                choreographerFrameCallbackC12060e.f39991I = 0;
                if (choreographerFrameCallbackC12060e.f39995M) {
                    choreographerFrameCallbackC12060e.m33247g(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC12060e);
                }
                this.f124768p0 = 1;
            } else {
                this.f124768p0 = 2;
            }
        }
        if (m92876b(m92882i())) {
            return;
        }
        Iterator it3 = f124729q0.iterator();
        C37308h c37308hM92861d = null;
        while (it3.hasNext()) {
            c37308hM92861d = this.f124769w.m92861d((String) it3.next());
            if (c37308hM92861d != null) {
                break;
            }
        }
        if (c37308hM92861d != null) {
            m92890q((int) c37308hM92861d.f159523b);
        } else {
            m92890q((int) (choreographerFrameCallbackC12060e.f40000z < 0.0f ? choreographerFrameCallbackC12060e.m33243c() : choreographerFrameCallbackC12060e.m33242b()));
        }
        choreographerFrameCallbackC12060e.m33247g(true);
        choreographerFrameCallbackC12060e.m33245e(choreographerFrameCallbackC12060e.m33244d());
        if (isVisible()) {
            return;
        }
        this.f124768p0 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    /* JADX INFO: renamed from: n */
    public final void m92887n(Canvas canvas, C40653c c40653c) {
        boolean z4;
        if (this.f124769w == null || c40653c == null) {
            return;
        }
        if (this.f124752Z == null) {
            this.f124752Z = new Canvas();
            this.f124759g0 = new RectF();
            this.f124760h0 = new Matrix();
            this.f124762j0 = new Matrix();
            this.f124753a0 = new Rect();
            this.f124754b0 = new RectF();
            this.f124755c0 = new C31441a();
            this.f124756d0 = new Rect();
            this.f124757e0 = new Rect();
            this.f124758f0 = new RectF();
        }
        canvas.getMatrix(this.f124760h0);
        canvas.getClipBounds(this.f124753a0);
        Rect rect = this.f124753a0;
        this.f124754b0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f124760h0.mapRect(this.f124754b0);
        m92874f(this.f124753a0, this.f124754b0);
        if (this.f124740N) {
            this.f124759g0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c40653c.mo101533e(this.f124759g0, null, false);
        }
        this.f124760h0.mapRect(this.f124759g0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f124759g0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z4 = !((ViewGroup) parent).getClipChildren();
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (!z4) {
            RectF rectF2 = this.f124759g0;
            Rect rect2 = this.f124753a0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f124759g0.width());
        int iCeil2 = (int) Math.ceil(this.f124759g0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.f124751Y;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f124751Y.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f124751Y = bitmapCreateBitmap;
            this.f124752Z.setBitmap(bitmapCreateBitmap);
            this.f124763k0 = true;
        } else if (this.f124751Y.getWidth() > iCeil || this.f124751Y.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f124751Y, 0, 0, iCeil, iCeil2);
            this.f124751Y = bitmapCreateBitmap2;
            this.f124752Z.setBitmap(bitmapCreateBitmap2);
            this.f124763k0 = true;
        }
        if (this.f124763k0) {
            Matrix matrix = this.f124760h0;
            float[] fArr = this.f124761i0;
            matrix.getValues(fArr);
            float f13 = fArr[0];
            float f14 = fArr[4];
            Matrix matrix2 = this.f124760h0;
            Matrix matrix3 = this.f124750X;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF3 = this.f124759g0;
            matrix3.postTranslate(-rectF3.left, -rectF3.top);
            matrix3.postScale(1.0f / f13, 1.0f / f14);
            this.f124751Y.eraseColor(0);
            this.f124752Z.setMatrix(AbstractC12064i.f40031a);
            this.f124752Z.scale(f13, f14);
            c40653c.mo101531c(this.f124752Z, matrix3, this.f124742P, null);
            this.f124760h0.invert(this.f124762j0);
            this.f124762j0.mapRect(this.f124758f0, this.f124759g0);
            m92874f(this.f124757e0, this.f124758f0);
        }
        this.f124756d0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f124751Y, this.f124756d0, this.f124757e0, this.f124755c0);
    }

    /* JADX INFO: renamed from: o */
    public final void m92888o() {
        if (this.f124741O == null) {
            this.f124732F.add(new InterfaceC30401v() { // from class: qi.r
                @Override // p426qi.InterfaceC30401v
                public final void run() {
                    this.f124723a.m92888o();
                }
            });
            return;
        }
        m92879e();
        boolean zM92876b = m92876b(m92882i());
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        if (zM92876b || choreographerFrameCallbackC12060e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC12060e.f39995M = true;
                choreographerFrameCallbackC12060e.m33247g(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC12060e);
                choreographerFrameCallbackC12060e.f39988F = 0L;
                if (choreographerFrameCallbackC12060e.m33244d() && choreographerFrameCallbackC12060e.f39990H == choreographerFrameCallbackC12060e.m33243c()) {
                    choreographerFrameCallbackC12060e.m33248h(choreographerFrameCallbackC12060e.m33242b());
                } else if (!choreographerFrameCallbackC12060e.m33244d() && choreographerFrameCallbackC12060e.f39990H == choreographerFrameCallbackC12060e.m33242b()) {
                    choreographerFrameCallbackC12060e.m33248h(choreographerFrameCallbackC12060e.m33243c());
                }
                Iterator it = choreographerFrameCallbackC12060e.f39999y.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC12060e);
                }
                this.f124768p0 = 1;
            } else {
                this.f124768p0 = 3;
            }
        }
        if (m92876b(m92882i())) {
            return;
        }
        m92890q((int) (choreographerFrameCallbackC12060e.f40000z < 0.0f ? choreographerFrameCallbackC12060e.m33243c() : choreographerFrameCallbackC12060e.m33242b()));
        choreographerFrameCallbackC12060e.m33247g(true);
        choreographerFrameCallbackC12060e.m33245e(choreographerFrameCallbackC12060e.m33244d());
        if (isVisible()) {
            return;
        }
        this.f124768p0 = 1;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m92889p(C30387i c30387i) {
        if (this.f124769w == c30387i) {
            return false;
        }
        this.f124763k0 = true;
        m92878d();
        this.f124769w = c30387i;
        m92877c();
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        boolean z4 = choreographerFrameCallbackC12060e.f39994L == null;
        choreographerFrameCallbackC12060e.f39994L = c30387i;
        if (z4) {
            choreographerFrameCallbackC12060e.m33249i(Math.max(choreographerFrameCallbackC12060e.f39992J, c30387i.f124692l), Math.min(choreographerFrameCallbackC12060e.f39993K, c30387i.f124693m));
        } else {
            choreographerFrameCallbackC12060e.m33249i((int) c30387i.f124692l, (int) c30387i.f124693m);
        }
        float f13 = choreographerFrameCallbackC12060e.f39990H;
        choreographerFrameCallbackC12060e.f39990H = 0.0f;
        choreographerFrameCallbackC12060e.f39989G = 0.0f;
        choreographerFrameCallbackC12060e.m33248h((int) f13);
        choreographerFrameCallbackC12060e.m33246f();
        m92896w(choreographerFrameCallbackC12060e.getAnimatedFraction());
        ArrayList arrayList = this.f124732F;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC30401v interfaceC30401v = (InterfaceC30401v) it.next();
            if (interfaceC30401v != null) {
                interfaceC30401v.run();
            }
            it.remove();
        }
        arrayList.clear();
        c30387i.f124681a.f124657a = this.f124743Q;
        m92879e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m92890q(int i13) {
        if (this.f124769w != null) {
            this.f124770x.m33248h(i13);
        } else {
            this.f124732F.add(new C30393n(this, i13, 2));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m92891r(int i13) {
        if (this.f124769w == null) {
            this.f124732F.add(new C30393n(this, i13, 0));
        } else {
            ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
            choreographerFrameCallbackC12060e.m33249i(choreographerFrameCallbackC12060e.f39992J, i13 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m92892s(String str) {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            this.f124732F.add(new C30392m(this, str, 1));
        } else {
            C37308h c37308hM92861d = c30387i.m92861d(str);
            if (c37308hM92861d == null) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Cannot find marker with name ", str, "."));
            }
            m92891r((int) (c37308hM92861d.f159523b + c37308hM92861d.f159524c));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f124742P = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC12058c.m33239b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z4, z13);
        if (z4) {
            int i13 = this.f124768p0;
            if (i13 == 2) {
                m92886m();
                return visible;
            }
            if (i13 == 3) {
                m92888o();
                return visible;
            }
        } else {
            if (this.f124770x.f39995M) {
                m92885l();
                this.f124768p0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f124768p0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m92886m();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f124732F.clear();
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
        choreographerFrameCallbackC12060e.m33247g(true);
        choreographerFrameCallbackC12060e.m33245e(choreographerFrameCallbackC12060e.m33244d());
        if (isVisible()) {
            return;
        }
        this.f124768p0 = 1;
    }

    /* JADX INFO: renamed from: t */
    public final void m92893t(String str) {
        C30387i c30387i = this.f124769w;
        ArrayList arrayList = this.f124732F;
        if (c30387i == null) {
            arrayList.add(new C30392m(this, str, 0));
            return;
        }
        C37308h c37308hM92861d = c30387i.m92861d(str);
        if (c37308hM92861d == null) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Cannot find marker with name ", str, "."));
        }
        int i13 = (int) c37308hM92861d.f159523b;
        int i14 = ((int) c37308hM92861d.f159524c) + i13;
        if (this.f124769w == null) {
            arrayList.add(new C30396q(this, i13, i14));
        } else {
            this.f124770x.m33249i(i13, i14 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m92894u(int i13) {
        if (this.f124769w == null) {
            this.f124732F.add(new C30393n(this, i13, 1));
        } else {
            ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = this.f124770x;
            choreographerFrameCallbackC12060e.m33249i(i13, (int) choreographerFrameCallbackC12060e.f39993K);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: v */
    public final void m92895v(String str) {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            this.f124732F.add(new C30392m(this, str, 2));
        } else {
            C37308h c37308hM92861d = c30387i.m92861d(str);
            if (c37308hM92861d == null) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Cannot find marker with name ", str, "."));
            }
            m92894u((int) c37308hM92861d.f159523b);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m92896w(final float f13) {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            this.f124732F.add(new InterfaceC30401v() { // from class: qi.u
                @Override // p426qi.InterfaceC30401v
                public final void run() {
                    this.f124727a.m92896w(f13);
                }
            });
        } else {
            this.f124770x.m33248h(AbstractC12062g.m33256f(c30387i.f124692l, c30387i.f124693m, f13));
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m92897x() {
        C30387i c30387i = this.f124769w;
        if (c30387i == null) {
            return false;
        }
        float f13 = this.f124767o0;
        float fM33241a = this.f124770x.m33241a();
        this.f124767o0 = fM33241a;
        return Math.abs(fM33241a - f13) * c30387i.m92859b() >= 50.0f;
    }
}
