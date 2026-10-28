package io.sentry.android.core.cache;

import android.os.SystemClock;
import com.google.crypto.tink.internal.C5101l0;
import ge3.AbstractC15751g;
import io.sentry.C20337g0;
import io.sentry.C20448o7;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20158t1;
import io.sentry.android.core.C20167x;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C20103d;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.core.performance.C20145h;
import io.sentry.cache.C20280c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import p088dc.AbstractC11895b;
import p211i5.C18090c;
import p218ic.C18374o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.cache.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20066b extends C20280c {

    /* JADX INFO: renamed from: L */
    public static final List f75374L = Arrays.asList(new C20065a(C20167x.class, "ANR", "last_anr_report", new C18090c(25)), new C20065a(C20158t1.class, "Tombstone", "last_tombstone_report", new C18090c(26)));

    /* JADX INFO: renamed from: K */
    public final C20103d f75375K;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20066b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC29125c.m88510S(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.f75375K = C20103d.f75527w;
    }

    /* JADX INFO: renamed from: l */
    public static Long m55934l(C20513q6 c20513q6, String str, String str2) {
        String cacheDirPath = c20513q6.getCacheDirPath();
        AbstractC29125c.m88510S(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strM44437Q = AbstractC15751g.m44437Q(file);
            if (strM44437Q != null && !strM44437Q.equals("null")) {
                return Long.valueOf(Long.parseLong(strM44437Q.trim()));
            }
            return null;
        } catch (Throwable th3) {
            if (th3 instanceof FileNotFoundException) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11895b.m31996o("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, AbstractC11895b.m31996o("Error reading last ", str2, " marker"), th3);
            return null;
        }
    }

    @Override // io.sentry.cache.C20280c, io.sentry.cache.InterfaceC20281d
    /* JADX INFO: renamed from: a0 */
    public final boolean mo55935a0(C5101l0 c5101l0, C20337g0 c20337g0) {
        Long lValueOf;
        boolean zMo55935a0 = super.mo55935a0(c5101l0, c20337g0);
        C20513q6 c20513q6 = this.f76159w;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c20513q6;
        C20145h c20145h = C20144g.m56042c().f75661E;
        if (C20448o7.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && c20145h.m56047b()) {
            this.f75375K.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - c20145h.f75678y;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
                EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
                logger.mo16066m(enumC20436n5, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = c20513q6.getOutboxPath();
                if (outboxPath == null) {
                    c20513q6.getLogger().mo16066m(enumC20436n5, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th3) {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error writing the startup crash marker file to the disk", th3);
                    }
                }
            }
        }
        for (C20065a c20065a : f75374L) {
            Class cls = c20065a.f75370a;
            C18374o c18374o = new C18374o(c20065a, sentryAndroidOptions, this);
            Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
            if (cls.isInstance(c20337g0.m56491b("sentry:typeCheckHint")) && objM56491b != null) {
                C20065a c20065a2 = (C20065a) c18374o.f71532w;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) c18374o.f71533x;
                C20066b c20066b = (C20066b) c18374o.f71534y;
                switch (c20065a2.f75373d.f70300w) {
                    case 25:
                        lValueOf = Long.valueOf(((C20167x) objM56491b).f75765z);
                        break;
                    default:
                        lValueOf = Long.valueOf(((C20158t1) objM56491b).f75728z);
                        break;
                }
                InterfaceC20602v0 logger2 = sentryAndroidOptions2.getLogger();
                EnumC20436n5 enumC20436n6 = EnumC20436n5.DEBUG;
                String str = c20065a2.f75371b;
                logger2.mo16066m(enumC20436n6, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = c20065a2.f75372c;
                C20513q6 c20513q7 = c20066b.f76159w;
                String cacheDirPath = c20513q7.getCacheDirPath();
                if (cacheDirPath == null) {
                    c20513q7.getLogger().mo16066m(enumC20436n6, AbstractC11895b.m31996o("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                        try {
                            fileOutputStream.write(String.valueOf(lValueOf).getBytes(C20280c.f76153I));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, AbstractC11895b.m31996o("Error writing the ", str, " marker to the disk"), th6);
                    }
                }
            }
        }
        return zMo55935a0;
    }
}
