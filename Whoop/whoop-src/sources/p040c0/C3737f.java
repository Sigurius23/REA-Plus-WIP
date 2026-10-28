package p040c0;

import androidx.compose.runtime.Composer;
import m83.C25272z;
import p027b3.C2442t0;
import p077d0.InterfaceC11337c0;
import p390p1.C28655q;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3737f extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15291w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15292x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3737f(Object obj, int i13) {
        super(3);
        this.f15291w = i13;
        this.f15292x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15291w) {
            case 0:
                AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) obj2).mo448T(((C39169a) obj3).f168407a);
                return ((InterfaceC39133t0) obj).mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C2442t0(5, abstractC39104j1Mo448T, (C3756l0) this.f15292x));
            default:
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(955869654);
                InterfaceC11337c0 interfaceC11337c0 = (InterfaceC11337c0) this.f15292x;
                c28655q.m87173q(false);
                return interfaceC11337c0;
        }
    }
}
