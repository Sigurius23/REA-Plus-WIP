package hn;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.support.v4.media.session.HandlerC1074h;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p031b9.C2852m1;

/* JADX INFO: renamed from: hn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17497e {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f67625g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f67626h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f67627a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f67628b;

    /* JADX INFO: renamed from: c */
    public HandlerC1074h f67629c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f67630d;

    /* JADX INFO: renamed from: e */
    public final C2852m1 f67631e;

    /* JADX INFO: renamed from: f */
    public boolean f67632f;

    public C17497e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C2852m1 c2852m1 = new C2852m1(2);
        this.f67627a = mediaCodec;
        this.f67628b = handlerThread;
        this.f67631e = c2852m1;
        this.f67630d = new AtomicReference();
    }

    /* JADX INFO: renamed from: b */
    public static C17496d m49686b() {
        ArrayDeque arrayDeque = f67625g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C17496d();
                }
                return (C17496d) arrayDeque.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m49687a() {
        if (this.f67632f) {
            try {
                HandlerC1074h handlerC1074h = this.f67629c;
                handlerC1074h.getClass();
                handlerC1074h.removeCallbacksAndMessages(null);
                C2852m1 c2852m1 = this.f67631e;
                synchronized (c2852m1) {
                    c2852m1.f11320x = false;
                }
                HandlerC1074h handlerC1074h2 = this.f67629c;
                handlerC1074h2.getClass();
                handlerC1074h2.obtainMessage(2).sendToTarget();
                synchronized (c2852m1) {
                    while (!c2852m1.f11320x) {
                        c2852m1.wait();
                    }
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e5);
            }
        }
    }
}
