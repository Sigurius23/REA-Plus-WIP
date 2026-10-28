package s40;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CountryTextInputLayout;
import ec3.C13045h2;
import m83.AbstractC25265s;
import y00.EnumC38853i;

/* JADX INFO: renamed from: s40.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32156i implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133210w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ViewGroup f133211x;

    public /* synthetic */ C32156i(ViewGroup viewGroup, int i13) {
        this.f133210w = i13;
        this.f133211x = viewGroup;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        Object value;
        int i14 = this.f133210w;
        ViewGroup viewGroup = this.f133211x;
        switch (i14) {
            case 0:
                CardBrandView cardBrandView = (CardBrandView) viewGroup;
                int i15 = CardBrandView.f22473E;
                EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74102I0(i13 - 1, cardBrandView.getPossibleBrands());
                if (enumC38853i != null) {
                    C13045h2 c13045h2 = cardBrandView.f22477z;
                    do {
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, C32161k.m100107b((C32161k) value, false, null, enumC38853i, null, null, false, false, 247)));
                    cardBrandView.m16899c();
                }
                cardBrandView.f22476y.dismiss();
                break;
            default:
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) viewGroup;
                countryTextInputLayout.m16912R(countryTextInputLayout.f22535j1.m100105a(i13).getCode());
                break;
        }
    }
}
