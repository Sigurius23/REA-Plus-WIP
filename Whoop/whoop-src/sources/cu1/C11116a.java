package cu1;

import c93.InterfaceC4339a;
import com.whoop.labrador.fragment.LabradorDetailsFragment;

/* JADX INFO: renamed from: cu1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11116a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35333w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LabradorDetailsFragment f35334x;

    public /* synthetic */ C11116a(LabradorDetailsFragment labradorDetailsFragment, int i13) {
        this.f35333w = i13;
        this.f35334x = labradorDetailsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35333w) {
            case 0:
                return LabradorDetailsFragment.m22462U(this.f35334x);
            case 1:
                return LabradorDetailsFragment.m22476i0(this.f35334x);
            case 2:
                return LabradorDetailsFragment.m22467Z(this.f35334x);
            case 3:
                return Boolean.valueOf(LabradorDetailsFragment.m22477j0(this.f35334x));
            case 4:
                return Boolean.valueOf(LabradorDetailsFragment.m22464W(this.f35334x));
            case 5:
                return LabradorDetailsFragment.m22465X(this.f35334x);
            default:
                return LabradorDetailsFragment.m22474g0(this.f35334x);
        }
    }
}
