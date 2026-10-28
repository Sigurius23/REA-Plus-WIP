package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxLogger;
import p028b4.RunnableC2690a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u0012\u0004\b#\u0010\u0013R\u0014\u0010'\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lcom/mapbox/maps/renderer/RenderHandlerThread;", "", "", "mapName", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "Ll83/a0;", "task", "post", "(Lc93/a;)V", "", "delayMillis", "postDelayed", "(Lc93/a;J)V", "Landroid/os/Handler;", "start", "()Landroid/os/Handler;", "stop", "()V", "clearRenderEventQueue", "handlerThreadName", "Ljava/lang/String;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$maps_sdk_release", "()Landroid/os/HandlerThread;", "getHandlerThread$maps_sdk_release$annotations", "handler", "Landroid/os/Handler;", "getHandler$maps_sdk_release", "setHandler$maps_sdk_release", "(Landroid/os/Handler;)V", "TAG", "getTAG$annotations", "", "isRunning$maps_sdk_release", "()Z", "isRunning", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class RenderHandlerThread {
    private final String TAG;
    private volatile Handler handler;
    private final HandlerThread handlerThread;
    private final String handlerThreadName;

    public RenderHandlerThread(String mapName) {
        AbstractC22676k.m65750j(mapName, "mapName");
        String strConcat = !AbstractC39414r.m125890i0(mapName) ? "MbxRender".concat(mapName) : "MapboxRenderThread";
        this.handlerThreadName = strConcat;
        this.handlerThread = new HandlerThread(strConcat, -4);
        StringBuilder sb4 = new StringBuilder("Mbgl-");
        sb4.append(strConcat);
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? "\\".concat(mapName) : "");
        this.TAG = sb4.toString();
    }

    public static /* synthetic */ void getHandlerThread$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postDelayed$lambda$1$lambda$0(InterfaceC4339a tmp0) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void clearRenderEventQueue() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: getHandler$maps_sdk_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: getHandlerThread$maps_sdk_release, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    public final boolean isRunning$maps_sdk_release() {
        return this.handler != null && this.handlerThread.isAlive();
    }

    public final void post(InterfaceC4339a task) {
        AbstractC22676k.m65750j(task, "task");
        postDelayed(task, 0L);
    }

    public final void postDelayed(InterfaceC4339a task, long delayMillis) {
        AbstractC22676k.m65750j(task, "task");
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessageDelayed(Message.obtain(handler, new RunnableC2690a(task, 3)), delayMillis);
            return;
        }
        MapboxLogger.logW(this.TAG, "Thread " + this.handlerThreadName + " was not started, ignoring event");
    }

    public final void setHandler$maps_sdk_release(Handler handler) {
        this.handler = handler;
    }

    public final Handler start() {
        this.handlerThread.start();
        Handler handler = new Handler(this.handlerThread.getLooper());
        this.handler = handler;
        return handler;
    }

    public final void stop() {
        this.handlerThread.quit();
        this.handler = null;
    }
}
