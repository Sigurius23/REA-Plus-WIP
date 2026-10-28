package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1754y extends AbstractC1724q1 {

    /* JADX INFO: renamed from: d */
    public static final int[] f6936d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a */
    public Drawable f6937a;

    /* JADX INFO: renamed from: b */
    public final int f6938b;

    /* JADX INFO: renamed from: c */
    public final Rect f6939c = new Rect();

    public C1754y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f6936d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f6937a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f6938b = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1701k2 c1701k2) {
        Drawable drawable = this.f6937a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f6938b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f6937a == null) {
            return;
        }
        int i13 = this.f6938b;
        int i14 = 0;
        Rect rect = this.f6939c;
        if (i13 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i14 < childCount) {
                View childAt = recyclerView.getChildAt(i14);
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f6937a.setBounds(paddingLeft, iRound - this.f6937a.getIntrinsicHeight(), width, iRound);
                this.f6937a.draw(canvas);
                i14++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i14 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i14);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f6937a.setBounds(iRound2 - this.f6937a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f6937a.draw(canvas);
            i14++;
        }
        canvas.restore();
    }
}
