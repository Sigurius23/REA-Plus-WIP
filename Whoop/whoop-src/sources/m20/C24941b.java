package m20;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.p018ui.platform.ComposeView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: m20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24941b implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final PrimaryButton f97653a;

    /* JADX INFO: renamed from: b */
    public final ImageView f97654b;

    /* JADX INFO: renamed from: c */
    public final CircularProgressIndicator f97655c;

    /* JADX INFO: renamed from: d */
    public final ComposeView f97656d;

    /* JADX INFO: renamed from: e */
    public final ImageView f97657e;

    public C24941b(PrimaryButton primaryButton, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.f97653a = primaryButton;
        this.f97654b = imageView;
        this.f97655c = circularProgressIndicator;
        this.f97656d = composeView;
        this.f97657e = imageView2;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f97653a;
    }
}
