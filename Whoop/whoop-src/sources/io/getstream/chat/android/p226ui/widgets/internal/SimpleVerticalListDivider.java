package io.getstream.chat.android.p226ui.widgets.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.p226ui.C19469R;
import p027b3.C2365d3;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;", "Landroidx/recyclerview/widget/q1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "determineHeight", "()I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/k2;", "state", "Ll83/a0;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawableHeight", "Ljava/lang/Integer;", "getDrawableHeight", "()Ljava/lang/Integer;", "setDrawableHeight", "(Ljava/lang/Integer;)V", "", "drawOnLastItem", "Z", "getDrawOnLastItem", "()Z", "setDrawOnLastItem", "(Z)V", "bounds", "Landroid/graphics/Rect;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SimpleVerticalListDivider extends AbstractC1724q1 {
    private final Rect bounds;
    private boolean drawOnLastItem;
    private Drawable drawable;
    private Integer drawableHeight;

    public SimpleVerticalListDivider(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Drawable drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_divider);
        AbstractC22676k.m65747g(drawable);
        this.drawable = drawable;
        this.bounds = new Rect();
    }

    private final int determineHeight() {
        Integer num = this.drawableHeight;
        return num != null ? num.intValue() : this.drawable.getIntrinsicHeight();
    }

    public final boolean getDrawOnLastItem() {
        return this.drawOnLastItem;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final Integer getDrawableHeight() {
        return this.drawableHeight;
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, C1701k2 state) {
        AbstractC22676k.m65750j(outRect, "outRect");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(state, "state");
        outRect.set(0, 0, 0, determineHeight());
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDraw(Canvas canvas, RecyclerView parent, C1701k2 state) {
        AbstractC22676k.m65750j(canvas, "canvas");
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(state, "state");
        canvas.save();
        int paddingLeft = parent.getClipToPadding() ? parent.getPaddingLeft() : 0;
        int right = parent.getClipToPadding() ? parent.getRight() - parent.getPaddingRight() : parent.getRight();
        C18284j c18284jM36278i0 = this.drawOnLastItem ? AbstractC12889b.m36278i0(0, AbstractC38176k.m122280p(new C2365d3(parent, 1))) : AbstractC12889b.m36278i0(0, AbstractC38176k.m122280p(new C2365d3(parent, 1)) - 1);
        int i13 = c18284jM36278i0.f71133w;
        int i14 = c18284jM36278i0.f71134x;
        if (i13 <= i14) {
            while (true) {
                View childAt = parent.getChildAt(i13);
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.bounds);
                int iM36258X = AbstractC12889b.m36258X(childAt.getTranslationY()) + this.bounds.bottom;
                this.drawable.setBounds(paddingLeft, iM36258X - determineHeight(), right, iM36258X);
                this.drawable.draw(canvas);
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        canvas.restore();
    }

    public final void setDrawOnLastItem(boolean z4) {
        this.drawOnLastItem = z4;
    }

    public final void setDrawable(Drawable drawable) {
        AbstractC22676k.m65750j(drawable, "<set-?>");
        this.drawable = drawable;
    }

    public final void setDrawableHeight(Integer num) {
        this.drawableHeight = num;
    }
}
