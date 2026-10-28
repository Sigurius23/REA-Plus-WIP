package p184h5;

import ad3.C0783z;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.whoop.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000.AbstractC30802r;
import p211i5.C18091d;
import p211i5.C18093f;
import p211i5.InterfaceC18102o;

/* JADX INFO: renamed from: h5.b */
/* JADX INFO: loaded from: classes.dex */
public class C16858b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f64776c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f64777a;

    /* JADX INFO: renamed from: b */
    public final C16855a f64778b;

    public C16858b() {
        this(f64776c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo5301a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f64777a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0783z mo5302b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f64777a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0783z(accessibilityNodeProvider, 14);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        this.f64777a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo5304d(View view, C18093f c18093f) {
        this.f64777a.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
    }

    /* JADX INFO: renamed from: e */
    public void mo5305e(View view, AccessibilityEvent accessibilityEvent) {
        this.f64777a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo5306f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f64777a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo5307g(View view, int i13, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i14 = 0;
        while (true) {
            if (i14 < list.size()) {
                C18091d c18091d = (C18091d) list.get(i14);
                if (c18091d.m51939a() == i13) {
                    Class cls = c18091d.f70315c;
                    InterfaceC18102o interfaceC18102o = c18091d.f70316d;
                    if (interfaceC18102o != null) {
                        if (cls != null) {
                            try {
                                AbstractC30802r.m94771t(cls.getDeclaredConstructor(null).newInstance(null));
                                throw null;
                            } catch (Exception e5) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                            }
                        }
                        zPerformAccessibilityAction = interfaceC18102o.mo2226m(view);
                        break;
                    }
                } else {
                    i14++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f64777a.performAccessibilityAction(view, i13, bundle);
        }
        if (zPerformAccessibilityAction || i13 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i15 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i15)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i16 = 0; clickableSpanArr != null && i16 < clickableSpanArr.length; i16++) {
                if (clickableSpan.equals(clickableSpanArr[i16])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: h */
    public void mo5308h(View view, int i13) {
        this.f64777a.sendAccessibilityEvent(view, i13);
    }

    /* JADX INFO: renamed from: i */
    public void mo5309i(View view, AccessibilityEvent accessibilityEvent) {
        this.f64777a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C16858b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f64777a = accessibilityDelegate;
        this.f64778b = new C16855a(this);
    }
}
