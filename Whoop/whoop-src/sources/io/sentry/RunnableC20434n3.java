package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import io.sentry.cache.C20280c;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.protocol.C20501v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.n3 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20434n3 implements Runnable {

    /* JADX INFO: renamed from: x */
    public static final Charset f76512x = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: w */
    public final C20513q6 f76513w;

    public RunnableC20434n3(C20513q6 c20513q6) {
        this.f76513w = c20513q6;
    }

    /* JADX INFO: renamed from: a */
    public final Date m56632a(File file) {
        C20513q6 c20513q6 = this.f76513w;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f76512x));
            try {
                String line = bufferedReader.readLine();
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM60661Q = AbstractC21598x.m60661Q(line);
                bufferedReader.close();
                return dateM60661Q;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e5) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error reading the crash marker file.", e5);
            return null;
        } catch (IllegalArgumentException e13) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, e13, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20513q6 c20513q6 = this.f76513w;
        String cacheDirPath = c20513q6.getCacheDirPath();
        if (cacheDirPath == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        InterfaceC20281d envelopeDiskCache = c20513q6.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C20280c) && !((C20280c) envelopeDiskCache).m56261g()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i13 = C20280c.f76154J;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC20390j1 serializer = c20513q6.getSerializer();
        if (file.exists()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f76512x));
                try {
                    C20265b7 c20265b7 = (C20265b7) serializer.mo56239e(bufferedReader, C20265b7.class);
                    if (c20265b7 == null) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(c20513q6.getCacheDirPath(), ".sentry-native/last_crash");
                        EnumC20048a7 enumC20048a7 = c20265b7.f76092G;
                        EnumC20048a7 enumC20048a8 = EnumC20048a7.Crashed;
                        if (enumC20048a7 == enumC20048a8) {
                            C20548t4 c20548t4 = C20548t4.f77007d;
                            C20535s c20535sM56711a = c20548t4.f77010c.m56711a();
                            try {
                                c20548t4.f77008a = false;
                                c20548t4.f77009b = null;
                                c20535sM56711a.close();
                                c20548t4.m56674a(true);
                            } catch (Throwable th3) {
                                try {
                                    c20535sM56711a.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } else if (file2.exists()) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateM56632a = m56632a(file2);
                            c20265b7.m56222d(enumC20048a8, null, true, null);
                            c20265b7.m56220b(dateM56632a);
                        } else if (c20265b7.f76099N == null) {
                            c20265b7.m56220b(AbstractC21598x.m60659O());
                        }
                        if (file2.exists() && !file2.delete()) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        AbstractC20445o4.m56638b().mo56437q(new C5101l0((C20501v) null, c20513q6.getSdkVersion(), C20275c5.m56244d(serializer, c20265b7)), new C20337g0());
                    }
                    bufferedReader.close();
                } catch (Throwable th5) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error processing previous session.", th7);
            }
            if (file.delete()) {
                return;
            }
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
