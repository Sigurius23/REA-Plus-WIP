package p243j5;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: j5.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21327a {
    /* JADX INFO: renamed from: a */
    public static void m59856a(NestedScrollView nestedScrollView, float f13) {
        try {
            nestedScrollView.setFrameContentVelocity(f13);
        } catch (LinkageError unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m59857b(EditorInfo editorInfo, boolean z4) {
        editorInfo.setStylusHandwritingEnabled(z4);
    }
}
