package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.debugoptions.MapViewDebugOptions;
import com.mapbox.maps.plugin.InvalidViewPluginHostException;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.MapboxSurfaceHolderRenderer;
import com.mapbox.maps.renderer.MapboxTextureViewRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import mv.InterfaceC25967f;
import p127ev.AbstractC13676q;
import p127ev.InterfaceC13669j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0087\u0001\u0088\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fB5\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u0012B#\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u00162\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b2\u00106J\u0017\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u00020-H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\u00162\b\b\u0001\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010F*\u00020E2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0017¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0016¢\u0006\u0004\bL\u0010KJ\u0017\u0010M\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0016¢\u0006\u0004\bM\u0010KJ\u0017\u0010O\u001a\u00020\u00162\u0006\u00105\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010R\u001a\u00020QH\u0017¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b_\u0010^J#\u0010b\u001a\u00020-*\u00020I2\u0006\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020\rH\u0002¢\u0006\u0004\bb\u0010cR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010d\u001a\u00020\u00138@@BX\u0080.¢\u0006\f\n\u0004\b\u0014\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020I0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001b\u0010a\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020r0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010kR\u001b\u0010y\u001a\u00020t8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bu\u0010v*\u0004\bw\u0010xR2\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020{0z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020{0z8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0082\u0001\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R\u001f\u0010\u0086\u0001\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\u000f\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001*\u0005\b\u0085\u0001\u0010x¨\u0006\u0089\u0001"}, m65681d2 = {"Lcom/mapbox/maps/MapView;", "Landroid/widget/FrameLayout;", "Lmv/f;", "Lcom/mapbox/maps/MapControllable;", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "initOptions", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/MapController;", "mapController", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V", "Ll83/a0;", "onAttachedToWindow", "()V", "parseTypedArray$maps_sdk_release", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;", "parseTypedArray", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "oldw", "oldh", "onSizeChanged", "(IIII)V", "(II)V", "onStart", "onStop", "onLowMemory", "onDestroy", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "Ljava/lang/Runnable;", NotificationCompat.CATEGORY_EVENT, "", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "enabled", "setSnapshotLegacyMode", "(Z)V", "fps", "setMaximumFps", "(I)V", "Lev/q;", "plugin", "createPlugin", "(Lev/q;)V", "", "id", "removePlugin", "(Ljava/lang/String;)V", "Lev/j;", "T", "getPlugin", "(Ljava/lang/String;)Lev/j;", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "onGenericMotionEvent", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "moveEvent", "touchSlop", "hypot", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z", "<set-?>", "Lcom/mapbox/maps/MapController;", "getMapController$maps_sdk_release", "()Lcom/mapbox/maps/MapController;", "Ll83/h;", "Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "debugOptionsControllerDelegate", "Ll83/h;", "", "interceptedViewAnnotationEvents", "Ljava/util/List;", "touchSlop$delegate", "getTouchSlop", "()I", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "viewAnnotationManagerDelegate", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager$delegate", "(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;", "viewAnnotationManager", "", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "value", "getDebugOptions", "()Ljava/util/Set;", "setDebugOptions", "(Ljava/util/Set;)V", "debugOptions", "mapboxMap", "getDebugOptionsController", "()Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "getDebugOptionsController$delegate", "debugOptionsController", "Companion", "OnSnapshotReady", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class MapView extends FrameLayout implements InterfaceC25967f, MapControllable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final /* synthetic */ int DEFAULT_ANTIALIASING_SAMPLE_COUNT = 1;
    public static final /* synthetic */ int DEFAULT_FPS = 60;
    private final InterfaceC23462h debugOptionsControllerDelegate;
    private List<MotionEvent> interceptedViewAnnotationEvents;
    private MapController mapController;

    /* JADX INFO: renamed from: touchSlop$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h touchSlop;
    private final InterfaceC23462h viewAnnotationManagerDelegate;

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0081\u0002¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/maps/MapView$Companion;", "", "()V", "DEFAULT_ANTIALIASING_SAMPLE_COUNT", "", "DEFAULT_FPS", "invoke", "Lcom/mapbox/maps/MapView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "mapController", "Lcom/mapbox/maps/MapController;", "invoke$maps_sdk_release", "isRenderingSupported", "", "isTerrainRenderingSupported", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MapView invoke$maps_sdk_release(Context context, AttributeSet attrs, MapController mapController) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(mapController, "mapController");
            return new MapView(context, attrs, mapController, (DefaultConstructorMarker) null);
        }

        public final boolean isRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            eGLCore.release();
            return zPrepareEgl;
        }

        public final boolean isTerrainRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            EGLSurface eGLSurfaceCreateOffscreenSurface = eGLCore.createOffscreenSurface(1, 1);
            eGLCore.makeCurrent(eGLSurfaceCreateOffscreenSurface);
            IntBuffer intBufferAllocate = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(35660, intBufferAllocate);
            intBufferAllocate.rewind();
            boolean z4 = intBufferAllocate.get() > 0;
            eGLCore.releaseSurface(eGLSurfaceCreateOffscreenSurface);
            eGLCore.release();
            return zPrepareEgl && z4;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/MapView$OnSnapshotReady;", "", "Landroid/graphics/Bitmap;", "bitmap", "Ll83/a0;", "onSnapshotReady", "(Landroid/graphics/Bitmap;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface OnSnapshotReady {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapView$onInterceptTouchEvent$2 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C54812 extends AbstractC22680m implements Function1 {
        final /* synthetic */ int $upPointerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54812(int i13) {
            super(1);
            this.$upPointerId = i13;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent it) {
            AbstractC22676k.m65750j(it, "it");
            return Boolean.valueOf(this.$upPointerId == it.getPointerId(it.getActionIndex()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapView(Context context) {
        this(context, (MapInitOptions) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        AbstractC22676k.m65750j(context, "context");
    }

    private final DebugOptionsController getDebugOptionsController() {
        return (DebugOptionsController) this.debugOptionsControllerDelegate.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    private final boolean hypot(MotionEvent motionEvent, MotionEvent motionEvent2, int i13) {
        int pointerCount = motionEvent2.getPointerCount();
        for (int i14 = 0; i14 < pointerCount; i14++) {
            int pointerId = motionEvent2.getPointerId(i14);
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            int iFindPointerIndex2 = motionEvent2.findPointerIndex(pointerId);
            if (iFindPointerIndex != -1 && iFindPointerIndex2 != -1 && ((float) Math.hypot(motionEvent.getX(iFindPointerIndex) - motionEvent2.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex) - motionEvent2.getY(iFindPointerIndex2))) > i13) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isRenderingSupported() {
        return INSTANCE.isRenderingSupported();
    }

    public static final boolean isTerrainRenderingSupported() {
        return INSTANCE.isTerrainRenderingSupported();
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        getMapController$maps_sdk_release().addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        getMapController$maps_sdk_release().addWidget(widget);
    }

    public final void createPlugin(AbstractC13676q plugin) throws InvalidViewPluginHostException {
        AbstractC22676k.m65750j(plugin, "plugin");
        getMapController$maps_sdk_release().createPlugin(this, plugin);
    }

    public final Set<MapViewDebugOptions> getDebugOptions() {
        return getDebugOptionsController().getOptions();
    }

    public final /* synthetic */ MapController getMapController$maps_sdk_release() {
        MapController mapController = this.mapController;
        if (mapController != null) {
            return mapController;
        }
        AbstractC22676k.m65757q("mapController");
        throw null;
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return getMapController$maps_sdk_release().getMapboxMapDeprecated();
    }

    @Override // mv.InterfaceC25967f
    public <T extends InterfaceC13669j> T getPlugin(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return (T) getMapController$maps_sdk_release().getPlugin(id4);
    }

    public final ViewAnnotationManager getViewAnnotationManager() {
        return (ViewAnnotationManager) this.viewAnnotationManagerDelegate.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onAttachedToWindow$maps_sdk_release(this);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        if (this.viewAnnotationManagerDelegate.mo5046b()) {
            ViewAnnotationManager viewAnnotationManager = getViewAnnotationManager();
            AbstractC22676k.m65748h(viewAnnotationManager, "null cannot be cast to non-null type com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl");
            ((ViewAnnotationManagerImpl) viewAnnotationManager).destroy();
        }
        getMapController$maps_sdk_release().onDestroy();
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return getMapController$maps_sdk_release().onGenericMotionEvent(event) || super.onGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    List<MotionEvent> list = this.interceptedViewAnnotationEvents;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (hypot((MotionEvent) it.next(), event, getTouchSlop())) {
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            AbstractC25265s.m74132j1(this.interceptedViewAnnotationEvents, new C54812(event.getPointerId(event.getActionIndex())));
                            return false;
                        }
                    }
                }
                return false;
            }
            this.interceptedViewAnnotationEvents.clear();
            return false;
        }
        List<MotionEvent> list2 = this.interceptedViewAnnotationEvents;
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        AbstractC22676k.m65749i(motionEventObtain, "obtain(event)");
        list2.add(motionEventObtain);
        return false;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapController$maps_sdk_release().onLowMemory();
    }

    @Override // android.view.View
    public void onSizeChanged(int w9, int h7, int oldw, int oldh) {
        super.onSizeChanged(w9, h7, oldw, oldh);
        if (w9 == oldw && h7 == oldh) {
            return;
        }
        onSizeChanged(w9, h7);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        Display display = getDisplay();
        getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(display != null ? (int) display.getRefreshRate() : 60);
        getMapController$maps_sdk_release().onStart();
        if (this.debugOptionsControllerDelegate.mo5046b()) {
            getDebugOptionsController().setStarted(true);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        getMapController$maps_sdk_release().onStop();
        if (this.debugOptionsControllerDelegate.mo5046b()) {
            getDebugOptionsController().setStarted(false);
        }
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        boolean z4;
        AbstractC22676k.m65750j(event, "event");
        if (this.interceptedViewAnnotationEvents.isEmpty()) {
            z4 = false;
        } else {
            List<MotionEvent> list = this.interceptedViewAnnotationEvents;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MotionEvent) it.next()).getEventTime() == event.getEventTime()) {
                            z4 = false;
                        }
                    }
                }
            }
            z4 = false;
            for (MotionEvent motionEvent : this.interceptedViewAnnotationEvents) {
                z4 = getMapController$maps_sdk_release().onTouchEvent(motionEvent) || z4;
                motionEvent.recycle();
            }
        }
        this.interceptedViewAnnotationEvents.clear();
        return getMapController$maps_sdk_release().onTouchEvent(event) || z4;
    }

    @SuppressLint({"CustomViewStyleable"})
    public final /* synthetic */ MapInitOptions parseTypedArray$maps_sdk_release(Context context, AttributeSet attrs) {
        AbstractC22676k.m65750j(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C5489R.styleable.mapbox_MapView, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            MapOptions mapOptions = MapAttributeParser.INSTANCE.parseMapOptions(typedArrayObtainStyledAttributes, context.getResources().getDisplayMetrics().density);
            String str = null;
            CameraOptions cameraOptions$default = CameraAttributeParser.parseCameraOptions$default(CameraAttributeParser.INSTANCE, typedArrayObtainStyledAttributes, 0.0f, 2, null);
            boolean z4 = typedArrayObtainStyledAttributes.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapSurface, 0) != 0;
            String string = typedArrayObtainStyledAttributes.getString(C5489R.styleable.mapbox_MapView_mapbox_styleUri);
            if (string == null) {
                string = Style.STANDARD;
            }
            int integer = typedArrayObtainStyledAttributes.getInteger(C5489R.styleable.mapbox_MapView_mapbox_mapAntialiasingSampleCount, 1);
            String string2 = typedArrayObtainStyledAttributes.getString(C5489R.styleable.mapbox_MapView_mapbox_mapName);
            if (string2 == null) {
                string2 = "";
            }
            String str2 = string2;
            String str3 = string;
            if (str3.length() != 0) {
                str = str3;
            }
            MapInitOptions mapInitOptions = new MapInitOptions(context, mapOptions, null, null, false, str, attrs, integer, str2, 28, null);
            mapInitOptions.setCameraOptions(cameraOptions$default);
            mapInitOptions.setTextureView(z4);
            return mapInitOptions;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        AbstractC22676k.m65750j(event, "event");
        getMapController$maps_sdk_release().queueEvent(event, needRender);
    }

    public final void removePlugin(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        getMapController$maps_sdk_release().removePlugin(id4);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        getMapController$maps_sdk_release().removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        return getMapController$maps_sdk_release().removeWidget(widget);
    }

    public final void setDebugOptions(Set<MapViewDebugOptions> value) {
        AbstractC22676k.m65750j(value, "value");
        getDebugOptionsController().setOptions(value);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        getMapController$maps_sdk_release().setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        getMapController$maps_sdk_release().setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        AbstractC22676k.m65750j(renderThreadStatsRecorder, "renderThreadStatsRecorder");
        getMapController$maps_sdk_release().setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @MapboxExperimental
    public final void setSnapshotLegacyMode(boolean enabled) {
        getMapController$maps_sdk_release().getRenderer().setSnapshotLegacyModeEnabled$maps_sdk_release(enabled);
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return getMapController$maps_sdk_release().snapshot();
    }

    public /* synthetic */ MapView(Context context, AttributeSet attributeSet, MapController mapController, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, mapController);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(OnSnapshotReady listener) {
        AbstractC22676k.m65750j(listener, "listener");
        getMapController$maps_sdk_release().snapshot(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, MapInitOptions mapInitOptions) {
        this(context, null, 0, 0, mapInitOptions);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w9, int h7) {
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onSizeChanged(w9, h7);
    }

    public /* synthetic */ MapView(Context context, MapInitOptions mapInitOptions, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            mapInitOptions = new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null);
        }
        this(context, mapInitOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private MapView(Context context, AttributeSet attributeSet, int i13, int i14, MapInitOptions mapInitOptions) {
        MapInitOptions mapInitOptions2;
        View surfaceView;
        MapboxRenderer mapboxTextureViewRenderer;
        super(context, attributeSet, i13, i14);
        this.debugOptionsControllerDelegate = AbstractC30060g.m92088H(new MapView$debugOptionsControllerDelegate$1(this));
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = AbstractC30060g.m92088H(new MapView$touchSlop$2(this));
        this.viewAnnotationManagerDelegate = AbstractC30060g.m92088H(new MapView$viewAnnotationManagerDelegate$1(this));
        if (attributeSet != null) {
            mapInitOptions2 = parseTypedArray$maps_sdk_release(context, attributeSet);
        } else if (mapInitOptions == null) {
            mapInitOptions2 = new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null);
        } else {
            mapInitOptions2 = mapInitOptions;
        }
        if (isInEditMode()) {
            return;
        }
        if (mapInitOptions2.getTextureView()) {
            surfaceView = new TextureView(context, attributeSet);
        } else {
            surfaceView = new SurfaceView(context, attributeSet);
        }
        ContextMode contextMode = mapInitOptions2.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        AbstractC22676k.m65749i(contextMode, "resolvedMapInitOptions.m…ode ?: ContextMode.UNIQUE");
        if (surfaceView instanceof SurfaceView) {
            SurfaceHolder holder = ((SurfaceView) surfaceView).getHolder();
            AbstractC22676k.m65749i(holder, "view.holder");
            mapboxTextureViewRenderer = new MapboxSurfaceHolderRenderer(holder, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        } else if (surfaceView instanceof TextureView) {
            mapboxTextureViewRenderer = new MapboxTextureViewRenderer((TextureView) surfaceView, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        } else {
            throw new IllegalArgumentException("Provided view has to be a texture or a surface.");
        }
        this.mapController = new MapController(mapboxTextureViewRenderer, mapInitOptions2);
        addView(surfaceView, 0);
        getMapController$maps_sdk_release().initializePlugins(mapInitOptions2, this);
    }

    private MapView(Context context, AttributeSet attributeSet, MapController mapController) {
        super(context, attributeSet, 0, 0);
        this.debugOptionsControllerDelegate = AbstractC30060g.m92088H(new MapView$debugOptionsControllerDelegate$1(this));
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = AbstractC30060g.m92088H(new MapView$touchSlop$2(this));
        this.viewAnnotationManagerDelegate = AbstractC30060g.m92088H(new MapView$viewAnnotationManagerDelegate$1(this));
        this.mapController = mapController;
    }
}
