package fd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment;

/* JADX INFO: renamed from: fd1.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14400b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52549w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DesignShowcaseMenuFragment f52550x;

    public /* synthetic */ C14400b(DesignShowcaseMenuFragment designShowcaseMenuFragment, int i13) {
        this.f52549w = i13;
        this.f52550x = designShowcaseMenuFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f52549w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return DesignShowcaseMenuFragment.m21230M(this.f52550x, composer, iIntValue);
            default:
                return DesignShowcaseMenuFragment.m21231N(this.f52550x, composer, iIntValue);
        }
    }
}
