package androidx.lifecycle;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1780e1;
import androidx.room.C1816o1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC3027k1;
import com.whoop.realtime.service.C9907b;
import ge3.AbstractC15751g;
import io.sentry.AbstractC20445o4;
import io.sentry.C20351h5;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.internal.modules.C20095a;
import io.sentry.cache.C20283f;
import io.sentry.cache.tape.AbstractC20289f;
import io.seon.androidsdk.service.AbstractC20684o;
import io.seon.androidsdk.service.C20650b0;
import io.seon.androidsdk.service.C20682n;
import io.seon.androidsdk.service.C20691r0;
import io.seon.androidsdk.service.C20693s0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0023g0;
import p027b3.C2382h0;
import p029b5.AbstractC2732k;
import p044c5.C4217i;
import p079d2.C11483e;
import p079d2.EnumC11484f;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p098dt.AbstractC12350b;
import p185h6.C16964s;
import p281kj.C22509d;
import p328mj.C25600g;
import p426qi.C30378d0;
import p426qi.C30402w;
import p437qt.C30582e;
import p505ts.AbstractC34132o;
import p543v4.AbstractC35646e;
import p682zi.C40653c;
import p692zt.C41097b0;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.lifecycle.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1645z0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6351x;

    public /* synthetic */ RunnableC1645z0(Object obj, int i13) {
        this.f6350w = i13;
        this.f6351x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0329  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AndroidComposeView androidComposeView;
        Object[] objArr = 0;
        int i13 = 0;
        switch (this.f6350w) {
            case 0:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f6351x;
                C1593i0 c1593i0 = processLifecycleOwner.f6175F;
                if (processLifecycleOwner.f6179x == 0) {
                    processLifecycleOwner.f6180y = true;
                    c1593i0.m4991g(EnumC1632v.ON_PAUSE);
                }
                if (processLifecycleOwner.f6178w == 0 && processLifecycleOwner.f6180y) {
                    c1593i0.m4991g(EnumC1632v.ON_STOP);
                    processLifecycleOwner.f6181z = true;
                    return;
                }
                return;
            case 1:
                C1780e1 c1780e1 = (C1780e1) this.f6351x;
                boolean zHasActiveObservers = c1780e1.hasActiveObservers();
                int i14 = 0;
                if (c1780e1.f7013e.compareAndSet(false, true) && zHasActiveObservers) {
                    AbstractC3006f0.m8732z(c1780e1.f7009a.getCoroutineScope(), c1780e1.f7016h, null, new C1816o1(c1780e1, objArr == true ? 1 : 0, i14), 2);
                    return;
                }
                return;
            case 2:
                AndroidComposeView androidComposeView2 = (AndroidComposeView) this.f6351x;
                androidComposeView2.f4938a1 = false;
                MotionEvent motionEvent = androidComposeView2.f4925S0;
                AbstractC22676k.m65747g(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView2.m3579L(motionEvent);
                return;
            case 3:
                C2382h0 c2382h0 = (C2382h0) this.f6351x;
                Trace.beginSection("measureAndLayout");
                try {
                    c2382h0.f9408d.m3592w(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c2382h0.m7379n();
                        Trace.endSection();
                        c2382h0.f9403L = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 4:
                ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = (ViewOnAttachStateChangeListenerC11482d) this.f6351x;
                boolean zM30900e = viewOnAttachStateChangeListenerC11482d.m30900e();
                AndroidComposeView androidComposeView3 = viewOnAttachStateChangeListenerC11482d.f36910w;
                if (zM30900e) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView3.m3592w(true);
                        C0023g0 c0023g0 = viewOnAttachStateChangeListenerC11482d.f36906L;
                        int[] iArr = c0023g0.f149b;
                        long[] jArr = c0023g0.f148a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j7 = jArr[i15];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                                    int i17 = i13;
                                    while (i17 < i16) {
                                        if ((255 & j7) < 128) {
                                            int i18 = iArr[(i15 << 3) + i17];
                                            if (!viewOnAttachStateChangeListenerC11482d.m30899d().m120a(i18)) {
                                                viewOnAttachStateChangeListenerC11482d.f36913z.add(new C11483e(i18, viewOnAttachStateChangeListenerC11482d.f36905K, EnumC11484f.f36919x, null));
                                                viewOnAttachStateChangeListenerC11482d.f36902H.mo32218s(C23454a0.f92919a);
                                            }
                                        }
                                        j7 >>= 8;
                                        i17++;
                                        androidComposeView3 = androidComposeView3;
                                    }
                                    androidComposeView = androidComposeView3;
                                    if (i16 == 8) {
                                    }
                                } else {
                                    androidComposeView = androidComposeView3;
                                }
                                if (i15 != length) {
                                    i15++;
                                    androidComposeView3 = androidComposeView;
                                    i13 = 0;
                                }
                            }
                        } else {
                            androidComposeView = androidComposeView3;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            viewOnAttachStateChangeListenerC11482d.m30902g(androidComposeView.getSemanticsOwner().m51794a(), viewOnAttachStateChangeListenerC11482d.f36907M);
                            Trace.endSection();
                            viewOnAttachStateChangeListenerC11482d.m30897b(viewOnAttachStateChangeListenerC11482d.m30899d());
                            viewOnAttachStateChangeListenerC11482d.m30906o();
                            viewOnAttachStateChangeListenerC11482d.f36908N = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 5:
                C16964s c16964s = (C16964s) this.f6351x;
                synchronized (c16964s.f65108d) {
                    try {
                        if (c16964s.f65112h == null) {
                            return;
                        }
                        try {
                            C4217i c4217iM47722c = c16964s.m47722c();
                            int i19 = c4217iM47722c.f17102e;
                            if (i19 == 2) {
                                synchronized (c16964s.f65108d) {
                                }
                            }
                            if (i19 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i19 + ")");
                            }
                            try {
                                int i24 = AbstractC2732k.f10742a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C30582e c30582e = c16964s.f65107c;
                                Context context = c16964s.f65105a;
                                c30582e.getClass();
                                C4217i[] c4217iArr = {c4217iM47722c};
                                AbstractC34132o abstractC34132o = AbstractC35646e.f151456a;
                                Trace.beginSection(AbstractC29125c.m88517Z("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceMo107898n = AbstractC35646e.f151456a.mo107898n(context, c4217iArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM118963O = AbstractC37056f.m118963O(c16964s.f65105a, c4217iM47722c.f17098a);
                                    if (mappedByteBufferM118963O == null || typefaceMo107898n == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C41113q c41113q = new C41113q(typefaceMo107898n, AbstractC12350b.m34558G(mappedByteBufferM118963O));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c16964s.f65108d) {
                                            try {
                                                AbstractC37056f abstractC37056f = c16964s.f65112h;
                                                if (abstractC37056f != null) {
                                                    abstractC37056f.mo47705T(c41113q);
                                                }
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                        c16964s.m47721b();
                                        return;
                                    } catch (Throwable th7) {
                                        int i25 = AbstractC2732k.f10742a;
                                        Trace.endSection();
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Trace.endSection();
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                int i26 = AbstractC2732k.f10742a;
                                Trace.endSection();
                                throw th9;
                            }
                            break;
                        } catch (Throwable th10) {
                            synchronized (c16964s.f65108d) {
                                try {
                                    AbstractC37056f abstractC37056f2 = c16964s.f65112h;
                                    if (abstractC37056f2 != null) {
                                        abstractC37056f2.mo47704S(th10);
                                    }
                                    c16964s.m47721b();
                                    return;
                                } catch (Throwable th11) {
                                    throw th11;
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        throw th12;
                    }
                }
            case 6:
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f6351x;
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                    return;
                }
                return;
            case 7:
                File[] fileArrListFiles = ((File) this.f6351x).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length2 = fileArrListFiles.length;
                while (i13 < length2) {
                    File file = fileArrListFiles[i13];
                    if (file.lastModified() < AbstractC20445o4.f76537f - TimeUnit.MINUTES.toMillis(5L)) {
                        AbstractC15751g.m44465r(file);
                    }
                    i13++;
                }
                return;
            case 8:
                C20351h5 c20351h5 = (C20351h5) this.f6351x;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c20351h5.f76377a;
                while (i13 < 40) {
                    try {
                        scheduledThreadPoolExecutor.schedule(c20351h5.f76379c, 365L, TimeUnit.DAYS).cancel(true);
                        i13++;
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                }
                scheduledThreadPoolExecutor.purge();
                return;
            case 9:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f6351x;
                systemEventsBreadcrumbsIntegration.m55908h(systemEventsBreadcrumbsIntegration.f75291y);
                return;
            case 10:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.f6351x;
                anrProfilingIntegration.getClass();
                anrProfilingIntegration.f75323E = SystemClock.uptimeMillis();
                return;
            case 11:
                ((C20095a) this.f6351x).mo56602a();
                return;
            case 12:
                C20283f c20283f = (C20283f) this.f6351x;
                try {
                    ((AbstractC20289f) c20283f.f76166b.m56714a()).clear();
                    return;
                } catch (IOException e5) {
                    c20283f.f76165a.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to clear breadcrumbs from file queue", e5);
                    return;
                }
            case 13:
                C20682n c20682n = (C20682n) this.f6351x;
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                try {
                    C20691r0 c20691r0 = C20682n.f77405m;
                    c20691r0.f77447d.lock();
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                            c20691r0.f77444a = c20682n.m56845g();
                            c20691r0.f77445b = jCurrentTimeMillis;
                        }
                        break;
                    } catch (Throwable unused2) {
                    }
                    c20691r0.f77447d.unlock();
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 14:
                C20650b0 c20650b0 = (C20650b0) this.f6351x;
                c20650b0.getClass();
                try {
                    c20650b0.f77236f = (ClipboardManager) c20650b0.f77237g.getSystemService("clipboard");
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 15:
                C20693s0 c20693s0 = (C20693s0) this.f6351x;
                c20693s0.getClass();
                HashMap map = new HashMap();
                String[] strArr = {"/system/bin/cat", "/proc/cpuinfo"};
                byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                try {
                    InputStream inputStream = new ProcessBuilder(strArr).start().getInputStream();
                    while (inputStream.read(bArr) != -1) {
                        for (String str : new String(bArr).split("\n")) {
                            String[] strArrSplit = str.split(":");
                            if (strArrSplit.length > 1) {
                                String strReplace = strArrSplit[0].trim().replace(" ", "_");
                                if (!map.containsKey(strReplace)) {
                                    if (strReplace.equals("model_name")) {
                                        strReplace = "cpu_model";
                                    }
                                    String strTrim = strArrSplit[1].trim();
                                    if (strReplace.equals("cpu_model")) {
                                        strTrim = strTrim.replaceAll("\\s+", " ");
                                    }
                                    map.put(strReplace, strTrim);
                                }
                            }
                        }
                    }
                    inputStream.close();
                    break;
                } catch (IOException unused5) {
                }
                c20693s0.f77454f = map;
                return;
            case 16:
                C22509d this$0 = (C22509d) this.f6351x;
                AbstractC22676k.m65750j(this$0, "this$0");
                this$0.f88217b = true;
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C25600g this$1 = (C25600g) this.f6351x;
                AbstractC22676k.m65750j(this$1, "this$0");
                ComposeView composeView = this$1.f100436b;
                if (composeView != null) {
                    ViewParent parent = composeView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(composeView);
                        return;
                    }
                    return;
                }
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C30402w c30402w = (C30402w) this.f6351x;
                Semaphore semaphore = c30402w.f124765m0;
                C40653c c40653c = c30402w.f124741O;
                if (c40653c == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c40653c.mo131935p(c30402w.f124770x.m33241a());
                    break;
                } catch (InterruptedException unused6) {
                } finally {
                    semaphore.release();
                }
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((C30378d0) this.f6351x).m92856c();
                return;
            case 20:
                ((C9907b) this.f6351x).m24277q();
                return;
            default:
                C41097b0 c41097b0 = (C41097b0) this.f6351x;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c41097b0.f177179a.getAction() + " finishing.");
                c41097b0.f177180b.m29689d(null);
                return;
        }
    }
}
