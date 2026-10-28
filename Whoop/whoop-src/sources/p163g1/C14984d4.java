package p163g1;

import l83.C23454a0;
import m51.AbstractC25080b;
import m51.InterfaceC25079a;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p077d0.C11344e;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.InterfaceC22973k1;
import p389p0.C28550t;
import p500tb.InterfaceC33687a;
import p510u0.C34354s0;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import t71.AbstractC33564a;
import us1.C35219b;

/* JADX INFO: renamed from: g1.d4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14984d4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56003w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56004x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56005y;

    public /* synthetic */ C14984d4(long j7, Object obj, int i13) {
        this.f56003w = i13;
        this.f56004x = j7;
        this.f56005y = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        int i13 = this.f56003w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        long j7 = this.f56004x;
        Object obj2 = this.f56005y;
        switch (i13) {
            case 0:
                InterfaceC22973k1 interfaceC22973k1 = (InterfaceC22973k1) obj2;
                InterfaceC22129c interfaceC22129c = (InterfaceC22129c) obj;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                if (fIntBitsToFloat2 > 0.0f) {
                    C0238p0 c0238p0 = (C0238p0) interfaceC22129c;
                    float fMo743q0 = c0238p0.mo743q0(AbstractC15050j4.f56342a);
                    C22128b c22128b = c0238p0.f815w;
                    float fMo743q1 = c0238p0.mo743q0(interfaceC22973k1.mo43110b(c0238p0.getLayoutDirection())) - fMo743q0;
                    float f13 = 2;
                    float fIntBitsToFloat3 = (fMo743q0 * f13) + fIntBitsToFloat2 + fMo743q1;
                    EnumC39181m layoutDirection = c0238p0.getLayoutDirection();
                    int[] iArr = AbstractC15039i4.f56305a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) - fIntBitsToFloat3;
                    } else {
                        fIntBitsToFloat = fMo743q1 < 0.0f ? 0.0f : fMo743q1;
                    }
                    float f14 = fIntBitsToFloat;
                    if (iArr[c0238p0.getLayoutDirection().ordinal()] == 1) {
                        fIntBitsToFloat3 = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) - (fMo743q1 >= 0.0f ? fMo743q1 : 0.0f);
                    }
                    float f15 = fIntBitsToFloat3;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    float f16 = (-fIntBitsToFloat4) / f13;
                    float f17 = fIntBitsToFloat4 / f13;
                    C0237p c0237pMo744t0 = c0238p0.mo744t0();
                    long jM670A = c0237pMo744t0.m670A();
                    c0237pMo744t0.m716w().mo51426q();
                    try {
                        ((C0929d) c0237pMo744t0.f812x).m2346d(f14, f16, f15, f17, 0);
                        c0238p0.m728a();
                    } finally {
                        AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                    }
                } else {
                    ((C0238p0) interfaceC22129c).m728a();
                }
                return c23454a0;
            case 1:
                return AbstractC25080b.m73579c(j7, (InterfaceC25079a) obj2, (InterfaceC22131e) obj);
            case 2:
                C28550t c28550t = (C28550t) obj2;
                long jM124793c = C39178j.m124793c(((C39178j) ((C11344e) obj).m30549e()).f168416a, j7);
                int i14 = C28550t.f115500t;
                c28550t.m86859m(jM124793c);
                c28550t.f115503c.invoke();
                return c23454a0;
            case 3:
                return AbstractC33564a.m105987f(j7, (C22135i) obj2, (InterfaceC22131e) obj);
            case 4:
                C34354s0 c34354s0 = (C34354s0) obj2;
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                if (((Boolean) c34354s0.f144325s.getValue()).booleanValue() || ((Boolean) c34354s0.f144326t.getValue()).booleanValue()) {
                    InterfaceC22131e.m63383i0(interfaceC22131e, this.f56004x, 0L, 0L, 0.0f, null, 0, 126);
                }
                return c23454a0;
            default:
                return ((C35219b) obj2).m111581t(j7, (InterfaceC33687a) obj);
        }
    }

    public /* synthetic */ C14984d4(Object obj, long j7, int i13) {
        this.f56003w = i13;
        this.f56005y = obj;
        this.f56004x = j7;
    }
}
