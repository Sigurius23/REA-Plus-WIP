package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.EnumC20521r6;
import io.sentry.android.replay.C20253w;
import io.sentry.protocol.C20501v;
import p002a0.C0006a1;
import p043c4.C3974q;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.l */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC20196l {
    /* JADX INFO: renamed from: a */
    void mo56113a(C20253w c20253w);

    /* JADX INFO: renamed from: b */
    InterfaceC20196l mo56114b();

    /* JADX INFO: renamed from: c */
    void mo56105c(int i13, C20501v c20501v, EnumC20521r6 enumC20521r6);

    /* JADX INFO: renamed from: d */
    void mo56115d(C3974q c3974q);

    /* JADX INFO: renamed from: e */
    void mo56116e(boolean z4, C0006a1 c0006a1);

    void onTouchEvent(MotionEvent motionEvent);

    void pause();

    void stop();
}
