package p190hc;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: hc.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C17149l extends RecyclerView {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ViewPager2 f65832w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17149l(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f65832w = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f65832w.f7326T.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f65832w;
        accessibilityEvent.setFromIndex(viewPager2.f7330z);
        accessibilityEvent.setToIndex(viewPager2.f7330z);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f7326T.f221E);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f65832w.f7324R && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f65832w.f7324R && super.onTouchEvent(motionEvent);
    }
}
