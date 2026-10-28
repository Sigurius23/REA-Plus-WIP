package p027b3;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import bc3.C2996c2;
import com.whoop.android.R;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p208i2.C17882f;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: b3.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2357c0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9312w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9313x;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2357c0(Object obj, int i13) {
        this.f9312w = i13;
        this.f9313x = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m7281a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m7282b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f9312w) {
            case 0:
                C2382h0 c2382h0 = (C2382h0) this.f9313x;
                AccessibilityManager accessibilityManager = c2382h0.f9411g;
                c2382h0.f9415k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(c2382h0.f9413i);
                accessibilityManager.addTouchExplorationStateChangeListener(c2382h0.f9414j);
                break;
            case 1:
            case 2:
                break;
            default:
                C17882f c17882f = (C17882f) this.f9313x;
                Context context = view.getContext();
                if (!c17882f.f69573d) {
                    context.getApplicationContext().registerComponentCallbacks(c17882f.f69574e);
                    c17882f.f69573d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z4;
        switch (this.f9312w) {
            case 0:
                C2382h0 c2382h0 = (C2382h0) this.f9313x;
                c2382h0.f9416l.removeCallbacks(c2382h0.f9405N);
                AccessibilityManager accessibilityManager = c2382h0.f9411g;
                accessibilityManager.removeAccessibilityStateChangeListener(c2382h0.f9413i);
                accessibilityManager.removeTouchExplorationStateChangeListener(c2382h0.f9414j);
                break;
            case 1:
                AbstractC2346a abstractC2346a = (AbstractC2346a) this.f9313x;
                Iterator it = AbstractC37926s0.m121478q(abstractC2346a).iterator();
                while (true) {
                    z4 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC22676k.m65750j(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z4 = true;
                            }
                        }
                    }
                }
                if (!z4) {
                    abstractC2346a.m7235d();
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((C2996c2) this.f9313x).cancel((CancellationException) null);
                break;
            default:
                C17882f c17882f = (C17882f) this.f9313x;
                Context context = view.getContext();
                if (c17882f.f69573d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c17882f.f69574e);
                    c17882f.f69573d = false;
                }
                break;
        }
    }
}
