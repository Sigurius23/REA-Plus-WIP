package com.mapbox.maps.renderer;

import android.os.Handler;
import com.mapbox.maps.MapboxLogger;
import e93.AbstractC12889b;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u000eJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010\"\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010#R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R$\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R$\u00102\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u000e¨\u0006<"}, m65681d2 = {"Lcom/mapbox/maps/renderer/FpsManager;", "", "Landroid/os/Handler;", "handler", "", "mapName", "<init>", "(Landroid/os/Handler;Ljava/lang/String;)V", "", "frameTimeNs", "Ll83/a0;", "updateFrameStats", "(J)V", "onRenderingPaused", "()V", "", "userToScreenRefreshRateRatio", "", "performPacing", "(D)Z", "calculateFpsAndReset", "", "screenRefreshRate", "setScreenRefreshRate", "(I)V", "refreshRate", "setUserRefreshRate", "recorderStarted", "preRender", "(JZ)Z", "postRender", "onSurfaceDestroyed", "destroy", "Landroid/os/Handler;", "userRefreshRate", "I", "Ljava/lang/Double;", "screenRefreshPeriodNs", "J", "previousFrameTimeNs", "previousDrawnFrameIndex", "frameRenderTimeAccumulatedNs", "<set-?>", "skippedNow", "getSkippedNow", "()I", "preRenderTimeNs", "choreographerTicks", "choreographerSkips", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "fpsChangedListener", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "TAG", "Ljava/lang/String;", "getTAG$annotations", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class FpsManager {
    private static final boolean LOG_STATISTICS = false;
    private static final int SCREEN_METRICS_NOT_DEFINED = -1;
    private static final int USER_DEFINED_REFRESH_RATE_NOT_SET = -1;
    public static final int VSYNC_COUNT_TILL_IDLE = 3;
    private final String TAG;
    private int choreographerSkips;
    private int choreographerTicks;
    private OnFpsChangedListener fpsChangedListener;
    private long frameRenderTimeAccumulatedNs;
    private final Handler handler;
    private long preRenderTimeNs;
    private int previousDrawnFrameIndex;
    private long previousFrameTimeNs;
    private long screenRefreshPeriodNs;
    private int screenRefreshRate;
    private int skippedNow;
    private int userRefreshRate;
    private Double userToScreenRefreshRateRatio;
    private static final Object fpsManagerToken = new Object();
    private static final long ONE_SECOND_NS = (long) Math.pow(10.0d, 9.0d);
    private static final long ONE_MILLISECOND_NS = (long) Math.pow(10.0d, 6.0d);

    public FpsManager(Handler handler, String mapName) {
        AbstractC22676k.m65750j(handler, "handler");
        AbstractC22676k.m65750j(mapName, "mapName");
        this.handler = handler;
        this.userRefreshRate = -1;
        this.screenRefreshRate = -1;
        this.screenRefreshPeriodNs = -1L;
        this.previousFrameTimeNs = -1L;
        this.preRenderTimeNs = -1L;
        StringBuilder sb4 = new StringBuilder("Mbgl-FpsManager");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? "\\".concat(mapName) : "");
        this.TAG = sb4.toString();
    }

    private final void calculateFpsAndReset() {
        int i13 = this.choreographerTicks;
        if (i13 == 0) {
            return;
        }
        OnFpsChangedListener onFpsChangedListener = this.fpsChangedListener;
        if (onFpsChangedListener != null) {
            double d3 = (1.0d - (((double) this.choreographerSkips) / ((double) i13))) * ((double) this.screenRefreshRate);
            onFpsChangedListener.onFpsChanged(d3);
            int i14 = this.choreographerTicks;
            int i15 = this.choreographerSkips;
            if (i14 == i15) {
                String str = this.TAG;
                StringBuilder sbM8306s = AbstractC2875y.m8306s("VSYNC based FPS is ", d3, ", missed ");
                sbM8306s.append(this.choreographerSkips);
                sbM8306s.append(" out of ");
                sbM8306s.append(this.choreographerTicks);
                sbM8306s.append(" VSYNC pulses");
                MapboxLogger.logI(str, sbM8306s.toString());
            } else {
                double d14 = this.frameRenderTimeAccumulatedNs / ((double) (i14 - i15));
                String str2 = this.TAG;
                StringBuilder sbM8306s2 = AbstractC2875y.m8306s("VSYNC based FPS is ", d3, ", average core rendering time is ");
                sbM8306s2.append(d14 / ONE_MILLISECOND_NS);
                sbM8306s2.append(" ms (or ");
                sbM8306s2.append(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((this.screenRefreshPeriodNs / d14) * ((double) this.screenRefreshRate))}, 1)));
                sbM8306s2.append(" FPS), missed ");
                sbM8306s2.append(this.choreographerSkips);
                sbM8306s2.append(" out of ");
                sbM8306s2.append(this.choreographerTicks);
                sbM8306s2.append(" VSYNC pulses");
                MapboxLogger.logI(str2, sbM8306s2.toString());
            }
        }
        this.previousDrawnFrameIndex = 0;
        this.frameRenderTimeAccumulatedNs = 0L;
        this.choreographerTicks = 0;
        this.choreographerSkips = 0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRenderingPaused() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        calculateFpsAndReset();
        this.previousFrameTimeNs = -1L;
    }

    private final boolean performPacing(double userToScreenRefreshRateRatio) {
        int i13 = (int) (((double) this.choreographerTicks) * userToScreenRefreshRateRatio);
        if (i13 > this.previousDrawnFrameIndex) {
            this.previousDrawnFrameIndex = i13;
            return true;
        }
        this.choreographerSkips++;
        return false;
    }

    public static /* synthetic */ boolean preRender$default(FpsManager fpsManager, long j7, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return fpsManager.preRender(j7, z4);
    }

    private final void updateFrameStats(long frameTimeNs) {
        this.preRenderTimeNs = System.nanoTime();
        this.skippedNow = 0;
        long j7 = this.previousFrameTimeNs;
        if (j7 != -1) {
            long j13 = frameTimeNs - j7;
            long j14 = this.screenRefreshPeriodNs;
            long j15 = ONE_MILLISECOND_NS;
            if (j13 > j14 + j15) {
                int i13 = (int) ((frameTimeNs - j7) / (j14 + j15));
                this.skippedNow = i13;
                this.choreographerSkips += i13;
            }
        }
        this.previousFrameTimeNs = frameTimeNs;
        this.choreographerTicks = this.skippedNow + 1 + this.choreographerTicks;
    }

    public final void destroy() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        this.fpsChangedListener = null;
    }

    /* JADX INFO: renamed from: getFpsChangedListener$maps_sdk_release, reason: from getter */
    public final OnFpsChangedListener getFpsChangedListener() {
        return this.fpsChangedListener;
    }

    public final int getSkippedNow() {
        return this.skippedNow;
    }

    public final void onSurfaceDestroyed() {
        onRenderingPaused();
    }

    public final void postRender() {
        this.frameRenderTimeAccumulatedNs += System.nanoTime() - this.preRenderTimeNs;
        if (this.choreographerTicks >= this.screenRefreshRate) {
            calculateFpsAndReset();
        } else {
            Handler handler = this.handler;
            long j7 = (this.screenRefreshPeriodNs / ONE_MILLISECOND_NS) * ((long) 3);
            Object obj = fpsManagerToken;
            Runnable runnable = new Runnable() { // from class: com.mapbox.maps.renderer.FpsManager$postRender$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.onRenderingPaused();
                }
            };
            if (obj == null) {
                handler.postDelayed(runnable, j7);
            } else {
                handler.postDelayed(runnable, obj, j7);
            }
        }
        this.preRenderTimeNs = -1L;
    }

    public final boolean preRender(long frameTimeNs, boolean recorderStarted) {
        if (this.userToScreenRefreshRateRatio == null && this.fpsChangedListener == null && !recorderStarted) {
            return true;
        }
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        updateFrameStats(frameTimeNs);
        Double d3 = this.userToScreenRefreshRateRatio;
        if (d3 != null) {
            return performPacing(d3.doubleValue());
        }
        return true;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener = onFpsChangedListener;
    }

    public final void setScreenRefreshRate(int screenRefreshRate) {
        if (this.screenRefreshRate == screenRefreshRate) {
            return;
        }
        this.screenRefreshRate = screenRefreshRate;
        this.screenRefreshPeriodNs = ONE_SECOND_NS / ((long) screenRefreshRate);
        int i13 = this.userRefreshRate;
        if (i13 != -1) {
            this.userToScreenRefreshRateRatio = Double.valueOf(AbstractC12889b.m36282l(((double) i13) / ((double) screenRefreshRate), 0.0d, 1.0d));
            MapboxLogger.logI(this.TAG, "User defined ratio is " + this.userToScreenRefreshRateRatio);
        }
    }

    public final void setUserRefreshRate(int refreshRate) {
        if (this.userRefreshRate != refreshRate) {
            this.userRefreshRate = refreshRate;
            MapboxLogger.logI(this.TAG, "User set max FPS to " + this.userRefreshRate);
            int i13 = this.screenRefreshRate;
            if (i13 != -1) {
                this.userToScreenRefreshRateRatio = Double.valueOf(AbstractC12889b.m36282l(((double) this.userRefreshRate) / ((double) i13), 0.0d, 1.0d));
                MapboxLogger.logI(this.TAG, "User defined ratio is " + this.userToScreenRefreshRateRatio);
            }
        }
    }
}
