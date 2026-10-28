package io.sentry;

import io.sentry.hints.EnumC20358e;
import io.sentry.protocol.C20500u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.sentry.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C20430n implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76509w;

    /* JADX INFO: renamed from: x */
    public final Map f76510x;

    /* JADX INFO: renamed from: y */
    public final C20513q6 f76511y;

    public C20430n(C20513q6 c20513q6, int i13) {
        this.f76509w = i13;
        switch (i13) {
            case 1:
                this.f76510x = Collections.synchronizedMap(new WeakHashMap());
                this.f76511y = c20513q6;
                break;
            default:
                this.f76510x = Collections.synchronizedMap(new HashMap());
                this.f76511y = c20513q6;
                break;
        }
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        C20500u c20500uM56482f;
        String str;
        Long l7;
        switch (this.f76509w) {
            case 0:
                if (!C20448o7.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) || (c20500uM56482f = c20321e5.m56482f()) == null || (str = c20500uM56482f.f76798w) == null || (l7 = c20500uM56482f.f76801z) == null) {
                    return c20321e5;
                }
                Map map = this.f76510x;
                Long l12 = (Long) map.get(str);
                if (l12 == null || l12.equals(l7)) {
                    map.put(str, l7);
                    return c20321e5;
                }
                this.f76511y.getLogger().mo16066m(EnumC20436n5.INFO, "Event %s has been dropped due to multi-threaded deduplication", c20321e5.f76883w);
                c20337g0.m56493d(EnumC20358e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            default:
                C20513q6 c20513q6 = this.f76511y;
                if (!c20513q6.isEnableDeduplication()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return c20321e5;
                }
                Throwable thM56670a = c20321e5.m56670a();
                if (thM56670a == null) {
                    return c20321e5;
                }
                Map map2 = this.f76510x;
                if (!map2.containsKey(thM56670a)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = thM56670a; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map2.containsKey(it.next())) {
                        }
                    }
                    map2.put(thM56670a, null);
                    return c20321e5;
                }
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c20321e5.f76883w);
                return null;
        }
    }
}
