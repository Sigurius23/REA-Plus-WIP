package io.sentry.config;

import io.sentry.util.AbstractC20591m;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20303c implements InterfaceC20304d {
    /* JADX INFO: renamed from: d */
    public static String m56360d(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC20304d
    /* JADX INFO: renamed from: b */
    public final Map mo56359b() {
        String strM56726c;
        String str = m56360d("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strM56726c = AbstractC20591m.m56726c(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strM56726c);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC20304d
    public final String getProperty(String str) {
        return AbstractC20591m.m56726c(System.getenv(m56360d(str)));
    }
}
