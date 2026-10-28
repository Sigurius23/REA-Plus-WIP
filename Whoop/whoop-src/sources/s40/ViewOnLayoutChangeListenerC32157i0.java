package s40;

import android.view.View;
import com.stripe.android.view.CountryTextInputLayout;

/* JADX INFO: renamed from: s40.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC32157i0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ CountryTextInputLayout f133212w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f133213x;

    public ViewOnLayoutChangeListenerC32157i0(CountryTextInputLayout countryTextInputLayout, boolean z4) {
        this.f133212w = countryTextInputLayout;
        this.f133213x = z4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        view.removeOnLayoutChangeListener(this);
        this.f133212w.getCountryAutocomplete().setEnabled(this.f133213x);
    }
}
