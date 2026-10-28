package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.android.core.internal.util.InterfaceC20115p;
import io.sentry.profilemeasurements.C20463b;
import java.util.Date;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: io.sentry.android.core.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20150r implements InterfaceC20115p {

    /* JADX INFO: renamed from: a */
    public float f75694a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20153s f75695b;

    public C20150r(C20153s c20153s) {
        this.f75695b = c20153s;
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC20115p
    /* JADX INFO: renamed from: c */
    public final void mo56003c(long j7, long j13, long j14, long j15, boolean z4, boolean z13, float f13) {
        Date dateM60659O = AbstractC21598x.m60659O();
        System.nanoTime();
        long time = dateM60659O.getTime() * 1000000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j13 - System.nanoTime());
        C20153s c20153s = this.f75695b;
        long j16 = jElapsedRealtimeNanos - c20153s.f75701a;
        if (j16 < 0) {
            return;
        }
        if (z13) {
            c20153s.f75710j.addLast(new C20463b(Long.valueOf(j16), Long.valueOf(j14), time));
        } else if (z4) {
            c20153s.f75709i.addLast(new C20463b(Long.valueOf(j16), Long.valueOf(j14), time));
        }
        if (f13 != this.f75694a) {
            this.f75694a = f13;
            c20153s.f75708h.addLast(new C20463b(Long.valueOf(j16), Float.valueOf(f13), time));
        }
    }
}
