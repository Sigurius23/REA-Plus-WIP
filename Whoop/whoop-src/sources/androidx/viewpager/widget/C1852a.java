package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import no.nordicsemi.android.dfu.DfuBaseService;
import p144fc.AbstractC14345a;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: androidx.viewpager.widget.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1852a extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPager f7293d;

    public C1852a(ViewPager viewPager) {
        this.f7293d = viewPager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: c */
    public final void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z4;
        AbstractC14345a abstractC14345a;
        super.mo5303c(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.f7293d;
        AbstractC14345a abstractC14345a2 = viewPager.f7241E;
        if (abstractC14345a2 != null) {
            z4 = abstractC14345a2.mo28901d() > 1;
        }
        accessibilityEvent.setScrollable(z4);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC14345a = viewPager.f7241E) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC14345a.mo28901d());
        accessibilityEvent.setFromIndex(viewPager.f7243F);
        accessibilityEvent.setToIndex(viewPager.f7243F);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
        c18093f.m51953h(ViewPager.class.getName());
        ViewPager viewPager = this.f7293d;
        AbstractC14345a abstractC14345a = viewPager.f7241E;
        c18093f.m51956k(abstractC14345a != null && abstractC14345a.mo28901d() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            c18093f.m51947a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            c18093f.m51947a(DfuBaseService.ERROR_REMOTE_MASK);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        if (super.mo5307g(view, i13, bundle)) {
            return true;
        }
        ViewPager viewPager = this.f7293d;
        if (i13 == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f7243F + 1);
            return true;
        }
        if (i13 != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.f7243F - 1);
        return true;
    }
}
