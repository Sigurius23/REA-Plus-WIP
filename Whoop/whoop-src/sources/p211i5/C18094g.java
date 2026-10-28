package p211i5;

import ad3.C0783z;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: i5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18094g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0783z f70320a;

    public C18094g(C0783z c0783z) {
        this.f70320a = c0783z;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f70320a.mo1860d(i13, new C18093f(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i13) {
        C18093f c18093fMo1865i = this.f70320a.mo1865i(i13);
        if (c18093fMo1865i == null) {
            return null;
        }
        return c18093fMo1865i.f70317a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i13) {
        this.f70320a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i13) {
        C18093f c18093fMo1867k = this.f70320a.mo1867k(i13);
        if (c18093fMo1867k == null) {
            return null;
        }
        return c18093fMo1867k.f70317a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i13, int i14, Bundle bundle) {
        return this.f70320a.mo1874s(i13, i14, bundle);
    }
}
