package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.config.d */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC20304d {
    /* JADX INFO: renamed from: a */
    default Long m56361a(String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    Map mo56359b();

    /* JADX INFO: renamed from: c */
    default List m56362c(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(",")) : Collections.EMPTY_LIST;
    }

    default Boolean getBooleanProperty(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    String getProperty(String str);
}
