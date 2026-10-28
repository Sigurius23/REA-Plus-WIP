package p454r9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.view.Surface;
import mo.HandlerThreadC25722c;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: r9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C31081f extends Surface {

    /* JADX INFO: renamed from: E */
    public static boolean f128184E;

    /* JADX INFO: renamed from: z */
    public static int f128185z;

    /* JADX INFO: renamed from: w */
    public final boolean f128186w;

    /* JADX INFO: renamed from: x */
    public final HandlerThreadC25722c f128187x;

    /* JADX INFO: renamed from: y */
    public boolean f128188y;

    public C31081f(HandlerThreadC25722c handlerThreadC25722c, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f128187x = handlerThreadC25722c;
        this.f128186w = z4;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m95738b(Context context) {
        String strEglQueryString;
        int i13;
        try {
            if (!f128184E) {
                int i14 = AbstractC38065t.f163031a;
                if (i14 >= 24 && ((i14 >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && ((i14 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i13 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i13 = 0;
                }
                f128185z = i13;
                f128184E = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f128185z != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f128187x) {
            try {
                if (!this.f128188y) {
                    HandlerThreadC25722c handlerThreadC25722c = this.f128187x;
                    handlerThreadC25722c.f101333x.getClass();
                    handlerThreadC25722c.f101333x.sendEmptyMessage(2);
                    this.f128188y = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
