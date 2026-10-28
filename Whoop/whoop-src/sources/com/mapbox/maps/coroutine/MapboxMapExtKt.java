package com.mapbox.maps.coroutine;

import bc3.AbstractC3050q0;
import bc3.C3033m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FeatureExtensionValue;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.QueryFeatureExtensionCallback;
import com.mapbox.maps.QueryFeatureStateCallback;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13022c;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hc3.AbstractC17182o;
import java.util.List;
import kc3.C22365e;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p505ts.AbstractC34132o;
import p534uu.InterfaceC35232a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\n\u001aC\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a?\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a7\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aG\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a!\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(*\u00020\u00002\u0006\u0010'\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010+\u001aQ\u00106\u001a\u00020/*\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u000105H\u0087@ø\u0001\u0000¢\u0006\u0004\b6\u00107\"\u001b\u0010;\u001a\b\u0012\u0004\u0012\u0002080(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010:\"\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020?0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010:\"\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020B0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010:\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020E0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010:\"$\u0010L\u001a\b\u0012\u0004\u0012\u00020H0(*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010:\"\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020M0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010:\"\u001b\u0010R\u001a\b\u0012\u0004\u0012\u00020P0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010:\"\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020S0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010:\"\u001b\u0010X\u001a\b\u0012\u0004\u0012\u00020V0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010:\"\u001b\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bZ\u0010:\"\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b]\u0010:\"\u001b\u0010a\u001a\b\u0012\u0004\u0012\u00020_0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010:\"\u001b\u0010d\u001a\b\u0012\u0004\u0012\u00020b0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bc\u0010:\"\u001b\u0010g\u001a\b\u0012\u0004\u0012\u00020e0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, m65681d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/Style;", "awaitStyle", "(Lcom/mapbox/maps/MapboxMap;Lq83/d;)Ljava/lang/Object;", "Luu/a;", "styleExtension", "awaitLoadStyle", "(Lcom/mapbox/maps/MapboxMap;Luu/a;Lq83/d;)Ljava/lang/Object;", "", "style", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/FeatureExtensionValue;", "getGeoJsonClusterLeaves", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLq83/d;)Ljava/lang/Object;", "getGeoJsonClusterChildren", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lq83/d;)Ljava/lang/Object;", "getGeoJsonClusterExpansionZoom", "sourceId", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", "getFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "stateKey", "Lcom/mapbox/bindgen/None;", "removeFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "resetFeatureStates", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "state", "setFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lq83/d;)Ljava/lang/Object;", "eventName", "Lec3/l;", "Lcom/mapbox/maps/GenericEvent;", "genericEvents", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lec3/l;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", "cameraForCoordinates", "(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/MapLoaded;", "getMapLoadedEvents", "(Lcom/mapbox/maps/MapboxMap;)Lec3/l;", "mapLoadedEvents", "Lcom/mapbox/maps/MapLoadingError;", "getMapLoadingErrorEvents", "mapLoadingErrorEvents", "Lcom/mapbox/maps/StyleLoaded;", "getStyleLoadedEvents", "styleLoadedEvents", "Lcom/mapbox/maps/StyleDataLoaded;", "getStyleDataLoadedEvents", "styleDataLoadedEvents", "Lcom/mapbox/maps/CameraChanged;", "getCameraChangedEvents", "cameraChangedEvents", "Lcom/mapbox/maps/CameraChangedCoalesced;", "getCameraChangedCoalescedEvents", "getCameraChangedCoalescedEvents$annotations", "(Lcom/mapbox/maps/MapboxMap;)V", "cameraChangedCoalescedEvents", "Lcom/mapbox/maps/MapIdle;", "getMapIdleEvents", "mapIdleEvents", "Lcom/mapbox/maps/SourceAdded;", "getSourceAddedEvents", "sourceAddedEvents", "Lcom/mapbox/maps/SourceRemoved;", "getSourceRemovedEvents", "sourceRemovedEvents", "Lcom/mapbox/maps/SourceDataLoaded;", "getSourceDataLoadedEvents", "sourceDataLoadedEvents", "Lcom/mapbox/maps/StyleImageMissing;", "getStyleImageMissingEvents", "styleImageMissingEvents", "Lcom/mapbox/maps/StyleImageRemoveUnused;", "getStyleImageRemoveUnusedEvents", "styleImageRemoveUnusedEvents", "Lcom/mapbox/maps/RenderFrameStarted;", "getRenderFrameStartedEvents", "renderFrameStartedEvents", "Lcom/mapbox/maps/RenderFrameFinished;", "getRenderFrameFinishedEvents", "renderFrameFinishedEvents", "Lcom/mapbox/maps/ResourceRequest;", "getResourceRequestEvents", "resourceRequestEvents", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxMapExtKt {

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1 */
    @InterfaceC32271e(m100429c = "com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1", m100430f = "MapboxMapExt.kt", m100431l = {424}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lcom/mapbox/maps/GenericEvent;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55061 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $eventName;
        final /* synthetic */ MapboxMap $this_genericEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1$1, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
        public /* synthetic */ class AnonymousClass1 extends C22672i implements InterfaceC4339a {
            public AnonymousClass1(Object obj) {
                super(0, 0, Cancelable.class, obj, "cancel", "cancel()V");
            }

            @Override // c93.InterfaceC4339a
            public /* bridge */ /* synthetic */ Object invoke() {
                m134092invoke();
                return C23454a0.f92919a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m134092invoke() {
                ((Cancelable) this.receiver).cancel();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55061(MapboxMap mapboxMap, String str, InterfaceC30057d<? super C55061> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_genericEvents = mapboxMap;
            this.$eventName = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C55061 c55061 = new C55061(this.$this_genericEvents, this.$eventName, interfaceC30057d);
            c55061.L$0 = obj;
            return c55061;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C55061) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.L$0;
                NativeObserver nativeObserver = this.$this_genericEvents.getNativeObserver();
                String str = this.$eventName;
                C5520a c5520a = new C5520a(interfaceC11936u);
                C11935t c11935t = (C11935t) interfaceC11936u;
                c11935t.getClass();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(nativeObserver.subscribeGenericEvent(str, c5520a, new MapboxMapExtKt$genericEvents$1$cancelable$2(c11935t)));
                this.label = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, anonymousClass1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public static final Object awaitLoadStyle(MapboxMap mapboxMap, InterfaceC35232a interfaceC35232a, InterfaceC30057d interfaceC30057d) {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        mapboxMap.loadStyle(interfaceC35232a, new MapboxMapExtKt$awaitLoadStyle$2$1(c30065l));
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    public static final Object awaitStyle(MapboxMap mapboxMap, InterfaceC30057d interfaceC30057d) {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        mapboxMap.getStyle(new MapboxMapExtKt$awaitStyle$2$1(c30065l));
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    @InterfaceC23457c
    public static final Object cameraForCoordinates(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, InterfaceC30057d interfaceC30057d) {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        mapboxMap.cameraForCoordinates(list, cameraOptions, edgeInsets, d3, screenCoordinate, new MapboxMapExtKt$cameraForCoordinates$2$1(c30065l));
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    public static /* synthetic */ Object cameraForCoordinates$default(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i13 & 8) != 0) {
            d3 = null;
        }
        if ((i13 & 16) != 0) {
            screenCoordinate = null;
        }
        return cameraForCoordinates(mapboxMap, list, cameraOptions, edgeInsets, d3, screenCoordinate, interfaceC30057d);
    }

    @MapboxExperimental
    public static final InterfaceC13058l genericEvents(MapboxMap mapboxMap, String eventName) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        AbstractC22676k.m65750j(eventName, "eventName");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new C55061(mapboxMap, eventName, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getCameraChangedCoalescedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$cameraChangedCoalescedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static /* synthetic */ void getCameraChangedCoalescedEvents$annotations(MapboxMap mapboxMap) {
    }

    public static final InterfaceC13058l getCameraChangedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$cameraChangedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final Object getFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getFeatureState(str, str2, str3, new QueryFeatureStateCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getFeatureState$2$1
            @Override // com.mapbox.maps.QueryFeatureStateCallback
            public final void run(Expected<String, Value> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static /* synthetic */ Object getFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return getFeatureState(mapboxMap, str, str2, str3, interfaceC30057d);
    }

    public static final Object getGeoJsonClusterChildren(MapboxMap mapboxMap, String str, Feature feature, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterChildren(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterChildren$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static final Object getGeoJsonClusterExpansionZoom(MapboxMap mapboxMap, String str, Feature feature, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterExpansionZoom(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static final Object getGeoJsonClusterLeaves(MapboxMap mapboxMap, String str, Feature feature, long j7, long j13, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterLeaves(str, feature, j7, j13, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterLeaves$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static final InterfaceC13058l getMapIdleEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$mapIdleEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getMapLoadedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$mapLoadedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getMapLoadingErrorEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$mapLoadingErrorEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getRenderFrameFinishedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$renderFrameFinishedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getRenderFrameStartedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$renderFrameStartedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getResourceRequestEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$resourceRequestEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getSourceAddedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$sourceAddedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getSourceDataLoadedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$sourceDataLoadedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getSourceRemovedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$sourceRemovedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getStyleDataLoadedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$styleDataLoadedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getStyleImageMissingEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$styleImageMissingEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getStyleImageRemoveUnusedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$styleImageRemoveUnusedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final InterfaceC13058l getStyleLoadedEvents(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new MapboxMapExtKt$styleLoadedEvents$1(mapboxMap, null));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36599i(AbstractC13091v.m36580F(c13022cM36600j, AbstractC17182o.f65999a.mo8825s()), -1, 2);
    }

    public static final Object removeFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, String str4, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.removeFeatureState(str, str2, str3, str4, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$removeFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static /* synthetic */ Object removeFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, String str4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        return removeFeatureState(mapboxMap, str, str2, str3, str4, interfaceC30057d);
    }

    public static final Object resetFeatureStates(MapboxMap mapboxMap, String str, String str2, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.resetFeatureStates(str, str2, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$resetFeatureStates$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static /* synthetic */ Object resetFeatureStates$default(MapboxMap mapboxMap, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return resetFeatureStates(mapboxMap, str, str2, interfaceC30057d);
    }

    public static final Object setFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, Value value, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.setFeatureState(str, str2, str3, value, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$setFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static /* synthetic */ Object setFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, Value value, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return setFeatureState(mapboxMap, str, str2, str3, value, interfaceC30057d);
    }

    public static final Object awaitLoadStyle(MapboxMap mapboxMap, String str, InterfaceC30057d interfaceC30057d) {
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        mapboxMap.loadStyle(str, new MapboxMapExtKt$awaitLoadStyle$4$1(c30065l));
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }
}
