package k30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: k30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22168a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f85980a;

    /* JADX INFO: renamed from: b */
    public final FragmentContainerView f85981b;

    public C22168a(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.f85980a = frameLayout;
        this.f85981b = fragmentContainerView;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f85980a;
    }
}
