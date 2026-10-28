package eq0;

import android.view.View;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;

/* JADX INFO: renamed from: eq0.f2 */
/* JADX INFO: loaded from: classes7.dex */
public final class C13464f2 implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f47284a;

    private C13464f2(FrameLayout frameLayout) {
        this.f47284a = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public static C13464f2 m38187a(View view) {
        if (view != null) {
            return new C13464f2((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f47284a;
    }
}
