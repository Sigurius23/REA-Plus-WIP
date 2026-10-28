package m20;

import android.view.View;
import android.widget.FrameLayout;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: m20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24940a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f97652a;

    public C24940a(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.f97652a = frameLayout;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f97652a;
    }
}
