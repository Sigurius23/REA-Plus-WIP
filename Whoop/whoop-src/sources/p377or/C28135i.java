package p377or;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p144fc.InterfaceC14351g;

/* JADX INFO: renamed from: or.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C28135i implements InterfaceC14351g {

    /* JADX INFO: renamed from: a */
    public final WeakReference f113783a;

    /* JADX INFO: renamed from: b */
    public int f113784b;

    /* JADX INFO: renamed from: c */
    public int f113785c;

    public C28135i(TabLayout tabLayout) {
        this.f113783a = new WeakReference(tabLayout);
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: a */
    public final void mo24184a(int i13, float f13, int i14) {
        TabLayout tabLayout = (TabLayout) this.f113783a.get();
        if (tabLayout != null) {
            int i15 = this.f113785c;
            boolean z4 = true;
            if (i15 == 2 && this.f113784b != 1) {
                z4 = false;
            }
            if (i15 == 2 && this.f113784b == 0) {
                z4 = false;
            }
            tabLayout.m15793m(i13, f13, z4, z4, false);
        }
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: b */
    public final void mo24185b(int i13) {
        this.f113784b = this.f113785c;
        this.f113785c = i13;
        TabLayout tabLayout = (TabLayout) this.f113783a.get();
        if (tabLayout != null) {
            tabLayout.f21100x0 = this.f113785c;
        }
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: c */
    public final void mo19079c(int i13) {
        TabLayout tabLayout = (TabLayout) this.f113783a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i13 || i13 >= tabLayout.getTabCount()) {
            return;
        }
        int i14 = this.f113785c;
        tabLayout.m15791k(tabLayout.m15787g(i13), i14 == 0 || (i14 == 2 && this.f113784b == 0));
    }
}
