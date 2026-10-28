package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p012ab.C0680g0;
import p047c9.C4316g;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11036e;
import p503tp.AbstractC34036g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001/\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\r\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "Landroid/content/Context;", "context", "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "<init>", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "Landroid/os/Looper;", "createFusedLocationClientHandler", "()Landroid/os/Looper;", "Ll83/a0;", "quitFusedLocationClientHandler", "()V", "doStart", "doStop", "Landroid/content/Intent;", "intent", "", "Lcom/mapbox/common/location/Location;", "extractResult", "(Landroid/content/Intent;)Ljava/util/List;", "Lcom/mapbox/common/location/GetLocationCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "getLastLocation", "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;", "Landroid/app/PendingIntent;", "pendingIntent", "requestLocationUpdates", "(Landroid/app/PendingIntent;)V", "removeLocationUpdates", "", "getName", "()Ljava/lang/String;", "toString", "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "fusedLocationProviderClient", "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;)V", "getFusedLocationProviderClient$annotations", "Landroid/os/HandlerThread;", "fusedLocationClientHandlerThread", "Landroid/os/HandlerThread;", "com/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1", "locationCallback", "Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;", "", "persistentId", "I", "getPersistentId", "()I", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GoogleDeviceLocationProvider extends BaseDeviceLocationProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GoogleDeviceLocationProvider";
    private HandlerThread fusedLocationClientHandlerThread;
    private ProxyGoogleFusedLocationProviderClient fusedLocationProviderClient;
    private final GoogleDeviceLocationProvider$locationCallback$1 locationCallback;
    private final int persistentId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "isAvailable", "", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAvailable() throws IncompatibleGooglePlayServicesLocationVersion {
            return LocationServiceUtils.getGooglePlayServicesBundled() && ProxyGoogleFusedLocationProviderClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionStatus.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$doStart$1 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54251 extends AbstractC22680m implements Function1 {
        final /* synthetic */ C22669g0 $pendingMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54251(C22669g0 c22669g0) {
            super(1);
            this.$pendingMode = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Void r10) {
            FeatureTelemetryCounter.create("common/location/googleProviderStarted").increment();
            GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
            if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STARTING) {
                googleDeviceLocationProvider.setCurrentMode((BaseDeviceLocationProvider.DeviceLocationProviderMode) this.$pendingMode.f89336w);
                GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Started location updates with mode " + GoogleDeviceLocationProvider.this.getCurrentMode());
            } else {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleDeviceLocationProvider.TAG, "Skipped start state change: current state is " + GoogleDeviceLocationProvider.this.state);
            }
            LocationUpdatesReceiver.INSTANCE.addDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId(), GoogleDeviceLocationProvider.this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$doStop$1 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54261 extends AbstractC22680m implements Function1 {
        public C54261() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Void r10) {
            GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
            if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING) {
                googleDeviceLocationProvider.quitFusedLocationClientHandler();
                GoogleDeviceLocationProvider.this.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
                GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
            } else {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Skipped stop state change: current state is " + GoogleDeviceLocationProvider.this.state);
            }
            LocationUpdatesReceiver.INSTANCE.removeDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId());
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$removeLocationUpdates$1 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54271 extends AbstractC22680m implements Function1 {
        public static final C54271 INSTANCE = new C54271();

        public C54271() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Void r10) {
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update removed");
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$requestLocationUpdates$1 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54281 extends AbstractC22680m implements Function1 {
        public static final C54281 INSTANCE = new C54281();

        public C54281() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Void r10) {
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update requested");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1] */
    public GoogleDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        super(context, locationProviderRequest);
        AbstractC22676k.m65750j(context, "context");
        this.fusedLocationProviderClient = new ProxyGoogleFusedLocationProviderClient(context);
        this.locationCallback = new AbstractC34036g() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1
            @Override // p503tp.AbstractC34036g
            public void onLocationResult(LocationResult result) {
                AbstractC22676k.m65750j(result, "result");
                GoogleDeviceLocationProvider googleDeviceLocationProvider = this.this$0;
                List list = result.f20590w;
                AbstractC22676k.m65749i(list, "result.locations");
                List<android.location.Location> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (android.location.Location it : list2) {
                    AbstractC22676k.m65749i(it, "it");
                    arrayList.add(LocationServiceUtils.toCommonLocation(it));
                }
                googleDeviceLocationProvider.notifyLocationUpdate(arrayList);
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.GOOGLE_PLAY_SERVICES.name(), String.valueOf(locationProviderRequest));
    }

    private final Looper createFusedLocationClientHandler() {
        HandlerThread handlerThread = new HandlerThread("fusedLocationClientHandlerThread");
        this.fusedLocationClientHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.fusedLocationClientHandlerThread;
        if (handlerThread2 != null) {
            return handlerThread2.getLooper();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$0(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$1(PermissionStatus permission, GoogleDeviceLocationProvider this$0, C22669g0 pendingMode, Exception exception) {
        AbstractC22676k.m65750j(permission, "$permission");
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(pendingMode, "$pendingMode");
        AbstractC22676k.m65750j(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: " + exception);
        if (permission == PermissionStatus.DENIED) {
            FeatureTelemetryCounter.create("common/location/googleProviderNoPermissions").increment();
        } else {
            FeatureTelemetryCounter.create("common/location/googleProviderFailed").increment();
        }
        this$0.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        if (pendingMode.f89336w == BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK) {
            this$0.quitFusedLocationClientHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$2(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$3(GoogleDeviceLocationProvider this$0, Exception exception) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: " + exception);
        this$0.quitFusedLocationClientHandler();
    }

    public static /* synthetic */ void getFusedLocationProviderClient$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$6(BaseDeviceLocationProvider.LocationCancelable cancelable, GetLocationCallback callback, Task it) {
        AbstractC22676k.m65750j(cancelable, "$cancelable");
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(it, "it");
        cancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1(it, cancelable, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quitFusedLocationClientHandler() {
        HandlerThread handlerThread = this.fusedLocationClientHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$10(Exception exception) {
        AbstractC22676k.m65750j(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to remove location updates: " + exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$9(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$7(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$8(Exception exception) {
        AbstractC22676k.m65750j(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to request location updates: " + exception);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStart() {
        LocationRequest locationRequestM15625b;
        Task<Void> taskRequestLocationUpdates;
        Task taskAddOnSuccessListener;
        Expected<LocationError, LocationRequest> locationRequest;
        try {
            LocationProviderRequest request = getRequest();
            if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestM15625b = locationRequest.getValue()) == null) {
                locationRequestM15625b = LocationRequest.m15625b();
            }
            final PermissionStatus permissionStatus = LocationServiceUtils.getPermissionStatus(getContext());
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Permission status: " + permissionStatus);
            final C22669g0 c22669g0 = new C22669g0();
            c22669g0.f89336w = BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE;
            int i13 = WhenMappings.$EnumSwitchMapping$0[permissionStatus.ordinal()];
            if (i13 == 1 || i13 == 2) {
                c22669g0.f89336w = BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK;
                taskRequestLocationUpdates = this.fusedLocationProviderClient.requestLocationUpdates(locationRequestM15625b, this.locationCallback, createFusedLocationClientHandler());
            } else if (i13 == 3) {
                c22669g0.f89336w = BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT;
                taskRequestLocationUpdates = this.fusedLocationProviderClient.requestLocationUpdates(locationRequestM15625b, getLocationUpdatePendingIntent());
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                taskRequestLocationUpdates = new FailedTask<>(new Exception("Cannot start Google device location provider: permission denied"));
            }
            if (taskRequestLocationUpdates != null && (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new C5432a(new C54251(c22669g0), 2))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new InterfaceC11036e() { // from class: com.mapbox.common.location.b
                    @Override // p073cq.InterfaceC11036e
                    /* JADX INFO: renamed from: n */
                    public final void mo1681n(Exception exc) {
                        GoogleDeviceLocationProvider.doStart$lambda$1(permissionStatus, this, c22669g0, exc);
                    }
                });
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public synchronized void doStop() {
        Task<Void> taskRemoveLocationUpdates;
        Task taskAddOnSuccessListener;
        try {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "doStop() called with currentMode: " + getCurrentMode());
            int i13 = WhenMappings.$EnumSwitchMapping$1[getCurrentMode().ordinal()];
            if (i13 == 1) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
            } else if (i13 == 2) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(getLocationUpdatePendingIntent());
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                taskRemoveLocationUpdates = new FailedTask<>(new Exception("Cannot stop Google device location provider. Invalid mode: " + getCurrentMode()));
            }
            if (taskRemoveLocationUpdates != null && (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new C5432a(new C54261(), 1))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new C0680g0(this, 15));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        Parcelable.Creator<LocationResult> creator = LocationResult.CREATOR;
        LocationResult locationResult = !intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") ? null : (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        if (locationResult == null) {
            return C25271y.f99162w;
        }
        List list = locationResult.f20590w;
        AbstractC22676k.m65749i(list, "locationResult.locations");
        List<android.location.Location> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (android.location.Location location : list2) {
            AbstractC22676k.m65749i(location, "location");
            arrayList.add(LocationServiceUtils.toCommonLocation(location));
        }
        return arrayList;
    }

    public final ProxyGoogleFusedLocationProviderClient getFusedLocationProviderClient() {
        return this.fusedLocationProviderClient;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(final GetLocationCallback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        final BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        Task<android.location.Location> lastLocation = this.fusedLocationProviderClient.getLastLocation();
        if (lastLocation != null) {
            lastLocation.addOnCompleteListener(new InterfaceC11035d() { // from class: com.mapbox.common.location.c
                @Override // p073cq.InterfaceC11035d
                /* JADX INFO: renamed from: q */
                public final void mo944q(Task task) {
                    GoogleDeviceLocationProvider.getLastLocation$lambda$6(locationCancelable, callback, task);
                }
            });
        }
        return locationCancelable;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return "mapbox-google";
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Task taskAddOnSuccessListener;
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        Task<Void> taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
        if (taskRemoveLocationUpdates == null || (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new C5432a(C54271.INSTANCE, 0))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new C4316g(12));
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        LocationRequest locationRequestM15625b;
        Task taskAddOnSuccessListener;
        Expected<LocationError, LocationRequest> locationRequest;
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        LocationProviderRequest request = getRequest();
        if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestM15625b = locationRequest.getValue()) == null) {
            locationRequestM15625b = LocationRequest.m15625b();
        }
        Task<Void> taskRequestLocationUpdates = this.fusedLocationProviderClient.requestLocationUpdates(locationRequestM15625b, pendingIntent);
        if (taskRequestLocationUpdates == null || (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new C5432a(C54281.INSTANCE, 3))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new C4316g(13));
    }

    public final void setFusedLocationProviderClient(ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient) {
        AbstractC22676k.m65750j(proxyGoogleFusedLocationProviderClient, "<set-?>");
        this.fusedLocationProviderClient = proxyGoogleFusedLocationProviderClient;
    }

    public String toString() {
        return "GoogleDeviceLocationProvider(" + getPersistentId() + "): [request: " + getRequest() + ']';
    }
}
