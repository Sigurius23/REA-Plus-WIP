package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20302b implements InterfaceC20304d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f76208a;

    public C20302b(ArrayList arrayList) {
        this.f76208a = arrayList;
    }

    @Override // io.sentry.config.InterfaceC20304d
    /* JADX INFO: renamed from: b */
    public final Map mo56359b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f76208a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((InterfaceC20304d) it.next()).mo56359b());
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC20304d
    public final String getProperty(String str) {
        Iterator it = this.f76208a.iterator();
        while (it.hasNext()) {
            String property = ((InterfaceC20304d) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
