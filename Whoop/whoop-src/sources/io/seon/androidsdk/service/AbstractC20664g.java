package io.seon.androidsdk.service;

import java.util.HashMap;
import java.util.Map;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20664g implements InterfaceC20670i {

    /* JADX INFO: renamed from: d */
    public static final C3632c f77301d = new C3632c(AbstractC20664g.class.getName());

    /* JADX INFO: renamed from: a */
    public final HashMap f77302a;

    /* JADX INFO: renamed from: b */
    public C20663f1 f77303b;

    /* JADX INFO: renamed from: c */
    public final String f77304c;

    public AbstractC20664g() {
        HashMap map = new HashMap();
        this.f77302a = map;
        String simpleName = getClass().getSimpleName();
        this.f77304c = simpleName;
        map.put(simpleName, new HashMap());
    }

    /* JADX INFO: renamed from: d */
    public static Object m56801d(InterfaceC20695t0 interfaceC20695t0) {
        try {
            return interfaceC20695t0.mo56800a();
        } catch (Exception e5) {
            f77301d.m11163L(3, e5);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Map m56802e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map mapMo56774a = mo56774a();
        try {
            ((Map) this.f77302a.get(this.f77304c)).put("scan", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable unused) {
        }
        return mapMo56774a;
    }
}
