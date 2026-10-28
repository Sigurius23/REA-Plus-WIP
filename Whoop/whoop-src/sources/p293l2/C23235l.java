package p293l2;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import p005a3.C0237p;
import p043c4.C3952c0;
import p208i2.C17873c;
import p208i2.C17917w;
import p208i2.InterfaceC17915v;
import p270k2.AbstractC22130d;
import p270k2.C22127a;
import p270k2.C22128b;
import p317m2.AbstractC24938a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l2.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C23235l extends View {

    /* JADX INFO: renamed from: K */
    public static final C3952c0 f92071K = new C3952c0(3);

    /* JADX INFO: renamed from: E */
    public Outline f92072E;

    /* JADX INFO: renamed from: F */
    public boolean f92073F;

    /* JADX INFO: renamed from: G */
    public InterfaceC39171c f92074G;

    /* JADX INFO: renamed from: H */
    public EnumC39181m f92075H;

    /* JADX INFO: renamed from: I */
    public Function1 f92076I;

    /* JADX INFO: renamed from: J */
    public C23226c f92077J;

    /* JADX INFO: renamed from: w */
    public final AbstractC24938a f92078w;

    /* JADX INFO: renamed from: x */
    public final C17917w f92079x;

    /* JADX INFO: renamed from: y */
    public final C22128b f92080y;

    /* JADX INFO: renamed from: z */
    public boolean f92081z;

    public C23235l(AbstractC24938a abstractC24938a, C17917w c17917w, C22128b c22128b) {
        super(abstractC24938a.getContext());
        this.f92078w = abstractC24938a;
        this.f92079x = c17917w;
        this.f92080y = c22128b;
        setOutlineProvider(f92071K);
        this.f92073F = true;
        this.f92074G = AbstractC22130d.f85855a;
        this.f92075H = EnumC39181m.f168423w;
        InterfaceC23228e.f91990a.getClass();
        this.f92076I = C23225b.f91963y;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C17917w c17917w = this.f92079x;
        C17873c c17873c = c17917w.f69620a;
        Canvas canvas2 = c17873c.f69556a;
        c17873c.f69556a = canvas;
        InterfaceC39171c interfaceC39171c = this.f92074G;
        EnumC39181m enumC39181m = this.f92075H;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C23226c c23226c = this.f92077J;
        Function1 function1 = this.f92076I;
        C22128b c22128b = this.f92080y;
        C0237p c0237p = c22128b.f85852x;
        C22127a c22127a = ((C22128b) c0237p.f814z).f85851w;
        InterfaceC39171c interfaceC39171c2 = c22127a.f85847a;
        EnumC39181m enumC39181m2 = c22127a.f85848b;
        InterfaceC17915v interfaceC17915vM716w = c0237p.m716w();
        C0237p c0237p2 = c22128b.f85852x;
        long jM670A = c0237p2.m670A();
        C23226c c23226c2 = (C23226c) c0237p2.f813y;
        c0237p2.m686Q(interfaceC39171c);
        c0237p2.m689T(enumC39181m);
        c0237p2.m685P(c17873c);
        c0237p2.m690U(jFloatToRawIntBits);
        c0237p2.f813y = c23226c;
        c17873c.mo51426q();
        try {
            function1.invoke(c22128b);
            c17873c.mo51417g();
            c0237p2.m686Q(interfaceC39171c2);
            c0237p2.m689T(enumC39181m2);
            c0237p2.m685P(interfaceC17915vM716w);
            c0237p2.m690U(jM670A);
            c0237p2.f813y = c23226c2;
            c17917w.f69620a.f69556a = canvas2;
            this.f92081z = false;
        } catch (Throwable th3) {
            c17873c.mo51417g();
            c0237p2.m686Q(interfaceC39171c2);
            c0237p2.m689T(enumC39181m2);
            c0237p2.m685P(interfaceC17915vM716w);
            c0237p2.m690U(jM670A);
            c0237p2.f813y = c23226c2;
            throw th3;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f92073F;
    }

    public final C17917w getCanvasHolder() {
        return this.f92079x;
    }

    public final View getOwnerView() {
        return this.f92078w;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f92073F;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f92081z) {
            return;
        }
        this.f92081z = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z4) {
        if (this.f92073F != z4) {
            this.f92073F = z4;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z4) {
        this.f92081z = z4;
    }
}
