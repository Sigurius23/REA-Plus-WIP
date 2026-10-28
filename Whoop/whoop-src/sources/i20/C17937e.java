package i20;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import l83.C23454a0;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17937e implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69712w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AddressElementActivity f69713x;

    public /* synthetic */ C17937e(AddressElementActivity addressElementActivity, int i13) {
        this.f69712w = i13;
        this.f69713x = addressElementActivity;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f69712w) {
            case 0:
                InterfaceC3764o composable = (InterfaceC3764o) obj;
                C12982q it = (C12982q) obj2;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(composable, "$this$composable");
                AbstractC22676k.m65750j(it, "it");
                AbstractC17960l1.m51581h(AddressElementActivity.m16862n(this.f69713x).f69791x, (Composer) obj3, 0);
                break;
            default:
                InterfaceC3764o composable2 = (InterfaceC3764o) obj;
                C12982q backStackEntry = (C12982q) obj2;
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(composable2, "$this$composable");
                AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
                Bundle bundleM36479a = backStackEntry.m36479a();
                String string = bundleM36479a != null ? bundleM36479a.getString("country") : null;
                AddressElementActivity addressElementActivity = this.f69713x;
                AbstractC17960l1.m51574a(AddressElementActivity.m16862n(addressElementActivity).f69792y, AddressElementActivity.m16862n(addressElementActivity).f69790w, string, composer, 0);
                break;
        }
        return C23454a0.f92919a;
    }
}
