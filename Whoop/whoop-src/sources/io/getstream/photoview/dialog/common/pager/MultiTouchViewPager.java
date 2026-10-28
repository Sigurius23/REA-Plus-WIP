package io.getstream.photoview.dialog.common.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.squareup.wire.AbstractC5583n;
import d23.C11513a;
import g40.C15352f4;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "photoview-dialog_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MultiTouchViewPager extends ViewPager {

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ int f74902O0 = 0;

    /* JADX INFO: renamed from: L0 */
    public boolean f74903L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f74904M0;

    /* JADX INFO: renamed from: N0 */
    public C11513a f74905N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.f74903L0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev3) {
        AbstractC22676k.m65750j(ev3, "ev");
        if (ev3.getPointerCount() <= 1 || !this.f74904M0) {
            return super.dispatchTouchEvent(ev3);
        }
        requestDisallowInterceptTouchEvent(false);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev3);
        requestDisallowInterceptTouchEvent(true);
        return zDispatchTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f74905N0 = AbstractC5583n.m16785k(this, null, new C15352f4(1, this, MultiTouchViewPager.class, "onPageScrollStateChanged", "onPageScrollStateChanged(I)V", 0, 7), 3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11513a c11513a = this.f74905N0;
        if (c11513a != null) {
            m5466A(c11513a);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev3) {
        AbstractC22676k.m65750j(ev3, "ev");
        if (ev3.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(ev3);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent ev3) {
        AbstractC22676k.m65750j(ev3, "ev");
        try {
            return super.onTouchEvent(ev3);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        this.f74904M0 = z4;
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
