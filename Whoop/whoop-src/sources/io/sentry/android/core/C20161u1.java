package io.sentry.android.core;

import aa3.C0656u0;
import ai.C0904j;
import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.crypto.tink.internal.C5101l0;
import gm.C15990r;
import hg3.AbstractC17269i;
import io.sentry.C20040a;
import io.sentry.C20275c5;
import io.sentry.C20312d5;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.EnumC20424m5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.cache.C20066b;
import io.sentry.android.core.internal.tombstone.C20099b;
import io.sentry.android.core.internal.tombstone.EnumC20098a;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20500u;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import p133f1.C13968p1;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.android.core.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20161u1 implements InterfaceC20080h0 {

    /* JADX INFO: renamed from: a */
    public final SentryAndroidOptions f75754a;

    /* JADX INFO: renamed from: b */
    public final C13968p1 f75755b;

    /* JADX INFO: renamed from: c */
    public final Context f75756c;

    public C20161u1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f75754a = sentryAndroidOptions;
        this.f75755b = new C13968p1(sentryAndroidOptions);
        this.f75756c = context;
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: a */
    public final Long mo55956a() {
        return C20066b.m55934l(this.f75754a, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: b */
    public final boolean mo55957b() {
        return this.f75754a.isReportHistoricalTombstones();
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: c */
    public final C15990r mo55958c(ApplicationExitInfo applicationExitInfo, boolean z4) {
        SentryAndroidOptions sentryAndroidOptions = this.f75754a;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                return null;
            }
            C20099b c20099b = new C20099b(traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.f75756c.getApplicationInfo().nativeLibraryDir);
            try {
                C20321e5 c20321e5M55980b = c20099b.m55980b();
                c20099b.close();
                long timestamp = applicationExitInfo.getTimestamp();
                c20321e5M55980b.f76300P = AbstractC21598x.m60660P(timestamp);
                C20158t1 c20158t1 = new C20158t1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z4);
                C20337g0 c20337g0M48858C = AbstractC17269i.m48858C(c20158t1);
                try {
                    C20321e5 c20321e5M56070e = m56070e(timestamp, c20321e5M55980b, c20337g0M48858C);
                    if (c20321e5M56070e != null) {
                        c20321e5M55980b = c20321e5M56070e;
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th3.getMessage());
                }
                return new C15990r(c20321e5M55980b, c20337g0M48858C, c20158t1, 7);
            } catch (Throwable th4) {
                try {
                    c20099b.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
            return null;
        }
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: d */
    public final int mo55959d() {
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:247:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v7, types: [gm.r] */
    /* JADX INFO: renamed from: e */
    public final C20321e5 m56070e(long j7, C20321e5 c20321e5, C20337g0 c20337g0) {
        C20321e5 c20321e6;
        boolean z4;
        File[] fileArr;
        String name;
        C20168x0 c20168x0;
        C20168x0 c20168x0M39753i;
        int i13;
        String string;
        ?? r10;
        String str;
        C13968p1 c13968p1 = this.f75755b;
        ArrayList arrayList = (ArrayList) c13968p1.f49809z;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c13968p1.f49808y;
        int i14 = 0;
        if (c13968p1.f49807x) {
            c20321e6 = null;
        } else {
            boolean z13 = true;
            c13968p1.f49807x = true;
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            if (outboxPath == null) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] fileArrListFiles = new File(outboxPath).listFiles();
                if (fileArrListFiles == null) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else if (fileArrListFiles.length == 0) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "No envelope files found in outbox.", new Object[0]);
                } else {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                    int length = fileArrListFiles.length;
                    int i15 = 0;
                    while (i15 < length) {
                        File file = fileArrListFiles[i15];
                        if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                            z4 = z13;
                            fileArr = fileArrListFiles;
                        } else {
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                int i16 = i14;
                                do {
                                    try {
                                        i13 = bufferedInputStream.read();
                                        c20168x0 = null;
                                        if (i13 == -1) {
                                            if (i16 > 0) {
                                                break;
                                            }
                                            i16 = -1;
                                            break;
                                        }
                                        i16++;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z4 = z13;
                                        fileArr = fileArrListFiles;
                                        c20168x0 = null;
                                    }
                                } while (i13 != 10);
                                if (i16 < 0) {
                                    try {
                                        bufferedInputStream.close();
                                        z4 = z13;
                                        fileArr = fileArrListFiles;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z4 = z13;
                                        fileArr = fileArrListFiles;
                                        sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                    }
                                } else {
                                    boolean z14 = z13;
                                    fileArr = fileArrListFiles;
                                    long j13 = i16;
                                    while (true) {
                                        if (j13 < 209715200) {
                                            try {
                                                StringBuilder sb4 = new StringBuilder();
                                                z4 = z14;
                                                while (true) {
                                                    try {
                                                        int i17 = bufferedInputStream.read();
                                                        if (i17 == -1) {
                                                            if (sb4.length() <= 0) {
                                                                string = null;
                                                                break;
                                                            }
                                                            string = sb4.toString();
                                                            break;
                                                        }
                                                        if (i17 == 10) {
                                                            string = sb4.toString();
                                                            break;
                                                        }
                                                        sb4.append((char) i17);
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        Throwable th6 = th;
                                                        try {
                                                            bufferedInputStream.close();
                                                        } catch (Throwable th7) {
                                                            th6.addSuppressed(th7);
                                                        }
                                                        throw th6;
                                                    }
                                                }
                                                if (string != null && !string.isEmpty()) {
                                                    long length2 = j13 + ((long) (string.length() + 1));
                                                    C0904j c0904jM39760r = c13968p1.m39760r(string);
                                                    if (c0904jM39760r != null) {
                                                        int i18 = c0904jM39760r.f3301w;
                                                        if (NotificationCompat.CATEGORY_EVENT.equals((String) c0904jM39760r.f3302x)) {
                                                            c20168x0M39753i = c13968p1.m39753i(bufferedInputStream, i18, file);
                                                            if (c20168x0M39753i != null) {
                                                                try {
                                                                    bufferedInputStream.close();
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                                    c20168x0M39753i = c20168x0;
                                                                    if (c20168x0M39753i != null) {
                                                                        arrayList.add(c20168x0M39753i);
                                                                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c20168x0M39753i.f75767b));
                                                                    }
                                                                    i15++;
                                                                    fileArrListFiles = fileArr;
                                                                    z13 = z4;
                                                                    i14 = 0;
                                                                }
                                                            }
                                                            if (c20168x0M39753i != null) {
                                                                arrayList.add(c20168x0M39753i);
                                                                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c20168x0M39753i.f75767b));
                                                            }
                                                        } else {
                                                            C13968p1.m39747w(bufferedInputStream, i18);
                                                        }
                                                        long j14 = length2 + ((long) i18);
                                                        int i19 = bufferedInputStream.read();
                                                        if (i19 != -1) {
                                                            j13 = j14 + 1;
                                                            if (i19 == 10) {
                                                                z14 = z4;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                z4 = z14;
                                            }
                                        } else {
                                            z4 = z14;
                                        }
                                        bufferedInputStream.close();
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                z4 = z13;
                                fileArr = fileArrListFiles;
                                c20168x0 = null;
                            }
                            c20168x0M39753i = c20168x0;
                            if (c20168x0M39753i != null) {
                                arrayList.add(c20168x0M39753i);
                                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c20168x0M39753i.f75767b));
                            }
                        }
                        i15++;
                        fileArrListFiles = fileArr;
                        z13 = z4;
                        i14 = 0;
                    }
                    c20321e6 = null;
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                }
            }
            c20321e6 = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                C20168x0 c20168x1 = (C20168x0) it.next();
                long jAbs = Math.abs(j7 - c20168x1.f75767b);
                if (jAbs <= 5000) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                    arrayList.remove(c20168x1);
                    File file2 = c20168x1.f75766a;
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        try {
                            C5101l0 c5101l0Mo56667a = sentryAndroidOptions.getEnvelopeReader().mo56667a(bufferedInputStream2);
                            if (c5101l0Mo56667a != null) {
                                Iterator it3 = ((Iterable) c5101l0Mo56667a.f21444y).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C20275c5 c20275c5 = (C20275c5) it3.next();
                                        if (EnumC20424m5.Event.equals(c20275c5.f76147a.f76265E)) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), StandardCharsets.UTF_8));
                                            try {
                                                C20321e5 c20321e7 = (C20321e5) sentryAndroidOptions.getSerializer().mo56239e(bufferedReader, C20321e5.class);
                                                if (c20321e7 != null && "native".equals(c20321e7.f76875H)) {
                                                    C15990r c15990r = new C15990r(c20321e7, file2, c5101l0Mo56667a, 8);
                                                    bufferedReader.close();
                                                    bufferedInputStream2.close();
                                                    r10 = c15990r;
                                                    break;
                                                }
                                                bufferedReader.close();
                                            } catch (Throwable th11) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th11;
                                                } catch (Throwable th12) {
                                                    th11.addSuppressed(th12);
                                                    throw th11;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                throw th;
                                            } catch (Throwable th13) {
                                                th.addSuppressed(th13);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (Throwable th14) {
                            bufferedInputStream2.close();
                            throw th14;
                        }
                    } catch (Throwable th15) {
                        sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.DEBUG, th15, "Error loading envelope file: %s", file2.getAbsolutePath());
                    }
                }
            }
            r10 = c20321e6;
            break;
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f75754a;
        if (r10 == 0) {
            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "No matching native event found for tombstone.", new Object[0]);
            return c20321e6;
        }
        File file3 = (File) r10.f60513y;
        InterfaceC20602v0 logger = sentryAndroidOptions2.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
        try {
            if (!file3.delete()) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
                return c20321e6;
            }
            sentryAndroidOptions.getLogger().mo16066m(enumC20436n5, "Deleted native event file from outbox: %s", file3.getName());
            C20321e5 c20321e8 = (C20321e5) r10.f60512x;
            ArrayList arrayListM56480d = c20321e5.m56480d();
            C20472d c20472d = c20321e5.f76881N;
            ArrayList arrayListM56481e = c20321e5.m56481e();
            if (arrayListM56480d != null && !arrayListM56480d.isEmpty() && c20472d != null && arrayListM56481e != null) {
                C20490n c20490n = ((C20500u) arrayListM56480d.get(0)).f76796F;
                if (c20490n != null) {
                    c20490n.f76740w = EnumC20098a.TOMBSTONE_MERGED.getValue();
                }
                C20491o c20491o = c20321e8.f76301Q;
                if (c20491o == null || (str = c20491o.f76745x) == null || str.isEmpty()) {
                    c20321e8.f76301Q = c20321e5.f76301Q;
                }
                c20321e8.f76304T = new C0656u0(arrayListM56480d);
                c20321e8.f76881N = c20472d;
                c20321e8.f76303S = new C0656u0(arrayListM56481e);
            }
            for (C20275c5 c20275c6 : (Iterable) ((C5101l0) r10.f60514z).f21444y) {
                try {
                    C20312d5 c20312d5 = c20275c6.f76147a;
                    String str2 = c20312d5.f76272y;
                    if (c20312d5.f76265E == EnumC20424m5.Attachment && str2 != null) {
                        byte[] bArrM56247f = c20275c6.m56247f();
                        C20312d5 c20312d6 = c20275c6.f76147a;
                        try {
                            c20337g0.f76349b.add(new C20040a(str2, c20312d6.f76270w, c20312d6.f76268H, bArrM56247f));
                        } catch (Throwable th16) {
                            th = th16;
                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                        }
                    }
                } catch (Throwable th17) {
                    th = th17;
                }
            }
            return c20321e8;
        } catch (Throwable th18) {
            sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.ERROR, th18, "Error deleting native event file: %s", file3.getAbsolutePath());
        }
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    public final String getLabel() {
        return "Tombstone";
    }
}
