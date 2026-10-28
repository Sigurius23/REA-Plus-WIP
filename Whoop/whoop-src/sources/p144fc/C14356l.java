package p144fc;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: fc.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C14356l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14349e c14349e = (C14349e) ((View) obj).getLayoutParams();
        C14349e c14349e2 = (C14349e) ((View) obj2).getLayoutParams();
        boolean z4 = c14349e.f52404a;
        if (z4 != c14349e2.f52404a) {
            return z4 ? 1 : -1;
        }
        return c14349e.f52408e - c14349e2.f52408e;
    }
}
