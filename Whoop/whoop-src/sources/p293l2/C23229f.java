package p293l2;

import al.AbstractC0954a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;
import p005a3.C0227m1;
import p005a3.C0237p;
import p208i2.AbstractC17870b;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17873c;
import p208i2.C17917w;
import p208i2.C17919x;
import p208i2.InterfaceC17915v;
import p270k2.C22127a;
import p270k2.C22128b;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C23229f implements InterfaceC23228e {

    /* JADX INFO: renamed from: C */
    public static final AtomicBoolean f91991C = new AtomicBoolean(true);

    /* JADX INFO: renamed from: A */
    public boolean f91992A;

    /* JADX INFO: renamed from: B */
    public AbstractC0954a f91993B;

    /* JADX INFO: renamed from: b */
    public final C17917w f91994b;

    /* JADX INFO: renamed from: c */
    public final C22128b f91995c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f91996d;

    /* JADX INFO: renamed from: e */
    public long f91997e;

    /* JADX INFO: renamed from: f */
    public Paint f91998f;

    /* JADX INFO: renamed from: g */
    public Matrix f91999g;

    /* JADX INFO: renamed from: h */
    public boolean f92000h;

    /* JADX INFO: renamed from: i */
    public long f92001i;

    /* JADX INFO: renamed from: j */
    public int f92002j;

    /* JADX INFO: renamed from: k */
    public int f92003k;

    /* JADX INFO: renamed from: l */
    public float f92004l;

    /* JADX INFO: renamed from: m */
    public boolean f92005m;

    /* JADX INFO: renamed from: n */
    public float f92006n;

    /* JADX INFO: renamed from: o */
    public float f92007o;

    /* JADX INFO: renamed from: p */
    public float f92008p;

    /* JADX INFO: renamed from: q */
    public float f92009q;

    /* JADX INFO: renamed from: r */
    public float f92010r;

    /* JADX INFO: renamed from: s */
    public long f92011s;

    /* JADX INFO: renamed from: t */
    public long f92012t;

    /* JADX INFO: renamed from: u */
    public float f92013u;

    /* JADX INFO: renamed from: v */
    public float f92014v;

    /* JADX INFO: renamed from: w */
    public float f92015w;

    /* JADX INFO: renamed from: x */
    public float f92016x;

    /* JADX INFO: renamed from: y */
    public boolean f92017y;

    /* JADX INFO: renamed from: z */
    public boolean f92018z;

    public C23229f(AndroidComposeView androidComposeView, C17917w c17917w, C22128b c22128b) {
        this.f91994b = c17917w;
        this.f91995c = c22128b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f91996d = renderNodeCreate;
        this.f91997e = 0L;
        this.f92001i = 0L;
        if (f91991C.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            AbstractC23234k.m67266c(renderNodeCreate, AbstractC23234k.m67264a(renderNodeCreate));
            AbstractC23234k.m67267d(renderNodeCreate, AbstractC23234k.m67265b(renderNodeCreate));
            AbstractC23233j.m67263a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m67256Q(0);
        this.f92002j = 0;
        this.f92003k = 3;
        this.f92004l = 1.0f;
        this.f92006n = 1.0f;
        this.f92007o = 1.0f;
        long j7 = C17919x.f69625b;
        this.f92011s = j7;
        this.f92012t = j7;
        this.f92016x = 8.0f;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: A */
    public final void mo67214A(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m, C23226c c23226c, C0227m1 c0227m1) {
        Canvas canvasStart = this.f91996d.start(Math.max((int) (this.f91997e >> 32), (int) (this.f92001i >> 32)), Math.max((int) (this.f91997e & 4294967295L), (int) (this.f92001i & 4294967295L)));
        try {
            C17917w c17917w = this.f91994b;
            C17873c c17873c = c17917w.f69620a;
            Canvas canvas = c17873c.f69556a;
            c17873c.f69556a = canvasStart;
            C22128b c22128b = this.f91995c;
            long jM113239l = AbstractC35744b.m113239l(this.f91997e);
            C0237p c0237p = c22128b.f85852x;
            C0237p c0237p2 = c22128b.f85852x;
            C22127a c22127a = ((C22128b) c0237p.f814z).f85851w;
            InterfaceC39171c interfaceC39171c2 = c22127a.f85847a;
            EnumC39181m enumC39181m2 = c22127a.f85848b;
            InterfaceC17915v interfaceC17915vM716w = c0237p.m716w();
            long jM670A = c0237p2.m670A();
            C23226c c23226c2 = (C23226c) c0237p2.f813y;
            c0237p2.m686Q(interfaceC39171c);
            c0237p2.m689T(enumC39181m);
            c0237p2.m685P(c17873c);
            c0237p2.m690U(jM113239l);
            c0237p2.f813y = c23226c;
            c17873c.mo51426q();
            try {
                c0227m1.invoke(c22128b);
                c17873c.mo51417g();
                c0237p2.m686Q(interfaceC39171c2);
                c0237p2.m689T(enumC39181m2);
                c0237p2.m685P(interfaceC17915vM716w);
                c0237p2.m690U(jM670A);
                c0237p2.f813y = c23226c2;
                c17917w.f69620a.f69556a = canvas;
                this.f91996d.end(canvasStart);
            } catch (Throwable th3) {
                c17873c.mo51417g();
                C0237p c0237p3 = c22128b.f85852x;
                c0237p3.m686Q(interfaceC39171c2);
                c0237p3.m689T(enumC39181m2);
                c0237p3.m685P(interfaceC17915vM716w);
                c0237p3.m690U(jM670A);
                c0237p3.f813y = c23226c2;
                throw th3;
            }
        } catch (Throwable th4) {
            this.f91996d.end(canvasStart);
            throw th4;
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: B */
    public final void mo67215B(float f13) {
        this.f92010r = f13;
        this.f91996d.setElevation(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: C */
    public final void mo67216C(float f13) {
        this.f92015w = f13;
        this.f91996d.setRotation(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: D */
    public final void mo67217D(InterfaceC17915v interfaceC17915v) {
        DisplayListCanvas displayListCanvasM51433a = AbstractC17876d.m51433a(interfaceC17915v);
        AbstractC22676k.m65748h(displayListCanvasM51433a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasM51433a.drawRenderNode(this.f91996d);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: E */
    public final void mo67218E(Outline outline, long j7) {
        this.f92001i = j7;
        this.f91996d.setOutline(outline);
        this.f92000h = outline != null;
        m67255P();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: F */
    public final void mo67219F(float f13) {
        this.f92007o = f13;
        this.f91996d.setScaleY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: G */
    public final void mo67220G(long j7) {
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            this.f92005m = true;
            this.f91996d.setPivotX(((int) (this.f91997e >> 32)) / 2.0f);
            this.f91996d.setPivotY(((int) (4294967295L & this.f91997e)) / 2.0f);
        } else {
            this.f92005m = false;
            this.f91996d.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            this.f91996d.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: H */
    public final void mo67221H(float f13) {
        this.f92004l = f13;
        this.f91996d.setAlpha(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: I */
    public final float mo67222I() {
        return this.f92009q;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: J */
    public final float mo67223J() {
        return this.f92008p;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: K */
    public final float mo67224K() {
        return this.f92013u;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: L */
    public final void mo67225L(int i13) {
        this.f92002j = i13;
        m67257R();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: M */
    public final void mo67226M(float f13) {
        this.f92008p = f13;
        this.f91996d.setTranslationX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: N */
    public final float mo67227N() {
        return this.f92010r;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: O */
    public final float mo67228O() {
        return this.f92007o;
    }

    /* JADX INFO: renamed from: P */
    public final void m67255P() {
        boolean z4 = this.f92017y;
        boolean z13 = false;
        boolean z14 = z4 && !this.f92000h;
        if (z4 && this.f92000h) {
            z13 = true;
        }
        if (z14 != this.f92018z) {
            this.f92018z = z14;
            this.f91996d.setClipToBounds(z14);
        }
        if (z13 != this.f91992A) {
            this.f91992A = z13;
            this.f91996d.setClipToOutline(z13);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m67256Q(int i13) {
        RenderNode renderNode = this.f91996d;
        if (i13 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f91998f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i13 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f91998f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f91998f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m67257R() {
        int i13 = this.f92002j;
        if (i13 != 1 && this.f92003k == 3) {
            m67256Q(i13);
        } else {
            m67256Q(1);
        }
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: a */
    public final float mo67229a() {
        return this.f92004l;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: b */
    public final AbstractC0954a mo67230b() {
        return this.f91993B;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: c */
    public final void mo67231c(float f13) {
        this.f92009q = f13;
        this.f91996d.setTranslationY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: d */
    public final void mo67232d(int i13) {
        if (this.f92003k == i13) {
            return;
        }
        this.f92003k = i13;
        Paint paint = this.f91998f;
        if (paint == null) {
            paint = new Paint();
            this.f91998f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC17870b.m51410e(i13)));
        m67257R();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: e */
    public final void mo67233e() {
        AbstractC23233j.m67263a(this.f91996d);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: f */
    public final void mo67234f(int i13, long j7, int i14) {
        int i15 = (int) (j7 >> 32);
        int i16 = (int) (4294967295L & j7);
        this.f91996d.setLeftTopRightBottom(i13, i14, i13 + i15, i14 + i16);
        if (C39180l.m124799a(this.f91997e, j7)) {
            return;
        }
        if (this.f92005m) {
            this.f91996d.setPivotX(i15 / 2.0f);
            this.f91996d.setPivotY(i16 / 2.0f);
        }
        this.f91997e = j7;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: g */
    public final int mo67235g() {
        return this.f92002j;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: h */
    public final AbstractC17921y mo67236h() {
        return null;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: i */
    public final float mo67237i() {
        return this.f92014v;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: j */
    public final boolean mo67238j() {
        return this.f91996d.isValid();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: k */
    public final float mo67239k() {
        return this.f92015w;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: l */
    public final long mo67240l() {
        return this.f92011s;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: m */
    public final void mo67241m(AbstractC0954a abstractC0954a) {
        this.f91993B = abstractC0954a;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: n */
    public final long mo67242n() {
        return this.f92012t;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: o */
    public final void mo67243o(long j7) {
        this.f92011s = j7;
        AbstractC23234k.m67266c(this.f91996d, AbstractC17918w0.m51506H(j7));
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: p */
    public final void mo67244p() {
        m67257R();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: q */
    public final void mo67245q(float f13) {
        this.f92006n = f13;
        this.f91996d.setScaleX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: r */
    public final float mo67246r() {
        return this.f92016x;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: s */
    public final void mo67247s(boolean z4) {
        this.f92017y = z4;
        m67255P();
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: t */
    public final void mo67248t(long j7) {
        this.f92012t = j7;
        AbstractC23234k.m67267d(this.f91996d, AbstractC17918w0.m51506H(j7));
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: u */
    public final Matrix mo67249u() {
        Matrix matrix = this.f91999g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f91999g = matrix;
        }
        this.f91996d.getMatrix(matrix);
        return matrix;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: v */
    public final void mo67250v(float f13) {
        this.f92016x = f13;
        this.f91996d.setCameraDistance(-f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: w */
    public final void mo67251w(float f13) {
        this.f92013u = f13;
        this.f91996d.setRotationX(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: x */
    public final int mo67252x() {
        return this.f92003k;
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: y */
    public final void mo67253y(float f13) {
        this.f92014v = f13;
        this.f91996d.setRotationY(f13);
    }

    @Override // p293l2.InterfaceC23228e
    /* JADX INFO: renamed from: z */
    public final float mo67254z() {
        return this.f92006n;
    }

    public /* synthetic */ C23229f(AndroidComposeView androidComposeView) {
        this(androidComposeView, new C17917w(), new C22128b());
    }
}
