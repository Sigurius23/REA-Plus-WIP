package io.sentry.config;

import io.sentry.util.AbstractC20591m;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p319m4.AbstractC25012a;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.config.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20305e implements InterfaceC20304d {

    /* JADX INFO: renamed from: a */
    public final String f76209a;

    /* JADX INFO: renamed from: b */
    public final Properties f76210b;

    public C20305e(String str, Properties properties) {
        this.f76209a = str;
        AbstractC29125c.m88510S(properties, "properties are required");
        this.f76210b = properties;
    }

    @Override // io.sentry.config.InterfaceC20304d
    /* JADX INFO: renamed from: b */
    public final Map mo56359b() {
        String strM73376i = AbstractC25012a.m73376i(this.f76209a, "tags.", new StringBuilder());
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f76210b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM73376i)) {
                    map.put(str.substring(strM73376i.length()), AbstractC20591m.m56726c((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.InterfaceC20304d
    public final String getProperty(String str) {
        return AbstractC20591m.m56726c(this.f76210b.getProperty(this.f76209a + str));
    }

    public C20305e(Properties properties) {
        this("", properties);
    }
}
