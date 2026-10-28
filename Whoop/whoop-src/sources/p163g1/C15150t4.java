package p163g1;

import ge3.AbstractC15751g;
import l83.C23454a0;
import p077d0.C11365j0;
import p181h2.C16620e;
import p208i2.InterfaceC17912t0;
import p249jc.AbstractC21598x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.t4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15150t4 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56821E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56822w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56823x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56824y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56825z;

    public /* synthetic */ C15150t4(float f13, long j7, long j13, C11365j0 c11365j0) {
        this.f56823x = f13;
        this.f56824y = j7;
        this.f56825z = j13;
        this.f56821E = c11365j0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56822w) {
            case 0:
                C22135i c22135i = (C22135i) this.f56821E;
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                float f13 = this.f56823x * 360.0f;
                AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, this.f56824y, c22135i);
                AbstractC15170v4.m43205e(interfaceC22131e, 270.0f, f13, this.f56825z, c22135i);
                return C23454a0.f92919a;
            case 1:
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f56821E;
                InterfaceC22131e Canvas = (InterfaceC22131e) obj;
                AbstractC22676k.m65750j(Canvas, "$this$Canvas");
                float fMo743q0 = Canvas.mo743q0(this.f56823x);
                float f14 = 2;
                float f15 = fMo743q0 / f14;
                InterfaceC22131e.m63379M(Canvas, this.f56824y, (C16620e.m47212d(Canvas.mo731d()) / f14) - f15, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 1, 0, null, 26), 108);
                float fFloatValue = ((Number) interfaceC28670t2.getValue()).floatValue();
                C22135i c22135i2 = new C22135i(fMo743q0, 0.0f, 1, 0, null, 26);
                InterfaceC22131e.m63380P(Canvas, this.f56825z, fFloatValue, 90.0f, AbstractC15751g.m44450c(f15, f15), AbstractC21598x.m60672b(C16620e.m47213e(Canvas.mo731d()) - fMo743q0, C16620e.m47211c(Canvas.mo731d()) - fMo743q0), 0.0f, c22135i2, 832);
                return C23454a0.f92919a;
            default:
                return p747z81.Function1.m128936o(this.f56823x, (InterfaceC17912t0) this.f56821E, this.f56824y, this.f56825z, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C15150t4(float f13, long j7, C22135i c22135i, long j13) {
        this.f56823x = f13;
        this.f56824y = j7;
        this.f56821E = c22135i;
        this.f56825z = j13;
    }

    public /* synthetic */ C15150t4(float f13, InterfaceC17912t0 interfaceC17912t0, long j7, long j13) {
        this.f56823x = f13;
        this.f56821E = interfaceC17912t0;
        this.f56824y = j7;
        this.f56825z = j13;
    }
}
