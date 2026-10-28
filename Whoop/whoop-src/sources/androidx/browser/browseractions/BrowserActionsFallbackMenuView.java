package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whoop.android.R;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: w */
    public final int f4451w;

    /* JADX INFO: renamed from: x */
    public final int f4452x;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4451w = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f4452x = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4451w * 2), this.f4452x), 1073741824), i14);
    }
}
