package p040c0;

import gb.C15647h;
import p114eb.C12977n0;
import p114eb.C12982q;
import p505ts.AbstractC34132o;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3786v0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15439w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15440x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3786v0(Function1 function1, int i13) {
        super(1);
        this.f15439w = i13;
        this.f15440x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15439w;
        Function1 function1 = this.f15440x;
        switch (i13) {
            case 0:
                long j7 = ((C39180l) obj).f168422a;
                return new C39180l((((long) ((int) (j7 >> 32))) << 32) | (4294967295L & ((long) ((Number) function1.invoke(Integer.valueOf((int) (j7 & 4294967295L)))).intValue())));
            case 1:
                long j13 = ((C39180l) obj).f168422a;
                return new C39180l((((long) ((int) (j13 >> 32))) << 32) | (4294967295L & ((long) ((Number) function1.invoke(Integer.valueOf((int) (j13 & 4294967295L)))).intValue())));
            case 2:
                return new C39178j((((long) 0) & 4294967295L) | (((long) ((Number) function1.invoke(Integer.valueOf((int) (((C39180l) obj).f168422a >> 32)))).intValue()) << 32));
            case 3:
                return new C39178j((((long) 0) << 32) | (((long) ((Number) function1.invoke(Integer.valueOf((int) (((C39180l) obj).f168422a & 4294967295L)))).intValue()) & 4294967295L));
            case 4:
                return new C39178j((((long) 0) & 4294967295L) | (((long) ((Number) function1.invoke(Integer.valueOf((int) (((C39180l) obj).f168422a >> 32)))).intValue()) << 32));
            case 5:
                return new C39178j((((long) 0) << 32) | (((long) ((Number) function1.invoke(Integer.valueOf((int) (((C39180l) obj).f168422a & 4294967295L)))).intValue()) & 4294967295L));
            default:
                C3789x c3789x = (C3789x) ((InterfaceC3770q) obj);
                C12977n0 c12977n0 = ((C12982q) c3789x.mo11595b()).f44844x;
                AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i14 = C12977n0.f44815K;
                for (C12977n0 c12977n1 : AbstractC34132o.m107896y((C15647h) c12977n0)) {
                }
                if (function1 != null) {
                    return (C3775r1) function1.invoke(c3789x);
                }
                return null;
        }
    }
}
