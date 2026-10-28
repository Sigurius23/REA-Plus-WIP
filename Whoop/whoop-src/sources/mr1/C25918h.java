package mr1;

import c93.InterfaceC4339a;
import com.whoop.entitlements.p060ui.NotFoundFragment;
import com.whoop.settings.language.LanguagePrefsFragment;
import p114eb.AbstractC12939a0;

/* JADX INFO: renamed from: mr1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25918h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102330w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12939a0 f102331x;

    public /* synthetic */ C25918h(AbstractC12939a0 abstractC12939a0, int i13) {
        this.f102330w = i13;
        this.f102331x = abstractC12939a0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f102330w) {
            case 0:
                return AbstractC25920j.m76663i(this.f102331x);
            case 1:
                return AbstractC25920j.m76664j(this.f102331x);
            case 2:
                return LanguagePrefsFragment.m25519G(this.f102331x);
            default:
                return NotFoundFragment.m21402E(this.f102331x);
        }
    }
}
