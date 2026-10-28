package com.whoop.community.presentation.p059ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/community/presentation/ui/SwipelessViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "L0", "Z", "getSwipeDisabled", "()Z", "setSwipeDisabled", "(Z)V", "swipeDisabled", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class SwipelessViewPager extends ViewPager {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean swipeDisabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipelessViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.swipeDisabled = true;
    }

    public final boolean getSwipeDisabled() {
        return this.swipeDisabled;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev3) {
        if (this.swipeDisabled) {
            return false;
        }
        return super.onInterceptTouchEvent(ev3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent ev3) {
        if (this.swipeDisabled) {
            return false;
        }
        return super.onTouchEvent(ev3);
    }

    public final void setSwipeDisabled(boolean z4) {
        this.swipeDisabled = z4;
    }
}
