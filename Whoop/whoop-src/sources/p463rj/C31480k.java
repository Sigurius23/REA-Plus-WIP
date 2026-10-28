package p463rj;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C31480k extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129712w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22680m f129713x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f129714y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31480k(Function1 function1, boolean z4, int i13) {
        super(0);
        this.f129712w = i13;
        switch (i13) {
            case 1:
                this.f129713x = (AbstractC22680m) function1;
                this.f129714y = z4;
                super(0);
                break;
            default:
                this.f129713x = (AbstractC22680m) function1;
                this.f129714y = z4;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f129712w) {
            case 0:
                this.f129713x.invoke(Boolean.valueOf(!this.f129714y));
                break;
            default:
                this.f129713x.invoke(Boolean.valueOf(!this.f129714y));
                break;
        }
        return C23454a0.f92919a;
    }
}
