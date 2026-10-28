package io.sentry.android.core;

import a00.C0072g;
import aa3.C0656u0;
import android.app.ApplicationExitInfo;
import com.google.android.material.datepicker.C5020n;
import gm.C15990r;
import hg3.AbstractC17269i;
import io.sentry.C20040a;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.cache.C20066b;
import io.sentry.android.core.internal.threaddump.C20097b;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20491o;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.android.core.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20169y implements InterfaceC20080h0 {

    /* JADX INFO: renamed from: a */
    public final SentryAndroidOptions f75768a;

    public C20169y(SentryAndroidOptions sentryAndroidOptions) {
        this.f75768a = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: a */
    public final Long mo55956a() {
        return C20066b.m55934l(this.f75768a, "last_anr_report", "ANR");
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: b */
    public final boolean mo55957b() {
        return this.f75768a.isReportHistoricalAnrs();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[Catch: all -> 0x0029, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0029, blocks: (B:6:0x0015, B:10:0x0024, B:26:0x004f, B:56:0x00ca, B:55:0x00c7, B:52:0x00c2, B:8:0x001b, B:16:0x0030, B:25:0x004c, B:50:0x00bf, B:49:0x00bc), top: B:85:0x0015, inners: #1, #6 }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: c */
    public final C15990r mo55958c(ApplicationExitInfo applicationExitInfo, boolean z4) {
        C0072g c0072g;
        EnumC20171z enumC20171z;
        C20337g0 c20337g0M48858C;
        C20321e5 c20321e5;
        ArrayList arrayList;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.f75768a;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z13 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    c0072g = new C0072g(EnumC20171z.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        while (true) {
                            int i13 = traceInputStream.read(bArr2, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                            if (i13 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i13);
                            if (traceInputStream != null) {
                                throw th;
                            }
                            try {
                                traceInputStream.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        ?? byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                C5020n c5020nM15738u = C5020n.m15738u(bufferedReader);
                                C20097b c20097b = new C20097b(sentryAndroidOptions, z13);
                                c20097b.m55979f(c5020nM15738u);
                                ArrayList arrayListM55978d = c20097b.m55978d();
                                ArrayList arrayListM55977b = c20097b.m55977b();
                                if (arrayListM55978d.isEmpty()) {
                                    c0072g = new C0072g(EnumC20171z.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    C0072g c0072g2 = new C0072g(EnumC20171z.DUMP, byteArray, arrayListM55978d, arrayListM55977b, 14);
                                    bufferedReader.close();
                                    c0072g = c0072g2;
                                }
                            } catch (Throwable th4) {
                                try {
                                    bufferedReader.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th6) {
                            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to parse ANR thread dump", th6);
                            c0072g = new C0072g(EnumC20171z.ERROR, (Serializable) byteArray, 14);
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
            } catch (Throwable th9) {
                if (traceInputStream != null) {
                    throw th9;
                }
                traceInputStream.close();
                throw th9;
                enumC20171z = (EnumC20171z) c0072g.f223x;
                if (enumC20171z == EnumC20171z.NO_DUMP) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                    return null;
                }
                C20167x c20167x = new C20167x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z4, z13);
                c20337g0M48858C = AbstractC17269i.m48858C(c20167x);
                c20321e5 = new C20321e5();
                if (enumC20171z == EnumC20171z.ERROR) {
                    C20491o c20491o = new C20491o();
                    c20491o.f76744w = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                    c20321e5.f76301Q = c20491o;
                } else if (enumC20171z == EnumC20171z.DUMP) {
                    c20321e5.f76303S = new C0656u0((ArrayList) c0072g.f225z);
                    arrayList = (ArrayList) c0072g.f221E;
                    if (arrayList != null) {
                        C20472d c20472d = new C20472d();
                        c20472d.f76632x = new ArrayList(arrayList);
                        c20321e5.f76881N = c20472d;
                    }
                }
                c20321e5.f76305U = EnumC20436n5.FATAL;
                c20321e5.f76300P = AbstractC21598x.m60660P(timestamp);
                if (sentryAndroidOptions.isAttachAnrThreadDump()) {
                    c20337g0M48858C.f76353f = C20040a.m55881b(bArr);
                }
                return new C15990r(c20321e5, c20337g0M48858C, c20167x, 7);
            }
        } catch (Throwable th10) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to read ANR thread dump", th10);
            c0072g = new C0072g(EnumC20171z.NO_DUMP);
        }
        enumC20171z = (EnumC20171z) c0072g.f223x;
        if (enumC20171z == EnumC20171z.NO_DUMP) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return null;
        }
        C20167x c20167x2 = new C20167x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z4, z13);
        c20337g0M48858C = AbstractC17269i.m48858C(c20167x2);
        c20321e5 = new C20321e5();
        if (enumC20171z == EnumC20171z.ERROR) {
            C20491o c20491o2 = new C20491o();
            c20491o2.f76744w = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c20321e5.f76301Q = c20491o2;
        } else if (enumC20171z == EnumC20171z.DUMP) {
            c20321e5.f76303S = new C0656u0((ArrayList) c0072g.f225z);
            arrayList = (ArrayList) c0072g.f221E;
            if (arrayList != null) {
                C20472d c20472d2 = new C20472d();
                c20472d2.f76632x = new ArrayList(arrayList);
                c20321e5.f76881N = c20472d2;
            }
        }
        c20321e5.f76305U = EnumC20436n5.FATAL;
        c20321e5.f76300P = AbstractC21598x.m60660P(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) c0072g.f224y) != null) {
            c20337g0M48858C.f76353f = C20040a.m55881b(bArr);
        }
        return new C15990r(c20321e5, c20337g0M48858C, c20167x2, 7);
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    /* JADX INFO: renamed from: d */
    public final int mo55959d() {
        return 6;
    }

    @Override // io.sentry.android.core.InterfaceC20080h0
    public final String getLabel() {
        return "ANR";
    }
}
