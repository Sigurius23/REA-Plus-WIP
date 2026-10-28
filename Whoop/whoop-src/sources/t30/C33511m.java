package t30;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t30.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C33511m extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139889w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33512n f139890x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33511m(C33512n c33512n, int i13) {
        super(0);
        this.f139889w = i13;
        this.f139890x = c33512n;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f139889w) {
            case 0:
                return this.f139890x.requireActivity().getViewModelStore();
            default:
                return this.f139890x.requireActivity().getDefaultViewModelCreationExtras();
        }
    }
}
