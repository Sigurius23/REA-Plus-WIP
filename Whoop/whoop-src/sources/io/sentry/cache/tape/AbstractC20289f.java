package io.sentry.cache.tape;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.cache.tape.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20289f implements Iterable, Closeable {
    /* JADX INFO: renamed from: F0 */
    public final List m56272F0() {
        int iMin = Math.min(size(), size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i13 = 0; i13 < iMin; i13++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: R0 */
    public abstract void mo56269R0(int i13);

    public void clear() {
        mo56269R0(size());
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo56270m(Object obj);

    public abstract int size();
}
