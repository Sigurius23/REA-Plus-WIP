package p404pq;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: pq.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C29460h extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DialogC29463k f119627d;

    public C29460h(DialogC29463k dialogC29463k) {
        this.f119627d = dialogC29463k;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.f119627d.f119639K) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            c18093f.m51947a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        if (i13 == 1048576) {
            DialogC29463k dialogC29463k = this.f119627d;
            if (dialogC29463k.f119639K) {
                dialogC29463k.cancel();
                return true;
            }
        }
        return super.mo5307g(view, i13, bundle);
    }
}
