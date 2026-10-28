package com.whoop.community.presentation.p059ui;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ScrollingView;
import p413q4.AbstractC29957b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "Lq4/b;", "Landroid/view/View;", "Landroidx/core/view/ScrollingView;", "scrollView", "headerView", "", "headerOffset", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Ll83/a0;", "onScroll", "<init>", "(Landroidx/core/view/ScrollingView;Landroid/view/View;ILandroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "child", "directTargetChild", "target", "axes", "type", "", "E", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "u", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "parent", "layoutDirection", "p", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z", "I", "(Landroid/view/View;)V", "a", "Landroidx/core/view/ScrollingView;", "b", "Landroid/view/View;", "c", "d", "Lkotlin/jvm/functions/Function1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ParallaxHeaderBehavior extends AbstractC29957b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ScrollingView scrollView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final View headerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int headerOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 onScroll;

    public ParallaxHeaderBehavior(ScrollingView scrollView, View headerView, int i13, Context context, Function1 onScroll) {
        AbstractC22676k.m65750j(scrollView, "scrollView");
        AbstractC22676k.m65750j(headerView, "headerView");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(onScroll, "onScroll");
        this.scrollView = scrollView;
        this.headerView = headerView;
        this.headerOffset = i13;
        this.onScroll = onScroll;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: E */
    public boolean mo15660E(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int axes, int type) {
        AbstractC22676k.m65750j(coordinatorLayout, "coordinatorLayout");
        AbstractC22676k.m65750j(child, "child");
        AbstractC22676k.m65750j(directTargetChild, "directTargetChild");
        AbstractC22676k.m65750j(target, "target");
        return (axes & 2) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m19532I(View child) {
        AbstractC22676k.m65750j(child, "child");
        Object obj = this.scrollView;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type android.view.View");
        ((View) obj).setPadding(((View) this.scrollView).getPaddingLeft(), (child.getHeight() - this.headerOffset) + ((int) child.getTranslationY()), ((View) this.scrollView).getPaddingRight(), ((View) this.scrollView).getPaddingBottom());
        this.onScroll.invoke(Float.valueOf(child.getTranslationY()));
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public boolean mo15668p(CoordinatorLayout parent, View child, int layoutDirection) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(child, "child");
        if (!child.equals(this.headerView)) {
            return false;
        }
        parent.m3666q(child, layoutDirection);
        m19532I(child);
        return false;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: u */
    public void mo15670u(CoordinatorLayout coordinatorLayout, View child, View target, int dx3, int dy3, int[] consumed, int type) {
        int iMax;
        int iMin;
        AbstractC22676k.m65750j(coordinatorLayout, "coordinatorLayout");
        AbstractC22676k.m65750j(child, "child");
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(consumed, "consumed");
        int i13 = (int) (-child.getTranslationY());
        int height = (child.getHeight() - this.headerOffset) - child.getMinimumHeight();
        if (dy3 > 0) {
            if (i13 >= height || (iMin = Math.min(height, dy3 + i13)) == i13) {
                return;
            }
            consumed[1] = iMin - i13;
            child.setTranslationY(-iMin);
        } else {
            if (this.scrollView.computeVerticalScrollOffset() > 0 || i13 <= 0 || (iMax = Math.max(0, dy3 + i13)) == i13) {
                return;
            }
            consumed[1] = i13 - iMax;
            child.setTranslationY(-iMax);
        }
        m19532I(child);
    }
}
