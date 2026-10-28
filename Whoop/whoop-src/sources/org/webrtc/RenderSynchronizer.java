package org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f13) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(TimeUnit.SECONDS.toNanos(1L) / f13);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new RunnableC28292n(this, 1));
        Logging.m85621d(TAG, "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new ChoreographerFrameCallbackC28293o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisplayRefreshCycleBegin(long j7) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.m85621d(TAG, "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new ChoreographerFrameCallbackC28293o(this));
                long j13 = j7 - this.lastOpenedTimeNanos;
                long j14 = j7 - this.lastRefreshTimeNanos;
                this.lastRefreshTimeNanos = j7;
                if (Math.abs(j13 - this.targetFrameIntervalNanos) < Math.abs((j13 - this.targetFrameIntervalNanos) + j14)) {
                    this.lastOpenedTimeNanos = j7;
                    openRenderWindow();
                } else if (this.renderWindowOpen) {
                    closeRenderWindow();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1L : 0L);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.m85621d(TAG, "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new RunnableC28292n(this, 0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(DEFAULT_TARGET_FPS);
    }
}
