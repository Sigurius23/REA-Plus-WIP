package io.sentry;

import io.sentry.protocol.C20502w;
import io.sentry.util.C20579a;
import java.util.concurrent.CopyOnWriteArraySet;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.l5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20412l5 {

    /* JADX INFO: renamed from: c */
    public static volatile C20412l5 f76488c;

    /* JADX INFO: renamed from: d */
    public static final C20579a f76489d = new C20579a();

    /* JADX INFO: renamed from: e */
    public static volatile Boolean f76490e = null;

    /* JADX INFO: renamed from: f */
    public static final C20579a f76491f = new C20579a();

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f76492a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f76493b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public static C20412l5 m56626d() {
        if (f76488c == null) {
            C20535s c20535sM56711a = f76489d.m56711a();
            try {
                if (f76488c == null) {
                    f76488c = new C20412l5();
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
        return f76488c;
    }

    /* JADX INFO: renamed from: a */
    public final void m56627a(String str) {
        AbstractC29125c.m88510S(str, "integration is required.");
        this.f76492a.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m56628b(String str, String str2) {
        this.f76493b.add(new C20502w(str, str2));
        C20535s c20535sM56711a = f76491f.m56711a();
        try {
            f76490e = null;
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

    /* JADX INFO: renamed from: c */
    public final boolean m56629c(InterfaceC20602v0 interfaceC20602v0) {
        Boolean bool = f76490e;
        if (bool != null) {
            return bool.booleanValue();
        }
        C20535s c20535sM56711a = f76491f.m56711a();
        try {
            boolean z4 = false;
            for (C20502w c20502w : this.f76493b) {
                if (c20502w.f76804w.startsWith("maven:io.sentry:") && !"8.41.0".equalsIgnoreCase(c20502w.f76805x)) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", c20502w.f76804w, "8.41.0", c20502w.f76805x);
                    z4 = true;
                }
            }
            if (z4) {
                EnumC20436n5 enumC20436n5 = EnumC20436n5.ERROR;
                interfaceC20602v0.mo16066m(enumC20436n5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                interfaceC20602v0.mo16066m(enumC20436n5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                interfaceC20602v0.mo16066m(enumC20436n5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                interfaceC20602v0.mo16066m(enumC20436n5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f76490e = Boolean.valueOf(z4);
            c20535sM56711a.close();
            return z4;
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
