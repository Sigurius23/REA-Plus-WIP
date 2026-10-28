package p293l2;

import al.AbstractC0954a;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import p005a3.C0227m1;
import p079d2.AbstractC11480b;
import p208i2.AbstractC17870b;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17873c;
import p208i2.C17917w;
import p208i2.C17919x;
import p208i2.InterfaceC17915v;
import p270k2.C22128b;
import p317m2.AbstractC24938a;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l2.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C23232i implements InterfaceC23228e {

    /* JADX INFO: renamed from: B */
    public static final C23231h f92044B = new C23231h();

    /* JADX INFO: renamed from: A */
    public AbstractC0954a f92045A;

    /* JADX INFO: renamed from: b */
    public final AbstractC24938a f92046b;

    /* JADX INFO: renamed from: c */
    public final C17917w f92047c;

    /* JADX INFO: renamed from: d */
    public final C23235l f92048d;

    /* JADX INFO: renamed from: e */
    public final Resources f92049e;

    /* JADX INFO: renamed from: f */
    public final Rect f92050f;

    /* JADX INFO: renamed from: g */
    public Paint f92051g;

    /* JADX INFO: renamed from: h */
    public int f92052h;

    /* JADX INFO: renamed from: i */
    public int f92053i;

    /* JADX INFO: renamed from: j */
    public long f92054j;

    /* JADX INFO: renamed from: k */
    public boolean f92055k;

    /* JADX INFO: renamed from: l */
    public boolean f92056l;

    /* JADX INFO: renamed from: m */
    public boolean f92057m;

    /* JADX INFO: renamed from: n */
    public int f92058n;

    /* JADX INFO: renamed from: o */
    public int f92059o;

    /* JADX INFO: renamed from: p */
    public float f92060p;

    /* JADX INFO: renamed from: q */
    public float f92061q;

    /* JADX INFO: renamed from: r */
    public float f92062r;

    /* JADX INFO: renamed from: s */
    public float f92063s;

    /* JADX INFO: renamed from: t */
    public float f92064t;

    /* JADX INFO: renamed from: u */
    public float f92065u;

    /* JADX INFO: renamed from: v */
    public long f92066v;

    /* JADX INFO: renamed from: w */
    public long f92067w;

    /* JADX INFO: renamed from: x */
    public float f92068x;

    /* JADX INFO: renamed from: y */
    public float f92069y;

    /* JADX INFO: renamed from: z */
    public float f92070z;

    public C23232i(AbstractC24938a abstractC24938a) {
        C17917w c17917w = new C17917w();
        C22128b c22128b = new C22128b();
        this.f92046b = abstractC24938a;
        this.f92047c = c17917w;
        C23235l c23235l = new C23235l(abstractC24938a, c17917w, c22128b);
        this.f92048d = c23235l;
        this.f92049e = abstractC24938a.getResources();
        this.f92050f = new Rect();
        abstractC24938a.addView(c23235l);
        c23235l.setClipBounds(null);
        this.f92054j = 0L;
        View.generateViewId();
        this.f92058n = 3;
        this.f92059o = 0;
        this.f92060p = 1.0f;
        this.f92061q = 1.0f;
        this.f92062r = 1.0f;
        long j7 = C17919x.f69625b;
        this.f92066v = j7;
        this.f92067w = j7;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: A */
    public final void mo67214A(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m, C23226c c23226c, C0227m1 c0227m1) {
        C23235l c23235l = this.f92048d;
        ViewParent parent = c23235l.getParent();
        AbstractC24938a abstractC24938a = this.f92046b;
        if (parent == null) {
            abstractC24938a.addView(c23235l);
        }
        c23235l.f92074G = interfaceC39171c;
        c23235l.f92075H = enumC39181m;
        c23235l.f92076I = c0227m1;
        c23235l.f92077J = c23226c;
        if (c23235l.isAttachedToWindow()) {
            c23235l.setVisibility(4);
            c23235l.setVisibility(0);
            try {
                C17917w c17917w = this.f92047c;
                C23231h c23231h = f92044B;
                C17873c c17873c = c17917w.f69620a;
                Canvas canvas = c17873c.f69556a;
                c17873c.f69556a = c23231h;
                abstractC24938a.m73091a(c17873c, c23235l, c23235l.getDrawingTime());
                c17917w.f69620a.f69556a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: B */
    public final void mo67215B(float f13) {
        this.f92065u = f13;
        this.f92048d.setElevation(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: C */
    public final void mo67216C(float f13) {
        this.f92070z = f13;
        this.f92048d.setRotation(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: D */
    public final void mo67217D(InterfaceC17915v interfaceC17915v) {
        Rect rect;
        boolean z4 = this.f92055k;
        C23235l c23235l = this.f92048d;
        if (z4) {
            if ((this.f92057m || c23235l.getClipToOutline()) && !this.f92056l) {
                rect = this.f92050f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c23235l.getWidth();
                rect.bottom = c23235l.getHeight();
            } else {
                rect = null;
            }
            c23235l.setClipBounds(rect);
        }
        if (AbstractC17876d.m51433a(interfaceC17915v).isHardwareAccelerated()) {
            this.f92046b.m73091a(interfaceC17915v, c23235l, c23235l.getDrawingTime());
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: E */
    public final void mo67218E(Outline outline, long j7) {
        C23235l c23235l = this.f92048d;
        c23235l.f92072E = outline;
        c23235l.invalidateOutline();
        if ((this.f92057m || c23235l.getClipToOutline()) && outline != null) {
            c23235l.setClipToOutline(true);
            if (this.f92057m) {
                this.f92057m = false;
                this.f92055k = true;
            }
        }
        this.f92056l = outline != null;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: F */
    public final void mo67219F(float f13) {
        this.f92062r = f13;
        this.f92048d.setScaleY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: G */
    public final void mo67220G(long j7) {
        long j13 = 9223372034707292159L & j7;
        C23235l c23235l = this.f92048d;
        if (j13 == 9205357640488583168L) {
            c23235l.resetPivot();
        } else {
            c23235l.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            c23235l.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: H */
    public final void mo67221H(float f13) {
        this.f92060p = f13;
        this.f92048d.setAlpha(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: I */
    public final float mo67222I() {
        return this.f92064t;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: J */
    public final float mo67223J() {
        return this.f92063s;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: K */
    public final float mo67224K() {
        return this.f92068x;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: L */
    public final void mo67225L(int i13) {
        this.f92059o = i13;
        m67262Q();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: M */
    public final void mo67226M(float f13) {
        this.f92063s = f13;
        this.f92048d.setTranslationX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: N */
    public final float mo67227N() {
        return this.f92065u;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: O */
    public final float mo67228O() {
        return this.f92062r;
    }

    /* JADX INFO: renamed from: P */
    public final void m67261P(int i13) {
        C23235l c23235l = this.f92048d;
        boolean z4 = true;
        if (i13 == 1) {
            c23235l.setLayerType(2, this.f92051g);
        } else if (i13 == 2) {
            c23235l.setLayerType(0, this.f92051g);
            z4 = false;
        } else {
            c23235l.setLayerType(0, this.f92051g);
        }
        c23235l.setCanUseCompositingLayer$ui_graphics_release(z4);
    }

    /* JADX INFO: renamed from: Q */
    public final void m67262Q() {
        int i13 = this.f92059o;
        if (i13 != 1 && this.f92058n == 3) {
            m67261P(i13);
        } else {
            m67261P(1);
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: a */
    public final float mo67229a() {
        return this.f92060p;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: b */
    public final AbstractC0954a mo67230b() {
        return this.f92045A;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: c */
    public final void mo67231c(float f13) {
        this.f92064t = f13;
        this.f92048d.setTranslationY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: d */
    public final void mo67232d(int i13) {
        this.f92058n = i13;
        Paint paint = this.f92051g;
        if (paint == null) {
            paint = new Paint();
            this.f92051g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC17870b.m51410e(i13)));
        m67262Q();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: e */
    public final void mo67233e() {
        this.f92046b.removeViewInLayout(this.f92048d);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: f */
    public final void mo67234f(int i13, long j7, int i14) {
        boolean zM124799a = C39180l.m124799a(this.f92054j, j7);
        C23235l c23235l = this.f92048d;
        if (zM124799a) {
            int i15 = this.f92052h;
            if (i15 != i13) {
                c23235l.offsetLeftAndRight(i13 - i15);
            }
            int i16 = this.f92053i;
            if (i16 != i14) {
                c23235l.offsetTopAndBottom(i14 - i16);
            }
        } else {
            if (this.f92057m || c23235l.getClipToOutline()) {
                this.f92055k = true;
            }
            c23235l.layout(i13, i14, ((int) (j7 >> 32)) + i13, ((int) (4294967295L & j7)) + i14);
            this.f92054j = j7;
        }
        this.f92052h = i13;
        this.f92053i = i14;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: g */
    public final int mo67235g() {
        return this.f92059o;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: h */
    public final AbstractC17921y mo67236h() {
        return null;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: i */
    public final float mo67237i() {
        return this.f92069y;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: k */
    public final float mo67239k() {
        return this.f92070z;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: l */
    public final long mo67240l() {
        return this.f92066v;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: m */
    public final void mo67241m(AbstractC0954a abstractC0954a) {
        this.f92045A = abstractC0954a;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC11480b.m30894t(this.f92048d, abstractC0954a);
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: n */
    public final long mo67242n() {
        return this.f92067w;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: o */
    public final void mo67243o(long j7) {
        this.f92066v = j7;
        this.f92048d.setOutlineAmbientShadowColor(AbstractC17918w0.m51506H(j7));
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: p */
    public final void mo67244p() {
        Paint paint = this.f92051g;
        if (paint == null) {
            paint = new Paint();
            this.f92051g = paint;
        }
        paint.setColorFilter(null);
        m67262Q();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: q */
    public final void mo67245q(float f13) {
        this.f92061q = f13;
        this.f92048d.setScaleX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: r */
    public final float mo67246r() {
        return this.f92048d.getCameraDistance() / this.f92049e.getDisplayMetrics().densityDpi;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: s */
    public final void mo67247s(boolean z4) {
        boolean z13 = false;
        this.f92057m = z4 && !this.f92056l;
        this.f92055k = true;
        if (z4 && this.f92056l) {
            z13 = true;
        }
        this.f92048d.setClipToOutline(z13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: t */
    public final void mo67248t(long j7) {
        this.f92067w = j7;
        this.f92048d.setOutlineSpotShadowColor(AbstractC17918w0.m51506H(j7));
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: u */
    public final Matrix mo67249u() {
        return this.f92048d.getMatrix();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: v */
    public final void mo67250v(float f13) {
        this.f92048d.setCameraDistance(f13 * this.f92049e.getDisplayMetrics().densityDpi);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: w */
    public final void mo67251w(float f13) {
        this.f92068x = f13;
        this.f92048d.setRotationX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: x */
    public final int mo67252x() {
        return this.f92058n;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: y */
    public final void mo67253y(float f13) {
        this.f92069y = f13;
        this.f92048d.setRotationY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: z */
    public final float mo67254z() {
        return this.f92061q;
    }
}
