package com.mapbox.maps.viewannotation;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.C5489R;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor;
import com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxViewAnnotationException;
import com.mapbox.maps.ProjectedMeters;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25247g0;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p567w.AbstractC36624a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0089\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005*\u0001f\b\u0001\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0004¤\u0001¥\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J=\u00109\u001a\u0004\u0018\u0001082\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b9\u0010:JO\u00109\u001a\u00020\u00112\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b9\u0010<J\u001d\u0010?\u001a\u00020\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=01H\u0017¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0011¢\u0006\u0004\bA\u0010\u001cJS\u0010C\u001a\u0004\u0018\u0001082\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bC\u0010DJO\u0010I\u001a\u0004\u0018\u0001082\u0006\u0010E\u001a\u0002082\b\u00104\u001a\u0004\u0018\u0001032\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F012\u0006\u0010H\u001a\u0002082\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bI\u0010JJ1\u0010M\u001a\u0004\u0018\u0001082\b\u0010K\u001a\u0004\u0018\u0001082\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bM\u0010NJ+\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010O\u001a\u00020F2\u0006\u0010Q\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u0004\u0018\u00010W*\u00020F2\b\u0010V\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bX\u0010YJ#\u0010Z\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020F2\b\u0010V\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b_\u0010\u0017J\u0017\u0010`\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b`\u0010aJ'\u0010g\u001a\u00020f2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020d2\u0006\u0010O\u001a\u00020FH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020b2\u0006\u0010O\u001a\u00020FH\u0002¢\u0006\u0004\bk\u0010lJ'\u0010n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0m2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010oJ\u001d\u0010q\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00020=01H\u0002¢\u0006\u0004\bq\u0010@J\u001f\u0010s\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bu\u0010tJ\u001f\u0010v\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bv\u0010tJ.\u0010{\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010w\u0018\u00012\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u00000xH\u0082\b¢\u0006\u0004\b{\u0010|J\"\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020F2\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020FH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\"\u0010G\u001a\u000f\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020F0\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u008f\u0001R-\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0090\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0095\u0001\u0010\u001c\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0096\u0001R\u001f\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001RU\u0010 \u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00012\u0019\u0010\u009a\u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00018V@VX\u0097\u000e¢\u0006\u0017\u0012\u0005\b\u009f\u0001\u0010\u001c\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R#\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0¡\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006¦\u0001"}, m65681d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "Lcom/mapbox/maps/MapView;", "mapView", "Landroid/widget/FrameLayout;", "viewAnnotationsLayout", "<init>", "(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V", "", "resId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "Lw/a;", "asyncInflater", "Lkotlin/Function1;", "Landroid/view/View;", "Ll83/a0;", "asyncInflateCallback", "addViewAnnotation", "(ILcom/mapbox/maps/ViewAnnotationOptions;Lw/a;Lkotlin/jvm/functions/Function1;)V", "(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V", "", "removeViewAnnotation", "(Landroid/view/View;)Z", "removeAllViewAnnotations", "()V", "updateViewAnnotation", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z", "Lcom/mapbox/maps/AnnotatedLayerFeature;", "annotatedLayerFeature", "getViewAnnotation", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;", "getViewAnnotationOptions", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;", "(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "listener", "addOnViewAnnotationUpdatedListener", "(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V", "removeOnViewAnnotationUpdatedListener", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "mode", "setViewAnnotationUpdateMode", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "getViewAnnotationUpdateMode", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "", "annotations", "Lcom/mapbox/maps/EdgeInsets;", "edgeInsets", "", "bearing", "pitch", "Lcom/mapbox/maps/CameraOptions;", "cameraForAnnotations", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "result", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "positions", "onDelegatingViewAnnotationPositionsUpdate", "(Ljava/util/List;)V", "destroy", "resultCallback", "cameraForAnnotationsImpl", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "cameraForViewAnnotationPoints", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "viewAnnotations", "cameraOptionsWithNoZoom", "adjustCameraForAnnotations", "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "camera", "callback", "invokeCallbackAndReturn", "(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "viewAnnotation", "Landroid/graphics/Rect;", "annotationFrame", "zoom", "Lcom/mapbox/maps/CoordinateBounds;", "calculateCoordinateBoundForAnnotation", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;", "positionDescriptor", "Lcom/mapbox/geojson/Point;", "coordinate", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;", "getViewAnnotationOptionsFrame", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Landroid/graphics/Rect;", "validateOptions", "(Lcom/mapbox/maps/ViewAnnotationOptions;)V", "inflatedView", "prepareViewAnnotation", "measureView", "(Landroid/view/View;)V", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "onDrawListener", "com/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1", "buildAttachStateListener", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;", "buildDrawListener", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnDrawListener;", "buildGlobalLayoutListener", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Ll83/k;", "findByAnnotatedLayerFeature", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Ll83/k;", "updatedPositionDescriptors", "positionAnnotationViews", "newPositionDescriptor", "notifyPositionListeners", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V", "notifyAnchorCoordinateListeners", "notifyAnchorListeners", "V", "Lcom/mapbox/bindgen/Expected;", "", "expected", "getValue", "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "annotation", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "currentVisibility", "updateVisibilityAndNotifyUpdateListeners", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V", "remove", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V", "Landroid/widget/FrameLayout;", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "", "pixelRatio", "F", "", "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "viewUpdatedListenerSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getViewUpdatedListenerSet$maps_sdk_release", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "getViewUpdatedListenerSet$maps_sdk_release$annotations", "Ljava/util/List;", "currentPositionDescriptors", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "value", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)V", "getViewAnnotationAvoidLayers$annotations", "viewAnnotationAvoidLayers", "", "getAnnotations", "()Ljava/util/Map;", "Companion", "ViewAnnotation", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ViewAnnotationManagerImpl extends DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXCEPTION_TEXT_FEATURE_IS_NULL = "Annotated feature can not be null!";
    private static final int MAX_ADJUST_BOUNDS_COUNTER = 2;
    private static final String TAG = "ViewAnnotationImpl";
    private static final int USER_FIXED_DIMENSION = -1;
    private List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors;
    private final MapboxMap mapboxMap;
    private final float pixelRatio;
    private final MapboxRenderThread renderThread;
    private volatile List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors;
    private final Map<String, ViewAnnotation> viewAnnotations;
    private final FrameLayout viewAnnotationsLayout;
    private final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> viewUpdatedListenerSet;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;", "", "()V", "EXCEPTION_TEXT_FEATURE_IS_NULL", "", "MAX_ADJUST_BOUNDS_COUNTER", "", "TAG", "USER_FIXED_DIMENSION", "needToReorderZ", "", "currentPositionDescriptors", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "updatedPositionDescriptors", "needToReorderZ$maps_sdk_release", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean needToReorderZ$maps_sdk_release(List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors, List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
            AbstractC22676k.m65750j(currentPositionDescriptors, "currentPositionDescriptors");
            AbstractC22676k.m65750j(updatedPositionDescriptors, "updatedPositionDescriptors");
            if (currentPositionDescriptors.size() < updatedPositionDescriptors.size()) {
                return true;
            }
            if (!currentPositionDescriptors.isEmpty() && !updatedPositionDescriptors.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i13 = 0;
                int i14 = 0;
                while (i13 < currentPositionDescriptors.size() && i14 < updatedPositionDescriptors.size()) {
                    if (AbstractC22676k.m65745e(currentPositionDescriptors.get(i13).getIdentifier(), updatedPositionDescriptors.get(i14).getIdentifier())) {
                        i13++;
                        i14++;
                    } else {
                        if (linkedHashSet.contains(updatedPositionDescriptors.get(i14).getIdentifier())) {
                            return true;
                        }
                        while (i13 < currentPositionDescriptors.size() && !AbstractC22676k.m65745e(currentPositionDescriptors.get(i13).getIdentifier(), updatedPositionDescriptors.get(i14).getIdentifier())) {
                            String identifier = currentPositionDescriptors.get(i13).getIdentifier();
                            AbstractC22676k.m65749i(identifier, "currentPositionDescripto…[currentIndex].identifier");
                            linkedHashSet.add(identifier);
                            i13++;
                        }
                    }
                }
                while (i14 < updatedPositionDescriptors.size()) {
                    if (linkedHashSet.contains(updatedPositionDescriptors.get(i14).getIdentifier())) {
                        return true;
                    }
                    i14++;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewAnnotationAnchor.values().length];
            try {
                iArr[ViewAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewAnnotationAnchor.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewAnnotationAnchor.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/mapbox/maps/CameraOptions;", "cameraForViewAnnotationPoints", "Ll83/a0;", "invoke", "(Lcom/mapbox/maps/CameraOptions;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55641 extends AbstractC22680m implements Function1 {
        final /* synthetic */ CameraOptions $cameraOptionsWithNoZoom;
        final /* synthetic */ EdgeInsets $edgeInsets;
        final /* synthetic */ Function1 $resultCallback;
        final /* synthetic */ List<ViewAnnotation> $viewAnnotations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55641(EdgeInsets edgeInsets, List<ViewAnnotation> list, CameraOptions cameraOptions, Function1 function1) {
            super(1);
            this.$edgeInsets = edgeInsets;
            this.$viewAnnotations = list;
            this.$cameraOptionsWithNoZoom = cameraOptions;
            this.$resultCallback = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CameraOptions) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(CameraOptions cameraForViewAnnotationPoints) {
            AbstractC22676k.m65750j(cameraForViewAnnotationPoints, "cameraForViewAnnotationPoints");
            ViewAnnotationManagerImpl.this.adjustCameraForAnnotations(cameraForViewAnnotationPoints, this.$edgeInsets, this.$viewAnnotations, this.$cameraOptionsWithNoZoom, this.$resultCallback);
        }
    }

    public /* synthetic */ ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(mapView, (i13 & 2) != 0 ? new FrameLayout(mapView.getContext()) : frameLayout);
    }

    private static final void addViewAnnotation$lambda$0(ViewAnnotationManagerImpl this$0, ViewAnnotationOptions options, Function1 asyncInflateCallback, View view, int i13, ViewGroup viewGroup) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(options, "$options");
        AbstractC22676k.m65750j(asyncInflateCallback, "$asyncInflateCallback");
        AbstractC22676k.m65750j(view, "view");
        this$0.prepareViewAnnotation(view, options);
        asyncInflateCallback.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraOptions adjustCameraForAnnotations(CameraOptions cameraForViewAnnotationPoints, EdgeInsets edgeInsets, List<ViewAnnotation> viewAnnotations, CameraOptions cameraOptionsWithNoZoom, Function1 resultCallback) {
        Double dValueOf = Double.valueOf(0.0d);
        int i13 = 0;
        Integer num = 0;
        if (CameraOptionsUtils.isEmpty(cameraForViewAnnotationPoints)) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        CameraOptions cameraOptionsCameraForCoordinates = cameraForViewAnnotationPoints;
        boolean z4 = false;
        C23471q c23471q = null;
        C23471q c23471q2 = null;
        C23471q c23471q3 = null;
        C23471q c23471q4 = null;
        int i14 = 1;
        while (!z4 && i14 <= 2) {
            Double zoom = cameraOptionsCameraForCoordinates.getZoom();
            i14++;
            C23471q c23471q5 = c23471q4;
            C23471q c23471q6 = c23471q3;
            C23471q c23471q7 = c23471q2;
            C23471q c23471q8 = c23471q;
            boolean z13 = true;
            for (ViewAnnotation viewAnnotation : viewAnnotations) {
                Rect viewAnnotationOptionsFrame = getViewAnnotationOptionsFrame(viewAnnotation, viewAnnotation.getPositionDescriptor());
                if (viewAnnotationOptionsFrame == null) {
                    viewAnnotationOptionsFrame = new Rect(i13, i13, i13, i13);
                }
                CoordinateBounds coordinateBoundsCalculateCoordinateBoundForAnnotation = calculateCoordinateBoundForAnnotation(viewAnnotation, viewAnnotationOptionsFrame, zoom);
                if (coordinateBoundsCalculateCoordinateBoundForAnnotation != null) {
                    if (c23471q8 == null || ((Number) c23471q8.f92949y).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.north()) {
                        c23471q8 = new C23471q(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.north()));
                        z13 = false;
                    }
                    if (c23471q7 == null || ((Number) c23471q7.f92949y).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.east()) {
                        c23471q7 = new C23471q(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.east()));
                        z13 = false;
                    }
                    if (c23471q5 == null || ((Number) c23471q5.f92949y).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.south()) {
                        c23471q5 = new C23471q(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.south()));
                        z13 = false;
                    }
                    if (c23471q6 == null || ((Number) c23471q6.f92949y).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.west()) {
                        c23471q6 = new C23471q(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.west()));
                        z13 = false;
                    }
                }
                i13 = 0;
            }
            if (c23471q8 == null || c23471q7 == null || c23471q5 == null || c23471q6 == null) {
                MapboxLogger.logW(TAG, "ViewAnnotation options framing is null. Returning empty camera");
                return invokeCallbackAndReturn(null, resultCallback);
            }
            Object obj = c23471q6.f92947w;
            Point pointCoordinate = coordinate((ViewAnnotation) obj, ((ViewAnnotation) obj).getPositionDescriptor());
            AbstractC22676k.m65747g(pointCoordinate);
            double dLongitude = pointCoordinate.longitude();
            Object obj2 = c23471q5.f92947w;
            Point pointCoordinate2 = coordinate((ViewAnnotation) obj2, ((ViewAnnotation) obj2).getPositionDescriptor());
            AbstractC22676k.m65747g(pointCoordinate2);
            Double d3 = dValueOf;
            Point pointFromLngLat = Point.fromLngLat(dLongitude, pointCoordinate2.latitude());
            Object obj3 = c23471q7.f92947w;
            Point pointCoordinate3 = coordinate((ViewAnnotation) obj3, ((ViewAnnotation) obj3).getPositionDescriptor());
            AbstractC22676k.m65747g(pointCoordinate3);
            double dLongitude2 = pointCoordinate3.longitude();
            Object obj4 = c23471q8.f92947w;
            Point pointCoordinate4 = coordinate((ViewAnnotation) obj4, ((ViewAnnotation) obj4).getPositionDescriptor());
            AbstractC22676k.m65747g(pointCoordinate4);
            Integer num2 = num;
            List<Point> listM118959K = AbstractC37056f.m118959K(pointFromLngLat, Point.fromLngLat(dLongitude2, pointCoordinate4.latitude()));
            double dDoubleValue = (edgeInsets != null ? Double.valueOf(edgeInsets.getTop()) : num2).doubleValue();
            Rect rect = (Rect) c23471q8.f92948x;
            double dAbs = Math.abs((rect != null ? Integer.valueOf(rect.top) : d3).doubleValue()) + dDoubleValue;
            double dDoubleValue2 = (edgeInsets != null ? Double.valueOf(edgeInsets.getLeft()) : num2).doubleValue();
            Rect rect2 = (Rect) c23471q6.f92948x;
            double dAbs2 = Math.abs((rect2 != null ? Integer.valueOf(rect2.left) : d3).doubleValue()) + dDoubleValue2;
            double dDoubleValue3 = (edgeInsets != null ? Double.valueOf(edgeInsets.getBottom()) : num2).doubleValue();
            Rect rect3 = (Rect) c23471q5.f92948x;
            double dAbs3 = Math.abs((rect3 != null ? Integer.valueOf(rect3.bottom) : d3).doubleValue()) + dDoubleValue3;
            double dDoubleValue4 = (edgeInsets != null ? Double.valueOf(edgeInsets.getRight()) : num2).doubleValue();
            Rect rect4 = (Rect) c23471q7.f92948x;
            cameraOptionsCameraForCoordinates = this.mapboxMap.cameraForCoordinates(listM118959K, cameraOptionsWithNoZoom, new EdgeInsets(dAbs, dAbs2, dAbs3, Math.abs((rect4 != null ? Integer.valueOf(rect4.right) : d3).doubleValue()) + dDoubleValue4), null, null);
            dValueOf = d3;
            z4 = z13;
            c23471q = c23471q8;
            c23471q2 = c23471q7;
            c23471q3 = c23471q6;
            c23471q4 = c23471q5;
            num = num2;
            i13 = 0;
        }
        return invokeCallbackAndReturn(CameraOptionsUtils.isEmpty(cameraOptionsCameraForCoordinates) ? null : cameraOptionsCameraForCoordinates, resultCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$buildAttachStateListener$1] */
    private final ViewOnAttachStateChangeListenerC55631 buildAttachStateListener(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, final ViewTreeObserver.OnDrawListener onDrawListener) {
        return new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl.buildAttachStateListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v13) {
                AbstractC22676k.m65750j(v13, "v");
                view.getViewTreeObserver().addOnDrawListener(onDrawListener);
                view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v13) {
                AbstractC22676k.m65750j(v13, "v");
                view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    private final ViewTreeObserver.OnDrawListener buildDrawListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnDrawListener() { // from class: com.mapbox.maps.viewannotation.b
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ViewAnnotationManagerImpl.buildDrawListener$lambda$21(viewAnnotation, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDrawListener$lambda$21(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl this$0) {
        AbstractC22676k.m65750j(viewAnnotation, "$viewAnnotation");
        AbstractC22676k.m65750j(this$0, "this$0");
        if (viewAnnotation.getHandleVisibilityAutomatically()) {
            boolean z4 = viewAnnotation.getView().getVisibility() == 0;
            if (z4 && viewAnnotation.isVisible()) {
                return;
            }
            if (z4 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.INVISIBLE) {
                if (z4 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED) {
                    if (z4) {
                        ViewAnnotation viewAnnotation2 = this$0.viewAnnotations.get(viewAnnotation.getId());
                        if (viewAnnotation2 != null) {
                            viewAnnotation2.setPositioned(false);
                        }
                        viewAnnotation.getView().setVisibility(4);
                    }
                    this$0.updateVisibilityAndNotifyUpdateListeners(viewAnnotation, z4 ? ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                    Expected viewAnnotationOptions$maps_sdk_release = this$0.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
                    if (viewAnnotationOptions$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
                    }
                    ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
                    if (viewAnnotationOptions != null ? AbstractC22676k.m65745e(viewAnnotationOptions.getVisible(), Boolean.valueOf(z4)) : false) {
                        return;
                    }
                    MapboxMap mapboxMap = this$0.mapboxMap;
                    String id4 = viewAnnotation.getId();
                    ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().visible(Boolean.valueOf(z4)).build();
                    AbstractC22676k.m65749i(viewAnnotationOptionsBuild, "Builder()\n              …e)\n              .build()");
                    Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id4, viewAnnotationOptionsBuild);
                    if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
                    }
                    expectedUpdateViewAnnotation$maps_sdk_release.getValue();
                }
            }
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener buildGlobalLayoutListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mapbox.maps.viewannotation.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewAnnotationManagerImpl.buildGlobalLayoutListener$lambda$22(viewAnnotation, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildGlobalLayoutListener$lambda$22(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl this$0) {
        AbstractC22676k.m65750j(viewAnnotation, "$viewAnnotation");
        AbstractC22676k.m65750j(this$0, "this$0");
        if (viewAnnotation.getMeasuredWidth() != -1 && viewAnnotation.getView().getMeasuredWidth() > 0 && viewAnnotation.getView().getMeasuredWidth() != viewAnnotation.getMeasuredWidth()) {
            viewAnnotation.setMeasuredWidth(viewAnnotation.getView().getMeasuredWidth());
            MapboxMap mapboxMap = this$0.mapboxMap;
            String id4 = viewAnnotation.getId();
            ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().width(Double.valueOf(viewAnnotation.getView().getMeasuredWidth())).build();
            AbstractC22676k.m65749i(viewAnnotationOptionsBuild, "Builder()\n              …))\n              .build()");
            Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id4, viewAnnotationOptionsBuild);
            if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
            }
            expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        }
        if (viewAnnotation.getMeasuredHeight() == -1 || viewAnnotation.getView().getMeasuredHeight() <= 0 || viewAnnotation.getView().getMeasuredHeight() == viewAnnotation.getMeasuredHeight()) {
            return;
        }
        viewAnnotation.setMeasuredHeight(viewAnnotation.getView().getMeasuredHeight());
        MapboxMap mapboxMap2 = this$0.mapboxMap;
        String id5 = viewAnnotation.getId();
        ViewAnnotationOptions viewAnnotationOptionsBuild2 = new ViewAnnotationOptions.Builder().height(Double.valueOf(viewAnnotation.getView().getMeasuredHeight())).build();
        AbstractC22676k.m65749i(viewAnnotationOptionsBuild2, "Builder()\n              …))\n              .build()");
        Expected expectedUpdateViewAnnotation$maps_sdk_release2 = mapboxMap2.updateViewAnnotation$maps_sdk_release(id5, viewAnnotationOptionsBuild2);
        if (expectedUpdateViewAnnotation$maps_sdk_release2.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release2.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release2.getValue();
    }

    private final CoordinateBounds calculateCoordinateBoundForAnnotation(ViewAnnotation viewAnnotation, Rect annotationFrame, Double zoom) {
        Point pointCoordinate = coordinate(viewAnnotation, viewAnnotation.getPositionDescriptor());
        if (pointCoordinate == null) {
            return null;
        }
        double metersPerPixelAtLatitude = zoom == null ? this.mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude()) : this.mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude(), zoom.doubleValue());
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = this.mapboxMap.projectedMetersForCoordinate(pointCoordinate);
        double d3 = metersPerPixelAtLatitude / ((double) this.pixelRatio);
        double dAbs = (((double) Math.abs(annotationFrame.top)) * d3) + projectedMetersProjectedMetersForCoordinate.getNorthing();
        double dAbs2 = (((double) Math.abs(annotationFrame.right)) * d3) + projectedMetersProjectedMetersForCoordinate.getEasting();
        double northing = projectedMetersProjectedMetersForCoordinate.getNorthing() - (((double) Math.abs(annotationFrame.bottom)) * d3);
        double easting = projectedMetersProjectedMetersForCoordinate.getEasting() - (((double) Math.abs(annotationFrame.left)) * d3);
        ProjectedMeters projectedMeters = new ProjectedMeters(dAbs, dAbs2);
        return new CoordinateBounds(this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters(northing, easting)), this.mapboxMap.coordinateForProjectedMeters(projectedMeters));
    }

    private final CameraOptions cameraForAnnotationsImpl(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, Function1 resultCallback) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList<ViewAnnotation> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            for (Object obj3 : this.viewAnnotations.values()) {
                if (AbstractC22676k.m65745e(((ViewAnnotation) obj3).getView(), view)) {
                    obj2 = obj3;
                    break;
                }
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) obj2;
            if (viewAnnotation != null) {
                arrayList2.add(viewAnnotation);
            }
        }
        if (arrayList2.isEmpty()) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        ArrayList arrayList3 = new ArrayList();
        for (ViewAnnotation viewAnnotation2 : arrayList2) {
            Point pointCoordinate = coordinate(viewAnnotation2, viewAnnotation2.getPositionDescriptor());
            if (pointCoordinate != null) {
                arrayList3.add(pointCoordinate);
            }
        }
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.pitch(pitch);
        builder.bearing(bearing);
        CameraOptions cameraOptionsBuild = builder.build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
        if (resultCallback == null) {
            return adjustCameraForAnnotations(this.mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null), edgeInsets, arrayList2, cameraOptionsBuild, null);
        }
        this.mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null, new C55641(edgeInsets, arrayList2, cameraOptionsBuild, resultCallback));
        return null;
    }

    private final Point coordinate(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null) {
            return null;
        }
        AnnotatedFeature annotatedFeature = viewAnnotationOptions.getAnnotatedFeature();
        AbstractC22676k.m65747g(annotatedFeature);
        if (!annotatedFeature.isGeometry()) {
            if (delegatingViewAnnotationPositionDescriptor != null) {
                return delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate();
            }
            return null;
        }
        AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
        AbstractC22676k.m65747g(annotatedFeature2);
        Geometry geometry = annotatedFeature2.getGeometry();
        if (geometry instanceof Point) {
            return (Point) geometry;
        }
        return null;
    }

    private final C23465k findByAnnotatedLayerFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        Object next;
        AnnotatedFeature annotatedFeature;
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            String key = entry.getKey();
            View view = entry.getValue().getView();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(key);
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            arrayList.add(new C23465k(view, viewAnnotationOptions$maps_sdk_release.getValue()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) ((C23465k) next).f92938x;
            if (viewAnnotationOptions != null && (annotatedFeature = viewAnnotationOptions.getAnnotatedFeature()) != null && annotatedFeature.isAnnotatedLayerFeature()) {
                AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
                if (AbstractC22676k.m65745e(annotatedFeature2 != null ? annotatedFeature2.getAnnotatedLayerFeature() : null, annotatedLayerFeature)) {
                    break;
                }
            }
        }
        C23465k c23465k = (C23465k) next;
        return c23465k == null ? new C23465k(null, null) : c23465k;
    }

    private final /* synthetic */ <V> V getValue(Expected<String, V> expected) {
        if (expected.isError()) {
            throw new MapboxViewAnnotationException(expected.getError());
        }
        return expected.getValue();
    }

    @MapboxExperimental
    public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
    }

    private final Rect getViewAnnotationOptionsFrame(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor positionDescriptor) {
        int iDoubleValue;
        int iDoubleValue2;
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfigBuild;
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null || viewAnnotationOptions.getWidth() == null || viewAnnotationOptions.getHeight() == null) {
            return null;
        }
        Double width = viewAnnotationOptions.getWidth();
        AbstractC22676k.m65747g(width);
        if (width.doubleValue() > 0.0d) {
            Double width2 = viewAnnotationOptions.getWidth();
            AbstractC22676k.m65747g(width2);
            iDoubleValue = (int) (width2.doubleValue() * 0.5d);
        } else {
            iDoubleValue = 0;
        }
        Double height = viewAnnotationOptions.getHeight();
        AbstractC22676k.m65747g(height);
        if (height.doubleValue() > 0.0d) {
            Double height2 = viewAnnotationOptions.getHeight();
            AbstractC22676k.m65747g(height2);
            iDoubleValue2 = (int) (height2.doubleValue() * 0.5d);
        } else {
            iDoubleValue2 = 0;
        }
        int i13 = -iDoubleValue;
        int i14 = -iDoubleValue2;
        Rect rect = new Rect(i13, i14, iDoubleValue, iDoubleValue2);
        if (positionDescriptor == null || (viewAnnotationAnchorConfigBuild = positionDescriptor.getAnchorConfig()) == null) {
            viewAnnotationAnchorConfigBuild = new ViewAnnotationAnchorConfig.Builder().anchor(ViewAnnotationAnchor.CENTER).build();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[viewAnnotationAnchorConfigBuild.getAnchor().ordinal()]) {
            case 1:
                rect.offset(0, iDoubleValue2);
                break;
            case 2:
                rect.offset(iDoubleValue, iDoubleValue2);
                break;
            case 3:
                rect.offset(i13, iDoubleValue2);
                break;
            case 4:
                rect.offset(0, i14);
                break;
            case 5:
                rect.offset(iDoubleValue, i14);
                break;
            case 6:
                rect.offset(i13, i14);
                break;
            case 7:
                rect.offset(iDoubleValue, 0);
                break;
            case 8:
                rect.offset(i13, 0);
                break;
            default:
                rect.offset(0, 0);
                break;
        }
        rect.offset((int) viewAnnotationAnchorConfigBuild.getOffsetX(), (int) viewAnnotationAnchorConfigBuild.getOffsetY());
        return rect;
    }

    public static /* synthetic */ void getViewUpdatedListenerSet$maps_sdk_release$annotations() {
    }

    private final CameraOptions invokeCallbackAndReturn(CameraOptions camera, Function1 callback) {
        CameraOptions cameraOptionsBuild;
        if (callback != null) {
            if (camera == null) {
                cameraOptionsBuild = new CameraOptions.Builder().build();
                AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
            } else {
                cameraOptionsBuild = camera;
            }
            callback.invoke(cameraOptionsBuild);
        }
        return camera;
    }

    private final void measureView(View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        boolean z4 = view.getTag(C5489R.id.composeView) != null;
        if (z4) {
            this.viewAnnotationsLayout.addView(view);
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (z4) {
            this.viewAnnotationsLayout.removeView(view);
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void notifyAnchorCoordinateListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (AbstractC22676k.m65745e(positionDescriptor != null ? positionDescriptor.getAnchorCoordinate() : null, newPositionDescriptor.getAnchorCoordinate())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            Point anchorCoordinate = newPositionDescriptor.getAnchorCoordinate();
            AbstractC22676k.m65749i(anchorCoordinate, "newPositionDescriptor.anchorCoordinate");
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorCoordinateUpdated(view, anchorCoordinate);
        }
    }

    private final void notifyAnchorListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (AbstractC22676k.m65745e(positionDescriptor != null ? positionDescriptor.getAnchorConfig() : null, newPositionDescriptor.getAnchorConfig())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ViewAnnotationAnchorConfig anchorConfig = newPositionDescriptor.getAnchorConfig();
            AbstractC22676k.m65749i(anchorConfig, "newPositionDescriptor.anchorConfig");
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorUpdated(view, anchorConfig);
        }
    }

    private final void notifyPositionListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (AbstractC22676k.m65745e(positionDescriptor != null ? positionDescriptor.getLeftTopCoordinate() : null, newPositionDescriptor.getLeftTopCoordinate())) {
            DelegatingViewAnnotationPositionDescriptor positionDescriptor2 = viewAnnotation.getPositionDescriptor();
            if (AbstractC22676k.m65741a(positionDescriptor2 != null ? Double.valueOf(positionDescriptor2.getWidth()) : null, newPositionDescriptor.getWidth())) {
                DelegatingViewAnnotationPositionDescriptor positionDescriptor3 = viewAnnotation.getPositionDescriptor();
                if (AbstractC22676k.m65741a(positionDescriptor3 != null ? Double.valueOf(positionDescriptor3.getHeight()) : null, newPositionDescriptor.getHeight())) {
                    return;
                }
            }
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ScreenCoordinate leftTopCoordinate = newPositionDescriptor.getLeftTopCoordinate();
            AbstractC22676k.m65749i(leftTopCoordinate, "newPositionDescriptor.leftTopCoordinate");
            onViewAnnotationUpdatedListener.onViewAnnotationPositionUpdated(view, leftTopCoordinate, newPositionDescriptor.getWidth(), newPositionDescriptor.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDelegatingViewAnnotationPositionsUpdate$lambda$20(ViewAnnotationManagerImpl this$0, List immutableUpdatedPositionDescriptorsCopy, long j7) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(immutableUpdatedPositionDescriptorsCopy, "$immutableUpdatedPositionDescriptorsCopy");
        this$0.positionAnnotationViews(immutableUpdatedPositionDescriptorsCopy);
    }

    private final void positionAnnotationViews(List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
        boolean zNeedToReorderZ$maps_sdk_release = INSTANCE.needToReorderZ$maps_sdk_release(this.currentPositionDescriptors, updatedPositionDescriptors);
        this.currentPositionDescriptors = updatedPositionDescriptors;
        for (DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor : updatedPositionDescriptors) {
            ViewAnnotation viewAnnotation = this.viewAnnotations.get(delegatingViewAnnotationPositionDescriptor.getIdentifier());
            if (viewAnnotation != null) {
                View view = viewAnnotation.getView();
                view.setTranslationX((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getX());
                view.setTranslationY((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getY());
                ViewGroup.LayoutParams viewLayoutParams = viewAnnotation.getViewLayoutParams();
                if (viewAnnotation.getMeasuredWidth() == -1) {
                    viewLayoutParams.width = (int) delegatingViewAnnotationPositionDescriptor.getWidth();
                }
                if (viewAnnotation.getMeasuredHeight() == -1) {
                    viewLayoutParams.height = (int) delegatingViewAnnotationPositionDescriptor.getHeight();
                }
                if (!viewAnnotation.isVisible() && this.viewAnnotationsLayout.indexOfChild(viewAnnotation.getView()) == -1) {
                    viewAnnotation.setPositioned(true);
                    this.viewAnnotationsLayout.addView(viewAnnotation.getView(), viewAnnotation.getViewLayoutParams());
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, viewAnnotation.getView().getVisibility() == 0 ? ViewAnnotationVisibility.VISIBLE_AND_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                }
                if (!viewAnnotation.isPositioned()) {
                    viewAnnotation.setPositioned(true);
                    viewAnnotation.getView().setVisibility(0);
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, ViewAnnotationVisibility.VISIBLE_AND_POSITIONED);
                }
                notifyAnchorListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyAnchorCoordinateListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                viewAnnotation.setPositionDescriptor(delegatingViewAnnotationPositionDescriptor);
                if (zNeedToReorderZ$maps_sdk_release) {
                    viewAnnotation.getView().bringToFront();
                }
            }
        }
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            if (entry.getValue().getView().getVisibility() == 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            List<DelegatingViewAnnotationPositionDescriptor> list = this.currentPositionDescriptors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!AbstractC22676k.m65745e(((DelegatingViewAnnotationPositionDescriptor) it.next()).getIdentifier(), entry2.getKey()));
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            ViewAnnotation viewAnnotation2 = (ViewAnnotation) ((Map.Entry) it3.next()).getValue();
            this.viewAnnotationsLayout.removeView(viewAnnotation2.getView());
            updateVisibilityAndNotifyUpdateListeners(viewAnnotation2, ViewAnnotationVisibility.INVISIBLE);
        }
    }

    private final void prepareViewAnnotation(View inflatedView, ViewAnnotationOptions options) {
        measureView(inflatedView);
        ViewGroup.LayoutParams layoutParams = inflatedView.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int measuredWidth = layoutParams.width;
        if (measuredWidth < 0) {
            measuredWidth = inflatedView.getMeasuredWidth();
        }
        int measuredHeight = layoutParams.height;
        if (measuredHeight < 0) {
            measuredHeight = inflatedView.getMeasuredHeight();
        }
        ViewAnnotationOptions.Builder builder = options.toBuilder();
        Double width = options.getWidth();
        if (width == null) {
            width = Double.valueOf(measuredWidth);
        }
        ViewAnnotationOptions.Builder builderWidth = builder.width(width);
        Double height = options.getHeight();
        if (height == null) {
            height = Double.valueOf(measuredHeight);
        }
        ViewAnnotationOptions updatedOptions = builderWidth.height(height).build();
        boolean z4 = options.getVisible() == null;
        ViewAnnotationVisibility viewAnnotationVisibility = ViewAnnotationVisibility.INITIAL;
        if (options.getWidth() != null) {
            measuredWidth = -1;
        }
        ViewAnnotation viewAnnotation = new ViewAnnotation(inflatedView, layoutParams, null, z4, viewAnnotationVisibility, measuredWidth, options.getHeight() != null ? -1 : measuredHeight, null, false, null, 516, null);
        viewAnnotation.setAttachStateListener(buildAttachStateListener(viewAnnotation.getView(), buildGlobalLayoutListener(viewAnnotation), buildDrawListener(viewAnnotation)));
        inflatedView.addOnAttachStateChangeListener(viewAnnotation.getAttachStateListener());
        this.viewAnnotations.put(viewAnnotation.getId(), viewAnnotation);
        MapboxMap mapboxMap = this.mapboxMap;
        String id4 = viewAnnotation.getId();
        AbstractC22676k.m65749i(updatedOptions, "updatedOptions");
        Expected expectedAddViewAnnotation$maps_sdk_release = mapboxMap.addViewAnnotation$maps_sdk_release(id4, updatedOptions);
        if (expectedAddViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedAddViewAnnotation$maps_sdk_release.getError());
        }
        expectedAddViewAnnotation$maps_sdk_release.getValue();
    }

    private final void remove(ViewAnnotation annotation) {
        this.viewAnnotationsLayout.removeView(annotation.getView());
        updateVisibilityAndNotifyUpdateListeners(annotation, ViewAnnotationVisibility.INVISIBLE);
        View.OnAttachStateChangeListener attachStateListener = annotation.getAttachStateListener();
        if (attachStateListener != null) {
            attachStateListener.onViewDetachedFromWindow(annotation.getView());
        }
        annotation.getView().removeOnAttachStateChangeListener(annotation.getAttachStateListener());
        annotation.setAttachStateListener(null);
        Expected expectedRemoveViewAnnotation$maps_sdk_release = this.mapboxMap.removeViewAnnotation$maps_sdk_release(annotation.getId());
        if (expectedRemoveViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedRemoveViewAnnotation$maps_sdk_release.getError());
        }
        expectedRemoveViewAnnotation$maps_sdk_release.getValue();
    }

    private final void updateVisibilityAndNotifyUpdateListeners(ViewAnnotation annotation, ViewAnnotationVisibility currentVisibility) {
        if (annotation.getVisibility() != currentVisibility) {
            if (annotation.getVisibility() == ViewAnnotationVisibility.INITIAL && currentVisibility == ViewAnnotationVisibility.INVISIBLE) {
                return;
            }
            boolean zIsVisible = annotation.isVisible();
            boolean z4 = currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
            annotation.setVisibility(currentVisibility);
            if (this.viewUpdatedListenerSet.isEmpty() || z4 == zIsVisible) {
                return;
            }
            Iterator<T> it = this.viewUpdatedListenerSet.iterator();
            while (it.hasNext()) {
                ((OnViewAnnotationUpdatedListener) it.next()).onViewAnnotationVisibilityUpdated(annotation.getView(), z4);
            }
        }
    }

    private final void validateOptions(ViewAnnotationOptions options) {
        if (options.getAnnotatedFeature() == null) {
            throw new IllegalArgumentException(EXCEPTION_TEXT_FEATURE_IS_NULL);
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.viewUpdatedListenerSet.add(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(int resId, ViewAnnotationOptions options, AbstractC36624a asyncInflater, Function1 asyncInflateCallback) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(asyncInflater, "asyncInflater");
        throw null;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    @MapboxDelicateApi
    public CameraOptions cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(annotations, "annotations");
        return cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, null);
    }

    public final void destroy() {
        this.mapboxMap.setViewAnnotationPositionsUpdateListener$maps_sdk_release(null);
        this.viewUpdatedListenerSet.clear();
        removeAllViewAnnotations();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public Map<View, ViewAnnotationOptions> getAnnotations() {
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ViewAnnotation value = it.next().getValue();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(value.getId());
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
            C23465k c23465k = viewAnnotationOptions != null ? new C23465k(value.getView(), viewAnnotationOptions) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature) {
        AbstractC22676k.m65750j(annotatedLayerFeature, "annotatedLayerFeature");
        return (View) findByAnnotatedLayerFeature(annotatedLayerFeature).f92937w;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public HashSet<String> getViewAnnotationAvoidLayers() {
        return this.mapboxMap.getViewAnnotationAvoidLayers$maps_sdk_release();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature) {
        AbstractC22676k.m65750j(annotatedLayerFeature, "annotatedLayerFeature");
        return (ViewAnnotationOptions) findByAnnotatedLayerFeature(annotatedLayerFeature).f92938x;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationUpdateMode getViewAnnotationUpdateMode() {
        return this.renderThread.getViewAnnotationMode();
    }

    public final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> getViewUpdatedListenerSet$maps_sdk_release() {
        return this.viewUpdatedListenerSet;
    }

    @Override // com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener
    public void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> positions) {
        AbstractC22676k.m65750j(positions, "positions");
        if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
            final List<DelegatingViewAnnotationPositionDescriptor> list = this.updatedPositionDescriptors;
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.mapbox.maps.viewannotation.a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    ViewAnnotationManagerImpl.onDelegatingViewAnnotationPositionsUpdate$lambda$20(this.f22068w, list, j7);
                }
            });
        } else {
            this.renderThread.setNeedViewAnnotationSync$maps_sdk_release(true);
            this.updatedPositionDescriptors = positions;
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeAllViewAnnotations() {
        Iterator<Map.Entry<String, ViewAnnotation>> it = this.viewAnnotations.entrySet().iterator();
        while (it.hasNext()) {
            remove(it.next().getValue());
            it.remove();
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.viewUpdatedListenerSet.remove(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean removeViewAnnotation(View view) {
        Object next;
        AbstractC22676k.m65750j(view, "view");
        Iterator<T> it = this.viewAnnotations.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ViewAnnotation) ((Map.Entry) next).getValue()).getView(), view));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        String str = (String) entry.getKey();
        ViewAnnotation viewAnnotation = (ViewAnnotation) entry.getValue();
        this.viewAnnotations.remove(str);
        remove(viewAnnotation);
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationAvoidLayers(HashSet<String> value) {
        AbstractC22676k.m65750j(value, "value");
        this.mapboxMap.setViewAnnotationAvoidLayers$maps_sdk_release(value);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.renderThread.setViewAnnotationMode$maps_sdk_release(mode);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean updateViewAnnotation(View view, ViewAnnotationOptions options) {
        Object next;
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(options, "options");
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ViewAnnotation) next).getView(), view));
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return false;
        }
        viewAnnotation.setHandleVisibilityAutomatically(options.getVisible() == null);
        if (options.getWidth() != null) {
            viewAnnotation.setMeasuredWidth(-1);
        }
        if (options.getHeight() != null) {
            viewAnnotation.setMeasuredHeight(-1);
        }
        Expected expectedUpdateViewAnnotation$maps_sdk_release = this.mapboxMap.updateViewAnnotation$maps_sdk_release(viewAnnotation.getId(), options);
        if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View addViewAnnotation(int resId, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(options, "options");
        validateOptions(options);
        View view = LayoutInflater.from(this.viewAnnotationsLayout.getContext()).inflate(resId, (ViewGroup) this.viewAnnotationsLayout, false);
        AbstractC22676k.m65749i(view, "view");
        prepareViewAnnotation(view, options);
        return view;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, Function1 result) {
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(result, "result");
        cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, result);
    }

    public ViewAnnotationManagerImpl(MapView mapView, FrameLayout viewAnnotationsLayout) {
        AbstractC22676k.m65750j(mapView, "mapView");
        AbstractC22676k.m65750j(viewAnnotationsLayout, "viewAnnotationsLayout");
        this.viewAnnotationsLayout = viewAnnotationsLayout;
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        this.mapboxMap = mapboxMapDeprecated;
        this.renderThread = mapView.getMapController$maps_sdk_release().getRenderer().getRenderThread$maps_sdk_release();
        this.pixelRatio = mapView.getResources().getDisplayMetrics().density;
        this.viewAnnotations = new LinkedHashMap();
        this.viewUpdatedListenerSet = new CopyOnWriteArraySet<>();
        C25271y c25271y = C25271y.f99162w;
        this.updatedPositionDescriptors = c25271y;
        this.currentPositionDescriptors = c25271y;
        viewAnnotationsLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mapView.addView(viewAnnotationsLayout, 1);
        mapView.requestDisallowInterceptTouchEvent(false);
        mapboxMapDeprecated.setViewAnnotationPositionsUpdateListener$maps_sdk_release(this);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(View view) {
        Object next;
        AbstractC22676k.m65750j(view, "view");
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ViewAnnotation) next).getView(), view));
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return null;
        }
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (!viewAnnotationOptions$maps_sdk_release.isError()) {
            return (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        }
        throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(View view, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(options, "options");
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(it.next().getValue().getView(), view)) {
                    throw new MapboxViewAnnotationException("Trying to add view annotation that was already added before! Please consider deleting annotation view (" + view + ") beforehand.");
                }
            }
        }
        validateOptions(options);
        prepareViewAnnotation(view, options);
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\b\u0082\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003Jq\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\rHÖ\u0001J\t\u0010C\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006D"}, m65681d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "", ProfileAnalyticsKt.VIEW, "Landroid/view/View;", "viewLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "attachStateListener", "Landroid/view/View$OnAttachStateChangeListener;", "handleVisibilityAutomatically", "", "visibility", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "measuredWidth", "", "measuredHeight", "positionDescriptor", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "isPositioned", "id", "", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View$OnAttachStateChangeListener;ZLcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;IILcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;ZLjava/lang/String;)V", "getAttachStateListener", "()Landroid/view/View$OnAttachStateChangeListener;", "setAttachStateListener", "(Landroid/view/View$OnAttachStateChangeListener;)V", "getHandleVisibilityAutomatically", "()Z", "setHandleVisibilityAutomatically", "(Z)V", "getId", "()Ljava/lang/String;", "setPositioned", "isVisible", "getMeasuredHeight", "()I", "setMeasuredHeight", "(I)V", "getMeasuredWidth", "setMeasuredWidth", "getPositionDescriptor", "()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "setPositionDescriptor", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V", "getView", "()Landroid/view/View;", "getViewLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "setViewLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "getVisibility", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "setVisibility", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final /* data */ class ViewAnnotation {
        private View.OnAttachStateChangeListener attachStateListener;
        private boolean handleVisibilityAutomatically;
        private final String id;
        private boolean isPositioned;
        private int measuredHeight;
        private int measuredWidth;
        private DelegatingViewAnnotationPositionDescriptor positionDescriptor;
        private final View view;
        private ViewGroup.LayoutParams viewLayoutParams;
        private ViewAnnotationVisibility visibility;

        public ViewAnnotation(View view, ViewGroup.LayoutParams viewLayoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z4, ViewAnnotationVisibility visibility, int i13, int i14, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z13, String id4) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(viewLayoutParams, "viewLayoutParams");
            AbstractC22676k.m65750j(visibility, "visibility");
            AbstractC22676k.m65750j(id4, "id");
            this.view = view;
            this.viewLayoutParams = viewLayoutParams;
            this.attachStateListener = onAttachStateChangeListener;
            this.handleVisibilityAutomatically = z4;
            this.visibility = visibility;
            this.measuredWidth = i13;
            this.measuredHeight = i14;
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
            this.isPositioned = z13;
            this.id = id4;
        }

        public static /* synthetic */ ViewAnnotation copy$default(ViewAnnotation viewAnnotation, View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z4, ViewAnnotationVisibility viewAnnotationVisibility, int i13, int i14, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z13, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                view = viewAnnotation.view;
            }
            if ((i15 & 2) != 0) {
                layoutParams = viewAnnotation.viewLayoutParams;
            }
            if ((i15 & 4) != 0) {
                onAttachStateChangeListener = viewAnnotation.attachStateListener;
            }
            if ((i15 & 8) != 0) {
                z4 = viewAnnotation.handleVisibilityAutomatically;
            }
            if ((i15 & 16) != 0) {
                viewAnnotationVisibility = viewAnnotation.visibility;
            }
            if ((i15 & 32) != 0) {
                i13 = viewAnnotation.measuredWidth;
            }
            if ((i15 & 64) != 0) {
                i14 = viewAnnotation.measuredHeight;
            }
            if ((i15 & 128) != 0) {
                delegatingViewAnnotationPositionDescriptor = viewAnnotation.positionDescriptor;
            }
            if ((i15 & 256) != 0) {
                z13 = viewAnnotation.isPositioned;
            }
            if ((i15 & 512) != 0) {
                str = viewAnnotation.id;
            }
            boolean z14 = z13;
            String str2 = str;
            int i16 = i14;
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor2 = delegatingViewAnnotationPositionDescriptor;
            ViewAnnotationVisibility viewAnnotationVisibility2 = viewAnnotationVisibility;
            int i17 = i13;
            return viewAnnotation.copy(view, layoutParams, onAttachStateChangeListener, z4, viewAnnotationVisibility2, i17, i16, delegatingViewAnnotationPositionDescriptor2, z14, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final View getView() {
            return this.view;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsPositioned() {
            return this.isPositioned;
        }

        public final ViewAnnotation copy(View view, ViewGroup.LayoutParams viewLayoutParams, View.OnAttachStateChangeListener attachStateListener, boolean handleVisibilityAutomatically, ViewAnnotationVisibility visibility, int measuredWidth, int measuredHeight, DelegatingViewAnnotationPositionDescriptor positionDescriptor, boolean isPositioned, String id4) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(viewLayoutParams, "viewLayoutParams");
            AbstractC22676k.m65750j(visibility, "visibility");
            AbstractC22676k.m65750j(id4, "id");
            return new ViewAnnotation(view, viewLayoutParams, attachStateListener, handleVisibilityAutomatically, visibility, measuredWidth, measuredHeight, positionDescriptor, isPositioned, id4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAnnotation)) {
                return false;
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) other;
            return AbstractC22676k.m65745e(this.view, viewAnnotation.view) && AbstractC22676k.m65745e(this.viewLayoutParams, viewAnnotation.viewLayoutParams) && AbstractC22676k.m65745e(this.attachStateListener, viewAnnotation.attachStateListener) && this.handleVisibilityAutomatically == viewAnnotation.handleVisibilityAutomatically && this.visibility == viewAnnotation.visibility && this.measuredWidth == viewAnnotation.measuredWidth && this.measuredHeight == viewAnnotation.measuredHeight && AbstractC22676k.m65745e(this.positionDescriptor, viewAnnotation.positionDescriptor) && this.isPositioned == viewAnnotation.isPositioned && AbstractC22676k.m65745e(this.id, viewAnnotation.id);
        }

        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        public final String getId() {
            return this.id;
        }

        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        public final View getView() {
            return this.view;
        }

        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        public int hashCode() {
            int iHashCode = (this.viewLayoutParams.hashCode() + (this.view.hashCode() * 31)) * 31;
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
            int iHashCode2 = (iHashCode + (onAttachStateChangeListener == null ? 0 : onAttachStateChangeListener.hashCode())) * 31;
            boolean z4 = this.handleVisibilityAutomatically;
            ?? r10 = z4;
            if (z4) {
                r10 = 1;
            }
            int iM30448b = AbstractC11266d.m30448b(this.measuredHeight, AbstractC11266d.m30448b(this.measuredWidth, (this.visibility.hashCode() + ((iHashCode2 + r10) * 31)) * 31, 31), 31);
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor = this.positionDescriptor;
            int iHashCode3 = (iM30448b + (delegatingViewAnnotationPositionDescriptor != null ? delegatingViewAnnotationPositionDescriptor.hashCode() : 0)) * 31;
            boolean z13 = this.isPositioned;
            return this.id.hashCode() + ((iHashCode3 + (z13 ? 1 : z13)) * 31);
        }

        public final boolean isPositioned() {
            return this.isPositioned;
        }

        public final boolean isVisible() {
            ViewAnnotationVisibility viewAnnotationVisibility = this.visibility;
            return viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
        }

        public final void setAttachStateListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.attachStateListener = onAttachStateChangeListener;
        }

        public final void setHandleVisibilityAutomatically(boolean z4) {
            this.handleVisibilityAutomatically = z4;
        }

        public final void setMeasuredHeight(int i13) {
            this.measuredHeight = i13;
        }

        public final void setMeasuredWidth(int i13) {
            this.measuredWidth = i13;
        }

        public final void setPositionDescriptor(DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
        }

        public final void setPositioned(boolean z4) {
            this.isPositioned = z4;
        }

        public final void setViewLayoutParams(ViewGroup.LayoutParams layoutParams) {
            AbstractC22676k.m65750j(layoutParams, "<set-?>");
            this.viewLayoutParams = layoutParams;
        }

        public final void setVisibility(ViewAnnotationVisibility viewAnnotationVisibility) {
            AbstractC22676k.m65750j(viewAnnotationVisibility, "<set-?>");
            this.visibility = viewAnnotationVisibility;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("ViewAnnotation(view=");
            sb4.append(this.view);
            sb4.append(", viewLayoutParams=");
            sb4.append(this.viewLayoutParams);
            sb4.append(", attachStateListener=");
            sb4.append(this.attachStateListener);
            sb4.append(", handleVisibilityAutomatically=");
            sb4.append(this.handleVisibilityAutomatically);
            sb4.append(", visibility=");
            sb4.append(this.visibility);
            sb4.append(", measuredWidth=");
            sb4.append(this.measuredWidth);
            sb4.append(", measuredHeight=");
            sb4.append(this.measuredHeight);
            sb4.append(", positionDescriptor=");
            sb4.append(this.positionDescriptor);
            sb4.append(", isPositioned=");
            sb4.append(this.isPositioned);
            sb4.append(", id=");
            return AbstractC25012a.m73377j(sb4, this.id, ')');
        }

        public /* synthetic */ ViewAnnotation(View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z4, ViewAnnotationVisibility viewAnnotationVisibility, int i13, int i14, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z13, String str, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, layoutParams, (i15 & 4) != 0 ? null : onAttachStateChangeListener, z4, viewAnnotationVisibility, i13, i14, delegatingViewAnnotationPositionDescriptor, z13, (i15 & 512) != 0 ? AbstractC11895b.m31995n("randomUUID().toString()") : str);
        }
    }
}
