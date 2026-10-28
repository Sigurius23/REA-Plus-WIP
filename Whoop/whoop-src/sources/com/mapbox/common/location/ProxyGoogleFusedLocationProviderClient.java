package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.movement.GoogleActivityRecognition;
import java.lang.reflect.Method;
import l83.InterfaceC23462h;
import p503tp.AbstractC34036g;
import p503tp.AbstractC34037h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0015J\u0015\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m65681d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/location/LocationRequest;", "request", "Ltp/g;", "callback", "Landroid/os/Looper;", "looper", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "requestLocationUpdates", "(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;", "Landroid/app/PendingIntent;", "pendingIntent", "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;", "removeLocationUpdates", "(Ltp/g;)Lcom/google/android/gms/tasks/Task;", "(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;", "Landroid/location/Location;", "getLastLocation", "()Lcom/google/android/gms/tasks/Task;", "googleFusedLocationProviderClient", "Ljava/lang/Object;", "getGoogleFusedLocationProviderClient", "()Ljava/lang/Object;", "setGoogleFusedLocationProviderClient", "(Ljava/lang/Object;)V", "getGoogleFusedLocationProviderClient$annotations", "()V", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ProxyGoogleFusedLocationProviderClient {
    private static final String GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT = "com.google.android.gms.location.FusedLocationProviderClient";
    private static Method getLastLocation;
    public static Method removeLocationUpdatesCallback;
    public static Method removeLocationUpdatesPendingIntent;
    public static Method requestLocationUpdatesCallback;
    public static Method requestLocationUpdatesPendingIntent;
    private Object googleFusedLocationProviderClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h available$delegate = AbstractC30060g.m92088H(ProxyGoogleFusedLocationProviderClient$Companion$available$2.INSTANCE);

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0014\u0010\n\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR(\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0018\u0010\n\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001b\u0010\u001f\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\n¨\u0006$"}, m65681d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;", "", "<init>", "()V", "", "verifyAndCacheMethods$common_release", "()Z", "verifyAndCacheMethods", "Ljava/lang/reflect/Method;", "requestLocationUpdatesCallback", "Ljava/lang/reflect/Method;", "getRequestLocationUpdatesCallback", "()Ljava/lang/reflect/Method;", "setRequestLocationUpdatesCallback", "(Ljava/lang/reflect/Method;)V", "getRequestLocationUpdatesCallback$annotations", "requestLocationUpdatesPendingIntent", "getRequestLocationUpdatesPendingIntent", "setRequestLocationUpdatesPendingIntent", "getRequestLocationUpdatesPendingIntent$annotations", "removeLocationUpdatesCallback", "getRemoveLocationUpdatesCallback", "setRemoveLocationUpdatesCallback", "getRemoveLocationUpdatesCallback$annotations", "removeLocationUpdatesPendingIntent", "getRemoveLocationUpdatesPendingIntent", "setRemoveLocationUpdatesPendingIntent", "getRemoveLocationUpdatesPendingIntent$annotations", "available$delegate", "Ll83/h;", "getAvailable$common_release", "available", "", "GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT", "Ljava/lang/String;", "getLastLocation", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRemoveLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRemoveLocationUpdatesPendingIntent$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesPendingIntent$annotations() {
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleFusedLocationProviderClient.available$delegate.getValue()).booleanValue();
        }

        public final Method getRemoveLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            AbstractC22676k.m65757q("removeLocationUpdatesCallback");
            throw null;
        }

        public final Method getRemoveLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            AbstractC22676k.m65757q("removeLocationUpdatesPendingIntent");
            throw null;
        }

        public final Method getRequestLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            AbstractC22676k.m65757q("requestLocationUpdatesCallback");
            throw null;
        }

        public final Method getRequestLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            AbstractC22676k.m65757q("requestLocationUpdatesPendingIntent");
            throw null;
        }

        public final void setRemoveLocationUpdatesCallback(Method method) {
            AbstractC22676k.m65750j(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback = method;
        }

        public final void setRemoveLocationUpdatesPendingIntent(Method method) {
            AbstractC22676k.m65750j(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent = method;
        }

        public final void setRequestLocationUpdatesCallback(Method method) {
            AbstractC22676k.m65750j(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback = method;
        }

        public final void setRequestLocationUpdatesPendingIntent(Method method) {
            AbstractC22676k.m65750j(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent = method;
        }

        public final boolean verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesLocationVersion {
            try {
                if (FusedLocationProviderClient.class.isInterface()) {
                    FeatureTelemetryCounter.create("common/location/googlePlay21").increment();
                } else {
                    FeatureTelemetryCounter.create("common/location/googlePlay18to20").increment();
                }
                Companion companion = ProxyGoogleFusedLocationProviderClient.INSTANCE;
                Method method = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, AbstractC34036g.class, Looper.class);
                AbstractC22676k.m65749i(method, "getMethod(\n             …ss.java\n                )");
                companion.setRequestLocationUpdatesCallback(method);
                Method method2 = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, PendingIntent.class);
                AbstractC22676k.m65749i(method2, "getMethod(\n             …s.java,\n                )");
                companion.setRequestLocationUpdatesPendingIntent(method2);
                Method method3 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", AbstractC34036g.class);
                AbstractC22676k.m65749i(method3, "getMethod(\n             …s.java,\n                )");
                companion.setRemoveLocationUpdatesCallback(method3);
                Method method4 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", PendingIntent.class);
                AbstractC22676k.m65749i(method4, "getMethod(\n             …ss.java\n                )");
                companion.setRemoveLocationUpdatesPendingIntent(method4);
                Method method5 = FusedLocationProviderClient.class.getMethod("getLastLocation", null);
                AbstractC22676k.m65749i(method5, "getMethod(\"getLastLocation\")");
                ProxyGoogleFusedLocationProviderClient.getLastLocation = method5;
                return true;
            } catch (ClassNotFoundException e5) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required class not found: " + e5.getMessage());
                return false;
            } catch (NoSuchMethodException e13) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not found: " + e13.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            } catch (SecurityException e14) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not accessible: " + e14.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            }
        }

        private Companion() {
        }
    }

    public ProxyGoogleFusedLocationProviderClient(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C4975f c4975f = AbstractC34037h.f142695a;
        this.googleFusedLocationProviderClient = new FusedLocationProviderClient(context);
    }

    public static /* synthetic */ void getGoogleFusedLocationProviderClient$annotations() {
    }

    public final Object getGoogleFusedLocationProviderClient() {
        return this.googleFusedLocationProviderClient;
    }

    public final Task<android.location.Location> getLastLocation() {
        try {
            Method method = getLastLocation;
            if (method != null) {
                return (Task) method.invoke(this.googleFusedLocationProviderClient, null);
            }
            AbstractC22676k.m65757q("getLastLocation");
            throw null;
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> removeLocationUpdates(AbstractC34036g callback) {
        AbstractC22676k.m65750j(callback, "callback");
        try {
            return (Task) INSTANCE.getRemoveLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, callback);
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> requestLocationUpdates(LocationRequest request, AbstractC34036g callback, Looper looper) throws IllegalStateException {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(callback, "callback");
        try {
            return (Task) INSTANCE.getRequestLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, request, callback, looper);
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final void setGoogleFusedLocationProviderClient(Object obj) {
        AbstractC22676k.m65750j(obj, "<set-?>");
        this.googleFusedLocationProviderClient = obj;
    }

    public final Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        try {
            return (Task) INSTANCE.getRemoveLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, pendingIntent);
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> requestLocationUpdates(LocationRequest request, PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        try {
            return (Task) INSTANCE.getRequestLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, request, pendingIntent);
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }
}
