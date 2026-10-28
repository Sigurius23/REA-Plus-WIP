package p190hc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1744v1;
import androidx.recyclerview.widget.InterfaceC1748w1;

/* JADX INFO: renamed from: hc.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17143f implements InterfaceC1748w1 {
    @Override // androidx.recyclerview.widget.InterfaceC1748w1
    /* JADX INFO: renamed from: a */
    public final void mo5281a(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1748w1
    /* JADX INFO: renamed from: c */
    public final void mo5282c(View view) {
        C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c1744v1).width != -1 || ((ViewGroup.MarginLayoutParams) c1744v1).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
