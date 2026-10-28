package io.sentry;

import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20337g0 {

    /* JADX INFO: renamed from: h */
    public static final HashMap f76347h;

    /* JADX INFO: renamed from: a */
    public final HashMap f76348a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f76349b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C20579a f76350c = new C20579a();

    /* JADX INFO: renamed from: d */
    public C20040a f76351d = null;

    /* JADX INFO: renamed from: e */
    public C20040a f76352e = null;

    /* JADX INFO: renamed from: f */
    public C20040a f76353f = null;

    /* JADX INFO: renamed from: g */
    public C20626x3 f76354g = null;

    static {
        HashMap map = new HashMap();
        f76347h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m56490a() {
        C20535s c20535sM56711a = this.f76350c.m56711a();
        try {
            Iterator it = this.f76348a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m56491b(String str) {
        C20535s c20535sM56711a = this.f76350c.m56711a();
        try {
            Object obj = this.f76348a.get(str);
            c20535sM56711a.close();
            return obj;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m56492c(Class cls, String str) {
        C20535s c20535sM56711a = this.f76350c.m56711a();
        try {
            Object obj = this.f76348a.get(str);
            if (cls.isInstance(obj)) {
                c20535sM56711a.close();
                return obj;
            }
            Class cls2 = (Class) f76347h.get(cls.getCanonicalName());
            if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
                c20535sM56711a.close();
                return null;
            }
            c20535sM56711a.close();
            return obj;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56493d(Object obj, String str) {
        C20535s c20535sM56711a = this.f76350c.m56711a();
        try {
            this.f76348a.put(str, obj);
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
