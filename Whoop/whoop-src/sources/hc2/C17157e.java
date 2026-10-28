package hc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.myaccount.MyAccountFragment;
import oa2.C27756d;

/* JADX INFO: renamed from: hc2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17157e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65861w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MyAccountFragment f65862x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27756d f65863y;

    public /* synthetic */ C17157e(MyAccountFragment myAccountFragment, C27756d c27756d, int i13) {
        this.f65861w = i13;
        this.f65862x = myAccountFragment;
        this.f65863y = c27756d;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f65861w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return MyAccountFragment.m25624h1(this.f65862x, this.f65863y, composer, iIntValue);
            default:
                return MyAccountFragment.m25626i1(this.f65862x, this.f65863y, composer, iIntValue);
        }
    }
}
