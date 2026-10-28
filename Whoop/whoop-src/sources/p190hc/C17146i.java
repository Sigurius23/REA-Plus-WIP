package p190hc;

import a00.C0072g;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p211i5.InterfaceC18102o;

/* JADX INFO: renamed from: hc.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C17146i implements InterfaceC18102o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65829w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0072g f65830x;

    public /* synthetic */ C17146i(C0072g c0072g, int i13) {
        this.f65829w = i13;
        this.f65830x = c0072g;
    }

    @Override // p211i5.InterfaceC18102o
    /* JADX INFO: renamed from: m */
    public final boolean mo2226m(View view) {
        switch (this.f65829w) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.f65830x.f221E;
                if (viewPager2.f7324R) {
                    viewPager2.m5511e(currentItem, true);
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager3 = (ViewPager2) this.f65830x.f221E;
                if (viewPager3.f7324R) {
                    viewPager3.m5511e(currentItem2, true);
                }
                break;
        }
        return true;
    }
}
