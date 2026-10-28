package bv;

import android.app.Activity;
import android.media.AudioTrack;
import android.os.Handler;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorType;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import io.sentry.android.core.ScreenshotEventProcessor;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.RunnableC0533c;
import p085d9.C11793j;
import p085d9.C11807x;
import p299l9.C23537y;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;
import sn.C32763v;
import sn.C32770z;
import sn.InterfaceC32722a0;

/* JADX INFO: renamed from: bv.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC3666a implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f14914E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14915w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14916x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14917y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f14918z;

    public /* synthetic */ RunnableC3666a(MapboxStyleManager mapboxStyleManager, String str, C3668c c3668c, Date date) {
        this.f14915w = 1;
        this.f14916x = mapboxStyleManager;
        this.f14917y = str;
        this.f14918z = c3668c;
        this.f14914E = date;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Throwable th3;
        Expected<String, None> styleGeoJSONSourceData;
        String error;
        switch (this.f14915w) {
            case 0:
                MapboxStyleManager style = (MapboxStyleManager) this.f14916x;
                C3668c c3668c = (C3668c) this.f14918z;
                String dataId = (String) this.f14917y;
                GeoJSONSourceData geoJSONSourceData = (GeoJSONSourceData) this.f14914E;
                AbstractC22676k.m65750j(style, "$style");
                AbstractC22676k.m65750j(dataId, "$dataId");
                String message = null;
                try {
                    styleGeoJSONSourceData = style.setStyleGeoJSONSourceData(c3668c.f8259a, dataId, geoJSONSourceData);
                    th3 = null;
                } catch (Throwable th4) {
                    th3 = th4;
                    styleGeoJSONSourceData = null;
                }
                if ((styleGeoJSONSourceData == null || !styleGeoJSONSourceData.isError()) && th3 == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dataId", dataId);
                StringBuilder sb4 = new StringBuilder("setStyleGeoJSONSourceData error: ");
                if (styleGeoJSONSourceData != null && (error = styleGeoJSONSourceData.getError()) != null) {
                    message = error;
                } else if (th3 != null) {
                    message = th3.getMessage();
                }
                sb4.append(message);
                jSONObject.put("message", sb4.toString());
                String string = jSONObject.toString();
                AbstractC22676k.m65749i(string, "JSONObject().apply {\n   …\")\n          }.toString()");
                Date date = new Date();
                MapboxLogger.logE("GeoJsonSource", string);
                ((Handler) c3668c.f14926h.getValue()).post(new RunnableC3666a(style, string, c3668c, date));
                return;
            case 1:
                MapboxStyleManager style2 = (MapboxStyleManager) this.f14916x;
                String str = (String) this.f14917y;
                C3668c c3668c2 = (C3668c) this.f14918z;
                Date date2 = (Date) this.f14914E;
                AbstractC22676k.m65750j(style2, "$style");
                style2.getMapLoadingErrorDelegate().sendMapLoadingError(new MapLoadingError(MapLoadingErrorType.SOURCE, str, c3668c2.f8259a, null, date2));
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f14916x;
                C31624i c31624i = (C31624i) this.f14918z;
                Handler handler = (Handler) this.f14917y;
                C11793j c11793j = (C11793j) this.f14914E;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (c31624i != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0533c(19, c31624i, c11793j));
                    }
                    synchronized (C11807x.f38334j0) {
                        try {
                            int i13 = C11807x.f38336l0 - 1;
                            C11807x.f38336l0 = i13;
                            if (i13 == 0) {
                                C11807x.f38335k0.shutdown();
                                C11807x.f38335k0 = null;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th6) {
                    if (c31624i != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0533c(19, c31624i, c11793j));
                    }
                    synchronized (C11807x.f38334j0) {
                        try {
                            int i14 = C11807x.f38336l0 - 1;
                            C11807x.f38336l0 = i14;
                            if (i14 == 0) {
                                C11807x.f38335k0.shutdown();
                                C11807x.f38335k0 = null;
                            }
                            throw th6;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
            case 3:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.f14916x;
                AtomicReference atomicReference = (AtomicReference) this.f14918z;
                Activity activity = (Activity) this.f14917y;
                CountDownLatch countDownLatch = (CountDownLatch) this.f14914E;
                screenshotEventProcessor.getClass();
                try {
                    atomicReference.set(screenshotEventProcessor.m55900a(activity));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                ((InterfaceC32722a0) this.f14918z).mo91084G(((C32770z) this.f14916x).f136275a, (C32763v) this.f14917y, (C23537y) this.f14914E);
                return;
        }
    }

    public /* synthetic */ RunnableC3666a(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f14915w = i13;
        this.f14916x = obj;
        this.f14918z = obj2;
        this.f14917y = obj3;
        this.f14914E = obj4;
    }
}
