package p292l1;

import l83.C23454a0;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import px0.AbstractC29593c;
import y11.AbstractC39061n;

/* JADX INFO: renamed from: l1.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23134m1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f91477x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f91478y;

    public /* synthetic */ C23134m1(float f13, long j7) {
        this.f91476w = 0;
        this.f91478y = f13;
        this.f91477x = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91476w) {
            case 0:
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                float f13 = this.f91478y;
                float fMo743q0 = interfaceC22131e.mo743q0(f13);
                float f14 = 2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC22131e.mo743q0(f13) / f14)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
                interfaceC22131e.mo732d0(this.f91477x, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(interfaceC22131e.mo743q0(f13) / f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (496 & 8) != 0 ? 0.0f : fMo743q0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                return C23454a0.f92919a;
            case 1:
                return AbstractC29593c.m90739H(this.f91477x, this.f91478y, (InterfaceC22131e) obj);
            default:
                return AbstractC39061n.m124554g(this.f91477x, this.f91478y, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C23134m1(long j7, float f13, int i13) {
        this.f91476w = i13;
        this.f91477x = j7;
        this.f91478y = f13;
    }
}
