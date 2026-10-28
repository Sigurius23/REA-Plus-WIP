package p040c0;

import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3777s0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15413w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC3730c1 f15414x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC3736e1 f15415y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3777s0(AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, int i13) {
        super(1);
        this.f15413w = i13;
        this.f15414x = abstractC3730c1;
        this.f15415y = abstractC3736e1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC11337c0 interfaceC11337c0;
        InterfaceC11337c0 interfaceC11337c1;
        InterfaceC11337c0 interfaceC11337c2;
        InterfaceC11337c0 interfaceC11337c3;
        switch (this.f15413w) {
            case 0:
                InterfaceC11403t1 interfaceC11403t1 = (InterfaceC11403t1) obj;
                EnumC3771q0 enumC3771q0 = EnumC3771q0.f15392w;
                EnumC3771q0 enumC3771q1 = EnumC3771q0.f15393x;
                if (interfaceC11403t1.m30637d(enumC3771q0, enumC3771q1)) {
                    C3742g1 c3742g1 = ((C3733d1) this.f15414x).f15271b.f15430a;
                    return (c3742g1 == null || (interfaceC11337c1 = c3742g1.f15310b) == null) ? AbstractC3788w0.f15444b : interfaceC11337c1;
                }
                if (!interfaceC11403t1.m30637d(enumC3771q1, EnumC3771q0.f15394y)) {
                    return AbstractC3788w0.f15444b;
                }
                C3742g1 c3742g2 = ((C3739f1) this.f15415y).f15302c.f15430a;
                return (c3742g2 == null || (interfaceC11337c0 = c3742g2.f15310b) == null) ? AbstractC3788w0.f15444b : interfaceC11337c0;
            case 1:
                int iOrdinal = ((EnumC3771q0) obj).ordinal();
                float f13 = 1.0f;
                if (iOrdinal == 0) {
                    C3742g1 c3742g3 = ((C3733d1) this.f15414x).f15271b.f15430a;
                    if (c3742g3 != null) {
                        f13 = c3742g3.f15309a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3742g1 c3742g4 = ((C3739f1) this.f15415y).f15302c.f15430a;
                    if (c3742g4 != null) {
                        f13 = c3742g4.f15309a;
                    }
                }
                return Float.valueOf(f13);
            case 2:
                InterfaceC11403t1 interfaceC11403t2 = (InterfaceC11403t1) obj;
                EnumC3771q0 enumC3771q2 = EnumC3771q0.f15392w;
                EnumC3771q0 enumC3771q3 = EnumC3771q0.f15393x;
                if (interfaceC11403t2.m30637d(enumC3771q2, enumC3771q3)) {
                    C3757l1 c3757l1 = ((C3733d1) this.f15414x).f15271b.f15433d;
                    return (c3757l1 == null || (interfaceC11337c3 = c3757l1.f15355c) == null) ? AbstractC3788w0.f15444b : interfaceC11337c3;
                }
                if (!interfaceC11403t2.m30637d(enumC3771q3, EnumC3771q0.f15394y)) {
                    return AbstractC3788w0.f15444b;
                }
                C3757l1 c3757l2 = ((C3739f1) this.f15415y).f15302c.f15433d;
                return (c3757l2 == null || (interfaceC11337c2 = c3757l2.f15355c) == null) ? AbstractC3788w0.f15444b : interfaceC11337c2;
            default:
                int iOrdinal2 = ((EnumC3771q0) obj).ordinal();
                float f14 = 1.0f;
                if (iOrdinal2 == 0) {
                    C3757l1 c3757l3 = ((C3733d1) this.f15414x).f15271b.f15433d;
                    if (c3757l3 != null) {
                        f14 = c3757l3.f15353a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3757l1 c3757l4 = ((C3739f1) this.f15415y).f15302c.f15433d;
                    if (c3757l4 != null) {
                        f14 = c3757l4.f15353a;
                    }
                }
                return Float.valueOf(f14);
        }
    }
}
