package fd1;

import c93.InterfaceC4339a;
import com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment;

/* JADX INFO: renamed from: fd1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14399a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52547w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DesignShowcaseMenuFragment f52548x;

    public /* synthetic */ C14399a(DesignShowcaseMenuFragment designShowcaseMenuFragment, int i13) {
        this.f52547w = i13;
        this.f52548x = designShowcaseMenuFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f52547w) {
            case 0:
                return DesignShowcaseMenuFragment.m21237T(this.f52548x);
            default:
                return DesignShowcaseMenuFragment.m21233P(this.f52548x);
        }
    }
}
