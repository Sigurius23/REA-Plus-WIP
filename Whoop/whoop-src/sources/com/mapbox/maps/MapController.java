package com.mapbox.maps;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.maps.assets.AssetManagerProvider;
import com.mapbox.maps.plugin.InvalidViewPluginHostException;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CoreGesturesHandler;
import e93.AbstractC12888a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import mv.InterfaceC25967f;
import p005a3.C0271z0;
import p012ab.C0680g0;
import p088dc.AbstractC11894a;
import p127ev.AbstractC13676q;
import p127ev.C13670k;
import p127ev.C13674o;
import p127ev.C13675p;
import p127ev.InterfaceC13660a;
import p127ev.InterfaceC13661b;
import p127ev.InterfaceC13666g;
import p127ev.InterfaceC13669j;
import p127ev.InterfaceC13671l;
import p127ev.InterfaceC13672m;
import p127ev.InterfaceC13678s;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p201hv.C17669a;
import p231iv.ViewOnClickListenerC20946g;
import p289kv.C22841d;
import p382ou.AbstractC28355a;
import p383ov.C28393o;
import p383ov.InterfaceC28381c;
import p439qv.C30644a;
import p439qv.C30646c;
import p439qv.C30648e;
import p439qv.ComponentCallbacks2C30645b;
import p470rv.C31833m;
import p535uv.C35279d;
import p595wv.C37648a;
import p627xv.C38666g;
import p694zv.C41161b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0004\u0081\u0001\u0082\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0007\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010%J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u0016¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b1\u00105J\u0017\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u001b2\u0006\u00104\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020#2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bJ\u0010IJ\u0017\u0010M\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020'H\u0000¢\u0006\u0004\bL\u00108J#\u0010R\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010O*\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010X\u001a\u00020\u001b2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bZ\u0010[J!\u0010]\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020\u00052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020TH\u0000¢\u0006\u0004\b_\u0010`R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010gR\u0014\u0010h\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010jR\u0014\u0010k\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bn\u0010o\u0012\u0004\bp\u0010\u001dR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR(\u0010v\u001a\u00020u8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b|\u0010\u001d\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0080\u0001R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u0083\u0001"}, m65681d2 = {"Lcom/mapbox/maps/MapController;", "Lmv/f;", "Lcom/mapbox/maps/MapControllable;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "renderer", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/ContextMode;", "contextMode", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lev/k;", "pluginRegistry", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "onStyleLoadingFinishedListener", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/ContextMode;Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/MapboxMap;Lev/k;Lcom/mapbox/maps/StyleDataLoadedCallback;)V", "getNativeMap", "()Lcom/mapbox/maps/NativeMapImpl;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "Ll83/a0;", "onStart", "()V", "onStop", "onDestroy", "onLowMemory", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onGenericMotionEvent", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "onSizeChanged", "(II)V", "Ljava/lang/Runnable;", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "refreshRate", "setScreenRefreshRate$maps_sdk_release", "setScreenRefreshRate", "Lev/j;", "T", "", "id", "getPlugin", "(Ljava/lang/String;)Lev/j;", "Lcom/mapbox/maps/MapView;", "mapView", "Lev/q;", "plugin", "createPlugin", "(Lcom/mapbox/maps/MapView;Lev/q;)V", "removePlugin", "(Ljava/lang/String;)V", "options", "initializePlugins", "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V", "onAttachedToWindow$maps_sdk_release", "(Lcom/mapbox/maps/MapView;)V", "onAttachedToWindow", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/NativeObserver;", "Lcom/mapbox/maps/MapInitOptions;", "Lcom/mapbox/maps/NativeMapImpl;", "_mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "Lev/k;", "styleDataLoadedCallback", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "getCameraChangedCoalescedCallback$annotations", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/common/Cancelable;", "cancelableSubscriberSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/MapController$LifecycleState;", "lifecycleState", "Lcom/mapbox/maps/MapController$LifecycleState;", "getLifecycleState$maps_sdk_release", "()Lcom/mapbox/maps/MapController$LifecycleState;", "setLifecycleState$maps_sdk_release", "(Lcom/mapbox/maps/MapController$LifecycleState;)V", "getLifecycleState$maps_sdk_release$annotations", "Lcom/mapbox/maps/Style;", "style", "Lcom/mapbox/maps/Style;", "Lcom/mapbox/maps/ContextMode;", "Companion", "LifecycleState", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapController implements InterfaceC25967f, MapControllable {
    private static final String PLUGIN_MISSING_TEMPLATE = "Add %s plugin dependency to the classpath take automatically load the plugin implementation.";
    public static final String TAG = "MapController";
    private static final String VIEW_HIERARCHY_MISSING_TEMPLATE = "%s plugin requires a View hierarchy to be injected, plugin is ignored.";
    private final MapboxMap _mapboxMap;
    private final CameraChangedCoalescedCallback cameraChangedCoalescedCallback;
    private final CopyOnWriteArraySet<Cancelable> cancelableSubscriberSet;
    private ContextMode contextMode;
    private LifecycleState lifecycleState;
    private final MapInitOptions mapInitOptions;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private final C13670k pluginRegistry;
    private final MapboxRenderer renderer;
    private Style style;
    private final StyleDataLoadedCallback styleDataLoadedCallback;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/mapbox/maps/MapController$LifecycleState;", "", "(Ljava/lang/String;I)V", "STATE_STOPPED", "STATE_STARTED", "STATE_DESTROYED", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum LifecycleState {
        STATE_STOPPED,
        STATE_STARTED,
        STATE_DESTROYED
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapController$addRendererSetupErrorListener$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54721 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ RendererSetupErrorListener $rendererSetupErrorListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54721(RendererSetupErrorListener rendererSetupErrorListener) {
            super(0);
            this.$rendererSetupErrorListener = rendererSetupErrorListener;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134082invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134082invoke() {
            MapController.this.getRenderer().getRenderThread$maps_sdk_release().getEglCore().addRendererStateListener$maps_sdk_release(this.$rendererSetupErrorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapController$addWidget$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54731 extends AbstractC22680m implements InterfaceC4339a {
        public C54731() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134083invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134083invoke() {
            MapController.this.getRenderer().scheduleRepaint();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapController$removeRendererSetupErrorListener$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54741 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ RendererSetupErrorListener $rendererSetupErrorListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54741(RendererSetupErrorListener rendererSetupErrorListener) {
            super(0);
            this.$rendererSetupErrorListener = rendererSetupErrorListener;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134084invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134084invoke() {
            MapController.this.getRenderer().getRenderThread$maps_sdk_release().getEglCore().removeRendererStateListener$maps_sdk_release(this.$rendererSetupErrorListener);
        }
    }

    public MapController(MapboxRenderer renderer, MapInitOptions mapInitOptions) {
        AbstractC22676k.m65750j(renderer, "renderer");
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        if (AbstractC39414r.m125890i0(MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.renderer = renderer;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = mapInitOptions.getMapOptions().getContextMode();
        MapboxLogger.logI(TAG, "Registering asset file source factory");
        new AssetManagerProvider().initialize(mapInitOptions.getContext().getAssets());
        MapProvider mapProvider = MapProvider.INSTANCE;
        NativeMapImpl nativeMapWrapper = mapProvider.getNativeMapWrapper(mapInitOptions, renderer);
        this.nativeMap = nativeMapWrapper;
        NativeObserver nativeObserver = new NativeObserver(nativeMapWrapper);
        this.nativeObserver = nativeObserver;
        this._mapboxMap = mapProvider.getMapboxMap(nativeMapWrapper, nativeObserver, mapInitOptions.getMapOptions().getPixelRatio());
        getMapboxMapDeprecated().setRenderHandler$maps_sdk_release(renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().getHandler());
        this.pluginRegistry = mapProvider.getMapPluginRegistry(getMapboxMapDeprecated(), this, mapProvider.getMapTelemetryInstance(mapInitOptions.getContext()), mapProvider.getMapGeofencingConsent());
        this.cameraChangedCoalescedCallback = new C5500b(this);
        this.styleDataLoadedCallback = new C5500b(this);
        renderer.setMap(nativeMapWrapper);
        CameraOptions cameraOptions = mapInitOptions.getCameraOptions();
        if (cameraOptions != null) {
            getMapboxMapDeprecated().setCamera(cameraOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MapController this$0, CameraChangedCoalesced it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        C13670k c13670k = this$0.pluginRegistry;
        CameraState cameraState = it.getCameraState();
        AbstractC22676k.m65749i(cameraState, "it.cameraState");
        c13670k.m38546a(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapController this$0, StyleDataLoaded eventData) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(eventData, "eventData");
        if (eventData.getType() == StyleDataLoadedType.STYLE) {
            this$0.getMapboxMapDeprecated().getStyle(new C5499a(this$0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2$lambda$1(MapController this$0, Style style) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(style, "style");
        this$0.style = style;
        Iterator it = this$0.pluginRegistry.f48469g.iterator();
        while (it.hasNext()) {
            ((InterfaceC13672m) it.next()).mo38548b(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(C13670k pluginRegistry, CameraChangedCoalesced it) {
        AbstractC22676k.m65750j(pluginRegistry, "$pluginRegistry");
        AbstractC22676k.m65750j(it, "it");
        CameraState cameraState = it.getCameraState();
        AbstractC22676k.m65749i(cameraState, "it.cameraState");
        pluginRegistry.m38546a(cameraState);
    }

    private static /* synthetic */ void getCameraChangedCoalescedCallback$annotations() {
    }

    public static /* synthetic */ void getLifecycleState$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void initializePlugins$default(MapController mapController, MapInitOptions mapInitOptions, MapView mapView, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            mapView = null;
        }
        mapController.initializePlugins(mapInitOptions, mapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$9(MapController this$0, int i13, int i14) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.renderer.onSurfaceChanged(i13, i14);
        this$0.nativeMap.setSizeSet$maps_sdk_release(true);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new C54721(rendererSetupErrorListener));
    }

    @Override // com.mapbox.maps.MapControllable
    public void addWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        if (this.contextMode != ContextMode.SHARED) {
            throw new RuntimeException("Map view or map surface must be init with MapInitOptions.mapOptions.contextMode = ContextMode.SHARED when using widgets!");
        }
        widget.setTriggerRepaintAction$maps_sdk_release(new C54731());
        this.renderer.getRenderThread$maps_sdk_release().addWidget(widget);
        this.renderer.scheduleRepaint();
    }

    public final void createPlugin(MapView mapView, AbstractC13676q plugin) throws InvalidViewPluginHostException {
        AbstractC22676k.m65750j(plugin, "plugin");
        C13670k c13670k = this.pluginRegistry;
        MapInitOptions mapInitOptions = this.mapInitOptions;
        LinkedHashMap linkedHashMap = c13670k.f48466d;
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        String str = plugin.f48472a;
        InterfaceC13669j interfaceC13669j = plugin.f48473b;
        if (interfaceC13669j == null) {
            throw new MapboxConfigurationException(AbstractC31061c.m95633i('!', "MapPlugin instance is missing for ", str));
        }
        if (linkedHashMap.containsKey(str)) {
            InterfaceC13669j interfaceC13669j2 = (InterfaceC13669j) linkedHashMap.get(str);
            if (interfaceC13669j2 != null) {
                interfaceC13669j2.initialize();
                return;
            }
            return;
        }
        boolean z4 = interfaceC13669j instanceof InterfaceC13678s;
        if (z4 && mapView == null) {
            String message = "Cause: " + interfaceC13669j.getClass();
            AbstractC22676k.m65750j(message, "message");
            throw new InvalidViewPluginHostException(message);
        }
        linkedHashMap.put(str, interfaceC13669j);
        interfaceC13669j.mo38545f(c13670k.f48463a);
        if (z4) {
            InterfaceC13678s interfaceC13678s = (InterfaceC13678s) interfaceC13669j;
            AbstractC22676k.m65747g(mapView);
            View viewMo38581g = interfaceC13678s.mo38581g(mapView, mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
            mapView.addView(viewMo38581g);
            interfaceC13678s.mo38580c(viewMo38581g);
        }
        if (interfaceC13669j instanceof InterfaceC13660a) {
            ((InterfaceC13660a) interfaceC13669j).mo38527e(mapInitOptions.getContext(), mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
        }
        if (interfaceC13669j instanceof InterfaceC13671l) {
            c13670k.f48470h.add(interfaceC13669j);
            C23465k c23465k = c13670k.f48465c;
            if (c23465k != null) {
                ((InterfaceC13671l) interfaceC13669j).onSizeChanged(((Number) c23465k.f92937w).intValue(), ((Number) c23465k.f92938x).intValue());
            }
        }
        if (interfaceC13669j instanceof InterfaceC13666g) {
            c13670k.f48467e.add(interfaceC13669j);
        }
        if (interfaceC13669j instanceof InterfaceC28381c) {
            c13670k.f48468f.add(interfaceC13669j);
        }
        if (interfaceC13669j instanceof InterfaceC13672m) {
            c13670k.f48469g.add(interfaceC13669j);
        }
        if (interfaceC13669j instanceof C30646c) {
            c13670k.f48471i = (C30646c) interfaceC13669j;
        }
        interfaceC13669j.initialize();
        if (c13670k.f48464b == 1 && (interfaceC13669j instanceof InterfaceC13661b)) {
            ((InterfaceC13661b) interfaceC13669j).onStart();
        }
    }

    /* JADX INFO: renamed from: getLifecycleState$maps_sdk_release, reason: from getter */
    public final LifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap, reason: from getter and merged with bridge method [inline-methods] */
    public MapboxMap getMapboxMapDeprecated() {
        return this._mapboxMap;
    }

    public final NativeMapImpl getNativeMap() {
        return this.nativeMap;
    }

    @Override // mv.InterfaceC25967f
    public <T extends InterfaceC13669j> T getPlugin(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        C13670k c13670k = this.pluginRegistry;
        c13670k.getClass();
        return (T) c13670k.f48466d.get(id4);
    }

    /* JADX INFO: renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public final MapboxRenderer getRenderer() {
        return this.renderer;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x000f A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void initializePlugins(MapInitOptions options, MapView mapView) {
        InterfaceC13669j c30646c;
        AbstractC22676k.m65750j(options, "options");
        for (AbstractC13676q abstractC13676q : options.getPlugins()) {
            try {
                String str = abstractC13676q.f48472a;
                switch (str.hashCode()) {
                    case -2043316830:
                        if (str.equals("MAPBOX_LIFECYCLE_PLUGIN_ID")) {
                            c30646c = new C30646c();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case -1778826934:
                        if (str.equals("MAPBOX_COMPASS_PLUGIN_ID")) {
                            c30646c = new C22841d();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case -1553017881:
                        if (str.equals("MAPBOX_ANNOTATION_PLUGIN_ID")) {
                            c30646c = new C17669a();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case -245209278:
                        if (str.equals("MAPBOX_GESTURES_PLUGIN_ID")) {
                            Context context = options.getContext();
                            AttributeSet attrs = options.getAttrs();
                            float pixelRatio = options.getMapOptions().getPixelRatio();
                            AbstractC22676k.m65750j(context, "context");
                            c30646c = attrs != null ? new C28393o(context, attrs, pixelRatio) : new C28393o(context, pixelRatio);
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case -229667997:
                        if (str.equals("MAPBOX_LOGO_PLUGIN_ID")) {
                            c30646c = new C35279d();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 571477697:
                        if (str.equals("MAPBOX_SCALEBAR_PLUGIN_ID")) {
                            c30646c = new C38666g();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 876236958:
                        if (str.equals("MAPBOX_VIEWPORT_PLUGIN_ID")) {
                            c30646c = new C41161b();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 962011255:
                        if (str.equals("MAPBOX_ATTRIBUTION_PLUGIN_ID")) {
                            c30646c = new ViewOnClickListenerC20946g();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 1272100549:
                        if (str.equals("MAPBOX_MAP_OVERLAY_PLUGIN_ID")) {
                            c30646c = new C37648a();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 1380638813:
                        if (str.equals("MAPBOX_CAMERA_PLUGIN_ID")) {
                            c30646c = new C14802h();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    case 1896827019:
                        if (str.equals("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID")) {
                            c30646c = new C31833m();
                        } else {
                            c30646c = abstractC13676q.f48473b;
                            if (c30646c != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                    default:
                        c30646c = abstractC13676q.f48473b;
                        if (c30646c != null) {
                            throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                        }
                        createPlugin(mapView, new C13674o(abstractC13676q.f48472a, c30646c));
                        if (!(abstractC13676q instanceof C13675p)) {
                            if (c30646c instanceof InterfaceC14795a) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((InterfaceC14795a) c30646c);
                            } else if (c30646c instanceof InterfaceC28381c) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((InterfaceC28381c) c30646c);
                            }
                        }
                        break;
                }
            } catch (InvalidViewPluginHostException unused) {
                MapboxLogger.logI(TAG, String.format(VIEW_HIERARCHY_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{abstractC13676q}, 1)));
            } catch (NoClassDefFoundError unused2) {
                MapboxLogger.logI(TAG, String.format(PLUGIN_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{abstractC13676q.f48472a}, 1)));
            }
        }
    }

    public final void onAttachedToWindow$maps_sdk_release(MapView mapView) {
        AbstractC22676k.m65750j(mapView, "mapView");
        C13670k c13670k = this.pluginRegistry;
        c13670k.getClass();
        if (c13670k.f48471i != null) {
            C30648e c30648e = new C30648e(mapView);
            ComponentCallbacks2C30645b componentCallbacks2C30645b = new ComponentCallbacks2C30645b(mapView);
            mapView.getContext().registerComponentCallbacks(componentCallbacks2C30645b);
            c30648e.f126066x.mo4986a(new C30644a(mapView, c30648e, mapView, componentCallbacks2C30645b));
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_DESTROYED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Iterator it = this.pluginRegistry.f48466d.entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC13669j) ((java.util.Map.Entry) it.next()).getValue()).mo38544a();
        }
        this.nativeObserver.onDestroy();
        this.renderer.onDestroy();
        getMapboxMapDeprecated().onDestroy$maps_sdk_release();
        this.style = null;
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        C13670k c13670k = this.pluginRegistry;
        c13670k.getClass();
        Iterator it = c13670k.f48468f.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                C28393o c28393o = (C28393o) ((InterfaceC28381c) it.next());
                c28393o.getClass();
                if ((event.getSource() & 2) == 2 && event.getActionMasked() == 8 && c28393o.f114558u0.f120674x) {
                    InterfaceC14795a interfaceC14795a = c28393o.f114522K;
                    if (interfaceC14795a == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((C14802h) interfaceC14795a).m42548b(AbstractC25265s.m74093D1(c28393o.f114523L));
                    float axisValue = event.getAxisValue(9);
                    MapboxMap mapboxMap = c28393o.f114520I;
                    if (mapboxMap == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    double zoom = mapboxMap.getCameraState().getZoom();
                    InterfaceC14795a interfaceC14795a2 = c28393o.f114522K;
                    if (interfaceC14795a2 == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    ScreenCoordinate screenCoordinateM42551i = ((C14802h) interfaceC14795a2).m42551i();
                    ScreenCoordinate screenCoordinateM31963l = AbstractC11894a.m31963l(event);
                    if (c28393o.f114522K == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    double dLog = (Math.log(axisValue) / AbstractC12888a.f44372a) + zoom;
                    InterfaceC14795a interfaceC14795a3 = c28393o.f114522K;
                    if (interfaceC14795a3 == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinateM31963l).zoom(Double.valueOf(dLog)).build();
                    AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().anchor(anchor).zoom(zoom).build()");
                    ((C14802h) interfaceC14795a3).m42550h(cameraOptionsBuild, C28393o.f114515v0, null);
                    InterfaceC14795a interfaceC14795a4 = c28393o.f114522K;
                    if (interfaceC14795a4 == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((C14802h) interfaceC14795a4).m42553k(screenCoordinateM42551i);
                } else if (z4) {
                }
                z4 = true;
            }
            return z4;
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapboxMapDeprecated().reduceMemoryUse();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w9, int h7) {
        this.nativeMap.setSizeSet$maps_sdk_release(false);
        this.renderer.queueRenderEvent(new RunnableC5502c(this, w9, h7, 0));
        C13670k c13670k = this.pluginRegistry;
        c13670k.getClass();
        c13670k.f48465c = new C23465k(Integer.valueOf(w9), Integer.valueOf(h7));
        Iterator it = c13670k.f48470h.iterator();
        while (it.hasNext()) {
            ((InterfaceC13671l) it.next()).onSizeChanged(w9, h7);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        String styleUri;
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STARTED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Style styleDeprecated = getMapboxMapDeprecated().getStyleDeprecated();
        if (styleDeprecated != null && !styleDeprecated.equals(this.style)) {
            this.style = styleDeprecated;
            Iterator it = this.pluginRegistry.f48469g.iterator();
            while (it.hasNext()) {
                ((InterfaceC13672m) it.next()).mo38548b(styleDeprecated);
            }
        }
        NativeObserver nativeObserver = this.nativeObserver;
        this.cancelableSubscriberSet.add(NativeObserver.subscribeCameraChangedCoalesced$default(nativeObserver, this.cameraChangedCoalescedCallback, null, 2, null));
        this.cancelableSubscriberSet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this.styleDataLoadedCallback, null, null, 6, null));
        this.renderer.onStart();
        if (!getMapboxMapDeprecated().getIsStyleLoadInitiated() && (styleUri = this.mapInitOptions.getStyleUri()) != null) {
            MapboxMap.loadStyle$default(getMapboxMapDeprecated(), styleUri, (Style.OnStyleLoaded) null, 2, (Object) null);
        }
        this.pluginRegistry.m38547b(1);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STOPPED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Iterator<T> it = this.cancelableSubscriberSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableSubscriberSet.clear();
        this.renderer.onStop();
        this.pluginRegistry.m38547b(2);
        MapProvider.INSTANCE.flushPendingEvents();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent event) {
        boolean z4;
        AbstractC22676k.m65750j(event, "event");
        Iterator it = this.pluginRegistry.f48468f.iterator();
        while (true) {
            boolean z13 = false;
            while (it.hasNext()) {
                C28393o c28393o = (C28393o) ((InterfaceC28381c) it.next());
                ArrayList arrayList = c28393o.f114553p0;
                Handler handler = c28393o.f114556s0;
                if (event.getButtonState() == 0 || event.getButtonState() == 1) {
                    if (event.getActionMasked() == 0) {
                        handler.removeCallbacksAndMessages(null);
                        c28393o.f114553p0.clear();
                        c28393o.m86083o(c28393o.f114551n0);
                        c28393o.m86083o(c28393o.f114552o0);
                    }
                    C20245d c20245d = c28393o.f114561y;
                    if (c20245d == null) {
                        AbstractC22676k.m65757q("gesturesManager");
                        throw null;
                    }
                    z4 = false;
                    for (AbstractC28355a abstractC28355a : (ArrayList) c20245d.f76046b) {
                        MotionEvent motionEvent = abstractC28355a.f114404e;
                        if (motionEvent != null) {
                            motionEvent.recycle();
                            abstractC28355a.f114404e = null;
                        }
                        MotionEvent motionEvent2 = abstractC28355a.f114403d;
                        if (motionEvent2 != null) {
                            abstractC28355a.f114404e = MotionEvent.obtain(motionEvent2);
                            abstractC28355a.f114403d.recycle();
                            abstractC28355a.f114403d = null;
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(event);
                        abstractC28355a.f114403d = motionEventObtain;
                        abstractC28355a.f114405f = motionEventObtain.getEventTime() - abstractC28355a.f114403d.getDownTime();
                        if (abstractC28355a.mo86028a(event)) {
                            z4 = true;
                        }
                    }
                    int actionMasked = event.getActionMasked();
                    if (actionMasked == 1) {
                        c28393o.m86078j();
                        CoreGesturesHandler coreGesturesHandler = c28393o.f114555r0;
                        if (coreGesturesHandler == null) {
                            AbstractC22676k.m65757q("coreGesturesHandler");
                            throw null;
                        }
                        coreGesturesHandler.notifyCoreTouchEnded();
                        if (!arrayList.isEmpty()) {
                            handler.removeCallbacksAndMessages(null);
                            InterfaceC14795a interfaceC14795a = c28393o.f114522K;
                            if (interfaceC14795a == null) {
                                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                                throw null;
                            }
                            Object[] array = arrayList.toArray(new ValueAnimator[0]);
                            AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) array;
                            ValueAnimator[] cameraAnimators = (ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length);
                            AbstractC22676k.m65750j(cameraAnimators, "cameraAnimators");
                            AnimationThreadController.INSTANCE.postOnMainThread(new C0271z0(7, cameraAnimators, (C14802h) interfaceC14795a));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ((ValueAnimator) it3.next()).start();
                            }
                            arrayList.clear();
                        }
                    } else if (actionMasked == 3) {
                        arrayList.clear();
                        CoreGesturesHandler coreGesturesHandler2 = c28393o.f114555r0;
                        if (coreGesturesHandler2 == null) {
                            AbstractC22676k.m65757q("coreGesturesHandler");
                            throw null;
                        }
                        coreGesturesHandler2.notifyCoreTouchEnded();
                        c28393o.m86078j();
                    } else if (actionMasked == 5) {
                        c28393o.m86078j();
                    }
                } else {
                    z4 = false;
                }
                if (z4 || z13) {
                    z13 = true;
                }
            }
            return z13;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        AbstractC22676k.m65750j(event, "event");
        if (needRender) {
            this.renderer.queueRenderEvent(event);
        } else {
            this.renderer.queueNonRenderEvent(event);
        }
    }

    public final void removePlugin(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        C13670k c13670k = this.pluginRegistry;
        c13670k.getClass();
        LinkedHashMap linkedHashMap = c13670k.f48466d;
        InterfaceC13669j interfaceC13669j = (InterfaceC13669j) linkedHashMap.get(id4);
        if (interfaceC13669j instanceof InterfaceC13666g) {
            c13670k.f48467e.remove(interfaceC13669j);
        } else if (interfaceC13669j instanceof InterfaceC28381c) {
            c13670k.f48468f.remove(interfaceC13669j);
        } else if (interfaceC13669j instanceof InterfaceC13672m) {
            c13670k.f48469g.remove(interfaceC13669j);
        } else if (interfaceC13669j instanceof InterfaceC13671l) {
            c13670k.f48470h.remove(interfaceC13669j);
        } else if (interfaceC13669j instanceof C30646c) {
            c13670k.f48471i = null;
        }
        if (interfaceC13669j != null) {
            interfaceC13669j.mo38544a();
        }
        linkedHashMap.remove(id4);
        MapboxLogger.logI("MapPluginRegistry", "Removed plugin: " + id4 + " from the Map.");
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new C54741(rendererSetupErrorListener));
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean removeWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        boolean zRemoveWidget = this.renderer.getRenderThread$maps_sdk_release().removeWidget(widget);
        if (zRemoveWidget) {
            this.renderer.scheduleRepaint();
        }
        return zRemoveWidget;
    }

    public final void setLifecycleState$maps_sdk_release(LifecycleState lifecycleState) {
        AbstractC22676k.m65750j(lifecycleState, "<set-?>");
        this.lifecycleState = lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        this.renderer.setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.renderer.setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        AbstractC22676k.m65750j(renderThreadStatsRecorder, "renderThreadStatsRecorder");
        this.renderer.getRenderThread$maps_sdk_release().setRenderThreadStatsRecorder$maps_sdk_release(renderThreadStatsRecorder);
    }

    public final void setScreenRefreshRate$maps_sdk_release(int refreshRate) {
        if (refreshRate <= 0) {
            MapboxLogger.logE(TAG, "Screen refresh rate could not be <= 0! Setting max fps and fps counter will not work properly.");
        } else {
            this.renderer.getRenderThread$maps_sdk_release().setScreenRefreshRate(refreshRate);
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.renderer.snapshot();
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.renderer.snapshot(listener);
    }

    public MapController(MapboxRenderer renderer, NativeObserver nativeObserver, MapInitOptions mapInitOptions, ContextMode contextMode, NativeMapImpl nativeMap, MapboxMap mapboxMap, C13670k pluginRegistry, StyleDataLoadedCallback onStyleLoadingFinishedListener) {
        AbstractC22676k.m65750j(renderer, "renderer");
        AbstractC22676k.m65750j(nativeObserver, "nativeObserver");
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        AbstractC22676k.m65750j(nativeMap, "nativeMap");
        AbstractC22676k.m65750j(mapboxMap, "mapboxMap");
        AbstractC22676k.m65750j(pluginRegistry, "pluginRegistry");
        AbstractC22676k.m65750j(onStyleLoadingFinishedListener, "onStyleLoadingFinishedListener");
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        this.renderer = renderer;
        this.nativeObserver = nativeObserver;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = contextMode;
        this.nativeMap = nativeMap;
        this._mapboxMap = mapboxMap;
        this.pluginRegistry = pluginRegistry;
        this.cameraChangedCoalescedCallback = new C0680g0(pluginRegistry, 17);
        this.styleDataLoadedCallback = onStyleLoadingFinishedListener;
    }
}
