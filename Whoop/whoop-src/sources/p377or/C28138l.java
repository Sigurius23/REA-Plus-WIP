package p377or;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: or.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C28138l implements InterfaceC28130d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113800a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f113801b;

    public /* synthetic */ C28138l(ViewGroup viewGroup, int i13) {
        this.f113800a = i13;
        this.f113801b = viewGroup;
    }

    @Override // p377or.InterfaceC28129c
    /* JADX INFO: renamed from: a */
    public final void mo85118a(C28134h c28134h) {
        switch (this.f113800a) {
            case 0:
                ((ViewPager) this.f113801b).setCurrentItem(c28134h.f113779d);
                break;
            default:
                ((ViewPager2) this.f113801b).m5510d(c28134h.f113779d, true);
                break;
        }
    }
}
