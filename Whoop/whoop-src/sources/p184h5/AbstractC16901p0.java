package p184h5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import com.whoop.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p211i5.C18091d;
import p211i5.InterfaceC18102o;
import p296l5.C23348l;

/* JADX INFO: renamed from: h5.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16901p0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f64851a = null;

    /* JADX INFO: renamed from: b */
    public static Field f64852b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f64853c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f64854d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final C16862c0 f64855e = new C16862c0();

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC16868e0 f64856f = new ViewTreeObserverOnGlobalLayoutListenerC16868e0();

    /* JADX INFO: renamed from: a */
    public static C16913t0 m47570a(View view) {
        if (f64851a == null) {
            f64851a = new WeakHashMap();
        }
        C16913t0 c16913t0 = (C16913t0) f64851a.get(view);
        if (c16913t0 != null) {
            return c16913t0;
        }
        C16913t0 c16913t1 = new C16913t0(view);
        f64851a.put(view, c16913t1);
        return c16913t1;
    }

    /* JADX INFO: renamed from: b */
    public static C16905q1 m47571b(View view, C16905q1 c16905q1) {
        WindowInsets windowInsetsM47602g = c16905q1.m47602g();
        if (windowInsetsM47602g != null) {
            WindowInsets windowInsetsM47498a = AbstractC16871f0.m47498a(view, windowInsetsM47602g);
            if (!windowInsetsM47498a.equals(windowInsetsM47602g)) {
                return C16905q1.m47596h(view, windowInsetsM47498a);
            }
        }
        return c16905q1;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m47572c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC16892m0.m47561a(view);
        }
        if (f64853c) {
            return null;
        }
        if (f64852b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f64852b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f64853c = true;
                return null;
            }
        }
        try {
            Object obj = f64852b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f64853c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m47573d(View view) {
        return (CharSequence) new C16865d0(1).m47492a(view);
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m47574e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static String[] m47575f(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC16898o0.m47568a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: g */
    public static C16920v1 m47576g(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC16895n0.m47566b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C16920v1(view, window);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m47577h(View view, int i13) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = m47573d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
                accessibilityEventObtain.setContentChangeTypes(i13);
                if (z4) {
                    accessibilityEventObtain.getText().add(m47573d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i13 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i13);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i13);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m47573d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C16905q1 m47578i(View view, C16905q1 c16905q1) {
        WindowInsets windowInsetsM47602g = c16905q1.m47602g();
        if (windowInsetsM47602g != null) {
            WindowInsets windowInsetsM47499b = AbstractC16871f0.m47499b(view, windowInsetsM47602g);
            if (!windowInsetsM47499b.equals(windowInsetsM47602g)) {
                return C16905q1.m47596h(view, windowInsetsM47499b);
            }
        }
        return c16905q1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static C16870f m47579j(View view, C16870f c16870f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c16870f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC16898o0.m47569b(view, c16870f);
        }
        C23348l c23348l = (C23348l) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC16918v interfaceC16918v = f64855e;
        if (c23348l == null) {
            if (view instanceof InterfaceC16918v) {
                interfaceC16918v = (InterfaceC16918v) view;
            }
            return interfaceC16918v.mo3289a(c16870f);
        }
        C16870f c16870fM67596a = C23348l.m67596a(view, c16870f);
        if (c16870fM67596a == null) {
            return null;
        }
        if (view instanceof InterfaceC16918v) {
            interfaceC16918v = (InterfaceC16918v) view;
        }
        return interfaceC16918v.mo3289a(c16870fM67596a);
    }

    /* JADX INFO: renamed from: k */
    public static void m47580k(View view, int i13) {
        ArrayList arrayListM47574e = m47574e(view);
        for (int i14 = 0; i14 < arrayListM47574e.size(); i14++) {
            if (((C18091d) arrayListM47574e.get(i14)).m51939a() == i13) {
                arrayListM47574e.remove(i14);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m47581l(View view, C18091d c18091d, InterfaceC18102o interfaceC18102o) {
        C16858b c16858b;
        C18091d c18091d2 = new C18091d(null, c18091d.f70314b, null, interfaceC18102o, c18091d.f70315c);
        View.AccessibilityDelegate accessibilityDelegateM47572c = m47572c(view);
        if (accessibilityDelegateM47572c == null) {
            c16858b = null;
        } else {
            c16858b = accessibilityDelegateM47572c instanceof C16855a ? ((C16855a) accessibilityDelegateM47572c).f64770a : new C16858b(accessibilityDelegateM47572c);
        }
        if (c16858b == null) {
            c16858b = new C16858b();
        }
        m47583n(view, c16858b);
        m47580k(view, c18091d2.m51939a());
        m47574e(view).add(c18091d2);
        m47577h(view, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m47582m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC16892m0.m47562b(view, context, iArr, attributeSet, typedArray, i13, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m47583n(View view, C16858b c16858b) {
        if (c16858b == null && (m47572c(view) instanceof C16855a)) {
            c16858b = new C16858b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c16858b == null ? null : c16858b.f64778b);
    }

    /* JADX INFO: renamed from: o */
    public static void m47584o(View view, CharSequence charSequence) {
        new C16865d0(1).m47493b(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC16868e0 viewTreeObserverOnGlobalLayoutListenerC16868e0 = f64856f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC16868e0.f64801w.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC16868e0);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC16868e0);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC16868e0.f64801w.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC16868e0);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC16868e0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m47585p(View view, CharSequence charSequence) {
        new C16865d0(2).m47493b(view, charSequence);
    }

    /* JADX INFO: renamed from: q */
    public static void m47586q(View view, AbstractC1230l abstractC1230l) {
        if (Build.VERSION.SDK_INT >= 30) {
            C16860b1.m47487g(view, abstractC1230l);
        } else {
            C16926y0.m47621k(view, abstractC1230l);
        }
    }
}
