package at;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import kr.C22786e;
import p288ks.AbstractC22819a;
import u00.C34377e;

/* JADX INFO: renamed from: at.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C1977u {

    /* JADX INFO: renamed from: b */
    public static final C1977u f7819b = new C1977u(new C22786e(7));

    /* JADX INFO: renamed from: c */
    public static final C1977u f7820c = new C1977u(new C22786e(9));

    /* JADX INFO: renamed from: d */
    public static final C1977u f7821d = new C1977u(new C22786e(10));

    /* JADX INFO: renamed from: e */
    public static final C1977u f7822e = new C1977u(new C34377e(9));

    /* JADX INFO: renamed from: f */
    public static final C1977u f7823f;

    /* JADX INFO: renamed from: g */
    public static final C1977u f7824g;

    /* JADX INFO: renamed from: a */
    public final C1976t f7825a;

    static {
        new C1977u(new C34377e(7));
        int i13 = 8;
        f7823f = new C1977u(new C34377e(i13));
        f7824g = new C1977u(new C22786e(i13));
    }

    public C1977u(InterfaceC1978v interfaceC1978v) {
        if (AbstractC22819a.m66183a()) {
            this.f7825a = new C1976t(interfaceC1978v, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f7825a = new C1976t(interfaceC1978v, 0);
        } else {
            this.f7825a = new C1976t(interfaceC1978v, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m6027b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6028a() {
        return this.f7825a.m6025a("RSA");
    }
}
