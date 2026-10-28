package com.iterable.iterableapi;

import android.util.Base64;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5369s implements InterfaceC5321f {

    /* JADX INFO: renamed from: E */
    public volatile boolean f21817E;

    /* JADX INFO: renamed from: w */
    public final C5341k f21819w;

    /* JADX INFO: renamed from: y */
    public Timer f21821y;

    /* JADX INFO: renamed from: z */
    public final C5352m2 f21822z;

    /* JADX INFO: renamed from: F */
    public final ExecutorService f21818F = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: x */
    public final long f21820x = 60000;

    public C5369s(C5341k c5341k, C5352m2 c5352m2) {
        this.f21819w = c5341k;
        this.f21822z = c5352m2;
        C5325g.f21686i.m16438a(this);
    }

    /* JADX INFO: renamed from: c */
    public static long m16516c(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 3) {
            return new JSONObject(new String(Base64.decode(strArrSplit[1], 8), "UTF-8")).getLong("exp");
        }
        throw new IllegalArgumentException("Invalid JWT");
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: a */
    public final void mo16418a() {
        try {
            AbstractC12350b.m34593n("IterableAuth", "App switched to background - disabling auth token requests");
            Timer timer = this.f21821y;
            if (timer != null) {
                timer.cancel();
                this.f21821y = null;
                this.f21817E = false;
            }
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableAuth", "Error while switching to background", e5);
        }
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: b */
    public final void mo16419b() {
        try {
            AbstractC12350b.m34593n("IterableAuth", "App switched to foreground - enabling auth token requests");
            C5341k c5341k = this.f21819w;
            if (c5341k.f21746d == null && c5341k.f21747e == null) {
                AbstractC12350b.m34593n("IterableAuth", "Email or userId is not available. Skipping token refresh");
                return;
            }
            m16517d(c5341k.f21749g);
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableAuth", "Error occurred in handling auth token refresh", e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16517d(String str) {
        Timer timer = this.f21821y;
        if (timer != null) {
            timer.cancel();
            this.f21821y = null;
            this.f21817E = false;
        }
        try {
            if (str == null) {
                AbstractC12350b.m34593n("IterableAuth", "JWT is null. Scheduling token refresh");
                if (this.f21817E) {
                    return;
                }
                m16518e(this.f21822z.f21773a, false, null);
                return;
            }
            long jM16516c = ((m16516c(str) * 1000) - this.f21820x) - System.currentTimeMillis();
            if (jM16516c > 0) {
                m16518e(jM16516c, true, null);
            } else {
                m16518e(this.f21822z.f21773a, true, null);
            }
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableAuth", "Error while parsing JWT for the expiration", e5);
            m16518e(this.f21822z.f21773a, false, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16518e(long j7, boolean z4, C5392z1 c5392z1) {
        if (this.f21817E) {
            return;
        }
        if (this.f21821y == null) {
            this.f21821y = new Timer(true);
        }
        try {
            this.f21821y.schedule(new C5366r(this, c5392z1, z4), j7);
            this.f21817E = true;
        } catch (Exception e5) {
            AbstractC12350b.m34596q("IterableAuth", "timer exception: " + this.f21821y, e5);
        }
    }
}
