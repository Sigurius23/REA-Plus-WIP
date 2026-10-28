package io.getstream.chat.android.p226ui.widgets;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class GridSpacingItemDecoration extends AbstractC1724q1 {
    private boolean includeEdge;
    private int spacing;
    private int spanCount;

    public GridSpacingItemDecoration(int i13, int i14, boolean z4) {
        this.spanCount = i13;
        this.spacing = i14;
        this.includeEdge = z4;
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1701k2 c1701k2) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i13 = this.spanCount;
        int i14 = childAdapterPosition % i13;
        if (this.includeEdge) {
            int i15 = this.spacing;
            rect.left = i15 - ((i14 * i15) / i13);
            rect.right = ((i14 + 1) * i15) / i13;
            if (childAdapterPosition < i13) {
                rect.top = i15;
            }
            rect.bottom = i15;
            return;
        }
        int i16 = this.spacing;
        rect.left = (i14 * i16) / i13;
        rect.right = i16 - (((i14 + 1) * i16) / i13);
        if (childAdapterPosition >= i13) {
            rect.top = i16;
        }
    }

    public final void setSpacing(int i13) {
        this.spacing = i13;
    }

    public final void setSpanCount(int i13) {
        this.spanCount = i13;
    }
}
