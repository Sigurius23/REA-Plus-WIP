package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.lifecycle.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1579e2 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6214a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m4975a() {
        LinkedHashMap linkedHashMap = this.f6214a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1637w1) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
