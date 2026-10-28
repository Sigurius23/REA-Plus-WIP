package p184h5;

import ad3.C0783z;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.whoop.android.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p107e3.AbstractC12602c;
import p211i5.C18091d;
import p211i5.C18093f;

/* JADX INFO: renamed from: h5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16855a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C16858b f64770a;

    public C16855a(C16858b c16858b) {
        this.f64770a = c16858b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f64770a.mo5301a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0783z c0783zMo5302b = this.f64770a.mo5302b(view);
        if (c0783zMo5302b != null) {
            return (AccessibilityNodeProvider) c0783zMo5302b.f2818x;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f64770a.mo5303c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C18093f c18093f = new C18093f(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        Boolean bool = (Boolean) new C16865d0(0).m47492a(view);
        accessibilityNodeInfo.setScreenReaderFocusable(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new C16865d0(3).m47492a(view);
        accessibilityNodeInfo.setHeading(bool2 != null && bool2.booleanValue());
        accessibilityNodeInfo.setPaneTitle(AbstractC16901p0.m47573d(view));
        CharSequence charSequence = (CharSequence) new C16865d0(2).m47492a(view);
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC12602c.m35326h(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f64770a.mo5304d(view, c18093f);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            c18093f.m51948b((C18091d) list.get(i13));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f64770a.mo5305e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f64770a.mo5306f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i13, Bundle bundle) {
        return this.f64770a.mo5307g(view, i13, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i13) {
        this.f64770a.mo5308h(view, i13);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f64770a.mo5309i(view, accessibilityEvent);
    }
}
