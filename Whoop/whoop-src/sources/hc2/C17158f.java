package hc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.myaccount.MyAccountFragment;
import y71.C39282o;

/* JADX INFO: renamed from: hc2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17158f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65864w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39282o f65865x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MyAccountFragment f65866y;

    public /* synthetic */ C17158f(C39282o c39282o, MyAccountFragment myAccountFragment, int i13) {
        this.f65864w = i13;
        this.f65865x = c39282o;
        this.f65866y = myAccountFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f65864w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return MyAccountFragment.m25646s1(this.f65865x, this.f65866y, composer, iIntValue);
            case 1:
                return MyAccountFragment.m25594S0(this.f65865x, this.f65866y, composer, iIntValue);
            case 2:
                return MyAccountFragment.m25648t1(this.f65865x, this.f65866y, composer, iIntValue);
            default:
                return MyAccountFragment.m25596T0(this.f65865x, this.f65866y, composer, iIntValue);
        }
    }
}
