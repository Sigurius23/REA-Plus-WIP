package p027b3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p005a3.C0230n0;
import p028b4.AbstractC2701l;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: b3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C2426q extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AndroidComposeView f9513d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0230n0 f9514e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AndroidComposeView f9515f;

    public C2426q(AndroidComposeView androidComposeView, C0230n0 c0230n0, AndroidComposeView androidComposeView2) {
        this.f9513d = androidComposeView;
        this.f9514e = c0230n0;
        this.f9515f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.f9513d;
        C2382h0 c2382h0 = androidComposeView.f4924S;
        if (c2382h0.m7386v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C0230n0 c0230n0 = this.f9514e;
        C0230n0 c0230n0M588G = c0230n0.m588G();
        while (true) {
            if (c0230n0M588G == null) {
                c0230n0M588G = null;
                break;
            } else if (c0230n0M588G.f783e0.m560j(8)) {
                break;
            } else {
                c0230n0M588G = c0230n0M588G.m588G();
            }
        }
        Integer numValueOf = c0230n0M588G != null ? Integer.valueOf(c0230n0M588G.f795x) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().m51794a().f69992g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c18093f.f70318b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f9515f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i13 = c0230n0.f795x;
        int iM23d = c2382h0.f9396E.m23d(i13);
        if (iM23d != -1) {
            AbstractC2701l abstractC2701lM7423o = AbstractC2417o0.m7423o(androidComposeView.getAndroidViewsHandler$ui_release(), iM23d);
            if (abstractC2701lM7423o != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC2701lM7423o);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iM23d);
            }
            AndroidComposeView.m3560a(androidComposeView, i13, accessibilityNodeInfo, c2382h0.f9398G);
        }
        int iM23d2 = c2382h0.f9397F.m23d(i13);
        if (iM23d2 != -1) {
            AbstractC2701l abstractC2701lM7423o2 = AbstractC2417o0.m7423o(androidComposeView.getAndroidViewsHandler$ui_release(), iM23d2);
            if (abstractC2701lM7423o2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC2701lM7423o2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iM23d2);
            }
            AndroidComposeView.m3560a(androidComposeView, i13, accessibilityNodeInfo, c2382h0.f9399H);
        }
    }
}
