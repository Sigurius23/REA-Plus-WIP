package mn1;

import com.whoop.homecustomization.view.legacy.HomeCustomizationFragment;
import hn1.AbstractC17518d;
import jn1.AbstractC21803b;
import p163g1.EnumC15209z3;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mn1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25715f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101301w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HomeCustomizationFragment f101302x;

    public /* synthetic */ C25715f(HomeCustomizationFragment homeCustomizationFragment, int i13) {
        this.f101301w = i13;
        this.f101302x = homeCustomizationFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101301w) {
            case 0:
                return Boolean.valueOf(HomeCustomizationFragment.m21915I(this.f101302x, (EnumC15209z3) obj));
            case 1:
                return HomeCustomizationFragment.m21917K(this.f101302x, (AbstractC21803b) obj);
            default:
                return HomeCustomizationFragment.m21918L(this.f101302x, (AbstractC17518d) obj);
        }
    }
}
