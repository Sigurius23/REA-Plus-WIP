package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import gm.C15990r;
import io.sentry.C20371i4;
import io.sentry.EnumC20436n5;
import io.sentry.cache.C20280c;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.hints.AbstractC20356c;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20554d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p380os.C28301a;

/* JADX INFO: renamed from: io.sentry.android.core.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20083i0 implements Runnable {

    /* JADX INFO: renamed from: F */
    public static final long f75439F = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: E */
    public final long f75440E;

    /* JADX INFO: renamed from: w */
    public final Context f75441w;

    /* JADX INFO: renamed from: x */
    public final C20371i4 f75442x;

    /* JADX INFO: renamed from: y */
    public final SentryAndroidOptions f75443y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC20080h0 f75444z;

    public RunnableC20083i0(Context context, SentryAndroidOptions sentryAndroidOptions, C20554d c20554d, InterfaceC20080h0 interfaceC20080h0) {
        Context applicationContext = context.getApplicationContext();
        this.f75441w = applicationContext != null ? applicationContext : context;
        this.f75442x = C20371i4.f76402a;
        this.f75443y = sentryAndroidOptions;
        this.f75444z = interfaceC20080h0;
        c20554d.getClass();
        this.f75440E = System.currentTimeMillis() - f75439F;
    }

    /* JADX INFO: renamed from: a */
    public final void m55963a(ApplicationExitInfo applicationExitInfo, boolean z4) {
        AbstractC20356c abstractC20356cM45144G;
        InterfaceC20080h0 interfaceC20080h0 = this.f75444z;
        C15990r c15990rMo55958c = interfaceC20080h0.mo55958c(applicationExitInfo, z4);
        if (c15990rMo55958c == null) {
            return;
        }
        if (this.f75442x.mo56442v(c15990rMo55958c.m45143F(), c15990rMo55958c.m45145H()).equals(C20501v.f76802x) || (abstractC20356cM45144G = c15990rMo55958c.m45144G()) == null || abstractC20356cM45144G.mo56038e()) {
            return;
        }
        this.f75443y.getLogger().mo16066m(EnumC20436n5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", interfaceC20080h0.getLabel(), c15990rMo55958c.m45143F().f76883w);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.f75441w.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.f75443y;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        InterfaceC20281d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C20280c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            C20280c c20280c = (C20280c) envelopeDiskCache;
            if (!c20280c.m56261g()) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                c20280c.f76155E.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        InterfaceC20080h0 interfaceC20080h0 = this.f75444z;
        Long lMo55956a = interfaceC20080h0.mo55956a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM85738i = C28301a.m85738i(it.next());
            if (applicationExitInfoM85738i.getReason() == interfaceC20080h0.mo55959d()) {
                it.remove();
                applicationExitInfo = applicationExitInfoM85738i;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "No %ss have been found in the historical exit reasons list.", interfaceC20080h0.getLabel());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j7 = this.f75440E;
        if (timestamp < j7) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Latest %s happened too long ago, returning early.", interfaceC20080h0.getLabel());
            return;
        }
        if (lMo55956a != null && applicationExitInfo.getTimestamp() <= lMo55956a.longValue()) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Latest %s has already been reported, returning early.", interfaceC20080h0.getLabel());
            return;
        }
        if (interfaceC20080h0.mo55957b()) {
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ApplicationExitInfo applicationExitInfoM85738i2 = C28301a.m85738i(it3.next());
                if (applicationExitInfoM85738i2.getReason() == interfaceC20080h0.mo55959d()) {
                    if (applicationExitInfoM85738i2.getTimestamp() < j7) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "%s happened too long ago %s.", interfaceC20080h0.getLabel(), applicationExitInfoM85738i2);
                    } else if (lMo55956a == null || applicationExitInfoM85738i2.getTimestamp() > lMo55956a.longValue()) {
                        m55963a(applicationExitInfoM85738i2, false);
                    } else {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "%s has already been reported %s.", interfaceC20080h0.getLabel(), applicationExitInfoM85738i2);
                    }
                }
            }
        }
        m55963a(applicationExitInfo, true);
    }
}
