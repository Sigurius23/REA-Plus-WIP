package ph1;

import c93.InterfaceC4339a;
import com.whoop.gifting.feature.gifting.view.GiftingFragment;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ph1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29246j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118358w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f118359x;

    public /* synthetic */ C29246j(Object obj, int i13) {
        this.f118358w = i13;
        this.f118359x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118358w) {
            case 0:
                return AbstractC29245i.c.m88835h((C15199y3) this.f118359x);
            case 1:
                return GiftingFragment.m21464C((GiftingFragment) this.f118359x);
            case 2:
                return AbstractC29245i.m88796X((Function1) this.f118359x);
            default:
                return AbstractC29245i.m88785M((InterfaceC28601c1) this.f118359x);
        }
    }
}
