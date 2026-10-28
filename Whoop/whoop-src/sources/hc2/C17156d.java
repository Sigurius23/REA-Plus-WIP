package hc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.settings.myaccount.MyAccountFragment;

/* JADX INFO: renamed from: hc2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17156d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MyAccountFragment f65860x;

    public /* synthetic */ C17156d(MyAccountFragment myAccountFragment, int i13) {
        this.f65859w = i13;
        this.f65860x = myAccountFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65859w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return MyAccountFragment.m25657z0(this.f65860x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return MyAccountFragment.m25558A0(this.f65860x, (Composer) obj, iIntValue2);
            default:
                return MyAccountFragment.m25630k1(this.f65860x, (C9598e) obj, (String) obj2);
        }
    }
}
