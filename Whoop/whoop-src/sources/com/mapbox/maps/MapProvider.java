package com.mapbox.maps;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2990b0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import p047c9.C4316g;
import p127ev.C13667h;
import p127ev.C13668i;
import p127ev.C13670k;
import p405pu.EnumC29546b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J-\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020'¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u0010\u0003R\u0016\u00102\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lcom/mapbox/maps/MapProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lpu/b;", "type", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/maps/MapView;", "Lcom/mapbox/maps/MapController;", "getController", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "Lcom/mapbox/maps/MapClient;", "mapClient", "Lcom/mapbox/maps/NativeMapImpl;", "getNativeMapWrapper", "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;", "mapView", "Lcom/mapbox/maps/Map;", "getNativeMapCore", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/Map;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "", "pixelRatio", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "mapController", "Lcom/mapbox/maps/module/MapTelemetry;", "telemetry", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "mapGeofencingConsent", "Lev/k;", "getMapPluginRegistry", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)Lev/k;", "getMapTelemetryInstance", "(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;", "getMapGeofencingConsent", "()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "Ll83/a0;", "flushPendingEvents", "mapTelemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "Lbc3/c0;", "mainScope", "Lbc3/c0;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapProvider {
    public static final MapProvider INSTANCE = new MapProvider();
    private static final InterfaceC2994c0 mainScope;
    private static MapTelemetry mapTelemetry;

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29546b.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapProvider$getMapTelemetryInstance$2 */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpu/b;", "it", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "invoke", "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54772 extends AbstractC22680m implements Function1 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54772(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final ModuleProviderArgument[] invoke(EnumC29546b it) {
            AbstractC22676k.m65750j(it, "it");
            return MapProvider.INSTANCE.paramsProvider(this.$context, EnumC29546b.MapTelemetry);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapProvider$getMapTelemetryInstance$3 */
    @InterfaceC32271e(m100429c = "com.mapbox.maps.MapProvider$getMapTelemetryInstance$3", m100430f = "MapProvider.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54783 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C54783(InterfaceC30057d<? super C54783> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C54783(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C54783) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MapTelemetry mapTelemetry = MapProvider.mapTelemetry;
            if (mapTelemetry != null) {
                mapTelemetry.onAppUserTurnstileEvent();
                return C23454a0.f92919a;
            }
            AbstractC22676k.m65757q("mapTelemetry");
            throw null;
        }
    }

    static {
        InterfaceC30063j interfaceC30063jPlus = new C2990b0(MapController.TAG).plus(AbstractC3006f0.m8710d());
        C22365e c22365e = AbstractC3050q0.f12077a;
        mainScope = AbstractC3006f0.m8708b(interfaceC30063jPlus.plus(AbstractC17182o.f65999a));
    }

    private MapProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$1(Expected expected) {
        AbstractC22676k.m65750j(expected, "expected");
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(MapController.TAG, "EventsService flush error: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$3(Expected expected) {
        AbstractC22676k.m65750j(expected, "expected");
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(MapController.TAG, "TelemetryService flush error: ".concat(str));
        }
    }

    private final MapController getController(MapView mapView) {
        return mapView.getMapController$maps_sdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(Context context, EnumC29546b type) {
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, context.getApplicationContext())};
        }
        throw new IllegalArgumentException(type.name() + " module is not supported by the Maps SDK");
    }

    public final void flushPendingEvents() {
        EventsService.getOrCreate(new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null)).flush(new C4316g(17));
        TelemetryService.getOrCreate().flush(new C4316g(18));
    }

    public final MapGeofencingConsent getMapGeofencingConsent() {
        return new MapGeofencingConsentImpl();
    }

    public final C13670k getMapPluginRegistry(MapboxMap mapboxMap, MapController mapController, MapTelemetry telemetry, MapGeofencingConsent mapGeofencingConsent) {
        AbstractC22676k.m65750j(mapboxMap, "mapboxMap");
        AbstractC22676k.m65750j(mapController, "mapController");
        AbstractC22676k.m65750j(telemetry, "telemetry");
        AbstractC22676k.m65750j(mapGeofencingConsent, "mapGeofencingConsent");
        C13668i c13668i = new C13668i();
        c13668i.f48454a = mapboxMap;
        c13668i.f48455b = mapboxMap;
        c13668i.f48456c = mapboxMap;
        c13668i.f48457d = mapboxMap;
        c13668i.f48461h = AbstractC30060g.m92088H(new C13667h(c13668i, telemetry, mapGeofencingConsent, 0));
        c13668i.f48462i = mapController;
        c13668i.f48458e = mapboxMap;
        c13668i.f48459f = mapboxMap;
        c13668i.f48460g = mapboxMap;
        return new C13670k(c13668i);
    }

    public final MapTelemetry getMapTelemetryInstance(Context context) {
        AbstractC22676k.m65750j(context, "context");
        if (mapTelemetry == null) {
            mapTelemetry = (MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(EnumC29546b.MapTelemetry, new C54772(context));
        }
        AbstractC3006f0.m8732z(mainScope, null, null, new C54783(null), 3);
        MapTelemetry mapTelemetry2 = mapTelemetry;
        if (mapTelemetry2 != null) {
            return mapTelemetry2;
        }
        AbstractC22676k.m65757q("mapTelemetry");
        throw null;
    }

    public final MapboxMap getMapboxMap(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
        AbstractC22676k.m65750j(nativeMap, "nativeMap");
        AbstractC22676k.m65750j(nativeObserver, "nativeObserver");
        return MapboxMap.INSTANCE.invoke$maps_sdk_release(nativeMap, nativeObserver, pixelRatio);
    }

    public final Map getNativeMapCore(MapView mapView) {
        AbstractC22676k.m65750j(mapView, "mapView");
        return getController(mapView).getNativeMap().getMap();
    }

    public final NativeMapImpl getNativeMapWrapper(MapInitOptions mapInitOptions, MapClient mapClient) {
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        AbstractC22676k.m65750j(mapClient, "mapClient");
        return new NativeMapImpl(new Map(mapClient, mapInitOptions.getMapOptions()));
    }
}
