package p296l5;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p184h5.C16858b;
import p211i5.C18091d;
import p211i5.C18093f;

/* JADX INFO: renamed from: l5.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C23341e extends C16858b {
    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: c */
    public final void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5303c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        int scrollRange;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c18093f.m51953h(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        c18093f.m51956k(true);
        if (nestedScrollView.getScrollY() > 0) {
            c18093f.m51948b(C18091d.f70305i);
            c18093f.m51948b(C18091d.f70309m);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            c18093f.m51948b(C18091d.f70304h);
            c18093f.m51948b(C18091d.f70311o);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        if (super.mo5307g(view, i13, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i13 != 4096) {
            if (i13 == 8192 || i13 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m3692C(0, iMax, true);
                return true;
            }
            if (i13 != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.m3692C(0, iMin, true);
        return true;
    }
}
