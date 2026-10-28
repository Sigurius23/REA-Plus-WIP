package p524ui;

import c93.InterfaceC4339a;
import p426qi.C30387i;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ui.q */
/* JADX INFO: loaded from: classes.dex */
public final class C34989q extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148043w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34990r f148044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34989q(C34990r c34990r, int i13) {
        super(0);
        this.f148043w = i13;
        this.f148044x = c34990r;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f148043w) {
            case 0:
                C34990r c34990r = this.f148044x;
                return Boolean.valueOf((((C30387i) c34990r.f148048x.getValue()) == null && ((Throwable) c34990r.f148049y.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f148044x.f148049y.getValue()) != null);
            case 2:
                C34990r c34990r2 = this.f148044x;
                return Boolean.valueOf(((C30387i) c34990r2.f148048x.getValue()) == null && ((Throwable) c34990r2.f148049y.getValue()) == null);
            default:
                return Boolean.valueOf(((C30387i) this.f148044x.f148048x.getValue()) != null);
        }
    }
}
