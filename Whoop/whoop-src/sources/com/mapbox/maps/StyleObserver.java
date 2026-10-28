package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J7\u0010\u0018\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020!H\u0016¢\u0006\u0004\b\u001f\u0010\"J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020#H\u0016¢\u0006\u0004\b\u001f\u0010$J\r\u0010%\u001a\u00020\u0010¢\u0006\u0004\b%\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R&\u00104\u001a\b\u0012\u0004\u0012\u0002030,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010.\u0012\u0004\b7\u0010\u0012\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m65681d2 = {"Lcom/mapbox/maps/StyleObserver;", "Lcom/mapbox/maps/StyleLoadedCallback;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "Lcom/mapbox/maps/StyleManager;", "styleManager", "Lcom/mapbox/maps/Style$OnStyleLoaded;", "styleLoadedListener", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "", "pixelRatio", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "mapLoadingErrorDelegate", "<init>", "(Lcom/mapbox/maps/StyleManager;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/NativeObserver;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "Ll83/a0;", "onStyleSourcesReady", "()V", "onStyleSpritesReady", "userOnStyleLoaded", "styleDataStyleLoadedListener", "styleDataSpritesLoadedListener", "styleDataSourcesLoadedListener", "setLoadStyleListener", "(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "loadedListener", "addGetStyleListener", "(Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "Lcom/mapbox/maps/StyleLoaded;", "eventData", "run", "(Lcom/mapbox/maps/StyleLoaded;)V", "Lcom/mapbox/maps/MapLoadingError;", "(Lcom/mapbox/maps/MapLoadingError;)V", "Lcom/mapbox/maps/StyleDataLoaded;", "(Lcom/mapbox/maps/StyleDataLoaded;)V", "onDestroy", "Lcom/mapbox/maps/StyleManager;", "Lcom/mapbox/maps/Style$OnStyleLoaded;", "Lcom/mapbox/maps/NativeObserver;", "F", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "userStyleLoadedListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getStyleListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/Style;", "loadedStyle", "Lcom/mapbox/maps/Style;", "preLoadedStyle", "Lcom/mapbox/common/Cancelable;", "cancelableList", "getCancelableList", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "getCancelableList$annotations", "", "isWaitingStyleDataStyleEvent", "()Z", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StyleObserver implements StyleLoadedCallback, MapLoadingErrorCallback, StyleDataLoadedCallback {
    public static final String TAG = "Mbgl-StyleObserver";
    private final CopyOnWriteArraySet<Cancelable> cancelableList;
    private final CopyOnWriteArraySet<Style.OnStyleLoaded> getStyleListeners;
    private Style loadedStyle;
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final NativeObserver nativeObserver;
    private final float pixelRatio;
    private Style preLoadedStyle;
    private Style.OnStyleLoaded styleDataSourcesLoadedListener;
    private Style.OnStyleLoaded styleDataSpritesLoadedListener;
    private Style.OnStyleLoaded styleDataStyleLoadedListener;
    private final Style.OnStyleLoaded styleLoadedListener;
    private final StyleManager styleManager;
    private Style.OnStyleLoaded userStyleLoadedListener;

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleDataLoadedType.values().length];
            try {
                iArr[StyleDataLoadedType.STYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleDataLoadedType.SPRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleDataLoadedType.SOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StyleObserver(StyleManager styleManager, Style.OnStyleLoaded styleLoadedListener, NativeObserver nativeObserver, float f13, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        AbstractC22676k.m65750j(styleManager, "styleManager");
        AbstractC22676k.m65750j(styleLoadedListener, "styleLoadedListener");
        AbstractC22676k.m65750j(nativeObserver, "nativeObserver");
        AbstractC22676k.m65750j(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.styleManager = styleManager;
        this.styleLoadedListener = styleLoadedListener;
        this.nativeObserver = nativeObserver;
        this.pixelRatio = f13;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
        this.getStyleListeners = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<Cancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableList = copyOnWriteArraySet;
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleLoaded$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeMapLoadingError$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this, null, null, 6, null));
    }

    public static /* synthetic */ void getCancelableList$annotations() {
    }

    private final boolean isWaitingStyleDataStyleEvent() {
        return this.styleDataStyleLoadedListener != null;
    }

    private final void onStyleSourcesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSourcesLoadedListener;
        if (onStyleLoaded != null) {
            C23454a0 c23454a0 = null;
            this.styleDataSourcesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                MapboxLogger.logE(TAG, "Style is not initialized yet although SOURCES event has arrived!");
            }
        }
    }

    private final void onStyleSpritesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSpritesLoadedListener;
        if (onStyleLoaded != null) {
            C23454a0 c23454a0 = null;
            this.styleDataSpritesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                MapboxLogger.logE(TAG, "Style is not initialized yet although SPRITES event has arrived!");
            }
        }
    }

    public static /* synthetic */ void setLoadStyleListener$default(StyleObserver styleObserver, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i13 & 8) != 0) {
            onStyleLoaded4 = null;
        }
        styleObserver.setLoadStyleListener(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    public final void addGetStyleListener(Style.OnStyleLoaded loadedListener) {
        AbstractC22676k.m65750j(loadedListener, "loadedListener");
        this.getStyleListeners.add(loadedListener);
    }

    public final CopyOnWriteArraySet<Cancelable> getCancelableList() {
        return this.cancelableList;
    }

    public final void onDestroy() {
        this.userStyleLoadedListener = null;
        this.styleDataStyleLoadedListener = null;
        this.styleDataSpritesLoadedListener = null;
        this.styleDataSourcesLoadedListener = null;
        Style style = this.preLoadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        this.preLoadedStyle = null;
        Style style2 = this.loadedStyle;
        if (style2 != null) {
            style2.markInvalid$maps_sdk_release();
        }
        this.loadedStyle = null;
        this.getStyleListeners.clear();
        Iterator<T> it = this.cancelableList.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableList.clear();
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded eventData) {
        AbstractC22676k.m65750j(eventData, "eventData");
        Style style = this.loadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        Style style2 = this.preLoadedStyle;
        this.loadedStyle = style2;
        if (style2 == null) {
            throw new MapboxMapException("Style is not initialized on onStyleLoaded callback!");
        }
        onStyleSpritesReady();
        onStyleSourcesReady();
        this.styleLoadedListener.onStyleLoaded(style2);
        Style.OnStyleLoaded onStyleLoaded = this.userStyleLoadedListener;
        if (onStyleLoaded != null) {
            this.userStyleLoadedListener = null;
            onStyleLoaded.onStyleLoaded(style2);
        }
        Iterator<T> it = this.getStyleListeners.iterator();
        while (it.hasNext()) {
            ((Style.OnStyleLoaded) it.next()).onStyleLoaded(style2);
        }
        this.getStyleListeners.clear();
    }

    public final void setLoadStyleListener(Style.OnStyleLoaded userOnStyleLoaded, Style.OnStyleLoaded styleDataStyleLoadedListener, Style.OnStyleLoaded styleDataSpritesLoadedListener, Style.OnStyleLoaded styleDataSourcesLoadedListener) {
        AbstractC22676k.m65750j(styleDataStyleLoadedListener, "styleDataStyleLoadedListener");
        this.nativeObserver.resubscribeStyleLoadListeners();
        this.userStyleLoadedListener = userOnStyleLoaded;
        this.styleDataStyleLoadedListener = styleDataStyleLoadedListener;
        this.styleDataSpritesLoadedListener = styleDataSpritesLoadedListener;
        this.styleDataSourcesLoadedListener = styleDataSourcesLoadedListener;
    }

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public void run(MapLoadingError eventData) {
        AbstractC22676k.m65750j(eventData, "eventData");
        MapboxLogger.logE(TAG, "OnMapLoadError: " + eventData.getType() + ", message: " + eventData.getMessage() + ", sourceID: " + eventData.getSourceId() + ", tileID: " + eventData.getTileId());
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded eventData) {
        AbstractC22676k.m65750j(eventData, "eventData");
        int i13 = WhenMappings.$EnumSwitchMapping$0[eventData.getType().ordinal()];
        if (i13 == 1) {
            Style style = new Style(this.styleManager, this.pixelRatio, this.mapLoadingErrorDelegate);
            Style.OnStyleLoaded onStyleLoaded = this.styleDataStyleLoadedListener;
            if (onStyleLoaded != null) {
                onStyleLoaded.onStyleLoaded(style);
            }
            this.preLoadedStyle = style;
            this.styleDataStyleLoadedListener = null;
            return;
        }
        if (i13 != 2) {
            if (i13 == 3 && !isWaitingStyleDataStyleEvent()) {
                onStyleSourcesReady();
                return;
            }
            return;
        }
        if (isWaitingStyleDataStyleEvent()) {
            return;
        }
        onStyleSpritesReady();
    }
}
