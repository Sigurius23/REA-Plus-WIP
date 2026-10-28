package com.mapbox.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.geojson.Point;
import com.mapbox.maps.attribution.AttributionLayout;
import com.mapbox.maps.attribution.AttributionMeasure;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.module.MapTelemetry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC30802r;
import p032bc.C2953i;
import p405pu.EnumC29546b;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000 \u0097\u00012\u00020\u0001:\u0004\u0097\u0001\u0098\u0001B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB/\b\u0012\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J9\u0010/\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u000204¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u00020 ¢\u0006\u0004\b;\u0010#J\r\u0010<\u001a\u00020 ¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020 ¢\u0006\u0004\b>\u0010=J'\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010@\u001a\u00020?2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020I2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020I2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020I2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ'\u0010^\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J'\u0010^\u001a\u00020\u00102\u0006\u0010a\u001a\u00020`2\u0006\u0010[\u001a\u00020Z2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\b^\u0010dJ\u001f\u0010g\u001a\u00020\u00102\u0006\u0010f\u001a\u00020e2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bg\u0010hJ'\u0010k\u001a\u00020\u00102\u0006\u0010f\u001a\u00020e2\u0006\u0010Y\u001a\u00020X2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ/\u0010m\u001a\u00020Z2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020X2\u0006\u0010f\u001a\u00020e2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bm\u0010nJ/\u0010t\u001a\u00020s2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020X2\u0006\u0010p\u001a\u00020o2\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bt\u0010uJ\u001f\u0010v\u001a\u00020 2\u0006\u0010Y\u001a\u00020X2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bv\u0010wJ/\u0010z\u001a\u00020\u00102\u0006\u0010x\u001a\u00020e2\u0006\u0010a\u001a\u00020`2\u0006\u0010j\u001a\u00020i2\u0006\u0010y\u001a\u00020\\H\u0002¢\u0006\u0004\bz\u0010{J\u001f\u0010}\u001a\u00020|2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\b}\u0010~J*\u0010\u0080\u0001\u001a\u00020q2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010x\u001a\u00020e2\u0006\u0010\u007f\u001a\u00020eH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0084\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R5\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e8@@@X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010\u0012R\u0017\u0010\u0090\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020I0A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, m65681d2 = {"Lcom/mapbox/maps/Snapshotter;", "", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapSnapshotOptions;", "options", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "overlayOptions", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;)V", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/maps/MapSnapshotter;", "coreSnapshotter", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;Lcom/mapbox/maps/MapSnapshotter;)V", "Lcom/mapbox/maps/SnapshotStyleListener;", "listener", "Ll83/a0;", "setStyleListener", "(Lcom/mapbox/maps/SnapshotStyleListener;)V", "Lcom/mapbox/maps/SnapshotOverlayCallback;", "overlayCallback", "Lcom/mapbox/maps/SnapshotResultCallback;", "resultCallback", "start", "(Lcom/mapbox/maps/SnapshotOverlayCallback;Lcom/mapbox/maps/SnapshotResultCallback;)V", "cancel", "()V", "destroy", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "", "styleUri", "setStyleUri", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/EdgeInsets;", "padding", "", "bearing", "pitch", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "Lcom/mapbox/maps/Size;", "size", "setSize", "(Lcom/mapbox/maps/Size;)V", "getSize", "()Lcom/mapbox/maps/Size;", "styleJson", "setStyleJson", "getStyleJson", "()Ljava/lang/String;", "getStyleUri", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "dispatchTelemetryTurnstileEvent", "(Landroid/content/Context;)V", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "Lcom/mapbox/common/Cancelable;", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SnapshotOverlay;", "overlay", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "measure", "Lcom/mapbox/maps/attribution/AttributionLayout;", "layout", "drawAttribution", "(Lcom/mapbox/maps/SnapshotOverlay;Lcom/mapbox/maps/attribution/AttributionMeasure;Lcom/mapbox/maps/attribution/AttributionLayout;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/PointF;", "anchorPoint", "(Landroid/graphics/Canvas;Lcom/mapbox/maps/attribution/AttributionMeasure;Landroid/graphics/PointF;)V", "Landroid/graphics/Bitmap;", "snapshotBitmap", "addOverlay", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/SnapshotOverlay;)V", "", "margin", "drawOverlay", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/SnapshotOverlay;I)V", "getAttributionMeasure", "(Landroid/content/Context;Lcom/mapbox/maps/SnapshotOverlay;Landroid/graphics/Bitmap;I)Lcom/mapbox/maps/attribution/AttributionMeasure;", "", "shortText", "", "scale", "Landroid/widget/TextView;", "createTextView", "(Landroid/content/Context;Lcom/mapbox/maps/SnapshotOverlay;ZF)Landroid/widget/TextView;", "createAttributionString", "(Lcom/mapbox/maps/SnapshotOverlay;Z)Ljava/lang/String;", "snapshot", "placement", "drawLogo", "(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;ILcom/mapbox/maps/attribution/AttributionLayout;)V", "Lcom/mapbox/maps/Snapshotter$Logo;", "createScaledLogo", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Lcom/mapbox/maps/Snapshotter$Logo;", "logo", "calculateLogoScale", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)F", "requireCoreSnapshotter", "()Lcom/mapbox/maps/MapSnapshotter;", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/maps/MapSnapshotter;", "pixelRatio", "F", "mapSnapshotOptions", "Lcom/mapbox/maps/MapSnapshotOptions;", "<set-?>", "snapshotStyleCallback", "Lcom/mapbox/maps/SnapshotStyleListener;", "getSnapshotStyleCallback$maps_sdk_release", "()Lcom/mapbox/maps/SnapshotStyleListener;", "setSnapshotStyleCallback$maps_sdk_release", "snapshotOverlayOptions", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "cancelableEvents", "Ljava/util/List;", "loadingErrorCancelable", "Lcom/mapbox/common/Cancelable;", "styleLoadedCancelable", "Companion", "Logo", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class Snapshotter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Snapshotter";
    private List<Cancelable> cancelableEvents;
    private final WeakReference<Context> context;
    private MapSnapshotter coreSnapshotter;
    private Cancelable loadingErrorCancelable;
    private final MapSnapshotOptions mapSnapshotOptions;
    private final float pixelRatio;
    private final SnapshotOverlayOptions snapshotOverlayOptions;
    private SnapshotStyleListener snapshotStyleCallback;
    private Cancelable styleLoadedCancelable;

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0015\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/mapbox/maps/Snapshotter$Companion;", "", "<init>", "()V", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "callback", "Ll83/a0;", "clearData", "(Lcom/mapbox/maps/AsyncOperationResultCallback;)V", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapSnapshotOptions;", "options", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "overlayOptions", "Lcom/mapbox/maps/MapSnapshotter;", "coreSnapshotter", "Lcom/mapbox/maps/Snapshotter;", "invoke$maps_sdk_release", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;Lcom/mapbox/maps/MapSnapshotter;)Lcom/mapbox/maps/Snapshotter;", "invoke", "", "TAG", "Ljava/lang/String;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearData(AsyncOperationResultCallback callback) {
            AbstractC22676k.m65750j(callback, "callback");
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ Snapshotter invoke$maps_sdk_release(WeakReference context, MapSnapshotOptions options, SnapshotOverlayOptions overlayOptions, MapSnapshotter coreSnapshotter) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(options, "options");
            AbstractC22676k.m65750j(overlayOptions, "overlayOptions");
            AbstractC22676k.m65750j(coreSnapshotter, "coreSnapshotter");
            return new Snapshotter(context, options, overlayOptions, coreSnapshotter, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lcom/mapbox/maps/Snapshotter$Logo;", "", "large", "Landroid/graphics/Bitmap;", "small", "scale", "", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;F)V", "getLarge", "()Landroid/graphics/Bitmap;", "getScale", "()F", "getSmall", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final /* data */ class Logo {
        private final Bitmap large;
        private final float scale;
        private final Bitmap small;

        public Logo(Bitmap large, Bitmap small, float f13) {
            AbstractC22676k.m65750j(large, "large");
            AbstractC22676k.m65750j(small, "small");
            this.large = large;
            this.small = small;
            this.scale = f13;
        }

        public static /* synthetic */ Logo copy$default(Logo logo, Bitmap bitmap, Bitmap bitmap2, float f13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bitmap = logo.large;
            }
            if ((i13 & 2) != 0) {
                bitmap2 = logo.small;
            }
            if ((i13 & 4) != 0) {
                f13 = logo.scale;
            }
            return logo.copy(bitmap, bitmap2, f13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getLarge() {
            return this.large;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Bitmap getSmall() {
            return this.small;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getScale() {
            return this.scale;
        }

        public final Logo copy(Bitmap large, Bitmap small, float scale) {
            AbstractC22676k.m65750j(large, "large");
            AbstractC22676k.m65750j(small, "small");
            return new Logo(large, small, scale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) other;
            return AbstractC22676k.m65745e(this.large, logo.large) && AbstractC22676k.m65745e(this.small, logo.small) && Float.compare(this.scale, logo.scale) == 0;
        }

        public final Bitmap getLarge() {
            return this.large;
        }

        public final float getScale() {
            return this.scale;
        }

        public final Bitmap getSmall() {
            return this.small;
        }

        public int hashCode() {
            return Float.hashCode(this.scale) + ((this.small.hashCode() + (this.large.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Logo(large=");
            sb4.append(this.large);
            sb4.append(", small=");
            sb4.append(this.small);
            sb4.append(", scale=");
            return AbstractC30802r.m94763l(sb4, this.scale, ')');
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.Snapshotter$dispatchTelemetryTurnstileEvent$1 */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpu/b;", "it", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "invoke", "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54911 extends AbstractC22680m implements Function1 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54911(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final ModuleProviderArgument[] invoke(EnumC29546b it) {
            AbstractC22676k.m65750j(it, "it");
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, this.$context.getApplicationContext())};
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Snapshotter(Context context, MapSnapshotOptions options) {
        this(context, options, (SnapshotOverlayOptions) null, 4, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(options, "options");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WeakReference weakSelf, MapLoadingError it) {
        AbstractC22676k.m65750j(weakSelf, "$weakSelf");
        AbstractC22676k.m65750j(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter != null) {
            Cancelable cancelable = snapshotter.loadingErrorCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            SnapshotStyleListener snapshotStyleListener = snapshotter.snapshotStyleCallback;
            if (snapshotStyleListener != null) {
                String message = it.getMessage();
                AbstractC22676k.m65749i(message, "it.message");
                snapshotStyleListener.onDidFailLoadingStyle(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(WeakReference weakSelf, StyleImageMissing it) {
        SnapshotStyleListener snapshotStyleListener;
        AbstractC22676k.m65750j(weakSelf, "$weakSelf");
        AbstractC22676k.m65750j(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        String imageId = it.getImageId();
        AbstractC22676k.m65749i(imageId, "it.imageId");
        snapshotStyleListener.onStyleImageMissing(imageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(WeakReference weakSelf, StyleDataLoaded it) {
        Snapshotter snapshotter;
        MapSnapshotter mapSnapshotter;
        SnapshotStyleListener snapshotStyleListener;
        AbstractC22676k.m65750j(weakSelf, "$weakSelf");
        AbstractC22676k.m65750j(it, "it");
        if (it.getType() != StyleDataLoadedType.STYLE || (snapshotter = (Snapshotter) weakSelf.get()) == null || (mapSnapshotter = snapshotter.coreSnapshotter) == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        snapshotStyleListener.onDidFinishLoadingStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new C5538l(7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(WeakReference weakSelf, StyleLoaded it) {
        SnapshotStyleListener snapshotStyleListener;
        AbstractC22676k.m65750j(weakSelf, "$weakSelf");
        AbstractC22676k.m65750j(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter != null) {
            MapSnapshotter mapSnapshotter = snapshotter.coreSnapshotter;
            if (mapSnapshotter != null && (snapshotStyleListener = snapshotter.snapshotStyleCallback) != null) {
                snapshotStyleListener.onDidFullyLoadStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new C5538l(8)));
            }
            Cancelable cancelable = snapshotter.styleLoadedCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    private final void addOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay) {
        Context context = this.context.get();
        if (context != null) {
            drawOverlay(snapshotBitmap, overlay, ((int) context.getResources().getDisplayMetrics().density) * 4);
        }
    }

    private final float calculateLogoScale(Context context, Bitmap snapshot, Bitmap logo) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC22676k.m65749i(displayMetrics, "context.resources.displayMetrics");
        float fMin = Math.min((logo.getWidth() / (displayMetrics.widthPixels / snapshot.getWidth())) / logo.getWidth(), (logo.getHeight() / (displayMetrics.heightPixels / snapshot.getHeight())) / logo.getHeight()) * 2;
        if (fMin > 1.0f) {
            return 1.0f;
        }
        if (fMin < 0.6f) {
            return 0.6f;
        }
        return fMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$20(String it) {
        AbstractC22676k.m65750j(it, "it");
        MapboxLogger.logE(TAG, "Error occurred in synchronous cameraForCoordinates: " + it + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
        return cameraOptionsBuild;
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    private final String createAttributionString(SnapshotOverlay overlay, boolean shortText) {
        Context context = this.context.get();
        if (context == null) {
            return "";
        }
        AttributionParser.Options options = new AttributionParser.Options(context);
        Object[] array = overlay.getAttributions().toArray(new String[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return options.withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withCopyrightSign(false).withImproveMap(false).withMapboxPrivacyPolicy(false).withTelemetryAttribution(false).withMapboxGeofencingConsent(false).build().createAttributionString(shortText);
    }

    private final Logo createScaledLogo(Context context, Bitmap snapshotBitmap) {
        Bitmap logo = BitmapFactory.decodeResource(context.getResources(), C5489R.drawable.mapbox_logo_icon, null);
        AbstractC22676k.m65749i(logo, "logo");
        float fCalculateLogoScale = calculateLogoScale(context, snapshotBitmap, logo);
        Matrix matrix = new Matrix();
        matrix.postScale(fCalculateLogoScale, fCalculateLogoScale);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C5489R.drawable.mapbox_logo_helmet, null);
        Bitmap large = Bitmap.createBitmap(logo, 0, 0, logo.getWidth(), logo.getHeight(), matrix, true);
        Bitmap small = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, true);
        AbstractC22676k.m65749i(large, "large");
        AbstractC22676k.m65749i(small, "small");
        return new Logo(large, small, fCalculateLogoScale);
    }

    private final TextView createTextView(Context context, SnapshotOverlay overlay, boolean shortText, float scale) {
        Resources resources = context.getResources();
        int i13 = C5489R.color.mapbox_gray_dark;
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        int iM109068d = AbstractC34514b.m109068d(resources, i13, theme);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        String strCreateAttributionString = createAttributionString(overlay, shortText);
        if (strCreateAttributionString.length() > 0) {
            textView.setSingleLine(true);
            textView.setTextSize(10 * scale);
            textView.setTextColor(iM109068d);
            textView.setBackgroundResource(C5489R.drawable.mapbox_rounded_corner);
            textView.setText(Html.fromHtml(strCreateAttributionString));
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        }
        return textView;
    }

    private final void dispatchTelemetryTurnstileEvent(Context context) {
        ((MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(EnumC29546b.MapTelemetry, new C54911(context))).onAppUserTurnstileEvent();
    }

    private final void drawAttribution(SnapshotOverlay overlay, AttributionMeasure measure, AttributionLayout layout) {
        PointF anchorPoint = layout.getAnchorPoint();
        if (anchorPoint != null) {
            drawAttribution(overlay.getCanvas(), measure, anchorPoint);
            return;
        }
        MapboxLogger.logE(TAG, "Could not generate attribution for snapshot size: " + overlay.getCanvas().getWidth() + 'x' + overlay.getCanvas().getHeight() + ". You are required to provide your own attribution for the used sources: " + overlay.getAttributions());
    }

    private final void drawLogo(Bitmap snapshot, Canvas canvas, int margin, AttributionLayout placement) {
        Bitmap logo = placement.getLogo();
        if (logo != null) {
            canvas.drawBitmap(logo, margin, (snapshot.getHeight() - logo.getHeight()) - margin, (Paint) null);
        }
    }

    private final void drawOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay, int margin) {
        AttributionMeasure attributionMeasure;
        AttributionLayout attributionLayoutMeasure;
        Context context = this.context.get();
        if (context == null || (attributionLayoutMeasure = (attributionMeasure = getAttributionMeasure(context, overlay, snapshotBitmap, margin)).measure()) == null) {
            return;
        }
        if (this.snapshotOverlayOptions.getShowLogo()) {
            drawLogo(snapshotBitmap, overlay.getCanvas(), margin, attributionLayoutMeasure);
        }
        if (this.snapshotOverlayOptions.getShowAttributes()) {
            drawAttribution(overlay, attributionMeasure, attributionLayoutMeasure);
        }
    }

    private final AttributionMeasure getAttributionMeasure(Context context, SnapshotOverlay overlay, Bitmap snapshotBitmap, int margin) {
        Logo logoCreateScaledLogo = createScaledLogo(context, snapshotBitmap);
        return new AttributionMeasure(snapshotBitmap, logoCreateScaledLogo.getLarge(), logoCreateScaledLogo.getSmall(), createTextView(context, overlay, false, logoCreateScaledLogo.getScale()), createTextView(context, overlay, true, logoCreateScaledLogo.getScale()), margin);
    }

    private final MapSnapshotter requireCoreSnapshotter() {
        MapSnapshotter mapSnapshotter = this.coreSnapshotter;
        if (mapSnapshotter != null) {
            return mapSnapshotter;
        }
        throw new SnapshotterDestroyedException();
    }

    public static /* synthetic */ void start$default(Snapshotter snapshotter, SnapshotOverlayCallback snapshotOverlayCallback, SnapshotResultCallback snapshotResultCallback, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i13 & 1) != 0) {
            snapshotOverlayCallback = null;
        }
        snapshotter.start(snapshotOverlayCallback, snapshotResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$17(Snapshotter this$0, SnapshotResultCallback resultCallback, SnapshotOverlayCallback snapshotOverlayCallback, Expected result) {
        C23454a0 c23454a0;
        Bitmap bitmapCreateBitmap;
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(resultCallback, "$resultCallback");
        AbstractC22676k.m65750j(result, "result");
        if (!result.isValue()) {
            String str = (String) result.getError();
            if (str == null) {
                str = "Undefined error happened.";
            }
            resultCallback.onSnapshotResult(null, str);
            return;
        }
        final MapSnapshot mapSnapshot = (MapSnapshot) result.getValue();
        if (mapSnapshot != null) {
            Image imageMoveImage = mapSnapshot.moveImage();
            if (imageMoveImage != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(imageMoveImage.getWidth(), imageMoveImage.getHeight(), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(imageMoveImage.getData().getBuffer());
            } else {
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap == null) {
                resultCallback.onSnapshotResult(null, "Moving image data failed!");
            } else {
                final Canvas canvas = new Canvas(bitmapCreateBitmap);
                SnapshotOverlay snapshotOverlay = new SnapshotOverlay(canvas, mapSnapshot) { // from class: com.mapbox.maps.Snapshotter$start$1$1$snapshotOverlay$1
                    final /* synthetic */ MapSnapshot $coreMapSnapshot;
                    private final List<String> attributions;
                    private final Canvas canvas;

                    {
                        this.$coreMapSnapshot = mapSnapshot;
                        this.canvas = canvas;
                        List<String> listAttributions = mapSnapshot.attributions();
                        AbstractC22676k.m65749i(listAttributions, "coreMapSnapshot.attributions()");
                        this.attributions = listAttributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Point coordinate(ScreenCoordinate screenCoordinate) {
                        AbstractC22676k.m65750j(screenCoordinate, "screenCoordinate");
                        Point pointCoordinate = this.$coreMapSnapshot.coordinate(screenCoordinate);
                        AbstractC22676k.m65749i(pointCoordinate, "coreMapSnapshot.coordinate(screenCoordinate)");
                        return pointCoordinate;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public List<String> getAttributions() {
                        return this.attributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Canvas getCanvas() {
                        return this.canvas;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public ScreenCoordinate screenCoordinate(Point coordinate) {
                        AbstractC22676k.m65750j(coordinate, "coordinate");
                        ScreenCoordinate screenCoordinate = this.$coreMapSnapshot.screenCoordinate(coordinate);
                        AbstractC22676k.m65749i(screenCoordinate, "coreMapSnapshot.screenCoordinate(coordinate)");
                        return screenCoordinate;
                    }
                };
                if (snapshotOverlayCallback != null) {
                    snapshotOverlayCallback.onSnapshotOverlay(snapshotOverlay);
                }
                this$0.addOverlay(bitmapCreateBitmap, snapshotOverlay);
                resultCallback.onSnapshotResult(bitmapCreateBitmap, null);
            }
            c23454a0 = C23454a0.f92919a;
        } else {
            c23454a0 = null;
        }
        if (c23454a0 == null) {
            resultCallback.onSnapshotResult(null, "Snapshot was empty.");
        }
    }

    private final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(mapLoadingErrorCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "requireCoreSnapshotter()…(mapLoadingErrorCallback)");
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleDataLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "requireCoreSnapshotter()…(styleDataLoadedCallback)");
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleImageMissingCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "requireCoreSnapshotter()…tyleImageMissingCallback)");
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "requireCoreSnapshotter()…ribe(styleLoadedCallback)");
        return cancelableSubscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets padding, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        MapSnapshotter mapSnapshotterRequireCoreSnapshotter = requireCoreSnapshotter();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.bearing(bearing);
        builder.pitch(pitch);
        CameraOptions cameraOptionsBuild = builder.build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
        CameraOptions valueOrElse = mapSnapshotterRequireCoreSnapshotter.cameraForCoordinates(coordinates, cameraOptionsBuild, padding, null, null).getValueOrElse(new C5538l(9));
        AbstractC22676k.m65749i(valueOrElse, "requireCoreSnapshotter()…e cameraOptions { }\n    }");
        return valueOrElse;
    }

    public final void cancel() {
        requireCoreSnapshotter().cancel();
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions options) {
        AbstractC22676k.m65750j(options, "options");
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = requireCoreSnapshotter().coordinateBoundsForCamera(options);
        AbstractC22676k.m65749i(coordinateBoundsCoordinateBoundsForCamera, "requireCoreSnapshotter()…eBoundsForCamera(options)");
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final void destroy() {
        cancel();
        Iterator<T> it = this.cancelableEvents.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableEvents.clear();
        Cancelable cancelable = this.loadingErrorCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        Cancelable cancelable2 = this.styleLoadedCancelable;
        if (cancelable2 != null) {
            cancelable2.cancel();
        }
        this.snapshotStyleCallback = null;
        this.coreSnapshotter = null;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = requireCoreSnapshotter().getCameraState();
        AbstractC22676k.m65749i(cameraState, "requireCoreSnapshotter().cameraState");
        return cameraState;
    }

    public final Size getSize() {
        Size size = requireCoreSnapshotter().getSize();
        AbstractC22676k.m65749i(size, "requireCoreSnapshotter().size");
        return size;
    }

    /* JADX INFO: renamed from: getSnapshotStyleCallback$maps_sdk_release, reason: from getter */
    public final /* synthetic */ SnapshotStyleListener getSnapshotStyleCallback() {
        return this.snapshotStyleCallback;
    }

    public final String getStyleJson() {
        String styleJSON = requireCoreSnapshotter().getStyleJSON();
        AbstractC22676k.m65749i(styleJSON, "requireCoreSnapshotter().styleJSON");
        return styleJSON;
    }

    public final String getStyleUri() {
        String styleURI = requireCoreSnapshotter().getStyleURI();
        AbstractC22676k.m65749i(styleURI, "requireCoreSnapshotter().styleURI");
        return styleURI;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        requireCoreSnapshotter().setCamera(cameraOptions);
    }

    public final void setSize(Size size) {
        AbstractC22676k.m65750j(size, "size");
        requireCoreSnapshotter().setSize(size);
    }

    public final /* synthetic */ void setSnapshotStyleCallback$maps_sdk_release(SnapshotStyleListener snapshotStyleListener) {
        this.snapshotStyleCallback = snapshotStyleListener;
    }

    public final void setStyleJson(String styleJson) {
        AbstractC22676k.m65750j(styleJson, "styleJson");
        requireCoreSnapshotter().setStyleJSON(styleJson);
    }

    public final void setStyleListener(SnapshotStyleListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.snapshotStyleCallback = listener;
    }

    public final void setStyleUri(String styleUri) {
        AbstractC22676k.m65750j(styleUri, "styleUri");
        requireCoreSnapshotter().setStyleURI(styleUri);
    }

    public final void start(SnapshotOverlayCallback overlayCallback, SnapshotResultCallback resultCallback) {
        AbstractC22676k.m65750j(resultCallback, "resultCallback");
        if (getStyleJson().length() == 0 && getStyleUri().length() == 0) {
            throw new IllegalStateException("It's required to call setUri or setJson to provide a style definition before calling start.");
        }
        requireCoreSnapshotter().start(new C2953i(this, resultCallback, overlayCallback, 1));
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(tileCoverOptions, "tileCoverOptions");
        List<CanonicalTileID> listTileCover = requireCoreSnapshotter().tileCover(tileCoverOptions, cameraOptions);
        AbstractC22676k.m65749i(listTileCover, "requireCoreSnapshotter()…erOptions, cameraOptions)");
        return listTileCover;
    }

    public /* synthetic */ Snapshotter(WeakReference weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, mapSnapshotOptions, snapshotOverlayOptions, mapSnapshotter);
    }

    public /* synthetic */ Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            boolean z4 = false;
            snapshotOverlayOptions = new SnapshotOverlayOptions(z4, z4, 3, null);
        }
        this(context, mapSnapshotOptions, snapshotOverlayOptions);
    }

    public Snapshotter(Context context, MapSnapshotOptions options, SnapshotOverlayOptions overlayOptions) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(overlayOptions, "overlayOptions");
        this.cancelableEvents = new ArrayList();
        if (!AbstractC39414r.m125890i0(MapboxOptions.getAccessToken())) {
            this.context = new WeakReference<>(context);
            this.mapSnapshotOptions = options;
            this.snapshotOverlayOptions = overlayOptions;
            this.pixelRatio = context.getResources().getDisplayMetrics().density;
            this.coreSnapshotter = new MapSnapshotter(options);
            dispatchTelemetryTurnstileEvent(context);
            final WeakReference weakReference = new WeakReference(this);
            this.loadingErrorCancelable = subscribeMapLoadingError(new MapLoadingErrorCallback() { // from class: com.mapbox.maps.n
                @Override // com.mapbox.maps.MapLoadingErrorCallback
                public final void run(MapLoadingError mapLoadingError) {
                    Snapshotter._init_$lambda$1(weakReference, mapLoadingError);
                }
            });
            this.cancelableEvents.add(subscribeStyleDataLoaded(new C5545o(weakReference)));
            this.styleLoadedCancelable = subscribeStyleLoaded(new C5545o(weakReference));
            this.cancelableEvents.add(subscribeStyleImageMissing(new C5545o(weakReference)));
            return;
        }
        throw new MapboxConfigurationException();
    }

    private final void drawAttribution(Canvas canvas, AttributionMeasure measure, PointF anchorPoint) {
        canvas.save();
        canvas.translate(anchorPoint.x, anchorPoint.y);
        measure.getTextView().draw(canvas);
        canvas.restore();
    }

    private Snapshotter(WeakReference<Context> weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter) {
        this.cancelableEvents = new ArrayList();
        this.context = weakReference;
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.coreSnapshotter = mapSnapshotter;
        this.pixelRatio = 1.0f;
    }
}
