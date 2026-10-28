package p106e2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p208i2.AbstractC17876d;
import p208i2.C17873c;
import p208i2.InterfaceC17915v;
import p270k2.C22127a;
import p270k2.C22128b;
import p636y3.C39172d;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12587b extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final C39172d f42968a;

    /* JADX INFO: renamed from: b */
    public final long f42969b;

    /* JADX INFO: renamed from: c */
    public final Function1 f42970c;

    public C12587b(C39172d c39172d, long j7, Function1 function1) {
        this.f42968a = c39172d;
        this.f42969b = j7;
        this.f42970c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C22128b c22128b = new C22128b();
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        Canvas canvas2 = AbstractC17876d.f69560a;
        C17873c c17873c = new C17873c();
        c17873c.f69556a = canvas;
        C22127a c22127a = c22128b.f85851w;
        InterfaceC39171c interfaceC39171c = c22127a.f85847a;
        EnumC39181m enumC39181m2 = c22127a.f85848b;
        InterfaceC17915v interfaceC17915v = c22127a.f85849c;
        long j7 = c22127a.f85850d;
        c22127a.f85847a = this.f42968a;
        c22127a.f85848b = enumC39181m;
        c22127a.f85849c = c17873c;
        c22127a.f85850d = this.f42969b;
        c17873c.mo51426q();
        this.f42970c.invoke(c22128b);
        c17873c.mo51417g();
        c22127a.f85847a = interfaceC39171c;
        c22127a.f85848b = enumC39181m2;
        c22127a.f85849c = interfaceC17915v;
        c22127a.f85850d = j7;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j7 = this.f42969b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        C39172d c39172d = this.f42968a;
        point.set(c39172d.mo724F(fIntBitsToFloat / c39172d.getDensity()), c39172d.mo724F(Float.intBitsToFloat((int) (j7 & 4294967295L)) / c39172d.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
