package p377or;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p190hc.AbstractC17145h;

/* JADX INFO: renamed from: or.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C28140n extends AbstractC17145h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f113802a;

    /* JADX INFO: renamed from: c */
    public int f113804c = 0;

    /* JADX INFO: renamed from: b */
    public int f113803b = 0;

    public C28140n(TabLayout tabLayout) {
        this.f113802a = new WeakReference(tabLayout);
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageScrollStateChanged(int i13) {
        this.f113803b = this.f113804c;
        this.f113804c = i13;
        TabLayout tabLayout = (TabLayout) this.f113802a.get();
        if (tabLayout != null) {
            tabLayout.f21100x0 = this.f113804c;
        }
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageScrolled(int i13, float f13, int i14) {
        TabLayout tabLayout = (TabLayout) this.f113802a.get();
        if (tabLayout != null) {
            int i15 = this.f113804c;
            boolean z4 = true;
            if (i15 == 2 && this.f113803b != 1) {
                z4 = false;
            }
            if (i15 == 2 && this.f113803b == 0) {
                z4 = false;
            }
            tabLayout.m15793m(i13, f13, z4, z4, false);
        }
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageSelected(int i13) {
        TabLayout tabLayout = (TabLayout) this.f113802a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i13 || i13 >= tabLayout.getTabCount()) {
            return;
        }
        int i14 = this.f113804c;
        tabLayout.m15791k(tabLayout.m15787g(i13), i14 == 0 || (i14 == 2 && this.f113803b == 0));
    }
}
