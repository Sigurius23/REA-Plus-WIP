package k30;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: k30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22170c implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f85986a;

    /* JADX INFO: renamed from: b */
    public final CircularProgressIndicator f85987b;

    public C22170c(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.f85986a = frameLayout;
        this.f85987b = circularProgressIndicator;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f85986a;
    }
}
