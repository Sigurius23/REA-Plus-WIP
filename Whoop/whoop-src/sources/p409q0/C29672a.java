package p409q0;

import e93.AbstractC12889b;
import java.util.concurrent.CancellationException;
import p180h0.EnumC16377d2;
import p299l9.C23517o;
import p390p1.C28617g1;
import p492t2.InterfaceC33313a;
import p636y3.C39185q;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C29672a implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final AbstractC29701y f121285w;

    /* JADX INFO: renamed from: x */
    public final EnumC16377d2 f121286x;

    public C29672a(AbstractC29701y abstractC29701y, EnumC16377d2 enumC16377d2) {
        this.f121285w = abstractC29701y;
        this.f121286x = enumC16377d2;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (i13 != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f121286x == EnumC16377d2.f62972x ? j13 >> 32 : 4294967295L & j13)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        return new C39185q(this.f121286x == EnumC16377d2.f62971w ? C39185q.m124811b(0.0f, 0.0f, j13, 2) : C39185q.m124811b(0.0f, 0.0f, j13, 1));
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        if (i13 != 1) {
            return 0L;
        }
        AbstractC29701y abstractC29701y = this.f121285w;
        C23517o c23517o = abstractC29701y.f121433d;
        C23517o c23517o2 = abstractC29701y.f121433d;
        if (Math.abs(((C28617g1) c23517o.f93080d).m87022x()) <= 1.0E-6d) {
            return 0L;
        }
        float fM87022x = ((C28617g1) c23517o2.f93080d).m87022x() * abstractC29701y.m91164n();
        float f13 = ((abstractC29701y.m91163l().f121382b + abstractC29701y.m91163l().f121383c) * (-Math.signum(((C28617g1) c23517o2.f93080d).m87022x()))) + fM87022x;
        if (((C28617g1) c23517o2.f93080d).m87022x() > 0.0f) {
            f13 = fM87022x;
            fM87022x = f13;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62972x;
        EnumC16377d2 enumC16377d3 = this.f121286x;
        float fIntBitsToFloat = -abstractC29701y.f121440k.mo9766e(-AbstractC12889b.m36283m(Float.intBitsToFloat((int) (enumC16377d3 == enumC16377d2 ? j7 >> 32 : j7 & 4294967295L)), fM87022x, f13));
        float fIntBitsToFloat2 = enumC16377d3 == enumC16377d2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j7 >> 32));
        if (enumC16377d3 != EnumC16377d2.f62971w) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }
}
