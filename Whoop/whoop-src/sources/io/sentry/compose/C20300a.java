package io.sentry.compose;

import androidx.compose.p018ui.Modifier;
import g73.C15553a;
import io.sentry.InterfaceC20602v0;
import java.lang.reflect.Field;
import java.util.Map;
import p209i3.C18043y;
import p209i3.InterfaceC18031m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.compose.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20300a {

    /* JADX INFO: renamed from: a */
    public final Field f76199a;

    /* JADX INFO: renamed from: b */
    public final Field f76200b;

    public C20300a(InterfaceC20602v0 interfaceC20602v0) {
        this.f76199a = C15553a.m43790r(interfaceC20602v0, "androidx.compose.ui.platform.TestTagElement");
        this.f76200b = C15553a.m43790r(interfaceC20602v0, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
    }

    /* JADX INFO: renamed from: a */
    public final String m56300a(Modifier modifier) {
        Field field;
        Field field2;
        AbstractC22676k.m65750j(modifier, "modifier");
        String name = modifier.getClass().getName();
        try {
            if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = this.f76199a) != null) {
                return (String) field2.get(modifier);
            }
            if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = this.f76200b) != null) {
                return (String) field.get(modifier);
            }
            if (!(modifier instanceof InterfaceC18031m)) {
                return null;
            }
            for (Map.Entry entry : ((InterfaceC18031m) modifier).mo3600i()) {
                C18043y c18043y = (C18043y) entry.getKey();
                Object value = entry.getValue();
                String str = c18043y.f70064a;
                if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }
}
