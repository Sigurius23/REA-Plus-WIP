package p040c0;

import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3724a1 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15207w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3727b1 f15208x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3724a1(C3727b1 c3727b1, int i13) {
        super(1);
        this.f15207w = i13;
        this.f15208x = c3727b1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC11337c0 interfaceC11337c0;
        InterfaceC11337c0 interfaceC11337c1;
        switch (this.f15207w) {
            case 0:
                InterfaceC11403t1 interfaceC11403t1 = (InterfaceC11403t1) obj;
                EnumC3771q0 enumC3771q0 = EnumC3771q0.f15392w;
                EnumC3771q0 enumC3771q1 = EnumC3771q0.f15393x;
                boolean zM30637d = interfaceC11403t1.m30637d(enumC3771q0, enumC3771q1);
                Object obj2 = null;
                C3727b1 c3727b1 = this.f15208x;
                if (zM30637d) {
                    C3753k0 c3753k0 = ((C3733d1) c3727b1.f15223T).f15271b.f15432c;
                    if (c3753k0 != null) {
                        obj2 = c3753k0.f15343c;
                    }
                } else if (interfaceC11403t1.m30637d(enumC3771q1, EnumC3771q0.f15394y)) {
                    C3753k0 c3753k1 = ((C3739f1) c3727b1.f15224U).f15302c.f15432c;
                    if (c3753k1 != null) {
                        obj2 = c3753k1.f15343c;
                    }
                } else {
                    obj2 = AbstractC3788w0.f15446d;
                }
                return obj2 == null ? AbstractC3788w0.f15446d : obj2;
            default:
                InterfaceC11403t1 interfaceC11403t2 = (InterfaceC11403t1) obj;
                EnumC3771q0 enumC3771q2 = EnumC3771q0.f15392w;
                EnumC3771q0 enumC3771q3 = EnumC3771q0.f15393x;
                boolean zM30637d2 = interfaceC11403t2.m30637d(enumC3771q2, enumC3771q3);
                C3727b1 c3727b2 = this.f15208x;
                if (zM30637d2) {
                    C3778s1 c3778s1 = ((C3733d1) c3727b2.f15223T).f15271b.f15431b;
                    return (c3778s1 == null || (interfaceC11337c1 = c3778s1.f15417b) == null) ? AbstractC3788w0.f15445c : interfaceC11337c1;
                }
                if (!interfaceC11403t2.m30637d(enumC3771q3, EnumC3771q0.f15394y)) {
                    return AbstractC3788w0.f15445c;
                }
                C3778s1 c3778s2 = ((C3739f1) c3727b2.f15224U).f15302c.f15431b;
                return (c3778s2 == null || (interfaceC11337c0 = c3778s2.f15417b) == null) ? AbstractC3788w0.f15445c : interfaceC11337c0;
        }
    }
}
