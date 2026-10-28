package p190hc;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.C1668c2;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p014aj.C0929d;
import p211i5.C18093f;

/* JADX INFO: renamed from: hc.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C17144g extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewPager2 f65828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17144g(ViewPager2 viewPager2) {
        super(1);
        this.f65828a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C1701k2 c1701k2, int[] iArr) {
        ViewPager2 viewPager2 = this.f65828a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(c1701k2, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityNodeInfo(C1668c2 c1668c2, C1701k2 c1701k2, C18093f c18093f) {
        super.onInitializeAccessibilityNodeInfo(c1668c2, c1701k2, c18093f);
        this.f65828a.f7326T.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final void onInitializeAccessibilityNodeInfoForItem(C1668c2 c1668c2, C1701k2 c1701k2, View view, C18093f c18093f) {
        ViewPager2 viewPager2 = (ViewPager2) this.f65828a.f7326T.f221E;
        c18093f.m51955j(C0929d.m2336s(viewPager2.getOrientation() == 1 ? viewPager2.f7313G.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f7313G.getPosition(view) : 0, 1, false));
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean performAccessibilityAction(C1668c2 c1668c2, C1701k2 c1701k2, int i13, Bundle bundle) {
        this.f65828a.f7326T.getClass();
        return super.performAccessibilityAction(c1668c2, c1701k2, i13, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC1740u1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z13) {
        return false;
    }
}
