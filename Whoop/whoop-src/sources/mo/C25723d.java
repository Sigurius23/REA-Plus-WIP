package mo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.RunnableC24545c;

/* JADX INFO: renamed from: mo.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C25723d extends Surface {

    /* JADX INFO: renamed from: E */
    public static boolean f101336E;

    /* JADX INFO: renamed from: z */
    public static int f101337z;

    /* JADX INFO: renamed from: w */
    public final boolean f101338w;

    /* JADX INFO: renamed from: x */
    public final HandlerThreadC25722c f101339x;

    /* JADX INFO: renamed from: y */
    public boolean f101340y;

    public C25723d(HandlerThreadC25722c handlerThreadC25722c, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f101339x = handlerThreadC25722c;
        this.f101338w = z4;
    }

    /* JADX INFO: renamed from: b */
    public static int m75841b(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i13 = AbstractC24567y.f95875a;
        if (i13 >= 24 && ((i13 >= 26 || !("samsung".equals(AbstractC24567y.f95877c) || "XT1650".equals(AbstractC24567y.f95878d))) && ((i13 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i13 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized boolean m75842f(Context context) {
        try {
            if (!f101336E) {
                f101337z = m75841b(context);
                f101336E = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f101337z != 0;
    }

    /* JADX INFO: renamed from: h */
    public static C25723d m75843h(Context context, boolean z4) {
        boolean z13 = false;
        AbstractC24543a.m71573i(!z4 || m75842f(context));
        HandlerThreadC25722c handlerThreadC25722c = new HandlerThreadC25722c("ExoPlayer:DummySurface", 0);
        int i13 = z4 ? f101337z : 0;
        handlerThreadC25722c.start();
        Handler handler = new Handler(handlerThreadC25722c.getLooper(), handlerThreadC25722c);
        handlerThreadC25722c.f101333x = handler;
        handlerThreadC25722c.f101330E = new RunnableC24545c(handler);
        synchronized (handlerThreadC25722c) {
            handlerThreadC25722c.f101333x.obtainMessage(1, i13, 0).sendToTarget();
            while (((C25723d) handlerThreadC25722c.f101331F) == null && handlerThreadC25722c.f101335z == null && handlerThreadC25722c.f101334y == null) {
                try {
                    handlerThreadC25722c.wait();
                } catch (InterruptedException unused) {
                    z13 = true;
                }
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC25722c.f101335z;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC25722c.f101334y;
        if (error != null) {
            throw error;
        }
        C25723d c25723d = (C25723d) handlerThreadC25722c.f101331F;
        c25723d.getClass();
        return c25723d;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f101339x) {
            try {
                if (!this.f101340y) {
                    HandlerThreadC25722c handlerThreadC25722c = this.f101339x;
                    handlerThreadC25722c.f101333x.getClass();
                    handlerThreadC25722c.f101333x.sendEmptyMessage(2);
                    this.f101340y = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
