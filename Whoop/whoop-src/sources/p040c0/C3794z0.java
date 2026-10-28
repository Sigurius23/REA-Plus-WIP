package p040c0;

import p026b2.InterfaceC2302h;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3794z0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3727b1 f15470x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f15471y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3794z0(C3727b1 c3727b1, long j7, int i13) {
        super(1);
        this.f15469w = i13;
        this.f15470x = c3727b1;
        this.f15471y = j7;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jM124793c;
        int iOrdinal;
        switch (this.f15469w) {
            case 0:
                int iOrdinal2 = ((EnumC3771q0) obj).ordinal();
                C3727b1 c3727b1 = this.f15470x;
                long j7 = this.f15471y;
                if (iOrdinal2 == 0) {
                    C3753k0 c3753k0 = ((C3733d1) c3727b1.f15223T).f15271b.f15432c;
                    if (c3753k0 != null) {
                        j7 = ((C39180l) c3753k0.f15342b.invoke(new C39180l(j7))).f168422a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3753k0 c3753k1 = ((C3739f1) c3727b1.f15224U).f15302c.f15432c;
                    if (c3753k1 != null) {
                        j7 = ((C39180l) c3753k1.f15342b.invoke(new C39180l(j7))).f168422a;
                    }
                }
                return new C39180l(j7);
            case 1:
                EnumC3771q0 enumC3771q0 = (EnumC3771q0) obj;
                C3727b1 c3727b2 = this.f15470x;
                if (c3727b2.f15228Y == null || c3727b2.m11561Z0() == null || AbstractC22676k.m65745e(c3727b2.f15228Y, c3727b2.m11561Z0()) || (iOrdinal = enumC3771q0.ordinal()) == 0 || iOrdinal == 1) {
                    jM124793c = 0;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3753k0 c3753k2 = ((C3739f1) c3727b2.f15224U).f15302c.f15432c;
                    if (c3753k2 != null) {
                        Function1 function1 = c3753k2.f15342b;
                        long j13 = this.f15471y;
                        long j14 = ((C39180l) function1.invoke(new C39180l(j13))).f168422a;
                        InterfaceC2302h interfaceC2302hM11561Z0 = c3727b2.m11561Z0();
                        AbstractC22676k.m65747g(interfaceC2302hM11561Z0);
                        EnumC39181m enumC39181m = EnumC39181m.f168423w;
                        long jMo7156a = interfaceC2302hM11561Z0.mo7156a(j13, j14, enumC39181m);
                        InterfaceC2302h interfaceC2302h = c3727b2.f15228Y;
                        AbstractC22676k.m65747g(interfaceC2302h);
                        jM124793c = C39178j.m124793c(jMo7156a, interfaceC2302h.mo7156a(j13, j14, enumC39181m));
                    } else {
                        jM124793c = 0;
                    }
                }
                return new C39178j(jM124793c);
            default:
                EnumC3771q0 enumC3771q1 = (EnumC3771q0) obj;
                C3727b1 c3727b3 = this.f15470x;
                C3778s1 c3778s1 = ((C3733d1) c3727b3.f15223T).f15271b.f15431b;
                long j15 = this.f15471y;
                long j16 = 0;
                long j17 = c3778s1 != null ? ((C39178j) c3778s1.f15416a.invoke(new C39180l(j15))).f168416a : 0L;
                C3778s1 c3778s2 = ((C3739f1) c3727b3.f15224U).f15302c.f15431b;
                long j18 = c3778s2 != null ? ((C39178j) c3778s2.f15416a.invoke(new C39180l(j15))).f168416a : 0L;
                int iOrdinal3 = enumC3771q1.ordinal();
                if (iOrdinal3 == 0) {
                    j16 = j17;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j16 = j18;
                }
                return new C39178j(j16);
        }
    }
}
