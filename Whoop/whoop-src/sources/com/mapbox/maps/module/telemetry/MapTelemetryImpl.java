package com.mapbox.maps.module.telemetry;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.C2990b0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Event;
import com.mapbox.common.EventPriority;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.EventsServiceInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryCollectionState;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.common.TurnstileEvent;
import com.mapbox.common.UserSKUIdentifier;
import com.mapbox.maps.C5538l;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.module.MapTelemetry;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u0019\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;", "Lcom/mapbox/maps/module/MapTelemetry;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lcom/mapbox/common/EventsServiceInterface;", "eventsService", "Lcom/mapbox/common/TelemetryService;", "telemetryService", "Lcom/mapbox/common/EventsServerOptions;", "eventsServerOptions", "Lbc3/z;", "defaultCoroutineDispatcher", "(Landroid/content/Context;Lcom/mapbox/common/EventsServiceInterface;Lcom/mapbox/common/TelemetryService;Lcom/mapbox/common/EventsServerOptions;Lbc3/z;)V", "Ll83/a0;", "sendMapLoadEvent", "()V", "", "shouldSendEvents", "()Z", "", NotificationCompat.CATEGORY_EVENT, "sendEvent", "(Ljava/lang/String;)V", "enabled", "enableTelemetryCollection", "(Z)V", "onAppUserTurnstileEvent", "setUserTelemetryRequestState", "disableTelemetrySession", "Landroid/os/Bundle;", "data", "onPerformanceEvent", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "Lcom/mapbox/common/EventsServiceInterface;", "Lcom/mapbox/common/TelemetryService;", "eventsServiceOptions", "Lcom/mapbox/common/EventsServerOptions;", "Lbc3/c0;", "bgScope", "Lbc3/c0;", "Companion", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapTelemetryImpl implements MapTelemetry {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapTelemetryImpl";
    private final Context appContext;
    private final InterfaceC2994c0 bgScope;
    private final EventsServiceInterface eventsService;
    private final EventsServerOptions eventsServiceOptions;
    private final TelemetryService telemetryService;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;", "", "()V", "TAG", "", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1 */
    @InterfaceC32271e(m100429c = "com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1", m100430f = "MapTelemetryImpl.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55401 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C55401(InterfaceC30057d<? super C55401> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MapTelemetryImpl.this.new C55401(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C55401) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                MapLoadEvent mapLoadEventBuildMapLoadEvent = MapEventFactory.INSTANCE.buildMapLoadEvent(new PhoneState(MapTelemetryImpl.this.appContext));
                MapTelemetryImpl mapTelemetryImpl = MapTelemetryImpl.this;
                String json = new Gson().toJson(mapLoadEventBuildMapLoadEvent);
                AbstractC22676k.m65749i(json, "Gson().toJson(mapLoadEvent)");
                mapTelemetryImpl.sendEvent(json);
            } catch (Throwable th3) {
                MapboxLogger.logW(MapTelemetryImpl.TAG, "sendMapLoadEvent error: " + th3);
            }
            return C23454a0.f92919a;
        }
    }

    public MapTelemetryImpl(Context appContext) {
        AbstractC22676k.m65750j(appContext, "appContext");
        this.appContext = appContext;
        EventsServerOptions eventsServerOptions = new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null);
        this.eventsServiceOptions = eventsServerOptions;
        EventsService orCreate = EventsService.getOrCreate(eventsServerOptions);
        AbstractC22676k.m65749i(orCreate, "getOrCreate(eventsServiceOptions)");
        this.eventsService = orCreate;
        TelemetryService orCreate2 = TelemetryService.getOrCreate();
        AbstractC22676k.m65749i(orCreate2, "getOrCreate()");
        this.telemetryService = orCreate2;
        InterfaceC30063j interfaceC30063jPlus = new C2990b0(TAG).plus(AbstractC3006f0.m8710d());
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.bgScope = AbstractC3006f0.m8708b(interfaceC30063jPlus.plus(ExecutorC22364d.f87316w));
    }

    private final void enableTelemetryCollection(boolean enabled) {
        TelemetryUtils.setEventsCollectionState(enabled, new C5538l(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableTelemetryCollection$lambda$3(Expected response) {
        AbstractC22676k.m65750j(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(TAG, "setEventsCollectionState error: " + response.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAppUserTurnstileEvent$lambda$0(Expected response) {
        AbstractC22676k.m65750j(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(TAG, "sendTurnstileEvent error: " + response.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String event) {
        Expected<String, Value> expectedFromJson = Value.fromJson(event);
        AbstractC22676k.m65749i(expectedFromJson, "fromJson(event)");
        Value value = expectedFromJson.getValue();
        Event event2 = value != null ? new Event(EventPriority.QUEUED, value, null) : null;
        if (event2 != null) {
            this.eventsService.sendEvent(event2, new C5538l(11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendEvent$lambda$2(Expected response) {
        AbstractC22676k.m65750j(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(TAG, "sendEvent error: " + response.getError());
        }
    }

    private final void sendMapLoadEvent() {
        AbstractC3006f0.m8732z(this.bgScope, null, null, new C55401(null), 3);
    }

    private final boolean shouldSendEvents() {
        return TelemetryUtils.getClientServerEventsCollectionState() != TelemetryCollectionState.TURNSTILE_EVENTS_ONLY;
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void disableTelemetrySession() {
        enableTelemetryCollection(false);
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onAppUserTurnstileEvent() {
        this.eventsService.sendTurnstileEvent(new TurnstileEvent(UserSKUIdentifier.MAPS_MAUS), new C5538l(10));
        if (shouldSendEvents()) {
            sendMapLoadEvent();
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onPerformanceEvent(Bundle data) {
        if (shouldSendEvents()) {
            MapEventFactory mapEventFactory = MapEventFactory.INSTANCE;
            PhoneState phoneState = new PhoneState(this.appContext);
            String strM31995n = AbstractC11895b.m31995n("randomUUID().toString()");
            if (data == null) {
                data = new Bundle();
            }
            String json = new Gson().toJson(mapEventFactory.buildPerformanceEvent(phoneState, strM31995n, data));
            AbstractC22676k.m65749i(json, "Gson().toJson(performanceEvent)");
            sendEvent(json);
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void setUserTelemetryRequestState(boolean enabled) {
        enableTelemetryCollection(enabled);
    }

    public MapTelemetryImpl(Context appContext, EventsServiceInterface eventsService, TelemetryService telemetryService, EventsServerOptions eventsServerOptions, AbstractC3076z defaultCoroutineDispatcher) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(eventsService, "eventsService");
        AbstractC22676k.m65750j(telemetryService, "telemetryService");
        AbstractC22676k.m65750j(eventsServerOptions, "eventsServerOptions");
        AbstractC22676k.m65750j(defaultCoroutineDispatcher, "defaultCoroutineDispatcher");
        this.appContext = appContext;
        this.eventsService = eventsService;
        this.telemetryService = telemetryService;
        this.eventsServiceOptions = eventsServerOptions;
        this.bgScope = AbstractC3006f0.m8708b(new C2990b0(TAG).plus(AbstractC3006f0.m8710d()).plus(defaultCoroutineDispatcher));
    }
}
