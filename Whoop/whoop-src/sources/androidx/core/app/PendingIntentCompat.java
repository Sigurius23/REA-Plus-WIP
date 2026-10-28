package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import live.hms.video.utils.AndroidSDKConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class PendingIntentCompat {

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int i13, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i13, intent, onFinished, handler, str, bundle);
        }
    }

    public static class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int i13, Intent intent, int i14) {
            return PendingIntent.getForegroundService(context, i13, intent, i14);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        public GatedCallback(PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i13, String str, Bundle bundle) {
            boolean z4 = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i13 = i13;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th3) {
                    if (!z4) {
                        throw th3;
                    }
                    Thread.currentThread().interrupt();
                    throw th3;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i13, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.b
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i13, String str, Bundle bundle) {
                    this.f5263a.onSendFinished(pendingIntent, intent, i13, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    private static int addMutabilityFlags(boolean z4, int i13) {
        int i14;
        if (!z4) {
            i14 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i13;
            }
            i14 = AndroidSDKConstants.FLAG_MUTABLE;
        }
        return i14 | i13;
    }

    public static PendingIntent getActivities(Context context, int i13, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i14, Bundle bundle, boolean z4) {
        return PendingIntent.getActivities(context, i13, intentArr, addMutabilityFlags(z4, i14), bundle);
    }

    public static PendingIntent getActivity(Context context, int i13, Intent intent, int i14, boolean z4) {
        return PendingIntent.getActivity(context, i13, intent, addMutabilityFlags(z4, i14));
    }

    public static PendingIntent getBroadcast(Context context, int i13, Intent intent, int i14, boolean z4) {
        return PendingIntent.getBroadcast(context, i13, intent, addMutabilityFlags(z4, i14));
    }

    public static PendingIntent getForegroundService(Context context, int i13, Intent intent, int i14, boolean z4) {
        return Api26Impl.getForegroundService(context, i13, intent, addMutabilityFlags(z4, i14));
    }

    public static PendingIntent getService(Context context, int i13, Intent intent, int i14, boolean z4) {
        return PendingIntent.getService(context, i13, intent, addMutabilityFlags(z4, i14));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, int i13, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i13, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th3) {
            try {
                gatedCallback.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static PendingIntent getActivities(Context context, int i13, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i14, boolean z4) {
        return PendingIntent.getActivities(context, i13, intentArr, addMutabilityFlags(z4, i14));
    }

    public static PendingIntent getActivity(Context context, int i13, Intent intent, int i14, Bundle bundle, boolean z4) {
        return PendingIntent.getActivity(context, i13, intent, addMutabilityFlags(z4, i14), bundle);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i13, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, i13, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i13, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            Api23Impl.send(pendingIntent, context, i13, intent, onFinished, handler, str, bundle);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th3) {
            try {
                gatedCallback.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
