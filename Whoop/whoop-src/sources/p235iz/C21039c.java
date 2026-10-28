package p235iz;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.view.MaskedCardView;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: iz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21039c implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final MaskedCardView f79769a;

    /* JADX INFO: renamed from: b */
    public final AppCompatImageView f79770b;

    /* JADX INFO: renamed from: c */
    public final AppCompatImageView f79771c;

    /* JADX INFO: renamed from: d */
    public final AppCompatTextView f79772d;

    public C21039c(MaskedCardView maskedCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f79769a = maskedCardView;
        this.f79770b = appCompatImageView;
        this.f79771c = appCompatImageView2;
        this.f79772d = appCompatTextView;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f79769a;
    }
}
