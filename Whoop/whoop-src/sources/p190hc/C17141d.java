package p190hc;

import a00.C0072g;
import androidx.recyclerview.widget.AbstractC1700k1;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: hc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C17141d extends AbstractC1700k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65825b;

    public /* synthetic */ C17141d(Object obj, int i13) {
        this.f65824a = i13;
        this.f65825b = obj;
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onChanged() {
        switch (this.f65824a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f65825b;
                viewPager2.f7311E = true;
                viewPager2.f7318L.f65823l = true;
                break;
            default:
                ((C0072g) this.f65825b).m180P();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeChanged(int i13, int i14) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeInserted(int i13, int i14) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeMoved(int i13, int i14, int i15) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeRemoved(int i13, int i14) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeChanged(int i13, int i14, Object obj) {
        onChanged();
    }
}
