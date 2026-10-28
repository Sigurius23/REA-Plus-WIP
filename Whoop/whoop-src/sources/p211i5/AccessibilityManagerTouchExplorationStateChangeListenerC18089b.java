package p211i5;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C5052k;
import com.google.android.material.textfield.C5053l;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: i5.b */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC18089b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final C5052k f70299a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC18089b(C5052k c5052k) {
        this.f70299a = c5052k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC18089b) {
            return this.f70299a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC18089b) obj).f70299a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f70299a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        C5053l c5053l = this.f70299a.f21218a;
        AutoCompleteTextView autoCompleteTextView = c5053l.f21222h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c5053l.f21266d;
        int i13 = z4 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        checkableImageButton.setImportantForAccessibility(i13);
    }
}
