package p040c0;

import m83.C25272z;
import p077d0.C11421z1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3744h0 extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f15315w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11421z1 f15316x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3744h0(Function1 function1, C11421z1 c11421z1) {
        super(3);
        this.f15315w = function1;
        this.f15316x = c11421z1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7;
        InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) obj2).mo448T(((C39169a) obj3).f168407a);
        if (interfaceC39133t0.mo781A()) {
            if (((Boolean) this.f15315w.invoke(this.f15316x.f36633d.getValue())).booleanValue()) {
                j7 = (((long) abstractC39104j1Mo448T.f168211w) << 32) | (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L);
            } else {
                j7 = 0;
            }
        } else {
            j7 = (((long) abstractC39104j1Mo448T.f168211w) << 32) | (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L);
        }
        return interfaceC39133t0.mo86822W((int) (j7 >> 32), (int) (4294967295L & j7), C25272z.f99163w, new C3741g0(abstractC39104j1Mo448T, 0));
    }
}
