package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1724q1 {
    @Deprecated
    public final void getItemOffsets(Rect rect, int i13, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1701k2 c1701k2) {
        ((C1744v1) view.getLayoutParams()).f6891a.getLayoutPosition();
        rect.set(0, 0, 0, 0);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
    }
}
