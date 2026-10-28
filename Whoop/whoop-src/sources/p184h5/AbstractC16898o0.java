package p184h5;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p047c9.C4322m;

/* JADX INFO: renamed from: h5.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16898o0 {
    /* JADX INFO: renamed from: a */
    public static String[] m47568a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C16870f m47569b(View view, C16870f c16870f) {
        ContentInfo contentInfoMo13628b = c16870f.f64808a.mo13628b();
        Objects.requireNonNull(contentInfoMo13628b);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo13628b);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo13628b ? c16870f : new C16870f(new C4322m(contentInfoPerformReceiveContent));
    }
}
