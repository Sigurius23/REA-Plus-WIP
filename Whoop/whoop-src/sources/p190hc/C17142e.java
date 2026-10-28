package p190hc;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: hc.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C17142e extends AbstractC17145h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPager2 f65827b;

    public /* synthetic */ C17142e(ViewPager2 viewPager2, int i13) {
        this.f65826a = i13;
        this.f65827b = viewPager2;
    }

    @Override // p190hc.AbstractC17145h
    public void onPageScrollStateChanged(int i13) {
        switch (this.f65826a) {
            case 0:
                if (i13 == 0) {
                    this.f65827b.m5512f();
                }
                break;
            default:
                super.onPageScrollStateChanged(i13);
                break;
        }
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageSelected(int i13) {
        switch (this.f65826a) {
            case 0:
                ViewPager2 viewPager2 = this.f65827b;
                if (viewPager2.f7330z != i13) {
                    viewPager2.f7330z = i13;
                    viewPager2.f7326T.m180P();
                }
                break;
            default:
                ViewPager2 viewPager3 = this.f65827b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.f7316J.requestFocus(2);
                }
                break;
        }
    }
}
