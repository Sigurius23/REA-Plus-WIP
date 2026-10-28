package io.sentry.util;

import io.sentry.C20316e0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.util.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20590l {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f77096a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m56723a(String str, List list) {
        if (str != null && list != null && !list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f77096a;
            if (concurrentHashMap.containsKey(str)) {
                return ((Boolean) concurrentHashMap.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C20316e0) it.next()).m56471a().equalsIgnoreCase(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                try {
                    if (((C20316e0) it3.next()).m56472b(str)) {
                        concurrentHashMap.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            concurrentHashMap.put(str, Boolean.FALSE);
        }
        return false;
    }
}
